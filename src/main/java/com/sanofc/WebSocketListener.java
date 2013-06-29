package com.sanofc;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.jetty.websocket.api.Session;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketClose;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketConnect;
import org.eclipse.jetty.websocket.api.annotations.OnWebSocketMessage;
import org.eclipse.jetty.websocket.api.annotations.WebSocket;

@WebSocket
public class WebSocketListener {

	static Set<Session> sessions = Collections.synchronizedSet(new HashSet());
	
	@OnWebSocketConnect
	public void onConnect(Session session) {
		System.out.println("MyWebSocket.onConnect()");
		sessions.add(session);
	}

	@OnWebSocketMessage
	public void onText(String msg) {
		System.out.println("MyWebSocket.onText()");
		System.out.println(msg);
		for(Session session : sessions){
			session.getRemote().sendStringByFuture(msg);
		}
	}

	@OnWebSocketClose
	public void onClose(Session session, int statusCode, String reason) {
		System.out.println("MyWebSocket.onClose()");
		sessions.remove(session);
	}
}
