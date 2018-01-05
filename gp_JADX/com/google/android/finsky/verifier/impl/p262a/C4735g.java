package com.google.android.finsky.verifier.impl.p262a;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.verifier.p259a.p260a.C4712p;
import com.google.android.finsky.verifier.p259a.p260a.C4713q;

public final class C4735g {
    public final int f24364a;
    public final String f24365b;
    public final Uri f24366c;
    public final byte[] f24367d;
    public final boolean f24368e;
    public final int f24369f;
    public final String f24370g;
    public final boolean f24371h;
    public final boolean f24372i;
    public final boolean f24373j;
    public final boolean f24374k;
    public final String[] f24375l;

    public C4735g(int i, String str, Uri uri, byte[] bArr, boolean z, int i2, String str2, boolean z2, boolean z3, String[] strArr) {
        this.f24364a = i;
        this.f24365b = str;
        this.f24366c = uri;
        this.f24367d = bArr;
        this.f24368e = z;
        this.f24369f = i2;
        this.f24370g = str2;
        this.f24371h = z2;
        this.f24372i = z3;
        this.f24375l = strArr;
        this.f24373j = false;
        this.f24374k = false;
    }

    public C4735g(int i, String str, Uri uri, byte[] bArr, boolean z, int i2, String str2, boolean z2, boolean z3, String[] strArr, boolean z4, boolean z5) {
        this.f24364a = i;
        this.f24365b = str;
        this.f24366c = uri;
        this.f24367d = bArr;
        this.f24368e = z;
        this.f24369f = i2;
        this.f24370g = str2;
        this.f24371h = z2;
        this.f24372i = z3;
        this.f24375l = strArr;
        this.f24373j = z4;
        this.f24374k = z5;
    }

    public static C4735g m22044a(C4712p c4712p) {
        String str;
        String str2;
        Uri uri;
        Uri uri2 = null;
        C4713q c4713q = c4712p.f24233d;
        int i = 0;
        if (c4713q != null) {
            str = c4713q.f24241b;
            i = c4713q.f24243d;
            if (c4713q.f24242c != null) {
                uri2 = Uri.parse(c4713q.f24242c);
            }
            str2 = c4712p.f24233d.f24244e;
            if (!TextUtils.isEmpty(str2) || c4712p.f24232c == 0) {
                uri = uri2;
            } else {
                str2 = "generic_malware";
                uri = uri2;
            }
        } else {
            str2 = null;
            uri = null;
            str = null;
        }
        return new C4735g(c4712p.f24232c, str, uri, c4712p.f24234e, c4712p.f24236g, i, str2, c4712p.f24237h, c4712p.f24238i, c4712p.f24239j);
    }
}
