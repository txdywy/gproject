package com.google.android.finsky.verifier.impl;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.dy.ac;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.impl.p262a.C4735g;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;
import com.google.android.finsky.verifier.p259a.p260a.ab;
import com.squareup.leakcanary.C7582R;
import java.util.List;

final class dw implements C4748z {
    public final List f24643a;
    public boolean f24644b = false;
    public final /* synthetic */ dk f24645c;

    public dw(dk dkVar, List list) {
        this.f24645c = dkVar;
        this.f24643a = list;
    }

    public final void mo4371a(boolean[] zArr) {
        PackageManager packageManager = this.f24645c.f24599c.getPackageManager();
        int i = 0;
        while (i < this.f24643a.size() && i < zArr.length) {
            if (zArr[i]) {
                PackageInfo packageInfo;
                C4699c c4699c = (C4699c) this.f24643a.get(i);
                byte[] bArr = c4699c.f24145d.f24199b;
                PackageInfo packageInfo2 = null;
                try {
                    packageInfo = packageManager.getPackageInfo(c4699c.f24154m.f24169b, 0);
                } catch (NameNotFoundException e) {
                    packageInfo = packageInfo2;
                }
                if (packageInfo != null) {
                    CharSequence charSequence;
                    String locale = this.f24645c.f24599c.getResources().getConfiguration().locale.toString();
                    CharSequence loadLabel = packageInfo.applicationInfo.loadLabel(packageManager);
                    if (loadLabel == null) {
                        charSequence = packageInfo.packageName;
                    } else {
                        charSequence = loadLabel;
                    }
                    String string = this.f24645c.f24599c.getString(C7582R.string.verify_apps_generic_malware);
                    if (ag.m15238b(this.f24645c.f24600d.dj())) {
                        if (this.f24645c.f24609o.m22364a(c4699c.f24154m.f24169b, packageInfo) != null) {
                            ab abVar = (ab) ag.m15236a(this.f24645c.f24608l.m15243b(new dx(bArr)));
                            if (abVar != null) {
                                loadLabel = abVar.f24104e;
                            }
                        }
                        loadLabel = null;
                    } else {
                        ac b = this.f24645c.f24609o.m22368b(c4699c.f24154m.f24169b, packageInfo);
                        if (b != null) {
                            loadLabel = b.f15493g;
                        }
                        loadLabel = null;
                    }
                    if (TextUtils.isEmpty(loadLabel)) {
                        FinskyLog.m21662b("Offline AutoScan found a new PHA: %s.", c4699c.f24154m.f24169b);
                        C0954a.f5815K.m5763a(Boolean.valueOf(true));
                        this.f24645c.f24607k.m15221a(c4699c.f24154m.f24169b, c4699c.f24154m.f24182o, "generic_malware", 3, string, locale, charSequence.toString(), locale, null, true);
                        C4735g c4735g = new C4735g(3, string, null, null, false, 0, "generic_malware", false, false, null, true, true);
                        dk dkVar = this.f24645c;
                        if (ag.m15237a(dkVar.f24600d.dj())) {
                            ag.m15236a(dkVar.f24608l.m15242b(new C4753do(dkVar, dkVar.f24608l, c4699c, c4735g, locale)));
                        }
                        if (!this.f24644b) {
                            cs.m22283c(this.f24645c.f24599c);
                            this.f24644b = true;
                        }
                        if (!c4699c.f24154m.f24175h) {
                            if (C4671b.m21786c()) {
                                cs.m22281b(this.f24645c.f24599c, c4699c.f24154m.f24169b);
                            }
                            this.f24645c.f24602f.mo3804b(charSequence.toString(), c4699c.f24154m.f24169b, string, 0, PackageVerificationService.m22002a(this.f24645c.f24599c, c4699c.f24154m.f24169b, c4699c.f24145d.f24199b, null), PackageVerificationService.m22005b(this.f24645c.f24599c, c4699c.f24154m.f24169b, c4699c.f24145d.f24199b, null), c4699c.f24154m.f24176i);
                            if (((Boolean) C0955b.cq.m28964b()).booleanValue()) {
                                dk dkVar2 = this.f24645c;
                                bf.m22119a(dkVar2.f24599c, c4699c.f24154m.f24169b, c4699c.f24154m.f24170c, c4699c.f24145d.f24199b, false, true);
                            }
                        }
                    } else {
                        FinskyLog.m21662b("PHA: %s flagged by offline AutoScan was already warned/blocked before.", c4699c.f24154m.f24169b);
                    }
                }
            }
            i++;
        }
        this.f24645c.m22328a(true);
    }
}
