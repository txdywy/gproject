package android.support.design.p023e;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.support.v4.p013b.C0268a;
import android.util.StateSet;
import com.squareup.haha.perflib.HprofParser;

public final class C0122a {
    public static final boolean f456a = (VERSION.SDK_INT >= 21);
    public static final int[] f457b = new int[]{16842919};
    public static final int[] f458c = new int[]{16843623, 16842908};
    public static final int[] f459d = new int[]{16842908};
    public static final int[] f460e = new int[]{16843623};
    public static final int[] f461f = new int[]{16842912, 16842919};
    public static final int[] f462g = new int[]{16842912, 16843623, 16842908};
    public static final int[] f463h = new int[]{16842912, 16842908};
    public static final int[] f464i = new int[]{16842912, 16843623};
    public static final int[] f465j = new int[]{16842912};

    public static ColorStateList m235a(ColorStateList colorStateList, ColorStateList colorStateList2) {
        if (f456a) {
            int[][] iArr = new int[2][];
            r2 = new int[2];
            int a = C0122a.m233a(C0122a.m234a(colorStateList, f465j), C0122a.m237b(colorStateList2, f461f));
            iArr[0] = f465j;
            r2[0] = a;
            a = C0122a.m233a(C0122a.m234a(colorStateList, StateSet.NOTHING), C0122a.m237b(colorStateList2, f457b));
            iArr[1] = StateSet.NOTHING;
            r2[1] = a;
            return new ColorStateList(iArr, r2);
        }
        int[][] iArr2 = new int[10][];
        int[] iArr3 = new int[10];
        C0122a.m236a(f461f, colorStateList, colorStateList2, 0, iArr2, iArr3);
        C0122a.m236a(f462g, colorStateList, colorStateList2, 1, iArr2, iArr3);
        C0122a.m236a(f463h, colorStateList, colorStateList2, 2, iArr2, iArr3);
        C0122a.m236a(f464i, colorStateList, colorStateList2, 3, iArr2, iArr3);
        iArr2[4] = f465j;
        iArr3[4] = 0;
        C0122a.m236a(f457b, colorStateList, colorStateList2, 5, iArr2, iArr3);
        C0122a.m236a(f458c, colorStateList, colorStateList2, 6, iArr2, iArr3);
        C0122a.m236a(f459d, colorStateList, colorStateList2, 7, iArr2, iArr3);
        C0122a.m236a(f460e, colorStateList, colorStateList2, 8, iArr2, iArr3);
        iArr2[9] = StateSet.NOTHING;
        iArr3[9] = 0;
        return new ColorStateList(iArr2, iArr3);
    }

    private static void m236a(int[] iArr, ColorStateList colorStateList, ColorStateList colorStateList2, int i, int[][] iArr2, int[] iArr3) {
        iArr2[i] = iArr;
        iArr3[i] = C0122a.m233a(C0122a.m234a(colorStateList, iArr), C0122a.m237b(colorStateList2, iArr));
    }

    private static int m234a(ColorStateList colorStateList, int[] iArr) {
        if (colorStateList != null) {
            return colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        }
        return 0;
    }

    private static int m237b(ColorStateList colorStateList, int[] iArr) {
        if (colorStateList != null) {
            return Color.alpha(colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()));
        }
        return HprofParser.ROOT_UNKNOWN;
    }

    private static int m233a(int i, int i2) {
        if (f456a) {
            i2 = Math.min(i2 * 2, HprofParser.ROOT_UNKNOWN);
        }
        return C0268a.m1543c(i, (int) ((((float) i2) / 255.0f) * ((float) Color.alpha(i))));
    }
}
