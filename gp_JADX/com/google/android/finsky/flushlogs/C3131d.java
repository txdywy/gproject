package com.google.android.finsky.flushlogs;

import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.ah;
import com.google.android.finsky.scheduler.p238b.C4026d;
import com.google.android.finsky.utils.C4674e;
import com.google.android.finsky.utils.FinskyLog;

public class C3131d extends ah {
    public C1463g f16134a;
    public C0986a f16135c;
    public C4674e f16136d;

    protected final boolean mo1168a(C4026d c4026d) {
        ((C1385c) C3947d.m18649a(C1385c.class)).mo1841a(this);
        this.f16136d.newThread(new C3132e(this)).start();
        return true;
    }

    protected final boolean k_(int i) {
        FinskyLog.m21659a("FlushLogsJob stopped for reason %d", Integer.valueOf(i));
        return false;
    }
}
