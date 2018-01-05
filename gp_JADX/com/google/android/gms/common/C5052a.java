package com.google.android.gms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;

public final class C5052a extends DialogFragment {
    public Dialog f25620a = null;
    public OnCancelListener f25621b = null;

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.f25621b != null) {
            this.f25621b.onCancel(dialogInterface);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        if (this.f25620a == null) {
            setShowsDialog(false);
        }
        return this.f25620a;
    }
}
