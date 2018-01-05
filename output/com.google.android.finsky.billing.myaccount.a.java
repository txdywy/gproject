package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View$OnClickListener;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.aq.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bb.b;
import com.google.android.finsky.billing.myaccount.layout.AccountSimpleRowView;
import com.google.android.finsky.billing.myaccount.layout.c;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dx.a;
import com.google.android.finsky.navigationmanager.a;
import com.google.android.finsky.providers.d;
import com.google.wireless.android.finsky.dfe.c.a.an;
import com.google.wireless.android.finsky.dfe.f.a.a;
import com.google.wireless.android.finsky.dfe.f.a.c;
import com.google.wireless.android.finsky.dfe.nano.gy;
import java.util.List;

protected final class com.google.android.finsky.billing.myaccount.a extends com.google.android.finsky.billing.myaccount.d
{

    public com.google.android.finsky.accounts.c c;
    public com.google.android.finsky.ba.c d;
    public com.google.android.finsky.bb.b e;
    public com.google.android.finsky.aq.a f;
    public com.google.android.finsky.dx.a g;
    public final com.google.android.finsky.navigationmanager.a h;

    a(Context p0, com.google.android.finsky.navigationmanager.a p1, com.google.android.finsky.d.ad p2, Bundle p3, com.google.android.finsky.d.w p4) {
        com.google.android.finsky.billing.myaccount.d(p0, p3, p2, p4);
        ((com.google.android.finsky.billing.myaccount.s)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.myaccount.s)).a(this);
        this.h = p1;
        this.i.clear();
        v4 = this.c.cY();
        if (v4 != 0) {
            if (com.google.android.finsky.aq.a.c(v4))
                v0 = 1;
            else {
                v3 = this.f.e.j(v4.name);
                if (!v3.a(12613099)) {
                    if (v3.a(12608887)) {
                        v3 = this.f.b(v4);
                        if (v3 != 0) {
                            if (v3.c != 0) {
                                if (v3.c.c != 0)
                                    v0 = 1;
                                else {
                                    v0 = this.f.c.b(v4.name);
                                    if (v0 == 0)
                                        v0 = 0;
                                    else
                                        v0 = v0.g;
                                    if (v0 != 0)
                                        v0 = v0.b;
                                    else
                                        v0 = 0;
                                }
                            }
                            else {
                                v0 = this.f.c.b(v4.name);
                                if (v0 == 0)
                                    v0 = 0;
                                else
                                    v0 = v0.g;
                                if (v0 != 0)
                                    v0 = v0.b;
                                else
                                    v0 = 0;
                            }
                        }
                        else {
                            v0 = this.f.c.b(v4.name);
                            if (v0 == 0)
                                v0 = 0;
                            else
                                v0 = v0.g;
                            if (v0 != 0)
                                v0 = v0.b;
                            else
                                v0 = 0;
                        }
                    }
                    else {
                        v0 = this.f.c.b(v4.name);
                        if (v0 == 0)
                            v0 = 0;
                        else
                            v0 = v0.g;
                        if (v0 != 0)
                            v0 = v0.b;
                        else
                            v0 = 0;
                    }
                }
                else
                    v0 = 0;
            }
        }
        else
            v0 = 0;
        if (v0 == 0)
            v0 = 1;
        else
            v0 = 0;
        if ((!this.d.dj().a(12608225)) || !this.f.a(v4))
            v3 = 1;
        else
            v3 = 0;
        this.i.add(Integer.valueOf(0));
        if (v0 != 0)
            this.i.add(Integer.valueOf(1));
        if (this.e.d())
            this.i.add(Integer.valueOf(2));
        this.i.add(Integer.valueOf(3));
        if (v3 != 0)
            this.i.add(Integer.valueOf(4));
        if (this.d.dj().a(12631494))
            this.i.add(Integer.valueOf(6));
        this.i.add(Integer.valueOf(5));
        v0 = this.g.g(v4.name);
        if (v0 != 0 && v0.e != 0)
            this.i.add(Integer.valueOf(7));
    }

    private final View$OnClickListener f(int p0) {
        return new com.google.android.finsky.billing.myaccount.c(this, p0);
    }

    protected final void a(View p0, int p1, int p2) {
        switch (p1) {
            case 0:
                this.a(p0);
                break;
            case 1:
                v0 = this.a(new com.google.android.finsky.billing.myaccount.b(this), 2131951659, 2131361812, 2131558600, 2680);
                v0.c = 2131951660;
                v0.f = 2131558626;
                ((AccountSimpleRowView)p0).a(v0, this.j);
                break;
            case 2:
                this.a(p0, this.f(5), 2131951657, 2131361820, 2131558492, 2681);
                break;
            case 3:
                if (this.d.dj().a(12643409))
                    this.a(p0, this.f(2), 2131951663, 2131361803, 2131558833, 2682);
                else
                    this.a(p0, this.f(2), 2131951663, 2131361873, 2131558833, 2682);
                break;
            case 4:
                this.a(p0, this.f(3), 2131951662, 2131361875, 2131558802, 2683);
                break;
            case 5:
                this.a(p0, this.f(1), 2131951658, 2131361827, 2131558598, 2684);
                break;
            case 6:
                this.a(p0, this.f(6), 2131951656, 2131361845, 2131558489, 2685);
                break;
            case 7:
                this.a(p0, this.f(8), 2131951655, 2131361810, 2131558455, 2697);
                break;
            default:
                throw new IllegalStateException(36 + "Unknown type for getView " + p1);
        }
    }

    protected final int e(int p0) {
        switch (p0) {
            case 0:
                v0 = 2130968970;
                break;
            case 1:
                v0 = 2130968611;
                break;
            case 2:
                v0 = 2130968611;
                break;
            case 3:
                v0 = 2130968611;
                break;
            case 4:
                v0 = 2130968611;
                break;
            case 5:
                v0 = 2130968611;
                break;
            case 6:
                v0 = 2130968611;
                break;
            case 7:
                v0 = 2130968611;
                break;
            default:
                throw new IllegalStateException(36 + "Unknown type for getView " + p0);
        }
        return v0;
    }

}
