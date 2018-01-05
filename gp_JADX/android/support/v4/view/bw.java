package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;

final class bw implements bx {
    public bt f1890a;
    public boolean f1891b;

    bw(bt btVar) {
        this.f1890a = btVar;
    }

    public final void mo440a(View view) {
        bx bxVar;
        this.f1891b = false;
        if (this.f1890a.f1886d >= 0) {
            view.setLayerType(2, null);
        }
        if (this.f1890a.f1884b != null) {
            Runnable runnable = this.f1890a.f1884b;
            this.f1890a.f1884b = null;
            runnable.run();
        }
        Object tag = view.getTag(2113929216);
        if (tag instanceof bx) {
            bxVar = (bx) tag;
        } else {
            bxVar = null;
        }
        if (bxVar != null) {
            bxVar.mo440a(view);
        }
    }

    public final void mo441b(View view) {
        if (this.f1890a.f1886d >= 0) {
            view.setLayerType(this.f1890a.f1886d, null);
            this.f1890a.f1886d = -1;
        }
        if (VERSION.SDK_INT >= 16 || !this.f1891b) {
            bx bxVar;
            if (this.f1890a.f1885c != null) {
                Runnable runnable = this.f1890a.f1885c;
                this.f1890a.f1885c = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof bx) {
                bxVar = (bx) tag;
            } else {
                bxVar = null;
            }
            if (bxVar != null) {
                bxVar.mo441b(view);
            }
            this.f1891b = true;
        }
    }

    public final void mo442c(View view) {
        bx bxVar;
        Object tag = view.getTag(2113929216);
        if (tag instanceof bx) {
            bxVar = (bx) tag;
        } else {
            bxVar = null;
        }
        if (bxVar != null) {
            bxVar.mo442c(view);
        }
    }
}
