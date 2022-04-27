package com.example.pocketfieldguide;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Database extends SQLiteOpenHelper {

    public static String DBNAME;
    private final Context mContext;
    public static final String DBLOCATION = "/data/data/com.example.pocketfieldguide/databases";
    public static final String SPECIES_TABLE = "species_table";
    public static final String ID = "ID";
    public static final String SPECIES_NAME = "species_name";
    public static final String FAMILY = "family";
    public static final String CONSERVATION_STATUS = "conservation_status";
    public static final String SPECIES_RANGE = "species_range";
    public static final String SPECIES_INFO = "species_info";
    public static final String SPECIES_COLORS = "species_colors";
    public static final String SPECIES_IMAGE = "species_image";
    public static final String SPECIES_LIMBS = "species_limbs";
    public static final String SPECIES_AQUATIC = "species_aquatic";

    public Database(@Nullable MainActivity context){
        super(context, "species.db", null, 1);
        mContext = context;
    }

    // Called when database is called for the first time
    @Override
    public void onCreate(SQLiteDatabase db){
        // Developer only Table creation
        /*
        String createTableStatement = "CREATE TABLE " + SPECIES_TABLE + " " +
                "(" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + SPECIES_NAME + " TEXT," +
                " " + FAMILY + " TEXT, " + CONSERVATION_STATUS + " TEXT, " + SPECIES_RANGE +
                " TEXT, " + SPECIES_INFO + " TEXT, " + SPECIES_COLORS + " TEXT, " + SPECIES_IMAGE +
                " TEXT, " + SPECIES_LIMBS + " INTEGER, " + SPECIES_AQUATIC + " INTEGER)";

        db.execSQL(createTableStatement);
        */


    }

    // Called when updating database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    // Developer only addition
    /*
    public boolean addEntry(){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();

        cv.put(SPECIES_NAME, "test species");
        cv.put(FAMILY, "test family");
        cv.put(CONSERVATION_STATUS, "test status");
        cv.put(SPECIES_RANGE, "test range");
        cv.put(SPECIES_INFO, "test info");
        cv.put(SPECIES_COLORS, "color_1_red, test");
        cv.put(SPECIES_IMAGE, "amazon_milk_frog");
        cv.put(SPECIES_LIMBS, 4);
        cv.put(SPECIES_AQUATIC, 0);

        long insert = db.insert(SPECIES_TABLE, null, cv);
        if (insert == -1){
            return false;
        } else {
            return true;
        }
    }
    */

    public List<DataModel> getData(){

        //import all variables to check what kind of query we need
        int imported_species_aquatic = SecondFragment.getSpecies_aquatic();
        int imported_species_limbs = SecondFragment.getSpecies_limbs();
        int imported_species_color_1 = SecondFragment.getSpecies_color_1();
        int imported_species_color_2 = SecondFragment.getSpecies_color_2();
        int imported_species_color_3 = SecondFragment.getSpecies_color_3();
        int imported_species_color_4 = SecondFragment.getSpecies_color_4();
        int imported_species_color_5 = SecondFragment.getSpecies_color_5();
        int imported_species_color_6 = SecondFragment.getSpecies_color_6();
        int imported_species_color_7 = SecondFragment.getSpecies_color_7();
        int imported_species_color_8 = SecondFragment.getSpecies_color_8();
        int imported_species_color_9 = SecondFragment.getSpecies_color_9();
        int imported_species_color_10 = SecondFragment.getSpecies_color_10();
        int imported_species_color_11 = SecondFragment.getSpecies_color_11();
        int imported_species_color_12 = SecondFragment.getSpecies_color_12();
        int imported_species_color_13 = SecondFragment.getSpecies_color_13();
        int imported_species_color_14 = SecondFragment.getSpecies_color_14();
        int imported_species_color_15 = SecondFragment.getSpecies_color_15();
        int imported_species_color_16 = SecondFragment.getSpecies_color_16();

        // Default sql query, the following checks will add onto the query
        String query = new StringBuilder().append("SELECT * FROM ").append(SPECIES_TABLE).toString();

        // DB Search query, check what results were passed for filters
        if (imported_species_aquatic==3 && imported_species_limbs==999 &&
                (imported_species_color_1|imported_species_color_2|imported_species_color_3
                        |imported_species_color_4|imported_species_color_5
                        |imported_species_color_6|imported_species_color_7
                        |imported_species_color_8|imported_species_color_9
                        |imported_species_color_10|imported_species_color_11
                        |imported_species_color_12|imported_species_color_13
                        |imported_species_color_14|imported_species_color_15
                        |imported_species_color_16)==1){
            // Query for full database
            query = new StringBuilder().append("SELECT * FROM ").append(SPECIES_TABLE)
                    .append(" ORDER BY ").append(SPECIES_NAME).toString();
        } else {
            // Every other query included afterwards, because the above should only occur when
            // going to full database.

            // Limb query is the first addition to the original query, so it includes "WHERE".
            if (imported_species_limbs == 4) {
                query += " WHERE " + SPECIES_LIMBS + " = 4";
            } else if (imported_species_limbs == 2) {
                query += " WHERE " + SPECIES_LIMBS + " = 2";
            } else if (imported_species_limbs == 0) {
                query += " WHERE " + SPECIES_LIMBS + " = 0";
            }

            // Aquatic query is the second addition.
            // The unsure value just includes both groups.
            if (imported_species_aquatic == 0) {
                query += " AND " + SPECIES_AQUATIC + " = 1";
            } else if (imported_species_aquatic == 1) {
                query += " AND " + SPECIES_AQUATIC + " = 0";
            } else if (imported_species_limbs == 2) {
                // Nothing is added to query as to include both, unsure is selected.
            }

            // Color query is the third addition.
            // This one is more complicated, as it has to check the species_color field for any
            // matching strings.
            if (imported_species_color_1 == 1) { //red
                query += " AND " + SPECIES_COLORS + " LIKE '%color_1_red%'";
            }
            if (imported_species_color_2 == 1) { //brickred
                query += " AND " + SPECIES_COLORS + " LIKE '%color_2_brickred%'";
            }
            if (imported_species_color_3 == 1) { //deepbrown
                query += " AND " + SPECIES_COLORS + " LIKE '%color_3_deepbrown%'";
            }
            if (imported_species_color_4 == 1) { //lightbrown
                query += " AND " + SPECIES_COLORS + " LIKE '%color_4_lightbrown%'";
            }
            if (imported_species_color_5 == 1) { //orange
                query += " AND " + SPECIES_COLORS + " LIKE '%color_5_orange%'";
            }
            if (imported_species_color_6 == 1) { //gold
                query += " AND " + SPECIES_COLORS + " LIKE '%color_6_gold%'";
            }
            if (imported_species_color_7 == 1) { //lime
                query += " AND " + SPECIES_COLORS + " LIKE '%color_7_lime%'";
            }
            if (imported_species_color_8 == 1) { //deepgreen
                query += " AND " + SPECIES_COLORS + " LIKE '%color_8_deepgreen%'";
            }
            if (imported_species_color_9 == 1) { //bluegreen
                query += " AND " + SPECIES_COLORS + " LIKE '%color_9_bluegreen%'";
            }
            if (imported_species_color_10 == 1) { //blue
                query += " AND " + SPECIES_COLORS + " LIKE '%color_10_blue%'";
            }
            if (imported_species_color_11 == 1) { //brightblue
                query += " AND " + SPECIES_COLORS + " LIKE '%color_11_brightblue%'";
            }
            if (imported_species_color_12 == 1) { //magenta
                query += " AND " + SPECIES_COLORS + " LIKE '%color_12_magenta%'";
            }
            if (imported_species_color_13 == 1) { //black
                query += " AND " + SPECIES_COLORS + " LIKE '%color_13_black%'";
            }
            if (imported_species_color_14 == 1) { //gray
                query += " AND " + SPECIES_COLORS + " LIKE '%color_14_gray%'";
            }
            if (imported_species_color_15 == 1) { //lightgray
                query += " AND " + SPECIES_COLORS + " LIKE '%color_15_lightgray%'";
            }
            if (imported_species_color_16 == 1) { //white
                query += " AND " + SPECIES_COLORS + " LIKE '%color_16_white%'";
            }

        }

        // Define list that we'll return data in
        List returnList = new ArrayList();

        // Retrieve matching data from read database
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if (cursor.moveToFirst()){
            do {
                int species_id = cursor.getInt(0);
                String species_name = cursor.getString(1);
                String species_family = cursor.getString(2);
                String conservation_status = cursor.getString(3);
                String species_range = cursor.getString(4);
                String species_info = cursor.getString(5);
                String species_color = cursor.getString(6);
                String species_image = cursor.getString(7);
                String species_limbs = cursor.getString(8);
                String species_aquatic = cursor.getString(9);

                DataModel ListItem = new DataModel(species_id, species_name, species_family,
                        conservation_status, species_range, species_info, species_color,
                        species_image, species_limbs, species_aquatic);
                returnList.add(ListItem);
            } while (cursor.moveToNext());

        } else {
            //Nothing was read or added.
        }

        cursor.close();
        db.close();
        return returnList;
    }
}
