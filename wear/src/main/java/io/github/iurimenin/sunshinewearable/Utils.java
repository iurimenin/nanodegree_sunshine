package io.github.iurimenin.sunshinewearable;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Created by Iuri Menin on 08/05/17.
 */

public class Utils {

    public static float convertDpToPixel(float dp) {
        //Resources resources = context.getResources();
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        float px = dp * ((float) metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
        return px;
    }

    public static float convertPixelsToDp(float px) {
        //Resources resources = context.getResources();
        DisplayMetrics metrics = Resources.getSystem().getDisplayMetrics();
        float dp = px / ((float) metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
        return dp;
    }
}
