package com.bagicode.www.bagitraveloka;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bagicode.www.bagitraveloka._sliders.FragmentSlider;
import com.bagicode.www.bagitraveloka._sliders.SliderIndicator;
import com.bagicode.www.bagitraveloka._sliders.SliderPagerAdapter;
import com.bagicode.www.bagitraveloka._sliders.SliderView;

import java.util.ArrayList;
import java.util.List;



/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private SliderPagerAdapter mAdapter;
    private SliderIndicator mIndicator;

    private SliderView sliderView;
    private LinearLayout mLinearLayout;
    private RelativeLayout menu1;
    private RelativeLayout menu2;
    private RelativeLayout menu3;
    private RelativeLayout menu4;
    private RelativeLayout menu5;
    private RelativeLayout menu6;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        // Inflate the layout for this fragment
        sliderView = (SliderView) rootView.findViewById(R.id.sliderView);
        mLinearLayout = (LinearLayout) rootView.findViewById(R.id.pagesContainer);
        menu1 = (RelativeLayout) rootView.findViewById(R.id.menu1);

        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Kajian", Toast.LENGTH_SHORT).show();

                Intent goPindah = new Intent(getActivity(), AboutActivity.class);
                startActivity(goPindah);
            }

        });

        sliderView = (SliderView) rootView.findViewById(R.id.sliderView);
        mLinearLayout = (LinearLayout) rootView.findViewById(R.id.pagesContainer);
        menu2 = (RelativeLayout) rootView.findViewById(R.id.menu2);

        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Direktori", Toast.LENGTH_SHORT).show();

                Intent goPindah = new Intent(getActivity(), DirektoriActivity.class);
                startActivity(goPindah);
            }

        });
        sliderView = (SliderView) rootView.findViewById(R.id.sliderView);
        mLinearLayout = (LinearLayout) rootView.findViewById(R.id.pagesContainer);
        menu3 = (RelativeLayout) rootView.findViewById(R.id.menu3);

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Event", Toast.LENGTH_SHORT).show();

                Intent goPindah = new Intent(getActivity(), EventActivity.class);
                startActivity(goPindah);
            }

        });

        sliderView = (SliderView) rootView.findViewById(R.id.sliderView);
        mLinearLayout = (LinearLayout) rootView.findViewById(R.id.pagesContainer);
        menu4 = (RelativeLayout) rootView.findViewById(R.id.menu4);

        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "ZIS", Toast.LENGTH_SHORT).show();

                Intent goPindah = new Intent(getActivity(), ZisActivity.class);
                startActivity(goPindah);
            }

        });
        sliderView = (SliderView) rootView.findViewById(R.id.sliderView);
        mLinearLayout = (LinearLayout) rootView.findViewById(R.id.pagesContainer);
        menu5 = (RelativeLayout) rootView.findViewById(R.id.menu5);

        menu5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Quotes", Toast.LENGTH_SHORT).show();

                Intent goPindah = new Intent(getActivity(), QuotesActivity.class);
                startActivity(goPindah);
            }

        });

        sliderView = (SliderView) rootView.findViewById(R.id.sliderView);
        mLinearLayout = (LinearLayout) rootView.findViewById(R.id.pagesContainer);
        menu6 = (RelativeLayout) rootView.findViewById(R.id.menu6);

        menu6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "CoWorking", Toast.LENGTH_SHORT).show();

                Intent goPindah = new Intent(getActivity(), CoworkingActivity.class);
                startActivity(goPindah);
            }

        });







        // jika internet aktfif
        setupSliderOfline();

        return rootView;
    }

    private void setupSlider() {
        sliderView.setDurationScroll(800);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/slider1.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/slider2.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/slider3.jpg"));
        fragments.add(FragmentSlider.newInstance("http://www.menucool.com/slider/prod/slider4.jpg"));

        mAdapter = new SliderPagerAdapter(getFragmentManager(), fragments);
        sliderView.setAdapter(mAdapter);
        mIndicator = new SliderIndicator(getActivity(), mLinearLayout, sliderView, R.drawable.indicator_circle);
        mIndicator.setPageCount(fragments.size());
        mIndicator.show();
    }

    private void setupSliderOfline() {
        sliderView.setDurationScroll(800);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(FragmentSlider.newInstance("slider1"));
        fragments.add(FragmentSlider.newInstance("slider2"));
        fragments.add(FragmentSlider.newInstance("slider3"));
        fragments.add(FragmentSlider.newInstance("slider4"));

        mAdapter = new SliderPagerAdapter(getFragmentManager(), fragments);
        sliderView.setAdapter(mAdapter);
        mIndicator = new SliderIndicator(getActivity(), mLinearLayout, sliderView, R.drawable.indicator_circle);
        mIndicator.setPageCount(fragments.size());
        mIndicator.show();
    }

}

