package com.example.wingfly.reminder.Fragments;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

public class AbstractFragment  extends Fragment{

    private  String title;

    protected View view;
    protected  Context context;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
