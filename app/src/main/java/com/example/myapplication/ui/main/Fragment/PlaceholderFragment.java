package com.example.myapplication.ui.main.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.ui.main.Activity.Search;
import com.example.myapplication.ui.main.Adapter.Hinh;
import com.example.myapplication.ui.main.Adapter.RecyclerViewAdapter.btnAdapter;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private static View root;
    static ArrayAdapter<String> theloaiAdapter1;
    private PageViewModel pageViewModel;
    private btnAdapter btnadapter;
    private RecyclerView btnrecycleview;
    private ArrayList<Hinh> mData=new ArrayList<>();
    private RecyclerView top100recycleview;
    private ArrayList<Hinh> mDatatop100=new ArrayList<>();;
    private TextView searchonline;


    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    public static void  test(ArrayAdapter<String> theloaiAdapter) {
      theloaiAdapter1 = theloaiAdapter;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }

        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_trang_chu, container, false);
        super.onCreate(savedInstanceState);
        btnrecycleview = (RecyclerView) root.findViewById(R.id.btn_recyclename);
        top100recycleview = (RecyclerView) root.findViewById(R.id.btn_recyclename);
        searchonline = root.findViewById(R.id.searchonline);
        searchonlineclick();
        theloai();
        top100();
        return root;
    }

    private void searchonlineclick() {
        searchonline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(getActivity(), Search.class);

            }
        });
    }


    private void top100() {
        String[] toppings = {"Nhạc Hàn", "Nhạc Việt Nam", "Nhạc US-UK","EDM","Pop","Borelo"};
        for (int i = 0; i < toppings.length; i++) {
            mData.add(new Hinh(toppings[i]));
        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        btnrecycleview.setLayoutManager(layoutManager);
        btnadapter = new btnAdapter(getContext(),mData);
        btnrecycleview.setAdapter(btnadapter);
    }

    private void theloai() {
        String[] toppings = {"Nhạc Hàn", "Nhạc Việt Nam", "Nhạc US-UK","EDM","Pop","Borelo"};
        for (int i = 0; i < toppings.length; i++) {
            mData.add(new Hinh(toppings[i]));
        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        btnrecycleview.setLayoutManager(layoutManager);
        btnadapter = new btnAdapter(getContext(),mData);
        btnrecycleview.setAdapter(btnadapter);
    }



}