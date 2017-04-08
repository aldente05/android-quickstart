package com.app.qnq_app.util;


import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by f.putra on 17/3/17.
 */
public class FontManager {

    public static final String ROOT = "fonts/",
            FONTAWESOME = ROOT + "fontawesome-webfont.ttf";

    public static Typeface getTypeface(Context context, String font) {
        return Typeface.createFromAsset(context.getAssets(), font);
    }
}
