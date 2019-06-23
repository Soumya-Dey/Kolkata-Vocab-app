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
public class SleepFragment extends Fragment {


    public SleepFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places("Pipal Tree", "Boutique hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/pipal-tree/a/lod/24a37ac8-f701-49a4-8c26-ed86fad9b3dc/356356"));
        places.add(new Places("Broadway Hotel", "Hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/broadway-hotel/a/lod/31236f50-f4e3-445b-852c-efa0035976d4/356356"));
        places.add(new Places("Hotel Embassy", "Hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/hotel-embassy/a/lod/614d1792-1843-4d2e-8e44-d6c2b19f2a76/356356"));
        places.add(new Places("Ethnotel", "Hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/ethnotel/a/lod/678bdc4b-a46a-4ffb-8eb8-4a98ff6830f7/356356"));
        places.add(new Places("Oberoi Grand", "heritage hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/oberoi-grand/a/lod/1b20cc59-f30e-4eda-bcc7-cfeca7d3815b/356356"));
        places.add(new Places("The Corner Courtyard", "Hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/the-corner-courtyard/a/lod/a2c15101-b2bb-4029-ae57-bea6547f8185/356356"));
        places.add(new Places("Astoria Hotel", "Hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/astoria-hotel/a/lod/004251eb-3e4c-432d-a899-e0638e0cd056/356356"));
        places.add(new Places("Golden Apple Hotel", "Guesthouse", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/golden-apple-hotel/a/lod/6372f8cb-df9a-4b1c-883a-3d3ffa0eab70/356356"));
        places.add(new Places("DK International", "Hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/dk-international/a/lod/a2f5fd1f-d298-45b4-9e10-af44254c6905/356356"));
        places.add(new Places("Aafreen Tower", "Hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/aafreen-tower/a/lod/6e2c077b-ab93-483b-a9e8-5069f5d61f05/356356"));
        places.add(new Places("Taj Bengal", "Hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/taj-bengal/a/lod/a64bdc02-ab1f-4a89-8fdd-ccae0723a054/356356"));
        places.add(new Places("JW Marriott Hotel", "Hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/jw-marriott-hotel-kolkata/a/lod/e8c44d57-1357-4418-aaf3-3c34e9bcae56/356356"));
        places.add(new Places("The Sonnet", "Hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/the-sonnet-kolkata/a/lod/88a87ba8-6d1c-42af-9cd6-831add21881c/356356"));
        places.add(new Places("ITC Sonar", "Hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/itc-sonar-kolkata-a-luxury-collection-hotel/a/lod/0ad4bffe-664d-4997-b16e-3d17a35e20ff/356356"));
        places.add(new Places("Calcutta Bungalow", "Bed and Breakfast", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/calcutta-bungalow/a/lod/7a526e13-bcbd-4c2c-8243-6bc7779c6ccf/356356"));
        places.add(new Places("Bigboss", "Hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/bigboss/a/lod/c3ba01f0-53d5-41e5-b458-d0c99cbd517a/356356"));
        places.add(new Places("Kolkata Backpakers", "Homestay", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/kolkata-backpackers-bed-breakfast/a/lod/eac8d44f-fb7d-4f2f-96c6-d9ad98220623/356356"));
        places.add(new Places("Hyatt Regency", "Hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/hyatt-regency/a/lod/2382e185-3dc1-44a5-828d-722a0f6d1512/356356"));
        places.add(new Places("Swissotel", "Hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/swissotel/a/lod/54e3aebb-a55d-4da5-b2e0-dac9e15cf09d/356356"));
        places.add(new Places("Atithi Inn", "Hotel", "https://www.lonelyplanet.com/india/kolkata-calcutta/hotels/atithi-inn/a/lod/af985c34-efeb-477f-8bd7-ff4985bd566f/356356"));

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
