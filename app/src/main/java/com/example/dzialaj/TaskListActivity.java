package com.example.dzialaj;

import androidx.fragment.app.Fragment;

public class TaskListActivity extends SingleFragmentActivity  {
    protected Fragment createFragment() {
        return new TaskListFragment();
    }
}
