package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.am;

class hh extends BroadcastReceiver {
    public final hv f26859a;
    public boolean f26860b;
    public boolean f26861c;

    static {
        hh.class.getName();
    }

    hh(hv hvVar) {
        am.m23733a((Object) hvVar);
        this.f26859a = hvVar;
    }

    public void onReceive(Context context, Intent intent) {
        this.f26859a.m24758a();
        String action = intent.getAction();
        this.f26859a.m24761d().f26851j.m24653a("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean t = this.f26859a.m24766i().m24675t();
            if (this.f26861c != t) {
                this.f26861c = t;
                this.f26859a.m24762e().m24733a(new hi(this));
                return;
            }
            return;
        }
        this.f26859a.m24761d().f26847f.m24653a("NetworkBroadcastReceiver received unknown action", action);
    }

    public final void m24677a() {
        this.f26859a.m24758a();
        this.f26859a.m24762e().mo4728b();
        this.f26859a.m24762e().mo4728b();
        if (this.f26860b) {
            this.f26859a.m24761d().f26851j.m24652a("Unregistering connectivity change receiver");
            this.f26860b = false;
            this.f26861c = false;
            try {
                this.f26859a.f26927b.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                this.f26859a.m24761d().f26845d.m24653a("Failed to unregister the network broadcast receiver", e);
            }
        }
    }
}
