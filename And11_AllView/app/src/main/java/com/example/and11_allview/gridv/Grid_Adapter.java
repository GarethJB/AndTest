package com.example.and11_allview.gridv;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.and11_allview.R;

public class Grid_Adapter extends BaseAdapter {
    LayoutInflater inflater;
    
    // 1. 레이아웃 인플레이터 선언 후 생성자 생성
    public Grid_Adapter(LayoutInflater inflater) {
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return 30;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    int cnt;
    @Override
    public View getView(int i, View v, ViewGroup parent) {
        ViewHolder viewHolder = null ;
        if(v == null){
            v = inflater.inflate(R.layout.item_gridf_gridv , parent , false);
            viewHolder = new ViewHolder(v);
            v.setTag(viewHolder);// Tag Object형태여서 뭐든지 담을수있음
            cnt ++ ;
        }else{
            if(v.getTag() != null){
                viewHolder = (ViewHolder) v.getTag();
            }
        }
        final ViewHolder tempViewHolder = viewHolder;
        viewHolder.btn_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tempViewHolder.imgv1.getVisibility() == View.VISIBLE) {
                    tempViewHolder.imgv1.setVisibility(View.GONE);
                    tempViewHolder.imgv2.setVisibility(View.VISIBLE);
                }else {
                    tempViewHolder.imgv2.setVisibility(View.GONE);
                    tempViewHolder.imgv1.setVisibility(View.VISIBLE);
                }
            }
        });

        return v;

    }

    // recycler(재활용) : view(아이템 붙인거) 한 번 붙여놓고 나서 다시 계속 새로 붙이는 처리 x
    // 한번 붙여놓은 아이템을 메모리에 저장해놨다가 다시 사용하는 구조로 만들자 → RecyclerView
    // ※ 위젯을 묶어놓은 DTO → ViewHolder ※
    // RecyclerView는 ViewHoler 라는 클래스를 강제 한다. (무조건 만들어야 함)
    public class ViewHolder {

        // 필드 : 위젯들을 전부다 써줌
        ImageView imgv1, imgv2;
        TextView tv_name;
        Button btn_change;

        public ViewHolder(View v) { // ← 한칸에 붙인 item 정보
            imgv1 = v.findViewById(R.id.imgv1);
            imgv2 = v.findViewById(R.id.imgv2);
            tv_name = v.findViewById(R.id.tv_name);
            btn_change = v.findViewById(R.id.btn_change);
        }
    }

}
