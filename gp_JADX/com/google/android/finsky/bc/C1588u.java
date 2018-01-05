package com.google.android.finsky.bc;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;

public final class C1588u {
    public C1568y[] f8406a;
    public int f8407b;
    public Activity f8408c;
    public C1585q f8409d;
    public boolean f8410e;
    public boolean f8411f;

    public C1588u(C1585q c1585q) {
        this.f8409d = c1585q;
    }

    public final void m9153a() {
        Intent intent = new Intent();
        if (this.f8411f) {
            intent.putExtra("family_created", true);
        }
        if (this.f8410e) {
            Object g = this.f8409d.mo2351g();
            if (!TextUtils.isEmpty(g)) {
                intent.putExtra("completionRedirectUrl", g);
            }
            this.f8408c.setResult(-1, intent);
        } else {
            this.f8408c.setResult(0, intent);
        }
        this.f8408c.finish();
    }

    public final void m9156b() {
        this.f8407b++;
        if (this.f8407b >= this.f8406a.length) {
            m9153a();
        } else {
            this.f8406a[this.f8407b].mo2336a();
        }
    }

    public final void m9155a(C1573p c1573p, boolean z) {
        c1573p.ag = this.f8409d;
        C1587s c1587s = (C1587s) this.f8408c;
        c1573p.mo2580a(c1587s.m9152n());
        c1587s.mo3312a(c1573p, z);
    }

    public final void m9154a(Intent intent, int i) {
        this.f8408c.startActivityForResult(intent, i);
    }
}
