package com.example.and11_allview.test;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
<<<<<<< Updated upstream
=======
import android.widget.ImageView;
import android.widget.TextView;
>>>>>>> Stashed changes

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and11_allview.R;

<<<<<<< Updated upstream
public class TestAdapter1 extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    LayoutInflater inflater;

    public TestAdapter1(LayoutInflater inflater) {
        this.inflater = inflater;
=======
import java.util.ArrayList;

public class TestAdapter1 extends RecyclerView.Adapter<TestAdapter1.ViewHolder> {
    LayoutInflater inflater;
    ArrayList<TestDTO1> list;

    public TestAdapter1(LayoutInflater inflater, ArrayList<TestDTO1> list) {
        this.inflater = inflater;
        this.list = list;
>>>>>>> Stashed changes
    }

    @NonNull
    @Override
<<<<<<< Updated upstream
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view v = inflater.inflate(R.layout, ,parent, false );


        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
=======
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
>>>>>>> Stashed changes

    }

    @Override
    public int getItemCount() {
<<<<<<< Updated upstream
        return 0;
=======
        return list.size();
>>>>>>> Stashed changes
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

<<<<<<< Updated upstream
        public ViewHolder(@NonNull View v) {
            super(v);
        }
=======
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







>>>>>>> Stashed changes
    }
}
