package com.google.android.finsky.billing.promptforfop;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.Button;
import com.google.android.finsky.setup.cs;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;
import com.google.android.finsky.utils.FinskyLog;

protected final class com.google.android.finsky.billing.promptforfop.h extends com.google.android.finsky.billing.promptforfop.b
{

    public SetupWizardParams at;

    h() {
        com.google.android.finsky.billing.promptforfop.b();
    }

    protected final SetupWizardParams ab() {
        return this.at;
    }

    protected final int ad() {
        return 3;
    }

    protected final int af() {
        return 893;
    }

    protected final int ag() {
        if (com.google.android.finsky.setup.cs.a())
            v0 = 2;
        else
            v0 = 1;
        return v0;
    }

    protected final int ah() {
        return 2130969389;
    }

    protected final int ai() {
        return 2131953171;
    }

    protected final int aj() {
        return 2130969381;
    }

    protected final boolean ak() {
        if (!com.google.android.finsky.setup.cs.a(this.h()))
            v0 = 1;
        else
            v0 = 0;
        return v0;
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.at = (SetupWizardParams)this.q.getParcelable("setup_wizard_params");
    }

    protected final void b(View p0) {
        if (p0 instanceof Button)
            ((Button)p0).setText(this.c(2131951948));
        else {
            v1 = new Object[1];
            v1[0] = p0.getClass().getSimpleName();
            FinskyLog.e("Unexpected continue button type: %s", v1);
        }
    }

}
