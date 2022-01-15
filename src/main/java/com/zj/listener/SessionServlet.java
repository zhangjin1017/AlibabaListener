package com.zj.listener;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "SessionServlet", value = "/SessionServlet")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取session
        HttpSession session = request.getSession();
        // 获取session中所有的键值
        Enumeration<String> attrs = session.getAttributeNames();
        // 遍历attrs中的
        while (attrs.hasMoreElements()) {
            // 获取session键值
            String name = attrs.nextElement().toString();
            // 根据键值取session中的值
            Object vakue = session.getAttribute(name);
            // 打印结果
            System.out.println("------" + name + ":" + vakue + "--------\n");
        }
    }


}
