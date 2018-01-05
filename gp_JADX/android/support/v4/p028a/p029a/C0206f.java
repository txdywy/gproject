package android.support.v4.p028a.p029a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p013b.C0272e;
import android.util.Log;
import android.util.TypedValue;

public final class C0206f {
    public static Drawable m1065a(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i, theme);
        }
        return resources.getDrawable(i);
    }

    public static int m1066b(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT >= 23) {
            return resources.getColor(i, theme);
        }
        return resources.getColor(i);
    }

    public static Typeface m1064a(Context context, Resources resources, TypedValue typedValue, int i, int i2, C0207g c0207g) {
        if (typedValue.string == null) {
            throw new NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence = typedValue.string.toString();
        if (charSequence.startsWith("res/")) {
            Typeface typeface = (Typeface) C0272e.f1647b.m1692a(C0272e.m1559a(resources, i, i2));
            if (typeface != null) {
                c0207g.m1069a(typeface, null);
                return typeface;
            }
            try {
                if (charSequence.toLowerCase().endsWith(".xml")) {
                    C0202b a = C0201a.m1058a(resources.getXml(i), resources);
                    if (a != null) {
                        return C0272e.m1558a(context, a, resources, i, i2, c0207g);
                    }
                    Log.e("ResourcesCompat", "Failed to find font-family tag");
                    c0207g.m1070a(null);
                    return null;
                }
                typeface = C0272e.m1557a(context, resources, i, charSequence, i2);
                if (typeface != null) {
                    c0207g.m1069a(typeface, null);
                    return typeface;
                }
                c0207g.m1070a(null);
                return typeface;
            } catch (Throwable e) {
                Log.e("ResourcesCompat", "Failed to parse xml resource " + charSequence, e);
                c0207g.m1070a(null);
                return null;
            } catch (Throwable e2) {
                Log.e("ResourcesCompat", "Failed to read xml resource " + charSequence, e2);
                c0207g.m1070a(null);
                return null;
            }
        }
        c0207g.m1070a(null);
        return null;
    }
}
