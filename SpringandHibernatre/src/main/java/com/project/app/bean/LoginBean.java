package com.project.app.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login_details")
public class LoginBean {
	@Id
	@Column(name="username")
	private String userName;
	@Column(name="password")
	private String password;

	/*public LoginBean() {
	}

	public LoginBean(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}*/

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", password=" + password + "]";
	}
}
