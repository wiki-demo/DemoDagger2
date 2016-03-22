package com.thejoyrun.demo.dagger;

import android.app.Application;

import com.thejoyrun.demo.dagger.module.AppComponent;
import com.thejoyrun.demo.dagger.module.AppModule;
import com.thejoyrun.demo.dagger.module.DaggerAppComponent;

/**
 * Created by Wiki on 16/3/22.
 */
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
    }
    private AppModule mAppModule;

    public AppComponent getAppComponent() {
        return DaggerAppComponent.builder().appModule(getAppModule()).build();
    }

    public AppModule getAppModule() {
        if (mAppModule == null) {
            mAppModule = new AppModule(this);
        }
        return mAppModule;
    }
}
