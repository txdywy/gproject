package android.support.v4.p028a.p029a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public final class C0210j {
    public static boolean m1076a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static float m1071a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !C0210j.m1076a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int m1073a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !C0210j.m1076a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static int m1077b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !C0210j.m1076a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }

    public static int m1072a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (C0210j.m1076a(xmlPullParser, str)) {
            return typedArray.getResourceId(i, 0);
        }
        return 0;
    }

    public static String m1078b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (C0210j.m1076a(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static TypedValue m1075a(TypedArray typedArray, XmlPullParser xmlPullParser, String str) {
        if (C0210j.m1076a(xmlPullParser, str)) {
            return typedArray.peekValue(0);
        }
        return null;
    }

    public static TypedArray m1074a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
