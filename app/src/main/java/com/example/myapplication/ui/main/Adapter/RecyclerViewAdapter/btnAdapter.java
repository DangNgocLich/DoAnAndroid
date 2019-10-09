package com.example.myapplication.ui.main.Adapter.RecyclerViewAdapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.ui.main.Activity.timkiem_name;
import com.example.myapplication.ui.main.Adapter.Hinh;

import java.util.List;

public class btnAdapter extends RecyclerView.Adapter<btnAdapter.ViewHolder> {

    Context context;
    List<Hinh> mData;

    public btnAdapter(Context context, List<Hinh> mData) {
        this.context = context;
        this.mData = mData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(context).inflate(R.layout.item_theloai,parent,false);

        final ViewHolder viewHolder= new ViewHolder(v);

        viewHolder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Toast.makeText(context,mData.get(viewHolder.getAdapterPosition()).getHinh(), Toast.LENGTH_SHORT).show();
                context = view.getContext();
                Intent intent = new Intent(context, timkiem_name.class);
                intent.putExtra("btn_name", mData.get(viewHolder.getAdapterPosition()).getHinh());
                context.startActivity(intent);

            }
        });
        return viewHolder;
    }

//    private void passData(int id) {
//
//        Intent intent = new Intent(context,timkiem_name.class);
//        intent.putExtra(btn_name, ""+id);
//        context.startActivity(intent);
//    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.btn.setText(mData.get(position).getHinh());
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        Button btn ;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            btn = itemView.findViewById(R.id.btnName);
        }
    }

}
