package com.google.android.finsky.activities;

import android.support.v4.app.Fragment;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

final /* synthetic */ class dy implements C0978f {
    public final dx f6687a;

    dy(dx dxVar) {
        this.f6687a = dxVar;
    }

    public final void mo1172a(C4809e c4809e) {
        Fragment fragment = this.f6687a;
        if (!c4809e.isCancelled() && fragment.m612l() && !fragment.m603h().isFinishing()) {
            try {
                List list = (List) c4809e.get();
                if (list != null && list.size() == 1) {
                    if (C3369m.f17271a.contains(Integer.valueOf(((C3369m) list.get(0)).f17273c.f17153d))) {
                        fragment.m603h().setResult(-1);
                        fragment.m603h().startActivity(fragment.x_());
                        fragment.m603h().finish();
                    }
                }
            } catch (Throwable e) {
                Thread.currentThread().interrupt();
                FinskyLog.m21663b(e, "Failed to go to post purchase dialog", new Object[0]);
            } catch (Throwable e2) {
                FinskyLog.m21663b(e2, "Failed to go to post purchase dialog", new Object[0]);
            }
        }
    }
}
