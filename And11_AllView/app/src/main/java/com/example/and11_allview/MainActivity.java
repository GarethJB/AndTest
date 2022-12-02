package com.example.and11_allview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.example.and11_allview.gridv.GridFragment;
import com.example.and11_allview.listfrag.ListFragment;
import com.example.and11_allview.recycler.RecyclerFragment;
import com.example.and11_allview.recyclertest.TestFragment;
import com.example.and11_allview.test.TestFragment1;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_sub, btn_list, btn_grid, btn_recycler, getBtn_recycler2, btn_test;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_sub = findViewById(R.id.btn_sub);
        btn_list = findViewById(R.id.btn_list);
        btn_grid = findViewById(R.id.btn_grid);
        btn_recycler = findViewById(R.id.btn_recycler);
        getBtn_recycler2 = findViewById(R.id.btn_recycler2);
        btn_test = findViewById(R.id.btn_test);

        btn_sub.setOnClickListener(this);
        btn_list.setOnClickListener(this);
        btn_grid.setOnClickListener(this);
        btn_recycler.setOnClickListener(this);
        getBtn_recycler2.setOnClickListener(this);
        btn_test.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_sub) {
            // 인텐트 → 페이지 넘어가는 것
            Intent intent = new Intent(MainActivity.this, SubActivity.class);
            startActivity(intent);

        } else if (v.getId() == R.id.btn_list) {
            // 프래그먼트 → 페이지가 와서 붙는 것
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new ListFragment()).commit();

        } else if (v.getId() == R.id.btn_grid) {
            // 그리드
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new GridFragment()).commit();

        } else if (v.getId() == R.id.btn_recycler) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new RecyclerFragment()).commit();

        } else if (v.getId() == R.id.btn_recycler2) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new TestFragment()).commit();

        } else if (v.getId() == R.id.btn_test) {
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new TestFragment1()).commit();
            Log.d("로그", "onClick: 클릭됨");
        }
    }
}