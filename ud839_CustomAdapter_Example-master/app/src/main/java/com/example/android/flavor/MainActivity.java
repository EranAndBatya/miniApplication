/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.flavor;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link MainActivity} shows a list of Android platform releases.
 * For each release, display the name, version number, and image.
 */
public class MainActivity extends AppCompatActivity {
    MediaPlayer p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an ArrayList of AndroidFlavor objects
        ArrayList<AndroidFlavor> androidFlavors = new ArrayList<AndroidFlavor>();
       // androidFlavors.add(new AndroidFlavor("סוס", "1.6", R.drawable.horse));
       // androidFlavors.add(new AndroidFlavor("כלב", "2.3-2.3.7", R.drawable.dog));
       // androidFlavors.add(new AndroidFlavor("כבשה", "2.3-2.3.7", R.drawable.sheep));


        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        AndroidFlavorAdapter flavorAdapter = new AndroidFlavorAdapter(this, androidFlavors);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(flavorAdapter);
    }

    public void play(View v){

        if(p == null)
        {
          //  p = MediaPlayer.create(this,R.raw.dog);
        }
    }
}
