package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    private static Context mContext;
    //private  Context mContext;

    TextView ClickText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
       // MyListView();
        ArrayListMethod();


    }
    public static Context getContext() {
        return mContext;
    }
    public void MyListView(){
        ListView myList;
        myList=findViewById(R.id.MyList);
        String [] cities={"casablanca","fes","kenitra","meknes","tanger"};
        ListAdapter listCity= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,cities);
        myList.setAdapter(listCity);

    }
    public void ArrayListMethod(){
        ListView myList;
        myList=findViewById(R.id.MyList);
        ArrayList Countries= new ArrayList();
        Countries.add("Morocco");
        Countries.add("USA");
        Countries.add("Egypt");
        ArrayAdapter ListCountry = new ArrayAdapter(this, android.R.layout.simple_list_item_1,Countries);
        myList.setAdapter(ListCountry);
        myList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               Intent CountryActivity= new Intent(ListActivity.this,ShowDetails.class);
               CountryActivity.putExtra("name_country", (String) Countries.get(i));
                startActivity(CountryActivity);
                Toast.makeText(ListActivity.this, "Country clicked is "+ Countries.get(i), Toast.LENGTH_SHORT).show();
            }
        });

    }
}