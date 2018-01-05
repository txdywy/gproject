package com.google.android.finsky.billing.payments;

import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;
import com.squareup.leakcanary.C7582R;

public final class C2043f {
    public static int m10743a(SetupWizardParams setupWizardParams) {
        if (setupWizardParams == null) {
            return C7582R.style.Theme.InstrumentManager.BuyFlow;
        }
        if (setupWizardParams.f21126c) {
            return C7582R.style.Theme.InstrumentManager.SetupWizard.Light;
        }
        return C7582R.style.Theme.InstrumentManager.SetupWizard;
    }

    public static int m10742a(int i) {
        switch (i) {
            case 1:
                return C7582R.style.Theme.InstrumentManager.BuyFlow.Ocean;
            case 2:
                return C7582R.style.Theme.InstrumentManager.BuyFlow.Music;
            case 3:
                if (C1608h.f8520b) {
                    return C7582R.style.Theme.InstrumentManager.BuyFlow.Enterprise;
                }
                return C7582R.style.Theme.InstrumentManager.BuyFlow.Apps;
            case 4:
                return C7582R.style.Theme.InstrumentManager.BuyFlow.YouTube;
            case 6:
                return C7582R.style.Theme.InstrumentManager.BuyFlow.Magazines;
            default:
                if (C1608h.f8520b) {
                    return C7582R.style.Theme.InstrumentManager.BuyFlow.Enterprise;
                }
                return C7582R.style.Theme.InstrumentManager.BuyFlow.Multi;
        }
    }
}
