package com.google.android.finsky.au;

import com.google.wireless.android.finsky.b.a;
import com.google.wireless.android.finsky.b.e;
import com.google.wireless.android.finsky.b.f;

static class com.google.android.finsky.au.e
{

    static com.google.wireless.android.finsky.b.f a(com.google.wireless.android.finsky.b.a p0) {
        if (p0.h != 0)
            v0 = p0.h;
        else if (!p0.f())
            v0 = 0;
        else
            v0 = new com.google.wireless.android.finsky.b.f().a(p0.c).a(p0.g).d();
        return v0;
    }

    static com.google.wireless.android.finsky.b.f a(com.google.wireless.android.finsky.b.e p0) {
        if (!p0.e())
            v0 = 0;
        else
            v0 = new com.google.wireless.android.finsky.b.f().a(p0.g).a(p0.i).d();
        return v0;
    }

}
