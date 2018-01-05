package com.google.android.finsky.billing.legacyauth;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.c.a.a;
import android.text.TextUtils;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.e.e;
import com.google.android.finsky.d.w;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.bb;
import com.google.android.play.utils.b.a;

public final class com.google.android.finsky.billing.legacyauth.f extends com.google.android.finsky.billing.common.s implements com.google.android.finsky.billing.legacyauth.g
{

    public final int a;
    public int ah;
    public String ai;
    public com.google.android.finsky.billing.e.e b;
    public Context c;
    public com.google.android.finsky.accounts.c d;
    public AuthState e;
    public String f;
    public String g;

    f() {
        com.google.android.finsky.billing.common.s();
        this.a = ((Integer)com.google.android.finsky.aa.b.dd.b()).intValue();
    }

    public static com.google.android.finsky.billing.legacyauth.f a(String p0, AuthState p1) {
        v0 = new Bundle();
        v0.putString("authAccount", p0);
        v0.putParcelable("AuthChallengeSidecar.authState", p1);
        v1 = new com.google.android.finsky.billing.legacyauth.f();
        v1.f(v0);
        return v1;
    }

    private final void c(int p0, int p1) {
        v0 = this.g();
        if (v0 == 0)
            v0 = "";
        else
            v0 = v0.getString(p0);
        this.f = v0;
        this.ah = this.ah + 1;
        if (this.ah >= this.a)
            p1 = 3;
        this.b(3, p1);
    }

    public final void a(int p0) {
        switch (p0) {
            case 909:
                this.c(2131952240, 4);
                break;
            case 910:
                this.c(2131952603, 0);
                break;
            case 1003:
                this.c(2131952378, 2);
                break;
            case 1100:
                this.c(2131952376, 1);
                break;
            default:
                this.c(2131952243, 0);
                break;
        }
    }

    public final void a(String p0) {
        this.f = "";
        this.g = p0;
        this.b.d();
        this.b(2, 0);
    }

    public final void a(String p0, String p1, com.google.android.finsky.d.w p2) {
        this.a(p0, p1, 0, p2);
    }

    public final void a(String p0, String p1, String p2, com.google.android.finsky.d.w p3) {
        v3 = 1;
        if (TextUtils.isEmpty(p1)) {
            if (this.e.a() == 2)
                this.c(2131951771, 2);
            else
                this.c(2131951770, 1);
        }
        else {
            if (this.e.a() != 2)
                v3 = 0;
            com.google.android.finsky.utils.bb.a(new com.google.android.finsky.billing.legacyauth.b(new com.google.android.finsky.billing.legacyauth.a(this.d.e(p0), p3), p1, v3, p2, this), new Void[0]);
        }
        this.ai = p2;
    }

    public final void b(Bundle p0) {
        ((com.google.android.finsky.billing.legacyauth.j)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.legacyauth.j)).a(this);
        this.b = new com.google.android.finsky.billing.e.e(android.support.v4.c.a.a.a(this.c));
        this.e = (AuthState)this.q.getParcelable("AuthChallengeSidecar.authState");
        this.ah = 0;
        super.b(p0);
    }

}
