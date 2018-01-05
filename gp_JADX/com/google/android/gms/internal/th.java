package com.google.android.gms.internal;

import java.security.Key;
import javax.crypto.Mac;

public final class th implements qx {
    public Mac f27495a;
    public final int f27496b;
    public final String f27497c;
    public final Key f27498d;

    public th(String str, Key key, int i) {
        this.f27497c = str;
        this.f27496b = i;
        this.f27498d = key;
        this.f27495a = (Mac) sx.f27487d.m25570a(str);
        this.f27495a.init(key);
    }

    public final byte[] mo4866a(byte[] bArr) {
        Mac mac;
        try {
            mac = (Mac) this.f27495a.clone();
        } catch (CloneNotSupportedException e) {
            mac = (Mac) sx.f27487d.m25570a(this.f27497c);
            mac.init(this.f27498d);
        }
        mac.update(bArr);
        Object obj = new byte[this.f27496b];
        System.arraycopy(mac.doFinal(), 0, obj, 0, this.f27496b);
        return obj;
    }
}
