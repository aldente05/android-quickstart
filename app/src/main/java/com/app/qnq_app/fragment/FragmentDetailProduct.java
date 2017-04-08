package com.app.qnq_app.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.qnq_app.R;

/**
 * Created by alsahfer on 4/3/17.
 */

public class FragmentDetailProduct extends Fragment {

    private static final String KEY_TITLE = "key_title";

    public FragmentDetailProduct() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment.
     *
     * @return A new instance of fragment FragmentDetailProduct.
     */
    public static FragmentDetailProduct newInstance(String titleView) {
        FragmentDetailProduct fragmentDetailProduct = new FragmentDetailProduct();
        Bundle args = new Bundle();
        args.putString(KEY_TITLE, titleView);
        fragmentDetailProduct.setArguments(args);

        return fragmentDetailProduct;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_product, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
