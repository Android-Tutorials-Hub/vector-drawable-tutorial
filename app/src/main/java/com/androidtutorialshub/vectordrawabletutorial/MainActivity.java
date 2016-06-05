package com.androidtutorialshub.vectordrawabletutorial;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imagePragmatically;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize object of imageview
        imagePragmatically = (ImageView) findViewById(R.id.imagePragmatically);

        //set vector drawable progmatically to ImageView
        imagePragmatically.setImageResource(R.drawable.icon_android);
    }
}
