package edu.udacity.java.nano.chat;

public class Message {
    
	enum messageType{ENTER, SPEAK, QUIT};

	private String username;
	private String msg;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
