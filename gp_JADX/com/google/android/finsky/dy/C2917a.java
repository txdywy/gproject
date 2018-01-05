package com.google.android.finsky.dy;

import com.google.android.finsky.verifier.p259a.p260a.C4697a;

public final class C2917a {
    public C4697a f15486a = new C4697a();

    public final C2917a m15207a(byte[] bArr) {
        C4697a c4697a = this.f15486a;
        if (bArr == null) {
            throw new NullPointerException();
        }
        c4697a.f24088a |= 1;
        c4697a.f24089b = bArr;
        return this;
    }

    public final C2917a m15206a(String str) {
        C4697a c4697a = this.f15486a;
        if (str == null) {
            throw new NullPointerException();
        }
        c4697a.f24088a |= 2;
        c4697a.f24090c = str;
        return this;
    }

    public final C2917a m15205a(int i) {
        C4697a c4697a = this.f15486a;
        c4697a.f24088a |= 4;
        c4697a.f24091d = i;
        return this;
    }

    public final C2917a m15208b(String str) {
        C4697a c4697a;
        if (str != null) {
            c4697a = this.f15486a;
            if (str == null) {
                throw new NullPointerException();
            }
            c4697a.f24088a |= 8;
            c4697a.f24092e = str;
        } else {
            c4697a = this.f15486a;
            c4697a.f24092e = "";
            c4697a.f24088a &= -9;
        }
        return this;
    }

    public final C2917a m15209c(String str) {
        C4697a c4697a;
        if (str != null) {
            c4697a = this.f15486a;
            if (str == null) {
                throw new NullPointerException();
            }
            c4697a.f24088a |= 16;
            c4697a.f24093f = str;
        } else {
            c4697a = this.f15486a;
            c4697a.f24093f = "";
            c4697a.f24088a &= -17;
        }
        return this;
    }
}
