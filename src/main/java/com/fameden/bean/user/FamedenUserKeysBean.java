package com.fameden.bean.user;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * This hibernate bean is responsible of storing the user's sensitive data.
 * This table is storing the user's internal user id and also the encrypted
 * password.
 * This table will only be used for authenticating the user.
 */

@Entity
@Table(name = "FAMEDEN_USER_KEYS")
public class FamedenUserKeysBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int famdenInternalUserId;
	private String password;

	public int getFamdenInternalUserId() {
		return famdenInternalUserId;
	}

	public void setFamdenInternalUserId(int famdenInternalUserId) {
		this.famdenInternalUserId = famdenInternalUserId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
