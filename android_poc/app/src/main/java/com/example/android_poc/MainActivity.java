package com.example.android_poc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button myButton = new Button(this);
        myButton.setText("Press Me");
        RelativeLayout myLayout = new RelativeLayout(this);
        myLayout.addView(myButton);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(
                        FlutterActivity
                                .withNewEngine()
                                .initialRoute("/")
                                .build(getApplicationContext())
                );
            }
        });
        setContentView(myLayout);

    }
}