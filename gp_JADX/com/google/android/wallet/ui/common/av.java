package com.google.android.wallet.ui.common;

import android.app.Activity;
import com.google.android.wallet.analytics.C6504m;

public abstract class av implements C6504m {
    public Activity ac;
    public C6504m ad;

    public C6504m getParentUiNode() {
        if (this.ad != null) {
            return this.ad;
        }
        return (C6504m) this.ac;
    }

    public void setParentUiNode(C6504m c6504m) {
        this.ad = c6504m;
    }
}
