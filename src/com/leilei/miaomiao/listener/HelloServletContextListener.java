package com.leilei.miaomiao.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class HelloServletContextListener implements ServletContextListener,ServletRequestListener,HttpSessionListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
			System.out.println("ServletContextListener被销毁");
			
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {

		System.out.println("ServletContextListener 被创建"+arg0.getServletContext());
	}

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
			System.out.println("HttpSessionListener 被创建");
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
			System.out.println("HttpSessionListener 被销毁"+arg0);
	}

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
			System.out.println("ServletRequestListener 被销毁");
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
			System.out.println("ServletRequestListener被创建"+arg0.getServletContext()
			+arg0.getServletRequest()+arg0.getSource());
	}

}
