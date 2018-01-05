package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import org.chromium.base.BuildInfo;

final class ba extends BroadcastReceiver {
    ba() {
    }

    public final void onReceive(Context context, Intent intent) {
        boolean z = true;
        if (!BuildInfo.m37784a()) {
            z = "android.security.STORAGE_CHANGED".equals(intent.getAction());
        } else if (!("android.security.action.KEYCHAIN_CHANGED".equals(intent.getAction()) || "android.security.action.TRUST_STORE_CHANGED".equals(intent.getAction()) || ("android.security.action.KEY_ACCESS_CHANGED".equals(intent.getAction()) && !intent.getBooleanExtra("android.security.extra.KEY_ACCESSIBLE", false)))) {
            z = false;
        }
        if (z) {
            try {
                X509Util.m37863c();
            } catch (Throwable e) {
                Log.e("X509Util", "Unable to reload the default TrustManager", e);
            } catch (Throwable e2) {
                Log.e("X509Util", "Unable to reload the default TrustManager", e2);
            } catch (Throwable e22) {
                Log.e("X509Util", "Unable to reload the default TrustManager", e22);
            }
        }
    }
}
