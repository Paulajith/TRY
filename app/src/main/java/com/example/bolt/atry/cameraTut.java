package com.example.bolt.atry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageButton;

import tourguide.tourguide.Overlay;
import tourguide.tourguide.Pointer;
import tourguide.tourguide.ToolTip;
import tourguide.tourguide.TourGuide;

public class cameraTut extends AppCompatActivity {

    //public TourGuide mTutorialHandler;
    //public Activity mActivity;
    public Button imgCamera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  mActivity = this;
        setContentView(R.layout.activity_camera_tut);

        /* Get 3 buttons from layout */
        /* setup enter and exit animation */
        /*Animation enterAnimation = new AlphaAnimation(1f, 1f);
        enterAnimation.setDuration(600);
        enterAnimation.setFillAfter(true);

        Animation exitAnimation = new AlphaAnimation(1f, 0f);
        exitAnimation.setDuration(600);
        exitAnimation.setFillAfter(true);
                                            */
        /* initialize TourGuide without playOn() */
       /* mTutorialHandler = TourGuide.init(this).with(TourGuide.Technique.Click)
                .setPointer(new Pointer())
                .setToolTip(new ToolTip()
                        //.setTitle("Capture")
                        //.setDescription("Used to capture the image")
                        //.setGravity(Gravity.TOP)
                )
                .setOverlay(new Overlay()
                       // .setEnterAnimation(enterAnimation)
                        //.setExitAnimation(exitAnimation)
                );;/*

        /* setup 1st button, when clicked, cleanUp() and re-run TourGuide on button2 */
        //mTutorialHandler.playOn(button);


        imgCamera = (Button) findViewById(R.id.captureBtn2);

        // capImage= (ImageView) findViewById(R.id.capturePic);

        imgCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCamera();
            }
        });
    }

    private void openCamera() {
        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 0);
    }

    public void buttonClick ( View v){
        if(v.getId() == R.id.iBcapture) {
            // mTutorialHandler.cleanUp();
            TourGuide mTourGuideHandler = TourGuide.init(this).with(TourGuide.Technique.Click)
                    .setPointer(new Pointer())
                    .setToolTip(new ToolTip().setTitle("Capture").setDescription("Click on Get Started to begin..."))
                    .setOverlay(new Overlay());
            //.playOn(button);
        }
    }

    public void buttonClick1 ( View v){
        //mTutorialHandler.cleanUp();
        TourGuide mTourGuideHandler = TourGuide.init(this).with(TourGuide.Technique.Click)

                .setPointer(new Pointer())
                .setToolTip(new ToolTip().setTitle("Settings").setDescription("Click on Get Started to begin..."));
                //.setOverlay(new Overlay())
                //.playOn(button);

    }

    public void buttonClick2 ( View v){
        //mTutorialHandler.cleanUp();
        TourGuide mTourGuideHandler = TourGuide.init(this).with(TourGuide.Technique.Click)

                //.setPointer(new Pointer())
                .setToolTip(new ToolTip().setTitle("Change").setDescription("Click on Get Started to begin..."))
                .setOverlay(new Overlay());
                //.playOn(button2);

    }


   /* @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK) {
            Bitmap bp = (Bitmap) data.getExtras().get("data");
            capImage.setImageBitmap(bp);
        }
    } */

    //@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void TutCamera(final View v) {
        Intent m = new Intent(cameraTut.this, Camera.class);
        startActivity(m);
    }

}

