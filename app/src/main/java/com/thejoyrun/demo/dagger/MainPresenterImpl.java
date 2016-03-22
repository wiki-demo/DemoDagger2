package com.thejoyrun.demo.dagger;

/**
 * Created by Wiki on 16/3/22.
 */
public class MainPresenterImpl implements MainPresenter {
    private MainView mMainView;
    private UserRepository mUserRepository;

    public MainPresenterImpl(MainView mainView, UserRepository userRepository) {
        this.mMainView = mainView;
        this.mUserRepository = userRepository;
    }

    @Override
    public void showUser(int id) {
        String name = mUserRepository.getUserName(id);
        if (name != null) {
            mMainView.showUserName(name);
        }
    }
}
