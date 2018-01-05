package com.google.android.finsky.family.p199a;

import android.content.res.Resources;
import android.support.v7.p045f.C0443j;
import android.view.View;
import com.google.android.finsky.frameworkviews.OutlinedForegroundLinearLayout;
import com.google.android.finsky.playcard.FamilyLibraryCard;
import com.google.android.finsky.stream.base.C1169s;
import com.squareup.leakcanary.C7582R;

public abstract class C3031a extends C1169s implements C0443j {
    public int f15862a;
    public int f15863b;

    public C3031a(Resources resources) {
        this.f15862a = resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_card_to_card_vpadding);
        this.f15863b = resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin);
    }

    public void mo1510a(View view, int i) {
        boolean z = false;
        boolean z2 = i == 0;
        if (i == mo1508a() - 1) {
            z = true;
        }
        if (view instanceof OutlinedForegroundLinearLayout) {
            OutlinedForegroundLinearLayout outlinedForegroundLinearLayout = (OutlinedForegroundLinearLayout) view;
            outlinedForegroundLinearLayout.setDividerSize(this.f15862a);
            outlinedForegroundLinearLayout.setBottomMargin(this.f15863b);
            outlinedForegroundLinearLayout.setIsFirstRow(z2);
            outlinedForegroundLinearLayout.setIsLastRow(z);
        }
        if (view instanceof FamilyLibraryCard) {
            FamilyLibraryCard familyLibraryCard = (FamilyLibraryCard) view;
            familyLibraryCard.setIsFirstRow(z2);
            familyLibraryCard.setIsLastRow(z);
        }
    }

    public final void mo620a(int i, int i2) {
        if (this.C != null) {
            this.C.mo4086a(this, i, i2);
        }
    }

    public final void mo622b(int i, int i2) {
        if (this.C != null) {
            this.C.mo4088b(this, i, i2);
        }
    }

    public final void mo623c(int i, int i2) {
        if (this.C != null) {
            this.C.mo4089c(this, i, i2);
        }
    }

    public final void mo621a(int i, int i2, Object obj) {
        if (this.C != null) {
            this.C.mo4087a(this, i, i2, false);
        }
    }
}
