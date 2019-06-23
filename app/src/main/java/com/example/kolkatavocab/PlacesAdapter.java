package com.example.kolkatavocab;

import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlacesAdapter extends ArrayAdapter<Places> {
    public PlacesAdapter(Activity context, ArrayList<Places> placesArrayList){
        super(context, 0, placesArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_style, parent, false);
        }

        // Get the Places object located at this position in the list
        Places currentPlace = getItem(position);

        //set text of the name of the place
        TextView placeNameView = (TextView) listItemView.findViewById(R.id.list_name);
        placeNameView.setText(currentPlace.getPlaceName());

        //set text of the conatact no of the place
        TextView placeTypeView = (TextView) listItemView.findViewById(R.id.list_type);
        placeTypeView.setText(currentPlace.getPlaceType());

        ImageView iconImageView = (ImageView) listItemView.findViewById(R.id.open_in_browser_icon);

        ImageView placeImageView = (ImageView) listItemView.findViewById(R.id.list_image);
        if (currentPlace.getImageResourseId() != 0){
            placeNameView.setTextColor(Color.WHITE);
            placeTypeView.setTextColor(Color.LTGRAY);
            iconImageView.setImageResource(R.drawable.round_open_in_browser_white_24);
            placeImageView.setImageResource(currentPlace.getImageResourseId());
            placeImageView.setVisibility(View.VISIBLE);

        }
        else {
            placeNameView.setTextColor(Color.BLACK);
            placeTypeView.setTextColor(Color.DKGRAY);
            iconImageView.setImageResource(R.drawable.round_open_in_browser_black_24);
            placeImageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
