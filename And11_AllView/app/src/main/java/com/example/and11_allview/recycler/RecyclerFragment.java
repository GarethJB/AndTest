package com.example.and11_allview.recycler;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and11_allview.R;


public class RecyclerFragment extends Fragment {
    RecyclerView recv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recycler, container, false);
        recv = v.findViewById(R.id.recv);
        recv.setAdapter(new RecyclerAdapter(inflater));
        // ※ 리사이클러뷰는 가로뷰와 세로뷰(Orientation)을 제공함. LayoutManager 가 필요함
        RecyclerView.LayoutManager manager = new LinearLayoutManager( // LinearLayoutManager 를 쓰는게 편함
                getContext(), RecyclerView.VERTICAL, false
        );
        recv.setLayoutManager(manager);

        return v;
    }
}

// Context() → 어플리케이션 현재 상태의 맥락을 의미, 생성된 객체가 어떤 일이 일어나고 있는지 알 수 있다