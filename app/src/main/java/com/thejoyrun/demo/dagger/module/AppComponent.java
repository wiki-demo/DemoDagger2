package com.thejoyrun.demo.dagger.module;

import android.content.Context;

import com.thejoyrun.demo.dagger.MyAccount;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 全局Component
 * Created by Wiki on 16/3/10.
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {
    Context context();

    MyAccount getMyAccount();
}