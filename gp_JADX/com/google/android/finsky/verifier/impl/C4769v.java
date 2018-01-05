package com.google.android.finsky.verifier.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.support.v4.p028a.C0221j;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.C4726d;
import com.google.android.finsky.verifier.impl.p261b.C4740a;
import com.google.android.finsky.verifier.p259a.p260a.C4717u;
import com.google.android.finsky.verifier.p259a.p260a.C4718v;
import com.google.android.p254g.p255a.C4879a;
import com.google.android.p254g.p255a.C4880b;
import com.google.protobuf.nano.C0757i;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class C4769v extends C4740a {
    public Context f24709a;
    public C1461c f24710b;
    public C1500a f24711c;
    public C4726d f24712d;
    public C4879a f24713e;
    public BroadcastReceiver f24714f;
    public C4756h f24715g = new C4756h();
    public C4717u f24716h;
    public boolean f24717i = false;
    public int f24718j = 0;

    public C4769v(Intent intent) {
        ParcelableBinder parcelableBinder = (ParcelableBinder) intent.getParcelableExtra("list_harmful_apps_callback");
        if (parcelableBinder != null) {
            C4879a c4879a;
            IBinder iBinder = parcelableBinder.f24328a;
            if (iBinder == null) {
                c4879a = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.vending.verifier.IListHarmfulAppsCallback");
                if (queryLocalInterface instanceof C4879a) {
                    c4879a = (C4879a) queryLocalInterface;
                } else {
                    c4879a = new C4880b(iBinder);
                }
            }
            this.f24713e = c4879a;
        }
        ((ac) C3947d.m18649a(ac.class)).mo1996a(this);
    }

    protected final boolean mo4343a() {
        if (this.f24713e == null) {
            FinskyLog.m21665c("No result callback provided", new Object[0]);
            return false;
        }
        long b;
        int i;
        this.f24714f = new C4770w(this);
        C0221j.m1129a(this.f24709a).m1132a(this.f24714f, new IntentFilter("verify_installed_packages_finished"));
        if (((Boolean) C0955b.cu.m28964b()).booleanValue() && this.f24711c.m8822b()) {
            ar arVar = new ar();
            this.f24717i = arVar.m22082a("device_wide_non_work_profile_phas");
            b = arVar.m22083b("device_wide_last_autoscan_with_pha");
            if (b == 0) {
                this.f24718j = -1;
            } else {
                this.f24718j = (int) ((C4678i.m21812a() - b) / TimeUnit.HOURS.toMillis(1));
            }
        } else if (!this.f24711c.m8822b()) {
            this.f24718j = -1;
        }
        b = System.currentTimeMillis() - ((Long) C0954a.f5814J.m5760a()).longValue();
        if (b < 0 || b >= ((Long) C0955b.cy.m28964b()).longValue()) {
            i = 0;
        } else {
            i = 1;
        }
        if (i != 0) {
            m22380b();
            return false;
        } else if (this.f24712d.mo4360a()) {
            return true;
        } else {
            return false;
        }
    }

    final synchronized void m22380b() {
        if (this.f24716h == null) {
            List a = br.m22198a(this.f24709a, this.f24715g, this.f24710b);
            C4717u c4717u = new C4717u();
            c4717u.f24262b = new C4718v[a.size()];
            for (int i = 0; i < a.size(); i++) {
                C4718v[] c4718vArr = c4717u.f24262b;
                Bundle bundle = (Bundle) a.get(i);
                C4718v c4718v = new C4718v();
                String string = bundle.getString("package_name");
                if (string == null) {
                    throw new NullPointerException();
                }
                c4718v.f24267b |= 1;
                c4718v.f24268c = string;
                int i2 = bundle.getInt("version_code");
                c4718v.f24267b |= 2;
                c4718v.f24269d = i2;
                byte[] byteArray = bundle.getByteArray("sha256");
                if (byteArray == null) {
                    throw new NullPointerException();
                }
                c4718v.f24267b |= 4;
                c4718v.f24270e = byteArray;
                String string2 = bundle.getString("threat_type");
                if (string2 == null) {
                    throw new NullPointerException();
                }
                c4718v.f24267b |= 8;
                c4718v.f24271f = string2;
                c4718vArr[i] = c4718v;
            }
            this.f24716h = c4717u;
            if (((Boolean) C0955b.cA.m28964b()).booleanValue()) {
                this.f24716h.m21949a(Math.max(((Long) C0954a.f5814J.m5760a()).longValue(), ((Long) C0954a.f5817M.m5760a()).longValue()));
            } else {
                this.f24716h.m21949a(((Long) C0954a.f5814J.m5760a()).longValue());
            }
        }
    }

    protected final void mo4344c() {
        if (this.f24714f != null) {
            C0221j.m1129a(this.f24709a).m1131a(this.f24714f);
        }
        if (this.f24713e != null) {
            try {
                if (this.f24716h != null) {
                    C4717u c4717u = this.f24716h;
                    boolean z = this.f24717i;
                    c4717u.f24261a |= 2;
                    c4717u.f24264d = z;
                    c4717u = this.f24716h;
                    int i = this.f24718j;
                    c4717u.f24261a |= 4;
                    c4717u.f24265e = i;
                    this.f24713e.mo4463a(true, C0757i.m4909a(this.f24716h));
                    return;
                }
                this.f24713e.mo4463a(false, null);
            } catch (RemoteException e) {
                FinskyLog.m21665c("Error while calling result callback: %s", e);
            }
        }
    }
}
