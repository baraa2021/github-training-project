package com.example.textproject;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {User.class, Bookmark.class, Category.class, Course.class, Lesson.class, Registration.class, LessonCompletion.class}, version = 8, exportSchema = false)
public abstract class CoursesDatabase extends RoomDatabase {

    public abstract UserDao userDao();

    public abstract LessonCompletionDao lessonCompletionDao();

    public abstract LessonsDao lessonsDao();

    public abstract CoursesDao coursesDao();

    public abstract CategoryDao categoryDao();

    public abstract BookmarkDao bookmarksDao();

    public abstract RegistrationDao myCoursesDao();


    private static volatile CoursesDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static CoursesDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (CoursesDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                                    CoursesDatabase.class, "word_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}
