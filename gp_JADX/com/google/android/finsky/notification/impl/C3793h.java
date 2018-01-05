package com.google.android.finsky.notification.impl;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class C3793h implements C0978f {
    public static final C0978f f19069a = new C3793h();

    private C3793h() {
    }

    public final void mo1172a(C4809e c4809e) {
        InterruptedException e;
        try {
            if (((Long) c4809e.get()).longValue() <= 0) {
                FinskyLog.m21669e("Couldn't schedule a notification delivery", new Object[0]);
            }
        } catch (ExecutionException e2) {
            e = e2;
            FinskyLog.m21669e("Got an exception scheduling a delivery: %s", e);
        } catch (InterruptedException e3) {
            e = e3;
            FinskyLog.m21669e("Got an exception scheduling a delivery: %s", e);
        }
    }
}
