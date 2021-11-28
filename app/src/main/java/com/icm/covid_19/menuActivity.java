package com.icm.covid_19;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.auth.api.Auth;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class menuActivity extends AppCompatActivity {
    private TextView infoTextView;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        infoTextView = (TextView) findViewById(R.id.infoTextView);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                if (item.getItemId()==R.id.iniciotiem){
                    infoTextView.setText(R.string.inicio);
                    return true;
                }else if (item.getItemId() == R.id.socialesitem){
                    infoTextView.setText(R.string.sociales);
                    return true;

                }else if (item.getItemId()==R.id.publicositem){
                    infoTextView.setText(R.string.publicos);
                    return true;

                }else if (item.getItemId()==R.id.perfilitem){
                    infoTextView.setText(R.string.perfil);
                    return true;
                }
                return false;
            }
        });


    }
}