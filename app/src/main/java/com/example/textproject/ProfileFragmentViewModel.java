package com.example.textproject;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfileFragmentViewModel extends AndroidViewModel {
    private final MyRepository repository;
//    LiveData<User> currentUser;

    public ProfileFragmentViewModel(@NonNull Application application) {
        super(application);
        repository = new MyRepository(application);

//        long userId = new SharedPrefsUtils(application.getApplicationContext()).getUserId();
//        currentUser = repository.getUserByUserIdLiveData(userId);
    }

    public void getUserByUserId(long userId, GetUserListener listener) {
        repository.getUserByUserId(userId, listener);
    }

    public void updateUser(long userId, String name, String email, String password) {
        repository.updateUser(userId, name, email, password);
    }
}






