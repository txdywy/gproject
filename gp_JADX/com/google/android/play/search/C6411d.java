package com.google.android.play.search;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;

public final class C6411d extends al {
    public C6411d(Context context) {
        super(context);
    }

    private static C6410c[] m29435a(String str) {
        int length = str.length();
        char[] toCharArray = str.toCharArray();
        Object obj = new C6410c[length];
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            int i3;
            while (i2 < length && (toCharArray[i2] == ' ' || toCharArray[i2] == '\t' || toCharArray[i2] == '\"')) {
                i2++;
            }
            int i4 = i2;
            while (i4 < length && toCharArray[i4] != ' ' && toCharArray[i4] != '\t' && toCharArray[i4] != '\"') {
                i4++;
            }
            if (i2 != i4) {
                i3 = i + 1;
                obj[i] = new C6410c(toCharArray, i2, i4);
            } else {
                i3 = i;
            }
            i = i3;
            i2 = i4;
        }
        Object obj2 = new C6410c[i];
        System.arraycopy(obj, 0, obj2, 0, i);
        return obj2;
    }

    protected final /* synthetic */ CharSequence mo5430a(String str, String str2, int i, int i2) {
        int i3;
        int length;
        int i4;
        int i5;
        C6410c[] a = C6411d.m29435a(str.toLowerCase());
        C6410c[] a2 = C6411d.m29435a(str2);
        C6408a c6408a = new C6408a(a, a2);
        C6410c[] c6410cArr = c6408a.f32327a;
        C6410c[] c6410cArr2 = c6408a.f32328b;
        int length2 = c6410cArr.length;
        int length3 = c6410cArr2.length;
        int[][] iArr = c6408a.f32330d;
        int[][] iArr2 = c6408a.f32329c;
        for (i3 = 1; i3 <= length2; i3++) {
            C6410c c6410c = c6410cArr[i3 - 1];
            for (int i6 = 1; i6 <= length3; i6++) {
                Object obj;
                int i7;
                C6410c c6410c2 = c6410cArr2[i6 - 1];
                length = c6410c.length();
                if (length > c6410c2.length()) {
                    obj = null;
                } else {
                    i4 = c6410c.f32351b;
                    i7 = c6410c2.f32351b;
                    char[] cArr = c6410c.f32350a;
                    char[] cArr2 = c6410c2.f32350a;
                    for (i5 = 0; i5 < length; i5++) {
                        if (Character.toLowerCase(cArr[i4 + i5]) != Character.toLowerCase(cArr2[i7 + i5])) {
                            obj = null;
                            break;
                        }
                    }
                    obj = 1;
                }
                i5 = obj != null ? 0 : 1;
                i4 = iArr[i3 - 1][i6] + 1;
                length = 0;
                i7 = iArr[i3][i6 - 1];
                if (i7 + 1 < i4) {
                    i4 = i7 + 1;
                    length = 1;
                }
                i7 = iArr[i3 - 1][i6 - 1];
                if (i7 + i5 < i4) {
                    i4 = i7 + i5;
                    i5 = i5 == 0 ? 3 : 2;
                } else {
                    i5 = length;
                }
                iArr[i3][i6] = i4;
                iArr2[i3][i6] = i5;
            }
        }
        i4 = a2.length;
        int[] iArr3 = new int[i4];
        length = c6408a.f32328b.length;
        C6409b[] c6409bArr = new C6409b[length];
        i5 = c6408a.f32327a.length;
        int[][] iArr4 = c6408a.f32329c;
        while (length > 0) {
            int i8 = iArr4[i5][length];
            switch (i8) {
                case 0:
                    i5--;
                    break;
                case 1:
                    length--;
                    c6409bArr[length] = new C6409b(i8, i5);
                    break;
                case 2:
                case 3:
                    length--;
                    i5--;
                    c6409bArr[length] = new C6409b(i8, i5);
                    break;
                default:
                    break;
            }
        }
        for (i5 = 0; i5 < i4; i5++) {
            if (c6409bArr[i5].f32348a == 3) {
                iArr3[i5] = c6409bArr[i5].f32349b;
            } else {
                iArr3[i5] = -1;
            }
        }
        Spannable spannableString = new SpannableString(str2);
        i3 = iArr3.length;
        for (length = 0; length < i3; length++) {
            C6410c c6410c3 = a2[length];
            i5 = 0;
            i8 = iArr3[length];
            if (i8 >= 0) {
                i5 = a[i8].length();
            }
            m29433a(i2, spannableString, c6410c3.f32351b + i5, c6410c3.f32352c);
            m29433a(i, spannableString, c6410c3.f32351b, i5 + c6410c3.f32351b);
        }
        return spannableString;
    }
}
