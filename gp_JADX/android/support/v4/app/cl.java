package android.support.v4.app;

import android.app.Notification;
import android.app.Notification.Builder;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.List;

final class cl {
    public static final Object f1545a = new Object();
    public static Field f1546b;
    public static boolean f1547c;

    public static SparseArray m1436a(List list) {
        SparseArray sparseArray = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Bundle bundle = (Bundle) list.get(i);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                sparseArray.put(i, bundle);
            }
        }
        return sparseArray;
    }

    public static Bundle m1434a(Notification notification) {
        synchronized (f1545a) {
            if (f1547c) {
                return null;
            }
            try {
                if (f1546b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (Bundle.class.isAssignableFrom(declaredField.getType())) {
                        declaredField.setAccessible(true);
                        f1546b = declaredField;
                    } else {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f1547c = true;
                        return null;
                    }
                }
                Bundle bundle = (Bundle) f1546b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f1546b.set(notification, bundle);
                }
                return bundle;
            } catch (Throwable e) {
                Log.e("NotificationCompat", "Unable to access notification extras", e);
                f1547c = true;
                return null;
            } catch (Throwable e2) {
                Log.e("NotificationCompat", "Unable to access notification extras", e2);
                f1547c = true;
                return null;
            }
        }
    }

    public static Bundle m1433a(Builder builder, cd cdVar) {
        builder.addAction(cdVar.f1469e, cdVar.f1470f, cdVar.f1471g);
        Bundle bundle = new Bundle(cdVar.f1465a);
        if (cdVar.f1466b != null) {
            bundle.putParcelableArray("android.support.remoteInputs", m1437a(cdVar.f1466b));
        }
        if (cdVar.f1467c != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", m1437a(cdVar.f1467c));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", cdVar.f1468d);
        return bundle;
    }

    static Bundle m1435a(cd cdVar) {
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        bundle2.putInt("icon", cdVar.f1469e);
        bundle2.putCharSequence("title", cdVar.f1470f);
        bundle2.putParcelable("actionIntent", cdVar.f1471g);
        if (cdVar.f1465a != null) {
            bundle = new Bundle(cdVar.f1465a);
        } else {
            bundle = new Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", cdVar.f1468d);
        bundle2.putBundle("extras", bundle);
        bundle2.putParcelableArray("remoteInputs", m1437a(cdVar.f1466b));
        return bundle2;
    }

    private static Bundle[] m1437a(co[] coVarArr) {
        if (coVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[coVarArr.length];
        if (coVarArr.length <= 0) {
            return bundleArr;
        }
        Bundle bundle = new Bundle();
        throw new NoSuchMethodError();
    }

    static {
        Object obj = new Object();
    }
}
