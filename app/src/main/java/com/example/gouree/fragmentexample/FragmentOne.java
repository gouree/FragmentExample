package com.example.gouree.fragmentexample;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by omsai on 22/09/2017.
 */

//fragmentone extends fragment and implements onNameSetListner
public class FragmentOne extends Fragment implements OnNameSetListener
{
    //instances of button, edittext and interface
    EditText e1;
    Button b1;
    OnNameSetListener onNameSetListener;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState)
    {
        View view =inflater.inflate(R.layout.fragment1,container,false);
         e1 =(EditText)view.findViewById(R.id.editText2);
         b1 =(Button)view.findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //on click of button extract the number from edit text and store it in string variable val
                String val = e1.getText().toString();

                //pass the number using interface method setname
                onNameSetListener.setName(val);
                Toast.makeText(getActivity(),"Submitted value to Fragment 2", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }



    //onAttach method to attach activity with interface using fragment
    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);

        try
        {
            onNameSetListener = (OnNameSetListener) activity;
        }
        catch(Exception e)
        {

        }
    }

    @Override
    public void setName(String value) {

    }
}

