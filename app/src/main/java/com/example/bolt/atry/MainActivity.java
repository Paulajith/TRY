package com.example.bolt.atry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;

import tourguide.tourguide.Overlay;
import tourguide.tourguide.Pointer;
import tourguide.tourguide.ToolTip;
import tourguide.tourguide.TourGuide;

import static com.example.bolt.atry.R.id.vio;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Button btnClickMe = (Button) findViewById(R.id.button);

        TourGuide mTourGuideHandler = TourGuide.init(this).with(TourGuide.Technique.Click)
                .setPointer(new Pointer())
                .setToolTip(new ToolTip().setTitle("Welcome!").setDescription("Click on Get Started to begin..."))
                .setOverlay(new Overlay())
                .playOn(btnClickMe);

*/

    }


    public void cameraClick(final View v) {
        if (v.getId() == R.id.cam) {

            Intent i = new Intent(MainActivity.this, Camera.class);
            startActivity(i);
        }
    }


    public void videoClick(final View v) {
        if (v.getId() == vio) {
            ImageButton btnClickMe = (ImageButton) findViewById(vio);

        }
    }


}
