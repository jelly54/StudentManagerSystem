package com.stuManager.bean;

import java.util.Date;

public class User {
    private Integer id;

    private String username;

    private String password;

    private String sex;

    private Date birthday;

    private String address;

    private String phone;

    private String institute;

    private String sclass;

    private Integer authority;
    
    private Integer itemStart;
    
    private Integer itemEnd;
    

    public Integer getItemEnd() {
		return itemEnd;
	}

	public void setItemEnd(Integer itemEnd) {
		this.itemEnd = itemEnd;
	}

	public Integer getItemStart() {
		return itemStart;
	}

	public void setItemStart(Integer itemStart) {
		this.itemStart = itemStart;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute == null ? null : institute.trim();
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass == null ? null : sclass.trim();
    }

    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", sex=" + sex + ", birthday="
				+ birthday + ", address=" + address + ", phone=" + phone + ", institute=" + institute + ", sclass="
				+ sclass + ", authority=" + authority + "]";
	}
    
    
    
}