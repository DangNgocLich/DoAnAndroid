package com.example.myapplication.ui.main.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.ui.main.Adapter.RecyclerViewAdapter.RecyclerViewAdapter;
import com.example.myapplication.ui.main.Adapter.TrangChu_chucnang;

import java.util.ArrayList;

public class timkiem_name extends AppCompatActivity {

    private TextView nametimkiem;
    private ImageButton btnback;
    private RecyclerView myrecyclerView;
    private ArrayList<TrangChu_chucnang> lstTrangChuchucnang;
    private RecyclerViewAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timkiem_name);
        myrecyclerView =(RecyclerView) findViewById(R.id.search_theoten);
        lstTrangChuchucnang = new ArrayList<>();
        Intent intent = getIntent();
        Intent i = getIntent();
        String easyPuzzle = i.getStringExtra("btn_name");
        nametimkiem = findViewById(R.id.tv_search_theoten);
        nametimkiem.setText(easyPuzzle);
        btnback = findViewById(R.id.back);
        inint();
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
                Toast.makeText(timkiem_name.this, lstTrangChuchucnang.get(vitri).getThuoctinh(), Toast.LENGTH_SHORT).show();
            }
        });
        myrecyclerView.setAdapter(mAdapter);
    }
}
