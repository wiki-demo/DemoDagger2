package com.thejoyrun.demo.dagger;

/**
 * Created by Wiki on 16/3/22.
 */
public class UserRepositoryImpl implements UserRepository {
    //模拟实际请求，需要账号密码，这里没有用到
    private MyAccount myAccount;

    public UserRepositoryImpl(MyAccount myAccount) {
        this.myAccount = myAccount;
    }

    @Override
    public String getUserName(int id) {
        return "Wiki-" + id;
    }
}
