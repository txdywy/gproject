package com.google.android.finsky.verifier.impl;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.android.volley.C0700r;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.dy.ac;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.impl.p262a.C4731c;
import com.google.android.finsky.verifier.p259a.p260a.C4722z;
import com.google.android.finsky.verifier.p259a.p260a.ab;
import java.util.Arrays;
import p002a.C0002a;

public final class aw extends az {
    public C0002a f24420a;
    public C0002a f24421b;

    public aw(PackageVerificationService packageVerificationService, Intent intent) {
        super(packageVerificationService, intent);
        ((ac) C3947d.m18649a(ac.class)).mo1983a(this);
    }

    protected final boolean mo4343a() {
        ab abVar;
        boolean z;
        byte[] bArr;
        boolean z2;
        int i;
        PackageInfo packageInfo = null;
        String stringExtra = this.j.getStringExtra("android.content.pm.extra.VERIFICATION_PACKAGE_NAME");
        byte[] byteArrayExtra = this.j.getByteArrayExtra("digest");
        boolean booleanExtra = this.j.getBooleanExtra("com.google.android.vending.verifier.intent.extra.UNINSTALL", false);
        boolean booleanExtra2 = this.j.getBooleanExtra("com.google.android.vending.verifier.intent.extra.DONT_WARN", false);
        boolean booleanExtra3 = this.j.getBooleanExtra("dialog_dismissed", false);
        boolean booleanExtra4 = this.j.getBooleanExtra("pressed_uninstall_action", false);
        byte[] byteArrayExtra2 = this.j.getByteArrayExtra("com.google.android.vending.verifier.intent.extra.RESPONSE_TOKEN");
        PendingIntent pendingIntent = (PendingIntent) this.j.getParcelableExtra("pending_result_intent");
        if (!(stringExtra == null || this.f24421b == null || this.f24421b.mo1a() == null)) {
            ((com.google.android.finsky.notification.ab) this.f24421b.mo1a()).mo3802b(stringExtra);
            if (booleanExtra3) {
                PackageVerificationService packageVerificationService = this.i;
                C4756h c4756h = this.h;
                com.google.android.finsky.notification.ab abVar2 = (com.google.android.finsky.notification.ab) this.f24421b.mo1a();
                if (ag.m15238b(this.d.dj())) {
                    C4741s apVar = new ap(packageVerificationService, abVar2);
                    try {
                        packageInfo = c4756h.f24678a.getPackageManager().getPackageInfo(stringExtra, 0);
                    } catch (NameNotFoundException e) {
                    }
                    if (packageInfo != null) {
                        C4722z a = c4756h.m22364a(stringExtra, packageInfo);
                        if (Arrays.equals(byteArrayExtra, a.f24294d)) {
                            abVar = (ab) ag.m15236a(c4756h.f24682e.m15243b(new C4761m(byteArrayExtra)));
                            if (abVar != null) {
                                apVar.mo4345a(a, abVar, packageInfo);
                            }
                        }
                    }
                } else {
                    PackageInfo packageInfo2;
                    try {
                        packageInfo2 = packageVerificationService.getPackageManager().getPackageInfo(stringExtra, 0);
                    } catch (NameNotFoundException e2) {
                        packageInfo2 = packageInfo;
                    }
                    if (packageInfo2 != null) {
                        ac b = new C4756h().m22368b(stringExtra, packageInfo2);
                        if (b != null && Arrays.equals(byteArrayExtra, b.f15489c)) {
                            an.m22071a(packageVerificationService, abVar2, packageInfo2, b.f15489c, b.f15508v, b.f15507u, b.f15497k);
                        }
                    }
                }
                m22094a(pendingIntent, false);
                return false;
            }
        }
        boolean z3;
        if (booleanExtra) {
            FinskyLog.m21659a("Uninstalling %s", stringExtra);
            try {
                packageInfo = this.i.getPackageManager().getPackageInfo(stringExtra, 0);
            } catch (NameNotFoundException e3) {
            }
            if (packageInfo != null) {
                byte[] bArr2;
                if (byteArrayExtra2 != null) {
                    bArr2 = byteArrayExtra2;
                } else if (ag.m15238b(this.d.dj())) {
                    C4722z a2 = this.h.m22364a(stringExtra, packageInfo);
                    if (a2 == null || !Arrays.equals(a2.f24294d, byteArrayExtra)) {
                        m22094a(pendingIntent, false);
                        return false;
                    }
                    abVar = (ab) ag.m15236a(this.i.f24309b.m15243b(new ax(byteArrayExtra)));
                    if (abVar == null) {
                        m22094a(pendingIntent, false);
                        return false;
                    }
                    bArr2 = abVar.f24107h;
                } else {
                    ac a3 = this.h.m22363a(stringExtra, packageInfo, byteArrayExtra, true);
                    if (a3 == null) {
                        FinskyLog.m21667d("No response token was found for package", new Object[0]);
                        m22094a(pendingIntent, false);
                        return false;
                    }
                    bArr2 = a3.f15508v;
                }
                if (m22097a(packageInfo, byteArrayExtra, false, pendingIntent)) {
                    byteArrayExtra2 = bArr2;
                    z3 = false;
                } else {
                    byteArrayExtra2 = bArr2;
                    z3 = true;
                }
            } else {
                z3 = true;
            }
            z = z3;
            bArr = byteArrayExtra2;
            z2 = booleanExtra2;
        } else {
            if (((Boolean) C0955b.cE.m28964b()).booleanValue() && this.h.m22367a(stringExtra)) {
                cs.m22277a(this.c, this.h, (com.google.android.finsky.notification.ab) this.f24421b.mo1a(), stringExtra, byteArrayExtra);
            }
            if (((Boolean) C0955b.cH.m28964b()).booleanValue()) {
                z3 = true;
            } else {
                z3 = booleanExtra2;
            }
            this.i.f24308a.m15222a(stringExtra, z3);
            if (ag.m15237a(this.d.dj())) {
                ag agVar = this.i.f24309b;
                ag.m15236a(agVar.m15242b(new ay(this, agVar, stringExtra, z3)));
            }
            m22094a(pendingIntent, false);
            z = true;
            bArr = byteArrayExtra2;
            z2 = z3;
        }
        if (booleanExtra) {
            i = 1;
        } else {
            i = 0;
        }
        C4731c.m22039a().m22040a((C0700r) this.f24420a.mo1a(), stringExtra, i, z2, booleanExtra3, booleanExtra4, bArr);
        if (z) {
            return false;
        }
        return true;
    }
}
