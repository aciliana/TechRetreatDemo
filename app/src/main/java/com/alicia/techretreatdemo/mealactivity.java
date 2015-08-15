package com.alicia.techretreatdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * Created by alicia on 2015-08-15.
 */
public class mealactivity extends ActionBarActivity{
    Button bre, lun, din, des;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.meal);
        this.bre = (Button)findViewById(R.id.bre);
        this.bre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.alicia.techretreatdemo.DIETACTIVITY");
                startActivity(i);
            }
        });
        this.lun = (Button)findViewById(R.id.lun);
        this.lun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.alicia.techretreatdemo.DIETACTIVITY");
                startActivity(i);
            }
        });
        this.din = (Button)findViewById(R.id.din);
        this.din.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.alicia.techretreatdemo.DIETACTIVITY");
                startActivity(i);
            }
        });
        this.des = (Button)findViewById(R.id.des);
        this.des.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("com.alicia.techretreatdemo.DIETACTIVITY");
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
