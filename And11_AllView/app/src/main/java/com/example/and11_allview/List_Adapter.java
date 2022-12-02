package com.example.and11_allview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

//1. 일반 클래스 → 어댑터 타입의 클래스 (extends 상속)
public class List_Adapter extends BaseAdapter {

    LayoutInflater inflater;
    ArrayList<ListDTO> list;

    // 생성자 → 객체를 만들어 낼 때 꼭 필요한 요소
    public List_Adapter(LayoutInflater inflater,  ArrayList<ListDTO> list) {
        this.inflater = inflater;
        this.list = list;

    }

    //2. 리스트뷰에 들어가는 내용 갯수를 지정한다.(item count)
    //ex) 10건의 목록을 보여주고 싶음 → return 10;
    // ArrayList<Data> list → return list.size();
    @Override
    public int getCount() {
        // 아이템 갯수

        return list.size();
    }

    //3. ArrayList<Data> list 가 있을 때 index로 해당하는 칸의 정보를 빼올 때 사용
    @Override
    public Object getItem(int position) {
        return null;
    }

    //4. 칸에 별도의 아이디를 주고 싶다면 사용하는데 position값음 절대 중복안되서
    //   그냥 position 으로 사용한다
    @Override
    public long getItemId(int position) {
        return 0;
    }

    //5. 리스트뷰는 getCount 에서 지정된 칸만큼 getView 를 실행하면서
    //   한칸마다 ViewGroup 을 제공함 (Layout) ← 까지만 OS가 자동으로 해주는 부분
    //   ViewGroup 에 들어가는 내용을 붙이는건 개발자가 직접함
    @Override
    public View getView(int i, View v, ViewGroup parent) {
        // Layout 을 붙이는 처리를 해야함
        // List_Adapter 라는 클래스에서 LayoutInflater 사용하게 만들어보기

        v = inflater.inflate(R.layout.item_sub_listv, parent, false);
        TextView tv_name = v.findViewById(R.id.li_a1_text1);
        TextView tv_cnt = v.findViewById(R.id.li_a1_text2);
        tv_name.setText(list.get(i).getName());
        tv_cnt.setText(list.get(i).getCnt());
        return v;
    }


}
