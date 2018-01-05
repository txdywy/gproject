package com.google.android.finsky.activities;

import android.content.Context;
import android.widget.Toast;
import com.google.android.finsky.C1406o;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;

public class ay extends ah {
    public Context f6471a;

    protected final boolean mo1168a(C4026d c4026d) {
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1700a(this);
        Toast.makeText(this.f6471a, "Debug Job Started. Check Logcat for details", 1).show();
        FinskyLog.m21659a("Debug job details: \nCurrentRTC: %d\nDeadline Expired: %b\n%s", Long.valueOf(C4678i.m21812a()), Boolean.valueOf(c4026d.m18860e()), c4026d);
        return false;
    }

    protected final boolean k_(int i) {
        return false;
    }
}
