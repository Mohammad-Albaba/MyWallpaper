package com.mohammad.mywallpaper;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
int birdnum=0;
int birdphoto[]={
        R.drawable.bird_1,
        R.drawable.bird_2,
        R.drawable.bird_3,
        R.drawable.bird_4,
        R.drawable.bird_5,
};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageview);

    }

    public void btn_setWallpaper(View view) {
        WallpaperManager wallpaperManager=WallpaperManager.getInstance(getBaseContext());
        try {
            wallpaperManager.setResource(birdphoto[birdnum]);
            Toast.makeText(this, "ok", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void img_click(View view) {
        if (birdnum <4){
            birdnum++;
            imageView.setImageResource(birdphoto[birdnum]);
        }
        else {
            birdnum=0;
        }
    }
}
