package com.comakeit.saml.sso.controller.model;

import lombok.Data;

/**
 * @author jcavazos
 */
@Data
public class PreAuthUsername {
    private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
    
    
}
