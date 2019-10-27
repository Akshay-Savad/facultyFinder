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

public class deeptipage extends AppCompatActivity {


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
        setContentView(R.layout.activity_deeptipage);
        days.add("select weekday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        mondaylecturesArrayList.add(new Lectures("9AM - 10AM","OFF LECTURE","S-202"));
        mondaylecturesArrayList.add(new Lectures("10AM - 11AM","OFF LECTURE","S-202"));
        mondaylecturesArrayList.add(new Lectures("11AM - 12PM","OFF LECTURE","S-202"));
        mondaylecturesArrayList.add(new Lectures("12PM - 1PM","JAVA LAB (A1)","S-111"));
        mondaylecturesArrayList.add(new Lectures("1PM- 2PM","JAVA LAB (A1)","S-111"));
        mondaylecturesArrayList.add(new Lectures("2PM - 3PM","OFF LECTURE","S-202"));
        mondaylecturesArrayList.add(new Lectures("3PM - 4PM","JPL (IT A)","R-001"));
        mondaylecturesArrayList.add(new Lectures("4PM - 5PM","OFF LECTURE","S-202"));
        mondaylecturesArrayList.add(new Lectures("5PM - 6PM","OFF LECTURE","S-202"));


        tuesdaylecturesArrayList.add(new Lectures("9AM - 10AM","OFF LECTURE ","S-202"));
        tuesdaylecturesArrayList.add(new Lectures("10AM -10AM","JPL (IT B)","R-301"));
        tuesdaylecturesArrayList.add(new Lectures("11AM -10AM","OFF LECTURE","S-202"));
        tuesdaylecturesArrayList.add(new Lectures("12PM -1PM","JAVA LAB (B1)","S-111"));
        tuesdaylecturesArrayList.add(new Lectures("1PM - 2PM","JAVA LAB (B1)","S-111"));
        tuesdaylecturesArrayList.add(new Lectures("2PM - 3PM","OFF LECTURE","S-202"));
        tuesdaylecturesArrayList.add(new Lectures("3PM - 4PM","OFF LECTURE ","S-202"));
        tuesdaylecturesArrayList.add(new Lectures("4PM - 5PM","OFF LECTURE","S-202"));
        tuesdaylecturesArrayList.add(new Lectures("5PM - 6PM","OFF LECTURE","S-202"));

        wednesdayLectureArraylist.add(new Lectures("9AM - 10AM","OFF LECTURE","S-202"));
        wednesdayLectureArraylist.add(new Lectures("10AM -11AM","OFF LECTURE","S-202"));
        wednesdayLectureArraylist.add(new Lectures("11AM - 12PM","JPL (IT A)","R-001"));
        wednesdayLectureArraylist.add(new Lectures("12PM - 1PM","OFF LECTURE","S-202"));
        wednesdayLectureArraylist.add(new Lectures("1PM - 2PM","JAVA LAB (A2)","S-111"));
        wednesdayLectureArraylist.add(new Lectures("2PM - 3PM","JAVA LAB (A2)","S-111"));
        wednesdayLectureArraylist.add(new Lectures("3PM - 4PM","OFF LECTURE","S-202"));
        wednesdayLectureArraylist.add(new Lectures("4PM - 5PM","OFF LECTURE","S-202"));
        wednesdayLectureArraylist.add(new Lectures("5PM - 6PM","OFF LECTURE","S-202"));



        thursdayLectureArraylist.add(new Lectures("9AM - 10AM","OFF LECTURE","S-202"));
        thursdayLectureArraylist.add(new Lectures("10AM - 11AM","JAVA LAB (B2)","S-111"));
        thursdayLectureArraylist.add(new Lectures("11AM - 12PM","JAVA LAB (B2)","S-111"));
        thursdayLectureArraylist.add(new Lectures("12PM - 1PM","OFF LECTURE","S-202"));
        thursdayLectureArraylist.add(new Lectures("1PM - 2PM","OFF LECTURE","S-202"));
        thursdayLectureArraylist.add(new Lectures("2PM - 3PM","JPL (IT B)","O-504"));
        thursdayLectureArraylist.add(new Lectures("3PM - 4PM","OFF LECTURE","S-202"));
        thursdayLectureArraylist.add(new Lectures("4PM - 5PM","OFF LECTURE","S-202"));
        thursdayLectureArraylist.add(new Lectures("5PM - 6PM","OFF LECTURE","S-202"));

        fridayLectureArraylist.add(new Lectures("9AM - 10AM","OFF LECTURE","S-202"));
        fridayLectureArraylist.add(new Lectures("10AM - 11AM","JAVA LAB (A3)","S-111"));
        fridayLectureArraylist.add(new Lectures("11AM - 12PM","JAVA LAB (A3)","S-111"));
        fridayLectureArraylist.add(new Lectures("12PM - 1PM","OFF LECTURE","S-202"));
        fridayLectureArraylist.add(new Lectures("1PM - 2PM","OFF LECTURE","S-202"));
        fridayLectureArraylist.add(new Lectures("2PM - 3PM","JAVA LAB (B3)","S-111"));
        fridayLectureArraylist.add(new Lectures("3PM - 4PM","JAVA LAB (B3)","S-111"));
        fridayLectureArraylist.add(new Lectures("4PM - 5PM","OFF LECTURE","S-202"));
        fridayLectureArraylist.add(new Lectures("5PM - 6PM","OFF LECTURE","S-202"));

        saturdayLectureArraylist.add(new Lectures("xcz","Extra Lectures ","xc"));


        adapter = new GroupAdapter();
        rl = (RecyclerView) findViewById(R.id.deeptirecyclerview) ;
        rl.setAdapter(adapter);
        rl.setLayoutManager(new LinearLayoutManager(deeptipage.this));


        ArrayAdapter spinneradapter = new ArrayAdapter<String>(deeptipage.this, R.layout.support_simple_spinner_dropdown_item, days);
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
                Toast.makeText(deeptipage.this,"Please select a day ",Toast.LENGTH_SHORT).show();;
            }
        });

    }
}