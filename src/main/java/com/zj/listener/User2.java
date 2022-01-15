package com.zj.listener;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

public class User2 implements HttpSessionActivationListener, Serializable {
    @Override
    public void sessionWillPassivate(HttpSessionEvent se) {
        System.out.println("我陪session被钝化了");
    }

    @Override
    public void sessionDidActivate(HttpSessionEvent se) {

        System.out.println("我陪session被活化了");
    }
}
