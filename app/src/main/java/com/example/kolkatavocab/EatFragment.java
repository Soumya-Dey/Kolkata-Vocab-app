package com.example.kolkatavocab;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places("Haldirams", "Sweets", "https://www.lonelyplanet.com/india/kolkata-calcutta/restaurants/haldirams/a/poi-eat/1154037/356356"));
        places.add(new Places("New Aliah Hotel", "Mughlai", "https://www.lonelyplanet.com/india/kolkata-calcutta/restaurants/new-aliah-hotel/a/poi-eat/1585601/356356"));
        places.add(new Places("K C Das", "Sweets", "https://www.lonelyplanet.com/india/kolkata-calcutta/restaurants/kc-das/a/poi-eat/1033853/356356"));
        places.add(new Places("Dacres Lane", "Street Food", "https://www.lonelyplanet.com/india/kolkata-calcutta/restaurants/dacres-lane/a/poi-eat/1505360/356356"));
        places.add(new Places("Aminia", "Tandoori", "https://www.lonelyplanet.com/india/kolkata-calcutta/restaurants/aminia/a/poi-eat/410748/356356"));
        places.add(new Places("Aaheli", "Bengali", "https://www.lonelyplanet.com/india/kolkata-calcutta/restaurants/aaheli/a/poi-eat/1595480/356356"));
        places.add(new Places("Arsalan", "Mughlai", "https://www.lonelyplanet.com/india/kolkata-calcutta/restaurants/arsalan/a/poi-eat/1373272/356356"));
        places.add(new Places("Nahoum Bakery", "Bakery", "https://www.lonelyplanet.com/india/kolkata-calcutta/restaurants/nahoum-bakery/a/poi-eat/1372979/356356"));
        places.add(new Places("Kusum Rolls", "Fast Food", "https://www.lonelyplanet.com/india/kolkata-calcutta/restaurants/kusum-rolls/a/poi-eat/1154045/356356"));
        places.add(new Places("Mocambo", "Multicuisine", "https://www.lonelyplanet.com/india/kolkata-calcutta/restaurants/mocambo/a/poi-eat/410780/356356"));
        places.add(new Places("Shiraz", "Mughlai", "https://www.lonelyplanet.com/india/kolkata-calcutta/restaurants/shiraz-golden-restaurant/a/poi-eat/1373296/356356"));
        places.add(new Places("Peter Cat", "Multicuisine", "https://www.lonelyplanet.com/india/kolkata-calcutta/restaurants/peter-cat/a/poi-eat/410790/356356"));
        places.add(new Places("Picadilly Square", "Cafe", "https://www.lonelyplanet.com/india/kolkata-calcutta/restaurants/picadilly-square/a/poi-eat/1505850/356356"));
        places.add(new Places("6 Ballygunge Place", "Bengali", "https://www.lonelyplanet.com/india/kolkata-calcutta/restaurants/6-ballygunge-place/a/poi-eat/1558937/356356"));
        places.add(new Places("Bhojohori Manna", "Bengali", "https://www.lonelyplanet.com/india/kolkata-calcutta/restaurants/bhojohori-manna/a/poi-eat/1153996/356356"));
        places.add(new Places("Monkey Bar", "Gastronomy", "https://www.lonelyplanet.com/india/kolkata-calcutta/restaurants/monkey-bar/a/poi-eat/1548506/356356"));

        PlacesAdapter placesAdapter = new PlacesAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(placesAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //get the place that the user has clicked
                Places currentPlace = places.get(position);

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(currentPlace.getPlaceWebsite()));
                startActivity(browserIntent);
            }
        });

        return rootView;
    }

}
