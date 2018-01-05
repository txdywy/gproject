package com.google.android.finsky.billing.promptforfop;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.google.android.finsky.frameworkviews.SeparatorLinearLayout;
import com.squareup.leakcanary.C7582R;

public class SetupWizardFopSeparator extends SeparatorLinearLayout {
    public SetupWizardFopSeparator(Context context) {
        this(context, null);
    }

    public SetupWizardFopSeparator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final int mo2621a(Resources resources) {
        return resources.getColor(C7582R.color.setup_wizard_divider_color);
    }
}
