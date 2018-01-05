package com.google.android.finsky.setup;

import com.google.android.finsky.C1473m;
import com.google.wireless.android.finsky.dfe.nano.ee;
import com.google.wireless.android.finsky.dfe.nano.ef;

final class cz implements dp {
    public final /* synthetic */ VpaSelectionActivity f20968a;

    cz(VpaSelectionActivity vpaSelectionActivity) {
        this.f20968a = vpaSelectionActivity;
    }

    public final void mo3935a(String str, ee[] eeVarArr, ef[] efVarArr) {
        if (this.f20968a.f20678D != null) {
            this.f20968a.f20685p = eeVarArr;
            VpaSelectionActivity vpaSelectionActivity = this.f20968a;
            if (efVarArr == null) {
                efVarArr = new ef[0];
            }
            vpaSelectionActivity.f20686q = efVarArr;
            C1473m.f7980a.mo2029I().m17248a(new da(this, eeVarArr));
        }
    }
}
