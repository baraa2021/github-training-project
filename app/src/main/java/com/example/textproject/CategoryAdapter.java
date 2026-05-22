package com.example.textproject;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;


import java.util.ArrayList;

public class CategoryAdapter extends FragmentStateAdapter {
    ArrayList<CategoryFragment> fragments;

    public CategoryAdapter(@NonNull Fragment fragment, ArrayList<CategoryFragment> fragments) {
        super(fragment);
        this.fragments = fragments;
    }

    @NonNull
    @Override
    public CategoryFragment createFragment(int position) {
        return fragments.get(position);

    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }

}
