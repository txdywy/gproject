package android.support.v4.p028a.p029a;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.p009a.C0024b;
import android.support.v4.p035f.C0287a;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class C0201a {
    public static C0202b m1058a(XmlPullParser xmlPullParser, Resources resources) {
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
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return C0201a.m1062b(xmlPullParser, resources);
        }
        C0201a.m1061a(xmlPullParser);
        return null;
    }

    private static C0202b m1062b(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0024b.FontFamily);
        String string = obtainAttributes.getString(C0024b.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C0024b.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C0024b.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C0024b.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C0024b.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C0024b.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            List arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(C0201a.m1063c(xmlPullParser, resources));
                    } else {
                        C0201a.m1061a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0203c((C0204d[]) arrayList.toArray(new C0204d[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            C0201a.m1061a(xmlPullParser);
        }
        return new C0205e(new C0287a(string, string2, string3, C0201a.m1059a(resources, resourceId)), integer, integer2);
    }

    public static List m1059a(Resources resources, int i) {
        List list = null;
        if (i != 0) {
            TypedArray obtainTypedArray = resources.obtainTypedArray(i);
            if (obtainTypedArray.length() > 0) {
                List arrayList = new ArrayList();
                if ((obtainTypedArray.getResourceId(0, 0) != 0 ? 1 : 0) != 0) {
                    for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                        arrayList.add(C0201a.m1060a(resources.getStringArray(obtainTypedArray.getResourceId(i2, 0))));
                    }
                    list = arrayList;
                } else {
                    arrayList.add(C0201a.m1060a(resources.getStringArray(i)));
                    list = arrayList;
                }
            }
            obtainTypedArray.recycle();
        }
        return list != null ? list : Collections.emptyList();
    }

    private static List m1060a(String[] strArr) {
        List arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    private static C0204d m1063c(XmlPullParser xmlPullParser, Resources resources) {
        boolean z;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C0024b.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C0024b.FontFamilyFont_fontWeight) ? C0024b.FontFamilyFont_fontWeight : C0024b.FontFamilyFont_android_fontWeight, 400);
        if (1 == obtainAttributes.getInt(obtainAttributes.hasValue(C0024b.FontFamilyFont_fontStyle) ? C0024b.FontFamilyFont_fontStyle : C0024b.FontFamilyFont_android_fontStyle, 0)) {
            z = true;
        } else {
            z = false;
        }
        int i2 = obtainAttributes.hasValue(C0024b.FontFamilyFont_font) ? C0024b.FontFamilyFont_font : C0024b.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i2, 0);
        String string = obtainAttributes.getString(i2);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            C0201a.m1061a(xmlPullParser);
        }
        return new C0204d(string, i, z, resourceId);
    }

    private static void m1061a(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                case 2:
                    i++;
                    break;
                case 3:
                    i--;
                    break;
                default:
                    break;
            }
        }
    }
}
