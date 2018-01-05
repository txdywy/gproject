package com.google.android.finsky.activities;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.ad;
import android.support.v7.app.be;
import android.view.Window;
import android.widget.FrameLayout;

public final class com.google.android.finsky.activities.fb implements DialogInterface$OnShowListener
{

    public final Dialog a;

    fb(Dialog p0) {
        this.a = p0;
    }

    public final void onShow(DialogInterface p0) {
        this.a.getWindow().setLayout(-2, -1);
        BottomSheetBehavior.a((FrameLayout)((android.support.design.widget.ad)p0).findViewById(2131755397)).b(3);
    }

}
