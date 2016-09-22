package com.example.yusuf.listviewdemo_default;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListViewCompat;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.listview)
    ListViewCompat listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setActionBar_();
        init();
    }

    private void init() {
        MainItem mainItem = new MainItem("adam", "perfect");
        MainItem mainItem2 = new MainItem("john", "excelent");
        ArrayList<MainItem> arrayList = new ArrayList<MainItem>();
        arrayList.add(mainItem);
        arrayList.add(mainItem2);
        Adapter adapter = new Adapter(arrayList, getApplicationContext());
        listview.setAdapter(adapter);
    }

    private void setActionBar_() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        }
//        toolbar.setTitle("title");
        toolbar.setNavigationIcon(ContextCompat.getDrawable(this, android.R.drawable.ic_menu_day));
//        toolbar.setLogo(ContextCompat.getDrawable(this, android.R.drawable.ic_menu_gallery));
//        setSupportActionBar(toolbar);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "ddddddd", Toast.LENGTH_LONG).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
