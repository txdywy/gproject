package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.am;

final class id implements Runnable {
    public /* synthetic */ String f26973a;
    public /* synthetic */ String f26974b;
    public /* synthetic */ Object f26975c;
    public /* synthetic */ long f26976d;
    public /* synthetic */ ib f26977e;

    id(ib ibVar, String str, String str2, Object obj, long j) {
        this.f26977e = ibVar;
        this.f26973a = str;
        this.f26974b = str2;
        this.f26975c = obj;
        this.f26976d = j;
    }

    public final void run() {
        hy hyVar = this.f26977e;
        String str = this.f26973a;
        String str2 = this.f26974b;
        Object obj = this.f26975c;
        long j = this.f26976d;
        am.m23735a(str);
        am.m23735a(str2);
        hyVar.mo4728b();
        hyVar.mo4727a();
        hyVar.m24432x();
        if (!hyVar.p.m24769l()) {
            hyVar.mo4742p().f26850i.m24652a("User property not set since app measurement is disabled");
        } else if (hyVar.p.m24759b()) {
            boolean z;
            hyVar.mo4742p().f26850i.m24654a("Setting user property (FE)", hyVar.mo4738l().m24602a(str2), obj);
            zzcvg com_google_android_gms_internal_zzcvg = new zzcvg(str2, j, obj, str);
            hy g = hyVar.mo4733g();
            g.mo4728b();
            g.m24432x();
            gj.m24442H();
            hy k = g.mo4737k();
            Parcel obtain = Parcel.obtain();
            com_google_android_gms_internal_zzcvg.writeToParcel(obtain, 0);
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            if (marshall.length > 131072) {
                k.mo4742p().f26847f.m24652a("User property too long for local database. Sending directly to service");
                z = false;
            } else {
                z = k.m24579a(1, marshall);
            }
            if (z) {
                z = true;
            } else {
                z = false;
            }
            g.m24828a(new it(g, z, com_google_android_gms_internal_zzcvg));
        }
    }
}
