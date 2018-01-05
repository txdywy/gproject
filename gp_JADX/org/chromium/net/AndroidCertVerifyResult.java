package org.chromium.net;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.chromium.base.annotations.CalledByNative;

public class AndroidCertVerifyResult {
    public final int f40567a;
    public final boolean f40568b;
    public final List f40569c;

    public AndroidCertVerifyResult(boolean z, List list) {
        this.f40567a = 0;
        this.f40568b = z;
        this.f40569c = new ArrayList(list);
    }

    public AndroidCertVerifyResult(int i) {
        this.f40567a = i;
        this.f40568b = false;
        this.f40569c = Collections.emptyList();
    }

    @CalledByNative
    public int getStatus() {
        return this.f40567a;
    }

    @CalledByNative
    public boolean isIssuedByKnownRoot() {
        return this.f40568b;
    }

    @CalledByNative
    public byte[][] getCertificateChainEncoded() {
        byte[][] bArr = new byte[this.f40569c.size()][];
        int i = 0;
        while (i < this.f40569c.size()) {
            try {
                bArr[i] = ((X509Certificate) this.f40569c.get(i)).getEncoded();
                i++;
            } catch (CertificateEncodingException e) {
                return new byte[0][];
            }
        }
        return bArr;
    }
}
