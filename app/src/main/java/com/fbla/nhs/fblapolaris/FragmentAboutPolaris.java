package com.fbla.nhs.fblapolaris;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by EricY on 11/28/2017.
 */

public class FragmentAboutPolaris extends Fragment {
    @Nullable

    View myView;
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        myView = inflater.inflate(R.layout.about_polaris, container, false);
        return myView;
    }
}
