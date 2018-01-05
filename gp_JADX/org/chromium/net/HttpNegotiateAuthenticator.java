package org.chromium.net;

import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.C7888e;
import org.chromium.base.C7893j;
import org.chromium.base.ThreadUtils;
import org.chromium.base.annotations.CalledByNative;

public class HttpNegotiateAuthenticator {
    public Bundle f40570a;
    public final String f40571b;

    private HttpNegotiateAuthenticator(String str) {
        this.f40571b = str;
    }

    native void nativeSetResult(long j, int i, String str);

    @CalledByNative
    static HttpNegotiateAuthenticator create(String str) {
        return new HttpNegotiateAuthenticator(str);
    }

    @CalledByNative
    void getNextAuthToken(long j, String str, String str2, boolean z) {
        Context context = C7888e.f40514a;
        C7971r c7971r = new C7971r();
        c7971r.f40950d = "SPNEGO:HOSTBASED:" + str;
        c7971r.f40948b = AccountManager.get(context);
        c7971r.f40947a = j;
        String[] strArr = new String[]{"SPNEGO"};
        c7971r.f40949c = new Bundle();
        if (str2 != null) {
            c7971r.f40949c.putString("incomingAuthToken", str2);
        }
        if (this.f40570a != null) {
            c7971r.f40949c.putBundle("spnegoContext", this.f40570a);
        }
        c7971r.f40949c.putBoolean("canDelegate", z);
        Activity activity = ApplicationStatus.f40481c;
        if (activity != null) {
            String str3;
            boolean z2 = VERSION.SDK_INT < 23;
            if (z2) {
                str3 = "android.permission.MANAGE_ACCOUNTS";
            } else {
                str3 = "android.permission.GET_ACCOUNTS";
            }
            if (m37837a(context, str3, z2)) {
                C7893j.m37818b("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: %s permission not granted. Aborting authentication", str3);
                nativeSetResult(c7971r.f40947a, -343, null);
                return;
            }
            c7971r.f40948b.getAuthTokenByFeatures(this.f40571b, c7971r.f40950d, strArr, activity, null, c7971r.f40949c, new C7969p(this, c7971r), new Handler(ThreadUtils.m37806a().getLooper()));
        } else if (m37837a(context, "android.permission.GET_ACCOUNTS", true)) {
            C7893j.m37818b("net_auth", "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.", new Object[0]);
            nativeSetResult(c7971r.f40947a, -343, null);
        } else {
            c7971r.f40948b.getAccountsByTypeAndFeatures(this.f40571b, strArr, new C7968o(this, c7971r), new Handler(ThreadUtils.m37806a().getLooper()));
        }
    }

    static boolean m37837a(Context context, String str, boolean z) {
        if ((!z || VERSION.SDK_INT < 23) && context.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
            return true;
        }
        return false;
    }
}
