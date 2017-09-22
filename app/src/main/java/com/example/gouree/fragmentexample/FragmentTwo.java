package com.example.gouree.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by omsai on 22/09/2017.
 */

public class FragmentTwo extends Fragment
{
    TextView t1;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        //inflate the fragment
        View view =inflater.inflate(R.layout.fargment2,container,false);
        t1 =(TextView)view.findViewById(R.id.textView);
        t1.setVisibility(view.GONE);
        return view;
    }

    //set the textview value to val passed
    public  void updateInfo(String val)
    {
    t1.setText(val);
        t1.setVisibility(View.VISIBLE);
    }
}
