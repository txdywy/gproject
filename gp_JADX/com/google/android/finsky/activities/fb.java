package com.google.android.finsky.activities;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnShowListener;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.ad;
import android.widget.FrameLayout;
import com.squareup.leakcanary.C7582R;

final class fb implements OnShowListener {
    public final /* synthetic */ Dialog f6780a;

    fb(Dialog dialog) {
        this.f6780a = dialog;
    }

    public final void onShow(DialogInterface dialogInterface) {
        this.f6780a.getWindow().setLayout(-2, -1);
        BottomSheetBehavior.m417a((FrameLayout) ((ad) dialogInterface).findViewById(C7582R.id.design_bottom_sheet)).m433b(3);
    }
}
