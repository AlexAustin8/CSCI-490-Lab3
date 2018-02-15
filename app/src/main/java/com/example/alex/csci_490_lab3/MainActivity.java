package com.example.alex.csci_490_lab3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.ArrayAdapter;
import android.widget.AdapterView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView classSchedule;
    private ArrayAdapter classAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        classSchedule = this.findViewById(R.id.class_schedule);

        String[] classes = getResources().getStringArray(R.array.classes);

        classAdapter =  new ArrayAdapter(this.getApplicationContext(), android.R.layout.simple_list_item_1, classes);
        classSchedule.setAdapter(classAdapter);

        classSchedule.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Short Click yo", Toast.LENGTH_SHORT).show();
            }
        });

        classSchedule.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "I been told y'all my clicks long", Toast.LENGTH_SHORT).show();
                return false;
            }
        });






    }

    public ArrayList<Course> populateData(){
        ArrayList<Course> courses = new ArrayList<>;
        
    }
}
