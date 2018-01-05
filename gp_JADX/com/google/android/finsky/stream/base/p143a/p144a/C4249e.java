package com.google.android.finsky.stream.base.p143a.p144a;

import android.os.Bundle;

final class C4249e implements Runnable {
    public final /* synthetic */ Bundle f21483a;
    public final /* synthetic */ C4248d f21484b;

    C4249e(C4248d c4248d, Bundle bundle) {
        this.f21484b = c4248d;
        this.f21483a = bundle;
    }

    public final void run() {
        this.f21484b.getLayoutManager().mo728a(this.f21483a.getParcelable("PlayLinksBannerRecyclerBaseView.scrollPosition"));
    }
}
