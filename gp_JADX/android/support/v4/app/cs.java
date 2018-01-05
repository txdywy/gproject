package android.support.v4.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.support.v4.p028a.C0216d;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class cs implements Iterable {
    public final ArrayList f1554a = new ArrayList();
    public final Context f1555b;

    private cs(Context context) {
        this.f1555b = context;
    }

    public static cs m1445a(Context context) {
        return new cs(context);
    }

    public final cs m1447a(Intent intent) {
        this.f1554a.add(intent);
        return this;
    }

    public final cs m1446a(ComponentName componentName) {
        int size = this.f1554a.size();
        try {
            Intent a = ca.m1402a(this.f1555b, componentName);
            while (a != null) {
                this.f1554a.add(size, a);
                a = ca.m1402a(this.f1555b, a.getComponent());
            }
            return this;
        } catch (Throwable e) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    @Deprecated
    public final Iterator iterator() {
        return this.f1554a.iterator();
    }

    public final void m1448a() {
        if (this.f1554a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f1554a.toArray(new Intent[this.f1554a.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        C0216d.m1114a(this.f1555b, intentArr);
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            cu cuVar = new cu();
        } else {
            cv cvVar = new cv();
        }
    }
}
