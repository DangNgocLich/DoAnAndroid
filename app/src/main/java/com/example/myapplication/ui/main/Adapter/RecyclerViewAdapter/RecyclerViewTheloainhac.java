package com.example.myapplication.ui.main.Adapter.RecyclerViewAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.ui.main.Adapter.TrangChu_chucnang;

import java.util.List;

public class RecyclerViewTheloainhac extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mContext;
    List<TrangChu_chucnang> mData;
    RecyclerViewAdapter.recClick click;

    public RecyclerViewTheloainhac(Context mContext, List<TrangChu_chucnang> mData, RecyclerViewAdapter.recClick click) {
        this.mContext = mContext;
        this.mData = mData;
        this.click=click;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.functiton,parent,false);
        RecyclerViewAdapter.MyViewHolder vHolder = new RecyclerViewAdapter.MyViewHolder(v);
        return vHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyViewHolder holder, int position) {

        TrangChu_chucnang trangChu_chucnang =mData.get(position);
        if (trangChu_chucnang!=null){

            holder.bind(trangChu_chucnang,click);
        }
    }


    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_Chucnang;
        private TextView tv_Thuoctinh;
        private ImageView img;
        private TextView tvStart,tvHaveleft;



        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_Chucnang = (TextView) itemView.findViewById(R.id.tvChucNang);
            tv_Thuoctinh = (TextView) itemView.findViewById(R.id.tvThuocTinh);
            img = (ImageView) itemView.findViewById(R.id.imgcustom);

        }
        public  void bind (final TrangChu_chucnang trangChu_chucnang, final RecyclerViewAdapter.recClick click){
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    click.Onclick(trangChu_chucnang,getLayoutPosition());

                }
            });
        }


    }
    public interface recClick{
        void Onclick(TrangChu_chucnang trangChu_chucnang, int vitri);
    }
}
