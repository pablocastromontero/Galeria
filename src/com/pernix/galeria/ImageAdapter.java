package com.pernix.galeria;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return image.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setAdjustViewBounds(true);
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(image[position]);
        return imageView;
    }

    // references to our images
    public static Integer[] image = {
            R.drawable.carta_0_cc, R.drawable.carta_1_2_cc, R.drawable.carta_1_cc, R.drawable.carta_2_cc, 
            R.drawable.carta_3_cc, R.drawable.carta_5_cc, R.drawable.carta_8_cc, R.drawable.carta_13_cc,
            R.drawable.carta_20_cc, R.drawable.carta_40_cc, R.drawable.carta_100_cc, R.drawable.carta_interrogacion_cc,
            R.drawable.carta_taza_cc, R.drawable.reverso_cc, R.drawable.reverso_cc
    };
}