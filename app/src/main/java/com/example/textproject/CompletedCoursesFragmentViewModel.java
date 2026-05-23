package com.example.textproject;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;


import java.util.List;

public class CompletedCoursesFragmentViewModel extends AndroidViewModel {
    LiveData<List<Course>> completedCourses;
    private final MyRepository repository;

    public CompletedCoursesFragmentViewModel(@NonNull Application application) {
        super(application);
        this.repository =  new MyRepository(application);

        long userId = new SharedPrefsUtils(application.getApplicationContext()).getUserId();
        completedCourses = repository.getCompletedMyCourses(userId);
    }
}
