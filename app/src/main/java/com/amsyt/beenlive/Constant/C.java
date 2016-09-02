package com.amsyt.beenlive.Constant;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by amsyt005 on 1/9/16.
 */

public class C {


    //	geting custom typeface Regular
    public static Typeface getAvenirProRegularFontTypeface(Context ctx) {
        Typeface font = Typeface.createFromAsset(ctx.getAssets(),"font/AvenirNextLTPro-Regular.otf");
        return font;
    }




    //	getting the parent of a view
    public static ViewGroup getParentView(View v) {
        ViewGroup vg = null;
        if (v != null) {
            vg = (ViewGroup) v.getRootView();
        }
        return vg;

    }
    //	apply typeface for all child views tetxview,button,edittext.
    public static void applyTypeface(ViewGroup v, Typeface f) {

        if (v != null) {

            int vgCount = v.getChildCount();
            for (int i = 0; i < vgCount; i++) {
                if (v.getChildAt(i) == null)
                    continue;
                if (v.getChildAt(i) instanceof ViewGroup) {
                    applyTypeface((ViewGroup) v.getChildAt(i), f);
                } else {
                    View view = v.getChildAt(i);
                    if (view instanceof TextView) {
                        ((TextView) (view)).setTypeface(f);
                    } else if (view instanceof Button) {
                        ((Button) (view)).setTypeface(f);
                    } else if (view instanceof EditText) {
                        ((EditText) (view)).setTypeface(f);
                    }
                }
            }
        }
    }

}
