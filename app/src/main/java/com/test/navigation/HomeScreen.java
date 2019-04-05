package com.test.navigation;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeScreen extends AppCompatActivity {

    private static final String TAG = "Main";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        final Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        BottomNavigationView navigationView = findViewById(R.id.bottom);
        NavController controller = Navigation.findNavController(this, R.id.navigation_main);
        controller.addOnDestinationChangedListener((navController, navDestination, bundle) -> toolbar.setTitle("" + navDestination.getLabel()));
        NavigationUI.setupWithNavController(navigationView, controller);


        Intent intent = getIntent();
        String action = intent.getAction();
        Uri data = intent.getData();
        Log.d(TAG, "onCreate()  [" + data + "]");
    }





}
