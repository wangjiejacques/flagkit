package com.a36kyun.flagkit;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/**
 * Created by wangjie on 4/22/16.
 */
public class FlagKit {
    public static Drawable drawableWithFlag(Context context, String flagName) {
        Resources res =  context.getResources();
        int resourceId = res.getIdentifier(flagName, "drawable", context.getPackageName());
        return res.getDrawable(resourceId);
    }
}
