package com.example.gouree.fragmentexample;

import android.app.Activity;
import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//implement the interface
public class MainActivity extends Activity implements OnNameSetListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override

    //create an instance of fragmenttwo and invoke method fragment class and pass value using interface method
    public void setName(String value)
    {
        FragmentTwo f2 = (FragmentTwo)getFragmentManager().findFragmentById(R.id.frag2);
        f2.updateInfo(value);
    }
}
