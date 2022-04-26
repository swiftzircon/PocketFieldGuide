package com.example.pocketfieldguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.pocketfieldguide.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Reassigning filter variables to defaults
                SecondFragment.setSpecies_limbs(-1); // deny submission, missing a value
                SecondFragment.setSpecies_aquatic(-1); // deny submission, missing a value
                SecondFragment.setSpecies_color_1(0); // set colors to none
                SecondFragment.setSpecies_color_2(0); // set colors to none
                SecondFragment.setSpecies_color_3(0); // set colors to none
                SecondFragment.setSpecies_color_4(0); // set colors to none
                SecondFragment.setSpecies_color_5(0); // set colors to none
                SecondFragment.setSpecies_color_6(0); // set colors to none
                SecondFragment.setSpecies_color_7(0); // set colors to none
                SecondFragment.setSpecies_color_8(0); // set colors to none
                SecondFragment.setSpecies_color_9(0); // set colors to none
                SecondFragment.setSpecies_color_10(0); // set colors to none
                SecondFragment.setSpecies_color_11(0); // set colors to none
                SecondFragment.setSpecies_color_12(0); // set colors to none
                SecondFragment.setSpecies_color_13(0); // set colors to none
                SecondFragment.setSpecies_color_14(0); // set colors to none
                SecondFragment.setSpecies_color_15(0); // set colors to none
                SecondFragment.setSpecies_color_16(0); // set colors to none

                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // Reassigning filter variables to display all
                SecondFragment.setSpecies_limbs(999); // just a check value
                SecondFragment.setSpecies_aquatic(3); // unsure value
                SecondFragment.setSpecies_color_1(1); // include every color
                SecondFragment.setSpecies_color_2(1); // include every color
                SecondFragment.setSpecies_color_3(1); // include every color
                SecondFragment.setSpecies_color_4(1); // include every color
                SecondFragment.setSpecies_color_5(1); // include every color
                SecondFragment.setSpecies_color_6(1); // include every color
                SecondFragment.setSpecies_color_7(1); // include every color
                SecondFragment.setSpecies_color_8(1); // include every color
                SecondFragment.setSpecies_color_9(1); // include every color
                SecondFragment.setSpecies_color_10(1); // include every color
                SecondFragment.setSpecies_color_11(1); // include every color
                SecondFragment.setSpecies_color_12(1); // include every color
                SecondFragment.setSpecies_color_13(1); // include every color
                SecondFragment.setSpecies_color_14(1); // include every color
                SecondFragment.setSpecies_color_15(1); // include every color
                SecondFragment.setSpecies_color_16(1); // include every color

                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_ThirdFragment);
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}