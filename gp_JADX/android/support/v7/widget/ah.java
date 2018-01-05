package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.support.p011c.p012a.C0045b;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

final class ah implements aj {
    ah() {
    }

    public final Drawable mo751a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        try {
            Resources resources = context.getResources();
            Drawable c0045b = new C0045b(context);
            c0045b.inflate(resources, xmlPullParser, attributeSet, theme);
            return c0045b;
        } catch (Throwable e) {
            Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
            return null;
        }
    }
}
