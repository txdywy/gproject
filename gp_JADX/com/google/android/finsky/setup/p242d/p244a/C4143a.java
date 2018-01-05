package com.google.android.finsky.setup.p242d.p244a;

import android.accounts.Account;
import android.content.Context;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p257t.C4562a;
import com.google.android.finsky.setup.af;
import com.google.android.finsky.setup.ag;
import com.google.android.finsky.setup.ah;
import com.google.android.finsky.setup.al;
import com.google.android.finsky.setup.bs;
import com.google.android.finsky.setup.p240a.C4126m;
import com.google.android.finsky.setup.p242d.C4138b;
import com.google.android.finsky.setup.p242d.C4142a;
import com.google.android.finsky.utils.FinskyLog;

public final class C4143a implements C4142a {
    public final Context f20969a;
    public final C4138b f20970b;
    public final af f20971c;
    public final C1287h f20972d;
    public final C1463g f20973e;
    public final C0986a f20974f;
    public final C4562a f20975g;
    public final bs f20976h;
    public final al f20977i;
    public final C4126m f20978j;

    public C4143a(Context context, C4138b c4138b, af afVar, C1287h c1287h, C1463g c1463g, C0986a c0986a, C4562a c4562a, bs bsVar, al alVar, C4126m c4126m) {
        this.f20969a = context;
        this.f20970b = c4138b;
        this.f20971c = afVar;
        this.f20972d = c1287h;
        this.f20973e = c1463g;
        this.f20974f = c0986a;
        this.f20975g = c4562a;
        this.f20976h = bsVar;
        this.f20977i = alVar;
        this.f20978j = c4126m;
    }

    public final void mo3965a(Runnable runnable) {
        af afVar = this.f20971c;
        afVar.f20762a.m12009a(new ag(afVar, runnable));
    }

    public final void mo3966a(String str) {
        int i = 0;
        Account[] d = this.f20974f.mo1188d();
        if (d.length <= 0) {
            this.f20976h.mo3945a(3);
            FinskyLog.m21667d("RestoreService can't run - no accounts configured on device!", new Object[0]);
            return;
        }
        int length = d.length;
        while (i < length) {
            m19414b(d[i].name, str);
            i++;
        }
    }

    public final void mo3967a(String str, String str2) {
        if (this.f20974f.mo1183b(str) == null) {
            this.f20976h.mo3945a(2);
            FinskyLog.m21667d("Can't find restore acct:%s", FinskyLog.m21655a(str));
            return;
        }
        m19414b(str, str2);
    }

    public final boolean mo3968a() {
        for (String str : this.f20971c.m19186a()) {
            int b = this.f20971c.m19188b(str);
            if (b >= ((Integer) C0955b.bj.m28964b()).intValue()) {
                FinskyLog.m21659a("Reached limit %d for %s", Integer.valueOf(b), FinskyLog.m21655a(str));
                m19417a(str, b, 7, null);
                this.f20971c.m19187a(str);
                this.f20970b.mo3941a();
            } else {
                String str2;
                FinskyLog.m21659a("Recover fetch for account %s", FinskyLog.m21655a(str));
                ah ahVar = (ah) this.f20971c.f20763b.get(str);
                if (ahVar != null) {
                    str2 = ahVar.f20768b;
                } else {
                    str2 = null;
                }
                mo3967a(str, str2);
            }
        }
        return mo3969b();
    }

    public final boolean mo3969b() {
        for (String c : this.f20971c.m19186a()) {
            if (this.f20971c.m19189c(c)) {
                return true;
            }
        }
        return false;
    }

    private final void m19414b(String str, String str2) {
        if (this.f20971c.m19189c(str)) {
            FinskyLog.m21659a("Skip setup acct:%s already started", FinskyLog.m21655a(str));
            return;
        }
        try {
            long parseLong = Long.parseLong(str2, 16);
            af afVar = this.f20971c;
            ah ahVar = (ah) afVar.f20763b.get(str);
            if (ahVar == null) {
                ahVar = new ah();
                ahVar.f20767a = 0;
                afVar.f20763b.put(str, ahVar);
            }
            ahVar.f20767a++;
            ahVar.f20768b = str2;
            ahVar.f20769c = true;
            afVar.m19190d(str);
            this.f20976h.mo3962c(str, this.f20971c.m19188b(str));
            FinskyLog.m21659a("Start setup aid:%s acct:%s", FinskyLog.m21655a(str2), FinskyLog.m21655a(str));
            this.f20975g.m21190a(this.f20972d.mo2016a(str), C2693e.m14552a(), parseLong, new C4144b(this, str), new C4145c(this, str, str2));
        } catch (NumberFormatException e) {
            this.f20976h.mo3945a(1);
            FinskyLog.m21667d("Provided aid can't be parsed as long: %s", FinskyLog.m21655a(str2));
        }
    }

    final void m19417a(String str, int i, int i2, Throwable th) {
        this.f20973e.mo2242f(str).m13319a(new C2474c(118).m13210a(i2).m13238a(th).m13246c(i).f13342a, null);
    }
}
