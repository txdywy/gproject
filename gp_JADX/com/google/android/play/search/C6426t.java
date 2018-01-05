package com.google.android.play.search;

import android.view.View;
import android.view.View.OnClickListener;

final class C6426t implements OnClickListener {
    public final /* synthetic */ C6429w f32373a;
    public final /* synthetic */ C6425s f32374b;

    C6426t(C6425s c6425s, C6429w c6429w) {
        this.f32374b = c6425s;
        this.f32373a = c6429w;
    }

    public final void onClick(View view) {
        if (this.f32374b.f32371d != null) {
            C6420m c6420m = this.f32374b.f32371d;
            C6429w c6429w = this.f32373a;
            if (c6429w.f32385m) {
                c6420m.m29443a(c6429w.f32378f, false);
            }
            for (int size = c6420m.f32361a.size() - 1; size >= 0; size--) {
                ((C6407o) c6420m.f32361a.get(size)).mo5426a(c6429w);
            }
        }
    }
}
