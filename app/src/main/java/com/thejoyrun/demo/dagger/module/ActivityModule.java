package com.thejoyrun.demo.dagger.module;

import android.app.Activity;

import com.thejoyrun.demo.dagger.MainPresenter;
import com.thejoyrun.demo.dagger.MainPresenterImpl;
import com.thejoyrun.demo.dagger.MainView;
import com.thejoyrun.demo.dagger.MyAccount;
import com.thejoyrun.demo.dagger.UserRepository;
import com.thejoyrun.demo.dagger.UserRepositoryImpl;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Wiki on 16/3/10.
 */
@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    Activity activity() {
        return activity;
    }

    @Provides
    @ActivityScope
    MainView provideMainView() {
        return (MainView) this.activity;
    }

    @Provides
    @ActivityScope
    UserRepository provideUserRepository(MyAccount myAccount) {
        return new UserRepositoryImpl(myAccount);
    }

    @Provides
    @ActivityScope
    MainPresenter provideMainPresenter(UserRepository userRepository, MainView mainView) {
        return new MainPresenterImpl(mainView, userRepository);
    }
}