package com.example.kolkatavocab;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Remove title bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set toolbar title
        CollapsingToolbarLayout collapsingToolbar = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle("Kolkata Vocab");
        collapsingToolbar.setCollapsedTitleTextColor(Color.WHITE);
        collapsingToolbar.setExpandedTitleColor(Color.rgb(255, 255, 255));

        //intent to open the view activity when the explore floating button is clicked
        com.robertlevonyan.views.customfloatingactionbutton.FloatingActionButton exploreFab = (com.robertlevonyan.views.customfloatingactionbutton.FloatingActionButton) findViewById(R.id.explore_fab);
        exploreFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent exploreIntent = new Intent(MainActivity.this, ViewActivity.class);
                startActivity(exploreIntent);
            }
        });

        //intent to open specified url for reading more about kolkata
        com.robertlevonyan.views.customfloatingactionbutton.FloatingActionButton readMoreFab = (com.robertlevonyan.views.customfloatingactionbutton.FloatingActionButton) findViewById(R.id.read_more_fab);
        readMoreFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent readMoreIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lonelyplanet.com/india/kolkata-calcutta"));
                startActivity(readMoreIntent);
            }
        });
    }
}
