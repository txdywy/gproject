package com.google.android.libraries.social.licenses;

import android.widget.ScrollView;
import android.widget.TextView;

final class C6183b implements Runnable {
    public final /* synthetic */ int f30717a;
    public final /* synthetic */ ScrollView f30718b;
    public final /* synthetic */ LicenseActivity f30719c;

    C6183b(LicenseActivity licenseActivity, int i, ScrollView scrollView) {
        this.f30719c = licenseActivity;
        this.f30717a = i;
        this.f30718b = scrollView;
    }

    public final void run() {
        TextView textView = (TextView) this.f30719c.findViewById(C6188h.license_activity_textview);
        this.f30718b.scrollTo(0, textView.getLayout().getLineTop(textView.getLayout().getLineForOffset(this.f30717a)));
    }
}
