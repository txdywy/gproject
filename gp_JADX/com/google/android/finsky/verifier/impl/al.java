package com.google.android.finsky.verifier.impl;

import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

final class al implements OnKeyListener {
    public final /* synthetic */ ak f24383a;

    al(ak akVar) {
        this.f24383a = akVar;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 4 && keyEvent.getAction() == 1) {
            this.f24383a.af.f24333a.putBoolean("pressed_back_button", true);
        }
        return false;
    }
}
