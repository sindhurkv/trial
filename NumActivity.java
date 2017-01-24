package com.example.sindhu.numbers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.net.Uri;


import static com.example.sindhu.numbers.R.id.alphaSmall;
import static com.example.sindhu.numbers.R.id.idAlphachart;
import static com.example.sindhu.numbers.R.id.idAlphaslide;

public class NumActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.num_activity);


        final Button buttonslide = (Button) findViewById(R.id.idAlphaslide);
        buttonslide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("Info", "alpha slide button clicked");
                Intent in = new Intent(getApplicationContext(), SlideActivity.class);
                startActivity(in);

            }
        });

        final Button buttonchart = (Button) findViewById(R.id.idAlphachart);
        buttonchart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("Info", "alpha chat button clicked");
                Intent intent = new Intent(getApplicationContext(), AbcChartActivity.class);
                startActivity(intent);

            }
        });

        final Button buttonsmallchart = (Button) findViewById(R.id.alphaSmall);
        buttonsmallchart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Log.i("Info", "alpha small chat button clicked");
                Intent intent = new Intent(getApplicationContext(), abcsmallChart.class);
                startActivity(intent);

            }
        });

        final Button butNew = (Button) findViewById(R.id.idwiki);
        butNew.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
                myWebLink.setData(Uri.parse("https://en.wikipedia.org/wiki/English_alphabet"));
                startActivity(myWebLink);
            }
        });
    }
}
