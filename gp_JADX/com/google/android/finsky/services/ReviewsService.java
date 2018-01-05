package com.google.android.finsky.services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.android.vending.p059e.C0644b;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

public class ReviewsService extends Service {
    public static final AtomicInteger f20422a = new AtomicInteger(0);
    public final C2471a f20423b = C1473m.f7980a.aR();
    public C2744a f20424c = C1473m.f7980a.aJ();
    public final C0644b f20425d = new C4088v(this);

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    public IBinder onBind(Intent intent) {
        return this.f20425d;
    }

    static /* synthetic */ void m18994a(String str, C2482j c2482j, String str2, ExecutionException executionException, String str3, int i) {
        Throwable cause = executionException.getCause();
        String simpleName = cause == null ? null : cause.getClass().getSimpleName();
        FinskyLog.m21659a(str3, simpleName);
        C2744a.m14787a(c2482j, 514, str, i, str2);
    }
}
