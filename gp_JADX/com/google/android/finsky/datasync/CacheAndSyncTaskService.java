package com.google.android.finsky.datasync;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.ai.C1189b;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.gcm.C0946b;
import com.google.android.gms.gcm.C5195a;
import com.google.android.gms.gcm.C5205l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CacheAndSyncTaskService extends C0946b {
    public static final String[] f13467a = new String[]{"FETCH_TOC", "REFRESH_USER_SETTINGS", "SYNC_DFE", "SYNC_IMAGES", "SYNC_SUCCESS"};
    public long f13468b;
    public List f13469c = new ArrayList();
    public List f13470d = new ArrayList();
    public C0986a f13471e;
    public C2531s f13472f;
    public C2504r f13473g;

    public void onCreate() {
        ((C1374t) C3947d.m18649a(C1374t.class)).mo1799a(this);
        super.onCreate();
        this.f13468b = ((Long) C0955b.hh.m28964b()).longValue() + C4678i.m21812a();
        Object obj = (Set) C1189b.f7266b.m5760a();
        Iterator it = obj.iterator();
        Object obj2 = null;
        while (it.hasNext()) {
            String str = (String) it.next();
            Account b = this.f13471e.mo1183b(str);
            if (b == null || !this.f13472f.m13483a(b.name)) {
                this.f13470d.add(str);
                it.remove();
                obj2 = 1;
            } else {
                this.f13469c.add(str);
            }
        }
        if (this.f13469c.isEmpty()) {
            this.f13472f.m13479a((Context) this);
            m13405a();
        } else if (obj2 != null) {
            C1189b.f7266b.m5763a(obj);
        }
    }

    public final int mo1162a(C5205l c5205l) {
        Object obj = (Set) C1189b.f7267c.m5760a();
        for (Object obj2 : f13467a) {
            if (obj.contains(obj2)) {
                if (TextUtils.equals(obj2, "SYNC_DFE") && C2531s.m13477b()) {
                    this.f13472f.m13479a((Context) this);
                    m13405a();
                    FinskyLog.m21662b("[Cache and Sync] Maximum number(%s) of DFE fetch suggestions have been processed.", C0955b.hg.m28964b());
                    return 2;
                }
                C2502q a = this.f13473g.mo2922a(this, obj2, this.f13469c, this.f13470d, this.f13468b);
                if (a == null) {
                    return 2;
                }
                if (a.mo2924a() && !a.mo2925b()) {
                    a.mo2926c();
                }
                if (a.mo2925b()) {
                    obj.remove(obj2);
                    FinskyLog.m21659a("[Cache and Sync] %s task completed.", obj2);
                }
            }
        }
        C1189b.f7267c.m5763a(obj);
        if (obj.isEmpty()) {
            m13405a();
        }
        return 0;
    }

    private final void m13405a() {
        C1189b.f7286v.m5765c();
        C5195a a = C5195a.m23967a((Context) this);
        Parcelable componentName = new ComponentName(a.f26228b, getClass());
        if (a.m23975b(componentName.getClassName())) {
            Intent a2 = a.m23971a();
            if (a2 != null) {
                a2.putExtra("scheduler_action", "CANCEL_ALL");
                a2.putExtra("component", componentName);
                a.f26228b.sendBroadcast(a2);
            }
        }
        stopSelf();
    }
}
