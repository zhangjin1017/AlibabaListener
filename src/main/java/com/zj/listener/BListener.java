package com.zj.listener;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebListener
public class BListener implements ServletContextAttributeListener {
    @Override
    public void attributeAdded(ServletContextAttributeEvent event) {
        System.out.println("向application中添加了一个名为"+event.getName()+",值为"+event.getValue()+"的属性");
    }

    @Override
    public void attributeReplaced(ServletContextAttributeEvent event) {
        System.out.println(event.getName()+"="+event.getValue()+","+event.getServletContext().getAttribute(event.getName()));
    }

    @Override
    public void attributeRemoved(ServletContextAttributeEvent event) {
        System.out.println(event.getName() + "="+event.getValue());
    }
}
