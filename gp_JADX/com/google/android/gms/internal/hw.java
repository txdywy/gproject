package com.google.android.gms.internal;

import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

final class hw implements Runnable {
    public /* synthetic */ hv f26952a;

    hw(hv hvVar) {
        this.f26952a = hvVar;
    }

    public final void run() {
        hv hvVar = this.f26952a;
        hvVar.m24762e().mo4728b();
        hy h = hvVar.m24765h();
        h.mo4728b();
        h.m24432x();
        if (h.m24499v()) {
            long a = h.mo4743q().f26869g.m24685a();
            long b = h.mo4735i().mo4630b();
            if (Math.abs(b - a) > gj.m24445M()) {
                h.mo4743q().f26869g.m24686a(b);
                h.mo4728b();
                h.m24432x();
                if (h.m24499v()) {
                    int delete = h.m24497t().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(h.mo4735i().mo4629a()), String.valueOf(gj.m24444L())});
                    if (delete > 0) {
                        h.mo4742p().f26851j.m24653a("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
        if (hvVar.m24760c().f26866d.m24685a() == 0) {
            hvVar.m24760c().f26866d.m24686a(hvVar.f26939n.mo4629a());
        }
        if (Long.valueOf(hvVar.m24760c().f26870h.m24685a()).longValue() == 0) {
            hvVar.m24761d().f26851j.m24653a("Persisting first open", Long.valueOf(hvVar.f26926D));
            hvVar.m24760c().f26870h.m24686a(hvVar.f26926D);
        }
        if (hvVar.m24759b()) {
            gj.m24442H();
            if (!TextUtils.isEmpty(hvVar.m24768k().m24576u())) {
                h = hvVar.m24760c();
                h.mo4728b();
                String string = h.m24683t().getString("gmp_app_id", null);
                if (string == null) {
                    hvVar.m24760c().m24680a(hvVar.m24768k().m24576u());
                } else if (!string.equals(hvVar.m24768k().m24576u())) {
                    boolean a2;
                    hvVar.m24761d().f26849h.m24652a("Rechecking which service to use due to a GMP App Id change");
                    hy c = hvVar.m24760c();
                    c.mo4728b();
                    c.mo4742p().f26851j.m24652a("Clearing collection preferences.");
                    boolean contains = c.m24683t().contains("measurement_enabled");
                    if (contains) {
                        a2 = c.m24681a(true);
                    } else {
                        a2 = true;
                    }
                    Editor edit = c.m24683t().edit();
                    edit.clear();
                    edit.apply();
                    if (contains) {
                        c.mo4728b();
                        c.mo4742p().f26851j.m24653a("Setting measurementEnabled", Boolean.valueOf(a2));
                        Editor edit2 = c.m24683t().edit();
                        edit2.putBoolean("measurement_enabled", a2);
                        edit2.apply();
                    }
                    hvVar.f26941p.m24850z();
                    hvVar.f26941p.m24849v();
                    hvVar.m24760c().m24680a(hvVar.m24768k().m24576u());
                    hvVar.m24760c().f26870h.m24686a(hvVar.f26926D);
                    hvVar.m24760c().f26871i.m24689a(null);
                }
            }
            ib f = hvVar.m24763f();
            hn hnVar = hvVar.m24760c().f26871i;
            if (!hnVar.f26894b) {
                hnVar.f26894b = true;
                hnVar.f26895c = hnVar.f26896d.f26864b.getString(hnVar.f26893a, null);
            }
            f.m24774a(hnVar.f26895c);
            gj.m24442H();
            if (!TextUtils.isEmpty(hvVar.m24768k().m24576u())) {
                h = hvVar.m24763f();
                h.mo4728b();
                h.mo4727a();
                h.m24432x();
                if (h.p.m24759b()) {
                    hy g = h.mo4733g();
                    g.mo4728b();
                    g.m24432x();
                    g.m24828a(new io(g));
                    g = h.mo4743q();
                    g.mo4728b();
                    String string2 = g.m24683t().getString("previous_os_version", null);
                    g.mo4732f().m24432x();
                    String str = VERSION.RELEASE;
                    if (!(TextUtils.isEmpty(str) || str.equals(string2))) {
                        Editor edit3 = g.m24683t().edit();
                        edit3.putString("previous_os_version", str);
                        edit3.apply();
                    }
                    if (!TextUtils.isEmpty(string2)) {
                        h.mo4732f().m24432x();
                        if (!string2.equals(VERSION.RELEASE)) {
                            Bundle bundle = new Bundle();
                            bundle.putString("_po", string2);
                            h.m24776a("auto", "_ou", bundle);
                        }
                    }
                }
                h = hvVar.m24767j();
                AtomicReference atomicReference = new AtomicReference();
                h.mo4728b();
                h.m24432x();
                h.m24828a(new in(h, atomicReference));
            }
        } else if (hvVar.m24769l()) {
            if (!hvVar.m24764g().m24938b("android.permission.INTERNET")) {
                hvVar.m24761d().f26845d.m24652a("App is missing INTERNET permission");
            }
            if (!hvVar.m24764g().m24938b("android.permission.ACCESS_NETWORK_STATE")) {
                hvVar.m24761d().f26845d.m24652a("App is missing ACCESS_NETWORK_STATE permission");
            }
            gj.m24442H();
            if (!dr.f26667b.m24299a(hvVar.f26927b).m24296a()) {
                if (!ho.m24690a(hvVar.f26927b)) {
                    hvVar.m24761d().f26845d.m24652a("AppMeasurementReceiver not registered/enabled");
                }
                if (!ja.m24856a(hvVar.f26927b)) {
                    hvVar.m24761d().f26845d.m24652a("AppMeasurementService not registered/enabled");
                }
            }
            hvVar.m24761d().f26845d.m24652a("Uploading is not possible. App measurement disabled");
        }
        hvVar.m24770m();
    }
}
