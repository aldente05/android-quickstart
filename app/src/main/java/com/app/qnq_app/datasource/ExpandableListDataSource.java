package com.app.qnq_app.datasource;

import android.content.Context;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by f.putra on 04/04/2017.
 */
public class ExpandableListDataSource {

    /**
     * Returns fake data
     *
     * @param context
     * @return
     */
    public static HashMap<String, List<String>> getData(Context context) {
        HashMap<String, List<String>> expandableListData = new LinkedHashMap<String, List<String>>();

        List<String> menu1 = new ArrayList<String>();
        List<String> menu3 = new ArrayList<String>();
        List<String> menu4 = new ArrayList<String>();
        List<String> menu5 = new ArrayList<String>();
        List<String> menu6 = new ArrayList<String>();
        List<String> menu7 = new ArrayList<String>();
        List<String> menu8 = new ArrayList<String>();

        List<String> listSubMenu = new ArrayList<String>();
        listSubMenu.add("Submenu 1");
        listSubMenu.add("Submenu 2");

        expandableListData.put("HOME", menu1);
        expandableListData.put("PRODUCTS", listSubMenu);
        expandableListData.put("CUSTOMER CARE", menu3);
        expandableListData.put("MY ACCOUNT", menu4);
        expandableListData.put("WISHLIST", menu5);
        expandableListData.put("CART", menu6);
        expandableListData.put("CHECKOUT", menu7);
        expandableListData.put("LOGOUT", menu8);

        return expandableListData;
    }
}
