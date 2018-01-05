package android.support.v4.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

final class bp extends bv {
    public final Context f1427a;
    public final WakeLock f1428b;
    public final WakeLock f1429c;
    public boolean f1430d;
    public boolean f1431e;

    bp(Context context, ComponentName componentName) {
        super(componentName);
        this.f1427a = context.getApplicationContext();
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        this.f1428b = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
        this.f1428b.setReferenceCounted(false);
        this.f1429c = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
        this.f1429c.setReferenceCounted(false);
    }

    final void mo304a(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setComponent(this.f);
        if (this.f1427a.startService(intent2) != null) {
            synchronized (this) {
                if (!this.f1430d) {
                    this.f1430d = true;
                    if (!this.f1431e) {
                        this.f1428b.acquire(60000);
                    }
                }
            }
        }
    }

    public final void mo303a() {
        synchronized (this) {
            this.f1430d = false;
        }
    }

    public final void mo305b() {
        synchronized (this) {
            if (!this.f1431e) {
                this.f1431e = true;
                this.f1429c.acquire(600000);
                this.f1428b.release();
            }
        }
    }

    public final void mo306c() {
        synchronized (this) {
            if (this.f1431e) {
                if (this.f1430d) {
                    this.f1428b.acquire(60000);
                }
                this.f1431e = false;
                this.f1429c.release();
            }
        }
    }
}
