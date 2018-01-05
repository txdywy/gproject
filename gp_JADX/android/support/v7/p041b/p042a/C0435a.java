package android.support.v7.p041b.p042a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.p013b.C0268a;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0403j;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class C0435a {
    public static ColorStateList m2647a(Resources resources, XmlPullParser xmlPullParser, Theme theme) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return C0435a.m2648a(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static ColorStateList m2648a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        Object obj;
        int depth = xmlPullParser.getDepth() + 1;
        Object obj2 = new int[20][];
        int i = 0;
        Object obj3 = new int[20];
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            } else if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray obtainAttributes;
                int[] iArr = C0403j.ColorStateListItem;
                if (theme == null) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                } else {
                    obtainAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                }
                int color = obtainAttributes.getColor(C0403j.ColorStateListItem_android_color, -65281);
                float f = 1.0f;
                if (obtainAttributes.hasValue(C0403j.ColorStateListItem_android_alpha)) {
                    f = obtainAttributes.getFloat(C0403j.ColorStateListItem_android_alpha, 1.0f);
                } else if (obtainAttributes.hasValue(C0403j.ColorStateListItem_alpha)) {
                    f = obtainAttributes.getFloat(C0403j.ColorStateListItem_alpha, 1.0f);
                }
                obtainAttributes.recycle();
                int i2 = 0;
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i3 = 0;
                while (i3 < attributeCount) {
                    next = attributeSet.getAttributeNameResource(i3);
                    if (next == 16843173 || next == 16843551 || next == C0394a.alpha) {
                        next = i2;
                    } else {
                        int i4 = i2 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                            next = -next;
                        }
                        iArr2[i2] = next;
                        next = i4;
                    }
                    i3++;
                    i2 = next;
                }
                int[] trimStateSet = StateSet.trimStateSet(iArr2, i2);
                depth2 = C0268a.m1543c(color, Math.round(((float) Color.alpha(color)) * f));
                if (i + 1 > obj3.length) {
                    obj = new int[C0438d.m2653a(i)];
                    System.arraycopy(obj3, 0, obj, 0, i);
                } else {
                    obj = obj3;
                }
                obj[i] = depth2;
                if (i + 1 > obj2.length) {
                    obj3 = (Object[]) Array.newInstance(obj2.getClass().getComponentType(), C0438d.m2653a(i));
                    System.arraycopy(obj2, 0, obj3, 0, i);
                } else {
                    obj3 = obj2;
                }
                obj3[i] = trimStateSet;
                i++;
                obj2 = (int[][]) obj3;
                obj3 = obj;
            }
        }
        obj = new int[i];
        Object obj4 = new int[i][];
        System.arraycopy(obj3, 0, obj, 0, i);
        System.arraycopy(obj2, 0, obj4, 0, i);
        return new ColorStateList(obj4, obj);
    }
}
