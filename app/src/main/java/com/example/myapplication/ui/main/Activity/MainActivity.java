package com.example.myapplication.ui.main.Activity;

        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.ListView;

        import com.example.myapplication.R;
        import com.example.myapplication.ui.main.Fragment.Fragment_ca_nhan;
        import com.example.myapplication.ui.main.Fragment.PlaceholderFragment;
        import com.google.android.material.tabs.TabLayout;

        import androidx.viewpager.widget.ViewPager;
        import androidx.appcompat.app.AppCompatActivity;

        import com.example.myapplication.ui.main.Adapter.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private ListView playlist;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        intit();


    }
    public void intit(){
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        sectionsPagerAdapter.addFragment(new PlaceholderFragment(),"TrangChủ");
        sectionsPagerAdapter.addFragment(new Fragment_ca_nhan(),"CáNhân");

        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
//        tabs.getTabAt(0).setIcon(R.drawable.icontrangchu);
//        tabs.getTabAt(1).setIcon(R.drawable.icontimkiem);
        tabs.setupWithViewPager(viewPager);

    }

}