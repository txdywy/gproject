package org.keyczar;

import java.nio.ByteBuffer;
import java.util.Collection;
import org.keyczar.exceptions.BadVersionException;
import org.keyczar.exceptions.KeyNotFoundException;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.exceptions.ShortSignatureException;
import org.keyczar.p569a.C7980b;
import org.keyczar.p571c.C7988e;
import org.keyczar.p571c.C7993g;

public final class C8015w extends C8007m {
    public C8015w(C7988e c7988e) {
        super(c7988e);
    }

    public final boolean m38256a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer2.remaining() < 5) {
            throw new ShortSignatureException(byteBuffer2.remaining());
        }
        byte b = byteBuffer2.get();
        if (b != (byte) 0) {
            throw new BadVersionException(b);
        }
        byte[] bArr = new byte[4];
        byteBuffer2.get(bArr);
        Collection<C7983p> collection = (Collection) this.f41041e.get(new C8008n(bArr));
        if (collection == null) {
            throw new KeyNotFoundException(bArr);
        } else if (collection == null) {
            throw new KeyNotFoundException(bArr);
        } else {
            byteBuffer.mark();
            byteBuffer2.mark();
            for (C7983p c7983p : collection) {
                try {
                    C7993g c7993g = (C7993g) c7983p.mo6651c();
                    c7993g.mo6656a();
                    c7993g.mo6657a(byteBuffer);
                    c7993g.mo6657a(ByteBuffer.wrap(a));
                    boolean b2 = c7993g.mo6658b(byteBuffer2);
                    c7983p.f40986j.add(c7993g);
                    if (b2) {
                        return true;
                    }
                    byteBuffer.reset();
                    byteBuffer2.reset();
                } catch (KeyczarException e) {
                } catch (RuntimeException e2) {
                }
            }
            return false;
        }
    }

    final boolean mo6661a(C7980b c7980b) {
        return c7980b == C7980b.VERIFY || c7980b == C7980b.SIGN_AND_VERIFY;
    }

    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
