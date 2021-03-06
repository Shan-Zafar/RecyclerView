package com.shanzafar.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    List<Students> studentsList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       // RecyclerView list = (RecyclerView) findViewById(R.id.list);
       // list.setLayoutManager(new LinearLayoutManager(this));
        Students f0 = new Students(1,"James", R.drawable.d);
        Students f1 = new Students(2,"Leonardo", R.drawable.c);
        Students f2 = new Students(3,"Mario", R.drawable.b);
        Students f3 = new Students(4,"Martin",R.drawable.a);
        Students f4 = new Students(5,"Charles", R.drawable.c);
        Students f5 = new Students(6,"Oliver",R.drawable.a);
        Students f6 = new Students(7,"Emma", R.drawable.d);
        Students f7 = new Students(8,"Kate",R.drawable.b);
        Students f8 = new Students(8,"Elizebeth",R.drawable.c);
        Students f9 = new Students(8,"Rupenzel",R.drawable.d);
        Students f10 = new Students(8,"Iris",R.drawable.a);
        Students f11 = new Students(8,"Hamlet",R.drawable.b);

        studentsList.addAll(Arrays.asList(new Students[]{f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11}));
        recyclerView = findViewById(R.id.list);

        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(MainActivity.this,LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
      //  list = findViewById(R.id.list);
        adapter = new listAdapter(studentsList) ;
        recyclerView.setAdapter(adapter);
        //list.setHasFixedSize(true);
    }
}