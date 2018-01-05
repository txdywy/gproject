package org.keyczar;

import java.nio.ByteBuffer;
import java.security.Signature;
import javax.crypto.Cipher;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.p571c.C7986f;
import org.keyczar.p571c.C7993g;

final class C8013u implements C7986f, C7993g {
    public Signature f41057a;
    public final /* synthetic */ C8012t f41058b;

    C8013u(C8012t c8012t) {
        this.f41058b = c8012t;
        try {
            this.f41057a = Signature.getInstance("SHA1withRSA");
            Cipher.getInstance(c8012t.m38252f().f40983c);
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }

    public final void mo6656a() {
        try {
            this.f41057a.initVerify(this.f41058b.f41052a);
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }

    public final void mo6657a(ByteBuffer byteBuffer) {
        try {
            this.f41057a.update(byteBuffer);
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }

    public final boolean mo6658b(ByteBuffer byteBuffer) {
        try {
            return this.f41057a.verify(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }
}
