package com.leilei.miaomiao.servlet;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class TestServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				ServletConfig   config   = new ServletConfig() {
					
					@Override
					public String getServletName() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public ServletContext getServletContext() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public Enumeration getInitParameterNames() {
						// TODO Auto-generated method stub
						return null;
					}
					
					@Override
					public String getInitParameter(String arg0) {
						// TODO Auto-generated method stub
						return null;
					}
				};  
	}

}
