package com.igorsantos.appingles.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.igorsantos.appingles.R;
import com.igorsantos.appingles.fragments.Fragment_bichos;
import com.igorsantos.appingles.fragments.Fragment_numeros;
import com.igorsantos.appingles.fragments.Fragment_vogais;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {

    private SmartTabLayout minhaSmartTabLayout;
    private ViewPager meuViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        minhaSmartTabLayout = findViewById(R.id.smartTabLayout);
        meuViewPager = findViewById(R.id.viewpager);

        FragmentPagerItemAdapter meuAdapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(),
                FragmentPagerItems.with(this)
                        .add("Bichos", Fragment_bichos.class)
                        .add("Numeros", Fragment_numeros.class)
                        .add("Vogais", Fragment_vogais.class)
                        .create()
        );

        meuViewPager.setAdapter(meuAdapter);
        minhaSmartTabLayout.setViewPager(meuViewPager);

        //configurações actionBar
        getSupportActionBar().setElevation(0);
        getSupportActionBar().setTitle("Aprenda Inglês");
    }
}
