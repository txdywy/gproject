package com.google.android.gms.common.internal;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.Log;

public abstract class bh implements OnClickListener {
    protected abstract void mo4618a();

    public void onClick(DialogInterface dialogInterface, int i) {
        try {
            mo4618a();
        } catch (Throwable e) {
            Log.e("DialogRedirect", "Failed to start resolution intent", e);
        } finally {
            dialogInterface.dismiss();
        }
    }
}
