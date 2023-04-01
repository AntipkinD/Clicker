package com.example.clicker;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;
import android.widget.TextView;

public class MainActivity extends Activity {

    private Integer counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
    }
    public void onClickBtnAddNothing(View view) {
        counter++;
        TextView counterView = findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("counter", counter);
    }
    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        counter = savedInstanceState.getInt("counter");
        TextView counterView = findViewById(R.id.txt_counter);
        counterView.setText(counter.toString());
    }
}