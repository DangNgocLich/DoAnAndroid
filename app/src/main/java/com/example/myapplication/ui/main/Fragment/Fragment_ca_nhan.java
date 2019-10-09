package com.example.myapplication.ui.main.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.myapplication.R;
import com.example.myapplication.ui.main.Activity.MainActivity;
import com.example.myapplication.ui.main.Activity.ViewPlayList1;

/**
 * A placeholder fragment containing a simple view.
 */
public class Fragment_ca_nhan extends Fragment {
    View view;
    private static final String ARG_SECTION_NUMBER = "section_number";


    public static Fragment_ca_nhan newInstance(int index) {
        Fragment_ca_nhan fragment = new Fragment_ca_nhan();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        PageViewModel pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
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
        super.onCreate(savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_ca_nhan, container, false);
        getActivity();

        TextView test = (TextView) root.findViewById(R.id.tvPlayList);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateDetail();
            }
        });
        return root;
    }

    private void updateDetail() {
        Intent intent = new Intent(getActivity(),ViewPlayList1.class);
        startActivity(intent);
    }
}