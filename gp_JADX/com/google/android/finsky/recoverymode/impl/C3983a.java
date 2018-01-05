package com.google.android.finsky.recoverymode.impl;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.cf;
import android.support.v4.app.cg;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ay.C1534b;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.safemode.SafeModeService;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.am;
import com.squareup.leakcanary.C7582R;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

public final class C3983a implements C3982a {
    public final Context f20073b;
    public final File f20074c = new File(this.f20073b.getCacheDir(), String.format(Locale.US, "%s%d", new Object[]{"safe_mode", Integer.valueOf(808539)}));
    public final boolean f20075d;
    public int f20076e;

    public C3983a(Context context, String str) {
        this.f20073b = context;
        this.f20075d = "com.android.vending:recovery_mode".equals(str);
        this.f20076e = 0;
    }

    public final boolean mo3874a() {
        return this.f20075d;
    }

    public final boolean mo3875b() {
        if (!((Boolean) C0955b.fZ.m28964b()).booleanValue() && !((Boolean) C0955b.gd.m28964b()).booleanValue()) {
            m18709i();
            return false;
        } else if (this.f20074c.exists()) {
            boolean z;
            long lastModified = this.f20074c.lastModified();
            long a = C4678i.m21812a() - lastModified;
            if (lastModified <= 0 || a < 0 || a >= ((Long) C0955b.gb.m28964b()).longValue()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return z;
            }
            m18709i();
            return z;
        } else {
            m18709i();
            return false;
        }
    }

    public final int mo3876c() {
        Throwable th;
        if (this.f20076e == 0 && this.f20074c.exists()) {
            Closeable closeable = null;
            Closeable fileInputStream;
            try {
                fileInputStream = new FileInputStream(this.f20074c);
                try {
                    switch (fileInputStream.read()) {
                        case 1:
                            this.f20076e = 1;
                            break;
                        case 2:
                            this.f20076e = 2;
                            break;
                        default:
                            this.f20076e = 0;
                            break;
                    }
                    C4679j.m21814a(fileInputStream);
                } catch (IOException e) {
                    try {
                        this.f20076e = 0;
                        C4679j.m21814a(fileInputStream);
                        return this.f20076e;
                    } catch (Throwable th2) {
                        Throwable th3 = th2;
                        closeable = fileInputStream;
                        th = th3;
                        C4679j.m21814a(closeable);
                        throw th;
                    }
                }
            } catch (IOException e2) {
                fileInputStream = null;
                this.f20076e = 0;
                C4679j.m21814a(fileInputStream);
                return this.f20076e;
            } catch (Throwable th4) {
                th = th4;
                C4679j.m21814a(closeable);
                throw th;
            }
        }
        return this.f20076e;
    }

    public final void mo3877d() {
        if (!((Boolean) C0955b.fZ.m28964b()).booleanValue()) {
            try {
                FinskyLog.m21665c("Not entering safe mode - is disabled.", new Object[0]);
            } catch (Throwable th) {
            }
        } else if (m18708h()) {
            am.m21703a("Entering safe mode.");
            this.f20073b.startService(new Intent(this.f20073b, SafeModeService.class));
        }
    }

    private final boolean m18708h() {
        Closeable fileOutputStream;
        Throwable e;
        this.f20074c.delete();
        Closeable closeable = null;
        try {
            this.f20074c.createNewFile();
            fileOutputStream = new FileOutputStream(this.f20074c);
            try {
                fileOutputStream.write(1);
                C4679j.m21814a(fileOutputStream);
                return true;
            } catch (IOException e2) {
                e = e2;
                try {
                    am.m21704a(e, "Could not create marker file for recovery mode.");
                    C4679j.m21814a(fileOutputStream);
                    return false;
                } catch (Throwable th) {
                    e = th;
                    closeable = fileOutputStream;
                    C4679j.m21814a(closeable);
                    throw e;
                }
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream = null;
            am.m21704a(e, "Could not create marker file for recovery mode.");
            C4679j.m21814a(fileOutputStream);
            return false;
        } catch (Throwable th2) {
            e = th2;
            C4679j.m21814a(closeable);
            throw e;
        }
    }

    public final void mo3878e() {
        switch (this.f20076e) {
            case 1:
                am.m21703a("Exiting safe mode.");
                break;
            case 2:
                am.m21703a("Exiting emergency self update.");
                break;
            default:
                am.m21703a("Exiting recovery mode.");
                break;
        }
        m18709i();
    }

    private final void m18709i() {
        this.f20074c.delete();
        this.f20073b.stopService(new Intent(this.f20073b, SafeModeService.class));
        if (((Boolean) C0955b.gd.m28964b()).booleanValue()) {
            this.f20073b.stopService(new Intent(this.f20073b, C1534b.class));
        }
    }

    public final void mo3879f() {
        Intent intent = new Intent(this.f20073b, RecoveryModeActivity.class);
        intent.addFlags(884998144);
        this.f20073b.startActivity(intent);
    }

    public final Notification mo3880g() {
        Intent intent = new Intent(this.f20073b, RecoveryModeActivity.class);
        CharSequence string = this.f20073b.getString(C7582R.string.foreground_hygiene);
        PendingIntent activity = PendingIntent.getActivity(this.f20073b, a, intent, 1342177280);
        cg cgVar = new cg(this.f20073b, "5.maintenance-channel");
        cgVar.m1424a(2, true);
        cgVar = cgVar.m1415a((int) C7582R.drawable.stat_notify_update).m1426c(string).m1418a(C4678i.m21812a());
        cgVar.f1522z = "status";
        cgVar.f1485C = 0;
        cgVar.f1507k = 1;
        cgVar.f1519w = true;
        cgVar = cgVar.m1425b(string);
        cgVar.f1501e = activity;
        return cgVar.m1421a(new cf().m1412b(string)).m1414a();
    }
}
