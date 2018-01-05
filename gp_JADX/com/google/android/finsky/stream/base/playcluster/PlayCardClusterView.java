package com.google.android.finsky.stream.base.playcluster;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ab;
import com.google.android.finsky.ratereview.C3974q;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;

public class PlayCardClusterView extends C2628h {
    public PlayCardClusterViewContent f21589a;
    public C4808a f21590b;
    public C3974q f21591c;
    public C1254c f21592d;

    public PlayCardClusterView(Context context) {
        this(context, null);
    }

    public PlayCardClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f21589a = (PlayCardClusterViewContent) findViewById(C7582R.id.cluster_content);
    }

    public C4281c getMetadata() {
        return this.f21589a.getMetadata();
    }

    public final d m19866a(int i) {
        return this.f21589a.m19876b(i);
    }

    public int getCardChildCount() {
        return this.f21589a.getCardChildCount();
    }

    public final boolean m19868b() {
        return getCardChildCount() > 0;
    }

    public PlayCardClusterView mo4240a(Document document) {
        this.f21589a.setClusterDocumentData(document);
        return this;
    }

    public final void Z_() {
        super.Z_();
        this.f21589a.Z_();
    }

    public void setCardContentHorizontalPadding(int i) {
        this.f21589a.setCardContentHorizontalPadding(i);
    }

    public void mo4241a(C4281c c4281c, C4808a c4808a, C1254c c1254c, C3748a c3748a, ab abVar, C4283e c4283e, ad adVar, C2495w c2495w) {
        byte[] bArr;
        this.f21590b = c4808a;
        this.f21591c = c4808a.f25084a;
        this.f21592d = c1254c;
        PlayCardClusterViewContent playCardClusterViewContent = this.f21589a;
        playCardClusterViewContent.f21594b = c4281c;
        playCardClusterViewContent.f21606n = c4808a;
        Document clusterLoggingDocument = this.f21589a.getClusterLoggingDocument();
        if (clusterLoggingDocument == null) {
            bArr = null;
        } else {
            bArr = clusterLoggingDocument.f14885a.f12087D;
        }
        m13752a(bArr, adVar);
        c4283e.m19887a(this);
        this.f21589a.mo4244a(c3748a, abVar, c4283e.f21639a, getParentOfChildren(), c2495w, null, 0);
    }

    public void onMeasure(int i, int i2) {
        int i3;
        int size = MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.g == null || this.g.getVisibility() == 8) {
            i3 = paddingTop;
        } else {
            this.g.measure(i, 0);
            i3 = paddingTop + this.g.getMeasuredHeight();
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f21589a.getLayoutParams();
        this.f21589a.measure(i, 0);
        setMeasuredDimension(size, (marginLayoutParams.bottomMargin + (marginLayoutParams.topMargin + this.f21589a.getMeasuredHeight())) + i3);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width = getWidth();
        int paddingTop = getPaddingTop();
        if (this.g == null || this.g.getVisibility() == 8) {
            i5 = paddingTop;
        } else {
            this.g.layout(0, paddingTop, width, this.g.getMeasuredHeight() + paddingTop);
            i5 = paddingTop + this.g.getMeasuredHeight();
        }
        paddingTop = ((MarginLayoutParams) this.f21589a.getLayoutParams()).topMargin + i5;
        this.f21589a.layout(0, paddingTop, width, this.f21589a.getMeasuredHeight() + paddingTop);
    }
}
