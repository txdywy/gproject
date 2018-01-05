package com.google.android.finsky.verifier.impl.p261b;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.google.android.finsky.utils.bb;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.ArrayList;
import java.util.List;

public abstract class C4728f extends Service implements C4727e {
    public final List f24306d = new ArrayList();
    public int f24307e;

    public abstract C4740a mo4335a(Intent intent);

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
        this.f24307e = i2;
        C4740a a = mo4335a(intent);
        if (a != null) {
            bb.m21791a();
            this.f24306d.add(a);
            a.m22064a((C4727e) this);
            a.m22068k();
        } else if (this.f24306d.isEmpty()) {
            stopSelf(this.f24307e);
        }
        return 3;
    }

    public final void mo4334a(C4740a c4740a) {
        bb.m21791a();
        this.f24306d.remove(c4740a);
        if (this.f24306d.isEmpty()) {
            stopSelf(this.f24307e);
        }
    }

    public void onDestroy() {
        while (!this.f24306d.isEmpty()) {
            ((C4740a) this.f24306d.remove(0)).m22069l();
        }
    }
}
