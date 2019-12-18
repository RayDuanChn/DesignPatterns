//package com.leiduanchn.solid.ocp;
//
///**
// * @author leiduanchn
// * @create 2019-12-16 4:57 p.m.
// */
//
//
///*
//
//    如果我们需要添加一个功能，当每秒钟接口超时请求个数，超过某个预先设置的最大阈值时，我们也要触发告警发送通知。
//    这个时候，我们该如何改动代码呢？
//
//    基于“修改”的方式来实现新功能, 主要的改动有两处：
//    第一处是修改 check() 函数的入参，添加一个新的统计数据 timeoutCount，表示超时接口请求数；
//    第二处是在 check() 函数中添加新的告警逻辑。
// */
//public class Alert {
//    private AlertRule rule;     //AlertRule 存储告警规则，可以自由设置
//    private Notification notification;      //Notification 是告警通知类，支持邮件、短信、微信、手机等多种通知渠道
//
//    public Alert(AlertRule rule, Notification notification) {
//        this.rule = rule;
//        this.notification = notification;
//    }
//
//    public void check(String api, long requestCount, long errorCount, long durationOfSeconds) {
//        long tps = requestCount / durationOfSeconds;
//        // 接口的 TPS 超过某个预先设置的最大值时，就会触发告警
//        if(tps > rule.getMatchedRule(api).getMaxTps()){
//            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
//        }
//
//        //以及当接口请求出错数大于某个最大允许值时，就会触发告警
//        if (errorCount > rule.getMatchedRule(api).getMaxErrorCount())
//        { notification.notify(NotificationEmergencyLevel.SEVERE, "...");
//        }
//    }
//}
