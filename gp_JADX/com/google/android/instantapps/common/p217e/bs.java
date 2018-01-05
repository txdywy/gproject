package com.google.android.instantapps.common.p217e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.support.v4.os.C0327a;
import android.webkit.WebView;
import android.webkit.WebViewUpdateService;
import com.google.android.instantapps.common.C5804k;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import com.google.android.instantapps.p309a.C5697d;
import com.google.android.instantapps.p309a.p311b.p312a.C5694a;
import com.google.android.instantapps.supervisor.reflect.ReflectionUtils;
import java.lang.reflect.Method;

public final class bs {
    public static final C5804k f29124a = new C5804k("WebviewCriteria");
    public final Context f29125b;
    public final C5710a f29126c;
    public final bf f29127d;
    public final C5694a f29128e = new C5697d(new bt(this));

    public bs(Context context, C5710a c5710a, bf bfVar) {
        this.f29125b = context;
        this.f29126c = c5710a;
        this.f29127d = bfVar;
    }

    final int m27125a() {
        try {
            PackageInfo a = bs.m27124a(this.f29125b.getPackageManager());
            if (a != null) {
                return a.versionCode;
            }
            f29124a.m27211d("Could not find the Webview version on this device.", new Object[0]);
            this.f29126c.mo5136a(1337);
            return -1;
        } catch (Throwable e) {
            f29124a.m27208a(e, "Could not find the Webview version on this device.", new Object[0]);
        }
    }

    private static PackageInfo m27124a(PackageManager packageManager) {
        if (VERSION.SDK_INT < 21) {
            return null;
        }
        if (C0327a.m1722b()) {
            return WebView.getCurrentWebViewPackage();
        }
        String currentWebViewPackageName;
        if (C0327a.m1721a()) {
            currentWebViewPackageName = WebViewUpdateService.getCurrentWebViewPackageName();
        } else {
            String valueOf;
            Class a = ReflectionUtils.m27267a("android.webkit.WebViewFactory");
            String str = "getWebViewPackageName";
            Object[] objArr = new Object[0];
            Method[] declaredMethods = a.getDeclaredMethods();
            int length = declaredMethods.length;
            int i = 0;
            Method method = null;
            while (i < length) {
                Method method2 = declaredMethods[i];
                if (!str.equals(method2.getName())) {
                    method2 = method;
                } else if (method != null) {
                    valueOf = String.valueOf(a);
                    throw new IllegalArgumentException(new StringBuilder((String.valueOf(str).length() + 46) + String.valueOf(valueOf).length()).append("Multiple matching methods found for ").append(str).append(" in class ").append(valueOf).toString());
                }
                i++;
                method = method2;
            }
            if (method == null) {
                valueOf = String.valueOf(a);
                throw new IllegalArgumentException(new StringBuilder((String.valueOf(str).length() + 28) + String.valueOf(valueOf).length()).append("Unable to find: ").append(str).append(" for class: ").append(valueOf).toString());
            }
            currentWebViewPackageName = (String) ReflectionUtils.m27268a(method, objArr);
        }
        if (currentWebViewPackageName == null) {
            return null;
        }
        try {
            return packageManager.getPackageInfo(currentWebViewPackageName, 8192);
        } catch (NameNotFoundException e) {
            return null;
        }
    }
}
