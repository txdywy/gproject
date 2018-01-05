package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class ak implements OnClickListener {
    ak() {
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }
}
