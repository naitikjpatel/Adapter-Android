package com.example.simple_array_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText e_name;
    Button button;
    Spinner spinner;
    GridView gridView;
    ArrayList arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e_name=findViewById(R.id.e_name);
        button=findViewById(R.id.button);
        spinner=findViewById(R.id.spinner);
        gridView=findViewById(R.id.gridView);
        arrayList=new ArrayList();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=e_name.getText().toString();
                arrayList.add(name);

//                make the adapter
                ArrayAdapter arrayAdapter=new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1,arrayList);
                spinner.setAdapter(arrayAdapter);
                gridView.setAdapter(arrayAdapter);

            }
        });


    }
}