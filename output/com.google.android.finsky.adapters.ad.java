package com.google.android.finsky.adapters;

import android.content.Context;
import android.support.v7.widget.em;
import android.support.v7.widget.en;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.u;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.y.a;
import com.google.android.play.image.w;
import java.util.HashSet;
import java.util.Set;

public final class com.google.android.finsky.adapters.ad extends CardRecyclerViewAdapter implements com.google.android.finsky.ee.f
{

    public Set E;

    ad(Context p0, com.google.android.finsky.navigationmanager.a p1, com.google.android.play.image.w p2, com.google.android.finsky.y.a p3, com.google.android.finsky.dfemodel.u p4, com.google.android.finsky.d.ad p5, boolean p6, com.google.android.finsky.d.w p7) {
        CardRecyclerViewAdapter(p0, p1, p2, p3, p4, p6, p5, p7);
        this.E = new HashSet();
    }

    public final void a(String p0, boolean p1, boolean p2) {
        if (p2 == 0) {
            if (p1 != 0)
                this.E.remove(p0);
            else
                this.E.add(p0);
            this.a.b();
            return;
        }
        if (p1 != 0)
            return;
        this.E.remove(p0);
        v1 = 0;
        while (true) {
            if (v1 >= this.H.a.m()) {
                this.a(this.H.a);
                return;
            }
            if (p0.equals(((Document)this.H.a.a(v1, 1)).a.c))
                break;
            v1 = v1 + 1;
        }
        this.H.a.e(v1);
        this.a(this.H.a);
    }

    protected final boolean a(Document p0) {
        return this.E.contains(p0.a.c);
    }

    public final void m_() {
        this.E.clear();
        super.m_();
    }

}
