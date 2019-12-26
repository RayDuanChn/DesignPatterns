package com.leiduanchn.structural.proxy.staticproxy;

import java.util.ArrayList;
import java.util.List;

/**
 * 静态代理类
 *
 * @author leiduanchn
 * @create 2019-12-25 3:32 p.m.
 */
public class InternetProxy implements Internet {

    private Internet internet = new RealInternet();     //代理的目标对象，通过接口来聚合或组合

    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ijk.com");
        bannedSites.add("lnm.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception {

        if(bannedSites.contains(serverhost.toLowerCase())){
            throw new Exception(serverhost + " Access Denied!");
        }
        internet.connectTo(serverhost);
    }
}
