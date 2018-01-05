package com.google.android.finsky.verifier.impl;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Process;
import android.support.v4.app.cf;
import android.support.v4.app.cg;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.impl.p261b.C4740a;
import com.google.wireless.android.a.a.a.a.cu;
import com.squareup.leakcanary.C7582R;
import java.util.concurrent.atomic.AtomicBoolean;

public final class eb extends C4740a {
    public static int f24652k;
    public C2127b f24653a;
    public C2471a f24654b;
    public C1461c f24655c;
    public final PackageVerificationService f24656d;
    public final Intent f24657e;
    public final dh f24658f;
    public final int f24659g;
    public final String f24660h;
    public final cu f24661i;
    public final AtomicBoolean f24662j = new AtomicBoolean();
    public boolean f24663l;
    public int f24664m;
    public final C2495w f24665n;

    public eb(PackageVerificationService packageVerificationService, Intent intent, dh dhVar, C2495w c2495w) {
        this.f24656d = packageVerificationService;
        this.f24657e = intent;
        this.f24658f = dhVar;
        this.f24659g = intent.getIntExtra("android.content.pm.extra.VERIFICATION_ID", -1);
        this.f24660h = intent.getStringExtra("android.content.pm.extra.VERIFICATION_PACKAGE_NAME");
        this.f24661i = new cu();
        this.f24665n = c2495w;
        ((ac) C3947d.m18649a(ac.class)).mo1993a(this);
    }

    protected final boolean mo4343a() {
        if (this.f24665n != null) {
            this.f24665n.m13367a(new C2474c(2622));
        }
        this.f24662j.set(true);
        if (this.f24657e.getBooleanExtra("com.google.android.vending.verifier.extra.FROM_VERIFICATION_ACTIVITY", false)) {
            m22347a(1);
            this.f24662j.set(false);
            return false;
        } else if (this.f24660h == null) {
            FinskyLog.m21669e("Could not run VerifyParent: %d", Integer.valueOf(this.f24659g));
            m22347a(1);
            return false;
        } else {
            cu cuVar = this.f24661i;
            String str = this.f24660h;
            if (str == null) {
                throw new NullPointerException();
            }
            cuVar.a |= 1;
            cuVar.b = str;
            PackageManager packageManager = this.f24656d.getPackageManager();
            String str2 = null;
            try {
                str = packageManager.getInstallerPackageName(this.f24660h);
            } catch (IllegalArgumentException e) {
                str = str2;
            }
            if (str == null) {
                m22347a(1);
                this.f24662j.set(false);
                return false;
            }
            this.f24661i.a(str);
            str2 = this.f24660h;
            PackageInfo a = m22341a(packageManager, str2);
            if (a == null) {
                throw new IllegalStateException(String.valueOf(str2).concat(" returned null package info"));
            }
            boolean z = (a.applicationInfo.flags & 1) != 0;
            cu cuVar2 = this.f24661i;
            cuVar2.a |= 32;
            cuVar2.g = z;
            int e2 = m22343e();
            int myUid = Process.myUid();
            if (e2 == -1) {
                FinskyLog.m21669e("Cannot determine installer verification: %d, package: %s", Integer.valueOf(this.f24659g), this.f24660h);
                m22347a(1);
                return false;
            }
            PackageInfo a2 = m22341a(packageManager, str);
            if (a2 == null) {
                cuVar = this.f24661i;
                cuVar.a |= 64;
                cuVar.h = true;
                AtomicBoolean atomicBoolean = this.f24662j;
                if (myUid == e2) {
                    z = true;
                } else {
                    z = false;
                }
                atomicBoolean.set(z);
                m22347a(1);
                return false;
            }
            int i = a2.applicationInfo.uid;
            cu cuVar3 = this.f24661i;
            boolean z2 = myUid == i;
            cuVar3.a |= 4;
            cuVar3.d = z2;
            int i2 = e2 % 100000;
            e2 = i % 100000;
            if (e2 == i2) {
                m22347a(1);
                this.f24662j.set(false);
                return false;
            }
            PackageInfo b = m22342b(i2);
            if (b == null) {
                FinskyLog.m21669e("Package should not be null for uid: %d", Integer.valueOf(i2));
                m22347a(1);
                return false;
            }
            if (!(i2 == myUid || e2 == myUid)) {
                this.f24662j.set(false);
            }
            if (this.f24661i.d) {
                this.f24661i.a(b.packageName);
            }
            if (z) {
                m22347a(1);
                return false;
            } else if (e2 != myUid) {
                m22347a(1);
                return false;
            } else if (m22352d()) {
                C2129c a3 = this.f24653a.mo2657a(this.f24660h);
                z = a3 == null ? true : (a3.f10824r & 32) == 0;
                if (z) {
                    this.f24658f.mo4376a(this.f24659g, -1);
                    PackageManager packageManager2 = this.f24656d.getPackageManager();
                    PackageInfo a4 = de.m22298a(this.f24659g, this.f24657e.getData(), packageManager2);
                    if (a4 == null) {
                        FinskyLog.m21669e("Package being installed can't be null: verificationID: %d", Integer.valueOf(this.f24659g));
                    } else {
                        CharSequence applicationLabel = packageManager2.getApplicationLabel(b.applicationInfo);
                        CharSequence applicationLabel2 = packageManager2.getApplicationLabel(a2.applicationInfo);
                        CharSequence applicationLabel3 = packageManager2.getApplicationLabel(a4.applicationInfo);
                        Context context = this.f24656d;
                        PackageWarningDialog.m22008a(context, 4, applicationLabel3.toString(), context.getString(C7582R.string.package_verify_parent_dialog_description, new Object[]{applicationLabel2, applicationLabel}), 0, new VerifyParentInstallTask$1(this, applicationLabel2, applicationLabel3, a4));
                        cuVar = this.f24661i;
                        cuVar.a |= 8;
                        cuVar.e = true;
                    }
                    return true;
                }
                m22348a(packageManager.getApplicationLabel(a2.applicationInfo), packageManager.getApplicationLabel(a.applicationInfo));
                m22347a(-1);
                return false;
            } else {
                m22347a(1);
                return false;
            }
        }
    }

    private final int m22343e() {
        int i = 0;
        if (!this.f24657e.hasExtra("android.content.pm.extra.VERIFICATION_INSTALLER_UID")) {
            return this.f24657e.getIntExtra("android.intent.extra.ORIGINATING_UID", -1);
        }
        if (!this.f24657e.hasExtra("android.intent.extra.ORIGINATING_UID")) {
            return this.f24657e.getIntExtra("android.content.pm.extra.VERIFICATION_INSTALLER_UID", -1);
        }
        String str;
        if (VERSION.SDK_INT >= 23) {
            str = "com.google.android.packageinstaller";
        } else {
            str = "com.android.packageinstaller";
        }
        int intExtra = this.f24657e.getIntExtra("android.content.pm.extra.VERIFICATION_INSTALLER_UID", -1);
        String[] packagesForUid = this.f24656d.getPackageManager().getPackagesForUid(intExtra);
        if (packagesForUid == null) {
            FinskyLog.m21662b("[VerifyParent]Can't find installer UID. VerificationId: %d", Integer.valueOf(this.f24659g));
            return -1;
        }
        int length = packagesForUid.length;
        while (i < length) {
            if (str.equals(packagesForUid[i])) {
                return this.f24657e.getIntExtra("android.intent.extra.ORIGINATING_UID", -1);
            }
            i++;
        }
        return intExtra;
    }

    private final synchronized void m22344f() {
        if (!this.f24663l) {
            this.f24658f.mo4378b(this.f24659g, m22345g());
            this.f24663l = true;
        }
    }

    private static PackageInfo m22341a(PackageManager packageManager, String str) {
        try {
            return packageManager.getPackageInfo(str, 0);
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Package info not found for %s", str);
            return null;
        }
    }

    private final PackageInfo m22342b(int i) {
        PackageManager packageManager = this.f24656d.getPackageManager();
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null || packagesForUid.length == 0) {
            return null;
        }
        if (packagesForUid.length > 1) {
            FinskyLog.m21662b("Found more than one package for uid: %d, returning first one.", Integer.valueOf(i));
        }
        try {
            return packageManager.getPackageInfo(packagesForUid[0], 0);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private final synchronized int m22345g() {
        return this.f24664m;
    }

    final synchronized void m22347a(int i) {
        this.f24664m = i;
    }

    protected final void mo4344c() {
        FinskyLog.m21662b("VerifyParent complete: id=%d, package_name=%s", Integer.valueOf(this.f24659g), this.f24660h);
        m22344f();
        m22346h();
    }

    private final synchronized void m22346h() {
        if (m22350b()) {
            if (this.f24662j.getAndSet(false)) {
                C2474c c2474c = new C2474c(185);
                c2474c.f13342a.ai = this.f24661i;
                C2495w c2495w = this.f24665n;
                if (c2495w == null) {
                    c2495w = this.f24654b.m13184a("VerifyParent");
                }
                c2495w.m13367a(c2474c);
            }
        }
    }

    final void m22348a(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence string = this.f24656d.getString(C7582R.string.package_verify_parent_headsup_description, new Object[]{charSequence});
        CharSequence string2 = this.f24656d.getString(C7582R.string.package_verify_parent_headsup_title, new Object[]{charSequence2});
        String str = "android.intent.action.VIEW";
        String str2 = "market://details?id=";
        String valueOf = String.valueOf(this.f24660h);
        PendingIntent activity = PendingIntent.getActivity(this.f24656d, 0, new Intent(str, Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2))), 0);
        PendingIntent activity2 = PendingIntent.getActivity(this.f24656d, 0, new Intent("android.intent.action.VIEW", Uri.parse((String) C0955b.ix.m28964b())), 0);
        cg cgVar = new cg(this.f24656d);
        cg a = cgVar.m1422a(string2).m1415a((int) C7582R.drawable.ic_verifyapps).m1425b(string).m1421a(new cf().m1412b(string));
        a.f1507k = 1;
        a.f1495M.vibrate = new long[0];
        a.m1417a(0, this.f24656d.getString(C7582R.string.package_verify_parent_headsup_action_learn_more), activity2).m1417a(0, this.f24656d.getString(C7582R.string.package_verify_parent_headsup_action_view_app), activity);
        int i = f24652k + 1;
        f24652k = i;
        ((NotificationManager) this.f24656d.getSystemService("notification")).notify("VerifyParent", i, cgVar.m1414a());
    }

    final boolean m22350b() {
        return this.f24655c.dj().mo2294a(12631908);
    }

    final boolean m22352d() {
        return ((Boolean) C0954a.bs.m5760a()).booleanValue() && this.f24655c.dj().mo2294a(12627941);
    }
}
