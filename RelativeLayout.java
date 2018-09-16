package com.example.hamza.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class RelativeLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
    }

    public void onClickRegister(View view){    //do something in response to button "Relative Layout"

        //getting user input from widgets to display in toast
        String email, pass, gender = "", term = "";

        EditText editText = (EditText) findViewById(R.id.editText);
        email = editText.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.editText2);
        pass = editText2.getText().toString();

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radioButton2:
                if (checked)
                    gender = "Male";
                break;
            case R.id.radioButton3:
                if (checked)
                    gender = "Female";
                break;
            case R.id.radioButton4:
                if (checked)
                    gender = "Other";
                break;
        }

        // Is the view now checked?
        checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox:
                if (checked){
                    term = "Terms and Conditions accepted";
                }

                else{
                    term = "Accept Terms and Conditions to continue";
                }
        }

        Toast.makeText(this, " " +email +"  " + pass +"  " +gender +"  " +term, Toast.LENGTH_LONG).show();
    }
}
