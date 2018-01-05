package com.google.android.play.search;

import android.view.View;
import android.view.View.OnClickListener;

final class C6418k implements OnClickListener {
    public final /* synthetic */ PlaySearchActionButton f32360a;

    C6418k(PlaySearchActionButton playSearchActionButton) {
        this.f32360a = playSearchActionButton;
    }

    public final void onClick(View view) {
        if (this.f32360a.f32288a != null) {
            if (this.f32360a.f32292e == 1) {
                this.f32360a.f32288a.m29443a("", true);
            } else if (this.f32360a.f32292e == 2) {
                this.f32360a.f32288a.m29441a(4);
            }
        }
    }
}
