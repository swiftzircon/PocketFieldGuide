package com.example.pocketfieldguide;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pocketfieldguide.databinding.FragmentSecondBinding;
import com.example.pocketfieldguide.databinding.FragmentThirdBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;

public class ThirdFragment extends Fragment {

    private FragmentThirdBinding binding;
    //ArrayAdapter dataArrayAdapter;
    DataAdapter adapter; // Using customer Listview adapter
    Database database;

    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentThirdBinding.inflate(inflater, container, false);

        ListView data_list = binding.dataList;
        Database database = new Database((MainActivity) getActivity());
        List<DataModel> allItems = database.getData();
        adapter = new DataAdapter((MainActivity) getActivity(), database);

        data_list.setAdapter(adapter);


        // This code was for displaying data in basic string listview.
        /*
        // Listview in fragment
        ListView data_list = binding.dataList;

        // Gets data list from database, each item in "allItems" is a row of the table.
        Database database = new Database((MainActivity) getActivity());
        List<DataModel> allItems = database.getData();


        dataArrayAdapter = new ArrayAdapter<DataModel>((MainActivity)
                getActivity(), android.R.layout.simple_list_item_1, allItems);

        // Return data into the Listview
        data_list.setAdapter(dataArrayAdapter);
        */
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}