package com.google.android.finsky.stream.controllers.view;

import android.view.View;
import android.view.View.OnClickListener;

final class C4509h implements OnClickListener {
    public final /* synthetic */ JpkrFlatMiniTopChartsClusterView f23113a;

    C4509h(JpkrFlatMiniTopChartsClusterView jpkrFlatMiniTopChartsClusterView) {
        this.f23113a = jpkrFlatMiniTopChartsClusterView;
    }

    public final void onClick(View view) {
        JpkrFlatMiniTopChartsClusterView jpkrFlatMiniTopChartsClusterView = this.f23113a;
        jpkrFlatMiniTopChartsClusterView.f22926y.mo4147a();
        jpkrFlatMiniTopChartsClusterView.f22927z.animate().alpha(0.0f).setListener(new C4511j(jpkrFlatMiniTopChartsClusterView));
    }
}
