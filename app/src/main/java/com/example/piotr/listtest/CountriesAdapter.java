package com.example.piotr.listtest;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Piotr on 2016-02-21.
 */
public class CountriesAdapter extends ArrayAdapter<Country> {

    private final Context context;
    List<Country> data;
    public CountriesAdapter(Context context, List<Country> data)  {
        super(context, R.layout.layout_list_row);
        this.data = data;
        this.context = context;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        CountryHolder holder = null;
        if(row == null) {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            row = inflater.inflate(R.layout.layout_list_row, null);
            holder = new CountryHolder();
            holder.flag = (ImageView) row.findViewById(R.id.flag);
            holder.name = (TextView) row.findViewById(R.id.name);

            row.setTag(holder);
        } else {
            holder = (CountryHolder) row.getTag();
        }

        Country country = data.get(position);
        holder.flag.setImageResource(country.getFlagResId());
        holder.name.setText(country.getName());


        return row;
    }

    @Override
    public int getCount() {
        return data.size();
    }

    static class CountryHolder {
        ImageView flag;
        TextView name;
    }
}
