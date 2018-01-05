package com.google.android.finsky.setup;

import android.content.Intent;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

final class cw implements OnCheckedChangeListener {
    public final /* synthetic */ VpaDetailsActivity f20963a;

    cw(VpaDetailsActivity vpaDetailsActivity) {
        this.f20963a = vpaDetailsActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Intent intent = new Intent("VpaDetailsActivity.detailsCheckboxToggled");
        intent.putExtra("VpaDetailsActivity.groupIndex", this.f20963a.f20672q.f20562a.j);
        intent.putExtra("VpaDetailsActivity.preloadIndex", this.f20963a.f20673r);
        intent.putExtra("VpaDetailsActivity.isSelected", z);
        this.f20963a.f20660e.m1133a(intent);
    }
}
