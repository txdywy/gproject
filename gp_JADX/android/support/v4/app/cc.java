package android.support.v4.app;

import android.app.Notification;
import android.os.Build.VERSION;
import android.os.Bundle;

public final class cc {
    public static Bundle m1407a(Notification notification) {
        if (VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (VERSION.SDK_INT >= 16) {
            return cl.m1434a(notification);
        }
        return null;
    }
}
