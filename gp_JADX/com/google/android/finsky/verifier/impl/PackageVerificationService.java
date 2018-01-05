package com.google.android.finsky.verifier.impl;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.dy.ad;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.verifier.impl.p261b.C4728f;
import com.google.android.finsky.verifier.impl.p261b.C4740a;

public class PackageVerificationService extends C4728f {
    public ad f24308a;
    public ag f24309b;
    public C1461c f24310c;

    public static void m22003a(Context context, Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(new ComponentName(context, PackageVerificationService.class));
        context.startService(intent2);
    }

    public void onCreate() {
        super.onCreate();
        ((ac) C3947d.m18649a(ac.class)).mo1975a(this);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if ((i & 1) != 0) {
            intent.putExtra("restarted_service", true);
        }
        return super.onStartCommand(intent, i, i2);
    }

    public final C4740a mo4335a(Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.PACKAGE_NEEDS_VERIFICATION".equals(action) || "android.intent.action.VIEW".equals(action) || "android.intent.action.INSTALL_PACKAGE".equals(action)) {
            return new de(this, intent);
        }
        if ("com.google.android.vending.verifier.intent.action.VERIFY_INSTALLED_PACKAGES".equals(action)) {
            return new dk(intent);
        }
        if ("com.google.android.vending.verifier.REMOVAL_REQUEST_RESPONSE".equals(action)) {
            return new aw(this, intent);
        }
        if ("com.google.android.vending.verifier.ACTION_LIST_HARMFUL_APPS".equals(action)) {
            return new C4769v(intent);
        }
        if ("com.google.android.vending.verifier.ACTION_GET_VERIFY_APPS_DATA".equals(action)) {
            return new br(intent);
        }
        if ("com.google.android.vending.verifier.UNINSTALL_PACKAGE".equals(action)) {
            return new az(this, intent);
        }
        if ("com.google.android.vending.verifier.HIDE_REMOVED_APP".equals(action)) {
            return new C4767t(this, intent);
        }
        if ("com.google.android.vending.verifier.UPDATE_SAFE_BROWSING".equals(action)) {
            if (this.f24310c.dj().mo2294a(12633445) || ((Boolean) C0955b.cm.m28964b()).booleanValue()) {
                return new C4772y(this);
            }
        } else if ("com.google.android.finsky.verifier.ACTION_RESTORE_NOTIFICATIONS".equals(action)) {
            return new an(this);
        }
        return null;
    }

    @SuppressLint({"InlinedApi"})
    static void m22004a(Context context, String str, byte[] bArr, boolean z) {
        Intent intent = new Intent("com.google.android.vending.verifier.UNINSTALL_PACKAGE");
        intent.setComponent(new ComponentName(context, PackageVerificationService.class));
        intent.putExtra("android.content.pm.extra.VERIFICATION_PACKAGE_NAME", str);
        intent.putExtra("digest", bArr);
        intent.putExtra("only_disable", z);
        context.startService(intent);
    }

    static PendingIntent m22002a(Context context, String str, byte[] bArr, byte[] bArr2) {
        Intent intent = new Intent("com.google.android.vending.verifier.REMOVAL_REQUEST_RESPONSE");
        intent.setComponent(new ComponentName(context, PackageVerificationService.class));
        intent.putExtra("android.content.pm.extra.VERIFICATION_PACKAGE_NAME", str);
        intent.putExtra("digest", bArr);
        intent.putExtra("com.google.android.vending.verifier.intent.extra.UNINSTALL", true);
        intent.putExtra("com.google.android.vending.verifier.intent.extra.DONT_WARN", false);
        intent.putExtra("dialog_dismissed", false);
        intent.putExtra("pressed_uninstall_action", true);
        intent.putExtra("com.google.android.vending.verifier.intent.extra.RESPONSE_TOKEN", bArr2);
        String str2 = "verifyapps://removalrequest/";
        String valueOf = String.valueOf(str);
        intent.setData(Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)));
        return PendingIntent.getService(context, 0, intent, 0);
    }

    static PendingIntent m22005b(Context context, String str, byte[] bArr, byte[] bArr2) {
        Intent intent = new Intent("com.google.android.vending.verifier.REMOVAL_REQUEST_RESPONSE");
        intent.setComponent(new ComponentName(context, PackageVerificationService.class));
        intent.putExtra("android.content.pm.extra.VERIFICATION_PACKAGE_NAME", str);
        intent.putExtra("digest", bArr);
        intent.putExtra("pressed_uninstall_action", false);
        intent.putExtra("com.google.android.vending.verifier.intent.extra.RESPONSE_TOKEN", bArr2);
        String str2 = "verifyapps://removalresult/";
        String valueOf = String.valueOf(str);
        intent.setData(Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)));
        return PendingIntent.getService(context, 0, intent, 0);
    }
}
