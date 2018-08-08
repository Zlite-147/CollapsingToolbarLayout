package com.example.zlite_147.collapsingtoolbarlayout;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        collapsingToolbarLayout=(CollapsingToolbarLayout)findViewById(R.id.CollapsingToolbarLayout1);
        collapsingToolbarLayout.setTitle("CollapsingToolbarLayout Example");
    }
}
