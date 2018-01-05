package android.support.v4.p013b;

import android.graphics.Path;
import java.util.ArrayList;

public final class C0269b {
    static float[] m1549a(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i2 = i + 0;
        length = Math.min(i2, length + 0);
        Object obj = new float[i2];
        System.arraycopy(fArr, 0, obj, 0, length);
        return obj;
    }

    public static Path m1546a(String str) {
        Path path = new Path();
        C0271d[] b = C0269b.m1551b(str);
        if (b == null) {
            return null;
        }
        try {
            C0271d.m1555a(b, path);
            return path;
        } catch (Throwable e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    public static C0271d[] m1551b(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int a = C0269b.m1545a(str, i);
            String trim = str.substring(i2, a).trim();
            if (trim.length() > 0) {
                C0269b.m1547a(arrayList, trim.charAt(0), C0269b.m1552c(trim));
            }
            i = a + 1;
            i2 = a;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            C0269b.m1547a(arrayList, str.charAt(i2), new float[0]);
        }
        return (C0271d[]) arrayList.toArray(new C0271d[arrayList.size()]);
    }

    public static C0271d[] m1550a(C0271d[] c0271dArr) {
        if (c0271dArr == null) {
            return null;
        }
        C0271d[] c0271dArr2 = new C0271d[c0271dArr.length];
        for (int i = 0; i < c0271dArr.length; i++) {
            c0271dArr2[i] = new C0271d(c0271dArr[i]);
        }
        return c0271dArr2;
    }

    public static boolean m1548a(C0271d[] c0271dArr, C0271d[] c0271dArr2) {
        if (c0271dArr == null || c0271dArr2 == null || c0271dArr.length != c0271dArr2.length) {
            return false;
        }
        int i = 0;
        while (i < c0271dArr.length) {
            if (c0271dArr[i].f1644a != c0271dArr2[i].f1644a || c0271dArr[i].f1645b.length != c0271dArr2[i].f1645b.length) {
                return false;
            }
            i++;
        }
        return true;
    }

    private static int m1545a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 65) * (charAt - 90) <= 0 || (charAt - 97) * (charAt - 122) <= 0) && charAt != 'e' && charAt != 'E') {
                break;
            }
            i++;
        }
        return i;
    }

    private static void m1547a(ArrayList arrayList, char c, float[] fArr) {
        arrayList.add(new C0271d(c, fArr));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float[] m1552c(java.lang.String r13) {
        /*
        r3 = 1;
        r2 = 0;
        r0 = r13.charAt(r2);
        r1 = 122; // 0x7a float:1.71E-43 double:6.03E-322;
        if (r0 == r1) goto L_0x0012;
    L_0x000a:
        r0 = r13.charAt(r2);
        r1 = 90;
        if (r0 != r1) goto L_0x0015;
    L_0x0012:
        r0 = new float[r2];
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = r13.length();	 Catch:{ NumberFormatException -> 0x008a }
        r8 = new float[r0];	 Catch:{ NumberFormatException -> 0x008a }
        r9 = new android.support.v4.b.c;	 Catch:{ NumberFormatException -> 0x008a }
        r9.<init>();	 Catch:{ NumberFormatException -> 0x008a }
        r10 = r13.length();	 Catch:{ NumberFormatException -> 0x008a }
        r7 = r3;
        r1 = r2;
    L_0x0026:
        if (r7 >= r10) goto L_0x0085;
    L_0x0028:
        r0 = 0;
        r9.f1643b = r0;	 Catch:{ NumberFormatException -> 0x008a }
        r5 = r2;
        r0 = r2;
        r4 = r2;
        r6 = r7;
    L_0x002f:
        r11 = r13.length();	 Catch:{ NumberFormatException -> 0x008a }
        if (r6 >= r11) goto L_0x0068;
    L_0x0035:
        r11 = r13.charAt(r6);	 Catch:{ NumberFormatException -> 0x008a }
        switch(r11) {
            case 32: goto L_0x0048;
            case 44: goto L_0x0048;
            case 45: goto L_0x004c;
            case 46: goto L_0x0057;
            case 69: goto L_0x0064;
            case 101: goto L_0x0064;
            default: goto L_0x003c;
        };	 Catch:{ NumberFormatException -> 0x008a }
    L_0x003c:
        r5 = r4;
        r4 = r0;
        r0 = r2;
    L_0x003f:
        if (r5 != 0) goto L_0x0068;
    L_0x0041:
        r6 = r6 + 1;
        r12 = r0;
        r0 = r4;
        r4 = r5;
        r5 = r12;
        goto L_0x002f;
    L_0x0048:
        r4 = r0;
        r5 = r3;
        r0 = r2;
        goto L_0x003f;
    L_0x004c:
        if (r6 == r7) goto L_0x003c;
    L_0x004e:
        if (r5 != 0) goto L_0x003c;
    L_0x0050:
        r4 = 1;
        r9.f1643b = r4;	 Catch:{ NumberFormatException -> 0x008a }
        r4 = r0;
        r5 = r3;
        r0 = r2;
        goto L_0x003f;
    L_0x0057:
        if (r0 != 0) goto L_0x005d;
    L_0x0059:
        r0 = r2;
        r5 = r4;
        r4 = r3;
        goto L_0x003f;
    L_0x005d:
        r4 = 1;
        r9.f1643b = r4;	 Catch:{ NumberFormatException -> 0x008a }
        r4 = r0;
        r5 = r3;
        r0 = r2;
        goto L_0x003f;
    L_0x0064:
        r5 = r4;
        r4 = r0;
        r0 = r3;
        goto L_0x003f;
    L_0x0068:
        r9.f1642a = r6;	 Catch:{ NumberFormatException -> 0x008a }
        r4 = r9.f1642a;	 Catch:{ NumberFormatException -> 0x008a }
        if (r7 >= r4) goto L_0x00a6;
    L_0x006e:
        r0 = r1 + 1;
        r5 = r13.substring(r7, r4);	 Catch:{ NumberFormatException -> 0x008a }
        r5 = java.lang.Float.parseFloat(r5);	 Catch:{ NumberFormatException -> 0x008a }
        r8[r1] = r5;	 Catch:{ NumberFormatException -> 0x008a }
    L_0x007a:
        r1 = r9.f1643b;	 Catch:{ NumberFormatException -> 0x008a }
        if (r1 == 0) goto L_0x0081;
    L_0x007e:
        r7 = r4;
        r1 = r0;
        goto L_0x0026;
    L_0x0081:
        r7 = r4 + 1;
        r1 = r0;
        goto L_0x0026;
    L_0x0085:
        r0 = android.support.v4.p013b.C0269b.m1549a(r8, r1);	 Catch:{ NumberFormatException -> 0x008a }
        goto L_0x0014;
    L_0x008a:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r3 = "error in parsing \"";
        r2.<init>(r3);
        r2 = r2.append(r13);
        r3 = "\"";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r1.<init>(r2, r0);
        throw r1;
    L_0x00a6:
        r0 = r1;
        goto L_0x007a;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.b.b.c(java.lang.String):float[]");
    }
}
