package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class ad implements OnClickListener {
    ad() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
