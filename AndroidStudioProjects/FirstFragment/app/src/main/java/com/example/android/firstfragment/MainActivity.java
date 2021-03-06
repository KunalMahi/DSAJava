package com.example.android.firstfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String FRAGMENT_TAG="fragment_tag";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         }

    public void clickHandler(View view) {
        String message="Passed to factory method";
        BlankFragment fragment = BlankFragment.newInstance(message);
        getSupportFragmentManager().beginTransaction().addToBackStack(null).add(R.id.fragment_container,fragment,FRAGMENT_TAG).commit();
    }

    public void removeClickHandler(View view) {

        Fragment fragment=getSupportFragmentManager().findFragmentByTag(FRAGMENT_TAG);
        if(fragment!=null)
        {
            getSupportFragmentManager().beginTransaction().remove(fragment).commit();
        }
    }
}