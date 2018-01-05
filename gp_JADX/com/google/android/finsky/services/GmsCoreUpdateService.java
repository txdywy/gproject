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
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1283d;
import com.google.android.finsky.p111d.C2471a;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.ArrayList;
import java.util.List;

public class GmsCoreUpdateService extends Service {
    public final C2471a f20417a = C1473m.f7980a.aR();

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
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        C1254c ao = C1473m.f7980a.ao();
        List arrayList = new ArrayList();
        arrayList.add(new C1283d("com.google.android.gms"));
        ao.mo1605a(arrayList, true, new C4069c(this), new C4070d(this));
        return 2;
    }
}
