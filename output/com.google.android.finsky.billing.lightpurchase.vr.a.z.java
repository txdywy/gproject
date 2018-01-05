package com.google.android.finsky.billing.lightpurchase.vr.a;

import android.os.Handler;
import android.os.RemoteException;
import com.google.android.finsky.billing.lightpurchase.vr.VrPurchaseActivity;
import com.google.vr.a.a.m;
import com.google.vr.b.a.a.e;
import com.google.vr.b.a.c;
import java.util.HashMap;
import java.util.Map;

public final class com.google.android.finsky.billing.lightpurchase.vr.a.z implements Runnable
{

    public final com.google.android.finsky.billing.lightpurchase.vr.a.w a;

    z(com.google.android.finsky.billing.lightpurchase.vr.a.w p0) {
        this.a = p0;
    }

    public final void run() {
        v4 = new HashMap();
        v4.put("context", this.a.c.getApplicationContext());
        v4.put("pathPrefix", "lullaby/");
        try {
            this.a.e.b.a("finsky", com.google.vr.a.a.m.a(v4));
        }
        catch (RemoteException ex) {
            throw new RuntimeException(ex);
        }
        try {
            this.a.e.b.b("finsky:textures/texture_atlas.bin");
        }
        catch (RemoteException ex) {
            throw new RuntimeException(ex);
        }
        com.google.android.finsky.billing.lightpurchase.vr.a.w.a.post(new com.google.android.finsky.billing.lightpurchase.vr.a.aa(this));
    }

}
