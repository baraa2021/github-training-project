package com.example.textproject;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;


public class HomeFragmentViewModel extends AndroidViewModel {
    private final MyRepository repository;

    public HomeFragmentViewModel(@NonNull Application application) {
        super(application);
        repository = new MyRepository(application);
    }

    void getAllCategories(GetCategoriesListener listener) {
        repository.getAllCategories(listener);
    }


}
