package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.iu;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.C2625e;
import com.google.android.finsky.frameworkviews.C2626m;
import com.google.android.finsky.layout.ReviewItemLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.ratereview.C1068o;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public abstract class C2627n extends C2624w implements C2625e, C2626m {
    public C1068o f13930a;
    public C2495w f13931b;

    public C2627n(Context context) {
        this(context, null);
    }

    protected abstract String getFooterText();

    protected abstract String getSectionTitleText();

    public C2627n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final boolean mo2986a() {
        return this.d != null && this.d.getVisibility() == 0;
    }

    protected final int mo2984a(Resources resources) {
        if (C1473m.f7980a.aN().dj().mo2294a(12636865)) {
            return resources.getInteger(C7582R.integer.sample_reviews_max_rows_v2);
        }
        return resources.getInteger(C7582R.integer.sample_reviews_max_rows);
    }

    protected final int mo2987b(Resources resources) {
        if (C1473m.f7980a.aN().dj().mo2294a(12636865)) {
            return resources.getInteger(C7582R.integer.sample_reviews_per_row_v2);
        }
        return resources.getInteger(C7582R.integer.sample_reviews_per_row);
    }

    public void setReviewFeedbackListener(C1068o c1068o) {
        this.f13930a = c1068o;
    }

    public final void m13739a(List list, Document document, boolean z, boolean z2, C3748a c3748a, ad adVar, C2495w c2495w, String str) {
        this.f13931b = c2495w;
        super.m13733a(list, document, z, c3748a, adVar);
        if (z2) {
            setOnClickListener(new C2659o(this, document, str, c2495w));
        } else {
            this.d.setVisibility(8);
        }
    }

    protected int getBucketRowLayout() {
        return C7582R.layout.review_samples_row;
    }

    protected TextView getFooterView() {
        return (TextView) findViewById(C7582R.id.all_reviews_footer);
    }

    protected View getFooterDividerView() {
        return findViewById(C7582R.id.footer_divider);
    }

    protected TextView getSectionTitleView() {
        return (TextView) findViewById(C7582R.id.reviews_section_title);
    }

    protected final /* synthetic */ View mo2985a(Object obj, Document document, ViewGroup viewGroup) {
        C2661q c2661q = (C2661q) obj;
        ReviewItemLayout reviewItemLayout = (ReviewItemLayout) this.j.inflate(C7582R.layout.review_item, viewGroup, false);
        iu iuVar = c2661q.f14712a;
        boolean z = !TextUtils.isEmpty(iuVar.f12715c);
        reviewItemLayout.m17338a(document, iuVar, 3, c2661q.f14713b, c2661q.f14714c, c2661q.f14715d, c2661q.f14716e, this.l, this.f13931b);
        if (z) {
            reviewItemLayout.setReviewFeedbackActionListener(new C2660p(this, iuVar, reviewItemLayout));
        } else {
            reviewItemLayout.setActionClickListener(null);
        }
        return reviewItemLayout;
    }
}
