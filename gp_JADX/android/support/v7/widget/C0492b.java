package android.support.v7.widget;

import android.support.v4.view.bt;
import android.support.v4.view.bx;
import android.view.View;

public final class C0492b implements bx {
    public boolean f3178a = false;
    public int f3179b;
    public final /* synthetic */ C0490a f3180c;

    protected C0492b(C0490a c0490a) {
        this.f3180c = c0490a;
    }

    public final C0492b m3226a(bt btVar, int i) {
        this.f3180c.f2871f = btVar;
        this.f3179b = i;
        return this;
    }

    public final void mo440a(View view) {
        super.setVisibility(0);
        this.f3178a = false;
    }

    public final void mo441b(View view) {
        if (!this.f3178a) {
            this.f3180c.f2871f = null;
            super.setVisibility(this.f3179b);
        }
    }

    public final void mo442c(View view) {
        this.f3178a = true;
    }
}
