package com.google.android.finsky.activities;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;

final class fx implements OnMultiChoiceClickListener {
    public final /* synthetic */ fw f6831a;

    fx(fw fwVar) {
        this.f6831a = fwVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        this.f6831a.af[i] = z;
    }
}
