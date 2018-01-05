package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.support.v7.app.AlertController;
import android.support.v7.app.y;
import android.widget.ListView;
import com.google.android.play.utils.b.j;

public final class com.google.android.finsky.activities.ab implements DialogInterface$OnClickListener
{

    public final com.google.android.finsky.activities.t a;

    ab(com.google.android.finsky.activities.t p0) {
        this.a = p0;
    }

    public final void onClick(DialogInterface p0, int p1) {
        switch (((android.support.v7.app.y)p0).a.f.getCheckedItemPosition()) {
            case 0:
                this.a.a(com.google.android.play.utils.b.j.A, Boolean.toString(1));
                this.a.a(com.google.android.play.utils.b.j.B, Integer.toString(4));
                break;
            case 1:
                this.a.a(com.google.android.play.utils.b.j.A, Boolean.toString(1));
                this.a.a(com.google.android.play.utils.b.j.B, Integer.toString(3));
                break;
            case 2:
                this.a.a(com.google.android.play.utils.b.j.A, Boolean.toString(1));
                this.a.a(com.google.android.play.utils.b.j.B, Integer.toString(2));
                break;
            case 3:
                this.a.a(com.google.android.play.utils.b.j.A, Boolean.toString(1));
                this.a.a(com.google.android.play.utils.b.j.B, Integer.toString(1));
                break;
            case 4:
                this.a.a(com.google.android.play.utils.b.j.A, Boolean.toString(0));
                this.a.a(com.google.android.play.utils.b.j.B, Integer.toString(1));
                break;
            default:
                this.a.a(com.google.android.play.utils.b.j.A, Boolean.toString(1));
                this.a.a(com.google.android.play.utils.b.j.B, Integer.toString(1));
                break;
        }
        this.a.a(0);
    }

}
