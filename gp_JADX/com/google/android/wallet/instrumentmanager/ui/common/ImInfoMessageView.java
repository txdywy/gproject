package com.google.android.wallet.instrumentmanager.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.wallet.analytics.C6494b;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.common.p377b.p379b.C6567a;
import com.google.android.wallet.ui.common.InfoMessageView;

public class ImInfoMessageView extends InfoMessageView implements C6494b {
    public ImInfoMessageView(Context context) {
        super(context, null);
        setAnalyticsClickListener(this);
    }

    public ImInfoMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setAnalyticsClickListener(this);
    }

    public ImInfoMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setAnalyticsClickListener(this);
    }

    public final void mo5561a(C6504m c6504m, int i) {
        C6567a.m29805a(c6504m, -1, i);
    }

    public final void mo5560a(C6504m c6504m) {
        C6567a.m29805a(c6504m, 1636, 1622);
    }
}
