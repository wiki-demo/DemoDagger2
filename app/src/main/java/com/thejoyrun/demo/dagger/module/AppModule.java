package com.thejoyrun.demo.dagger.module;

import android.content.Context;

import com.thejoyrun.demo.dagger.MyAccount;
import com.thejoyrun.demo.dagger.MyApplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * 全局Module
 * Created by Wiki on 16/3/10.
 */
@Module
public class AppModule {

    private final MyApplication mMyApplication;

    public AppModule(MyApplication application) {
        mMyApplication = application;
    }


    @Provides
    @Singleton
    Context provideApplicationContext() {
        return mMyApplication;
    }


    @Provides
    @Singleton
    MyAccount provideMyAccount() {
        return new MyAccount(1, "fasdfasfhsakdfhsakfhksa");
    }
}