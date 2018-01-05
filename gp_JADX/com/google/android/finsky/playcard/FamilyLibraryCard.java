package com.google.android.finsky.playcard;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.frameworkviews.C3075q;
import com.squareup.leakcanary.C7582R;

public class FamilyLibraryCard extends C3893r implements C3075q {
    public int C_;
    public boolean f19350a;
    public boolean f19351b;
    public int f19352d;

    public FamilyLibraryCard(Context context) {
        this(context, null);
    }

    public FamilyLibraryCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        this.C_ = resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_card_to_card_vpadding);
        this.f19352d = resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
    }

    public void setIsFirstRow(boolean z) {
        this.f19350a = z;
    }

    public void setIsLastRow(boolean z) {
        this.f19351b = z;
    }

    protected void onMeasure(int i, int i2) {
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.U.getLayoutParams();
        marginLayoutParams.height = (int) (((float) marginLayoutParams.width) * this.am);
        super.onMeasure(i, i2);
    }

    public int getCardType() {
        return 38;
    }

    public final boolean ap_() {
        return this.f19350a;
    }

    public final boolean aq_() {
        return this.f19351b;
    }

    public int getDividerSize() {
        return this.C_;
    }

    public int getSectionBottomSpacerSize() {
        return this.f19352d;
    }
}
