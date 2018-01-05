package com.google.android.finsky.stream.base.playcluster;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ev;
import android.support.v7.widget.fo;
import android.view.View;

final class C4289l extends ev {
    public final /* synthetic */ PlayClusterViewContentV2 f21650a;

    C4289l(PlayClusterViewContentV2 playClusterViewContentV2) {
        this.f21650a = playClusterViewContentV2;
    }

    public final void mo785a(Rect rect, View view, RecyclerView recyclerView, fo foVar) {
        if (!this.f21650a.aU) {
            Object tag = view.getTag();
            if (tag == null || !"tagIsSpacer".equals(tag)) {
                int b = this.f21650a.bi.mo1494b(this.f21650a.bd.mo1485c(view), this.f21650a.bk, this.f21650a.bl);
                rect.set(0, b, 0, b);
            }
        }
    }
}
