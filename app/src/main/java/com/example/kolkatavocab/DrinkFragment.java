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
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class DrinkFragment extends Fragment {


    public DrinkFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places("OlyPub", "Bar", "https://www.lonelyplanet.com/india/kolkata-calcutta/nightlife/olypub/a/poi-dri/1373306/356356"));
        places.add(new Places("Roxy", "Lounge", "https://www.lonelyplanet.com/india/kolkata-calcutta/nightlife/roxy/a/poi-dri/1613261/356356"));
        places.add(new Places("Paramount", "Juice Bar", "https://www.lonelyplanet.com/india/kolkata-calcutta/nightlife/paramount/a/poi-dri/1548512/356356"));
        places.add(new Places("Broadway Bar", "Bar", "https://www.lonelyplanet.com/india/kolkata-calcutta/nightlife/broadway-bar/a/poi-dri/1373310/356356"));
        places.add(new Places("New Cathay", "Bar", "https://www.lonelyplanet.com/india/kolkata-calcutta/nightlife/new-cathay/a/poi-dri/1505126/356356"));
        places.add(new Places("Flury's", "Cafe", "https://www.lonelyplanet.com/india/kolkata-calcutta/nightlife/flury-s/a/poi-dri/410766/356356"));
        places.add(new Places("Bikers' Cafe", "Sports Bar", "https://www.lonelyplanet.com/india/kolkata-calcutta/nightlife/bikers-cafe/a/poi-dri/1509226/356356"));
        places.add(new Places("Barf Soda Paani", "Bar", "https://www.zomato.com/kolkata/barf-soda-paani-park-street-area"));
        places.add(new Places("Dugout", "Cafe", "https://www.lonelyplanet.com/india/kolkata-calcutta/nightlife/dugout/a/poi-dri/1548507/356356"));
        places.add(new Places("Wise Owl", "Cafe", "https://www.lonelyplanet.com/india/kolkata-calcutta/nightlife/wise-owl/a/poi-dri/1548515/356356"));
        places.add(new Places("Hard Rock Café", "Cafe", "https://www.lonelyplanet.com/india/kolkata-calcutta/nightlife/hard-rock-cafe/a/poi-dri/1613262/356356"));
        places.add(new Places("Keventer's", "Beverage", "https://www.zomato.com/kolkata/keventers-elgin"));
        places.add(new Places("Aqua", "Lounge", "https://www.lonelyplanet.com/india/kolkata-calcutta/nightlife/aqua/a/poi-dri/1548509/356356"));
        places.add(new Places("Tantra", "Club", "https://www.lonelyplanet.com/india/kolkata-calcutta/nightlife/tantra/a/poi-dri/410814/356356"));
        places.add(new Places("Dolly's Tea House", "Tea", "https://www.lonelyplanet.com/india/kolkata-calcutta/shopping/dollys-tea-shop/a/poi-sho/1548232/356356"));

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
