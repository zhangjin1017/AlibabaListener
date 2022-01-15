package com.zj.listener;

import lombok.Data;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

@Data
public class User implements HttpSessionBindingListener {
    private String username;
    private String password;

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        System.out.println("session添加了我");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        System.out.println("session抛弃了我");
    }
}
