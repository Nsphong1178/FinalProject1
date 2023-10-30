package com.example.finalproject1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class list_alarm extends AppCompatActivity {
    ListView listAlarm;
    ArrayList<String> arrayAlarm;

    Button Addition;
    protected void onCreate(Bundle savedIntanceState){
        super.onCreate(savedIntanceState);
        setContentView(R.layout.list_alarm);

        listAlarm = (ListView) findViewById(R.id.list);
        arrayAlarm = new ArrayList<String>();
        Addition = findViewById(R.id.buttonAdd);

        arrayAlarm.add("7h30");
        ArrayAdapter adapter = new ArrayAdapter(
        list_alarm.this, android.R.layout.simple_list_item_1,
                arrayAlarm
        );
        listAlarm.setAdapter(adapter);

        listAlarm.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(list_alarm.this, arrayAlarm.get(i), Toast.LENGTH_SHORT).show();
            }
        });

        Addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Addition = new Intent(list_alarm.this, MainActivity.class);
                startActivity(Addition);
            }
        });



    }

}
