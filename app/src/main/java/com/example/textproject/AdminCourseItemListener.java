package com.example.textproject;


public interface AdminCourseItemListener {
    void onDeleteClickListener(long courseId);

    void onUpdateClickListener(Course course);
}