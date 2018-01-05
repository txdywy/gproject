package com.google.android.finsky.adapters;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2712a;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.recyclerview.C1138e;
import com.google.android.finsky.recyclerview.PlayRecyclerView;

public abstract class C1139m extends C1138e implements C1031w {
    public C2730u f7101H;

    public C1139m(Context context, C2730u c2730u) {
        super(context, c2730u.f14950a.mo3128h(), c2730u.f14950a.f14901t);
        this.f7101H = c2730u;
        this.f7101H.f14950a.m11918a((C1031w) this);
    }

    public void mo1453h() {
        this.f7101H.f14950a.m11922b((C1031w) this);
    }

    public void mo1450a(PlayRecyclerView playRecyclerView, Bundle bundle) {
        bundle.putParcelable("ListTab.RecyclerViewParcelKey", playRecyclerView.mo2959x());
    }

    protected final boolean mo1444i() {
        return this.f7101H.f14950a.f14901t;
    }

    protected final void mo1445j() {
        this.f7101H.f14950a.m14702q();
    }

    protected final String mo1446l() {
        return C1290m.m7702a(this.J, this.f7101H.f14950a.mo3127g());
    }

    public void mo1449a(C2712a c2712a) {
        c2712a.m11922b((C1031w) this);
        this.f7101H.f14950a = c2712a;
        c2712a.m11918a((C1031w) this);
        this.f3433a.m3638b();
    }

    public void mo1451b(PlayRecyclerView playRecyclerView, Bundle bundle) {
        Parcelable parcelable = bundle.getParcelable("ListTab.RecyclerViewParcelKey");
        if (parcelable != null) {
            playRecyclerView.m13601a(parcelable);
        }
    }

    public void m_() {
        if (mo1444i()) {
            m6882e(1);
        } else {
            m6882e(0);
        }
    }
}
