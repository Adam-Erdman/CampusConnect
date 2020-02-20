package com.example.campusconnect;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;


public class View_Calendar extends AppCompatActivity {

    // Button button_ReturnToHomepage;
    CalendarView calendar;
    TextView daySelectionText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_calendar);

        /*
        // Back button disabled for now. Redundant.
        button_ReturnToHomepage = findViewById(R.id.returnto_main);
        button_ReturnToHomepage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backTo_HomeScreen();
            }
        });*/
        
        calendar = findViewById(R.id.calendarView);
        daySelectionText = findViewById(R.id.daySelection);
        
        calendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView,
                                            int year, int month, int day) {
                
                StringBuilder userSelectedDate = new StringBuilder();
                userSelectedDate.append(month + 1);
                userSelectedDate.append('/');
                userSelectedDate.append(day);
                userSelectedDate.append('/');
                userSelectedDate.append(year);
                
                daySelectionText.setText(userSelectedDate);

                openEventView(20);
            }
        });
    }

    
    // public displayEventIndicators(){}
    //
    // Probable Solution:
    // 1. Create a "grid" that corresponds to the days of the month.
    // 2. Display a dot (or other icon) on days that have events.
    // 3. When user selects a day, they will be interacting not with the
    //      icons, but the underlying CalendarView.
    
    public void openEventView (int eventId){
        Intent intent = new Intent (this, EventView.class);
        intent.putExtra("Event", eventId);
        startActivity(intent);
    }


    /*
    // TODO: Add a "Jump to..." ??
    public void backTo_HomeScreen(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    */

}//end [ CLASS: View_Calendar ]