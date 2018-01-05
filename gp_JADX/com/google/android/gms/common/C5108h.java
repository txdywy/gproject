package com.google.android.gms.common;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.support.v4.app.C0141p;

public final class C5108h extends C0141p {
    public OnCancelListener af = null;
    public Dialog f25972f = null;

    public final Dialog mo143a(Bundle bundle) {
        if (this.f25972f == null) {
            this.f773d = false;
        }
        return this.f25972f;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.af != null) {
            this.af.onCancel(dialogInterface);
        }
    }
}
