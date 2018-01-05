package com.google.android.play.layout;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

final class C6394h implements OnItemClickListener {
    public final /* synthetic */ C6397k f32250a;
    public final /* synthetic */ C6393g f32251b;

    C6394h(C6393g c6393g, C6397k c6397k) {
        this.f32251b = c6393g;
        this.f32250a = c6397k;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (i >= 0) {
            C6393g c6393g = this.f32251b;
            if (c6393g.f32247c != null) {
                c6393g.f32247c.c();
            }
            C6396j c6396j = (C6396j) this.f32250a.f32257b.get(i);
            if (c6396j.f32255d != null) {
                c6396j.f32255d.m29332a(c6396j.f32252a);
            }
        }
    }
}
