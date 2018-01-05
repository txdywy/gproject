package com.google.android.finsky.entertainment;

import com.google.android.libraries.play.entertainment.p192l.C2983e;
import com.google.android.libraries.play.entertainment.p192l.C2989f;
import com.google.android.libraries.play.entertainment.p192l.C6101b;
import com.google.android.libraries.play.entertainment.p192l.C6113c;
import com.google.android.libraries.play.entertainment.p344d.C6056i;

final class C2988e extends C2983e {
    public final C2983e f15672a;
    public final C2983e f15673b;

    public C2988e(C2989f c2989f, C2983e c2983e, C2983e c2983e2) {
        super(c2989f);
        this.f15672a = c2983e;
        this.f15673b = c2983e2;
    }

    public final C6056i mo3213a(C6113c c6113c) {
        return m15438c(c6113c.f30285b).mo3213a(c6113c);
    }

    public final void mo3215a(C6101b c6101b) {
        m15438c(c6101b).mo3215a(c6101b);
    }

    private final C2983e m15438c(C6101b c6101b) {
        switch (c6101b.mo5294a()) {
            case 0:
                return this.f15672a;
            case 1:
                return this.f15673b;
            default:
                String valueOf = String.valueOf(c6101b);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 33).append("Unexpected blob type for blobId: ").append(valueOf).toString());
        }
    }
}
