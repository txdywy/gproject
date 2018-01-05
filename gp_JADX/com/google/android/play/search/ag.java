package com.google.android.play.search;

import android.view.View;
import android.view.View.OnClickListener;

final class ag implements OnClickListener {
    public final /* synthetic */ OnClickListener f32338a;
    public final /* synthetic */ PlaySearchToolbar f32339b;

    ag(PlaySearchToolbar playSearchToolbar, OnClickListener onClickListener) {
        this.f32339b = playSearchToolbar;
        this.f32338a = onClickListener;
    }

    public final void onClick(View view) {
        if (this.f32339b.ad.f32280s.m29445a() && this.f32338a != null) {
            this.f32338a.onClick(view);
        }
    }
}
