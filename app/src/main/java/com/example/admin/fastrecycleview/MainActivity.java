package com.example.admin.fastrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Data> d=new ArrayList<>();
    Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        instances();


        HashMap<String, Integer> mapIndex = calculateIndexesForName(d);



        final RecyclerView recyclerView=findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new Adapter(d, getApplicationContext(),mapIndex);
        recyclerView.setAdapter(adapter);
        FastScrollRecyclerViewItemDecoration decoration = new FastScrollRecyclerViewItemDecoration(this);
        recyclerView.addItemDecoration(decoration);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

    }
    private HashMap<String, Integer> calculateIndexesForName(List<Data> items){
        Data.setSize(1);
        HashMap<String, Integer> mapIndex = new LinkedHashMap<>();
        for (int i = 0; i<items.size(); i++){
            String name = items.get(i).getName();
            System.out.println(name+"\n");
            String index = name.substring(0,1);
            System.out.println(index+"hello");
            index = index.toUpperCase();
            System.out.println("what in upper"+index);

            if (!mapIndex.containsKey(index)) {
                mapIndex.put(index, i);
            }
        }
        System.out.println(mapIndex+"in map index");
        return mapIndex;
    }

    void instances(){
       String[] s={"Arris","Arres","Arrws","Bowl","Bous","Button","Btuh","Chda","sGSUYDF","DSIF","dfcbhh","eqtys","ABSUY","hfi"};
       //s.size=14
       Data r=new Data(s[0]);
        Data r1=new Data(s[1]);
        Data r2=new Data(s[2]);
        Data r3=new Data(s[3]);
        Data r4=new Data(s[4]);
        Data r5=new Data(s[5]);
        Data r6=new Data(s[6]);
        Data r7=new Data(s[7]);
        Data r8=new Data(s[8]);
        Data r9=new Data(s[9]);Data r13=new Data(s[13]);
        Data r10=new Data(s[10]);Data r12=new Data(s[12]);
        Data r11=new Data(s[11]);

        d.add(r);
        d.add(r1);
        d.add(r2);
        d.add(r3);d.add(r4);
        d.add(r5);
        d.add(r6);
        d.add(r7);
        d.add(r8);
        d.add(r9);d.add(r10);d.add(r11);d.add(r12);d.add(r13);
    }
}
