package com.google.android.wallet.ui.p397d;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;

final class C6801d implements OnCancelListener {
    public final /* synthetic */ C6678c f33729a;

    C6801d(C6678c c6678c) {
        this.f33729a = c6678c;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        if (this.f33729a.ah != null) {
            this.f33729a.ah.mo5560a(this.f33729a);
        }
        this.f33729a.ah();
    }
}
