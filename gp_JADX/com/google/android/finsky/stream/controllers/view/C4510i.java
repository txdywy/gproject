package com.google.android.finsky.stream.controllers.view;

final class C4510i implements Runnable {
    public final /* synthetic */ JpkrFlatMiniTopChartsClusterView f23114a;

    C4510i(JpkrFlatMiniTopChartsClusterView jpkrFlatMiniTopChartsClusterView) {
        this.f23114a = jpkrFlatMiniTopChartsClusterView;
    }

    public final void run() {
        JpkrFlatMiniTopChartsClusterView jpkrFlatMiniTopChartsClusterView = this.f23114a;
        jpkrFlatMiniTopChartsClusterView.f22926y.mo4147a();
        jpkrFlatMiniTopChartsClusterView.f22927z.animate().alpha(0.0f).setListener(new C4511j(jpkrFlatMiniTopChartsClusterView));
    }
}
