package com.google.android.instantapps.common.p221d.p222a;

import android.app.ApplicationErrorReport.CrashInfo;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.google.android.instantapps.common.C5804k;
import com.google.android.instantapps.common.p217e.bf;
import com.google.android.instantapps.p309a.C5699f;

public final class C5735z {
    public static final C5804k f29017a = new C5804k("LaunchResultLogger");
    public final C5710a f29018b;
    public final bf f29019c;
    public String f29020d;
    public af f29021e;

    C5735z(C5710a c5710a, bf bfVar) {
        this.f29018b = c5710a;
        this.f29019c = bfVar;
    }

    public final synchronized void m27040a(af afVar) {
        String str = (String) C5699f.m26959a(afVar.mo5140d());
        if (TextUtils.equals(this.f29020d, str)) {
            f29017a.m27210c("start() called multiple times for token: %s", this.f29020d);
            afVar.mo5136a(2515);
        } else {
            if (!TextUtils.isEmpty(this.f29020d)) {
                f29017a.m27210c("setResult never called for token: %s", this.f29020d);
                this.f29021e.mo5136a(2514);
            }
            f29017a.m27209b("loader started for token: %s", str);
            afVar.mo5136a(2501);
            this.f29021e = afVar;
            this.f29020d = str;
        }
    }

    public final synchronized void m27041a(af afVar, int i) {
        if (i != -1) {
            CharSequence d = afVar.mo5140d();
            if (TextUtils.isEmpty(d)) {
                this.f29018b.mo5139a(C5735z.m27039a(2518));
            } else {
                f29017a.m27209b("loader result (%d) set for token: %s", Integer.valueOf(i), this.f29020d);
                if (TextUtils.isEmpty(this.f29020d) || !TextUtils.equals(d, this.f29020d)) {
                    f29017a.m27210c("invalid call to setResult", new Object[0]);
                    if (this.f29021e == null) {
                        this.f29018b.mo5136a(2516);
                        this.f29018b.mo5139a(C5735z.m27039a(i));
                    } else {
                        this.f29021e.mo5136a(2516);
                    }
                }
                this.f29021e.mo5139a(C5735z.m27039a(i));
                this.f29020d = null;
            }
        } else if (!TextUtils.isEmpty(this.f29020d)) {
            this.f29018b.mo5136a(2517);
            this.f29018b.m26981a(null);
        }
    }

    public final synchronized void m27042a(Throwable th) {
        if (TextUtils.isEmpty(this.f29020d)) {
            f29017a.m27209b("crash occurred outside of launch", new Object[0]);
        } else {
            f29017a.m27209b("crash occurred for token: %s", this.f29020d);
            ConditionVariable conditionVariable = new ConditionVariable();
            af afVar = this.f29021e;
            ad adVar = new ad(2505);
            adVar.f28909b = new CrashInfo(th);
            afVar.mo5139a(adVar.m26988a(new aa(conditionVariable)).m26987a());
            if (!conditionVariable.block((long) ((Integer) this.f29019c.mo5158a()).intValue())) {
                f29017a.m27211d("Could not flush crash result", new Object[0]);
            }
            this.f29020d = null;
        }
    }

    private static ac m27039a(int i) {
        return new ad(i).m26988a(null).m26987a();
    }
}
