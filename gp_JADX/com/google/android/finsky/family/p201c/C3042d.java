package com.google.android.finsky.family.p201c;

import android.support.design.widget.Snackbar;
import com.android.volley.C0660x;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.utils.FinskyLog;

final class C3042d implements C0660x {
    public final /* synthetic */ boolean f15901a;
    public final /* synthetic */ C3039a f15902b;

    C3042d(C3039a c3039a, boolean z) {
        this.f15902b = c3039a;
        this.f15901a = z;
    }

    public final /* synthetic */ void b_(Object obj) {
        int i;
        int i2 = 1;
        if (this.f15901a) {
            C1045b c1045b = this.f15902b;
            CharSequence b = this.f15902b.m15691b(12, new Object[0]);
            if (c1045b.bt != null) {
                Snackbar.m500a(c1045b.bt, b, 0).m493a();
            }
        }
        C3039a c3039a = this.f15902b;
        boolean z = this.f15901a;
        switch (c3039a.f15893c) {
            case 1:
                i = 415;
                break;
            case 3:
                i = 413;
                break;
            case 4:
                i = 414;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            FinskyLog.m21662b("Cannot log event for sharing settings for unrecognized backend ID %d", Integer.valueOf(c3039a.f15893c));
            return;
        }
        C2474c c2474c = new C2474c(i);
        if (!z) {
            i2 = 0;
        }
        C1473m.f7980a.dc().m13319a(c2474c.m13243b(Integer.valueOf(i2)).f13342a, null);
    }
}
