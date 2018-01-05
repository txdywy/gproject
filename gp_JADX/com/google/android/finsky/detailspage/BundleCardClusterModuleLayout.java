package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.MeasureSpec;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.playcard.PlayCardViewBundleItemMedium;
import com.google.android.finsky.playcard.PlayCardViewBundleItemSmall;
import com.google.android.finsky.playcard.cc;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

public class BundleCardClusterModuleLayout extends LinearLayout {
    public final int f13932a;
    public TextView f13933b;
    public ViewStub f13934c;
    public PlayCardViewBundleItemMedium f13935d;
    public boolean f13936e;

    public BundleCardClusterModuleLayout(Context context) {
        this(context, null);
    }

    public BundleCardClusterModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13932a = C1473m.f7980a.av().m9282g(getResources());
        Resources resources = context.getResources();
        int dimensionPixelSize = (resources.getDimensionPixelSize(C7582R.dimen.details_new_content_margin) - resources.getDimensionPixelSize(C7582R.dimen.details_pack_row_padding)) - resources.getDimensionPixelSize(C7582R.dimen.play_card_default_inset);
        ai.m1823a(this, dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f13933b = (TextView) findViewById(C7582R.id.bundle_card_cluster_module_heading);
        this.f13934c = (ViewStub) findViewById(C7582R.id.bundle_card_cluster_medium_card);
    }

    public final void m13743a(C2720j c2720j, C3748a c3748a, ad adVar, int i, C2495w c2495w) {
        cc ccVar;
        this.f13936e = true;
        CharSequence charSequence = c2720j.f14908a.f14885a.f12100g;
        if (TextUtils.isEmpty(charSequence)) {
            this.f13933b.setVisibility(8);
        } else {
            this.f13933b.setVisibility(0);
            this.f13933b.setText(charSequence);
        }
        int m = c2720j.m14698m();
        int i2;
        if (m != 1 || this.f13932a <= 1) {
            int childCount;
            BucketRowLayout bucketRowLayout;
            int i3;
            if (this.f13935d != null) {
                this.f13935d.d();
                this.f13935d.setVisibility(8);
            }
            i2 = this.f13932a;
            int i4 = (((m + i2) - 1) / i2) + 2;
            for (i2 = getChildCount() - 1; i2 >= i4; i2--) {
                removeViewAt(i2);
            }
            LayoutInflater from = LayoutInflater.from(getContext());
            for (childCount = getChildCount(); childCount < i4; childCount++) {
                bucketRowLayout = (BucketRowLayout) from.inflate(C7582R.layout.card_cluster_module_row, this, false);
                for (i3 = 0; i3 < this.f13932a; i3++) {
                    from.inflate(C7582R.layout.play_card_bundle_item_small, bucketRowLayout);
                }
                addView(bucketRowLayout);
            }
            i3 = m % this.f13932a;
            if (i3 > 0) {
                bucketRowLayout = (BucketRowLayout) getChildAt(i4 - 1);
                for (childCount = i3; childCount < this.f13932a; childCount++) {
                    ((PlayCardViewBundleItemSmall) bucketRowLayout.getChildAt(childCount)).d();
                }
            }
            ccVar = (cc) ((BucketRowLayout) getChildAt(2)).getChildAt(0);
        } else {
            for (i2 = getChildCount() - 1; i2 >= 2; i2--) {
                removeViewAt(i2);
            }
            if (this.f13934c != null) {
                this.f13935d = (PlayCardViewBundleItemMedium) this.f13934c.inflate();
                this.f13934c = null;
            }
            this.f13935d.setVisibility(0);
            ccVar = this.f13935d;
        }
        m13742a(ccVar, (Document) c2720j.m14679a(0, true), c3748a, adVar, i, c2495w);
        for (int i5 = 1; i5 < m; i5++) {
            m13742a((cc) ((BucketRowLayout) getChildAt((i5 / this.f13932a) + 2)).getChildAt(i5 % this.f13932a), (Document) c2720j.m14679a(i5, true), c3748a, adVar, i, c2495w);
        }
    }

    private static void m13742a(cc ccVar, Document document, C3748a c3748a, ad adVar, int i, C2495w c2495w) {
        ccVar.setCardType(i);
        C1473m.f7980a.cr().m18518a((d) ccVar, document, null, c3748a, adVar, c2495w);
        ccVar.mo3847a();
    }

    protected void onMeasure(int i, int i2) {
        if (!(this.f13935d == null || this.f13935d.getVisibility() == 8)) {
            LayoutParams layoutParams = (LayoutParams) this.f13935d.getLayoutParams();
            layoutParams.width = (((((MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()) - layoutParams.leftMargin) - layoutParams.rightMargin) * 2) / this.f13932a;
            layoutParams.height = (layoutParams.width * 3) / 4;
        }
        super.onMeasure(i, i2);
    }
}
