package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.detailscomponents.C2585k;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.finsky.stream.base.playcluster.C1158a;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewHeader;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public class CardClusterModuleLayout extends LinearLayout implements C2585k, ap, C2621k, C2622l {
    public final int f13943a;
    public final int f13944b;
    public PlayCardClusterViewHeader f13945c;
    public final List f13946d;

    public CardClusterModuleLayout(Context context) {
        this(context, null);
    }

    protected ViewGroup getBucketParent() {
        return this;
    }

    public CardClusterModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13946d = new ArrayList(1);
        Resources resources = context.getResources();
        if (C1473m.f7980a.av().m9286k(resources)) {
            this.f13944b = -resources.getDimensionPixelSize(C7582R.dimen.play_card_inset);
        } else {
            this.f13944b = 0;
        }
        this.f13943a = mo3016b(getResources());
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f13945c = (PlayCardClusterViewHeader) findViewById(C7582R.id.cluster_header);
        BucketRowLayout bucketRowLayout = (BucketRowLayout) getBucketParent().findViewById(C7582R.id.bucket_row);
        m13744a(bucketRowLayout);
        this.f13946d.add(bucketRowLayout);
    }

    public void mo3015a(C1158a c1158a, int i, String str, String str2, String str3, int i2, OnClickListener onClickListener) {
        this.f13945c.m19879a(i, str, str2, str3, onClickListener);
        int min = Math.min(i2, ((c1158a.mo1486c() + this.f13943a) - 1) / this.f13943a);
        int size = this.f13946d.size();
        if (size > min) {
            for (int i3 = min; i3 < size; i3++) {
                ((BucketRowLayout) this.f13946d.get(i3)).setVisibility(8);
            }
        } else if (size < min) {
            LayoutInflater from = LayoutInflater.from(getContext());
            while (size < min) {
                BucketRowLayout bucketRowLayout = (BucketRowLayout) from.inflate(C7582R.layout.card_cluster_module_row, this, false);
                m13744a(bucketRowLayout);
                this.f13946d.add(bucketRowLayout);
                getBucketParent().addView(bucketRowLayout);
                size++;
            }
        }
        int i4 = 0;
        boolean z = false;
        while (i4 < min) {
            bucketRowLayout = (BucketRowLayout) this.f13946d.get(i4);
            bucketRowLayout.setVisibility(0);
            boolean z2 = z;
            size = 0;
            while (size < this.f13943a) {
                boolean z3 = z2 + 1;
                c1158a.mo1481a(bucketRowLayout.getChildAt(size), z2);
                size++;
                z2 = z3;
            }
            i4++;
            z = z2;
        }
    }

    private final void m13744a(BucketRowLayout bucketRowLayout) {
        Context context = getContext();
        LayoutInflater from = LayoutInflater.from(context);
        Resources resources = context.getResources();
        for (int i = 0; i < this.f13943a; i++) {
            bucketRowLayout.addView(from.inflate(mo3014a(resources), bucketRowLayout, false));
        }
    }

    protected int mo3014a(Resources resources) {
        C1473m.f7980a.mo2245h();
        if (resources.getBoolean(C7582R.bool.play_can_use_mini_cards)) {
            return C7582R.layout.play_card_mini;
        }
        return C7582R.layout.play_card_small;
    }

    protected int mo3016b(Resources resources) {
        return C1473m.f7980a.mo2245h().m18477a(resources);
    }

    public int getMarginOffset() {
        return this.f13944b;
    }
}
