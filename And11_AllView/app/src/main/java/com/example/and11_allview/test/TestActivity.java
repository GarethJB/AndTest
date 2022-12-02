package com.example.and11_allview.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.and11_allview.R;

public class TestActivity extends AppCompatActivity {

    ImageView iv_test;
    TextView tv_test_title, tv_test_info, tv_test_price, tv_test_like, tv_test_cmt;
    TestDTO1 dto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        iv_test = findViewById(R.id.iv_test);
        tv_test_title = findViewById(R.id.tv_test_title);
        tv_test_info = findViewById(R.id.tv_test_info);
        tv_test_price = findViewById(R.id.tv_test_price);
        tv_test_like = findViewById(R.id.tv_test_like);
        tv_test_cmt = findViewById(R.id.tv_test_cmt);

        Intent intent = getIntent();
        dto = (TestDTO1) intent.getSerializableExtra("dto");

        iv_test.setImageResource(dto.getIv_test1f());
        tv_test_title.setText(dto.getTv_test1f_title());
        tv_test_info.setText(dto.getTv_test1f_info());
        tv_test_price.setText(dto.getTv_test1f_price());
        tv_test_like.setText(dto.getTv_test1f_like());
        tv_test_cmt.setText(dto.getTv_test1f_cmt());

    }
}