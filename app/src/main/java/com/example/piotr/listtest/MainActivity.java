package com.example.piotr.listtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listView);


        List<Country> data = new ArrayList<Country>();
        data.add(new Country(R.drawable.albania, "Albania"));
        data.add(new Country(R.drawable.germany, "Germany"));
        data.add(new Country(R.drawable.greece, "Greece"));
        data.add(new Country(R.drawable.israel, "Israel"));
        data.add(new Country(R.drawable.italy, "Italy"));
        data.add(new Country(R.drawable.japan, "Japan"));
        data.add(new Country(R.drawable.north_korea, "North Korea"));
        data.add(new Country(R.drawable.poland, "Poland"));
        data.add(new Country(R.drawable.portugal, "Portugal"));
        data.add(new Country(R.drawable.south_korea, "South Korea"));
        data.add(new Country(R.drawable.united_states_of_america, "United States of America"));

        CountriesAdapter countriesAdapter = new CountriesAdapter(this, data);
        listView.setAdapter(countriesAdapter);


    }
}
