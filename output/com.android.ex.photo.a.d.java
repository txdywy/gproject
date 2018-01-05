package com.android.ex.photo.a;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.h.u;
import com.android.ex.photo.b.a;
import com.android.ex.photo.d.a;
import com.android.ex.photo.e;

public final class com.android.ex.photo.a.d extends com.android.ex.photo.a.a
{

    public android.support.v4.h.u l;
    public final float m;
    public boolean n;

    d(Context p0, android.support.v4.app.ab p1, float p2, boolean p3) {
        com.android.ex.photo.a.a(p0, p1);
        this.l = new android.support.v4.h.u(com.android.ex.photo.d.a.a.length);
        this.m = p2;
        this.n = p3;
    }

    public final Cursor a(Cursor p0) {
        v0 = 0;
        this.l.clear();
        if (p0 != 0) {
            v1 = 0;
            while (v1 < com.android.ex.photo.d.a.a.length) {
                this.l.put(com.android.ex.photo.d.a.a[v1], Integer.valueOf(p0.getColumnIndexOrThrow(com.android.ex.photo.d.a.a[v1])));
                v1 = v1 + 1;
            }
            while (v0 < com.android.ex.photo.d.a.b.length) {
                v4 = p0.getColumnIndex(com.android.ex.photo.d.a.b[v0]);
                if (v4 != -1)
                    this.l.put(com.android.ex.photo.d.a.b[v0], Integer.valueOf(v4));
                v0 = v0 + 1;
            }
        }
        return super.a(p0);
    }

    public final Fragment a(Cursor p0, int p1) {
        v0 = 0;
        v2 = this.a(p0, "contentUri");
        v1 = this.a(p0, "loadingIndicator");
        if (v1 == 0)
            v1 = 0;
        else
            v1 = Boolean.valueOf(v1).booleanValue();
        if (v2 == 0 && v1 != 0)
            v0 = 1;
        v6 = new com.android.ex.photo.e(this.c, com.android.ex.photo.b.a);
        v6.e = v2;
        v6.g = this.a(p0, "thumbnailUri");
        v6.h = this.a(p0, "_display_name");
        v6.s = this.n;
        v6.a(this.m);
        v2 = new com.android.ex.photo.b.a();
        com.android.ex.photo.b.a.a(v6.a(), p1, v0, v2);
        return v2;
    }

    public final String a(Cursor p0, String p1) {
        if (this.l.containsKey(p1))
            v0 = p0.getString(((Integer)this.l.get(p1)).intValue());
        else
            v0 = 0;
        return v0;
    }

}
