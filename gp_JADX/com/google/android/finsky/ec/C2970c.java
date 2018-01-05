package com.google.android.finsky.ec;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.ConnectivityManager.NetworkCallback;
import android.net.NetworkRequest.Builder;
import android.os.SystemClock;
import android.support.v4.app.cd;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.HashSet;
import java.util.Set;

@TargetApi(21)
public final class C2970c implements C2969b, C1003o {
    public static final ComponentName f15621a = new ComponentName("com.google.android.apps.wearable.settings", "com.google.android.clockwork.settings.MainSettingsActivity");
    public final Context f15622b;
    public final ab f15623c;
    public final ConnectivityManager f15624d;
    public final AlarmManager f15625e;
    public NetworkCallback f15626f;
    public boolean f15627g;
    public final boolean f15628h;
    public final Set f15629i = new HashSet();
    public final BroadcastReceiver f15630j = new C2971d(this);

    public C2970c(Context context, ab abVar, boolean z) {
        this.f15622b = context;
        this.f15623c = abVar;
        this.f15624d = (ConnectivityManager) context.getSystemService("connectivity");
        this.f15625e = (AlarmManager) context.getSystemService("alarm");
        this.f15628h = z;
    }

    public final void mo3210a(String str) {
        FinskyLog.m21659a("handleUnmeteredNetworkRequest", new Object[0]);
        if (this.f15629i.isEmpty()) {
            C1473m.f7980a.bw().mo3481a((C1003o) this);
            Context context = this.f15622b;
            BroadcastReceiver broadcastReceiver = this.f15630j;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.finsky.UNMETERED_NETWORK_TIMEOUT");
            intentFilter.addAction("com.google.android.finsky.wear.NOTIFICATION_DISMISSED");
            intentFilter.addAction("com.google.android.finsky.wear.WIFI_NOTIFICATION_CLICKED");
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
        this.f15629i.add(str);
        if (this.f15627g) {
            m15394c();
        } else if (this.f15626f == null) {
            m15389a();
        }
    }

    final void m15389a() {
        this.f15626f = new C2972e();
        this.f15624d.requestNetwork(new Builder().addTransportType(1).build(), this.f15626f);
        m15390a(((Long) C0955b.hk.m28964b()).longValue());
    }

    final void m15390a(long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        this.f15625e.set(2, elapsedRealtime, m15386b("com.google.android.finsky.UNMETERED_NETWORK_TIMEOUT"));
    }

    final void m15393b() {
        if (this.f15626f != null) {
            this.f15624d.unregisterNetworkCallback(this.f15626f);
            this.f15626f = null;
        }
    }

    private final PendingIntent m15386b(String str) {
        return PendingIntent.getBroadcast(this.f15622b, 0, new Intent(str).setPackage(this.f15622b.getPackageName()), 268435456);
    }

    final void m15394c() {
        if (this.f15628h) {
            if (!this.f15627g) {
                this.f15623c.mo3789a("com.google.android.finsky.wear.WIFI_NEEDED", this.f15622b.getString(C7582R.string.wearsky_updates_needed_over_wifi), this.f15622b.getString(C7582R.string.connect_to_wifi), m15387d(), "status", new cd(C7582R.drawable.ic_wear_signal_wifi_4_bar_white_24dp, this.f15622b.getResources().getString(C7582R.string.use_wifi_action), PendingIntent.getBroadcast(this.f15622b, 0, new Intent("com.google.android.finsky.wear.WIFI_NOTIFICATION_CLICKED").setPackage(this.f15622b.getPackageName()), 268435456)));
                this.f15627g = true;
            }
        } else if (!this.f15627g || this.f15629i.size() <= 2) {
            FinskyLog.m21659a("Posting WiFi needed notification", new Object[0]);
            this.f15623c.mo3790a("com.google.android.finsky.wear.WIFI_NEEDED", this.f15622b.getResources().getQuantityString(C7582R.plurals.installs_paused, this.f15629i.size()), this.f15622b.getString(C7582R.string.connect_to_wifi), new Intent("com.google.android.finsky.wear.WIFI_NOTIFICATION_CLICKED").setPackage(this.f15622b.getPackageName()), m15387d(), "status");
            this.f15627g = true;
        }
    }

    private final PendingIntent m15387d() {
        return PendingIntent.getBroadcast(this.f15622b, 0, new Intent("com.google.android.finsky.wear.NOTIFICATION_DISMISSED").setPackage(this.f15622b.getPackageName()), 268435456);
    }

    private final void m15388e() {
        FinskyLog.m21659a("hideWifiNeededNotification", new Object[0]);
        if (this.f15627g) {
            this.f15623c.mo3782a("com.google.android.finsky.wear.WIFI_NEEDED");
            this.f15627g = false;
        }
    }

    public final void mo1205a(C3369m c3369m) {
        if (this.f15629i.contains(c3369m.m16819a())) {
            String a = c3369m.m16819a();
            int i = c3369m.f17273c.f17153d;
            FinskyLog.m21659a(new StringBuilder(String.valueOf(a).length() + 67).append("Install package event: ").append(a).append(", event= ").append(i).append(", statusCode=").append(c3369m.m16820b()).toString(), new Object[0]);
            switch (c3369m.f17273c.f17153d) {
                case 1:
                    if (this.f15626f != null) {
                        m15390a(((Long) C0955b.hl.m28964b()).longValue());
                    }
                    FinskyLog.m21659a("Making download progress so hiding WiFi needed notification", new Object[0]);
                    m15388e();
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    this.f15629i.remove(c3369m.m16819a());
                    if (this.f15629i.isEmpty()) {
                        FinskyLog.m21659a("No packages left to download", new Object[0]);
                        C1473m.f7980a.bw().mo3484b((C1003o) this);
                        this.f15622b.unregisterReceiver(this.f15630j);
                        this.f15625e.cancel(m15386b("com.google.android.finsky.UNMETERED_NETWORK_TIMEOUT"));
                        m15393b();
                        m15388e();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
