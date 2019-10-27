package com.example.facultyfinderit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.xwray.groupie.GroupAdapter;

import java.util.ArrayList;

public class lillypage extends AppCompatActivity {


    RecyclerView rl ;
    GroupAdapter adapter;
    Spinner daysspinner ;

    ArrayList<Lectures> mondaylecturesArrayList = new ArrayList<Lectures>() ;
    ArrayList<Lectures> tuesdaylecturesArrayList = new ArrayList<Lectures>() ;
    ArrayList<Lectures> wednesdayLectureArraylist = new ArrayList<>();
    ArrayList<Lectures> thursdayLectureArraylist = new ArrayList<>();
    ArrayList<Lectures> fridayLectureArraylist = new ArrayList<>();
    ArrayList<Lectures> saturdayLectureArraylist = new ArrayList<>();
    Boolean mSpinnerInitialised = false;
    ArrayList<String> days = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lillypage);
        days.add("select weekday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        mondaylecturesArrayList.add(new Lectures("9AM - 10AM","OFF LECTURE","R-504"));
        mondaylecturesArrayList.add(new Lectures("10AM - 11AM","AM-3 TUT (B2)","P-504"));
        mondaylecturesArrayList.add(new Lectures("11AM - 12PM","AM-3 TUT (B2)","P-504"));
        mondaylecturesArrayList.add(new Lectures("12PM - 1PM","OFF LECTURE","R-504"));
        mondaylecturesArrayList.add(new Lectures("1PM- 2PM","OFF LECTURE","R-504"));
        mondaylecturesArrayList.add(new Lectures("2PM - 3PM","AM-3 (IT B)","R-301"));
        mondaylecturesArrayList.add(new Lectures("3PM - 4PM","OFF LECTURE","R-504"));
        mondaylecturesArrayList.add(new Lectures("4PM - 5PM","AM-3 (IT A)","R-301"));
        mondaylecturesArrayList.add(new Lectures("5PM - 6PM","OFF LECTURE","R-504"));


        tuesdaylecturesArrayList.add(new Lectures("9AM - 10AM","OFF LECTURE ","R-103"));
        tuesdaylecturesArrayList.add(new Lectures("10AM -10AM","OFF LECTURE ","R-103"));
        tuesdaylecturesArrayList.add(new Lectures("11AM -10AM","PC (IT B)","R-301"));
        tuesdaylecturesArrayList.add(new Lectures("12PM -1PM","OFF LECTURE","R-103"));
        tuesdaylecturesArrayList.add(new Lectures("1PM - 2PM","OFF LECTURE ","R-103"));
        tuesdaylecturesArrayList.add(new Lectures("2PM - 3PM","PC (IT A)","R-001"));
        tuesdaylecturesArrayList.add(new Lectures("3PM - 4PM","OFF LECTURE ","R-103"));
        tuesdaylecturesArrayList.add(new Lectures("4PM - 5PM","OFF LECTURE","R-103"));
        tuesdaylecturesArrayList.add(new Lectures("5PM - 6PM","OFF LECTURE","R-103"));

        wednesdayLectureArraylist.add(new Lectures("9AM - 10AM","OFF LECTURE","R-103"));
        wednesdayLectureArraylist.add(new Lectures("10AM -11AM","PC (IT A)","R-001"));
        wednesdayLectureArraylist.add(new Lectures("11AM - 12PM","OFF LECTURE","R-103"));
        wednesdayLectureArraylist.add(new Lectures("12PM - 1PM","OFF LECTURE","R-103"));
        wednesdayLectureArraylist.add(new Lectures("1PM - 2PM","OFF LECTURE","R-103"));
        wednesdayLectureArraylist.add(new Lectures("2PM - 3PM","OFF LECTURE","R-103"));
        wednesdayLectureArraylist.add(new Lectures("3PM - 4PM","PC (IT B)","O-503"));
        wednesdayLectureArraylist.add(new Lectures("4PM - 5PM","OFF LECTURE","R-103"));
        wednesdayLectureArraylist.add(new Lectures("5PM - 6PM","OFF LECTURE","R-103"));



        thursdayLectureArraylist.add(new Lectures("9AM - 10AM","PC TUT (IT A)","R-001"));
        thursdayLectureArraylist.add(new Lectures("10AM - 11AM","OFF LECTURE","R-103"));
        thursdayLectureArraylist.add(new Lectures("11AM - 12PM","BE LAB (B2)","T-302"));
        thursdayLectureArraylist.add(new Lectures("12PM - 1PM","BE LAB (B2)","T-302"));
        thursdayLectureArraylist.add(new Lectures("1PM - 2PM","OFF LECTURE","R-103"));
        thursdayLectureArraylist.add(new Lectures("2PM - 3PM","OFF LECTURE","R-103"));
        thursdayLectureArraylist.add(new Lectures("3PM - 4PM","PC TUT (IT B)","0-504"));
        thursdayLectureArraylist.add(new Lectures("4PM - 5PM","OFF LECTURE","R-103"));
        thursdayLectureArraylist.add(new Lectures("5PM - 6PM","OFF LECTURE","R-103"));

        fridayLectureArraylist.add(new Lectures("9AM - 10AM","BE LAB (B1)","T-302"));
        fridayLectureArraylist.add(new Lectures("10AM - 11AM","BE LAB (B1)","T-302"));
        fridayLectureArraylist.add(new Lectures("11AM - 12PM","OFF LECTURE","R-103"));
        fridayLectureArraylist.add(new Lectures("12PM - 1PM","OFF LECTURE","R-103"));
        fridayLectureArraylist.add(new Lectures("1PM - 2PM","OFF LECTURE","R-103"));
        fridayLectureArraylist.add(new Lectures("2PM - 3PM","OFF LECTURE","R-103"));
        fridayLectureArraylist.add(new Lectures("3PM - 4PM","PC (IT A)","R-001"));
        fridayLectureArraylist.add(new Lectures("4PM - 5PM","OFF LECTURE","R-103"));
        fridayLectureArraylist.add(new Lectures("5PM - 6PM","OFF LECTURE","R-103"));

        saturdayLectureArraylist.add(new Lectures("xcz","Extra Lectures ","xc"));


        adapter = new GroupAdapter();
        rl = (RecyclerView) findViewById(R.id.lillyrecyclerview) ;
        rl.setAdapter(adapter);
        rl.setLayoutManager(new LinearLayoutManager(lillypage.this));


        ArrayAdapter spinneradapter = new ArrayAdapter<String>(lillypage.this, R.layout.support_simple_spinner_dropdown_item, days);
        daysspinner = (Spinner) findViewById(R.id.daysspinner) ;
        daysspinner.setAdapter(spinneradapter);
        daysspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(!mSpinnerInitialised){
                    mSpinnerInitialised = true ;
                    return ;
                }
                Log.d("ajjuu"," position is : " + position);

                if(position==0)
                { adapter.clear();
                    for(int i = 0 ; i < 1 ; i ++) {

                    }
                }
                else if(position == 1){
                    adapter.clear();
                    for(int i = 0 ; i < mondaylecturesArrayList.size() ; i ++) {
                        adapter.add(new LectureRow(mondaylecturesArrayList.get(i)));
                    }
                }
                else if(position == 2){
                    adapter.clear();
                    for(int i = 0 ; i < tuesdaylecturesArrayList.size() ; i ++) {
                        adapter.add(new LectureRow(tuesdaylecturesArrayList.get(i)));
                    }

                }
                else if(position==3){
                    adapter.clear();
                    for(int i = 0 ; i < wednesdayLectureArraylist.size() ; i ++) {
                        adapter.add(new LectureRow(wednesdayLectureArraylist.get(i)));
                    }
                }
                else if(position==4)
                {
                    adapter.clear();
                    for(int i = 0 ; i < thursdayLectureArraylist.size() ; i ++) {
                        adapter.add(new LectureRow(thursdayLectureArraylist.get(i)));
                    }
                }
                else if(position==5)
                {
                    adapter.clear();
                    for(int i = 0 ; i < fridayLectureArraylist.size() ; i ++) {
                        adapter.add(new LectureRow(fridayLectureArraylist.get(i)));
                    }
                }
                else if(position==6){
                    adapter.clear();
                    for(int i = 0 ; i < saturdayLectureArraylist.size() ; i ++) {
                        adapter.add(new LectureRow(saturdayLectureArraylist.get(i)));
                    }

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Toast.makeText(lillypage.this,"Please select a day ",Toast.LENGTH_SHORT).show();
            }
        });

    }
}