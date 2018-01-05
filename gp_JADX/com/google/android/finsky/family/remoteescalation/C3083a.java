package com.google.android.finsky.family.remoteescalation;

import android.app.Dialog;
import android.os.Bundle;
import com.google.android.finsky.at.C1128e;

public final class C3083a extends C1128e {
    public String af;

    public final Dialog mo143a(Bundle bundle) {
        Dialog a = super.mo143a(bundle);
        if (this.af != null) {
            ((BulkApproveProgressView) this.al).setText(this.af);
            this.af = null;
        }
        return a;
    }
}
