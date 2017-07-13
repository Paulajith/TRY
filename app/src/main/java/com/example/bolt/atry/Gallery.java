 package com.example.bolt.atry;

import android.net.Uri;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import java.util.logging.Handler;


import java.io.File;
import java.util.ArrayList;
import java.util.logging.LogRecord;

 public class Gallery extends AppCompatActivity {
    GridView gv;
    ArrayList<File> list;
    Handler h;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);



        list = imagrReader(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES));

        gv = (GridView) findViewById(R.id.Grid);
        gv.setAdapter(new GridAdapter());





    }

    class GridAdapter extends BaseAdapter{


        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int i) {
            return list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            view = getLayoutInflater().inflate(R.layout.my_grid,viewGroup ,false);
            ImageView iv = view.findViewById(R.id.imageView);

            iv.setImageURI(Uri.parse( getItem(i).toString()));

            return view;
        }
    }

    ArrayList<File> imagrReader( File root ){

        ArrayList<File> a = new ArrayList<>();
            File[] files = root.listFiles();
            for(int i =0;i<files.length; i++){
                if(files[i].isDirectory()){
                    a.addAll(imagrReader(files[i]));
                }
                else{
                    if (files[i].getName().endsWith(".jpg")){
                        a.add(files[i]);
                    }
                }
            }
            return a;

    }

}
