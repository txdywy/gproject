package com.google.android.finsky.playcard;

import com.google.android.finsky.actionbuttons.C1006c;
import com.google.android.finsky.detailscomponents.C2586l;
import com.google.android.finsky.detailscomponents.C2596w;
import com.google.android.finsky.detailscomponents.DetailsSummaryExtraLabelsSection;
import com.google.android.finsky.detailscomponents.ScreenshotsRecyclerView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;
import java.text.NumberFormat;

final class au extends C3901z {
    public final /* synthetic */ ao f19613a;

    au(ao aoVar) {
        this.f19613a = aoVar;
    }

    public final /* synthetic */ void mo3861a(d dVar, Document document, C3748a c3748a, C2495w c2495w) {
        FlatCardAppsMdpView flatCardAppsMdpView = (FlatCardAppsMdpView) dVar;
        super.mo3861a(flatCardAppsMdpView, document, c3748a, c2495w);
        this.f19613a.f19604s.m13624a(document, flatCardAppsMdpView.getContentRatingPanel());
        C1006c a = this.f19613a.f19594i.m5977a(c3748a.mo3709k(), c3748a.mo3711m(), c3748a, flatCardAppsMdpView.getContext(), null, (ad) flatCardAppsMdpView.getLoggingData(), 4, null, -1, null, false, false, true);
        a.m5959a(document, null, c3748a.mo3710l(), flatCardAppsMdpView.getDetailsDynamicSection());
        flatCardAppsMdpView.setActionButtonHelper(a);
        if (!document.m14620I() || document.m14622K() <= 0) {
            flatCardAppsMdpView.h_(8);
        } else {
            flatCardAppsMdpView.h_(0);
            long K = document.m14622K();
            flatCardAppsMdpView.f19356d.setText(NumberFormat.getIntegerInstance().format(K));
            flatCardAppsMdpView.f19356d.setContentDescription(flatCardAppsMdpView.getContext().getResources().getQuantityString(C7582R.plurals.content_description_review_histogram_review_count, (int) K, new Object[]{Long.valueOf(K)}));
        }
        if (document.bz()) {
            flatCardAppsMdpView.setDownloadsCountVisbility(0);
            flatCardAppsMdpView.f19357e.setText(document.by().f13201b);
            flatCardAppsMdpView.f19357e.setContentDescription(flatCardAppsMdpView.getContext().getString(C7582R.string.download_count, new Object[]{r2}));
        } else {
            flatCardAppsMdpView.setDownloadsCountVisbility(8);
        }
        DetailsSummaryExtraLabelsSection extraLabelsContainer = flatCardAppsMdpView.getExtraLabelsContainer();
        if (extraLabelsContainer != null) {
            this.f19613a.f19603r.m13630a(extraLabelsContainer, document, false);
        }
        ScreenshotsRecyclerView screenshotsContainer = flatCardAppsMdpView.getScreenshotsContainer();
        if (screenshotsContainer == null) {
            return;
        }
        if (document.ak() && document.bA()) {
            screenshotsContainer.setVisibility(0);
            screenshotsContainer.m13618a(C2596w.m13652a(document, 0), new av(c3748a, document, C2586l.m13643b(document)), (ad) flatCardAppsMdpView.getLoggingData());
            return;
        }
        screenshotsContainer.setVisibility(8);
    }
}
