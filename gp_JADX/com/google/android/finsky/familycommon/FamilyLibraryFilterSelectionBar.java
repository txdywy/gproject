package com.google.android.finsky.familycommon;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.squareup.leakcanary.C7582R;

public class FamilyLibraryFilterSelectionBar extends LinearLayout {
    public FamilyLibraryFilterSelectionBar(Context context) {
        this(context, null);
    }

    public FamilyLibraryFilterSelectionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
    }
}
