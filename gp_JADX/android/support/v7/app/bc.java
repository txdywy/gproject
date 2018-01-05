package android.support.v7.app;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.view.menu.C0471p;
import android.support.v7.view.menu.C0481m;
import android.view.View;
import android.view.ViewGroup;

public final class bc {
    public int f2327a;
    public int f2328b;
    public int f2329c;
    public int f2330d;
    public int f2331e;
    public int f2332f;
    public ViewGroup f2333g;
    public View f2334h;
    public View f2335i;
    public C0471p f2336j;
    public C0481m f2337k;
    public Context f2338l;
    public boolean f2339m;
    public boolean f2340n;
    public boolean f2341o;
    public boolean f2342p;
    public boolean f2343q = false;
    public boolean f2344r;
    public Bundle f2345s;

    bc(int i) {
        this.f2327a = i;
    }

    final void m2485a(C0471p c0471p) {
        if (c0471p != this.f2336j) {
            if (this.f2336j != null) {
                this.f2336j.m2829b(this.f2337k);
            }
            this.f2336j = c0471p;
            if (c0471p != null && this.f2337k != null) {
                c0471p.m2821a(this.f2337k);
            }
        }
    }
}
