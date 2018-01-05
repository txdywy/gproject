package android.support.v4.p028a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import android.util.Log;
import android.util.SparseArray;

@Deprecated
public abstract class C0233w extends BroadcastReceiver {
    public static final SparseArray f1252a = new SparseArray();
    public static int f1253b = 1;

    public static ComponentName m1137a(Context context, Intent intent) {
        synchronized (f1252a) {
            int i = f1253b;
            int i2 = f1253b + 1;
            f1253b = i2;
            if (i2 <= 0) {
                f1253b = 1;
            }
            intent.putExtra("android.support.content.wakelockid", i);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:" + startService.flattenToShortString());
            newWakeLock.setReferenceCounted(false);
            newWakeLock.acquire(60000);
            f1252a.put(i, newWakeLock);
            return startService;
        }
    }

    public static boolean m1138a(Intent intent) {
        int intExtra = intent.getIntExtra("android.support.content.wakelockid", 0);
        if (intExtra == 0) {
            return false;
        }
        synchronized (f1252a) {
            WakeLock wakeLock = (WakeLock) f1252a.get(intExtra);
            if (wakeLock != null) {
                wakeLock.release();
                f1252a.remove(intExtra);
                return true;
            }
            Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
            return true;
        }
    }
}
