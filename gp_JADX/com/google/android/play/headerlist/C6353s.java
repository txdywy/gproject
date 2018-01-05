package com.google.android.play.headerlist;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.em;
import android.support.v7.widget.eo;
import android.support.v7.widget.fe;
import android.view.ViewGroup;

public final class C6353s extends fe {
    public final PlayHeaderListLayout f31911a;
    public int f31912b = -1;
    public int f31913c;
    public final eo f31914d;
    public em f31915e;

    public C6353s(PlayHeaderListLayout playHeaderListLayout) {
        this.f31911a = playHeaderListLayout;
        this.f31914d = new C6354t(this);
    }

    final void m29159a(boolean z) {
        this.f31912b = -1;
        if (z) {
            m29156a(null);
        }
        this.f31913c = 0;
    }

    private final void m29156a(em emVar) {
        if (this.f31915e != emVar) {
            if (this.f31915e != null) {
                this.f31915e.b(this.f31914d);
            }
            this.f31915e = emVar;
            if (this.f31915e != null) {
                this.f31915e.a(this.f31914d);
            }
            m29159a(false);
        }
    }

    public final void m29157a(RecyclerView recyclerView, int i) {
        m29156a(recyclerView.getAdapter());
        this.f31913c = i;
        this.f31911a.m29082a(i);
        if (this.f31911a.aA != null) {
            this.f31911a.aA.a(recyclerView, i);
        }
    }

    public final void m29158a(RecyclerView recyclerView, int i, int i2) {
        m29156a(recyclerView.getAdapter());
        int d = this.f31911a.m29095d((ViewGroup) recyclerView);
        if (d != -1) {
            this.f31912b = d;
        } else if (i2 == 0) {
            this.f31912b = -1;
        } else if (this.f31912b != -1) {
            this.f31912b += i2;
        }
        this.f31911a.m29084a(this.f31913c, i2, recyclerView.getChildCount() == 0 ? 0 : this.f31912b);
        if (this.f31911a.aA != null) {
            this.f31911a.aA.a(recyclerView, i, i2);
        }
    }
}
