package com.google.android.finsky.bs;

import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.utils.FinskyLog;
import p002a.C0002a;

public final class C2178b implements C0983h {
    public final Context f10950a;
    public final C1461c f10951b;
    public final C0002a f10952c;

    public C2178b(Context context, C1461c c1461c, C0002a c0002a) {
        this.f10950a = context;
        this.f10951b = c1461c;
        this.f10952c = c0002a;
    }

    public final void mo1175b(String str, boolean z) {
        if ("com.google.android.instantapps.supervisor".equals(str)) {
            m11445a(str, 1, "install/update");
            if (!this.f10951b.dj().mo2294a(12626696)) {
                Context context = this.f10950a;
                Intent intent = new Intent((String) C0955b.gw.m28964b());
                intent.setClassName("com.google.android.instantapps.supervisor", (String) C0955b.gx.m28964b());
                if (context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty()) {
                    FinskyLog.m21662b("No receiver found for intent: %s", intent);
                    return;
                }
                intent.setFlags(32);
                FinskyLog.m21662b("Sending broadcast: %s", intent);
                context.sendBroadcast(intent);
            }
        }
    }

    public final void mo1176c(String str, boolean z) {
        if (!z && "com.google.android.instantapps.supervisor".equals(str)) {
            m11445a(str, 2, "removed");
        }
    }

    private final void m11445a(String str, int i, String str2) {
        ((C3646a) this.f10952c.mo1a()).m17248a(new C2179c(this, str, i, str2));
    }

    public final void mo1177d(String str) {
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1178e(String str) {
    }
}
