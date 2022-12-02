package com.example.and11_allview.listfrag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ListView;

import com.example.and11_allview.ListDTO;
import com.example.and11_allview.List_Adapter;
import com.example.and11_allview.R;

import java.util.ArrayList;


public class ListFragment extends Fragment {
    ListView list_frag;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_list, container, false);
        list_frag = v.findViewById(R.id.list_frag);
        // 플래그먼트는 무조건 인플레이터가 있음



        ArrayList<ItemDTO> list = new ArrayList<ItemDTO>();

        for (int i = 1; i <= 10; i++) {
            Log.d("로그", "listSize: " + list.size());
            list.add(new ItemDTO("중고나라" + i, 1 + i));
        }


        Listf_Adapter adapterf = new Listf_Adapter(getLayoutInflater(), list);

        list_frag.setAdapter(adapterf);


        return v;
    }
}