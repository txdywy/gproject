package com.google.android.finsky.as;

import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.os.Build$VERSION;
import android.os.PersistableBundle;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.dw.a;
import com.google.android.finsky.dw.c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;

public final synchronized class com.google.android.finsky.as.b
{

    public Boolean a;
    public Boolean b;
    public boolean c;
    public final Context d;
    public final com.google.android.finsky.dw.c e;

    b(Context p0, com.google.android.finsky.dw.c p1) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = p0;
        this.e = p1;
    }

    private final synchronized boolean a() {
        enter this;
        try {
            if (this.a == 0) {
                try {
                    this.a = Boolean.valueOf(((DevicePolicyManager)this.d.getSystemService("device_policy")).isDeviceOwnerApp((String)com.google.android.finsky.aa.b.aU.b()));
                }
                catch (NoSuchMethodError ex) {
                    try {
                        FinskyLog.b(ex, "No method named isDeviceOwnerApp exists.", new Object[0]);
                        this.a = Boolean.valueOf(0);
                    }
                    catch (Throwable ex) {
                        exit this;
                        throw ex;
                    }
                }
                catch (RuntimeException ex) {
                    try {
                        FinskyLog.b(ex, "Unable to invoke isDeviceOwnerApp", new Object[0]);
                        this.a = Boolean.valueOf(0);
                    }
                    catch (Throwable ex) {
                        exit this;
                        throw ex;
                    }
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return this.a.booleanValue();
    }

    private final synchronized void b(com.google.android.finsky.as.c p0) {
        enter this;
        try {
            v1 = new Intent("com.google.android.nfcprovision.IOwnedService.BIND");
            v1.setComponent(new ComponentName("com.google.android.nfcprovision", "com.google.android.nfcprovision.SchoolOwnedService"));
            if (!this.d.bindService(v1, new com.google.android.finsky.as.d(this, this.d, p0), 1)) {
                this.b = Boolean.valueOf(0);
                p0.a(0);
            }
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final Intent a(Activity p0) {
        if (this.c != 0)
            v0 = 0;
        else {
            v0 = ((RestrictionsManager)p0.getSystemService("restrictions")).createLocalApprovalIntent();
            v1 = new PersistableBundle();
            v1.putString("android.request.mesg", p0.getString(2131953024));
            v0.putExtra("android.content.extra.REQUEST_BUNDLE", v1);
        }
        return v0;
    }

    public final synchronized void a(com.google.android.finsky.as.c p0) {
  0:    enter this;
  3:    if (this.b != 0) {
 42:        p0.a(this.b.booleanValue());
 45:        exit this;
 46:        return;
        }
 13:    if (this.e.a.b()) {
 34:        this.b = Boolean.valueOf(1);
 42:        p0.a(this.b.booleanValue());
 45:        exit this;
 46:        return;
        }
 27:    if (!((Boolean)com.google.android.finsky.aa.b.l.b()).booleanValue()) goto 47;
 34:    this.b = Boolean.valueOf(1);
 42:    p0.a(this.b.booleanValue());
 45:    exit this;
 46:    return;
 51:    if (Build$VERSION.SDK_INT < 18) goto 66;
 57:    if (!this.a()) goto 66;
 59:    this.b(p0);
 62:    goto 45;
 64:    exit this;
 65:    throw ex;
 67:    try {
 71:        this.b = Boolean.valueOf(0);
        }
        catch (Throwable ex) {
 64:        exit this;
 65:        throw ex;
        }
 73:    goto 36;
 75:    try
            run 47...62
        catch (Throwable ex) {
 47:        goto 63;
        }
 76:    try
            run 1...45
        catch (Throwable ex) {
  1:        goto 63;
        }
    }

}
