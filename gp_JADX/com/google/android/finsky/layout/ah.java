package com.google.android.finsky.layout;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;

final class ah implements OnClickListener {
    public final /* synthetic */ ExtrasItemSnippet f18484a;

    ah(ExtrasItemSnippet extrasItemSnippet) {
        this.f18484a = extrasItemSnippet;
    }

    public final void onClick(View view) {
        ExtrasItemSnippet extrasItemSnippet = this.f18484a;
        extrasItemSnippet.m17304a(extrasItemSnippet.m17306b() ? 8 : 0);
        extrasItemSnippet = this.f18484a;
        extrasItemSnippet.f18204o.m13379b(new C2475d(extrasItemSnippet.f18203n).m13256a(extrasItemSnippet.m17306b() ? 271 : 272));
    }
}
