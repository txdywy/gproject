package org.keyczar;

import java.nio.ByteBuffer;
import javax.crypto.Mac;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.p571c.C7986f;
import org.keyczar.p571c.C7993g;
import org.keyczar.p572d.C7996b;

final class C8004j implements C7986f, C7993g {
    public final Mac f41026a;
    public final /* synthetic */ C8003i f41027b;

    public C8004j(C8003i c8003i) {
        this.f41027b = c8003i;
        try {
            this.f41026a = Mac.getInstance("HMACSHA1");
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }

    public final void mo6656a() {
        try {
            this.f41026a.init(this.f41027b.f41024b);
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }

    public final void mo6657a(ByteBuffer byteBuffer) {
        this.f41026a.update(byteBuffer);
    }

    public final boolean mo6658b(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return C7996b.m38192a(this.f41026a.doFinal(), bArr);
    }
}
