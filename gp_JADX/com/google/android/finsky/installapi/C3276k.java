package com.google.android.finsky.installapi;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.utils.FinskyLog;

public final class C3276k implements C1003o {
    public final Context f16849a;
    public final C3646a f16850b;

    public C3276k(Context context, C3646a c3646a) {
        this.f16849a = context;
        this.f16850b = c3646a;
    }

    public final void mo1205a(C3369m c3369m) {
        if (((Boolean) C0955b.gz.m28964b()).booleanValue()) {
            C3647b a = this.f16850b.m17243a(c3369m.m16819a());
            if (a != null && a.f18029d != null) {
                String str = a.f18029d.f10796C;
                if (!TextUtils.isEmpty(str)) {
                    if (this.f16850b.f18023c.mo2854a(str) == null) {
                        FinskyLog.m21665c("%s is being installed but the requesting package %s is not installed", c3369m.m16819a(), str);
                        return;
                    }
                    Intent intent = new Intent("com.google.android.finsky.installapi.ACTION_INSTALL_STATUS");
                    intent.setPackage(str);
                    intent.putExtra("package_name", c3369m.m16819a());
                    intent.putExtra("package_event", c3369m.f17273c.f17153d);
                    if (c3369m.f17273c.f17153d == 3 || c3369m.f17273c.f17153d == 5) {
                        intent.putExtra("error_code", c3369m.m16820b());
                    }
                    this.f16849a.sendBroadcast(intent);
                }
            }
        }
    }
}
