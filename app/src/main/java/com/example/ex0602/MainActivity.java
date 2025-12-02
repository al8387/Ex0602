package com.example.ex0602;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btn;
    private int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        count = 0;
    }

    public void pressed(View view) {
        count ++;
        int copy = count;
        boolean valid = true;
        while (copy!=0) {
            if (copy==7 || copy%10==7) {
                btn.setText("BOOM !");
                valid = false;
                break;
            }
            copy = copy/10;
        }
        if (count%7==0) {
            btn.setText("BOOM !");
        }
        else if (valid) {
            btn.setText("This is a click number: "+count);
        }
    }
}