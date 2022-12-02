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


public class TestFragment1 extends Fragment {
    RecyclerView recv_test;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_test1, container, false);
        TestAdapter1 adapter = new TestAdapter1(inflater);

        recv_test = v.findViewById(R.id.recv_test);
        recv_test.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false);

        recv_test.setLayoutManager(manager);

        return v;

    }
}