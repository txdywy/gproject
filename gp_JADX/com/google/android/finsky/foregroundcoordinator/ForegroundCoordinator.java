package com.google.android.finsky.foregroundcoordinator;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.support.v4.os.C0327a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ah.C1186a;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ai;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import com.squareup.leakcanary.C7582R;
import java.util.PriorityQueue;

public final class ForegroundCoordinator {
    public final Context f16148a;
    public final C1186a f16149b;
    public final ai f16150c;

    public class ForegroundCoordinatorService extends Service {
        public C2471a f16143a;
        public ab f16144b;
        public C2171b f16145c;
        public final IBinder f16146d = new C3137a(this);
        public PriorityQueue f16147e = new PriorityQueue();

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
            ((C1386c) C3947d.m18649a(C1386c.class)).mo1842a(this);
        }

        public IBinder onBind(Intent intent) {
            int intExtra = intent.getIntExtra("TASK", -1);
            if (intExtra < 0 || intExtra > 8) {
                FinskyLog.m21669e("Invalid task key: %d", Integer.valueOf(intExtra));
            } else {
                if (this.f16147e.isEmpty() || intExtra < ((Integer) this.f16147e.peek()).intValue()) {
                    m16014a(intExtra);
                }
                this.f16147e.add(Integer.valueOf(intExtra));
            }
            return this.f16146d;
        }

        final void m16014a(int i) {
            Intent intent;
            int i2;
            String str = null;
            switch (i) {
                case 4:
                    intent = new Intent();
                    break;
                default:
                    intent = this.f16145c.mo2750a((Context) this, null, null, null, null, this.f16143a.m13184a(null));
                    break;
            }
            ab abVar = this.f16144b;
            switch (i) {
                case 0:
                    str = getString(C7582R.string.foreground_hygiene);
                    break;
                case 2:
                    str = getString(C7582R.string.pfw_foreground_sync);
                    break;
                case 3:
                    str = getString(C7582R.string.pfw_foreground_sync);
                    break;
                case 4:
                    str = getString(C7582R.string.wear_foreground_update);
                    break;
                case 5:
                    str = getString(C7582R.string.wear_foreground_update);
                    break;
                case 6:
                    str = getString(C7582R.string.verify_app_checking_device);
                    break;
                case 7:
                    str = getString(C7582R.string.verify_app_checking_device);
                    break;
                case 8:
                    str = getString(C7582R.string.wear_foreground_update);
                    break;
            }
            switch (i) {
                case 0:
                    i2 = C7582R.drawable.stat_notify_update;
                    break;
                case 2:
                    i2 = C7582R.drawable.stat_notify_update;
                    break;
                case 3:
                    i2 = C7582R.drawable.stat_notify_update;
                    break;
                case 4:
                    i2 = C7582R.drawable.stat_notify_update;
                    break;
                case 5:
                    i2 = C7582R.drawable.stat_notify_update;
                    break;
                case 6:
                    i2 = C7582R.drawable.stat_notify_shield;
                    break;
                case 7:
                    i2 = C7582R.drawable.stat_notify_shield;
                    break;
                case 8:
                    i2 = C7582R.drawable.stat_notify_update;
                    break;
                default:
                    i2 = -1;
                    break;
            }
            startForeground(this.f16144b.mo3806c(), abVar.mo3771a(str, i2, "5.maintenance-channel", intent));
        }

        public boolean onUnbind(Intent intent) {
            stopForeground(true);
            return false;
        }
    }

    public ForegroundCoordinator(Context context, C1186a c1186a, ai aiVar) {
        this.f16148a = context.getApplicationContext();
        this.f16149b = c1186a;
        this.f16150c = aiVar;
    }

    public final C3138b m16016a(int i, C1552e c1552e, Runnable runnable) {
        if (i < 0 || i > 8) {
            FinskyLog.m21669e("Invalid task key: %d", Integer.valueOf(i));
            throw new IllegalArgumentException(String.format("Invalid task key: %d", new Object[]{Integer.valueOf(i)}));
        }
        boolean a;
        FinskyLog.m21659a("Task %d requested foreground", Integer.valueOf(i));
        if (!c1552e.mo2294a(12608255) && ((Integer) C0955b.f5861E.m28964b()).intValue() <= VERSION.SDK_INT) {
            switch (i) {
                case 0:
                    a = C0327a.m1721a();
                    break;
                case 2:
                    if (VERSION.SDK_INT < 23) {
                        a = false;
                        break;
                    }
                    a = true;
                    break;
                case 3:
                    if (VERSION.SDK_INT < 23) {
                        a = false;
                        break;
                    }
                    a = true;
                    break;
                case 4:
                    a = C0327a.m1721a();
                    break;
                case 5:
                    if (VERSION.SDK_INT < 23) {
                        a = false;
                        break;
                    }
                    a = true;
                    break;
                case 6:
                    a = C0327a.m1721a();
                    break;
                case 7:
                    a = m16017a();
                    break;
                case 8:
                    if (VERSION.SDK_INT < 26) {
                        a = false;
                        break;
                    }
                    a = true;
                    break;
            }
        }
        a = false;
        if (a) {
            FinskyLog.m21659a("Entering foreground", new Object[0]);
            Object c3138b = new C3138b(this.f16148a, runnable, i);
            Intent intent = new Intent(this.f16148a, ForegroundCoordinatorService.class);
            intent.putExtra("TASK", i);
            this.f16148a.bindService(intent, c3138b, 1);
            return c3138b;
        }
        FinskyLog.m21659a("Not entering foreground", new Object[0]);
        runnable.run();
        return null;
    }

    public static void m16015a(C3138b c3138b) {
        if (c3138b != null) {
            FinskyLog.m21659a("Releasing connection from task %d", Integer.valueOf(c3138b.f16154c));
            if (c3138b.f16156e) {
                ForegroundCoordinatorService foregroundCoordinatorService = c3138b.f16155d;
                int i = c3138b.f16154c;
                foregroundCoordinatorService.f16147e.remove(Integer.valueOf(i));
                if (!foregroundCoordinatorService.f16147e.isEmpty() && ((Integer) foregroundCoordinatorService.f16147e.peek()).intValue() > i) {
                    foregroundCoordinatorService.m16014a(((Integer) foregroundCoordinatorService.f16147e.peek()).intValue());
                }
                c3138b.f16152a.unbindService(c3138b);
                c3138b.f16156e = false;
                return;
            }
            FinskyLog.m21669e("ServiceConnection unbound before onServiceConnected for task %d", Integer.valueOf(c3138b.f16154c));
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m16017a() {
        /*
        r3 = this;
        r1 = 0;
        r0 = r3.f16149b;
        r0 = r0.m7139a();
        if (r0 == 0) goto L_0x001f;
    L_0x0009:
        r0 = android.os.Build.VERSION.SDK_INT;
        r2 = 16;
        if (r0 < r2) goto L_0x0029;
    L_0x000f:
        r0 = r3.f16148a;
        r2 = "connectivity";
        r0 = r0.getSystemService(r2);
        r0 = (android.net.ConnectivityManager) r0;
        r0 = r0.isActiveNetworkMetered();
    L_0x001d:
        if (r0 != 0) goto L_0x0027;
    L_0x001f:
        r0 = r3.f16150c;
        r0 = r0.m21699d();
        if (r0 == 0) goto L_0x002b;
    L_0x0027:
        r0 = 1;
    L_0x0028:
        return r0;
    L_0x0029:
        r0 = r1;
        goto L_0x001d;
    L_0x002b:
        r0 = r1;
        goto L_0x0028;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator.a():boolean");
    }
}
