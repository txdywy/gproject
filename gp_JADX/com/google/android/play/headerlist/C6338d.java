package com.google.android.play.headerlist;

final class C6338d implements Runnable {
    public final /* synthetic */ PlayHeaderListLayout f31895a;

    C6338d(PlayHeaderListLayout playHeaderListLayout) {
        this.f31895a = playHeaderListLayout;
    }

    public final void run() {
        if (this.f31895a.aS != null) {
            this.f31895a.aS.run();
            this.f31895a.aS = null;
        }
        this.f31895a.setBannerText(null);
    }
}
