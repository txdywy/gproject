package org.chromium.net.impl;

import android.annotation.SuppressLint;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import org.chromium.base.C7893j;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.as;
import org.chromium.net.at;

public final class CronetUploadDataStream extends at {
    public static final String f40694a = CronetUploadDataStream.class.getSimpleName();
    public final Executor f40695b;
    public final cf f40696c;
    public final CronetUrlRequest f40697d;
    public long f40698e;
    public long f40699f;
    public long f40700g;
    public final Runnable f40701h = new C7950j(this);
    public ByteBuffer f40702i = null;
    public final Object f40703j = new Object();
    public long f40704k = 0;
    public C7953m f40705l = C7953m.NOT_IN_CALLBACK;
    public boolean f40706m = false;
    public Runnable f40707n;

    public CronetUploadDataStream(as asVar, Executor executor, CronetUrlRequest cronetUrlRequest) {
        this.f40695b = executor;
        this.f40696c = new cf(asVar);
        this.f40697d = cronetUrlRequest;
    }

    private final native long nativeAttachUploadDataToRequest(long j, long j2);

    private final native long nativeCreateAdapterForTesting();

    private final native long nativeCreateUploadDataStreamForTesting(long j, long j2);

    private static native void nativeDestroy(long j);

    private final native void nativeOnReadSucceeded(long j, int i, boolean z);

    private final native void nativeOnRewindSucceeded(long j);

    @CalledByNative
    final void readData(ByteBuffer byteBuffer) {
        this.f40702i = byteBuffer;
        this.f40700g = (long) byteBuffer.limit();
        m37999a(this.f40701h);
    }

    @CalledByNative
    final void rewind() {
        m37999a(new C7951k(this));
    }

    final void m38001a(C7953m c7953m) {
        if (this.f40705l != c7953m) {
            throw new IllegalStateException("Expected " + c7953m + ", but was " + this.f40705l);
        }
    }

    @CalledByNative
    final void onUploadDataStreamDestroyed() {
        m37994b();
    }

    final void m38000a(Throwable th) {
        synchronized (this.f40703j) {
            if (this.f40705l == C7953m.NOT_IN_CALLBACK) {
                throw new IllegalStateException("There is no read or rewind or length check in progress.");
            }
            int i = this.f40705l == C7953m.GET_LENGTH ? 1 : 0;
            this.f40705l = C7953m.NOT_IN_CALLBACK;
            this.f40702i = null;
            m37995c();
        }
        if (i != 0) {
            try {
                this.f40696c.close();
            } catch (Exception e) {
                C7893j.m37818b(f40694a, "Failure closing data provider", e);
            }
        }
        this.f40697d.m38015a(th);
    }

    @SuppressLint({"DefaultLocale"})
    public final void mo6592a(boolean z) {
        synchronized (this.f40703j) {
            m38001a(C7953m.READ);
            if (this.f40700g != ((long) this.f40702i.limit())) {
                throw new IllegalStateException("ByteBuffer limit changed");
            }
            if (z) {
                if (this.f40698e >= 0) {
                    throw new IllegalArgumentException("Non-chunked upload can't have last chunk");
                }
            }
            int position = this.f40702i.position();
            this.f40699f -= (long) position;
            if (this.f40699f >= 0 || this.f40698e < 0) {
                this.f40702i.position(0);
                this.f40702i = null;
                this.f40705l = C7953m.NOT_IN_CALLBACK;
                m37995c();
                if (this.f40704k == 0) {
                    return;
                }
                nativeOnReadSucceeded(this.f40704k, position, z);
                return;
            }
            throw new IllegalArgumentException(String.format("Read upload data length %d exceeds expected length %d", new Object[]{Long.valueOf(this.f40698e - this.f40699f), Long.valueOf(this.f40698e)}));
        }
    }

    public final void mo6590a() {
        synchronized (this.f40703j) {
            m38001a(C7953m.REWIND);
            this.f40705l = C7953m.NOT_IN_CALLBACK;
            this.f40699f = this.f40698e;
            if (this.f40704k == 0) {
                return;
            }
            nativeOnRewindSucceeded(this.f40704k);
        }
    }

    public final void mo6591a(Exception exception) {
        synchronized (this.f40703j) {
            m38001a(C7953m.REWIND);
            m38000a((Throwable) exception);
        }
    }

    final void m37999a(Runnable runnable) {
        try {
            this.f40695b.execute(runnable);
        } catch (Throwable th) {
            this.f40697d.m38015a(th);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m37994b() {
        /*
        r6 = this;
        r4 = 0;
        r1 = r6.f40703j;
        monitor-enter(r1);
        r0 = r6.f40705l;	 Catch:{ all -> 0x0018 }
        r2 = org.chromium.net.impl.C7953m.READ;	 Catch:{ all -> 0x0018 }
        if (r0 != r2) goto L_0x0010;
    L_0x000b:
        r0 = 1;
        r6.f40706m = r0;	 Catch:{ all -> 0x0018 }
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
    L_0x000f:
        return;
    L_0x0010:
        r2 = r6.f40704k;	 Catch:{ all -> 0x0018 }
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 != 0) goto L_0x001b;
    L_0x0016:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        goto L_0x000f;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        throw r0;
    L_0x001b:
        r2 = r6.f40704k;	 Catch:{ all -> 0x0018 }
        nativeDestroy(r2);	 Catch:{ all -> 0x0018 }
        r2 = 0;
        r6.f40704k = r2;	 Catch:{ all -> 0x0018 }
        r0 = r6.f40707n;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x002d;
    L_0x0028:
        r0 = r6.f40707n;	 Catch:{ all -> 0x0018 }
        r0.run();	 Catch:{ all -> 0x0018 }
    L_0x002d:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        r0 = new org.chromium.net.impl.l;
        r0.<init>(r6);
        r6.m37999a(r0);
        goto L_0x000f;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUploadDataStream.b():void");
    }

    private final void m37995c() {
        synchronized (this.f40703j) {
            if (this.f40705l == C7953m.READ) {
                throw new IllegalStateException("Method should not be called when read has not completed.");
            }
            if (this.f40706m) {
                m37994b();
            }
        }
    }

    final void m37997a(long j) {
        synchronized (this.f40703j) {
            this.f40704k = nativeAttachUploadDataToRequest(j, this.f40698e);
        }
    }
}
