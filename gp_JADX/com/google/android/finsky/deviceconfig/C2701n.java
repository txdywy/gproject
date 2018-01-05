package com.google.android.finsky.deviceconfig;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gcm.C4882b;

public final class C2701n {
    public final Context f14857a;

    public C2701n(Context context) {
        this.f14857a = context;
    }

    public final String m14578a() {
        Context context = this.f14857a;
        int i = VERSION.SDK_INT;
        if (i < 8) {
            throw new UnsupportedOperationException("Device must be at least API Level 8 (instead of " + i + ")");
        }
        try {
            context.getPackageManager().getPackageInfo("com.google.android.gsf", 0);
            String b = C4882b.m22906b(this.f14857a);
            if (!TextUtils.isEmpty(b)) {
                return b;
            }
            FinskyLog.m21659a("Start requesting GCM Reg Id", new Object[0]);
            context = this.f14857a;
            String[] strArr = new String[]{"932144863878"};
            C4882b.m22907c(context);
            C4882b.m22905a(context, strArr);
            return null;
        } catch (NameNotFoundException e) {
            throw new UnsupportedOperationException("Device does not have package com.google.android.gsf");
        }
    }

    public final void m14579a(C1254c c1254c) {
        Object b = C4882b.m22906b(this.f14857a);
        if (!TextUtils.isEmpty(b) && !b.equals(C0954a.f5843m.m5760a())) {
            FinskyLog.m21659a("Uploading GcmRegistration Id because not registered yet", new Object[0]);
            C2693e.m14552a().m14563a(c1254c, true, null);
        }
    }
}
