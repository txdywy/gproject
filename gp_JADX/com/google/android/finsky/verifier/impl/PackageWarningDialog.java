package com.google.android.finsky.verifier.impl;

import android.app.PendingIntent;
import android.app.PendingIntent.CanceledException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.support.v7.app.aa;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1128e;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public class PackageWarningDialog extends aa implements C0998m {
    public byte[] f24311A;
    public int f24312B = 0;
    public PendingIntent f24313C;
    public PendingIntent f24314D;
    public ab f24315q;
    public int f24316r;
    public String f24317s;
    public String f24318t;
    public String f24319u;
    public int f24320v;
    public boolean f24321w;
    public boolean f24322x = false;
    public boolean f24323y = false;
    public ActivityListener f24324z;

    public PackageWarningDialog() {
        ((ac) C3947d.m18649a(ac.class)).mo1976a(this);
    }

    public static Intent m22007a(Context context, int i, String str, String str2, String str3, int i2, int i3, ActivityListener activityListener, PendingIntent pendingIntent) {
        Intent intent = new Intent(context, PackageWarningDialog.class);
        intent.setFlags(1476395008);
        intent.putExtra("action", i);
        intent.putExtra("app_name", str);
        intent.putExtra("message", str3);
        intent.putExtra("package_name", str2);
        intent.putExtra("layout_version", i2);
        intent.putExtra("default_result", i3);
        if (activityListener != null) {
            intent.putExtra("listener", activityListener);
        }
        if (pendingIntent != null) {
            intent.putExtra("pending_intent", pendingIntent);
        }
        return intent;
    }

    public static void m22008a(Context context, int i, String str, String str2, int i2, ActivityListener activityListener) {
        context.startActivity(m22007a(context, i, str, null, str2, i2, -1, activityListener, null));
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        this.f24316r = intent.getIntExtra("action", 0);
        this.f24317s = intent.getStringExtra("app_name");
        this.f24318t = intent.getStringExtra("message");
        this.f24319u = intent.getStringExtra("package_name");
        this.f24320v = intent.getIntExtra("default_result", 0);
        this.f24324z = (ActivityListener) intent.getParcelableExtra("listener");
        this.f24313C = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (this.f24316r == 5) {
            this.f24311A = intent.getByteArrayExtra("digest");
            this.f24314D = (PendingIntent) intent.getParcelableExtra("pending_result_intent");
            try {
                PackageManager packageManager = getPackageManager();
                PackageInfo packageInfo = packageManager.getPackageInfo(this.f24319u, 512);
                if (packageInfo == null) {
                    this.f24312B = 1;
                    m22009k();
                    return;
                }
                CharSequence applicationLabel;
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                if (applicationInfo != null) {
                    applicationLabel = packageManager.getApplicationLabel(applicationInfo);
                } else {
                    applicationLabel = this.f24319u;
                }
                this.f24317s = (String) applicationLabel;
                this.f24312B = 2;
                this.f24313C = PackageVerificationService.m22005b(this, this.f24319u, this.f24311A, null);
            } catch (NameNotFoundException e) {
                this.f24312B = 1;
                m22009k();
                return;
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("app_name", this.f24317s);
        bundle2.putString("warning_message", this.f24318t);
        bundle2.putInt("action", this.f24316r);
        C1508k c1508k = new C1508k();
        c1508k.m8855b((int) C7582R.layout.package_malware_dialog).m8850a(bundle2).m8857b(false).m8853a(false);
        switch (this.f24316r) {
            case 0:
                c1508k.m8858c((int) C7582R.string.package_malware_banner_blocked);
                c1508k.m8860d((int) C7582R.string.ok);
                break;
            case 1:
                c1508k.m8858c((int) C7582R.string.package_malware_banner_blocked);
                c1508k.m8860d((int) C7582R.string.ok);
                break;
            case 2:
                c1508k.m8858c((int) C7582R.string.package_malware_banner_request_removal_question);
                c1508k.m8862e((int) C7582R.string.package_malware_keep_anyway_unsafe_caps);
                c1508k.m8860d((int) C7582R.string.ok);
                this.f24315q.mo3802b(this.f24319u);
                break;
            case 3:
                c1508k.m8858c((int) C7582R.string.package_malware_banner_removed);
                c1508k.m8860d((int) C7582R.string.ok);
                break;
            case 4:
                c1508k.m8858c((int) C7582R.string.package_verify_parent_banner);
                c1508k.m8860d((int) C7582R.string.package_verify_parent_dont_update_text);
                c1508k.m8862e((int) C7582R.string.package_verify_parent_update_anyway);
                break;
            case 5:
                c1508k.m8858c((int) C7582R.string.package_malware_banner_request_removal_question);
                c1508k.m8860d((int) C7582R.string.uninstall);
                c1508k.m8862e((int) C7582R.string.cancel);
                this.f24315q.mo3802b(this.f24319u);
                break;
        }
        C1128e agVar = new ag();
        c1508k.m8854a(agVar);
        agVar.m625a(H_(), "PackageWarningSimpleAlertDialog");
        setFinishOnTouchOutside(false);
        if (this.f24324z != null) {
            this.f24324z.mo4337a(this);
        }
    }

    private final void m22009k() {
        boolean z;
        boolean z2 = true;
        if (this.f24324z != null) {
            this.f24324z.mo4338b(this);
        }
        boolean z3 = this.f24322x || !this.f24321w;
        if (this.f24320v != -1 || z3) {
            z = false;
        } else {
            z = true;
        }
        if (!(this.f24314D == null || this.f24312B == 2)) {
            Intent intent = new Intent();
            intent.putExtra("pressed_uninstall_action", z);
            intent.putExtra("dialog_not_shown", this.f24312B);
            try {
                this.f24314D.send(this, 0, intent);
            } catch (CanceledException e) {
                FinskyLog.m21665c("Couldn't send result due to canceled PendingIntent", new Object[0]);
            }
        }
        if (this.f24313C != null) {
            Intent intent2 = new Intent();
            String str = "com.google.android.vending.verifier.intent.extra.UNINSTALL";
            if (this.f24320v != -1) {
                z2 = false;
            }
            intent2.putExtra(str, z2);
            intent2.putExtra("com.google.android.vending.verifier.intent.extra.DONT_WARN", this.f24323y);
            intent2.putExtra("dialog_dismissed", z3);
            if (this.f24312B == 2) {
                intent2.putExtra("pending_result_intent", this.f24314D);
            }
            try {
                this.f24313C.send(this, 0, intent2);
            } catch (CanceledException e2) {
                FinskyLog.m21665c("Couldn't send result due to canceled PendingIntent", new Object[0]);
            }
        }
    }

    protected void onDestroy() {
        m22009k();
        super.onDestroy();
    }

    public final void mo1202a(int i, Bundle bundle) {
        this.f24322x = bundle.getBoolean("pressed_back_button", false);
        this.f24323y = bundle.getBoolean("dont_warn", false);
        this.f24320v = -1;
        this.f24321w = true;
        finish();
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
        this.f24322x = bundle.getBoolean("pressed_back_button", false);
        this.f24323y = bundle.getBoolean("dont_warn", false);
        this.f24320v = 1;
        this.f24321w = true;
        finish();
    }
}
