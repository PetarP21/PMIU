package com.example.adapter5activitieslogistic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class AreaAcitivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area_acitivity);
        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("Name"));
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(new OblastAdapter(this,getOblast()));
    }

    private ArrayList<Oblast> getOblast() {
        ArrayList<Oblast> oblast;
        oblast = new ArrayList<>();
        oblast.add(new Oblast("Varna","9000"));
        oblast.add(new Oblast("Burgas","2000"));
        return oblast;
    }

}