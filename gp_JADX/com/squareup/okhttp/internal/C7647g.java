package com.squareup.okhttp.internal;

import com.squareup.okhttp.af;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLSocket;
import p526e.C7726f;
import p526e.C7740w;

final class C7647g extends C7646f {
    public final C7645e f39584b;
    public final C7645e f39585c;
    public final C7645e f39586d;
    public final C7645e f39587e;

    public C7647g(C7645e c7645e, C7645e c7645e2, C7645e c7645e3, C7645e c7645e4) {
        this.f39584b = c7645e;
        this.f39585c = c7645e2;
        this.f39586d = c7645e3;
        this.f39587e = c7645e4;
    }

    public final void mo6461a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (Throwable e) {
            if (k.a(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (Throwable e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        }
    }

    public final void mo6462a(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.f39584b.m36882a(sSLSocket, Boolean.valueOf(true));
            this.f39585c.m36882a(sSLSocket, str);
        }
        if (this.f39587e != null && this.f39587e.m36883a((Object) sSLSocket)) {
            Object[] objArr = new Object[1];
            C7726f c7726f = new C7726f();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                af afVar = (af) list.get(i);
                if (afVar != af.a) {
                    int length = afVar.toString().length();
                    C7740w b = c7726f.m37387b(1);
                    byte[] bArr = b.f40221a;
                    int i2 = b.f40223c;
                    b.f40223c = i2 + 1;
                    bArr[i2] = (byte) length;
                    c7726f.f40188c++;
                    String afVar2 = afVar.toString();
                    c7726f.m37378a(afVar2, 0, afVar2.length());
                }
            }
            objArr[0] = c7726f.mo6505o();
            this.f39587e.m36884b(sSLSocket, objArr);
        }
    }

    public final String mo6463b(SSLSocket sSLSocket) {
        if (this.f39586d == null) {
            return null;
        }
        if (!this.f39586d.m36883a((Object) sSLSocket)) {
            return null;
        }
        byte[] bArr = (byte[]) this.f39586d.m36884b(sSLSocket, new Object[0]);
        return bArr != null ? new String(bArr, k.c) : null;
    }
}
