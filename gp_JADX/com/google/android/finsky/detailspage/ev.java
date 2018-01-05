package com.google.android.finsky.detailspage;

import com.google.android.finsky.ratereview.C2642m;
import com.google.android.finsky.utils.FinskyLog;

final class ev implements C2642m {
    public final /* synthetic */ eo f14537a;

    ev(eo eoVar) {
        this.f14537a = eoVar;
    }

    public final void mo3085b(int i) {
        ex exVar = (ex) this.f14537a.b;
        exVar.f14556n--;
        ((ex) this.f14537a.b).f14546d = null;
        this.f14537a.m14278j();
        this.f14537a.m14264a(true);
        if (((ex) this.f14537a.b).f14545c != null) {
            this.f14537a.w.mo1630b(((ex) this.f14537a.b).f14545c.f14885a.f12119z);
            this.f14537a.m14263a(((ex) this.f14537a.b).f14545c.f14885a.f12119z, false);
            return;
        }
        FinskyLog.m21669e("detailsDoc was null after deleting a review. This should not happen!", new Object[0]);
    }

    public final void mo3088k() {
        ex exVar = (ex) this.f14537a.b;
        exVar.f14556n--;
        this.f14537a.m14264a(false);
    }
}
