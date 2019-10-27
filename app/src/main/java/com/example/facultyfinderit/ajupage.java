package com.example.facultyfinderit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompatSideChannelService;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.xwray.groupie.GroupAdapter;
import com.xwray.groupie.ViewHolder;
import com.xwray.groupie.Item;
import com.xwray.groupie.ViewHolder;

import java.nio.file.spi.FileTypeDetector;
import java.util.ArrayList;

public class ajupage extends AppCompatActivity {


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
        setContentView(R.layout.activity_ajupage);
        days.add("select weekday");
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");
        mondaylecturesArrayList.add(new Lectures("9AM - 10AM","LD (IT B)","R-301"));
        mondaylecturesArrayList.add(new Lectures("10AM - 11AM","OFF LECTURE","S=107"));
        mondaylecturesArrayList.add(new Lectures("11AM - 12PM","LD (IT A)","R-001"));
        mondaylecturesArrayList.add(new Lectures("12PM - 1PM","OFF LECTURE","S-107"));
        mondaylecturesArrayList.add(new Lectures("1PM- 2PM","OFF LECTURE0","S-107"));
        mondaylecturesArrayList.add(new Lectures("2PM - 3PM","OFF LECTURE","S-107"));
        mondaylecturesArrayList.add(new Lectures("3PM - 4PM","OFF LECTURE","S-107"));
        mondaylecturesArrayList.add(new Lectures("4PM - 5PM","OFF LECTURE","S-107"));


        tuesdaylecturesArrayList.add(new Lectures("9AM - 10AM","OFF LECTURE ","S-107"));
        tuesdaylecturesArrayList.add(new Lectures("10AM -10AM","OFF LECTURE ","S-107"));
        tuesdaylecturesArrayList.add(new Lectures("11AM -10AM","OFF LECTURE ","S-107"));
        tuesdaylecturesArrayList.add(new Lectures("12PM -1PM","PRACTICAL LD (B2) ","T-301"));
        tuesdaylecturesArrayList.add(new Lectures("1PM - 2PM","PRACTICAL LD (B2) ","T-301"));
        tuesdaylecturesArrayList.add(new Lectures("2PM - 3PM","OFF LECTURE ","S-107"));
        tuesdaylecturesArrayList.add(new Lectures("3PM - 4PM","OFF LECTURE ","S-107"));
        tuesdaylecturesArrayList.add(new Lectures("4PM - 5PM","LD (IT A) ","R-001"));

        wednesdayLectureArraylist.add(new Lectures("9AM - 10AM","OFF LECTURE","S-107"));
        wednesdayLectureArraylist.add(new Lectures("10AM -11AM","LD (IT B)","R-302"));
        wednesdayLectureArraylist.add(new Lectures("11AM - 12PM","OFF LECTURE","S-107"));
        wednesdayLectureArraylist.add(new Lectures("12PM - 1PM","OFF LECTURE","S-107"));
        wednesdayLectureArraylist.add(new Lectures("1PM - 2PM","PRACTICAL LD (A1)","T-301"));
        wednesdayLectureArraylist.add(new Lectures("2PM - 3PM","PRACTICAL LD (A1","T-301"));
        wednesdayLectureArraylist.add(new Lectures("3PM - 4PM","OFF LECTURE","S-107"));
        wednesdayLectureArraylist.add(new Lectures("4PM - 5PM","LD (IT A)","R-001"));


        thursdayLectureArraylist.add(new Lectures("9AM - 10AM","OFF LECTURE","S-107"));
        thursdayLectureArraylist.add(new Lectures("10AM - 11AM","OFF LECTURE","S107"));
        thursdayLectureArraylist.add(new Lectures("11AM - 12PM","LD (IT A)","R-001"));
        thursdayLectureArraylist.add(new Lectures("12PM - 1PM","OFF LECTURE","S-107"));
        thursdayLectureArraylist.add(new Lectures("1PM - 2PM","PRACTICAL LD (A3)","T-301"));
        thursdayLectureArraylist.add(new Lectures("2PM - 3PM","PRACTICAL LD (A3)","T-301"));
        thursdayLectureArraylist.add(new Lectures("3PM - 4PM","OFF LECTURE","S-107"));
        thursdayLectureArraylist.add(new Lectures("4PM - 5PM","LD (IT B)","O-504"));

        fridayLectureArraylist.add(new Lectures("9AM - 10AM","OFF LECTURE","S-107"));
        fridayLectureArraylist.add(new Lectures("10AM - 11AM","LD (IT B)","R-001"));
        fridayLectureArraylist.add(new Lectures("11AM - 12PM","OFF LECTURE","S-107"));
        fridayLectureArraylist.add(new Lectures("12PM - 1PM","OFF LECTURE","S-107"));
        fridayLectureArraylist.add(new Lectures("1PM - 2PM","OFF LECTURE","S-107"));
        fridayLectureArraylist.add(new Lectures("2PM - 3PM","PRACTICAL LD (B1)","T-301"));
        fridayLectureArraylist.add(new Lectures("3PM - 4PM","PRACTICAL LD (B1)","T-301"));
        fridayLectureArraylist.add(new Lectures("4PM - 5PM","OFF LECTURE","S-107"));


        saturdayLectureArraylist.add(new Lectures("xcz","Extra Lectures ","xc"));


        adapter = new GroupAdapter();
        rl = (RecyclerView) findViewById(R.id.ajuRecyclerView) ;
        rl.setAdapter(adapter);
        rl.setLayoutManager(new LinearLayoutManager(ajupage.this));


        ArrayAdapter spinneradapter = new ArrayAdapter<String>(ajupage.this, R.layout.support_simple_spinner_dropdown_item, days);
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
                Toast.makeText(ajupage.this,"Please select a day ",Toast.LENGTH_SHORT).show();;
            }
        });

    }
}


class LectureRow extends Item<ViewHolder> {

    TextView timingtv, subtv, roomtv ;
    Lectures lecture ;
    public LectureRow(Lectures lecture){
        this.lecture = lecture;
    }

    @Override
    public void bind(@NonNull ViewHolder viewHolder, int position) {
        timingtv = (TextView) viewHolder.itemView.findViewById(R.id.timingtv);
        subtv = (TextView) viewHolder.itemView.findViewById(R.id.subtv);
        roomtv = (TextView) viewHolder.itemView.findViewById(R.id.roomtv);

        timingtv.setText("" + lecture.timing);
        subtv.setText("" + lecture.subject);
        roomtv.setText("" + lecture.roomNo);
    }

    @Override
    public int getLayout() {
        return R.layout.lecture_row_layout ;
    }
}



class Lectures{
    String timing, subject , roomNo ;

    public Lectures(String timing, String subject, String roomNo) {
        this.timing = timing ;
        this.subject = subject ;
        this.roomNo = roomNo ;
    }
}
