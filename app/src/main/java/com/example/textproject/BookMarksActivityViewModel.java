package com.example.textproject;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;



import java.util.List;

public class BookMarksActivityViewModel extends AndroidViewModel {
    private final MyRepository repository;
    public LiveData<List<BookmarkedCourse>> bookmarkedCourses;

    public BookMarksActivityViewModel(@NonNull Application application) {
        super(application);
        repository = new MyRepository(application);

        long userId = new SharedPrefsUtils(application.getBaseContext()).getUserId();
        getAllBookmarksByUserId(userId);
    }

    void getAllBookmarksByUserId(long userId) {
        bookmarkedCourses = repository.getAllBookmarksByUserId(userId);
    }

    void deleteBookmark(long bookmark_id) {
        repository.deleteBookmark(bookmark_id);
    }
}
