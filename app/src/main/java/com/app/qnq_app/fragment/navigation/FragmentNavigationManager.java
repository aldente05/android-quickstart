package com.app.qnq_app.fragment.navigation;

import android.annotation.SuppressLint;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.app.qnq_app.BuildConfig;
import com.app.qnq_app.MainActivity;
import com.app.qnq_app.R;
import com.app.qnq_app.fragment.FragmentAccount;
import com.app.qnq_app.fragment.FragmentCart;
import com.app.qnq_app.fragment.FragmentCheckout;
import com.app.qnq_app.fragment.FragmentCustomerCare;
import com.app.qnq_app.fragment.FragmentDetailProduct;
import com.app.qnq_app.fragment.FragmentHome;
import com.app.qnq_app.fragment.FragmentProducts;
import com.app.qnq_app.fragment.FragmentWishlist;


/**
 * @author f.putra
 */

public class FragmentNavigationManager implements NavigationManager {

    private static FragmentNavigationManager sInstance;

    private FragmentManager mFragmentManager;
    private MainActivity mActivity;

    public static FragmentNavigationManager obtain(MainActivity activity) {
        if (sInstance == null) {
            sInstance = new FragmentNavigationManager();
        }
        sInstance.configure(activity);
        return sInstance;
    }

    private void configure(MainActivity activity) {
        mActivity = activity;
        mFragmentManager = mActivity.getSupportFragmentManager();
    }

    @Override
    public void showFragmentHome(String title) {
        showFragment(FragmentHome.newInstance(title), false);
    }

    @Override
    public void showFragmentProduct(String title) {
        showFragment(FragmentProducts.newInstance(title), false);
    }

    @Override
    public void showFragmentCustomerCare(String title) {
        showFragment(FragmentCustomerCare.newInstance(title), false);
    }

    @Override
    public void showFragmentAccount(String title) {
        showFragment(FragmentAccount.newInstance(title), false);
    }

    @Override
    public void showFragmentWishlist(String title) {
        showFragment(FragmentWishlist.newInstance(title), false);
    }

    @Override
    public void showFragmentCart(String title) {
        showFragment(FragmentCart.newInstance(title), false);
    }

    @Override
    public void showFragmentCheckOut(String title) {
        showFragment(FragmentCheckout.newInstance(title), false);
    }

    @Override
    public void showFragmentDetailProduct(String title) {
        showFragment(FragmentDetailProduct.newInstance(title), false);
    }

    private void showFragment(Fragment fragment, boolean allowStateLoss) {
        FragmentManager fm = mFragmentManager;

        @SuppressLint("CommitTransaction")
        FragmentTransaction ft = fm.beginTransaction()
                .replace(R.id.container, fragment);

        ft.addToBackStack(null);

        if (allowStateLoss || !BuildConfig.DEBUG) {
            ft.commitAllowingStateLoss();
        } else {
            ft.commit();
        }

        fm.executePendingTransactions();
    }
}
