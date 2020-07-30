package com.example.trf_custom_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] tiltle={"title1","title2","title3","title4","title5","title5","title5","title5","title5","title5"};
    String[] subtitle={"Subtitle1","Subtitle2","Subtitle3","Subtitle4","Subtitle5","Subtitle5","Subtitle5","Subtitle5","Subtitle5","Subtitle5"};
    Integer[] imgNo={android.R.drawable.ic_menu_search,android.R.drawable.alert_dark_frame,android.R.drawable.ic_media_pause,android.R.drawable.ic_media_next,android.R.drawable.ic_menu_send,android.R.drawable.ic_menu_send,android.R.drawable.ic_menu_send,android.R.drawable.ic_menu_send,android.R.drawable.ic_menu_send,android.R.drawable.ic_menu_send};
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomAdapter customadapter=new CustomAdapter(this,tiltle,subtitle,imgNo);
        listview=findViewById(R.id.listview);
        listview.setAdapter(customadapter);


    }

    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }


    @Override
    protected void onStop() {
        super.onStop();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

    }
}