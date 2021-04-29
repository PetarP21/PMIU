package com.example.adapter5activitieslogistic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collection;

public class OblastAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<Oblast> collection;

    public OblastAdapter(Context context, ArrayList<Oblast> collection) {
        this.context = context;
        this.collection = collection;
    }

    @Override
    public int getCount() {
        return collection.size();
    }

    @Override
    public Object getItem(int position) {
        return collection.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.itemoblast,parent,false);
        }
        TextView text1,text2;
        text1 = convertView.findViewById(R.id.textView2);
        text2 = convertView.findViewById(R.id.textView3);
        Oblast oblast= (Oblast) getItem(position);
        text1.setText(oblast.getName());
        text2.setText(oblast.getPostCode());
        return convertView;
    }
}
