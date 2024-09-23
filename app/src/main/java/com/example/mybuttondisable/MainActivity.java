package com.example.mybuttondisable;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import com.example.mybuttondisable.R;

public class MainActivity extends AppCompatActivity {
    private Button buttonDisable; // Deklaracja przycisku
    private View buttonDisable1;
    int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonDisable = findViewById(R.id.buttonDisable);
        buttonDisable1 = findViewById(R.id.buttonDisable1);
        buttonDisable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonDisable.setEnabled(false);

                counter++;
                Toast.makeText(MainActivity.this, "Przycisk został wyłączony " + counter + " raz/y", Toast.LENGTH_SHORT).show();
            }
        });
        buttonDisable1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                buttonDisable1.setEnabled(true);
                buttonDisable.setEnabled(true);
                Toast.makeText(MainActivity.this, "Przycisk został włączony", Toast.LENGTH_SHORT).show();
            }
        });
    }
}