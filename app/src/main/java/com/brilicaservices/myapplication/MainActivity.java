package com.brilicaservices.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText studentNameTF, studentPhoneTF, studentAddressTF;
    Button addStudentBtn, displayStudentBtn;
    TextView displayStudentsResultTV;

    String collegeName = "";

    ArrayList<Student> studentArrayList = new ArrayList<>();


    Spinner spinnerCollegeNames;


    String collegeNames[] = {"Select college name","DIT", "Graphic Era", "UPES"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        * casting objects with the respective view ids.*/
        studentNameTF = (EditText) findViewById(R.id.student_name);
        studentPhoneTF = (EditText) findViewById(R.id.enter_phone);
        studentAddressTF = (EditText) findViewById(R.id.enter_address);

        addStudentBtn = (Button) findViewById(R.id.add_student_button);
        displayStudentBtn = (Button) findViewById(R.id.display_student_button);

        displayStudentsResultTV = (TextView) findViewById(R.id.display_student_details_text_view);

        spinnerCollegeNames = (Spinner) findViewById(R.id.college_name_spinner);


        spinnerCollegeNames.setOnItemSelectedListener(this);


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, collegeNames);


        spinnerCollegeNames.setAdapter(arrayAdapter);


        spinnerCollegeNames.setPrompt(collegeNames[0]);


        addStudentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String name = studentNameTF.getText().toString();
                long phone = Long.parseLong(studentPhoneTF.getText().toString());
                String address = studentAddressTF.getText().toString();


                studentArrayList.add(new Student(name, collegeName, phone, address));


                Toast.makeText(getApplicationContext(), "Student data saved successfully", Toast.LENGTH_LONG).show();
            }
        });


        displayStudentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                for (int i=0; i<studentArrayList.size(); i++) {



                    displayStudentsResultTV.setText(displayStudentsResultTV.getText() + "Student Name is: " + studentArrayList.get(i).studentName + "\n");
                    displayStudentsResultTV.setText(displayStudentsResultTV.getText() + "Student College is: " + studentArrayList.get(i).studentCollege + "\n");
                    displayStudentsResultTV.setText(displayStudentsResultTV.getText() + "Student Phone Number is: " + studentArrayList.get(i).studentPhoneNumber + "\n");
                    displayStudentsResultTV.setText(displayStudentsResultTV.getText() + "Student Address is: " + studentArrayList.get(i).studentAddress + "\n");
                    displayStudentsResultTV.setText(displayStudentsResultTV.getText() + "****************\n\n");
                }
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        collegeName = collegeNames[position];
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}