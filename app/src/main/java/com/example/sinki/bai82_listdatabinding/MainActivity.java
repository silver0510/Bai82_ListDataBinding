package com.example.sinki.bai82_listdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.sinki.bai82_listdatabinding.databinding.ActivityMainBinding;
import com.example.sinki.model.ContactInforList;
import com.example.sinki.model.ListHeading;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        ListHeading listHeading = new ListHeading("Danh sách Contact");
        binding.setHeading(listHeading);
        ContactInforList inforList = new ContactInforList();

        binding.setInfors(inforList);

    }

}
