package com.sanofc;

import javax.servlet.annotation.WebServlet;

import org.eclipse.jetty.websocket.servlet.WebSocketServlet;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;


@WebServlet("/WebSocketServlet")
public class WebSocketServletImpl extends WebSocketServlet{
	
	private static final long serialVersionUID = 1L;

	@Override
	public void configure(WebSocketServletFactory factory) {
		factory.register(WebSocketListener.class);
	}

}
