package com.example.campusconnect;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import androidx.appcompat.app.AppCompatActivity;



class Event {


    private String name;
    private String location;
    private String startTime;
    private String date;

    public Event() {}

    public Event(String name, String location, String startTime, String date) {
        // ...
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getDate() {
        return date;
    }

}



public class EventCreation extends AppCompatActivity{

    String EventName, location, startTime, date;

    EditText EventNameInput;
    EditText locationInput;
    EditText startTimeInput;
    EditText dateInput;

    Button submitButton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event_creation);

        EventNameInput = (EditText) findViewById(R.id.EventName);
        locationInput = (EditText) findViewById(R.id.Location);
        startTimeInput = (EditText) findViewById(R.id.Time);
        dateInput = (EditText) findViewById(R.id.EventDate);

//        submitButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                EventName = EventNameInput.getText().toString();
//                location = locationInput.getText().toString();
//                startTime = startTimeInput.getText().toString();
//                date = dateInput.getText().toString();
//
//                Event event = new Event(EventName, location, startTime,
//                        date);
//                db.collection("Events").document("Practice").set(event);
//            }
//        });
    }
}
