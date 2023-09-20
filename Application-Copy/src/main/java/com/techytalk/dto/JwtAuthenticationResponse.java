package com.techytalk.dto;

import lombok.Value;

@Value
public class JwtAuthenticationResponse {
	
	public JwtAuthenticationResponse(String accessToken, UserInfo user) {
		super();
		this.setAccessToken(accessToken);
		this.user = user;
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	private String accessToken;
	private UserInfo user;
	public UserInfo getUser() {
		return user;
	}
	public void setUser(UserInfo user) {
		this.user = user;
	}
}