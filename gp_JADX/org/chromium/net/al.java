package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class al extends BroadcastReceiver {
    public final /* synthetic */ ProxyChangeListener f40669a;

    al(ProxyChangeListener proxyChangeListener) {
        this.f40669a = proxyChangeListener;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
            ProxyChangeListener proxyChangeListener = this.f40669a;
            Runnable amVar = new am(this, intent);
            if ((proxyChangeListener.f40591b == Looper.myLooper() ? 1 : null) != null) {
                amVar.run();
            } else {
                proxyChangeListener.f40592c.post(amVar);
            }
        }
    }

    static ak m37945a(Intent intent) {
        try {
            String str;
            String str2;
            if (VERSION.SDK_INT < 21) {
                str = "android.net.ProxyProperties";
                str2 = "proxy";
            } else {
                str = "android.net.ProxyInfo";
                str2 = "android.intent.extra.PROXY_INFO";
            }
            Object obj = intent.getExtras().get(str2);
            if (obj == null) {
                return null;
            }
            String[] split;
            Class cls = Class.forName(str);
            Method declaredMethod = cls.getDeclaredMethod("getHost", new Class[0]);
            Method declaredMethod2 = cls.getDeclaredMethod("getPort", new Class[0]);
            Method declaredMethod3 = cls.getDeclaredMethod("getExclusionList", new Class[0]);
            str2 = (String) declaredMethod.invoke(obj, new Object[0]);
            int intValue = ((Integer) declaredMethod2.invoke(obj, new Object[0])).intValue();
            if (VERSION.SDK_INT < 21) {
                split = ((String) declaredMethod3.invoke(obj, new Object[0])).split(",");
            } else {
                split = (String[]) declaredMethod3.invoke(obj, new Object[0]);
            }
            if (VERSION.SDK_INT >= 19 && VERSION.SDK_INT < 21) {
                str = (String) cls.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(obj, new Object[0]);
                if (!TextUtils.isEmpty(str)) {
                    return new ak(str2, intValue, str, split);
                }
            } else if (VERSION.SDK_INT >= 21) {
                Uri uri = (Uri) cls.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(obj, new Object[0]);
                if (!Uri.EMPTY.equals(uri)) {
                    return new ak(str2, intValue, uri.toString(), split);
                }
            }
            return new ak(str2, intValue, null, split);
        } catch (ClassNotFoundException e) {
            Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + e);
            return null;
        } catch (NoSuchMethodException e2) {
            Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + e2);
            return null;
        } catch (IllegalAccessException e3) {
            Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + e3);
            return null;
        } catch (InvocationTargetException e4) {
            Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + e4);
            return null;
        } catch (NullPointerException e5) {
            Log.e("ProxyChangeListener", "Using no proxy configuration due to exception:" + e5);
            return null;
        }
    }
}
