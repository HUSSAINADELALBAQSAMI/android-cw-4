package com.example.cw3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final EditText c =findViewById(R.id.editTextTextPersonName);
        final EditText v =findViewById(R.id.editTextTextPersonName3);
        Button addition = findViewById(R.id.button2);

        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


           int c1 = Integer.parseInt(c.getText().toString());
           int v1 = Integer.parseInt(v.getText().toString());
           int num =c1 +v1;


           Toast.makeText(MainActivity.this,num + " ",Toast.LENGTH_LONG).show();
            }
        });


    }
}