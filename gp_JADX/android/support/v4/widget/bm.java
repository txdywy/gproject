package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.TextView;
import java.lang.reflect.Field;

public class bm {
    public static Field f2113a;
    public static boolean f2114b;
    public static Field f2115c;
    public static boolean f2116d;

    bm() {
    }

    public void mo478a(TextView textView, Drawable drawable) {
        textView.setCompoundDrawables(drawable, null, null, null);
    }

    public void mo479a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    public void mo477a(TextView textView, int i) {
        textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    private static Field m2224a(String str) {
        Field field = null;
        try {
            field = TextView.class.getDeclaredField(str);
            field.setAccessible(true);
            return field;
        } catch (NoSuchFieldException e) {
            Log.e("TextViewCompatBase", "Could not retrieve " + str + " field.");
            return field;
        }
    }

    private static int m2223a(Field field, TextView textView) {
        try {
            return field.getInt(textView);
        } catch (IllegalAccessException e) {
            Log.d("TextViewCompatBase", "Could not retrieve value of " + field.getName() + " field.");
            return -1;
        }
    }

    public int mo476a(TextView textView) {
        if (!f2116d) {
            f2115c = m2224a("mMaxMode");
            f2116d = true;
        }
        if (f2115c != null && m2223a(f2115c, textView) == 1) {
            if (!f2114b) {
                f2113a = m2224a("mMaximum");
                f2114b = true;
            }
            if (f2113a != null) {
                return m2223a(f2113a, textView);
            }
        }
        return -1;
    }

    public void mo481b(TextView textView, int i) {
        textView.setTextAppearance(textView.getContext(), i);
    }

    public Drawable[] mo480b(TextView textView) {
        return textView.getCompoundDrawables();
    }
}
