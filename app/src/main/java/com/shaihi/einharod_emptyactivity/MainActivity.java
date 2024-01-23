package com.shaihi.einharod_emptyactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setButtonClick();
    }

    private void setButtonClick() {
        //find the button
        Button btn = findViewById(R.id.txtButton);

        //set the button behavior

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //It is a good practice to store your strings in teh resources so you could support
                // multiple language easily
                Log.i(getString(R.string.LOG_TAG), getString(R.string.MAIN_ACTIVITY_BTN_CLICK));
                Toast.makeText(MainActivity.this, "Pressed it!", Toast.LENGTH_SHORT).show();
                TextView txt = findViewById(R.id.textView);
                //This will change the text displayed by the TextView in our view
                txt.setText(R.string.TOAST_MSG1);
            }
        });
    }
}