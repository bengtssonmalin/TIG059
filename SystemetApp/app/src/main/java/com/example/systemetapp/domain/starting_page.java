package com.example.systemetapp.domain;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.systemetapp.MainActivity;
import com.example.systemetapp.R;

public class starting_page extends AppCompatActivity {
    Button button_younger;
   private Button button_older;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.starting_page);

        button_older = findViewById(R.id.button_older);
        button_older.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_older= new Intent(starting_page.this, MainActivity.class);
                startActivity(intent_older);
            }
        });
        button_younger = findViewById(R.id.button_younger);
        button_younger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }
    public void openDialog() {
        ExitDialog exitDialog = new ExitDialog();
        exitDialog.show(getSupportFragmentManager(), "exit dialog");
    }
}
