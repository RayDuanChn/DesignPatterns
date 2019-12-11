package com.leiduanchn.creation.objectpool;

import java.sql.Connection;

/**
 * @author leiduanchn
 * @create 2019-12-11 12:44 p.m.
 */
public class Client {
    public static void main(String[] args) {
        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool( "org.hsqldb.jdbcDriver", "jdbc:hsqldb: //localhost/mydb",
                "sa", "password");


        // Get a connection:
        Connection con = pool.checkOut();

        // Use the connection

        // Return the connection:
        pool.checkIn(con);
    }


}
