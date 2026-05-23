package com.example.textproject;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;


import java.util.List;

@Dao
public interface CategoryDao {
    @Insert
    long insertCategory(Category category);

    @Query("SELECT * FROM Category")
    List<Category> getAllCategories();

}
