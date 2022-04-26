package com.example.pocketfieldguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.pocketfieldguide.databinding.FragmentSecondBinding;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    static int species_limbs = -1; // default value should deny submission, -1
    static int species_aquatic = -1; // default value should deny submission, -1
    static int species_color_1 = 0; // if all colors = 0, should deny submission
    static int species_color_2 = 0;
    static int species_color_3 = 0;
    static int species_color_4 = 0;
    static int species_color_5 = 0;
    static int species_color_6 = 0;
    static int species_color_7 = 0;
    static int species_color_8 = 0;
    static int species_color_9 = 0;
    static int species_color_10 = 0;
    static int species_color_11 = 0;
    static int species_color_12 = 0;
    static int species_color_13 = 0;
    static int species_color_14 = 0;
    static int species_color_15 = 0;
    static int species_color_16 = 0;

    public static int getSpecies_limbs() {
        return species_limbs;
    }

    public static void setSpecies_limbs(int species_limbs) {
        SecondFragment.species_limbs = species_limbs;
    }

    public static int getSpecies_aquatic() {
        return species_aquatic;
    }

    public static void setSpecies_aquatic(int species_aquatic) {
        SecondFragment.species_aquatic = species_aquatic;
    }

    public static int getSpecies_color_1() {
        return species_color_1;
    }

    public static void setSpecies_color_1(int species_color_1) {
        SecondFragment.species_color_1 = species_color_1;
    }

    public static int getSpecies_color_2() {
        return species_color_2;
    }

    public static void setSpecies_color_2(int species_color_2) {
        SecondFragment.species_color_2 = species_color_2;
    }

    public static int getSpecies_color_3() {
        return species_color_3;
    }

    public static void setSpecies_color_3(int species_color_3) {
        SecondFragment.species_color_3 = species_color_3;
    }

    public static int getSpecies_color_4() {
        return species_color_4;
    }

    public static void setSpecies_color_4(int species_color_4) {
        SecondFragment.species_color_4 = species_color_4;
    }

    public static int getSpecies_color_5() {
        return species_color_5;
    }

    public static void setSpecies_color_5(int species_color_5) {
        SecondFragment.species_color_5 = species_color_5;
    }

    public static int getSpecies_color_6() {
        return species_color_6;
    }

    public static void setSpecies_color_6(int species_color_6) {
        SecondFragment.species_color_6 = species_color_6;
    }

    public static int getSpecies_color_7() {
        return species_color_7;
    }

    public static void setSpecies_color_7(int species_color_7) {
        SecondFragment.species_color_7 = species_color_7;
    }

    public static int getSpecies_color_8() {
        return species_color_8;
    }

    public static void setSpecies_color_8(int species_color_8) {
        SecondFragment.species_color_8 = species_color_8;
    }

    public static int getSpecies_color_9() {
        return species_color_9;
    }

    public static void setSpecies_color_9(int species_color_9) {
        SecondFragment.species_color_9 = species_color_9;
    }

    public static int getSpecies_color_10() {
        return species_color_10;
    }

    public static void setSpecies_color_10(int species_color_10) {
        SecondFragment.species_color_10 = species_color_10;
    }

    public static int getSpecies_color_11() {
        return species_color_11;
    }

    public static void setSpecies_color_11(int species_color_11) {
        SecondFragment.species_color_11 = species_color_11;
    }

    public static int getSpecies_color_12() {
        return species_color_12;
    }

    public static void setSpecies_color_12(int species_color_12) {
        SecondFragment.species_color_12 = species_color_12;
    }

    public static int getSpecies_color_13() {
        return species_color_13;
    }

    public static void setSpecies_color_13(int species_color_13) {
        SecondFragment.species_color_13 = species_color_13;
    }

    public static int getSpecies_color_14() {
        return species_color_14;
    }

    public static void setSpecies_color_14(int species_color_14) {
        SecondFragment.species_color_14 = species_color_14;
    }

    public static int getSpecies_color_15() {
        return species_color_15;
    }

    public static void setSpecies_color_15(int species_color_15) {
        SecondFragment.species_color_15 = species_color_15;
    }

    public static int getSpecies_color_16() {
        return species_color_16;
    }

    public static void setSpecies_color_16(int species_color_16) {
        SecondFragment.species_color_16 = species_color_16;
    }



    // OnCreate method of second fragment

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        //Reset all filters
        species_limbs = -1; // default value should deny submission, -1
        species_aquatic = -1; // default value should deny submission, -1
        species_color_1 = 0; // if all colors = 0, should deny submission
        species_color_2 = 0;
        species_color_3 = 0;
        species_color_4 = 0;
        species_color_5 = 0;
        species_color_6 = 0;
        species_color_7 = 0;
        species_color_8 = 0;
        species_color_9 = 0;
        species_color_10 = 0;
        species_color_11 = 0;
        species_color_12 = 0;
        species_color_13 = 0;
        species_color_14 = 0;
        species_color_15 = 0;
        species_color_16 = 0;

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Feature selection radio buttons, these are only checked when submitting form
                // Limb Radio Group
                if(binding.limbradioButton1.isChecked()){
                    species_limbs = 0; // 0 Limbs
                } else if (binding.limbradioButton2.isChecked()){
                    species_limbs = 2; // 2 Limbs
                } else if (binding.limbradioButton3.isChecked()){
                    species_limbs = 4; // 4 Limbs
                } else {
                    species_limbs = -1; // nothing checked, deny submission
                }

                // Aquatic Radio Group
                if(binding.Aquaticradiobutton1.isChecked()){
                    species_aquatic = 0; // Yes
                } else if (binding.Aquaticradiobutton2.isChecked()){
                    species_aquatic = 1; // No
                } else if (binding.Aquaticradiobutton3.isChecked()){
                    species_aquatic = 2; // Unsure
                } else {
                    species_aquatic = -1; // nothing checked, deny submission
                }

                // Color Checkboxes
                if(binding.colorradioButton1.isChecked()){
                    //color_1_red
                    species_color_1 = 1;
                }
                if(binding.colorradioButton2.isChecked()){
                    //color_2_brickred
                    species_color_2 = 1;
                }
                if(binding.colorradioButton3.isChecked()){
                    //color_3_deepbrown
                    species_color_3 = 1;
                }
                if(binding.colorradioButton4.isChecked()){
                    //color_4_lightbrown
                    species_color_4 = 1;
                }
                if(binding.colorradioButton5.isChecked()){
                    //color_5_orange
                    species_color_5 = 1;
                }
                if(binding.colorradioButton6.isChecked()){
                    //color_6_gold
                    species_color_6 = 1;
                }
                if(binding.colorradioButton7.isChecked()){
                    //color_7_lime
                    species_color_7 = 1;
                }
                if(binding.colorradioButton8.isChecked()){
                    //color_8_deepgreen
                    species_color_8 = 1;
                }
                if(binding.colorradioButton9.isChecked()){
                    //color_9_bluegreen
                    species_color_9 = 1;
                }
                if(binding.colorradioButton10.isChecked()){
                    //color_10_blue
                    species_color_10 = 1;
                }
                if(binding.colorradioButton11.isChecked()){
                    //color_11_brightblue
                    species_color_11 = 1;
                }
                if(binding.colorradioButton12.isChecked()){
                    //color_12_magenta
                    species_color_12 = 1;
                }
                if(binding.colorradioButton13.isChecked()){
                    //color_13_black
                    species_color_13 = 1;
                }
                if(binding.colorradioButton14.isChecked()){
                    //color_14_gray
                    species_color_14 = 1;
                }
                if(binding.colorradioButton15.isChecked()){
                    //color_15_lightgray
                    species_color_15 = 1;
                }
                if(binding.colorradioButton16.isChecked()){
                    //color_16_white
                    species_color_16 = 1;
                }

                // Before navigation, check if denial of submission is necessary:
                //deny submission if no item is chosen for aquatic or limb radio groups, and if
                //no colors were chosen (all = 0)
                if (species_aquatic==-1 || species_limbs==-1 ||
                        (species_color_1|species_color_2|species_color_3|species_color_4
                        |species_color_5|species_color_6|species_color_7|species_color_8
                        |species_color_9|species_color_10|species_color_11|species_color_12
                        |species_color_13|species_color_14|species_color_15|species_color_16)==0) {
                    // deny entry, something was left unchecked
                    Snackbar.make(view, "A Field was left empty.", Snackbar.LENGTH_SHORT)
                            .setAction("Action", null).show();
                } else {
                    //species_aquatic has been set.
                    //species_limbs has been set.
                    //species_colors have been set.

                    // Navigate to data fragment 3
                    NavHostFragment.findNavController(SecondFragment.this)
                            .navigate(R.id.action_SecondFragment_to_ThirdFragment);
                }

            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}