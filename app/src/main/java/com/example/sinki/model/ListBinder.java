package com.example.sinki.model;

import android.databinding.BindingAdapter;
import android.databinding.ObservableArrayList;
import android.widget.*;


/**
 * Created by Sinki on 9/16/2017.
 */

public class ListBinder {
    @BindingAdapter("bind:items")
    public static void bindList(ListView listView, ObservableArrayList<Contact>list)
    {
        ListAdapter adapter = new ListAdapter(list);
        listView.setAdapter(adapter);
    }
}
