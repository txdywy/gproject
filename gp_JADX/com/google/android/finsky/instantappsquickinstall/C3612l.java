package com.google.android.finsky.instantappsquickinstall;

import android.os.AsyncTask;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3371p;

final class C3612l extends AsyncTask {
    public final C3611j f17954a;
    public final C3340g f17955b;
    public final QuickInstallState f17956c;

    C3612l(C3611j c3611j, C3340g c3340g, QuickInstallState quickInstallState) {
        this.f17954a = c3611j;
        this.f17955b = c3340g;
        this.f17956c = quickInstallState;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        C3371p c3371p = (C3371p) obj;
        if (!isCancelled()) {
            C3611j c3611j = this.f17954a;
            c3611j.f17948e = c3371p;
            if (c3611j.f17947d != null) {
                c3611j.f17947d.m17219a(c3611j.f17948e);
            }
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f17955b.mo3485c(this.f17956c.f17928b.f17930a);
    }
}
