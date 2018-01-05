package com.google.android.finsky.adapters;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.em;
import android.support.v7.widget.en;
import com.google.android.finsky.api.m;
import com.google.android.finsky.dfemodel.a;
import com.google.android.finsky.dfemodel.k;
import com.google.android.finsky.dfemodel.u;
import com.google.android.finsky.dfemodel.x;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.recyclerview.e;

public class com.google.android.finsky.adapters.m extends com.google.android.finsky.recyclerview.e implements com.google.android.finsky.dfemodel.w
{

    public com.google.android.finsky.dfemodel.u H;

    m(Context p0, com.google.android.finsky.dfemodel.u p1) {
        com.google.android.finsky.recyclerview.e(p0, p1.a.h(), p1.a.t);
        this.H = p1;
        this.H.a.a(this);
    }

    public void a(com.google.android.finsky.dfemodel.a p0) {
        p0.b(this);
        this.H.a = p0;
        p0.a(this);
        this.a.b();
    }

    public void a(PlayRecyclerView p0, Bundle p1) {
        p1.putParcelable("ListTab.RecyclerViewParcelKey", p0.x());
    }

    public void b(PlayRecyclerView p0, Bundle p1) {
        v0 = p1.getParcelable("ListTab.RecyclerViewParcelKey");
        if (v0 != 0)
            p0.a(v0);
    }

    public void h() {
        this.H.a.b(this);
    }

    protected final boolean i() {
        return this.H.a.t;
    }

    protected final void j() {
        this.H.a.q();
    }

    protected final String l() {
        return com.google.android.finsky.api.m.a(this.J, this.H.a.g());
    }

    public void m_() {
        if (this.i())
            this.e(1);
        else
            this.e(0);
    }

}
