package com.example.pocketfieldguide;

public class DataModel {

    private int species_id;
    private String species_name;
    private String species_family;
    private String conservation_status;
    private String species_range;
    private String species_info;
    private String species_color;
    private String species_image;
    private String species_limbs;
    private String species_aquatic;

    public DataModel(int species_id, String species_name, String species_family, String
            conservation_status, String species_range, String species_info, String species_color,
            String species_image, String species_limbs, String species_aquatic){

        this.species_id = species_id;
        this.species_name = species_name;
        this.species_family = species_family;
        this.conservation_status = conservation_status;
        this.species_range = species_range;
        this.species_info = species_info;
        this.species_color = species_color;
        this.species_image = species_image;
        this.species_limbs = species_limbs;
        this.species_aquatic = species_aquatic;

    }

    public DataModel() {
    }

    // toString method for items
    @Override
    public String toString() {
        return "DataModel{" +
                "species_id=" + species_id +
                ", species_name='" + species_name + '\'' +
                ", species_family='" + species_family + '\'' +
                ", conservation_status='" + conservation_status + '\'' +
                ", species_range='" + species_range + '\'' +
                ", species_info='" + species_info + '\'' +
                ", species_color='" + species_color + '\'' +
                ", species_image='" + species_image + '\'' +
                ", species_limbs='" + species_limbs + '\'' +
                ", species_aquatic='" + species_aquatic + '\'' +
                '}';
    }

    public int getSpecies_id() {
        return species_id;
    }

    public void setSpecies_id(int species_id) {
        this.species_id = species_id;
    }

    public String getSpecies_name() {
        return species_name;
    }

    public void setSpecies_name(String species_name) {
        this.species_name = species_name;
    }

    public String getSpecies_family() {
        return species_family;
    }

    public void setSpecies_family(String species_family) {
        this.species_family = species_family;
    }

    public String getConservation_status() {
        return conservation_status;
    }

    public void setConservation_status(String conservation_status) {
        this.conservation_status = conservation_status;
    }

    public String getSpecies_range() {
        return species_range;
    }

    public void setSpecies_range(String species_range) {
        this.species_range = species_range;
    }

    public String getSpecies_info() {
        return species_info;
    }

    public void setSpecies_info(String species_info) {
        this.species_info = species_info;
    }

    public String getSpecies_color() {
        return species_color;
    }

    public void setSpecies_color(String species_color) {
        this.species_color = species_color;
    }

    public String getSpecies_image() {
        return species_image;
    }

    public void setSpecies_image(String species_image) {
        this.species_image = species_image;
    }

    public String getSpecies_limbs() {
        return species_limbs;
    }

    public void setSpecies_limbs(String species_limbs) {
        this.species_limbs = species_limbs;
    }

    public String getSpecies_aquatic() {
        return species_aquatic;
    }

    public void setSpecies_aquatic(String species_aquatic) {
        this.species_aquatic = species_aquatic;
    }
}
