package com.example.alex.csci_490_lab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by alex on 2/15/18.
 */

public class CourseAdapter extends BaseAdapter {
    private Context mContext;
    private LayoutInflater mInflater;
    private ArrayList<Course> courseList;


    //public CourseAdapter(Context context, )
  @Override
  public int getCount(){


  }

  public View getView(int position, View view, ViewGroup viewGroup){
      View rowView = mInflater.inflate(android.R.layout.simple_expandable_list_item_2, viewGroup, false);

      TextView courseNumberView = rowView.findViewById(android.R.id.text1);
      TextView courseNameView = rowView.findViewById(android.R.id.)
  }
}
