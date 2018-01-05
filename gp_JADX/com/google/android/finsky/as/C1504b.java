package com.google.android.finsky.as;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.ServiceConnection;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.os.PersistableBundle;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.dw.C2909c;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public class C1504b {
    public Boolean f8186a = null;
    public Boolean f8187b = null;
    public boolean f8188c = false;
    public final Context f8189d;
    public final C2909c f8190e;

    public C1504b(Context context, C2909c c2909c) {
        this.f8189d = context;
        this.f8190e = c2909c;
    }

    @TargetApi(21)
    public final Intent m8836a(Activity activity) {
        if (this.f8188c) {
            return null;
        }
        Intent createLocalApprovalIntent = ((RestrictionsManager) activity.getSystemService("restrictions")).createLocalApprovalIntent();
        Parcelable persistableBundle = new PersistableBundle();
        persistableBundle.putString("android.request.mesg", activity.getString(C7582R.string.restriction_pin_enter_admin_pin));
        createLocalApprovalIntent.putExtra("android.content.extra.REQUEST_BUNDLE", persistableBundle);
        return createLocalApprovalIntent;
    }

    public final synchronized void m8837a(C1124c c1124c) {
        if (this.f8187b == null) {
            if (this.f8190e.f15463a.mo3193b() || ((Boolean) C0955b.f5896l.m28964b()).booleanValue()) {
                this.f8187b = Boolean.valueOf(true);
            } else if (VERSION.SDK_INT < 18 || !m8834a()) {
                this.f8187b = Boolean.valueOf(false);
            } else {
                m8835b(c1124c);
            }
        }
        c1124c.mo1442a(this.f8187b.booleanValue());
    }

    @TargetApi(18)
    private final synchronized boolean m8834a() {
        if (this.f8186a == null) {
            try {
                this.f8186a = Boolean.valueOf(((DevicePolicyManager) this.f8189d.getSystemService("device_policy")).isDeviceOwnerApp((String) C0955b.aU.m28964b()));
            } catch (Throwable e) {
                FinskyLog.m21663b(e, "No method named isDeviceOwnerApp exists.", new Object[0]);
                this.f8186a = Boolean.valueOf(false);
            } catch (Throwable e2) {
                FinskyLog.m21663b(e2, "Unable to invoke isDeviceOwnerApp", new Object[0]);
                this.f8186a = Boolean.valueOf(false);
            }
        }
        return this.f8186a.booleanValue();
    }

    private final synchronized void m8835b(C1124c c1124c) {
        ServiceConnection c1505d = new C1505d(this, this.f8189d, c1124c);
        Intent intent = new Intent("com.google.android.nfcprovision.IOwnedService.BIND");
        intent.setComponent(new ComponentName("com.google.android.nfcprovision", "com.google.android.nfcprovision.SchoolOwnedService"));
        if (!this.f8189d.bindService(intent, c1505d, 1)) {
            this.f8187b = Boolean.valueOf(false);
            c1124c.mo1442a(false);
        }
    }
}
