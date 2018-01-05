package com.google.android.finsky.updatechecker.impl;

import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.p238b.C4025c;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.updatechecker.C2239c;
import com.google.android.finsky.utils.FinskyLog;

public class C4654m extends ah implements C2239c {
    public C2471a f23967a;
    public C4661t f23968c;
    public C4026d f23969d;

    protected final boolean mo1168a(C4026d c4026d) {
        C2495w a;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int i2 = 100;
        int i3 = -1;
        ((C1448f) C3947d.m18649a(C1448f.class)).mo1969a(this);
        this.f23969d = c4026d;
        C4025c d = this.f23969d.m18859d();
        if (d == null) {
            a = this.f23967a.m13184a(null);
            z = false;
            z2 = false;
            z3 = false;
            i = 0;
        } else {
            i = d.m18846a("Finksy.AutoUpdateRescheduleReason", 0);
            z3 = Boolean.parseBoolean(d.m18854b("Finsky.AutoUpdateLogConditionsMet"));
            z2 = Boolean.parseBoolean(d.m18854b("Finsky.AutoUpdateRequirePower"));
            C2495w a2 = d.m18847a("Finsky.AutoUpdateLoggingContext", this.f23967a);
            if (a2 == null) {
                a2 = this.f23967a.m13184a(null);
            }
            i2 = d.m18846a("Finsky.AutoUpdateBatteryLevelThreshold", 100);
            z = Boolean.parseBoolean(d.m18854b("Finsky.AutoUpdateRequireDeviceIdle"));
            i3 = d.m18846a("Finsky.AutoUpdateRequiredNetworkType", -1);
            a = a2;
        }
        boolean e = this.f23969d.m18860e();
        if (!e || (i & 1) == 0) {
            FinskyLog.m21659a("JobScheduler invoked, loading libraries.", new Object[0]);
            this.f23968c.m21648a(new C4655n(this, e, i, d, a, z2, i2, z3, z, i3));
            return true;
        }
        FinskyLog.m21659a("Timed out waiting for job to be scheduled.", new Object[0]);
        this.f23969d = null;
        m5802b(C4651j.m21630a(d));
        return false;
    }

    protected final boolean k_(int i) {
        this.f23969d = null;
        return false;
    }

    public final void mo2827a(boolean z) {
        String str;
        if (this.f23969d != null) {
            m5802b(null);
        }
        if (z) {
            str = "auto-updates finished successfully.";
        } else {
            str = "finished w/error. waiting for next daily hygiene.";
        }
        FinskyLog.m21659a(str, new Object[0]);
    }
}
