package com.google.android.finsky.activities;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.cr;
import android.support.v4.app.u;
import android.support.v7.app.aa;
import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.aw.a;
import com.google.android.finsky.billing.lightpurchase.ar;
import com.google.android.finsky.by.c;
import com.google.android.finsky.by.o;
import com.google.android.finsky.cq.d;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dt.a;
import com.google.android.finsky.f.a;
import com.google.android.finsky.f.b;
import com.google.android.finsky.f.c;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.m;
import com.google.android.finsky.r.a;
import com.google.android.finsky.uninstall.az;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

protected class MultiInstallActivity extends android.support.v7.app.aa implements View$OnClickListener
{

    public com.google.android.finsky.accounts.a A;
    public View B;
    public View C;
    public final com.google.android.finsky.d.a q;
    public ArrayList r;
    public int s;
    public int t;
    public com.google.android.finsky.installer.k u;
    public int v;
    public String w;
    public com.google.android.finsky.d.w x;
    public boolean y;
    public com.google.android.finsky.activities.ei z;

    MultiInstallActivity() {
        android.support.v7.app.aa();
        this.q = com.google.android.finsky.m.a.aR();
    }

    private final void a(MultiInstallActivity$InstallDetails p0) {
  7:    if (this.v == 2) {
  9:        v0 = com.google.android.finsky.uninstall.az.a();
 13:        if (v0 != 0)
 21:            v0.a(p0.c.a.c);
        }
 26:    if (this.y == 0) {
194:        if (this.v == 2) {
212:            v8 = com.google.android.finsky.m.a.bt().a(p0.c.a.c).a(com.google.android.finsky.m.a.cZ());
220:            if (TextUtils.isEmpty(v8)) {
224:                v2 = new Object[1];
226:                v2[0] = p0.c.a.c;
228:                FinskyLog.a("Cannot update %s because cannot determine update account.", v2);
                }
                else {
235:                this.u.g(p0.c.a.c);
246:                this.u.a(p0.c.a.c, p0.c.bV());
278:                this.u.a(p0.c.a.c, p0.c.h(), v8, p0.c.a.g, 3, p0.c.z(), this.x.a(p0.a));
                }
            }
            else {
289:            this.getApplicationContext();
296:            v0 = this.A.b(this.w);
300:            v6 = com.google.android.finsky.m.a.ah().a(v0);
304:            if (v6 == 0) {
308:                v1 = new Object[1];
316:                v1[0] = FinskyLog.a(this.w);
318:                FinskyLog.a("Cannot perform install because cannot find library for %s.", v1);
                }
335:            else if (!com.google.android.finsky.m.a.Y().a(p0.c, v6))
340:                com.google.android.finsky.billing.lightpurchase.ar.a(v0, p0.c, 0, 1, 0, this.x);
                else {
351:                this.u.a(p0.c.a.c, p0.c.bV());
382:                this.u.a(p0.c.a.c, p0.c.h(), this.w, p0.c.a.g, 3, p0.c.z(), this.x.a(p0.a));
                }
            }
231:        return;
        }
 36:    if (this.v != 2) {
 76:        v8 = this.w;
 85:        this.getApplicationContext();
 90:        v0 = this.A.b(v8);
 94:        v6 = com.google.android.finsky.m.a.ah().a(v0);
 98:        if (v6 == 0) {
102:            v1 = new Object[1];
108:            v1[0] = FinskyLog.a(v8);
110:            FinskyLog.a("Cannot perform install because cannot find library for %s.", v1);
            }
124:        else if (!com.google.android.finsky.m.a.Y().a(p0.c, v6)) {
128:            if (this.v == 1)
132:                com.google.android.finsky.billing.lightpurchase.ar.a(v0, p0.c, 0, 1, 0, this.x);
            }
            else {
138:            if (this.v == 2)
142:                this.u.g(p0.c.a.c);
151:            this.u.a(p0.c.a.c, p0.c.bV());
182:            this.u.a(p0.c.a.c, p0.c.h(), v8, p0.c.a.g, 3, p0.c.z(), this.x.a(p0.a));
            }
113:        return;
        }
 54:    v0 = com.google.android.finsky.m.a.bt().a(p0.c.a.c).a(com.google.android.finsky.m.a.cZ());
 62:    if (TextUtils.isEmpty(v0)) {
 66:        v1 = new Object[1];
 68:        v1[0] = p0.c.a.c;
 70:        FinskyLog.a("Cannot update %s because cannot determine update account.", v1);
 73:        return;
        }
 63:    goto 387;
 76:    v8 = this.w;
 85:    this.getApplicationContext();
 90:    v0 = this.A.b(v8);
 94:    v6 = com.google.android.finsky.m.a.ah().a(v0);
 98:    if (v6 == 0) {
102:        v1 = new Object[1];
108:        v1[0] = FinskyLog.a(v8);
110:        FinskyLog.a("Cannot perform install because cannot find library for %s.", v1);
        }
124:    else if (!com.google.android.finsky.m.a.Y().a(p0.c, v6)) {
128:        if (this.v == 1)
132:            com.google.android.finsky.billing.lightpurchase.ar.a(v0, p0.c, 0, 1, 0, this.x);
        }
        else {
138:        if (this.v == 2)
142:            this.u.g(p0.c.a.c);
151:        this.u.a(p0.c.a.c, p0.c.bV());
182:        this.u.a(p0.c.a.c, p0.c.h(), v8, p0.c.a.g, 3, p0.c.z(), this.x.a(p0.a));
        }
113:    return;
387:    v8 = v0;
388:    goto 77;
    }

    private final void a(List p0) {
        v1 = p0.iterator();
        while (v1.hasNext())
            this.a((MultiInstallActivity$InstallDetails)v1.next());
    }

    private static void a(List p0, int p1, ArrayList p2, ArrayList p3) {
        if ((!p2.isEmpty()) || !p3.isEmpty())
            FinskyLog.e("The output lists are not initially empty.", new Object[0]);
        v3 = com.google.android.finsky.m.a.bu();
        if (p1 == 2)
            v1 = "bulk_update";
        else
            v1 = "bulk_install";
        v5 = p0.iterator();
        while (v5.hasNext()) {
            v0 = (Document)v5.next();
            if (p1 == 2)
                v2 = v3.a(v0, com.google.android.finsky.m.a.x().a());
            else
                v2 = v3.a(v0, 0);
            v6 = new MultiInstallActivity$InstallDetails(v0, v2, v1);
            if (v6.a())
                p2.add(v6);
            else
                p3.add(v6);
        }
    }

    private final void b(boolean p0) {
        v1 = 3;
        if (this.s >= this.r.size())
            this.finish();
        else {
            v0 = (MultiInstallActivity$InstallDetails)this.r.get(this.s);
            if (v0.d != 0)
                this.t = 1;
            else if (v0.e != 0)
                this.t = 2;
            else {
                if (v0.f == 0) {
                    v2 = new Object[1];
                    v2[0] = v0.c.a.c;
                    FinskyLog.e("Failed to determine the next page type when updating %s.", v2);
                    this.finish();
                    return;
                }
                this.t = 3;
            }
            this.c(this.t);
            v0 = (MultiInstallActivity$InstallDetails)this.r.get(this.s);
            switch (this.t) {
                case 1:
                    v1 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    v1 = 2;
                    break;
                default:
                    v5 = new Object[1];
                    v5[0] = Integer.valueOf(this.t);
                    FinskyLog.e("Invalid current page type: %d", v5);
                    v1 = 2;
                    break;
            }
            v7 = new com.google.android.finsky.activities.ei();
            v8 = new Bundle();
            v8.putString("InstallApprovalFragment.packageName", v0.c.a.c);
            v8.putString("InstallApprovalFragment.packageTitle", v0.c.a.g);
            v8.putInt("InstallApprovalFragment.installNumber", this.s + 1);
            v8.putInt("InstallApprovalFragment.totalInstalls", this.r.size());
            v8.putInt("InstallApprovalFragment.approvalType", v1);
            v8.putStringArray("InstallApprovalFragment.permissions", v0.b);
            v7.f(v8);
            v0 = this.H_().a();
            if (p0 != 0)
                v0.a(2131034135, 2131034127);
            else
                v0.a(2131034152, 2131034155);
            if (this.z != 0)
                v0.a(this.z);
            v0.a(2131756225, v7);
            v0.c();
            this.z = v7;
            this.B.setEnabled(1);
            this.C.setEnabled(1);
        }
    }

    private final void c(int p0) {
        switch (p0) {
            case 1:
                v1 = 2131952296;
                break;
            case 2:
                v1 = 2131952299;
                break;
            case 3:
                v1 = 2131952301;
                break;
            default:
                v2 = new Object[1];
                v2[0] = Integer.valueOf(p0);
                FinskyLog.e("Invalid current page type: %d", v2);
                v1 = 2131952301;
                break;
        }
        ((PlayActionButtonV2)this.B).setText(this.getResources().getString(v1).toUpperCase());
        ((PlayActionButtonV2)this.C).setText(this.getResources().getString(2131952300).toUpperCase());
    }

    public void onClick(View p0) {
        if (this.t == 0) {
            v1 = new Object[1];
            v1[0] = Integer.valueOf(0);
            FinskyLog.e("Unexpected click for page type: %d", v1);
        }
        else {
            if (p0 == this.B || p0 == this.C) {
                this.B.setEnabled(0);
                this.C.setEnabled(0);
            }
            if (p0 == this.B) {
                v0 = (MultiInstallActivity$InstallDetails)this.r.get(this.s);
                switch (this.t) {
                    case 1:
                        v0.d = 0;
                        break;
                    case 2:
                        v0.e = 0;
                        this.u.a(v0.c.a.c);
                        break;
                    case 3:
                        v0.f = 0;
                        com.google.android.finsky.m.a.aV();
                        com.google.android.finsky.cq.d.a(com.google.android.finsky.m.a.c(), v0.c.a.c);
                        break;
                    default:
                        break;
                }
                if (v0.a()) {
                    this.a(v0);
                    this.s = this.s + 1;
                    this.b(0);
                }
                else
                    this.b(1);
            }
            else if (p0 == this.C) {
                this.s = this.s + 1;
                this.b(0);
            }
        }
    }

    protected void onCreate(Bundle p0) {
        v1 = 0;
        super.onCreate(p0);
        this.setContentView(2130969624);
        this.u = com.google.android.finsky.m.a.o();
        this.B = this.findViewById(2131755405);
        this.C = this.findViewById(2131755404);
        ((PlayActionButtonV2)this.B).a(3, 2131952688, this);
        ((PlayActionButtonV2)this.C).a(3, 2131951799, this);
        this.v = this.getIntent().getIntExtra("MultiInstallActivity.mode", 1);
        this.w = this.getIntent().getStringExtra("MultiInstallActivity.install-account-name");
        this.y = this.getIntent().getBooleanExtra("MultiInstallActivity.acquire-system-apps", 0);
        this.A = com.google.android.finsky.m.a.U();
        this.x = this.q.a(p0, this.getIntent());
        if (p0 == 0) {
            this.s = 0;
            this.t = 0;
            v2 = this.getIntent().getParcelableArrayListExtra("MultiInstallActivity.installs");
            while (v1 < v2.size()) {
                com.google.android.finsky.m.a.d().a((Document)v2.get(v1));
                v1 = v1 + 1;
            }
            v0 = new ArrayList();
            v1 = new ArrayList();
            MultiInstallActivity.a(v2, this.v, v0, v1);
            v2 = com.google.android.finsky.uninstall.az.a();
            if (v2 != 0)
                v2.b();
            this.a(v0);
            this.r = v1;
            this.b(1);
        }
        else {
            this.r = p0.getParcelableArrayList("MultiInstallActivity.installs-for-approval");
            this.s = p0.getInt("MultiInstallActivity.current-install-index", 0);
            this.t = p0.getInt("MultiInstallActivity.current-page-type", 0);
            this.c(this.t);
            this.z = (com.google.android.finsky.activities.ei)this.H_().a(2131756225);
        }
    }

    protected void onSaveInstanceState(Bundle p0) {
        super.onSaveInstanceState(p0);
        p0.putParcelableArrayList("MultiInstallActivity.installs-for-approval", this.r);
        p0.putInt("MultiInstallActivity.current-install-index", this.s);
        p0.putInt("MultiInstallActivity.current-page-type", this.t);
        this.x.a(p0);
    }

}
