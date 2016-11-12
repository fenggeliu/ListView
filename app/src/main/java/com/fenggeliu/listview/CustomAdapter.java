package com.fenggeliu.listview;

import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by fengge on 11/11/2016.
 */

class CustomAdapter extends ArrayAdapter<String> {

    CustomAdapter(Context context, String[] foods) {
        super(context, R.layout.custom_row, foods);

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater liusInflater = LayoutInflater.from(getContext());
        View customView = liusInflater.inflate(R.layout.custom_row, parent, false);

        String singleFoodItem = getItem(position);
        TextView liusText = (TextView) customView.findViewById(R.id.liusText);
        ImageView liusImage = (ImageView) customView.findViewById(R.id.liusImage);

        liusText.setText(singleFoodItem);
        liusImage.setImageResource(R.drawable.kwpbz);
        return customView;
    }
}
