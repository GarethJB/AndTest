package com.example.and11_allview.listfrag;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.and11_allview.R;

import java.util.ArrayList;

public class Listf_Adapter extends BaseAdapter {
    LayoutInflater inflater; // 칸마다 보여질 요소를
    ArrayList<ItemDTO> list;

    public Listf_Adapter(LayoutInflater inflater, ArrayList<ItemDTO> list) {
        this.inflater = inflater;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View v, ViewGroup parent) {

        v = inflater.inflate(R.layout.list1, parent, false);

        TextView li_b1_text1 = v.findViewById(R.id.li_b1_text1);
        TextView li_b1_text2 = v.findViewById(R.id.li_b1_text2);
        li_b1_text1.setText(list.get(i).getName());
        li_b1_text2.setText(list.get(i).getCnt()+"초전");

        return v;
    }
}
