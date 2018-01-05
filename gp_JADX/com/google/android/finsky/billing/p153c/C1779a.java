package com.google.android.finsky.billing.p153c;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.billing.p131e.C1814a;
import com.google.android.finsky.billing.p131e.C1817e;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.by.C2229h;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.finsky.dfe.c.a.ef;
import com.google.wireless.android.finsky.dfe.c.a.l;
import com.google.wireless.android.finsky.dfe.c.a.m;
import com.google.wireless.android.finsky.dfe.c.a.n;
import com.google.wireless.android.finsky.dfe.c.a.o;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

public final class C1779a {
    public final C1506e f9206a;
    public final C2206c f9207b;
    public final SharedPreferences f9208c;
    public final Account f9209d;
    public final C1817e f9210e;
    public final C1784h f9211f;
    public final C1780b f9212g;
    public final C2320a f9213h;
    public Integer f9214i;
    public l f9215j;

    public C1779a(Context context, Account account, C1817e c1817e, C1784h c1784h, C1780b c1780b, C1506e c1506e, C2206c c2206c, C2320a c2320a, Bundle bundle) {
        this.f9208c = context.getSharedPreferences("AcquireClientConfigPrefs", 0);
        this.f9209d = account;
        this.f9210e = c1817e;
        this.f9211f = c1784h;
        this.f9212g = c1780b;
        this.f9206a = c1506e;
        this.f9207b = c2206c;
        this.f9213h = c2320a;
        if (bundle != null) {
            if (bundle.containsKey("AcquireClientConfigModel.consumptionAppVersionCode")) {
                this.f9214i = Integer.valueOf(bundle.getInt("AcquireClientConfigModel.consumptionAppVersionCode"));
            }
            this.f9215j = (l) ParcelableProto.m21673a(bundle, "AcquireClientConfigModel.clientConfig");
        }
    }

    public final l m9729a() {
        int i = 3;
        Object obj = 1;
        if (this.f9215j != null) {
            return this.f9215j;
        }
        String obj2;
        int i2;
        this.f9215j = new l();
        l lVar = this.f9215j;
        List arrayList = new ArrayList();
        for (Entry entry : this.f9208c.getAll().entrySet()) {
            m mVar = new m();
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException();
            }
            mVar.b |= 1;
            mVar.c = str;
            obj2 = entry.getValue().toString();
            if (obj2 == null) {
                throw new NullPointerException();
            }
            mVar.b |= 2;
            mVar.d = obj2;
            arrayList.add(mVar);
        }
        lVar.b = (m[]) arrayList.toArray(new m[arrayList.size()]);
        l lVar2 = this.f9215j;
        boolean b = this.f9210e.m9823b();
        lVar2.a |= 1;
        lVar2.c = b;
        lVar2 = this.f9215j;
        b = this.f9210e.m9824c();
        lVar2.a |= 2;
        lVar2.d = b;
        lVar2 = this.f9215j;
        b = this.f9210e.m9826e();
        lVar2.a |= 4;
        lVar2.e = b;
        l lVar3 = this.f9215j;
        if (((Boolean) C1814a.f9375e.m5777b(this.f9209d.name).m5760a()).booleanValue()) {
            i2 = 3;
        } else {
            i2 = 0;
        }
        lVar3.f = i2;
        lVar3.a |= 8;
        lVar2 = this.f9215j;
        lVar2.g = this.f9212g.f9225j;
        lVar2.a |= 16;
        lVar3 = this.f9215j;
        C0957n b2 = C1814a.f9372b.m5777b(this.f9209d.name);
        if (b2.m5764b()) {
            switch (((Integer) b2.m5760a()).intValue()) {
                case 0:
                    break;
                case 1:
                    i = 4;
                    break;
                case 2:
                    i = 2;
                    break;
            }
        }
        i = 0;
        lVar3.h = i;
        lVar3.a |= 32;
        lVar3 = this.f9215j;
        long longValue = ((Long) C0954a.f5827W.m5777b(this.f9209d.name).m5760a()).longValue();
        lVar3.a |= 64;
        lVar3.i = longValue;
        lVar3 = this.f9215j;
        boolean booleanValue = ((Boolean) C1814a.f9374d.m5777b(this.f9209d.name).m5760a()).booleanValue();
        lVar3.a |= 128;
        lVar3.j = booleanValue;
        lVar2 = this.f9215j;
        b = m9728b();
        lVar2.a |= 256;
        lVar2.k = b;
        lVar3 = this.f9215j;
        booleanValue = ((Long) C0954a.bu.m5777b(this.f9209d.name).m5760a()).longValue() > System.currentTimeMillis();
        lVar3.a |= 512;
        lVar3.l = booleanValue;
        lVar2 = this.f9215j;
        b = this.f9206a.m8839b();
        lVar2.a |= eq.FLAG_MOVED;
        lVar2.n = b;
        if (TextUtils.isEmpty(this.f9211f.f9238d)) {
            obj = null;
        }
        if (obj != null) {
            lVar2 = this.f9215j;
            str = this.f9211f.f9238d;
            if (str == null) {
                throw new NullPointerException();
            }
            lVar2.a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
            lVar2.m = str;
        }
        obj2 = (String) C0954a.aQ.m5777b(this.f9209d.name).m5760a();
        if (obj2 != null) {
            lVar3 = this.f9215j;
            if (obj2 == null) {
                throw new NullPointerException();
            }
            lVar3.a |= 8192;
            lVar3.p = obj2;
        }
        if (this.f9214i != null) {
            lVar2 = this.f9215j;
            long intValue = (long) this.f9214i.intValue();
            lVar2.a |= 32768;
            lVar2.r = intValue;
        }
        return this.f9215j;
    }

    private final boolean m9728b() {
        C2197a a = this.f9207b.mo2811a(this.f9209d);
        if (a == null) {
            return false;
        }
        for (C2227g c2227g : a.mo2793g(C2229h.f11125f)) {
            if (c2227g.f11105l == 29) {
                return true;
            }
        }
        return false;
    }

    public final void m9730a(n nVar) {
        if (nVar != null) {
            Editor edit;
            boolean z;
            this.f9215j = null;
            if (nVar.c != null) {
                edit = this.f9208c.edit();
                for (o oVar : nVar.c) {
                    edit.putString(oVar.c, oVar.d);
                }
            } else {
                edit = null;
            }
            if (nVar.d != null) {
                if (edit == null) {
                    edit = this.f9208c.edit();
                }
                for (String remove : nVar.d) {
                    edit.remove(remove);
                }
            }
            if (edit != null) {
                edit.apply();
            }
            if ((nVar.a & 4) != 0) {
                int i;
                switch (nVar.g) {
                    case 2:
                        i = 2;
                        break;
                    case 3:
                        i = 0;
                        break;
                    case 4:
                        i = 1;
                        break;
                    default:
                        i = -1;
                        break;
                }
                C1814a.f9372b.m5777b(this.f9209d.name).m5763a(Integer.valueOf(i));
            }
            if ((nVar.a & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (3 == nVar.f) {
                    z = true;
                } else {
                    z = false;
                }
                C1814a.f9375e.m5777b(this.f9209d.name).m5763a(Boolean.valueOf(z));
            }
            if (nVar.e) {
                try {
                    this.f9210e.m9825d();
                } catch (RuntimeException e) {
                }
            }
            if (nVar.h) {
                C0954a.f5827W.m5777b(this.f9209d.name).m5763a(Long.valueOf(System.currentTimeMillis()));
            }
            if (nVar.i) {
                C1814a.f9374d.m5777b(this.f9209d.name).m5763a(Boolean.valueOf(true));
            }
            if ((nVar.a & 32) != 0) {
                C0954a.bu.m5777b(this.f9209d.name).m5763a(Long.valueOf(nVar.j + System.currentTimeMillis()));
            }
            if ((nVar.a & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                C0954a.aQ.m5777b(this.f9209d.name).m5763a(nVar.m);
            }
            C1784h c1784h = this.f9211f;
            ef efVar = nVar.k;
            if (efVar != null) {
                c1784h.f9238d = null;
                if (c1784h.f9237c != null) {
                    c1784h.f9237c.cancel(true);
                }
                c1784h.f9237c = new C1785i(c1784h, efVar);
                bb.m21792a(c1784h.f9237c, new Void[0]);
            }
            if (nVar.n != null) {
                C2322b a = this.f9213h.mo2854a(nVar.n.f11833b);
                if (a != null) {
                    this.f9214i = Integer.valueOf(a.f11419d);
                }
            }
        }
    }
}
