package com.google.android.finsky.p187g;

import android.annotation.TargetApi;
import android.app.backup.BackupManager;
import com.google.android.finsky.utils.FinskyLog;

@TargetApi(26)
public final class C3152a implements C3151c {
    public final BackupManager f16316a;

    public C3152a(BackupManager backupManager) {
        this.f16316a = backupManager;
    }

    public final void mo3332a(String[] strArr, C2890e c2890e) {
        try {
            this.f16316a.requestBackup(strArr, new C3153b(c2890e));
        } catch (SecurityException e) {
            FinskyLog.m21659a("Could not request backups, android.permission.BACKUP permission not granted: %s", e);
            for (String b : strArr) {
                c2890e.mo3190b(b);
            }
        }
    }
}
