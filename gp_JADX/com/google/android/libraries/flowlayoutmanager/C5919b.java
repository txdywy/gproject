package com.google.android.libraries.flowlayoutmanager;

import android.content.Context;
import android.graphics.PointF;
import android.support.v7.widget.dn;
import android.support.v7.widget.ew;
import android.support.v7.widget.fm;
import android.support.v7.widget.fo;
import android.view.View;

final class C5919b extends dn {
    public final /* synthetic */ boolean f29506n = false;
    public final /* synthetic */ int f29507o = 0;
    public final /* synthetic */ FlowLayoutManager f29508p;

    C5919b(FlowLayoutManager flowLayoutManager, Context context) {
        this.f29508p = flowLayoutManager;
        super(context);
    }

    public final PointF mo5194a(int i) {
        if (m3518e() == 0) {
            return null;
        }
        return new PointF(0.0f, (float) (i < ew.m2979a(this.f29508p.m3051f(0)) ? -1 : 1));
    }

    protected final void mo817a(View view, fo foVar, fm fmVar) {
        super.mo817a(view, foVar, fmVar);
        if (this.f29506n) {
            fmVar.m3702a(fmVar.f3458b - this.f29507o);
        }
    }

    protected final int mo5195c() {
        if (this.f29506n) {
            return -1;
        }
        return super.mo5195c();
    }
}
