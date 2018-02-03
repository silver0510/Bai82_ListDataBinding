package com.example.sinki.model;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.sinki.bai82_listdatabinding.R;
import com.example.sinki.bai82_listdatabinding.databinding.ItemBinding;

/**
 * Created by Sinki on 9/16/2017.
 */

public class ListAdapter extends BaseAdapter {
    private ObservableArrayList<Contact>list;
    private LayoutInflater inflater;
    public ListAdapter(ObservableArrayList<Contact>list)
    {
        this.list = list;
    }
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(inflater == null)
        {
            inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        ItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.item,parent,false);
        binding.setInfo(list.get(position));
        return binding.getRoot();
    }
}
