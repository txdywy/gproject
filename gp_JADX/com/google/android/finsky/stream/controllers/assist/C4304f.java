package com.google.android.finsky.stream.controllers.assist;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public abstract class C4304f extends C4250b implements ad {
    public C4310a f21750a;
    public boolean f21751b;
    public final Handler f21752o = new Handler(Looper.getMainLooper());

    public C4304f(Context context, C3748a c3748a, ad adVar, C1611k c1611k, C1556d c1556d, C2495w c2495w, String str, C0988c c0988c) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        String cZ = c0988c.cZ();
        if (cZ == null) {
            FinskyLog.m21669e("Somehow got to an assist card without a logged in user", new Object[0]);
            cZ = "";
        }
        this.f21750a = new C4310a(str, cZ);
    }

    public abstract void mo4109a(View view);

    public abstract int mo4110b();

    public abstract int mo4111c();

    public abstract boolean mo4113d();

    public void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.f21751b = mo4113d();
    }

    public ce getPlayStoreUiElement() {
        return C2482j.m13283a(mo4110b());
    }

    public ad getParentNode() {
        return this.h;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final int mo1508a() {
        return this.f21751b ? 2 : 0;
    }

    public final int mo1509a(int i) {
        if (i == 1) {
            return C7582R.layout.vertical_spacer;
        }
        return mo4111c();
    }

    public final void mo1510a(View view, int i) {
        if (i == 1) {
            view.setMinimumHeight(this.e.getResources().getDimensionPixelSize(C7582R.dimen.play_card_myapps_cluster_padding_top));
            return;
        }
        mo4109a(view);
        if (this.h != null) {
            this.h.mo1219a(this);
        }
    }

    public final void mo1511b(View view, int i) {
    }

    public final void m20016e() {
        this.f21752o.post(new C4315g(this));
    }
}
