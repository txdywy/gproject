package org.keyczar;

import java.nio.ByteBuffer;
import java.security.Signature;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.p571c.C7986f;
import org.keyczar.p571c.C7993g;

final class C7999f implements C7986f, C7993g {
    public C7993g f41013a;

    public C7999f(C7998e c7998e) {
        try {
            Signature.getInstance("SHA1withDSA");
            this.f41013a = (C7993g) c7998e.f41011a.mo6651c();
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }

    public final void mo6656a() {
        this.f41013a.mo6656a();
    }

    public final void mo6657a(ByteBuffer byteBuffer) {
        this.f41013a.mo6657a(byteBuffer);
    }

    public final boolean mo6658b(ByteBuffer byteBuffer) {
        return this.f41013a.mo6658b(byteBuffer);
    }
}
