package com.example.and11_allview.test;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

import com.example.and11_allview.R;
import com.example.and11_allview.listfrag.ItemDTO;

import java.util.ArrayList;


public class TestFragment1 extends Fragment {
    RecyclerView recv_test;
    ArrayList<TestDTO1> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_test1, container, false);

        list = new ArrayList<>();

        list.add(new TestDTO1("상품1", "상품정보1", "3000원", "100", "3", R.drawable.test_img_1));
        list.add(new TestDTO1("상품2", "상품정보2", "4000원", "200", "4", R.drawable.test_img_2));
        list.add(new TestDTO1("상품3", "상품정보3", "5000원", "300", "5", R.drawable.test_img_3));
        list.add(new TestDTO1("상품4", "상품정보4", "6000원", "400", "6", R.drawable.test_img_4));
        list.add(new TestDTO1("상품5", "상품정보5", "7000원", "500", "7", R.drawable.test_img_5));

        TestAdapter1 adapter = new TestAdapter1(inflater, list, getContext());

        recv_test = v.findViewById(R.id.recv_test);
        recv_test.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);
        recv_test.setLayoutManager(manager);

        return v;

    }
}