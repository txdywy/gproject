package android.support.v4.app;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class bm extends Service {
    public static final Object f1415g = new Object();
    public static final HashMap f1416h = new HashMap();
    public bo f1417a;
    public bv f1418b;
    public bn f1419c;
    public boolean f1420d = false;
    public boolean f1421e = false;
    public final ArrayList f1422f;

    public bm() {
        if (VERSION.SDK_INT >= 26) {
            this.f1422f = null;
        } else {
            this.f1422f = new ArrayList();
        }
    }

    public abstract void mo3486a(Intent intent);

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
        if (VERSION.SDK_INT >= 26) {
            this.f1417a = new bs(this);
            this.f1418b = null;
            return;
        }
        this.f1417a = null;
        this.f1418b = m1345a((Context) this, new ComponentName(this, getClass()), false, 0);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f1422f == null) {
            return 2;
        }
        this.f1418b.mo303a();
        synchronized (this.f1422f) {
            ArrayList arrayList = this.f1422f;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new bq(this, intent, i2));
            m1349a(true);
        }
        return 3;
    }

    public IBinder onBind(Intent intent) {
        if (this.f1417a != null) {
            return this.f1417a.mo309a();
        }
        return null;
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f1422f != null) {
            synchronized (this.f1422f) {
                this.f1421e = true;
                this.f1418b.mo306c();
            }
        }
    }

    public static void m1346a(Context context, Class cls, int i, Intent intent) {
        ComponentName componentName = new ComponentName(context, cls);
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f1415g) {
            bv a = m1345a(context, componentName, true, i);
            a.m1354a(i);
            a.mo304a(intent);
        }
    }

    private static bv m1345a(Context context, ComponentName componentName, boolean z, int i) {
        bv bvVar = (bv) f1416h.get(componentName);
        if (bvVar == null) {
            if (VERSION.SDK_INT < 26) {
                bvVar = new bp(context, componentName);
            } else if (z) {
                bvVar = new bu(context, componentName, i);
            } else {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            f1416h.put(componentName, bvVar);
        }
        return bvVar;
    }

    final void m1349a(boolean z) {
        if (this.f1419c == null) {
            this.f1419c = new bn(this);
            if (this.f1418b != null && z) {
                this.f1418b.mo305b();
            }
            this.f1419c.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    final void m1347a() {
        if (this.f1422f != null) {
            synchronized (this.f1422f) {
                this.f1419c = null;
                if (this.f1422f != null && this.f1422f.size() > 0) {
                    m1349a(false);
                } else if (!this.f1421e) {
                    this.f1418b.mo306c();
                }
            }
        }
    }

    final br m1350b() {
        if (this.f1417a != null) {
            return this.f1417a.mo310b();
        }
        synchronized (this.f1422f) {
            if (this.f1422f.size() > 0) {
                br brVar = (br) this.f1422f.remove(0);
                return brVar;
            }
            return null;
        }
    }
}
