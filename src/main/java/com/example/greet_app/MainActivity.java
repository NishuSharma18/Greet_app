package com.example.greet_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
//    public static final String MSG = "com.Greet_App.MSG";
private EditText name;
private Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.purple_500)));
        submit = findViewById(R.id.button);
        name = findViewById(R.id.NameInput);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Ready to Thrill...", Toast.LENGTH_SHORT).show();
                String n = name.getText().toString();

                Intent intent =new Intent(MainActivity.this,secondActivity.class);
                intent.putExtra("nameUser",n);
                startActivity(intent);
            }
        });


    }

}