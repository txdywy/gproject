package com.google.android.finsky.billing.promptforfop;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.google.android.finsky.setup.cs;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public final class C2077h extends C2073b {
    public SetupWizardParams at;

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.at = (SetupWizardParams) this.f760q.getParcelable("setup_wizard_params");
    }

    protected final int ah() {
        return C7582R.layout.setup_wizard_prompt_for_fop_fragment;
    }

    protected final void mo2630b(View view) {
        if (view instanceof Button) {
            ((Button) view).setText(m592c((int) C7582R.string.continue_text));
            return;
        }
        FinskyLog.m21669e("Unexpected continue button type: %s", view.getClass().getSimpleName());
    }

    protected final int ai() {
        return C7582R.string.setup_wizard_setup_account_primer;
    }

    protected final int aj() {
        return C7582R.layout.setup_wizard_fop_entry;
    }

    protected final int af() {
        return 893;
    }

    protected final int ag() {
        if (cs.m19402a()) {
            return 2;
        }
        return 1;
    }

    protected final boolean ak() {
        return !cs.m19403a(m603h());
    }

    protected final SetupWizardParams ab() {
        return this.at;
    }

    protected final int ad() {
        return 3;
    }
}
