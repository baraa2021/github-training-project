package com.example.textproject;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.google.android.material.snackbar.Snackbar;

public class AddCourseActivityViewModel extends AndroidViewModel {
    private final MyRepository repository;

    public AddCourseActivityViewModel(@NonNull Application application) {
        super(application);
        repository = new MyRepository(application);
    }

    void insertCourse(Course course, GetRowIdListener listener) {
        repository.insertCourse(course, listener);
    }

    void updateCourse(Course course) {
        repository.updateCourse(course);
    }

    void insertCategory(Category category, GetRowIdListener listener) {
        repository.insertCategory(category, listener);
    }

    void getAllCategories(GetCategoriesListener listener) {
        repository.getAllCategories(listener);
    }
}