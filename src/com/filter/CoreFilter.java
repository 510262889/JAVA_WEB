package com.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CoreFilter implements Filter {

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		chain.doFilter( request , response);
	}

	@Override
	public void init(FilterConfig config) throws ServletException {
		ServletContext context = config.getServletContext();
		// Ӧ��·��
		String app_path = context.getContextPath();
		// ��Դ·��
		String res_path = app_path + "/views";
		// ��ʽ�ļ�·��
		String css_path = res_path + "/css";
		// �ű��ļ�·��
		String js_path = res_path + "/js";
		context.setAttribute( "APP_PATH" , app_path);
		context.setAttribute( "RES_PATH" , res_path);
		context.setAttribute( "CSS_PATH" , css_path);
		context.setAttribute( "JS_PATH"  , js_path);
	}

}
