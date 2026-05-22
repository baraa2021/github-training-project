package com.example.textproject;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;


import java.util.List;

public class CategoryFragmentViewModel extends AndroidViewModel {
    private final MyRepository repository;
    private SharedPrefsUtils prefsUtils;
    public LiveData<List<CourseWithBookmark>> allCourses;


    public CategoryFragmentViewModel(Application application) {
        super(application);
        repository = new MyRepository(application);
        prefsUtils = new SharedPrefsUtils(application);
    }

    public void getAllByCategory(long categoryId) {
        allCourses = repository.getAllByCategory(prefsUtils.getUserId(), categoryId);
    }

    public void insertBookmark(long courseId) {
        repository.insertBookmark(
                new Bookmark(prefsUtils.getUserId(), courseId)
        );
    }

    public void deleteBookmark(Long bookmarkId) {
        repository.deleteBookmark(bookmarkId);
    }
}