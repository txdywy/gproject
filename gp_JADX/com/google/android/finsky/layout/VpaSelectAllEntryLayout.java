package com.google.android.finsky.layout;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import com.squareup.leakcanary.C7582R;

@TargetApi(21)
public class VpaSelectAllEntryLayout extends LinearLayout {
    public CheckBox f18417a;
    public cd f18418b;
    public final OnClickListener f18419c = new cc(this);

    public VpaSelectAllEntryLayout(Context context) {
        super(context);
        m17352a();
    }

    public VpaSelectAllEntryLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m17352a();
    }

    public VpaSelectAllEntryLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m17352a();
    }

    @TargetApi(21)
    public VpaSelectAllEntryLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m17352a();
    }

    private final void m17352a() {
        setOrientation(1);
        inflate(getContext(), C7582R.layout.setup_wizard_preloads_select_all_entry, this);
        this.f18417a = (CheckBox) findViewById(C7582R.id.setup_wizard_preloads_select_all_checkable);
        this.f18417a.setOnClickListener(this.f18419c);
    }

    public void setListener(cd cdVar) {
        this.f18418b = cdVar;
    }

    public boolean isSelected() {
        return this.f18417a.isChecked();
    }

    public void setSelectAllCheckableWithoutNotify(boolean z) {
        this.f18417a.setChecked(z);
    }
}
