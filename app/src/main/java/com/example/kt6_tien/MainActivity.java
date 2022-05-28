package com.example.kt6_tien;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<QuocGia> quocGiaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= findViewById(R.id.list);
        quocGiaArrayList =new ArrayList<>();
        quocGiaArrayList=QuocGia.dulieu();

        Adapter adapter = new ArrayAdapter<>(MainActivity.this,R.layout.list_item_layout,quocGiaArrayList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String ten;
                ten =quocGiaArrayList.get(i).getTen();
                Toast.makeText(MainActivity.this,ten,Toast.LENGTH_LONG).show();
            }
        });



    }
}