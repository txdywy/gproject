package org.keyczar;

import java.nio.ByteBuffer;
import java.security.Signature;
import javax.crypto.Cipher;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.p571c.C7986f;
import org.keyczar.p571c.C7993g;

final class C8011s implements C7986f, C7993g {
    public C7993g f41051a;

    public C8011s(C8010r c8010r) {
        try {
            Signature.getInstance("SHA1withRSA");
            this.f41051a = (C7993g) c8010r.f41044a.mo6651c();
            Cipher.getInstance(c8010r.f41044a.m38252f().f40983c);
            c8010r.f41044a.mo6651c();
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }

    public final void mo6656a() {
        this.f41051a.mo6656a();
    }

    public final void mo6657a(ByteBuffer byteBuffer) {
        this.f41051a.mo6657a(byteBuffer);
    }

    public final boolean mo6658b(ByteBuffer byteBuffer) {
        return this.f41051a.mo6658b(byteBuffer);
    }
}
