package com.example.studentbiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    
    Button button_to_EditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_to_EditText=findViewById(R.id.button);
        button_to_EditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
        });
    }
}