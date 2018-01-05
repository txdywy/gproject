package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.support.v7.app.C0433y;
import com.google.android.play.utils.p354b.C6322j;

final class ab implements OnClickListener {
    public final /* synthetic */ C1033t f6439a;

    ab(C1033t c1033t) {
        this.f6439a = c1033t;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C1033t c1033t;
        switch (((C0433y) dialogInterface).f2506a.f2220f.getCheckedItemPosition()) {
            case 0:
                c1033t = this.f6439a;
                c1033t.m6046a(C6322j.f31571A, Boolean.toString(true));
                c1033t.m6046a(C6322j.f31572B, Integer.toString(4));
                break;
            case 1:
                c1033t = this.f6439a;
                c1033t.m6046a(C6322j.f31571A, Boolean.toString(true));
                c1033t.m6046a(C6322j.f31572B, Integer.toString(3));
                break;
            case 2:
                c1033t = this.f6439a;
                c1033t.m6046a(C6322j.f31571A, Boolean.toString(true));
                c1033t.m6046a(C6322j.f31572B, Integer.toString(2));
                break;
            case 3:
                c1033t = this.f6439a;
                c1033t.m6046a(C6322j.f31571A, Boolean.toString(true));
                c1033t.m6046a(C6322j.f31572B, Integer.toString(1));
                break;
            case 4:
                c1033t = this.f6439a;
                c1033t.m6046a(C6322j.f31571A, Boolean.toString(false));
                c1033t.m6046a(C6322j.f31572B, Integer.toString(1));
                break;
            default:
                c1033t = this.f6439a;
                c1033t.m6046a(C6322j.f31571A, Boolean.toString(true));
                c1033t.m6046a(C6322j.f31572B, Integer.toString(1));
                break;
        }
        this.f6439a.m6047a(false);
    }
}
