package com.example.and11_allview.test;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and11_allview.R;

import java.util.ArrayList;


public class TestFragment1 extends Fragment {

    RecyclerView test_recv;
    ArrayList<TestDTO1> list= new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_test, container, false);

        list.add(new TestDTO1("상품1", "동구","2000", "2" , R.drawable.photo1));
        list.add(new TestDTO1("상품2", "서구","10000", "10",R.drawable.photo2));
        list.add(new TestDTO1("상품3", "남구","3000", "25",R.drawable.photo3));
        list.add(new TestDTO1("상품4", "광산구","1500", "5",R.drawable.photo4));
        list.add(new TestDTO1("상품5", "동구","24000", "7",R.drawable.photo5));



        test_recv = v.findViewById(R.id.test_recv);
        test_recv.setAdapter(new TestAdapter1(inflater, list));

        RecyclerView.LayoutManager manager = new LinearLayoutManager(
                getContext(), RecyclerView.VERTICAL, false

        );
        test_recv.setLayoutManager(manager);

        return v;
    }
}