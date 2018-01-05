package com.google.android.finsky.family.setup;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;

public final class C3101b implements OnClickListener {
    public boolean f16045a;
    public final C3748a f16046b;
    public final C2495w f16047c;

    public C3101b(C3748a c3748a, boolean z, C2495w c2495w) {
        this.f16046b = c3748a;
        this.f16045a = z;
        this.f16047c = c2495w;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        if (this.f16045a) {
            this.f16046b.mo3629a(4, this.f16047c);
        }
    }
}
