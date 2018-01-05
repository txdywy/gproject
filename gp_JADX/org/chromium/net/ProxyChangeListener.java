package org.chromium.net;

import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import org.chromium.base.C7888e;
import org.chromium.base.annotations.CalledByNative;

public class ProxyChangeListener {
    public static boolean f40590a = true;
    public final Looper f40591b = Looper.myLooper();
    public final Handler f40592c = new Handler(this.f40591b);
    public long f40593d;
    public al f40594e;
    public aj f40595f;

    private ProxyChangeListener() {
    }

    private native void nativeProxySettingsChanged(long j);

    private native void nativeProxySettingsChangedTo(long j, String str, int i, String str2, String[] strArr);

    @CalledByNative
    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    @CalledByNative
    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    @CalledByNative
    public void start(long j) {
        this.f40593d = j;
        if (this.f40594e == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PROXY_CHANGE");
            this.f40594e = new al(this);
            C7888e.f40514a.registerReceiver(this.f40594e, intentFilter);
        }
    }

    @CalledByNative
    public void stop() {
        this.f40593d = 0;
        if (this.f40594e != null) {
            C7888e.f40514a.unregisterReceiver(this.f40594e);
            this.f40594e = null;
        }
    }

    final void m37854a(al alVar, ak akVar) {
        if (f40590a && alVar == this.f40594e) {
            if (this.f40595f != null) {
                this.f40595f.m37944a();
            }
            if (this.f40593d == 0) {
                return;
            }
            if (akVar != null) {
                nativeProxySettingsChangedTo(this.f40593d, akVar.f40665a, akVar.f40666b, akVar.f40667c, akVar.f40668d);
            } else {
                nativeProxySettingsChanged(this.f40593d);
            }
        }
    }
}
