package org.keyczar;

import com.squareup.haha.perflib.HprofParser;
import java.nio.ByteBuffer;
import java.security.Signature;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.p571c.C7993g;

final class C8002h implements C7993g {
    public Signature f41021a;
    public final /* synthetic */ C8001g f41022b;

    public C8002h(C8001g c8001g) {
        this.f41022b = c8001g;
        try {
            this.f41021a = Signature.getInstance("SHA1withDSA");
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }

    public final void mo6656a() {
        try {
            this.f41021a.initVerify(this.f41022b.f41015b);
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }

    public final void mo6657a(ByteBuffer byteBuffer) {
        try {
            this.f41021a.update(byteBuffer);
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }

    public final boolean mo6658b(ByteBuffer byteBuffer) {
        Object obj = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.limit() - byteBuffer.position());
            allocate.put(byteBuffer.array(), byteBuffer.position(), byteBuffer.limit() - byteBuffer.position());
            if (!C8001g.f41014a) {
                allocate.position(0);
                if (allocate.get() == (byte) 48) {
                    int i = allocate.get() & HprofParser.ROOT_UNKNOWN;
                    if (i < 128 && allocate.position() + i <= allocate.limit()) {
                        allocate.position(allocate.position() + i);
                        int i2 = 1;
                    }
                }
                if (obj != null && allocate.limit() - allocate.position() > 0) {
                    allocate.limit(allocate.position());
                }
            }
            allocate.position(0);
            return this.f41021a.verify(allocate.array(), allocate.position(), allocate.limit() - allocate.position());
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }
}
