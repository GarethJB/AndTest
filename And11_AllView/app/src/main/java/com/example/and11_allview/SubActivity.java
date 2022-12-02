package com.example.and11_allview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class SubActivity extends AppCompatActivity {

    ListView listv_sub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        ArrayList<ListDTO> list = new ArrayList<ListDTO>();

        for (int i = 1; i <= 30; i++) {
            list.add(new ListDTO("name" + i, "cnt" + i));
            Log.d("로그", "listSize: " + list.size());
        }

        listv_sub = findViewById(R.id.listv_sub);
        // adapter 에서 꼭 필요한 것 → LayoutInflater
        List_Adapter adapter = new List_Adapter(getLayoutInflater(), list);
        listv_sub.setAdapter(adapter);






    }


}