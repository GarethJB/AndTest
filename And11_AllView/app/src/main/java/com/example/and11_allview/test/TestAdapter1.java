package com.example.and11_allview.test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and11_allview.R;

import java.util.ArrayList;

public class TestAdapter1 extends RecyclerView.Adapter<TestAdapter1.ViewHolder> {
    LayoutInflater inflater;
    ArrayList<TestDTO1> list;

    public TestAdapter1(LayoutInflater inflater, ArrayList<TestDTO1> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @NonNull
    @Override
    public TestAdapter1.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= inflater.inflate(R.layout.item_test1f_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(v);

        return viewHolder;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }
    //데이터 연결
    @Override
    public void onBindViewHolder(@NonNull TestAdapter1.ViewHolder h, int i) {
        h.tv_test1f_title.setText(list.get(i).getTv_test1f_title());
        h.tv_test1f_info.setText(list.get(i).getTv_test1f_info());
        h.tv_test1f_price.setText(list.get(i).getTv_test1f_price());
        h.tv_test1f_like.setText(list.get(i).getTv_test1f_like());
        h.iv_test1f.setImageResource(list.get(i).getPhoto());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv_test1f_title;
        TextView tv_test1f_info;
        TextView tv_test1f_price;
        TextView tv_test1f_like;
        ImageView iv_test1f;

        public ViewHolder(@NonNull View v) {
            super(v);
            tv_test1f_title = v.findViewById(R.id.tv_test1f_title);
            tv_test1f_info = v.findViewById(R.id.tv_test1f_info);
            tv_test1f_price = v.findViewById(R.id.tv_test1f_price);
            tv_test1f_like = v.findViewById(R.id.tv_test1f_like);
            iv_test1f = v.findViewById(R.id.iv_test1f);



        }







    }
}
