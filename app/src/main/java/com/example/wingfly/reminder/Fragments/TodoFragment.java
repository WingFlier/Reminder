package com.example.wingfly.reminder.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wingfly.reminder.R;


public class TodoFragment extends AbstractFragment {

    private static final int LAYOUT = R.layout.fragment_example;
    private String title;


    public static TodoFragment getInstance(Context context) {


        Bundle args = new Bundle();
        TodoFragment fragment = new TodoFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tabs_todo));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }



    public void setContext(Context context) {
        this.context = context;
    }


}
