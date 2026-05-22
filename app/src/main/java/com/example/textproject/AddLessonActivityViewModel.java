package com.example.textproject;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;



public class AddLessonActivityViewModel extends AndroidViewModel {
    private final MyRepository repository;

    public AddLessonActivityViewModel(@NonNull Application application) {
        super(application);
        repository = new MyRepository(application);
    }

    void updateLesson(Lesson lesson) {
        repository.updateLesson(lesson);
    }

    void insertLesson(Lesson lesson) {
        repository.insertLesson(lesson);
    }

    public LiveData<Lesson> getLessonById(long lessonId) {
        return repository.getLessonById(lessonId);
    }

    public void getRegistrationsByCourseId(long courseId, GetRegistrationsListener listener) {
        repository.getRegistrationsByCourseId(courseId, listener);
    }
}