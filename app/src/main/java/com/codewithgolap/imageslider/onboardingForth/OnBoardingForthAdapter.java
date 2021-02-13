package com.codewithgolap.imageslider.onboardingForth;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.codewithgolap.imageslider.R;

public class OnBoardingForthAdapter extends PagerAdapter {


    private Context context;

    public OnBoardingForthAdapter(Context context) {
        this.context = context;
    }

    private int[] slider_images = {
            R.drawable.fa2,
            R.drawable.fa6,
            R.drawable.fa7,
            R.drawable.fa5
    };

    private String[] slider_title = {
            "Food in your area",
            "Food which is Health",
            "Food you love",
            "Food that matter"
    };

    private String[] slider_desc = {
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry.",
            "Lorem Ipsum is simply dummy text of the printing and typesetting industry."
    };

    @Override
    public int getCount() {
        return slider_title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (RelativeLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.onboarding_item_layout_forth, container, false);

        ImageView img_banner = view.findViewById(R.id.img_banner);
        TextView tv_title = view.findViewById(R.id.tv_title);
        TextView tv_desc = view.findViewById(R.id.tv_desc);

        img_banner.setImageResource(slider_images[position]);
        tv_title.setText(slider_title[position]);
        tv_desc.setText(slider_desc[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout) object);
    }
}
