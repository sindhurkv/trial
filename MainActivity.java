package com.example.sindhu.numbers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    static int displayedNum = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.setText(Integer.toString(++displayedNum));
                if (displayedNum == 10)
                    displayedNum = 0;
            }
        });

        final Button buttonNew = (Button) findViewById(R.id.idAlphabet);
        buttonNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("Info", "alpha button clicked");
                Intent in = new Intent(getApplicationContext(),NumActivity.class);
                startActivity(in);

            }
        });

    }
}



