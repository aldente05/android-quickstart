package com.app.qnq_app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.qnq_app.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentWishlist#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentWishlist extends Fragment {

    private static final String KEY_TITLE = "key_title";

    public FragmentWishlist() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment.
     *
     * @return A new instance of fragment FragmentWishlist.
     */
    public static FragmentWishlist newInstance(String titleView) {
        FragmentWishlist fragmentWishlist = new FragmentWishlist();
        Bundle args = new Bundle();
        args.putString(KEY_TITLE, titleView);
        fragmentWishlist.setArguments(args);

        return fragmentWishlist;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_wishlist, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
