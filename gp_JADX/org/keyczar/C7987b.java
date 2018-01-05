package org.keyczar;

import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.p571c.C7986f;

final class C7987b implements C7986f {
    public final Cipher f40993a;
    public final Cipher f40994b;

    public C7987b(C7984a c7984a) {
        AlgorithmParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
        try {
            this.f40993a = Cipher.getInstance(c7984a.f40990d.f40969e);
            this.f40993a.init(1, c7984a.f40987a, ivParameterSpec);
            this.f40994b = Cipher.getInstance(c7984a.f40990d.f40969e);
            this.f40994b.init(2, c7984a.f40987a, ivParameterSpec);
            c7984a.f40989c.mo6651c();
        } catch (Throwable e) {
            throw new KeyczarException(e);
        }
    }
}
