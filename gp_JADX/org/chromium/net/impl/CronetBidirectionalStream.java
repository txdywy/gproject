package org.chromium.net.impl;

import java.nio.ByteBuffer;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.C7936j;
import org.chromium.net.ar;

public class CronetBidirectionalStream extends C7936j {
    public final CronetUrlRequestContext f40682a;
    public final ca f40683b;
    public final Object f40684c;
    public ar f40685d;
    public bx f40686e;

    private native long nativeCreateBidirectionalStream(long j, boolean z, boolean z2);

    private native void nativeDestroy(long j, boolean z);

    private native boolean nativeReadData(long j, ByteBuffer byteBuffer, int i, int i2);

    private native void nativeSendRequestHeaders(long j);

    private native int nativeStart(long j, String str, int i, String str2, String[] strArr, boolean z);

    private native boolean nativeWritevData(long j, ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z);

    @CalledByNative
    private void onStreamReady(boolean z) {
        C7940a c7940a = new C7940a(this);
        throw new NoSuchMethodError();
    }

    @CalledByNative
    private void onResponseHeadersReceived(int i, String str, String[] strArr, long j) {
        try {
            throw new NoSuchMethodError();
        } catch (Exception e) {
            CronetExceptionImpl cronetExceptionImpl = new CronetExceptionImpl("Cannot prepare ResponseInfo", null);
            throw new NoSuchMethodError();
        }
    }

    @CalledByNative
    private void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.f40686e.m38127a(j);
        CronetExceptionImpl cronetExceptionImpl;
        if (byteBuffer.position() != i2 || byteBuffer.limit() != i3) {
            cronetExceptionImpl = new CronetExceptionImpl("ByteBuffer modified externally during read", null);
            throw new NoSuchMethodError();
        } else if (i < 0 || i2 + i > i3) {
            cronetExceptionImpl = new CronetExceptionImpl("Invalid number of bytes read", null);
            throw new NoSuchMethodError();
        } else {
            byteBuffer.position(i2 + i);
            throw new NoSuchMethodError();
        }
    }

    @CalledByNative
    private void onWritevCompleted(ByteBuffer[] byteBufferArr, int[] iArr, int[] iArr2, boolean z) {
        synchronized (this.f40684c) {
            throw new NoSuchMethodError();
        }
    }

    @CalledByNative
    private void onResponseTrailersReceived(String[] strArr) {
        by byVar = new by(m37990a(strArr));
        C7943b c7943b = new C7943b(this);
        throw new NoSuchMethodError();
    }

    @CalledByNative
    private void onError(int i, int i2, int i3, String str, long j) {
        if (this.f40686e != null) {
            this.f40686e.m38127a(j);
        }
        if (i == 10) {
            QuicExceptionImpl quicExceptionImpl = new QuicExceptionImpl("Exception in BidirectionalStream: " + str, i2, i3);
            throw new NoSuchMethodError();
        } else {
            BidirectionalStreamNetworkException bidirectionalStreamNetworkException = new BidirectionalStreamNetworkException("Exception in BidirectionalStream: " + str, i, i2);
            throw new NoSuchMethodError();
        }
    }

    @CalledByNative
    private void onCanceled() {
        C7945c c7945c = new C7945c(this);
        throw new NoSuchMethodError();
    }

    @CalledByNative
    private void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        synchronized (this.f40684c) {
            if (this.f40685d != null) {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
            this.f40685d = new C7949i(j, j12, j13, j14, j15);
            bu buVar = new bu();
            this.f40682a.m38039c();
        }
    }

    private static ArrayList m37990a(String[] strArr) {
        ArrayList arrayList = new ArrayList(strArr.length / 2);
        for (int i = 0; i < strArr.length; i += 2) {
            arrayList.add(new SimpleImmutableEntry(strArr[i], strArr[i + 1]));
        }
        return arrayList;
    }
}
