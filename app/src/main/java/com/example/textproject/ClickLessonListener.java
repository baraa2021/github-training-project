package com.example.textproject;


public interface ClickLessonListener {
    void onClickLesson(Lesson lesson);
    void onLessonCheckedChangeListener(long lessonId, long courseId, boolean isChecked);
}
