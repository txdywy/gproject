package com.google.android.gms.common.internal;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;

public final class C5123l {
    static {
        Uri.parse("https://plus.google.com/").buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent m23806a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    public static Intent m23807a(String str) {
        Uri fromParts = Uri.fromParts("package", str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }

    public static Intent m23808a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", str);
        if (!TextUtils.isEmpty(str2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", str2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    public static boolean m23809a(PackageManager packageManager, Intent intent) {
        return packageManager.resolveActivity(intent, 65536) != null;
    }
}
