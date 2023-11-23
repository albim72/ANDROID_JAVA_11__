package com.marcin.asyncimage;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button przycisk;
    private ImageView obraz;
    private TextView napis;
    private ProgressBar stan;
    private Bitmap bmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przycisk = (Button) findViewById(R.id.btnEfekt);
        obraz = (ImageView) findViewById(R.id.imageView);
        napis = (TextView) findViewById(R.id.textView);
        stan = (ProgressBar) findViewById(R.id.progressBar);
        
        Bitmap temp = BitmapFactory.decodeResource(getResources(),R.drawable.gory);
        
        bmp = temp.copy(Bitmap.Config.ARGB_8888,true);
    }
}
