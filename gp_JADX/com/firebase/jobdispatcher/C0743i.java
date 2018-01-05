package com.firebase.jobdispatcher;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.p037h.C0304u;

public final class C0743i implements C0736c {
    public final ak f4683a;
    public final Context f4684b;
    public final PendingIntent f4685c;
    public final C0746k f4686d = new C0746k();

    public C0743i(Context context) {
        this.f4684b = context;
        this.f4685c = PendingIntent.getBroadcast(context, 0, new Intent(), 0);
        this.f4683a = new C0735b(context);
    }

    public final boolean mo1116c() {
        return true;
    }

    public final int mo1114a(C0752t c0752t) {
        boolean z;
        int i;
        int i2 = 1;
        synchronized (GooglePlayReceiver.f4640g) {
            C0304u c0304u = (C0304u) GooglePlayReceiver.f4640g.get(c0752t.f4692a);
            if (c0304u == null) {
            } else if (((C0744v) c0304u.get(c0752t.f4693b)) == null) {
            } else {
                C0756y c0756y = new C0756y();
                c0756y.f4722a = c0752t.f4693b;
                c0756y.f4723b = c0752t.f4692a;
                c0756y.f4724c = c0752t.f4694c;
                C0737d.m4839a(c0756y.m4904a(), false);
            }
        }
        Context context = this.f4684b;
        Intent a = m4850a("SCHEDULE_TASK");
        C0746k c0746k = this.f4686d;
        Bundle extras = a.getExtras();
        extras.putString("tag", c0752t.mo1122e());
        extras.putBoolean("update_current", c0752t.mo1121d());
        if (c0752t.mo1124g() == 2) {
            z = true;
        } else {
            z = false;
        }
        extras.putBoolean("persisted", z);
        extras.putString("service", GooglePlayReceiver.class.getName());
        ag f = c0752t.mo1123f();
        if (f == ao.f4673a) {
            extras.putInt("trigger_type", 2);
            extras.putLong("window_start", 0);
            extras.putLong("window_end", 1);
        } else if (f instanceof ai) {
            ai aiVar = (ai) f;
            extras.putInt("trigger_type", 1);
            if (c0752t.mo1125h()) {
                extras.putLong("period", (long) aiVar.f4666b);
                extras.putLong("period_flex", (long) (aiVar.f4666b - aiVar.f4665a));
            } else {
                extras.putLong("window_start", (long) aiVar.f4665a);
                extras.putLong("window_end", (long) aiVar.f4666b);
            }
        } else if (f instanceof ah) {
            ah ahVar = (ah) f;
            extras.putInt("trigger_type", 3);
            int size = ahVar.f4664a.size();
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Uri[size];
            for (int i3 = 0; i3 < size; i3++) {
                al alVar = (al) ahVar.f4664a.get(i3);
                iArr[i3] = alVar.f4668b;
                parcelableArr[i3] = alVar.f4667a;
            }
            extras.putIntArray("content_uri_flags_array", iArr);
            extras.putParcelableArray("content_uri_array", parcelableArr);
        } else {
            String valueOf = String.valueOf(f.getClass());
            throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 17).append("Unknown trigger: ").append(valueOf).toString());
        }
        int a2 = C0732a.m4810a(c0752t.mo1118a());
        String str = "requiresCharging";
        if ((a2 & 4) == 4) {
            z = true;
        } else {
            z = false;
        }
        extras.putBoolean(str, z);
        str = "requiresIdle";
        if ((a2 & 8) == 8) {
            z = true;
        } else {
            z = false;
        }
        extras.putBoolean(str, z);
        str = "requiredNetwork";
        if ((a2 & 2) == 2) {
            i = 0;
        } else {
            i = 2;
        }
        if ((a2 & 1) == 1) {
            i = 1;
        }
        extras.putInt(str, i);
        am c = c0752t.mo1120c();
        Bundle bundle = new Bundle();
        String str2 = "retry_policy";
        switch (c.f4670b) {
            case 2:
                break;
            default:
                i2 = 0;
                break;
        }
        bundle.putInt(str2, i2);
        bundle.putInt("initial_backoff_seconds", c.f4671c);
        bundle.putInt("maximum_backoff_seconds", c.f4672d);
        extras.putBundle("retryStrategy", bundle);
        Bundle b = c0752t.mo1119b();
        if (b == null) {
            b = new Bundle();
        }
        extras.putBundle("extras", c0746k.f4688a.m4893a(c0752t, b));
        a.putExtras(extras);
        context.sendBroadcast(a);
        return 0;
    }

    public final int mo1113a() {
        Context context = this.f4684b;
        Intent a = m4850a("CANCEL_ALL");
        a.putExtra("component", new ComponentName(this.f4684b, GooglePlayReceiver.class));
        context.sendBroadcast(a);
        return 0;
    }

    public final ak mo1115b() {
        return this.f4683a;
    }

    private final Intent m4850a(String str) {
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_SCHEDULE");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("scheduler_action", str);
        intent.putExtra("app", this.f4685c);
        intent.putExtra("source", 8);
        intent.putExtra("source_version", 1);
        return intent;
    }
}
