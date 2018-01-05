package com.google.android.finsky.billing.promptforfop;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.finsky.frameworkviews.SeparatorLinearLayout;

public final class SetupWizardFopSeparator extends SeparatorLinearLayout
{

    SetupWizardFopSeparator(Context p0) {
        SetupWizardFopSeparator(p0, 0);
    }

    SetupWizardFopSeparator(Context p0, AttributeSet p1) {
        SeparatorLinearLayout(p0, p1);
    }

    public final int a(Resources p0) {
        return p0.getColor(2131558815);
    }

}
