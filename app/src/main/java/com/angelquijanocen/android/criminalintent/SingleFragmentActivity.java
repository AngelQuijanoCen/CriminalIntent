package com.angelquijanocen.android.criminalintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public abstract class SingleFragmentActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.Id.fragment_container);
        if (fragment == null) {
        fragment = createFragment();
        fm.beginTransaction()
          .add(R.Id.fragment_container, fragment)
          .commit();
        }
    }

    protected abstract Fragment createFragment ();
}
