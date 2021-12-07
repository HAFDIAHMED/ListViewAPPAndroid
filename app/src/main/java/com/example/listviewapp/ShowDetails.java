package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ShowDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_details);
            getIncomingIntent();
    }
    public void getIncomingIntent(){
        if(getIntent().hasExtra("name_country")){
            String NameCountryComing=getIntent().getStringExtra("name_country");
            setNameCountry(NameCountryComing);
        }
    }
    public void setNameCountry(String name ){
        TextView TextName;
        TextName=findViewById(R.id.nameOfCountry);
        TextName.setText(name);

    }
}