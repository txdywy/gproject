package com.google.android.instantapps.common.p221d.p222a;

import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.p306h.p307a.p308a.C5678o;
import com.google.android.p306h.p307a.p308a.C5684u;
import com.google.android.p306h.p307a.p308a.C5685v;
import com.google.android.play.p179a.C6216a;
import com.google.protobuf.nano.C0757i;

final class C5714d implements C5713v {
    public final /* synthetic */ boolean f28930a;
    public final /* synthetic */ ac f28931b;
    public final /* synthetic */ long f28932c;
    public final /* synthetic */ long f28933d;
    public final /* synthetic */ long f28934e;
    public final /* synthetic */ C5710a f28935f;

    C5714d(C5710a c5710a, boolean z, ac acVar, long j, long j2, long j3) {
        this.f28935f = c5710a;
        this.f28930a = z;
        this.f28931b = acVar;
        this.f28932c = j;
        this.f28933d = j2;
        this.f28934e = j3;
    }

    public final void mo5141a(C5724n c5724n) {
        if (!this.f28930a) {
            this.f28935f.f28891o.mo3541a();
        }
        try {
            C5710a c5710a = this.f28935f;
            ac acVar = this.f28931b;
            long j = this.f28932c;
            long j2 = this.f28933d;
            long j3 = this.f28934e;
            C0757i c5685v = new C5685v();
            c5685v.f28839c = Long.valueOf(j);
            if (j2 != -1) {
                c5685v.f28840d = Long.valueOf(j2);
            }
            c5685v.f28837a = Integer.valueOf(acVar.f28906g);
            c5685v.f28841e = acVar.f28902c;
            if (acVar.f28900a != null) {
                if (c5685v.f28841e == null) {
                    c5685v.f28841e = new C5678o();
                }
                c5685v.f28841e.f28785b = c5710a.f28880d.m27011a(acVar.f28900a, acVar.f28907h);
            }
            if (acVar.f28901b != null) {
                if (c5685v.f28841e == null) {
                    c5685v.f28841e = new C5678o();
                }
                c5685v.f28841e.f28788e = acVar.f28901b;
            }
            int i = ((SharedPreferences) c5710a.f28887k.mo1a()).getInt("optInCount", 0);
            if (c5685v.f28837a.intValue() == 608) {
                int i2 = i + 1;
                ((SharedPreferences) c5710a.f28887k.mo1a()).edit().putInt("optInCount", i2).apply();
                i = i2;
            }
            try {
                c5685v.f28838b = c5710a.f28894r != null ? C5684u.m26922a(c5710a.f28894r) : new C5684u();
            } catch (Throwable e) {
                Log.e("LoggingContext", "Could not parse serialized WhDimensions", e);
                c5685v.f28838b = new C5684u();
            }
            c5685v.f28838b.f28827g = Integer.valueOf(C6216a.m28694a(c5710a.f28888l.getActiveNetworkInfo()));
            c5685v.f28838b.f28829i = Boolean.valueOf(c5710a.f28883g);
            c5685v.f28838b.f28828h = (Integer) c5710a.f28885i.mo5158a();
            c5685v.f28838b.f28826f = Integer.valueOf(i);
            c5685v.f28838b.f28834n = (Integer) c5710a.f28889m.mo1a();
            c5685v.f28838b.f28835o = (Integer) c5710a.f28890n.mo1a();
            new Object[1][0] = c5685v;
            c5724n.f28969a.m28724a("", c5724n.f28970b.m27036a(), C0757i.m4909a(c5685v), j3, null, new String[0]);
            if (((Boolean) c5710a.f28884h.mo5158a()).booleanValue()) {
                c5724n.f28969a.f31122P = true;
            }
            if (acVar.f28904e) {
                c5724n.m27020a(acVar.f28905f);
                c5710a.f28891o.mo3542b();
            }
        } catch (Throwable e2) {
            Log.e("LoggingContext", "Failed to log event.", e2);
        }
    }

    public final void mo5142a(Throwable th) {
        Log.e("LoggingContext", "Failed to get EventLogger.", th);
    }
}
