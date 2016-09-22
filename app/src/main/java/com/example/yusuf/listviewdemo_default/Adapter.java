package com.example.yusuf.listviewdemo_default;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Yusuf on 2016/9/21.
 */
public class Adapter extends BaseAdapter {

    private final ArrayList<MainItem> list;
    private final Context context;

    public Adapter(ArrayList<MainItem> list, Context context) {
        this.list = list;
        this.context = context;
    }

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
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.main_item, viewGroup,false);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.title.setText(list.get(i).getTitle());
        viewHolder.second.setText(list.get(i).getSecond());

        return view;
    }


    public class ViewHolder {
        public TextView title;
        public TextView second;

        public ViewHolder(View view) {
            title = (TextView) view.findViewById(R.id.title);
            second = (TextView) view.findViewById(R.id.second);
        }
    }

}
