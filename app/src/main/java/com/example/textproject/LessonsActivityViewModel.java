package com.example.textproject;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class LessonsActivityViewModel extends AndroidViewModel {
    private final MyRepository repository;
    public LiveData<List<Lesson>> lessonsLiveData;

    public LessonsActivityViewModel(@NonNull Application application) {
        super(application);
        repository = new MyRepository(application);
    }

    void getLessonsByCourseId(long courseId) {
        lessonsLiveData = repository.getLessonsByCourseId(courseId);
    }

    void deleteLesson(long lessonId) {
        repository.deleteLesson(lessonId);
    }
}