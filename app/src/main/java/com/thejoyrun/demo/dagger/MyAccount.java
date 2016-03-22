package com.thejoyrun.demo.dagger;

/**
 * Created by Wiki on 16/3/22.
 */
public class MyAccount {
    private int uid;
    /*密钥*/
    private String sid;

    public MyAccount(int uid, String sid) {
        this.uid = uid;
        this.sid = sid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}
