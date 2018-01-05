package com.google.android.finsky.p111d;

import android.text.TextUtils;
import com.google.wireless.android.a.a.a.a.br;
import com.google.wireless.android.a.a.a.a.bs;

public final class C2476e {
    public final br f13346a = new br();

    public C2476e(int i) {
        br brVar = this.f13346a;
        brVar.c = i;
        brVar.a |= 2;
    }

    public final C2476e m13262a(String str) {
        if (!TextUtils.isEmpty(str)) {
            br brVar = this.f13346a;
            if (str == null) {
                throw new NullPointerException();
            }
            brVar.a |= 1;
            brVar.b = str;
        }
        return this;
    }

    public final C2476e m13264b(String str) {
        if (!TextUtils.isEmpty(str)) {
            br brVar = this.f13346a;
            if (str == null) {
                throw new NullPointerException();
            }
            brVar.a |= 4;
            brVar.d = str;
        }
        return this;
    }

    public final C2476e m13263a(byte[] bArr) {
        if (bArr != null) {
            br brVar = this.f13346a;
            if (bArr == null) {
                throw new NullPointerException();
            }
            brVar.a |= 64;
            brVar.h = bArr;
        }
        return this;
    }

    public final C2476e m13265c(String str) {
        if (!TextUtils.isEmpty(str)) {
            br brVar = this.f13346a;
            if (str == null) {
                throw new NullPointerException();
            }
            brVar.a |= 128;
            brVar.i = str;
        }
        return this;
    }

    public final C2476e m13266d(String str) {
        if (!TextUtils.isEmpty(str)) {
            br brVar = this.f13346a;
            if (str == null) {
                throw new NullPointerException();
            }
            brVar.a |= 256;
            brVar.j = str;
        }
        return this;
    }

    public final C2476e m13267e(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f13346a.a(str);
        }
        return this;
    }

    public final C2476e m13261a(int i, boolean z) {
        if (i != 0) {
            bs bsVar = new bs();
            bsVar.b = i;
            bsVar.a |= 1;
            bsVar.a |= 2;
            bsVar.c = z;
            this.f13346a.n = bsVar;
        }
        return this;
    }
}
