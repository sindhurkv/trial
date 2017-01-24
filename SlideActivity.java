package com.example.sindhu.numbers;


import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;


public class SlideActivity extends AppCompatActivity {

    static int displayedNum = 1;


    private Bitmap getBitmapFromAsset(String strName)
    {
        AssetManager assetManager = getAssets();
        InputStream istr = null;
        try {
            Log.i("info", "image name : " + strName);
            istr = assetManager.open(strName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Bitmap bitmap = BitmapFactory.decodeStream(istr);
        return bitmap;
    }

    public void imageButton(View view){
        Log.i("info", "image button clicked" );
        ImageView image = (ImageView) findViewById(R.id.imageButton);

        image.setImageBitmap(getBitmapFromAsset(Integer.toString(++displayedNum) + ".png"));
        if (displayedNum == 10)
            displayedNum = 0;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide);

        final Button button = (Button) findViewById(R.id.IdOne);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button.setText(Integer.toString(++displayedNum));
                if (displayedNum == 10)
                    displayedNum = 0;
            }
        });



    }
}
