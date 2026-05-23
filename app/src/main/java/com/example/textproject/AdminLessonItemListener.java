package com.example.textproject;


public interface AdminLessonItemListener {
    void onDeleteClickListener(long lessonId);

    void onUpdateClickListener(Lesson lesson);

}