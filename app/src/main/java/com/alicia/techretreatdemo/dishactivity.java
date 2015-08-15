package com.alicia.techretreatdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by alicia on 2015-08-15.
 */
public class dishactivity extends ActionBarActivity{
    Button t1, t2, t3, t4 ,t5, t6, t7, t8, t9, t10;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dish);
        Intent i = getIntent();
        t1 = (Button)findViewById(R.id.bb1);
        t2 = (Button)findViewById(R.id.bb2);
        t3 = (Button)findViewById(R.id.bb3);
        t4 = (Button)findViewById(R.id.bb4);
        t5 = (Button)findViewById(R.id.bb5);
        t6 = (Button)findViewById(R.id.bb6);
        t7 = (Button)findViewById(R.id.bb7);
        t8 = (Button)findViewById(R.id.bb8);
        t9 = (Button)findViewById(R.id.bb9);
        t10 = (Button)findViewById(R.id.bb10);
        Boolean veg = i.getExtras().getBoolean("a");
        Boolean glut = i.getExtras().getBoolean("b");
        Boolean gluc = i.getExtras().getBoolean("c");
        Boolean vegan = i.getExtras().getBoolean("d");
        Boolean sodium = i.getExtras().getBoolean("e");
        Boolean fat = i.getExtras().getBoolean("f");
        Boolean carb = i.getExtras().getBoolean("g");
        Boolean lactose = i.getExtras().getBoolean("a");
        if (veg != null) {
            t1.setVisibility(View.GONE);
            t2.setVisibility(View.GONE);
        }
        if (glut != null) {
            t3.setVisibility(View.GONE);
        }
        if (gluc != null) {
            t4.setVisibility(View.GONE);
        }
        if (vegan != null) {
            t5.setVisibility(View.GONE);
        }
        if (sodium != null) {
            t6.setVisibility(View.GONE);
        }
        if (fat!= null) {
            t7.setVisibility(View.GONE);
            t8.setVisibility(View.GONE);
        }
        if (lactose != null) {
            t9.setVisibility(View.GONE);
        }
        if (carb != null) {
            t10.setVisibility(View.GONE);
        }
    }
}
