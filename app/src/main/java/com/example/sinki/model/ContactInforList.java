package com.example.sinki.model;

import android.databinding.ObservableArrayList;
import android.view.View;

import java.util.Observable;
import java.util.Random;

/**
 * Created by Sinki on 9/16/2017.
 */

public class ContactInforList {
    public ObservableArrayList<Contact>list = new ObservableArrayList<>();
    private int totalContact = 20;
    Random random = new Random();
    public ContactInforList()
    {

        for(int i =1;i<totalContact;i++)
        {
            Contact contact = new Contact();
            String ten = "Tên "+i;
            String phone = "090";
            for(int p = 0;p<7;p++)
                phone+=random.nextInt(10);
            contact.setName(ten);
            contact.setPhone(phone);
            add(contact);
        }
    }
    private void add(Contact contact)
    {
        list.add(contact);
    }
    public  void add(View view)
    {
        Contact contact = new Contact();
        String ten = "Tên" + (++totalContact);
        String phone = "090";
        for(int p = 0;p<7;p++)
            phone+=random.nextInt(10);
        contact.setName(ten);
        contact.setPhone(phone);
        add(contact);
    }
    public void remove(View view)
    {
        if(!list.isEmpty())
        {
            list.remove(0);
        }
    }
}
