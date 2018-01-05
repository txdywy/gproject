package com.google.android.libraries.play.entertainment.p192l.p193b;

import com.google.android.libraries.play.entertainment.p192l.C6099d;
import com.google.android.libraries.play.entertainment.p192l.C6101b;
import com.google.android.libraries.play.entertainment.p351m.C6117c;
import java.io.InputStream;

public final class C6111b extends C6099d {
    public final byte[] f30282b;

    public C6111b(C6101b c6101b, byte[] bArr) {
        super(c6101b);
        this.f30282b = bArr;
    }

    public final long mo5291a() {
        return (long) this.f30282b.length;
    }

    public final InputStream mo5292b() {
        return new C6117c(this.f30282b);
    }
}
