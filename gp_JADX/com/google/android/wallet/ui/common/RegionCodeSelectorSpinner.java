package com.google.android.wallet.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.SpinnerAdapter;
import com.google.android.wallet.common.p376a.C6553f;
import com.google.android.wallet.common.util.C6591c;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;

public class RegionCodeSelectorSpinner extends FormSpinner {
    public ContextThemeWrapper f33461G;
    public bv f33462H;

    public RegionCodeSelectorSpinner(Context context) {
        super(context);
        m30677a(context);
    }

    public RegionCodeSelectorSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30677a(context);
    }

    public RegionCodeSelectorSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30677a(context);
    }

    private final void m30677a(Context context) {
        if (context instanceof ContextThemeWrapper) {
            this.f33461G = (ContextThemeWrapper) context;
            return;
        }
        throw new IllegalArgumentException("RegionCodeSelectorSpinner must be used with a ContextThemeWrapper");
    }

    public int getSelectedRegionCode() {
        return ((Integer) getSelectedItem()).intValue();
    }

    public void setRegionCodes(int[] iArr) {
        SpinnerAdapter bwVar = new bw(this.f33461G, C6623g.view_row_spinner, C6622f.description, C6591c.m29909a(iArr));
        bwVar.setDropDownViewResource(C6623g.view_spinner_dropdown);
        setAdapter(bwVar);
        setOnItemSelectedListener(new bu(this));
    }

    public int getRegionCodeCount() {
        return getCount();
    }

    public void setRegionCodeSelectedListener(bv bvVar) {
        this.f33462H = bvVar;
    }

    public final boolean mo5581e() {
        return super.mo5581e() && getSelectedRegionCode() != 0;
    }

    public final String mo5522a(String str) {
        return C6553f.m29741b(getSelectedRegionCode());
    }
}
