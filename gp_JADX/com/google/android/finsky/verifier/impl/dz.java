package com.google.android.finsky.verifier.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.UserHandle;
import android.os.UserManager;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.dy.ac;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.impl.p262a.C4735g;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;
import com.google.android.gms.safetynet.C5571a;
import com.google.android.gms.safetynet.C5573h;
import com.google.wireless.android.a.a.a.a.ct;
import java.util.ArrayList;

final class dz extends AsyncTask {
    public final /* synthetic */ C4735g[] f24650a;
    public final /* synthetic */ dy f24651b;

    dz(dy dyVar, C4735g[] c4735gArr) {
        this.f24651b = dyVar;
        this.f24650a = c4735gArr;
    }

    private final Void m22340a() {
        PackageManager packageManager = this.f24651b.f24649c.f24599c.getPackageManager();
        String str = null;
        boolean e = bg.m22121a().m22130e();
        boolean z = false;
        boolean z2 = false;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z3 = e;
        while (i < this.f24651b.f24647a.size()) {
            C4699c c4699c = (C4699c) this.f24651b.f24647a.get(i);
            C4735g c4735g = this.f24650a[i];
            if (i == 0) {
                str = c4699c.f24153l;
            }
            if (c4735g != null) {
                PackageInfo packageInfo;
                PackageInfo packageInfo2 = null;
                String str2 = c4699c.f24154m.f24169b;
                try {
                    packageInfo = this.f24651b.f24649c.f24599c.getPackageManager().getPackageInfo(str2, 512);
                } catch (NameNotFoundException e2) {
                    packageInfo = packageInfo2;
                }
                if (packageInfo != null) {
                    boolean z4;
                    CharSequence charSequence;
                    Boolean bool;
                    if (z3 && c4735g.f24368e) {
                        cs.m22276a(this.f24651b.f24649c.f24599c, c4699c, c4735g.f24367d, packageInfo.versionCode, true);
                        z4 = false;
                    } else {
                        z4 = z3;
                    }
                    String str3 = null;
                    if (!(str == null || TextUtils.isEmpty(c4735g.f24365b))) {
                        str3 = str;
                    }
                    CharSequence loadLabel = packageInfo.applicationInfo.loadLabel(packageManager);
                    if (loadLabel == null) {
                        charSequence = packageInfo.packageName;
                    } else {
                        charSequence = loadLabel;
                    }
                    dk dkVar = this.f24651b.f24649c;
                    if (ag.m15237a(dkVar.f24600d.dj())) {
                        bool = (Boolean) ag.m15236a(dkVar.f24608l.m15242b(new C4753do(dkVar, dkVar.f24608l, c4699c, c4735g, str)));
                    } else {
                        bool = null;
                    }
                    if (!ag.m15238b(this.f24651b.f24649c.f24600d.dj())) {
                        bool = null;
                    }
                    if (bool == null) {
                        ac b = this.f24651b.f24649c.f24609o.m22368b(str2, packageInfo);
                        z3 = b == null || b.f15496j == 0;
                        bool = Boolean.valueOf(z3);
                    }
                    this.f24651b.f24649c.f24607k.m15221a(str2, c4699c.f24154m.f24182o, c4735g.f24370g, c4735g.f24364a, c4735g.f24365b, str3, charSequence.toString(), str3, c4735g.f24367d, false);
                    byte[] bArr = c4699c.f24145d.f24199b;
                    if (c4735g.f24364a != 0) {
                        if (dk.f24595a.contains(c4735g.f24370g)) {
                            e = true;
                        } else {
                            e = z2;
                        }
                        if (bool.booleanValue()) {
                            Bundle bundle = new Bundle();
                            bundle.putString("package_name", str2);
                            bundle.putByteArray("digest", bArr);
                            bundle.putString("threat_type", c4735g.f24370g);
                            bundle.putString("description_string", c4735g.f24365b);
                            arrayList.add(bundle);
                        }
                        z3 = true;
                        this.f24651b.f24648b.mo4379a(c4699c, c4735g, packageInfo, charSequence.toString());
                        z2 = e;
                        e = z4;
                    } else if (!(((Boolean) C0955b.cI.m28964b()).booleanValue() && this.f24651b.f24649c.m22327a(c4699c, c4735g)) && ((Boolean) C0955b.cF.m28964b()).booleanValue() && this.f24651b.f24649c.f24609o.m22367a(str2)) {
                        cs.m22277a(this.f24651b.f24649c.f24599c, this.f24651b.f24649c.f24609o, this.f24651b.f24649c.f24602f, c4699c.f24154m.f24169b, bArr);
                        z3 = z;
                        e = z4;
                    } else {
                        z3 = z;
                        e = z4;
                    }
                    i++;
                    z = z3;
                    z3 = e;
                }
            }
            e = z3;
            z3 = z;
            i++;
            z = z3;
            z3 = e;
        }
        if (this.f24651b.f24649c.f24619y != 0 && ((Boolean) C0955b.cG.m28964b()).booleanValue()) {
            ct ctVar = new ct();
            int i2 = this.f24651b.f24649c.f24619y;
            ctVar.a |= 8;
            ctVar.e = i2;
            this.f24651b.f24649c.f24615u.m13367a(new C2474c(2629).m13229a(ctVar));
        }
        C0954a.f5815K.m5763a(Boolean.valueOf(z));
        if (C4671b.m21787d() && ((Boolean) C0955b.cu.m28964b()).booleanValue() && !this.f24651b.f24649c.f24606j.m8822b()) {
            cq a = cq.m22272a(this.f24651b.f24649c.f24599c);
            FinskyLog.m21659a("Device wide non work profile PHA is changed", new Object[0]);
            SingleUserSettingsReceiver.m22016a(a.f24558b, "device_wide_non_work_profile_phas", z2);
            if (z2) {
                Context context = this.f24651b.f24649c.f24599c;
                long a2 = C4678i.m21812a();
                a = cq.m22272a(context);
                FinskyLog.m21659a("Updating last successful autoscan run timestamp", new Object[0]);
                Context context2 = a.f24558b;
                Intent intent = new Intent("com.google.android.finsky.action.UPDATE_TIMESTAMP_ACTION");
                intent.setComponent(new ComponentName(context2, SingleUserSettingsReceiver.class));
                UserHandle userForSerialNumber = ((UserManager) context2.getSystemService("user")).getUserForSerialNumber(0);
                intent.putExtra("key", "device_wide_last_autoscan_with_pha");
                intent.putExtra("timestamp", a2);
                context2.sendBroadcastAsUser(intent, userForSerialNumber);
            }
        }
        if (this.f24651b.f24649c.f24610p) {
            C0954a.f5817M.m5763a(Long.valueOf(System.currentTimeMillis()));
        } else {
            dk dkVar2 = this.f24651b.f24649c;
            a2 = C4678i.m21812a();
            C0954a.f5814J.m5763a(Long.valueOf(a2));
            if (VERSION.SDK_INT >= 19) {
                try {
                    Secure.putLong(dkVar2.f24599c.getContentResolver(), "package_verifier_last_scan_time_ms", a2);
                } catch (SecurityException e3) {
                    FinskyLog.m21665c("Error occurred while setting %s: %s", "package_verifier_last_scan_time_ms", e3);
                }
            }
            if (((Boolean) C0954a.f5816L.m5760a()).booleanValue()) {
                C0954a.f5816L.m5763a(Boolean.valueOf(false));
            }
        }
        if (!arrayList.isEmpty() && ((Boolean) C0955b.cQ.m28964b()).booleanValue()) {
            C5573h a3 = C5571a.m26561a(this.f24651b.f24649c.f24599c);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelableArrayList("harmful_app_bundles", arrayList);
            a3.m26565a(4, bundle2);
        }
        return null;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f24651b.f24649c.m22328a(true);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return m22340a();
    }
}
