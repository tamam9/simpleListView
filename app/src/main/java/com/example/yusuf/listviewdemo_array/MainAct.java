package com.example.yusuf.listviewdemo_array;

import android.app.Activity;
import android.os.Bundle;
import android.test.InstrumentationTestCase;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import com.example.yusuf.listviewdemo_default.MainItem;

import java.util.ArrayList;

/**
 * Created by Yusuf on 2016/9/22.
 */

public class MainAct extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listView = new ListView(getApplicationContext());
        String[] array = {"a", "b", "c"};
        listView.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, array));
        setContentView(listView);
    }


}
