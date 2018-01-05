package com.google.android.finsky.setup;

final class ce implements Runnable {
    public final /* synthetic */ SetupWizardFinalHoldActivity f20916a;

    ce(SetupWizardFinalHoldActivity setupWizardFinalHoldActivity) {
        this.f20916a = setupWizardFinalHoldActivity;
    }

    public final void run() {
        this.f20916a.m19115b();
        if (!this.f20916a.m19114a()) {
            this.f20916a.m19112a(-1);
        }
    }
}
