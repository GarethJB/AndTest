package com.example.and11_allview.recyclertest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and11_allview.R;
import com.example.and11_allview.recycler.RecyclerAdapter;

// 2. 리싸이클뷰.어댑터<밑에 만든 리싸이클뷰.뷰홀더 객체> 상속
public class TestAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    // 레이아웃 인플레이터 선언 후 생성자
    LayoutInflater inflater;

    public TestAdapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 3. 인플레이터로 프래그먼트와 연결
        View v = inflater.inflate(R.layout.item_recyclerf_list, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder h, int i) {

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
        return 5;
    }

    // 1. 뷰홀더 클래스를 만든 후 리싸이클.뷰홀더 상속
    public class ViewHolder extends RecyclerView.ViewHolder {
        // 뷰그룹의 요소들을 찾아서 초기화한다
        ImageView rec_img;
        TextView rec_text1, rec_text2;
        Button rec_btn;

        public ViewHolder(@NonNull View v) {
            super(v);
            rec_img = v.findViewById(R.id.rec_img);
            rec_text1 = v.findViewById(R.id.rec_text1);
            rec_text2 = v.findViewById(R.id.rec_text2);
            rec_btn = v.findViewById(R.id.rec_btn);
        }
    }
}



