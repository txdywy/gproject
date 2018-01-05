package com.google.android.finsky.p189e;

import android.accounts.Account;
import android.support.v7.widget.eq;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.cs.C2376e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.compression.brotli.wrapper.dec.DecoderJNI;
import com.google.compression.brotli.wrapper.dec.a;
import com.google.compression.brotli.wrapper.dec.b;
import com.google.compression.brotli.wrapper.dec.d;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class C2946a {
    public C2376e f15564a;
    public C0986a f15565b;
    public ByteBuffer f15566c;

    public C2946a(C2376e c2376e, C0986a c0986a) {
        this.f15564a = c2376e;
        this.f15565b = c0986a;
    }

    private final boolean m15323a() {
        Account b = this.f15565b.mo1196b();
        if (!this.f15564a.mo2877b("NativeBrotli", "enable_native_brotli_decompression", b == null ? null : b.name)) {
            return false;
        }
        if (!C1503a.m8829a()) {
            return false;
        }
        try {
            System.loadLibrary("brotli");
        } catch (UnsatisfiedLinkError e) {
        }
        try {
            InputStream resourceAsStream = getClass().getResourceAsStream("/third_party/brotli/common/dictionary.bin");
            if (resourceAsStream == null) {
                FinskyLog.m21665c("Brotli dictionary not found", new Object[0]);
                return false;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[eq.FLAG_APPEARED_IN_PRE_LAYOUT];
            while (true) {
                int read = resourceAsStream.read(bArr);
                if (read <= 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            resourceAsStream.close();
            this.f15566c = ByteBuffer.allocateDirect(byteArrayOutputStream.size());
            this.f15566c.put(byteArrayOutputStream.toByteArray());
            a aVar = new a(new ByteArrayInputStream(new byte[5]));
            ByteBuffer byteBuffer = this.f15566c;
            b bVar = aVar.a;
            d dVar = bVar.b;
            if (!byteBuffer.isDirect()) {
                throw new IllegalArgumentException("only direct buffers allowed");
            } else if (dVar.a[0] == 0) {
                throw new IllegalStateException("brotli decoder is already destroyed");
            } else if (dVar.d) {
                if (!DecoderJNI.a(dVar.a, byteBuffer)) {
                    bVar.a("failed to attach dictionary");
                }
                aVar.close();
                return true;
            } else {
                throw new IllegalStateException("decoding is already started");
            }
        } catch (UnsatisfiedLinkError e2) {
            return false;
        } catch (Throwable e3) {
            FinskyLog.m21660a(e3, "Running native Brotli in empty input has resulted in IOException.", new Object[0]);
            return false;
        }
    }

    public final InputStream m15324a(InputStream inputStream) {
        if (m15323a()) {
            return new a(inputStream);
        }
        return new com.google.compression.brotli.dec.b(inputStream, 8192);
    }
}
