package com.app.qnq_app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.qnq_app.R;

/**
 * Created by f.putra on 4/2/17.
 */

public class FragmentCheckout extends Fragment {

    private static final String KEY_TITLE = "key_title";

    public FragmentCheckout() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment.
     *
     * @return A new instance of fragment FragmentHome.
     */
    public static FragmentCheckout newInstance(String titleView) {
        FragmentCheckout fragmentCheckout = new FragmentCheckout();
        Bundle args = new Bundle();
        args.putString(KEY_TITLE, titleView);
        fragmentCheckout.setArguments(args);

        return fragmentCheckout;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_checkout, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
