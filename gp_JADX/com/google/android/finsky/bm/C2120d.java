package com.google.android.finsky.bm;

import android.text.TextUtils;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.at;

public final class C2120d {
    public C2126i f10749a;
    public C2495w f10750b;

    C2120d(C2126i c2126i, C2495w c2495w) {
        this.f10749a = c2126i;
        this.f10750b = c2495w;
    }

    public final void m11036a(long j, String str, byte[] bArr) {
        m11034a(1, 1, 0, -1, this.f10749a.m11062b(), j, str, bArr);
    }

    public final void m11035a(int i, long j, String str, byte[] bArr) {
        int i2;
        C2126i c2126i = this.f10749a;
        if (c2126i.f10770e == null || c2126i.f10771f == null) {
            FinskyLog.m21667d("Cannot determine video length with uninitialized fragment or YouTube player", new Object[0]);
            i2 = -1;
        } else {
            i2 = c2126i.f10771f.d();
        }
        m11034a(2, 0, i, i2, this.f10749a.m11062b(), j, str, bArr);
    }

    private final void m11034a(int i, int i2, int i3, int i4, int i5, long j, String str, byte[] bArr) {
        C2474c c2474c = new C2474c(549);
        at atVar = new at();
        atVar.b = i;
        atVar.a |= 1;
        if (i2 > 0) {
            atVar.c = i2;
            atVar.a |= 2;
        }
        if (i3 > 0) {
            atVar.d = i3;
            atVar.a |= 4;
        }
        if (i4 >= 0) {
            atVar.a |= 8;
            atVar.e = i4;
        }
        if (i5 >= 0) {
            atVar.a |= 16;
            atVar.f = i5;
        }
        if (j > 0) {
            atVar.a |= 32;
            atVar.g = j;
        }
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                throw new NullPointerException();
            }
            atVar.a |= 64;
            atVar.h = str;
        }
        c2474c.f13342a.af = atVar;
        c2474c.m13240a(bArr);
        this.f10750b.m13367a(c2474c);
    }
}
