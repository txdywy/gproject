package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class ac implements OnClickListener {
    ac() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
