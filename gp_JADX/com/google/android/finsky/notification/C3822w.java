package com.google.android.finsky.notification;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.p111d.C2495w;

public final class C3822w {
    public static Intent m18272a(C3820u c3820u, Context context, Class cls, C2495w c2495w) {
        Intent action = new Intent(context, cls).setAction(c3820u.f19148a);
        action.putExtras(c3820u.f19149b);
        if (c3820u.f19150c != null) {
            action.setData(c3820u.f19150c);
        }
        if (c2495w != null) {
            c2495w.m13376a(action);
        }
        return action;
    }

    public static PendingIntent m18271a(Intent intent, Context context, int i) {
        return PendingIntent.getActivity(context, i, intent, 1342177280);
    }
}
