package com.android.ex.photo.c;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri$Builder;
import android.support.v4.a.e;
import com.android.ex.photo.d.a;

public final class com.android.ex.photo.c.d extends android.support.v4.a.e
{

    public final String[] i;
    public final Uri x;

    d(Context p0, Uri p1, String[] p2) {
        android.support.v4.a.e(p0);
        this.x = p1;
        if (p2 == 0)
            p2 = com.android.ex.photo.d.a.a;
        this.i = p2;
    }

    public final Object d() {
        return this.f();
    }

    public final Cursor f() {
        this.h = this.x.buildUpon().appendQueryParameter("contentType", "image/").build();
        this.i = this.i;
        return super.f();
    }

}
