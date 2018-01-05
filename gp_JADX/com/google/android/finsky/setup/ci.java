package com.google.android.finsky.setup;

import android.view.View;
import android.view.View.OnClickListener;

final class ci implements OnClickListener {
    public final /* synthetic */ SetupWizardNavBar f20924a;

    ci(SetupWizardNavBar setupWizardNavBar) {
        this.f20924a = setupWizardNavBar;
    }

    public final void onClick(View view) {
        this.f20924a.getActivity().onBackPressed();
    }
}
