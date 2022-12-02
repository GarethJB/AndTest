package com.example.and11_allview.test;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and11_allview.R;
import com.example.and11_allview.SubActivity;

import java.util.ArrayList;

public class TestAdapter1 extends RecyclerView.Adapter<TestAdapter1.ViewHolder> {
    LayoutInflater inflater;
    ArrayList<TestDTO1> list;
    Activity activity;

    public TestAdapter1(LayoutInflater inflater, ArrayList<TestDTO1> list, Activity activity) {
        this.inflater = inflater;
        this.list = list;
        this.activity = activity;
    }

    @NonNull
    @Override
    public TestAdapter1.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.item_test1f_list, parent, false);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, TestActivity.class);
                intent.putExtra("dto", list.get(viewType));
                activity.startActivity(intent);
            }
        });
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder v, int i) {
        TestDTO1 dto = list.get(i);
        v.tv_test1f_title.setText(dto.getTv_test1f_title());
        v.tv_test1f_info.setText(dto.getTv_test1f_info());
        v.tv_test1f_price.setText(dto.getTv_test1f_price());
        v.tv_test1f_like.setText(dto.getTv_test1f_like());
        v.tv_test1f_cmt.setText(dto.getTv_test1f_cmt());
        v.iv_test1f.setImageResource(dto.iv_test1f);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iv_test1f;
        TextView tv_test1f_title, tv_test1f_info, tv_test1f_price, tv_test1f_like, tv_test1f_cmt;
        public ViewHolder(@NonNull View v) {
            super(v);
            iv_test1f = v.findViewById(R.id.iv_test1f);
            tv_test1f_title = v.findViewById(R.id.tv_test1f_title);
            tv_test1f_info = v.findViewById(R.id.tv_test1f_info);
            tv_test1f_price = v.findViewById(R.id.tv_test1f_price);
            tv_test1f_like = v.findViewById(R.id.tv_test_like);
            tv_test1f_cmt = v.findViewById(R.id.tv_test_cmt);


        }
    }
}
