package com.example.textproject;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class SignUpActivityViewModel extends AndroidViewModel {
    private final MyRepository repository;

    public SignUpActivityViewModel(@NonNull Application application) {
        super(application);
        repository = new MyRepository(application);
    }

    void getUserByEmail(String email, GetUserListener listener) {
        repository.getUserByEmail(email, listener);
    }

    void insertUser(User user, GetRowIdListener listener) {
        repository.insertUser(user, listener);
    }
}