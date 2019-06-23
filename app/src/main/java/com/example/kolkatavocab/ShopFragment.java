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
public class ShopFragment extends Fragment {


    public ShopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places("E Mall", "Electronics", "https://www.lonelyplanet.com/india/kolkata-calcutta/shopping/e-mall/a/poi-sho/1548231/356356"));
        places.add(new Places("Hogg Market", "Market", "https://www.lonelyplanet.com/india/kolkata-calcutta/shopping/hogg-market/a/poi-sho/1559324/356356"));
        places.add(new Places("New Market", "Market", "https://www.lonelyplanet.com/india/kolkata-calcutta/shopping/new-market/a/poi-sho/1548230/356356"));
        places.add(new Places("Oxford Bookstore", "Bookstore", "https://www.lonelyplanet.com/india/kolkata-calcutta/shopping/oxford-bookstore/a/poi-sho/1033972/356356"));
        places.add(new Places("City Centre", "Mall", "http://saltlake.citycentremalls.in/"));
        places.add(new Places("Quest Mall", "Mall", "http://www.questmall.in/"));
        places.add(new Places("College Street", "Market", "https://kolkatatourism.co.in/college-street-kolkata"));
        places.add(new Places("Hatibagan Market", "Market", "https://www.tripadvisor.in/Attraction_Review-g304558-d2463935-Reviews-Hatibagan_Market-Kolkata_Calcutta_Kolkata_District_West_Bengal.html"));
        places.add(new Places("Story Bookstore", "Bookstore", "https://www.lonelyplanet.com/india/kolkata-calcutta/shopping/story/a/poi-sho/1033971/356356"));
        places.add(new Places("FabIndia", "Fabrics", "https://www.lonelyplanet.com/india/kolkata-calcutta/shopping/fabindia/a/poi-sho/1373361/356356"));
        places.add(new Places("Burrabazar", "Market", "https://www.yatra.com/india-tourism/shopping-in-kolkata/burrabazar-market"));
        places.add(new Places("South City Mall", "Mall", "https://southcitymall.in/"));
        places.add(new Places("Kashmir Emporium", "Arts & Crafts", "https://www.lonelyplanet.com/india/kolkata-calcutta/shopping/kashmir-emporium/a/poi-sho/1373341/356356"));
        places.add(new Places("Shopper's Stop", "Clothing", "https://www.shoppersstop.com/"));
        places.add(new Places("Central", "Mall", "https://centralandme.com/"));
        places.add(new Places("Acropolis Mall", "Mall", "http://www.acropolismall.in/"));

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
