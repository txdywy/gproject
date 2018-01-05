package com.google.android.finsky.family.p201c;

import android.support.design.widget.Snackbar;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.utils.FinskyLog;

final class C3040b implements C0660x {
    public final /* synthetic */ boolean f15896a;
    public final /* synthetic */ boolean f15897b;
    public final /* synthetic */ C3039a f15898c;

    C3040b(C3039a c3039a, boolean z, boolean z2) {
        this.f15898c = c3039a;
        this.f15896a = z;
        this.f15897b = z2;
    }

    public final /* synthetic */ void b_(Object obj) {
        int i = 1;
        int i2 = this.f15898c.f15893c;
        boolean z = this.f15896a;
        if (C3049j.f15917a != null) {
            C3049j.f15917a.mo3277a(i2, z);
        }
        if (this.f15897b) {
            CharSequence b = this.f15898c.m15691b(13, new Object[0]);
            C1045b c1045b = this.f15898c;
            if (c1045b.bt != null) {
                Snackbar.m500a(c1045b.bt, b, 0).m493a();
            }
        }
        C3039a c3039a = this.f15898c;
        boolean z2 = this.f15896a;
        switch (c3039a.f15893c) {
            case 1:
                i2 = 412;
                break;
            case 3:
                i2 = 410;
                break;
            case 4:
                i2 = 411;
                break;
            default:
                i2 = 0;
                break;
        }
        if (i2 == 0) {
            FinskyLog.m21662b("Cannot log event for sharing settings for unrecognized backend ID %d", Integer.valueOf(c3039a.f15893c));
            return;
        }
        C2474c c2474c = new C2474c(i2);
        if (!z2) {
            i = 0;
        }
        C1473m.f7980a.dc().m13319a(c2474c.m13243b(Integer.valueOf(i)).f13342a, null);
    }
}
