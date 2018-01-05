package com.google.android.finsky.p107l;

import android.annotation.SuppressLint;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.cn.C2322b;

public final class C3647b {
    public final String f18026a;
    public final String f18027b;
    public final C2322b f18028c;
    public final C2129c f18029d;

    public C3647b(String str, String str2, C2322b c2322b, C2129c c2129c) {
        this.f18026a = str;
        this.f18027b = str2;
        this.f18028c = c2322b;
        this.f18029d = c2129c;
    }

    @SuppressLint({"DefaultLocale"})
    public final String toString() {
        int i;
        int i2 = -1;
        String str = "{package=%s nodeid=%s installed=%d desired=%d}";
        Object[] objArr = new Object[4];
        objArr[0] = this.f18026a;
        objArr[1] = this.f18027b;
        if (this.f18028c != null) {
            i = this.f18028c.f11419d;
        } else {
            i = -1;
        }
        objArr[2] = Integer.valueOf(i);
        if (this.f18029d != null) {
            i2 = this.f18029d.f10809c;
        }
        objArr[3] = Integer.valueOf(i2);
        return String.format(str, objArr);
    }
}
