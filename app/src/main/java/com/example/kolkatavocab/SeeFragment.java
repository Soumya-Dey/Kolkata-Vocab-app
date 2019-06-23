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
public class SeeFragment extends Fragment {


    public SeeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<Places> places = new ArrayList<Places>();
        places.add(new Places("Kumartuli idol makers","Area", R.drawable.kumartuli, "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/kumartuli-idol-makers/a/poi-sig/1033796/356356"));
        places.add(new Places("Jorasanko Thakur Bari", "Museum", "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/tagore-s-house/a/poi-sig/410848/356356"));
        places.add(new Places("Hoogly riverbanks","Pier", R.drawable.hoogly_river, "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/hooghly-riverbanks/a/poi-sig/1546228/356356"));
        places.add(new Places("Marble palace","Museum", R.drawable.marble_palace, "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/marble-palace/a/poi-sig/410836/356356"));
        places.add(new Places("Nakhoda Mosque", "Mosque", "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/nakhoda-mosque/a/poi-sig/1033800/356356"));
        places.add(new Places("Indian Coffee House", "Historic Site", R.drawable.indian_coffee_house, "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/indian-coffee-house/a/poi-sig/410768/356356"));
        places.add(new Places("Belur Math", "religious site", "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/belur-math/a/poi-sig/410820/356356"));
        places.add(new Places("Howrah Bridge", "Landmark", R.drawable.howrah_bridge, "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/howrah-bridge/a/poi-sig/410828/356356"));
        places.add(new Places("Writer's Building", "Historic Building", "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/writers-buildings/a/poi-sig/1378006/356356"));
        places.add(new Places("Lenin Statue", "Monument", "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/lenin-statue/a/poi-sig/1377865/356356"));
        places.add(new Places("South Park Street Cemetery", "Cemetery", R.drawable.cemetery, "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/south-park-street-cemetery/a/poi-sig/1153533/356356"));
        places.add(new Places("Dakshineswar Kali Temple", "Hindu Temple" , "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/dakshineswar/a/poi-sig/1373003/356356"));
        places.add(new Places("New Market", "Market", "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/new-market/a/poi-sig/1372926/356356"));
        places.add(new Places("College Street", "Market", R.drawable.college_street, "https://kolkatatourism.co.in/college-street-kolkata"));
        places.add(new Places("Shahid Minar", "Landmark", "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/shahid-minar/a/poi-sig/1033820/356356"));
        places.add(new Places("Indian Museum", "Museum", R.drawable.indian_museum, "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/indian-museum/a/poi-sig/410830/356356"));
        places.add(new Places("High Court", "Historic Building", "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/high-court/a/poi-sig/1033797/356356"));
        places.add(new Places("Eco Park", "Tourism Park", R.drawable.eco_park, "https://kolkatatourism.co.in/eco-tourism-park-kolkata"));
        places.add(new Places("Maidan","Park", R.drawable.maidan, "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/maidan/a/poi-sig/1033798/356356"));
        places.add(new Places("Mullik Ghat Flower Market", "Market", "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/mullik-ghat-flower-market/a/poi-sig/1033821/356356"));
        places.add(new Places("Birla Planetarium", "Planetarium", R.drawable.planatarium, "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/birla-planetarium/a/poi-sig/410824/356356"));
        places.add(new Places("Raj Bhawan", "Notable Building", "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/raj-bhavan/a/poi-sig/1153548/356356"));
        places.add(new Places("St Paul's Cathedral Church", "Church", R.drawable.cathedral_church, "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/st-paul-s-cathedral/a/poi-sig/410846/356356"));
        places.add(new Places("Botanical Garden", "Park", "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/botanical-gardens/a/poi-sig/410826/356356"));
        places.add(new Places("Academy of Fine Arts", "Gallery", R.drawable.academy_fine_arts, "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/academy-of-fine-arts/a/poi-sig/410816/356356"));
        places.add(new Places("Victoria Memorial", "Historic Building", R.drawable.victoria_memorial, "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/victoria-memorial/a/poi-sig/410850/356356"));
        places.add(new Places("National Library", "Library", "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/national-library/a/poi-sig/1033865/356356"));
        places.add(new Places("Kalighat Temple", "Hindu Temple", "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/kalighat-temple/a/poi-sig/1153592/356356"));
        places.add(new Places("Alipore Zoo", "Zoo", R.drawable.alipore_zoo, "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/alipore-zoo/a/poi-sig/410834/356356"));
        places.add(new Places("Rabindra Sarovar", "Park", "https://www.lonelyplanet.com/india/kolkata-calcutta/attractions/rabindra-sarovar/a/poi-sig/1033833/356356"));
        places.add(new Places("Saltlake Stadium", "Stadium", R.drawable.saltlake_stadium, "https://www.lonelyplanet.com/india/kolkata-calcutta/entertainment/salt-lake-stadium/a/poi-ent/1509221/356356"));
        places.add(new Places("Nandan Cinema", "Cinema", "https://www.lonelyplanet.com/india/kolkata-calcutta/entertainment/nandan-cinema/a/poi-ent/1373321/356356"));
        places.add(new Places("Science City", "Amusement Park", R.drawable.science_city, "https://kolkatatourism.co.in/science-city-kolkata"));
        places.add(new Places("Eden Gardens", "Stadium", R.drawable.eden_gardens_stadium, "https://www.lonelyplanet.com/india/kolkata-calcutta/entertainment/eden-gardens/a/poi-ent/1033831/356356"));

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
