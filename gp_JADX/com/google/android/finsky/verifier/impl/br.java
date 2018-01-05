package com.google.android.finsky.verifier.impl;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.p028a.C0221j;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.dy.ac;
import com.google.android.finsky.dy.ad;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.C4726d;
import com.google.android.finsky.verifier.impl.p261b.C4740a;
import com.google.android.finsky.verifier.p259a.p260a.ab;
import com.google.android.p254g.p255a.C4318e;
import com.google.android.p254g.p255a.C4881g;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class br extends C4740a {
    public final C4318e f24465a;
    public final boolean f24466b;
    public final boolean f24467c;
    public final boolean f24468d;
    public boolean f24469e = false;
    public int f24470f = 0;
    public boolean f24471g = false;
    public BroadcastReceiver f24472h = null;
    public C4756h f24473i = new C4756h();
    public Context f24474j;
    public C1461c f24475k;
    public C4726d f24476l;
    public C1500a f24477m;
    public ag f24478n;
    public ad f24479o;

    public br(Intent intent) {
        boolean z;
        boolean z2 = false;
        ParcelableBinder parcelableBinder = (ParcelableBinder) intent.getParcelableExtra("verify_apps_data_callback");
        if (parcelableBinder != null) {
            C4318e c4318e;
            IBinder iBinder = parcelableBinder.f24328a;
            if (iBinder == null) {
                c4318e = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.vending.verifier.IVerifyAppsDataCallback");
                if (queryLocalInterface instanceof C4318e) {
                    c4318e = (C4318e) queryLocalInterface;
                } else {
                    c4318e = new C4881g(iBinder);
                }
            }
            this.f24465a = c4318e;
        } else {
            this.f24465a = null;
        }
        long longExtra = intent.getLongExtra("verify_apps_data_flags", 0);
        if ((1 & longExtra) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f24466b = z;
        if ((2 & longExtra) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f24467c = z;
        long longExtra2 = intent.getLongExtra("verify_apps_data_autoscan_stale_ms", -1);
        z = longExtra2 >= 0 ? C4678i.m21812a() - ((Long) C0954a.f5814J.m5760a()).longValue() >= longExtra2 : false;
        if ((longExtra & 4) != 0 || r0) {
            z2 = true;
        }
        this.f24468d = z2;
        ((ac) C3947d.m18649a(ac.class)).mo1986a(this);
    }

    protected final boolean mo4343a() {
        if (this.f24465a == null) {
            FinskyLog.m21665c("No result callback provided", new Object[0]);
            return false;
        }
        if (((Boolean) C0955b.cu.m28964b()).booleanValue() && this.f24477m.m8822b()) {
            ar arVar = new ar();
            this.f24469e = arVar.m22082a("device_wide_non_work_profile_phas");
            long b = arVar.m22083b("device_wide_last_autoscan_with_pha");
            if (b == 0) {
                this.f24470f = -1;
            } else {
                this.f24470f = (int) ((C4678i.m21812a() - b) / TimeUnit.HOURS.toMillis(1));
            }
        } else if (!this.f24477m.m8822b()) {
            this.f24470f = -1;
        }
        if (this.f24468d) {
            synchronized (this) {
                this.f24472h = new bu(this);
            }
            C0221j.m1129a(this.f24474j).m1132a(this.f24472h, new IntentFilter("verify_installed_packages_finished"));
            this.f24476l.mo4360a();
            return true;
        }
        m22206b();
        return false;
    }

    final void m22206b() {
        Bundle bundle = new Bundle();
        if (((Boolean) C0955b.cA.m28964b()).booleanValue()) {
            bundle.putLong("last_scan_time_ms", Math.max(((Long) C0954a.f5814J.m5760a()).longValue(), ((Long) C0954a.f5817M.m5760a()).longValue()));
        } else {
            bundle.putLong("last_scan_time_ms", ((Long) C0954a.f5814J.m5760a()).longValue());
        }
        bundle.putInt("default_warning_string_id", C7582R.string.verify_apps_generic_malware);
        if (this.f24466b) {
            List f = m22202f();
            bundle.putInt("harmful_apps_count", f.size());
            bundle.putParcelableArray("harmful_apps", (Parcelable[]) f.toArray(new Bundle[0]));
        } else if (ag.m15238b(this.f24475k.dj())) {
            bundle.putInt("harmful_apps_count", m22202f().size());
        } else {
            m22203g();
            bundle.putInt("harmful_apps_count", this.f24479o.m15216a());
        }
        if (this.f24467c) {
            f = m22204h();
            bundle.putInt("recently_removed_apps_count", f.size());
            bundle.putParcelableArray("recently_removed_apps", (Parcelable[]) f.toArray(new Bundle[f.size()]));
        } else if (ag.m15238b(this.f24475k.dj())) {
            bundle.putInt("recently_removed_apps_count", m22204h().size());
        } else {
            bundle.putInt("recently_removed_apps_count", this.f24479o.m15227b());
        }
        bundle.putBoolean("phas_exist_in_other_profiles_key", this.f24469e);
        bundle.putInt("hours_since_last_autoscan_with_pha_key", this.f24470f);
        synchronized (this) {
            if (this.f24471g) {
                FinskyLog.m21662b("Already reported results", new Object[0]);
            } else {
                try {
                    this.f24465a.mo4122a(true, bundle);
                } catch (RemoteException e) {
                    FinskyLog.m21665c("Error while calling result callback: %s", e);
                }
                this.f24471g = true;
            }
        }
    }

    protected final synchronized void mo4344c() {
        if (!(this.f24471g || this.f24465a == null)) {
            try {
                this.f24465a.mo4122a(false, null);
            } catch (RemoteException e) {
                FinskyLog.m21665c("Error while calling result callback: %s", e);
            }
            this.f24471g = true;
        }
        m22201e();
    }

    private final synchronized void m22201e() {
        if (this.f24472h != null) {
            C0221j.m1129a(this.f24474j).m1131a(this.f24472h);
            this.f24472h = null;
        }
    }

    static List m22198a(Context context, C4756h c4756h, C1461c c1461c) {
        PackageManager packageManager = context.getPackageManager();
        List arrayList = new ArrayList();
        if (ag.m15238b(c1461c.dj())) {
            c4756h.m22365a(new bs(arrayList));
        } else {
            for (ac acVar : c4756h.f24681d.m15219a(true, false).values()) {
                ac acVar2;
                if (!TextUtils.isEmpty(acVar2.f15493g)) {
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(acVar2.f15487a, 0);
                        if (packageInfo != null) {
                            if (acVar2.f15488b == 0) {
                                acVar2 = c4756h.m22368b(acVar2.f15487a, packageInfo);
                                if (!(acVar2 == null || TextUtils.isEmpty(acVar2.f15493g))) {
                                    arrayList.add(m22197a(acVar2, packageInfo));
                                }
                            } else if (packageInfo.lastUpdateTime == acVar2.f15488b) {
                                arrayList.add(m22197a(acVar2, packageInfo));
                            }
                        }
                    } catch (NameNotFoundException e) {
                    }
                }
            }
        }
        return arrayList;
    }

    private final List m22202f() {
        List arrayList = new ArrayList();
        m22203g();
        for (Bundle bundle : m22198a(this.f24474j, this.f24473i, this.f24475k)) {
            String str = "remove_app_intent";
            String string = bundle.getString("package_name");
            byte[] byteArray = bundle.getByteArray("sha256");
            String str2 = "verifyapps://removalrequest/";
            String valueOf = String.valueOf(string);
            Intent intent = new Intent("com.google.android.vending.verifier.UNINSTALL_PACKAGE", Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)), this.f24474j, PackageVerificationService.class);
            intent.putExtra("android.content.pm.extra.VERIFICATION_PACKAGE_NAME", string);
            intent.putExtra("digest", byteArray);
            bundle.putParcelable(str, PendingIntent.getService(this.f24474j, 0, intent, m22200d()));
            arrayList.add(bundle);
        }
        return arrayList;
    }

    private final void m22203g() {
        PackageManager packageManager = this.f24474j.getPackageManager();
        for (ac acVar : this.f24479o.m15230c()) {
            PackageInfo packageInfo = null;
            try {
                packageInfo = packageManager.getPackageInfo(acVar.f15487a, 0);
            } catch (NameNotFoundException e) {
            }
            if (packageInfo != null) {
                this.f24473i.m22368b(acVar.f15487a, packageInfo);
            } else if (System.currentTimeMillis() - acVar.f15499m > 3600000) {
                ad adVar = this.f24479o;
                ContentValues contentValues = new ContentValues();
                contentValues.put("cache_fingerprint", Long.valueOf(-1));
                adVar.f15523m.getWritableDatabase().update("verification_cache", contentValues, "package_name=?", new String[]{acVar.f15487a});
            }
        }
    }

    private static Bundle m22197a(ac acVar, PackageInfo packageInfo) {
        Bundle bundle = new Bundle();
        bundle.putString("package_name", packageInfo.packageName);
        bundle.putInt("version_code", packageInfo.versionCode);
        bundle.putByteArray("sha256", acVar.f15489c);
        bundle.putString("threat_type", acVar.f15493g);
        bundle.putString("warning_string_text", acVar.f15497k);
        bundle.putString("warning_string_locale", acVar.f15498l);
        return bundle;
    }

    static int m22200d() {
        if (C4671b.m21788e()) {
            return 1409286144;
        }
        return 1342177280;
    }

    private final List m22204h() {
        if (ag.m15238b(this.f24475k.dj())) {
            return (List) ag.m15236a(this.f24478n.m15241a(new bt(this)));
        }
        List arrayList = new ArrayList();
        for (ac acVar : this.f24479o.m15219a(false, true).values()) {
            if (!TextUtils.isEmpty(acVar.f15493g)) {
                Bundle bundle = new Bundle();
                bundle.putString("package_name", acVar.f15487a);
                bundle.putByteArray("sha256", acVar.f15489c);
                if (acVar.f15502p != null) {
                    bundle.putString("app_title", acVar.f15502p);
                    bundle.putString("app_title_locale", acVar.f15503q);
                }
                bundle.putLong("removed_time_ms", acVar.f15500n);
                bundle.putString("warning_string_text", acVar.f15497k);
                bundle.putString("warning_string_locale", acVar.f15498l);
                String str = "verifyapps://hiderequest/";
                String valueOf = String.valueOf(acVar.f15487a);
                Intent intent = new Intent("com.google.android.vending.verifier.HIDE_REMOVED_APP", Uri.parse(valueOf.length() != 0 ? str.concat(valueOf) : new String(str)), this.f24474j, PackageVerificationService.class);
                intent.putExtra("android.content.pm.extra.VERIFICATION_PACKAGE_NAME", acVar.f15487a);
                intent.putExtra("digest", acVar.f15489c);
                bundle.putParcelable("hide_removed_app_intent", PendingIntent.getService(this.f24474j, 0, intent, m22200d()));
                arrayList.add(bundle);
            }
        }
        return arrayList;
    }

    static final /* synthetic */ void m22199a(List list, ab abVar, PackageInfo packageInfo) {
        Bundle bundle = new Bundle();
        bundle.putString("package_name", packageInfo.packageName);
        bundle.putInt("version_code", packageInfo.versionCode);
        bundle.putByteArray("sha256", abVar.f24101b);
        bundle.putString("threat_type", abVar.f24104e);
        bundle.putString("warning_string_text", abVar.f24105f);
        bundle.putString("warning_string_locale", abVar.f24106g);
        list.add(bundle);
    }
}
