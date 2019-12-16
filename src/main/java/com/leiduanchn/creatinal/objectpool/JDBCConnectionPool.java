package com.leiduanchn.creatinal.objectpool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author leiduanchn
 * @create 2019-12-11 12:07 p.m.
 */

//The three remaining methods are abstract
//and therefore must be implemented by the subclass

public class JDBCConnectionPool extends ObjectPool<Connection> {
    private String url, usr, pwd;

    public JDBCConnectionPool(String driver, String url, String usr, String pwd) {

        try {
            Class.forName(driver).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.url = url;
        this.usr = usr;
        this.pwd = pwd;
    }

    @Override
    protected Connection create() {
        try {
            return DriverManager.getConnection(url, usr, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    @Override
    protected boolean validate(Connection connection) {
        try {
            return connection.isClosed();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    protected void dead(Connection connection) {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
