package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.measurement.C5312g;
import com.google.android.gms.measurement.C5338a;
import com.google.android.gms.measurement.C5340c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

final class ic implements Runnable {
    public /* synthetic */ String f26964a;
    public /* synthetic */ String f26965b;
    public /* synthetic */ long f26966c;
    public /* synthetic */ Bundle f26967d;
    public /* synthetic */ boolean f26968e = true;
    public /* synthetic */ boolean f26969f;
    public /* synthetic */ boolean f26970g;
    public /* synthetic */ String f26971h;
    public /* synthetic */ ib f26972i;

    ic(ib ibVar, String str, String str2, long j, Bundle bundle, boolean z) {
        this.f26972i = ibVar;
        this.f26964a = str;
        this.f26965b = str2;
        this.f26966c = j;
        this.f26967d = bundle;
        this.f26969f = z;
        this.f26970g = false;
        this.f26971h = null;
    }

    public final void run() {
        hy hyVar = this.f26972i;
        String str = this.f26964a;
        String str2 = this.f26965b;
        long j = this.f26966c;
        Bundle bundle = this.f26967d;
        boolean z = this.f26968e;
        boolean z2 = this.f26969f;
        boolean z3 = this.f26970g;
        String str3 = this.f26971h;
        am.m23735a(str);
        am.m23735a(str2);
        am.m23733a((Object) bundle);
        hyVar.mo4728b();
        hyVar.m24432x();
        if (hyVar.p.m24769l()) {
            if (!hyVar.f26962d) {
                hyVar.f26962d = true;
                try {
                    try {
                        Class.forName("com.google.android.gms.tagmanager.TagManagerService").getDeclaredMethod("initialize", new Class[]{Context.class}).invoke(null, new Object[]{hyVar.mo4736j()});
                    } catch (Exception e) {
                        hyVar.mo4742p().f26847f.m24653a("Failed to invoke Tag Manager's initialize() method", e);
                    }
                } catch (ClassNotFoundException e2) {
                    hyVar.mo4742p().f26849h.m24652a("Tag Manager is not found and thus will not be used");
                }
            }
            boolean equals = "am".equals(str);
            boolean c = jl.m24922c(str2);
            if (z && hyVar.f26960b != null && !c && !equals) {
                hyVar.mo4742p().f26850i.m24654a("Passing event to registered event handler (FE)", hyVar.mo4738l().m24602a(str2), hyVar.mo4738l().m24601a(bundle));
                hyVar.f26960b.m26063a();
                return;
            } else if (hyVar.p.m24759b()) {
                jl m = hyVar.mo4739m();
                int i = !m.m24933a("event", str2) ? 2 : !m.m24935a("event", C5338a.f27840a, str2) ? 13 : !m.m24932a("event", gj.m24461u(), str2) ? 2 : 0;
                if (i != 0) {
                    hyVar.mo4739m();
                    hyVar.p.m24764g().m24937b(i, "_ev", jl.m24914a(str2, gj.m24461u(), true), str2 != null ? str2.length() : 0);
                    return;
                }
                Object obj;
                List singletonList = Collections.singletonList("_o");
                Bundle a = hyVar.mo4739m().m24928a(str2, bundle, singletonList, z3, true);
                List arrayList = new ArrayList();
                arrayList.add(a);
                long nextLong = hyVar.mo4739m().m24958u().nextLong();
                int i2 = 0;
                String[] strArr = (String[]) a.keySet().toArray(new String[bundle.size()]);
                Arrays.sort(strArr);
                int length = strArr.length;
                int i3 = 0;
                while (i3 < length) {
                    int i4;
                    String str4 = strArr[i3];
                    obj = a.get(str4);
                    hyVar.mo4739m();
                    Bundle[] a2 = jl.m24919a(obj);
                    if (a2 != null) {
                        a.putInt(str4, a2.length);
                        for (i4 = 0; i4 < a2.length; i4++) {
                            Bundle a3 = hyVar.mo4739m().m24928a("_ep", a2[i4], singletonList, z3, false);
                            a3.putString("_en", str2);
                            a3.putLong("_eid", nextLong);
                            a3.putString("_gn", str4);
                            a3.putInt("_ll", a2.length);
                            a3.putInt("_i", i4);
                            arrayList.add(a3);
                        }
                        i4 = a2.length + i2;
                    } else {
                        i4 = i2;
                    }
                    i3++;
                    i2 = i4;
                }
                if (i2 != 0) {
                    a.putLong("_eid", nextLong);
                    a.putInt("_epc", i2);
                }
                gj.m24442H();
                C5312g t = hyVar.mo4734h().m24819t();
                if (t != null) {
                    if (!a.containsKey("_sc")) {
                        t.f26998a = true;
                    }
                }
                int i5 = 0;
                while (i5 < arrayList.size()) {
                    Bundle bundle2 = (Bundle) arrayList.get(i5);
                    String str5 = (i5 != 0 ? 1 : null) != null ? "_ep" : str2;
                    bundle2.putString("_o", str);
                    if (!bundle2.containsKey("_sc")) {
                        ig.m24798a(t, bundle2);
                    }
                    Bundle a4 = z2 ? hyVar.mo4739m().m24927a(bundle2) : bundle2;
                    hyVar.mo4742p().f26850i.m24654a("Logging event (FE)", hyVar.mo4738l().m24602a(str2), hyVar.mo4738l().m24601a(a4));
                    obj = new zzcqw(str5, new zzcqt(a4), str, j);
                    hy g = hyVar.mo4733g();
                    am.m23733a(obj);
                    g.mo4728b();
                    g.m24432x();
                    gj.m24442H();
                    hy k = g.mo4737k();
                    Parcel obtain = Parcel.obtain();
                    obj.writeToParcel(obtain, 0);
                    byte[] marshall = obtain.marshall();
                    obtain.recycle();
                    if (marshall.length > 131072) {
                        k.mo4742p().f26847f.m24652a("Event is too long for local database. Sending event directly to service");
                        c = false;
                    } else {
                        c = k.m24579a(0, marshall);
                    }
                    g.m24828a(new is(g, c, obj, str3));
                    if (!equals) {
                        for (C5340c c5340c : hyVar.f26961c) {
                            Bundle bundle3 = new Bundle(a4);
                            c5340c.m26064a();
                        }
                    }
                    i5++;
                }
                gj.m24442H();
                if (hyVar.mo4734h().m24819t() != null && "_ae".equals(str2)) {
                    hyVar.mo4740n().m24858a(true);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        hyVar.mo4742p().f26850i.m24652a("Event not sent since app measurement is disabled");
    }
}
