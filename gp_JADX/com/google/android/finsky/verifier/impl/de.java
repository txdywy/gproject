package com.google.android.finsky.verifier.impl;

import android.annotation.TargetApi;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.verifier.impl.p261b.C4740a;
import com.google.android.finsky.verifier.impl.p261b.C4745g;
import com.google.android.finsky.verifier.impl.p261b.C4746h;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public final class de extends C4740a implements C4746h, dh {
    public C1461c f24581a;
    public final Intent f24582b;
    public final Service f24583c;
    public final int f24584d;
    public final String f24585e;
    public final List f24586f;
    public boolean f24587g = false;
    public BroadcastReceiver f24588h;
    public boolean f24589i = false;
    public C2471a f24590j;
    public C2495w f24591k;

    public de(PackageVerificationService packageVerificationService, Intent intent) {
        this.f24582b = intent;
        this.f24583c = packageVerificationService;
        this.f24584d = this.f24582b.getIntExtra("android.content.pm.extra.VERIFICATION_ID", -1);
        this.f24585e = intent.getStringExtra("android.content.pm.extra.VERIFICATION_PACKAGE_NAME");
        ((ac) C3947d.m18649a(ac.class)).mo1990a(this);
        if (((Boolean) C0955b.cC.m28964b()).booleanValue()) {
            this.f24591k = this.f24590j.m13179a(intent.getBundleExtra("logging_context"));
        }
        this.f24586f = new ArrayList();
        if (this.f24581a.dj().mo2294a(12641305)) {
            this.f24586f.add(new C4745g(new ec(packageVerificationService, intent, this), this, (byte) 0));
        }
        this.f24586f.add(new C4745g(new bx(packageVerificationService, intent, this, this.f24591k), this, (byte) 0));
        C4740a ebVar = new eb(packageVerificationService, intent, this, this.f24591k);
        if (ebVar.m22350b() || ebVar.m22352d()) {
            this.f24586f.add(new C4745g(ebVar, this, (byte) 0));
        }
    }

    protected final boolean mo4343a() {
        ArrayList arrayList;
        synchronized (this) {
            arrayList = new ArrayList(this.f24586f);
        }
        m22300b();
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        boolean z = false;
        while (i < size) {
            int i2 = i + 1;
            C4745g c4745g = (C4745g) arrayList.get(i);
            if (c4745g.f24429a.m22070m()) {
                i = i2;
            } else {
                try {
                    boolean a = c4745g.f24429a.mo4343a();
                    z |= a;
                    if (!a) {
                    }
                } catch (Throwable e) {
                    FinskyLog.m21660a(e, "Unexpected exception on background thread", new Object[0]);
                } finally {
                    c4745g = c4745g.f24429a;
                    c4745g.m22069l();
                }
                if (bb.m21795c() || !c4745g.f24431c) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (i != 0) {
                    try {
                        c4745g.f24430b.await();
                        i = i2;
                    } catch (Throwable e2) {
                        FinskyLog.m21660a(e2, "Interrupted while awaiting on BackgroundTask", new Object[0]);
                        Thread.currentThread().interrupt();
                    }
                }
                i = i2;
            }
        }
        return z;
    }

    public final synchronized void mo4377a(C4745g c4745g) {
        bb.m21791a();
        this.f24586f.remove(c4745g);
        if (this.f24586f.isEmpty()) {
            if (!(this.f24589i || this.f24587g)) {
                this.f24587g = true;
                m22301c(this.f24584d, 1);
            }
            m22069l();
        }
    }

    @TargetApi(17)
    public final synchronized void mo4376a(int i, int i2) {
        if (!(this.f24589i || this.f24587g)) {
            this.f24583c.getPackageManager().extendVerificationTimeout(i, i2, ((Long) C0955b.bL.m28964b()).longValue());
        }
    }

    public final synchronized void mo4378b(int i, int i2) {
        if (m22070m()) {
            FinskyLog.m21659a("Verification stage already finished, ignoring verifyInstall callback", new Object[0]);
        } else if (i != this.f24584d) {
            FinskyLog.m21669e("Got a callback for some other verification id", new Object[0]);
        } else if (!this.f24587g && i2 == -1) {
            this.f24587g = true;
            m22301c(i, -1);
            m22069l();
        }
    }

    private final void m22301c(int i, int i2) {
        if (!this.f24582b.getBooleanExtra("com.google.android.vending.verifier.extra.FROM_VERIFICATION_ACTIVITY", false)) {
            FinskyLog.m21659a("Verifying id=%d, result=%d", Integer.valueOf(i), Integer.valueOf(i2));
            if (this.f24591k != null) {
                this.f24591k.m13367a(new C2474c(2623));
            }
            this.f24583c.getPackageManager().verifyPendingInstall(i, i2);
        } else if (i2 == 1) {
            Intent intent = this.f24582b;
            intent.setComponent(new ComponentName(ab.f24377a, "com.android.packageinstaller.PackageInstallerActivity"));
            intent.addFlags(268435456);
            this.f24583c.startActivity(intent);
        }
    }

    protected final void mo4344c() {
        ArrayList arrayList;
        bb.m21791a();
        m22302d();
        synchronized (this) {
            arrayList = new ArrayList(this.f24586f);
        }
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C4745g) obj).f24429a.m22069l();
        }
        FinskyLog.m21659a("Verification complete: id=%d, package_name=%s", Integer.valueOf(this.f24584d), this.f24585e);
    }

    private final synchronized void m22300b() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_VERIFIED");
        try {
            intentFilter.addDataType("application/vnd.android.package-archive");
            intentFilter.addDataScheme(this.f24582b.getData().getScheme());
            intentFilter.addDataPath(this.f24582b.getData().getPath(), 0);
            this.f24588h = new df(this);
            this.f24583c.registerReceiver(this.f24588h, intentFilter, "android.permission.BIND_PACKAGE_VERIFIER", null);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private final synchronized void m22302d() {
        if (this.f24588h != null) {
            this.f24583c.unregisterReceiver(this.f24588h);
            this.f24588h = null;
        }
    }

    static File m22299a(int i, Uri uri) {
        if (uri == null) {
            FinskyLog.m21659a("Null data for request id=%d", Integer.valueOf(i));
            return null;
        }
        if ("file".equalsIgnoreCase(uri.getScheme())) {
            File file = new File(uri.getPath());
            if (!file.exists()) {
                FinskyLog.m21659a("Cannot find file for %s in request id=%d", uri, Integer.valueOf(i));
                return null;
            } else if (file.canRead()) {
                return file;
            } else {
                FinskyLog.m21659a("Cannot read file for %s in request id=%d", uri, Integer.valueOf(i));
                return null;
            }
        }
        FinskyLog.m21659a("Unsupported scheme for %s in request id=%d", uri, Integer.valueOf(i));
        return null;
    }

    static PackageInfo m22298a(int i, Uri uri, PackageManager packageManager) {
        File a = m22299a(i, uri);
        if (a == null) {
            return null;
        }
        try {
            PackageInfo packageArchiveInfo;
            if (C4671b.m21787d() && a.isDirectory()) {
                File file = new File(a, "base.apk");
                packageArchiveInfo = packageManager.getPackageArchiveInfo(file.getAbsolutePath(), 64);
                if (packageArchiveInfo == null) {
                    for (File a2 : a2.listFiles()) {
                        if (!a2.isDirectory()) {
                            packageArchiveInfo = packageManager.getPackageArchiveInfo(a2.getAbsolutePath(), 64);
                            if (packageArchiveInfo != null) {
                                break;
                            }
                        }
                    }
                }
                a2 = file;
                if (packageArchiveInfo == null) {
                    return packageArchiveInfo;
                }
                packageArchiveInfo.applicationInfo.sourceDir = a2.getAbsolutePath();
                packageArchiveInfo.applicationInfo.publicSourceDir = a2.getAbsolutePath();
                return packageArchiveInfo;
            }
            packageArchiveInfo = packageManager.getPackageArchiveInfo(a2.getPath(), 64);
            packageArchiveInfo.applicationInfo.sourceDir = a2.getAbsolutePath();
            packageArchiveInfo.applicationInfo.publicSourceDir = a2.getAbsolutePath();
            return packageArchiveInfo;
        } catch (Exception e) {
            FinskyLog.m21665c("Exception reading %s in request id=%d %s", uri, Integer.valueOf(i), e);
            return null;
        }
    }
}
