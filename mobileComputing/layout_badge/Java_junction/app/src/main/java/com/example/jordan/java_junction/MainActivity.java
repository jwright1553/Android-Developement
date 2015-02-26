package com.example.jordan.java_junction;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;



public class MainActivity extends Activity {

    Spinner building;
    EditText roomNumber;
    TextView orderConfirm;
    RadioGroup drink;
    RadioButton selectedDrink;
    String orderedDrink;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        building = (Spinner) findViewById(R.id.buildingSelectSpinner);
        roomNumber = (EditText) findViewById(R.id.roomSelectEdit);
        orderConfirm = (TextView) findViewById(R.id.orderShown);
        drink = (RadioGroup) findViewById(R.id.bevSelectRadio);




    }

    public void submit(View v){

        selectedDrink = (RadioButton) findViewById(drink.getCheckedRadioButtonId());
        orderedDrink = selectedDrink.getText().toString();

        String orderConfirmed = null;

        orderConfirmed = "We will head to "+(building.getSelectedItem().toString())+", Room "+(roomNumber.getText().toString())+", with your "+orderedDrink+" very soon!";

        orderConfirm.setText(orderConfirmed);

    }


}
