package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class aq implements OnClickListener {
    aq() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
