package com.google.android.play.search;

import android.view.View;
import android.view.View.OnLongClickListener;

final class C6427u implements OnLongClickListener {
    public final /* synthetic */ C6429w f32375a;
    public final /* synthetic */ C6425s f32376b;

    C6427u(C6425s c6425s, C6429w c6429w) {
        this.f32376b = c6425s;
        this.f32375a = c6429w;
    }

    public final boolean onLongClick(View view) {
        if (this.f32376b.f32371d == null) {
            return false;
        }
        C6420m c6420m = this.f32376b.f32371d;
        C6429w c6429w = this.f32375a;
        boolean z = false;
        for (int size = c6420m.f32361a.size() - 1; size >= 0; size--) {
            z |= ((C6407o) c6420m.f32361a.get(size)).mo5429b(c6429w);
        }
        return z;
    }
}
