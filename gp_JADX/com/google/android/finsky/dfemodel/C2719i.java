package com.google.android.finsky.dfemodel;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.google.android.finsky.api.C1254c;
import com.google.wireless.android.finsky.dfe.nano.by;
import java.util.Collection;

public final class C2719i extends C2335k implements C0660x {
    public by f14925a;
    public final String f14926b;

    public C2719i(C1254c c1254c, String str) {
        this(c1254c, str, false, null, null);
    }

    public C2719i(C1254c c1254c, String str, boolean z, Collection collection) {
        this(c1254c, str, z, null, collection);
    }

    public C2719i(C1254c c1254c, String str, boolean z, String str2, Collection collection) {
        this.f14926b = str;
        c1254c.mo1599a(this.f14926b, z, false, str2, collection, (C0660x) this, (C0657w) this);
    }

    public final Document m14722b() {
        if (this.f14925a == null || this.f14925a.c == null) {
            return null;
        }
        return new Document(this.f14925a.c);
    }

    public final boolean mo2861a() {
        return this.f14925a != null;
    }

    public final String m14723c() {
        if (this.f14925a != null) {
            if (((this.f14925a.a & 32) != 0 ? 1 : null) != null) {
                return this.f14925a.l;
            }
        }
        return null;
    }

    public final byte[] m14724d() {
        if (this.f14925a == null || this.f14925a.g.length == 0) {
            return null;
        }
        return this.f14925a.g;
    }

    public final boolean m14725e() {
        if (this.f14925a == null) {
            return true;
        }
        return this.f14925a.i;
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f14925a = (by) obj;
        m11927l();
    }
}
