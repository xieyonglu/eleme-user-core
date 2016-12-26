package jwcms.user.model;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 7223482988809438906L;
	
	private Long userId;
	private String userName;
	private String password;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
