package com.example.pocketfieldguide;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class DataAdapter extends BaseAdapter {

    Activity mActivity;
    Database database;

    public DataAdapter(Activity mActivity, Database database) {
        this.mActivity = mActivity;
        this.database = database;
    }

    @Override
    public int getCount() {
        return database.getData().size();
    }

    @Override
    public DataModel getItem(int position) {
        return database.getData().get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View oneDataLine;

        LayoutInflater inflater = (LayoutInflater) mActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        oneDataLine = inflater.inflate(R.layout.list_data_layout, viewGroup, false);

        // Assign textview relevant items
        ImageView tv_image = oneDataLine.findViewById(R.id.species_image);
        TextView tv_name = oneDataLine.findViewById(R.id.species_name);
        TextView tv_family = oneDataLine.findViewById(R.id.species_family);
        TextView tv_status = oneDataLine.findViewById(R.id.conservation_status);
        TextView tv_range = oneDataLine.findViewById(R.id.species_range);
        TextView tv_info = oneDataLine.findViewById(R.id.species_info);

        // Bring in data
        DataModel d = this.getItem(position);

        tv_name.setText(d.getSpecies_name());
        tv_family.setText("Family: " + d.getSpecies_family());
        tv_status.setText("Conservation Status: " + d.getConservation_status());
        tv_range.setText("Habitat Range: " + d.getSpecies_range());
        tv_info.setText(d.getSpecies_info());

        // Find Image
        String image_name = d.getSpecies_image();
        int image_ID = mActivity.getResources().getIdentifier(image_name, "drawable",
                mActivity.getPackageName());
        tv_image.setImageResource(image_ID);


        return oneDataLine;
    }
}
