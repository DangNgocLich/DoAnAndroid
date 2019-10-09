package com.example.myapplication.ui.main.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.ui.main.Adapter.RecyclerViewAdapter.RecyclerViewAdapter;
import com.example.myapplication.ui.main.Adapter.TrangChu_chucnang;

import java.util.ArrayList;

public class ViewPlayList1 extends AppCompatActivity {

    private RecyclerView myrecyclerView;
    private ArrayList<TrangChu_chucnang> lstTrangChuchucnang;
    private RecyclerViewAdapter mAdapter;
    private ImageButton btnback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_activity);
        myrecyclerView =(RecyclerView) findViewById(R.id.my_recycler_view);
        lstTrangChuchucnang = new ArrayList<>();
        inint();
        btnback = findViewById(R.id.back);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void inint() {
        for (int i = 1; i <= 50; i++) {
            lstTrangChuchucnang.add(new TrangChu_chucnang("Song Name"+i ,"a"+1,R.drawable.iconfloatingactionbutton));
        }
        myrecyclerView.setHasFixedSize(true);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new RecyclerViewAdapter(this, lstTrangChuchucnang, new RecyclerViewAdapter.recClick() {
            @Override
            public void Onclick(TrangChu_chucnang trangChu_chucnang, int vitri) {
                Toast.makeText(ViewPlayList1.this, lstTrangChuchucnang.get(vitri).getThuoctinh(), Toast.LENGTH_SHORT).show();
            }
        });
        myrecyclerView.setAdapter(mAdapter);
    }
}
