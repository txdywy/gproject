package com.google.android.finsky.dc.p181a;

import android.os.AsyncTask;
import android.os.Environment;
import android.support.v4.os.C0327a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.dd.C2567a;
import com.google.android.finsky.download.C2839b;
import com.google.android.finsky.download.C2841d;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ab;

final class C2540c extends AsyncTask {
    public final /* synthetic */ C2538b f13612a;

    C2540c(C2538b c2538b) {
        this.f13612a = c2538b;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            C2839b a = C2841d.m15020a(this.f13612a.f13594a, this.f13612a.mo2938b(), !C0327a.m1721a());
            this.f13612a.f13609p = a;
            this.f13612a.f13595b.mo3176a(this.f13612a);
            this.f13612a.f13595b.mo3173a(a);
            this.f13612a.m13501a(100);
            if (!((Boolean) C0955b.jB.m28964b()).booleanValue() && this.f13612a.f13596c.mo2294a(12637767)) {
                try {
                    C2567a.f13682b.m5763a(Long.valueOf(C4678i.m21812a()));
                    C2567a.f13684d.m5763a(Integer.valueOf(this.f13612a.f13602i));
                    C2567a.f13685e.m5763a(Integer.valueOf(this.f13612a.f13603j));
                    C2567a.f13686f.m5763a(ab.m21685a(this.f13612a.f13601h));
                    return;
                } catch (Throwable e) {
                    FinskyLog.m21660a(e, "Could not record self update recovery data.", new Object[0]);
                    C2567a.m13570a();
                    return;
                }
            }
            return;
        }
        this.f13612a.m13509c();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        boolean a;
        C2538b c2538b = this.f13612a;
        if (c2538b.f13596c.mo2294a(12604524)) {
            a = c2538b.f13607n.m16694a(c2538b.f13605l, Environment.getDataDirectory());
        } else {
            a = true;
        }
        if (a) {
            return Boolean.valueOf(this.f13612a.mo2937a());
        }
        this.f13612a.m13503a(112, null, 908, null);
        FinskyLog.m21659a("Self-update v2 ignore download due to lack of free space", new Object[0]);
        return null;
    }
}
