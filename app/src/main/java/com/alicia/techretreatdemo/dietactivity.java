package com.alicia.techretreatdemo;

import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by alicia on 2015-08-15.
 */
public class dietactivity extends ActionBarActivity {
    ArrayList<String> diet = new ArrayList();
    Boolean b1 = false, b2 = false, b3 = false, b4 = false, b5 = false, b6 = false, b7 = false, b8 = false;
    Button veg, glut, gluc, vegan, sodium, fat, carb, lactose, done;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diet);
        veg = (Button) findViewById(R.id.vegetarianbutton);
        veg.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                String id = "a";
                if (b1 = false) {
                    veg.setBackgroundColor(Color.YELLOW);
                    diet.add(id);
                    b1 = true;
                } else {
                    diet.remove(id);
                    veg.setBackground(getResources().getDrawable(R.drawable.VegetarianFood));
                    b1 = false;
                }
            }
        });
        glut = (Button) findViewById(R.id.glutenbutton);
        glut.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                String id = "b";
                if (b2 = false) {
                    glut.setBackgroundColor(Color.YELLOW);
                    diet.add(id);
                    b2 = true;
                } else {
                    diet.remove(id);
                    glut.setBackground(getResources().getDrawable(R.drawable.GlutenFree));
                    b2 = false;
                }
            }
        });
        gluc = (Button) findViewById(R.id.glucosebutton);
        gluc.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                String id = "c";
                if (b3 = false) {
                    gluc.setBackgroundColor(Color.YELLOW);
                    diet.add(id);
                    b3 = true;
                } else {
                    diet.remove(id);
                    gluc.setBackground(getResources().getDrawable(R.drawable.glucosecontrol));
                    b3 = false;
                }
            }
        });
        vegan = (Button) findViewById(R.id.veganbutton);
        vegan.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                String id = "d";
                if (b4 = false) {
                    vegan.setBackgroundColor(Color.YELLOW);
                    diet.add(id);
                    b4 = true;
                } else {
                    diet.remove(id);
                    vegan.setBackground(getResources().getDrawable(R.drawable.VeganFood));
                    b4 = false;
                }
            }
        });
        sodium = (Button) findViewById(R.id.sodiumbutton);
        sodium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = "e";
                if (b5 = false) {
                    sodium.setBackgroundColor(Color.YELLOW);
                    diet.add(id);
                    b5 = true;
                } else {
                    diet.remove(id);
                    sodium.setBackground(getResources().getDrawable(R.drawable.LowSodium));
                    b5 = false;
                }
            }
        });
        fat = (Button) findViewById(R.id.fatbutton);
        fat.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                String id = "f";
                if (b6 = false) {
                    fat.setBackgroundColor(Color.YELLOW);
                    diet.add(id);
                    b6 = true;
                } else {
                    diet.remove(id);
                    fat.setBackground(getResources().getDrawable(R.drawable.LowFat));
                    b6 = false;

                }
            }
        });
        carb = (Button) findViewById(R.id.carbbutton);
        carb.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                String id = "g";
                if (b7 = false) {
                    carb.setBackgroundColor(Color.YELLOW);
                    diet.add(id);
                    b7 = true;
                } else {
                    diet.remove(id);
                    carb.setBackground(getResources().getDrawable(R.drawable.LowCarb));
                    b7 = false;
                }
            }
        });
        lactose = (Button) findViewById(R.id.lactosebutton);
        lactose.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                String id = "h";
                if (b8 = false) {
                    lactose.setBackgroundColor(Color.YELLOW);
                    diet.add(id);
                    b8 = true;
                } else {
                    diet.remove(id);
                    lactose.setBackground(getResources().getDrawable(R.drawable.LactoseFree));
                    b8 = false;
                }
            }
        });
        done = (Button) findViewById(R.id.done);
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.alicia.techretreat.DISHACTIVITY");
                for (int j = 0; j < diet.size(); j++) {
                    i.putExtra(diet.get(j), true);
                }
                startActivity(i);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_splash, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.main) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
