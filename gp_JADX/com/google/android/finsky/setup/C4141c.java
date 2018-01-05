package com.google.android.finsky.setup;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.cg;
import android.support.v4.p028a.C0216d;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.utils.C4672c;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.p102c.C0921c;
import com.google.android.p102c.C0923e;
import com.squareup.leakcanary.C7582R;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.Timer;

public final class C4141c {
    public static final Uri f20901a = C0921c.m5643a(C0923e.f5694b, "market_client_id");
    public static final Uri f20902b = Uri.parse("content://telephony/siminfo");
    public static final HashMap f20903c = new HashMap();
    public final Context f20904d;
    public final TelephonyManager f20905e = ((TelephonyManager) this.f20904d.getSystemService("phone"));
    public final Resources f20906f = this.f20904d.getResources();
    public final NotificationManager f20907g = ((NotificationManager) this.f20904d.getSystemService("notification"));
    public final Handler f20908h = new Handler(Looper.getMainLooper());
    public final Timer f20909i = new Timer();

    public C4141c(Context context) {
        this.f20904d = context;
    }

    @SuppressLint({"HardwareIds"})
    final boolean m19383a() {
        if (5 != this.f20905e.getSimState()) {
            FinskyLog.m21659a("No SIM card is available in the device", new Object[0]);
            int i = 0;
        } else {
            boolean z = true;
        }
        if (i == 0) {
            return false;
        }
        try {
            String subscriberId = this.f20905e.getSubscriberId();
            if (C4141c.m19379c().isEmpty()) {
                C4141c.m19377a(subscriberId);
                FinskyLog.m21659a("Initial SIM does not receive notification.", new Object[0]);
                return true;
            } else if (C4141c.m19379c().contains(subscriberId)) {
                FinskyLog.m21659a("Notification has already been shown to this SIM card", new Object[0]);
                return true;
            } else {
                Object d = C4141c.m19380d();
                CharSequence simOperatorName = this.f20905e.getSimOperatorName();
                if (TextUtils.isEmpty(simOperatorName)) {
                    FinskyLog.m21659a("Network operator name failed to resolve.", new Object[0]);
                } else {
                    FinskyLog.m21659a("Network Operator: %s", simOperatorName);
                }
                if (TextUtils.isEmpty(d) || TextUtils.isEmpty(simOperatorName)) {
                    return false;
                }
                if (C4672c.m21804a(C4680k.m21818a((String) C0955b.jC.m28964b()), (Object) subscriberId)) {
                    z = true;
                } else {
                    FinskyLog.m21659a("Carrier is not whitelisted", new Object[0]);
                    i = 0;
                }
                if (i == 0) {
                    return true;
                }
                PendingIntent activity = PendingIntent.getActivity(this.f20904d, 0, new Intent("android.intent.action.VIEW", Uri.parse(d)), 134217728);
                int b = C1608h.m9251b(3);
                cg cgVar = new cg(this.f20904d);
                cgVar.f1484B = C0216d.m1116c(this.f20904d, b);
                cgVar.f1519w = true;
                cgVar.f1522z = "sys";
                cg b2 = cgVar.m1415a((int) C7582R.drawable.ic_play_store).m1422a(this.f20906f.getString(C7582R.string.carrier_notification_title, new Object[]{simOperatorName})).m1425b(this.f20906f.getString(C7582R.string.carrier_notification_text, new Object[]{simOperatorName}));
                b2.m1424a(2, true);
                b2 = b2.m1423a(true);
                b2.f1501e = activity;
                Notification a = b2.m1414a();
                C4141c.m19377a(subscriberId);
                this.f20907g.notify(65023, a);
                return true;
            }
        } catch (SecurityException e) {
            return false;
        }
    }

    private static Set m19379c() {
        return (Set) C0954a.bD.m5760a();
    }

    private static void m19377a(String str) {
        Object c = C4141c.m19379c();
        c.add(str);
        C0954a.bD.m5763a(c);
    }

    private static String m19380d() {
        try {
            String format = String.format("https://play.google.com/store/apps/collection/partnerchannel_%s", new Object[]{C0955b.jy.m28964b()});
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(format).openConnection();
            httpURLConnection.setRequestMethod("HEAD");
            httpURLConnection.connect();
            FinskyLog.m21659a("Partner channel query returned status-Code: %d {URL:%s}", Integer.valueOf(httpURLConnection.getResponseCode()), r3);
            if (httpURLConnection.getResponseCode() == 200) {
                return format;
            }
            FinskyLog.m21659a("URL failed to resolve.", new Object[0]);
            return null;
        } catch (IOException e) {
            FinskyLog.m21659a("HTTP URL Connection failed: %s", e);
            return null;
        }
    }

    public final synchronized void m19384b() {
        ArrayList arrayList = new ArrayList(f20903c.keySet());
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            m19381a((Uri) obj);
        }
    }

    final synchronized void m19381a(Uri uri) {
        ContentObserver contentObserver = (ContentObserver) f20903c.get(uri);
        if (contentObserver != null) {
            this.f20904d.getContentResolver().unregisterContentObserver(contentObserver);
            f20903c.remove(uri);
            FinskyLog.m21659a("Unregistered content observer {URI=%s}", uri);
        }
    }

    private final synchronized void m19378b(Uri uri) {
        this.f20909i.schedule(new C4170d(this, uri), 180000);
    }

    public final synchronized void m19382a(Uri... uriArr) {
        for (Uri uri : uriArr) {
            if (!f20903c.containsKey(uri)) {
                ContentObserver c4173f = new C4173f(this.f20908h, this.f20904d);
                this.f20904d.getContentResolver().registerContentObserver(uri, true, c4173f);
                f20903c.put(uri, c4173f);
                m19378b(uri);
            }
        }
    }
}
