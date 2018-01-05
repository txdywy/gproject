package com.google.android.gms.peerdownloadmanager.p292c;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.peerdownloadmanager.p293d.C5369d;
import com.google.common.f.a.bf;

final class C5370l extends C5369d {
    public final /* synthetic */ bf f27912a;

    C5370l(bf bfVar) {
        this.f27912a = bfVar;
    }

    public final void mo4982a(ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            this.f27912a.a(parcelFileDescriptor);
        } else {
            this.f27912a.cancel(true);
        }
    }
}
