package com.google.android.finsky.billing.addresschallenge;

import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.billing.addresschallenge.a.a;
import com.google.android.finsky.billing.addresschallenge.a.b;
import com.google.android.finsky.billing.addresschallenge.a.d;
import com.google.wireless.android.c.a.a.a;
import com.google.wireless.android.finsky.a.a.p;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public static class com.google.android.finsky.billing.addresschallenge.n
{

    public static View a(ViewGroup p0, Collection p1) {
        v4 = p1.iterator();
        v2 = 0;
        while (v4.hasNext()) {
            v0 = (View)v4.next();
            v1 = new Rect();
            p0.offsetDescendantRectToMyCoords(v0, v1);
            if (v2 == 0 || v1.top < ((Integer)v2.first).intValue())
                v0 = Pair.create(Integer.valueOf(v1.top), v0);
            else
                v0 = v2;
            v2 = v0;
        }
        if (v2 != 0)
            v0 = (View)v2.second;
        else
            v0 = 0;
        return v0;
    }

    public static com.google.android.finsky.billing.addresschallenge.a.a a(com.google.wireless.android.c.a.a.a p0) {
        v0 = new com.google.android.finsky.billing.addresschallenge.a.b();
        if (p0.j != 0)
            v0.a(p0.j);
        if (p0.e != 0)
            v0.a(com.google.android.finsky.billing.addresschallenge.a.d.e, p0.e);
        if (p0.f != 0)
            v0.a(com.google.android.finsky.billing.addresschallenge.a.d.f, p0.f);
        if (p0.h != 0)
            v0.a(com.google.android.finsky.billing.addresschallenge.a.d.a, p0.h);
        if (p0.g != 0)
            v0.a(com.google.android.finsky.billing.addresschallenge.a.d.b, p0.g);
        if (p0.k != 0)
            v0.a(com.google.android.finsky.billing.addresschallenge.a.d.g, p0.k);
        if (p0.i != 0)
            v0.a(com.google.android.finsky.billing.addresschallenge.a.d.h, p0.i);
        if (p0.l != 0)
            v0.a(com.google.android.finsky.billing.addresschallenge.a.d.i, p0.l);
        if (p0.b != 0)
            v0.a(com.google.android.finsky.billing.addresschallenge.a.d.c, p0.b);
        if (p0.m != 0)
            v0.b = p0.m;
        return v0.a();
    }

    public static com.google.wireless.android.finsky.a.a.p a(String p0, List p1) {
        if (TextUtils.isEmpty(p0)) {
            if (p1.size() > 0)
                v0 = (com.google.wireless.android.finsky.a.a.p)p1.get(0);
            else
                v0 = 0;
            return v0;
        }
        v1 = p1.iterator();
        while (true) {
            if (!v1.hasNext()) {
                if (p1.size() > 0)
                    v0 = (com.google.wireless.android.finsky.a.a.p)p1.get(0);
                else
                    v0 = 0;
                return v0;
            }
            v0 = (com.google.wireless.android.finsky.a.a.p)v1.next();
            if (p0.equals(v0.c))
                return v0;
        }
    }

}
