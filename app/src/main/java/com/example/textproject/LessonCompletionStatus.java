package com.example.textproject;

import androidx.room.Embedded;



public class LessonCompletionStatus {
    @Embedded
    private Lesson lesson;
    public boolean isCompleted;

    public LessonCompletionStatus() {
    }

    public Lesson getLesson() {
        return lesson;
    }

    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
