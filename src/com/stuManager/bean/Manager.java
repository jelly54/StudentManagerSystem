package com.stuManager.bean;

public class Manager {
    private Integer mId;

    private String mName;

    private String mPass;

    private String mAuthority;

    public Integer getmId() {
        return mId;
    }

    public void setmId(Integer mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    public String getmPass() {
        return mPass;
    }

    public void setmPass(String mPass) {
        this.mPass = mPass == null ? null : mPass.trim();
    }

    public String getmAuthority() {
        return mAuthority;
    }

    public void setmAuthority(String mAuthority) {
        this.mAuthority = mAuthority == null ? null : mAuthority.trim();
    }
}