package com.google.android.finsky.p142j;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class C3637p implements OnClickListener {
    public final /* synthetic */ C3636o f18003a;

    C3637p(C3636o c3636o) {
        this.f18003a = c3636o;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f18003a.m626a(false);
        if (this.f18003a.af != null) {
            this.f18003a.af.mo4181b(i);
        }
    }
}
