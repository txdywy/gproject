package com.google.android.finsky.verifier.impl;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

final class ah implements OnKeyListener {
    public final /* synthetic */ ag f24382a;

    ah(ag agVar) {
        this.f24382a = agVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            this.f24382a.af.f24327c.putBoolean("pressed_back_button", true);
        }
        return false;
    }
}
