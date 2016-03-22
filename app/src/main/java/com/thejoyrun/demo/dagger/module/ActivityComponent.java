package com.thejoyrun.demo.dagger.module;

import android.app.Activity;

import com.thejoyrun.demo.dagger.MainActivity;

import dagger.Component;

/**
 * Created by Wiki on 16/3/10.
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    Activity activity();

    void inject(MainActivity mainActivity);
}