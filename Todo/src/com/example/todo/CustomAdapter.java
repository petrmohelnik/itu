package com.example.todo;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
	 
    private ArrayList<MessageDetails> _data;
    Context _c;
    
    CustomAdapter (ArrayList<MessageDetails> data, Context c){
        _data = data;
        _c = c;
    }
   
    public int getCount() {
        // TODO Auto-generated method stub
        return _data.size();
    }
    
    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return _data.get(position);
    }
 
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }
   
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
         View v = convertView;
         if (v == null)
         {
            LayoutInflater vi = (LayoutInflater)_c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = vi.inflate(R.layout.task_item, null);
         }
 
           TextView fromView = (TextView)v.findViewById(R.id.From);
           TextView subView = (TextView)v.findViewById(R.id.subject);
           TextView descView = (TextView)v.findViewById(R.id.description);
           TextView timeView = (TextView)v.findViewById(R.id.time);
 
           MessageDetails msg = _data.get(position);
           fromView.setText(msg.from);
           subView.setText("Subject: "+msg.sub);
           descView.setText(msg.desc);
           timeView.setText(msg.time);                             
                        
        return v;
}
}
