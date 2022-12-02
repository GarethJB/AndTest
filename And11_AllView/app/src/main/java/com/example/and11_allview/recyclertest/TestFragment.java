package com.example.and11_allview.recyclertest;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and11_allview.R;
import com.example.and11_allview.test.TestDTO1;

import java.util.ArrayList;


public class TestFragment extends Fragment {
    RecyclerView test_recv;
    ArrayList<TestDTO1> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // 인플레이터로 fragment_test 를 container 에 붙이는 역할
        View v = inflater.inflate(R.layout.fragment_test, container, false);

        // 4. 아이템이 들어갈 프래그먼트를 찾아서 아답터와 연결
        TestAdapter adapter = new TestAdapter(inflater);
        test_recv = v.findViewById(R.id.test_recv);
        test_recv.setAdapter(adapter);

        // 5. 리싸이클매니저 호출
        // [리싸이클뷰.레이아웃매니저] [레퍼런스 변수] = new [리니어매니저]
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        // getContext() → 화면에 떠있는 걸로부터 생성할 수 있는 권한
        // 리싸이클뷰.레이아웃매니저세팅(생성한 매니저);
        test_recv.setLayoutManager(manager);





        return v;
    }
}