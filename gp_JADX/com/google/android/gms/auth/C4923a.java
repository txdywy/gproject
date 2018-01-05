package com.google.android.gms.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.internal.am;

public final class C4923a extends C4922b {
    public static String m22936a(Context context, Account account, String str) {
        Bundle bundle = new Bundle();
        C4922b.m22934a(account);
        am.m23745c("Calling this from your main thread can lead to deadlock");
        am.m23736a(str, (Object) "Scope cannot be empty or null.");
        C4922b.m22934a(account);
        C4922b.m22935a(context);
        Bundle bundle2 = new Bundle(bundle);
        String str2 = context.getApplicationInfo().packageName;
        bundle2.putString("clientPackageName", str2);
        if (TextUtils.isEmpty(bundle2.getString(C4922b.f25334b))) {
            bundle2.putString(C4922b.f25334b, str2);
        }
        bundle2.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
        return ((TokenData) C4922b.m22932a(context, C4922b.f25335c, new C4968d(account, str, bundle2))).f25276b;
    }

    public static Account[] m22937a(Context context, String str, String[] strArr) {
        am.m23733a((Object) context);
        am.m23735a(str);
        C4922b.m22935a(context);
        return (Account[]) C4922b.m22932a(context, C4922b.f25335c, new C4969e(str, strArr));
    }
}
