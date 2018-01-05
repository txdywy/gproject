package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.view.C0409c;
import android.support.v7.view.C0412b;
import android.support.v7.view.C0459i;
import android.support.v7.widget.hc;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.Window;
import android.view.Window.Callback;

abstract class ad extends ac {
    public static boolean f2246c = true;
    public static final int[] f2247d = new int[]{16842836};
    public final Context f2248e;
    public final Window f2249f;
    public final Callback f2250g = this.f2249f.getCallback();
    public final Callback f2251h;
    public final ab f2252i;
    public C0404a f2253j;
    public MenuInflater f2254k;
    public boolean f2255l;
    public boolean f2256m;
    public boolean f2257n;
    public boolean f2258o;
    public boolean f2259p;
    public CharSequence f2260q;
    public boolean f2261r;

    ad(Context context, Window window, ab abVar) {
        this.f2248e = context;
        this.f2249f = window;
        this.f2252i = abVar;
        if (this.f2250g instanceof ag) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f2251h = mo544a(this.f2250g);
        this.f2249f.setCallback(this.f2251h);
        hc a = hc.m3768a(context, null, f2247d);
        Drawable b = a.m3774b(0);
        if (b != null) {
            this.f2249f.setBackgroundDrawable(b);
        }
        a.f3558b.recycle();
    }

    abstract C0412b mo521a(C0409c c0409c);

    abstract boolean mo528a(int i, KeyEvent keyEvent);

    abstract boolean mo530a(KeyEvent keyEvent);

    abstract void mo533b(CharSequence charSequence);

    abstract void mo537d(int i);

    abstract boolean mo538e(int i);

    abstract void mo542m();

    Callback mo544a(Callback callback) {
        return new ag(this, callback);
    }

    public final C0404a mo500a() {
        mo542m();
        return this.f2253j;
    }

    public final MenuInflater mo502b() {
        if (this.f2254k == null) {
            mo542m();
            this.f2254k = new C0459i(this.f2253j != null ? this.f2253j.mo582g() : this.f2248e);
        }
        return this.f2254k;
    }

    public final C0406f mo507j() {
        return new af(this);
    }

    final Context m2389n() {
        Context context = null;
        C0404a a = mo500a();
        if (a != null) {
            context = a.mo582g();
        }
        if (context == null) {
            return this.f2248e;
        }
        return context;
    }

    public void mo504e() {
    }

    public void mo505f() {
    }

    public void mo506i() {
        this.f2261r = true;
    }

    public boolean mo546o() {
        return false;
    }

    public boolean mo508l() {
        return false;
    }

    public final void mo501a(CharSequence charSequence) {
        this.f2260q = charSequence;
        mo533b(charSequence);
    }

    public void mo503b(Bundle bundle) {
    }

    static {
        if (VERSION.SDK_INT < 21 && !f2246c) {
            Thread.setDefaultUncaughtExceptionHandler(new ae(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }
}
