package com.google.android.wallet.ui.p401c;

import android.content.DialogInterface;
import com.google.android.wallet.ui.common.C6665h;

public abstract class C6732a extends C6665h {
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        if (this.r instanceof C6733b) {
            mo5620a((C6733b) this.r);
        }
    }

    protected void mo5620a(C6733b c6733b) {
        c6733b.m30476a();
    }
}
