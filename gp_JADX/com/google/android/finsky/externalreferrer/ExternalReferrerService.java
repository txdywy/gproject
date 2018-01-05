package com.google.android.finsky.externalreferrer;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.providers.C3947d;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import p002a.C0002a;

public class ExternalReferrerService extends Service {
    public C0002a f15745a;
    public C0002a f15746b;
    public C0002a f15747c;
    public int f15748d;
    public int f15749e;

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

    public void onCreate() {
        super.onCreate();
        ((C1382g) C3947d.m18649a(C1382g.class)).mo1836a(this);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void m15582a(Context context, String str, boolean z) {
        Intent intent = new Intent(context, ExternalReferrerService.class);
        intent.putExtra("package_name", str);
        intent.putExtra("is_added", z);
        String str2 = "externalreferrerservice://sendreferrer/";
        String valueOf = String.valueOf(str);
        intent.setData(Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)));
        context.startService(intent);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f15748d = i2;
        this.f15749e++;
        Runnable c3015h = new C3015h(this, intent.getStringExtra("package_name"), intent.getBooleanExtra("is_added", false));
        ((C2206c) this.f15747c.mo1a()).mo2815a(c3015h);
        ((C3646a) this.f15746b.mo1a()).m17248a(c3015h);
        return 3;
    }
}
