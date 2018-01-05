package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.p011c.p012a.C0054l;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

final class ak implements aj {
    ak() {
    }

    public final Drawable mo751a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        try {
            return C0054l.m67a(context.getResources(), xmlPullParser, attributeSet, theme);
        } catch (Throwable e) {
            Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
            return null;
        }
    }
}
