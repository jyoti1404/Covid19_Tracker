package com.example.hp.corona;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Corona extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corona);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("About Corona");


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);

        if (item.getItemId() == android.R.id.home){
          //  Intent intent = new Intent(Corona.this,TableFragment.class);
          //  startActivity(intent);
            finish();
        }
        return true;


    }
}
