package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView programingist=(RecyclerView)findViewById(R.id.programinglist);
        programingist.setLayoutManager(new LinearLayoutManager(this));
        String[] lang={"java","C#","C","kotlin","javasript","C++","java","C#","C","kotlin","javasript","C++"};


                programingist.setAdapter(new programingAdapter(lang));
    }
}
