package com.google.android.finsky.p187g;

import android.app.backup.BackupObserver;
import com.google.android.finsky.utils.FinskyLog;

final class C3153b extends BackupObserver {
    public final /* synthetic */ C2890e f16317a;

    C3153b(C2890e c2890e) {
        this.f16317a = c2890e;
    }

    public final void onResult(String str, int i) {
        FinskyLog.m21659a("backup done for package %s with status %d", str, Integer.valueOf(i));
        this.f16317a.mo3189a(str);
    }
}
