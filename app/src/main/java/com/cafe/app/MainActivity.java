package com.cafe.app;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel>arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        arrContacts.add(new ContactModel(R.drawable.img ,  "Coffee",  "Mocha = Rs 90"));
        arrContacts.add(new ContactModel(R.drawable.img_7 ,  "Cake",  "Latte = Rs 150"));
        arrContacts.add (new ContactModel(R.drawable.img_3,  "Tea",  " Green Tea = Rs 170"));
        arrContacts.add (new ContactModel(R.drawable.img_1,  "Cake",  "Cream Cake = Rs 780 "));
        arrContacts.add (new ContactModel(R.drawable.img_6,  "Cake",  "Almond cake = Rs 990"));
        arrContacts.add(new ContactModel(R.drawable.img_3 ,  "Tea",  "Pink Tea = Rs 550"));
        arrContacts.add(new ContactModel(R.drawable.img_13 ,  "Cake",  "Sprinkle Cake = Rs 450"));
        arrContacts.add(new ContactModel(R.drawable.img_6 ,  "Cake",  "Fountain cake = Rs 990"));
        arrContacts.add(new ContactModel(R.drawable.img_2 ,  "Brownie",  "Dark chocolate = Rs 450"));
        arrContacts.add(new ContactModel(R.drawable.img_7 ,  "Cake",  "Barbie Chocolate cake = Rs 1990"));
        arrContacts.add(new ContactModel(R.drawable.img_1 ,  "Cake",  " Car Chocolate cake = Rs 990"));
        arrContacts.add(new ContactModel(R.drawable.img_9 ,  "Cake",  "Coffee cake = Rs 690"));
        arrContacts.add(new ContactModel(R.drawable.img_12 ,  "Cake",  "Mocha cake = Rs 990"));
        arrContacts.add(new ContactModel(R.drawable.img_5 ,  "Cake",  "Latte cake = Rs 940"));
        arrContacts.add(new ContactModel(R.drawable.img_10 ,  "Cake",  "Coconut cake = Rs 390"));
        arrContacts.add(new ContactModel(R.drawable.img_14 ,  "Cake",  "Milky cake = Rs 960"));
        arrContacts.add(new ContactModel(R.drawable.img_11 ,  "Cake",  "Mug cake = Rs 980"));
        arrContacts.add(new ContactModel(R.drawable.img_8 ,  "Cake",  "Molten lava cake = Rs 990"));
        RecycleritemAdapter adapter = new RecycleritemAdapter( this, arrContacts);
        recyclerView.setAdapter(adapter);
    }
}