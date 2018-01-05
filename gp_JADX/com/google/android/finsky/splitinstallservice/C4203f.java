package com.google.android.finsky.splitinstallservice;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.os.C0327a;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.p108z.C1207b;
import com.google.android.finsky.splitinstallservice.p245a.C4196a;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public final class C4203f implements C1003o {
    public final ar f21230a;
    public final C4197a f21231b;
    public final C3340g f21232c;
    public final Context f21233d;
    public boolean f21234e = false;

    public C4203f(ar arVar, C4197a c4197a, C3340g c3340g, Context context) {
        this.f21230a = arVar;
        this.f21231b = c4197a;
        this.f21232c = c3340g;
        this.f21233d = context;
    }

    public final void m19583a() {
        bb.m21791a();
        FinskyLog.m21659a("Connecting InstallListener to SplitInstallService broadcaster...", new Object[0]);
        if (!this.f21234e) {
            this.f21232c.mo3481a((C1003o) this);
            this.f21234e = true;
        }
    }

    public final void mo1205a(C3369m c3369m) {
        this.f21230a.m19564b(c3369m.m16819a()).mo4398a(new C4204g(this, c3369m));
    }

    static void m19579a(Context context, C4196a c4196a) {
        C4203f.m19580a(context, c4196a.f21138c, C4203f.m19578a(c4196a));
    }

    static boolean m19581a(C3369m c3369m, C4196a c4196a) {
        return c3369m.f17274d.f17171a.f17147q.equals("SplitInstallService") && C4203f.m19577a(c3369m.f17273c.f17153d) != 0 && c4196a.f21138c.equals(c3369m.m16819a()) && c4196a.f21139d == c3369m.f17274d.f17171a.f17134d && c4196a.f21140e == c3369m.f17274d.f17171a.f17140j.f12314f && Arrays.deepEquals(c4196a.f21141f, c3369m.f17274d.m16703b());
    }

    static void m19580a(Context context, String str, Bundle bundle) {
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setAction("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService");
        intent.putExtra("session_state", bundle);
        intent.addFlags(MemoryMappedFileBuffer.DEFAULT_SIZE);
        context.sendBroadcast(intent);
    }

    static Bundle m19578a(C4196a c4196a) {
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", c4196a.f21137b);
        bundle.putInt("status", c4196a.f21142g);
        bundle.putInt("error_code", c4196a.f21143h);
        bundle.putStringArrayList("module_names", new ArrayList(Arrays.asList(c4196a.f21141f)));
        bundle.putLong("total_bytes_to_download", c4196a.f21145j);
        bundle.putLong("bytes_downloaded", c4196a.f21144i);
        return bundle;
    }

    static int m19577a(int i) {
        switch (i) {
            case 0:
            case 11:
                return 1;
            case 1:
                return 2;
            case 2:
                return 7;
            case 3:
            case 5:
                return 6;
            case 4:
                return 4;
            case 6:
                if (!C4671b.m21787d() || C0327a.m1721a()) {
                    return 5;
                }
                return 3;
            default:
                return 0;
        }
    }

    final C4196a m19582a(String str, int i, C1207b c1207b) {
        try {
            C4196a c4196a = (C4196a) c1207b.mo1528a((C4196a) this.f21230a.m19563a(str, i).get(100, TimeUnit.MILLISECONDS));
            if (c4196a == null) {
                return c4196a;
            }
            this.f21230a.m19561a(c4196a).get(100, TimeUnit.MILLISECONDS);
            return c4196a;
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Error updating session.", new Object[0]);
            return null;
        }
    }
}
