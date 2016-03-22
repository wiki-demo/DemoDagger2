package com.thejoyrun.demo.dagger;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.thejoyrun.demo.dagger.module.ActivityComponent;
import com.thejoyrun.demo.dagger.module.ActivityModule;
import com.thejoyrun.demo.dagger.module.DaggerActivityComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainView {

    @Inject
    MainPresenter mMainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActivityComponent().inject(this);
        mMainPresenter.showUser(1);
    }

    @Override
    public void showUserName(String name) {
        Toast.makeText(MainActivity.this, name, Toast.LENGTH_SHORT).show();
        TextView textView = (TextView) findViewById(android.R.id.text1);
        textView.setText(name);
    }

    protected ActivityComponent getActivityComponent() {
        return DaggerActivityComponent.builder()
                .appComponent(getMyApplication().getAppComponent())
                .activityModule(getActivityModule())
                .build();
    }

    protected ActivityModule getActivityModule() {
        return new ActivityModule(this);
    }

    protected MyApplication getMyApplication() {
        return (MyApplication) getApplication();
    }
}
