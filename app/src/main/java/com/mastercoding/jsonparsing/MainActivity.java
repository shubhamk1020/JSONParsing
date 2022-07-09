package com.mastercoding.jsonparsing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    // Widgets
     TextView name,salary;

     // JSON STRING
    String JSON_STRING = "{\"employee\":{\"name\":\"Master Coding\",\"salary\":500}}";

    String namey,salaryy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Reference for textview
        name = findViewById(R.id.name);
        salary = findViewById(R.id.salary);

        //Getting JSON Object from json file
        try {

            JSONObject obj = new JSONObject(JSON_STRING);
            // FetJSON object named employee

            JSONObject employee = obj.getJSONObject("employee");
            // Getting Employee name and salary inside json object (employee)

            namey = employee.getString("name");
            salaryy = employee.getString("salary");

            // setting textview
            name.setText("Name:" + namey);
            salary.setText("Salary: " + salaryy);

        } catch (JSONException e) {
            e.printStackTrace();
        }
    }}