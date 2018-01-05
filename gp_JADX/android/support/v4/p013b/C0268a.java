package android.support.v4.p013b;

import android.graphics.Color;
import com.squareup.haha.perflib.HprofParser;

public final class C0268a {
    public static final ThreadLocal f1641a = new ThreadLocal();

    public static int m1540a(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - (((255 - alpha) * (255 - alpha2)) / HprofParser.ROOT_UNKNOWN);
        return Color.argb(i3, C0268a.m1541a(Color.red(i), alpha2, Color.red(i2), alpha, i3), C0268a.m1541a(Color.green(i), alpha2, Color.green(i2), alpha, i3), C0268a.m1541a(Color.blue(i), alpha2, Color.blue(i2), alpha, i3));
    }

    private static int m1541a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        return (((i * HprofParser.ROOT_UNKNOWN) * i2) + ((i3 * i4) * (255 - i2))) / (i5 * HprofParser.ROOT_UNKNOWN);
    }

    public static double m1539a(int i) {
        double[] dArr = (double[]) f1641a.get();
        if (dArr == null) {
            dArr = new double[3];
            f1641a.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = ((double) red) / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        d = ((double) green) / 255.0d;
        double pow2 = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        d = ((double) blue) / 255.0d;
        d = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        dArr[0] = 100.0d * (((0.4124d * pow) + (0.3576d * pow2)) + (0.1805d * d));
        dArr[1] = 100.0d * (((0.2126d * pow) + (0.7152d * pow2)) + (0.0722d * d));
        dArr[2] = ((d * 0.9505d) + ((pow2 * 0.1192d) + (pow * 0.0193d))) * 100.0d;
        return dArr[1] / 100.0d;
    }

    private static double m1544d(int i, int i2) {
        if (Color.alpha(i2) != HprofParser.ROOT_UNKNOWN) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        }
        if (Color.alpha(i) < HprofParser.ROOT_UNKNOWN) {
            i = C0268a.m1540a(i, i2);
        }
        double a = C0268a.m1539a(i) + 0.05d;
        double a2 = C0268a.m1539a(i2) + 0.05d;
        return Math.max(a, a2) / Math.min(a, a2);
    }

    public static int m1542b(int i, int i2) {
        int i3 = 0;
        int i4 = HprofParser.ROOT_UNKNOWN;
        if (Color.alpha(i2) != HprofParser.ROOT_UNKNOWN) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i2));
        } else if (C0268a.m1544d(C0268a.m1543c(i, HprofParser.ROOT_UNKNOWN), i2) < 4.5d) {
            return -1;
        } else {
            int i5 = 0;
            while (i5 <= 10 && i4 - i3 > 1) {
                int i6 = (i3 + i4) / 2;
                if (C0268a.m1544d(C0268a.m1543c(i, i6), i2) >= 4.5d) {
                    i4 = i6;
                    i6 = i3;
                }
                i5++;
                i3 = i6;
            }
            return i4;
        }
    }

    public static int m1543c(int i, int i2) {
        if (i2 >= 0 && i2 <= HprofParser.ROOT_UNKNOWN) {
            return (16777215 & i) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }
}
