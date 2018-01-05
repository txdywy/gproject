package com.google.android.play.search;

import android.view.View.OnClickListener;
import java.util.ArrayList;

public final class C6420m {
    public final ArrayList f32361a = new ArrayList();
    public int f32362b;
    public int f32363c = 1;
    public String f32364d = "";
    public OnClickListener f32365e;

    public final void m29442a(C6407o c6407o) {
        this.f32361a.add(c6407o);
    }

    public final void m29447b(C6407o c6407o) {
        this.f32361a.remove(c6407o);
    }

    public final boolean m29445a() {
        return this.f32362b == this.f32363c;
    }

    public final void m29446b() {
        m29441a(this.f32363c);
    }

    public final void m29441a(int i) {
        if (this.f32362b != i) {
            this.f32362b = i;
            for (int size = this.f32361a.size() - 1; size >= 0; size--) {
                ((C6407o) this.f32361a.get(size)).mo5425a(i);
            }
        }
    }

    public final void m29448c() {
        for (int size = this.f32361a.size() - 1; size >= 0; size--) {
            ((C6407o) this.f32361a.get(size)).mo5427a(this.f32364d);
        }
    }

    final void m29443a(String str, boolean z) {
        if (!this.f32364d.equals(str)) {
            this.f32364d = str;
            m29444a(z);
        }
    }

    final void m29444a(boolean z) {
        for (int size = this.f32361a.size() - 1; size >= 0; size--) {
            ((C6407o) this.f32361a.get(size)).mo5428a(this.f32364d, z);
        }
    }
}
