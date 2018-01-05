package com.google.android.finsky.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.finsky.utils.FinskyLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class C4034h {
    public final Context f20296a;
    public final C4042t f20297b;
    public final Map f20298c = new HashMap();
    public BroadcastReceiver f20299d;

    public C4034h(Context context, C4042t c4042t) {
        this.f20296a = context;
        this.f20297b = c4042t;
    }

    final synchronized void m18922a(C4033g c4033g, C4020j c4020j) {
        new Object[1][0] = c4033g;
        List list = (List) this.f20298c.get(c4033g);
        if (list == null) {
            list = new ArrayList();
            this.f20298c.put(c4033g, list);
        }
        list.add(c4020j);
        m18918b();
    }

    final synchronized void m18921a(C4033g c4033g) {
        new Object[1][0] = c4033g;
        this.f20298c.remove(c4033g);
        m18919c();
    }

    private final synchronized void m18918b() {
        if (this.f20299d == null && !this.f20298c.isEmpty()) {
            this.f20299d = new C4035i(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            intentFilter.addAction("android.intent.action.DREAMING_STARTED");
            intentFilter.addAction("android.intent.action.DREAMING_STOPPED");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            this.f20296a.registerReceiver(this.f20299d, intentFilter);
            FinskyLog.m21662b("Registered receiver for state updates", new Object[0]);
        }
    }

    private final synchronized void m18919c() {
        if (this.f20299d != null && this.f20298c.isEmpty()) {
            this.f20296a.unregisterReceiver(this.f20299d);
            FinskyLog.m21662b("Unregistered receiver for state updates", new Object[0]);
            this.f20299d = null;
        }
    }

    final synchronized void m18920a() {
        Object obj;
        C4033g a = this.f20297b.m18945a();
        List arrayList = new ArrayList();
        for (Entry entry : new HashMap(this.f20298c).entrySet()) {
            C4033g c4033g = (C4033g) entry.getKey();
            if (c4033g.f20295d != a.f20295d) {
                obj = 1;
            } else if (c4033g.f20294c != a.f20294c) {
                r2 = 1;
            } else if (c4033g.f20293b != a.f20293b) {
                r2 = 1;
            } else {
                obj = null;
            }
            if (obj != null) {
                arrayList.add((C4033g) entry.getKey());
                for (C4020j c4020j : (List) entry.getValue()) {
                    entry.getKey();
                    c4020j.mo3887a(a);
                }
            }
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            obj = arrayList2.get(i);
            i++;
            this.f20298c.remove((C4033g) obj);
        }
        m18919c();
    }
}
