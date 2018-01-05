package com.google.android.libraries.play.entertainment.p192l.p350a;

import com.google.android.libraries.play.entertainment.p192l.C6099d;
import com.google.android.libraries.play.entertainment.p192l.C6101b;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.p351m.C6117c;
import com.google.protobuf.nano.C0757i;
import java.io.InputStream;

public final class C6100a extends C6099d {
    public final C0757i f30257b;
    public byte[] f30258c;

    public C6100a(C6101b c6101b, C0757i c0757i) {
        super(c6101b);
        this.f30257b = (C0757i) C6116b.m28100a((Object) c0757i);
    }

    public final long mo5291a() {
        return (long) m28071c().length;
    }

    public final InputStream mo5292b() {
        return new C6117c(m28071c());
    }

    private final byte[] m28071c() {
        if (this.f30258c == null) {
            this.f30258c = C0757i.m4909a(this.f30257b);
        }
        return this.f30258c;
    }
}
