package org.chromium.net.impl;

import java.nio.ByteBuffer;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import org.chromium.base.C7893j;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.net.CronetException;
import org.chromium.net.InlineExecutionProhibitedException;
import org.chromium.net.as;
import org.chromium.net.aw;
import org.chromium.net.impl.VersionSafeCallbacks.UrlRequestStatusListener;

public final class CronetUrlRequest extends bv {
    public final boolean f40708a;
    public long f40709b;
    public boolean f40710c;
    public boolean f40711d;
    public boolean f40712e;
    public final Object f40713f = new Object();
    public final CronetUrlRequestContext f40714g;
    public final Executor f40715h;
    public final List f40716i = new ArrayList();
    public long f40717j;
    public final cg f40718k;
    public final String f40719l;
    public final int f40720m;
    public String f40721n;
    public final C7961u f40722o = new C7961u();
    public final boolean f40723p;
    public final boolean f40724q;
    public CronetUploadDataStream f40725r;
    public bx f40726s;
    public CronetException f40727t;
    public C7949i f40728u;
    public C7962v f40729v;
    public Runnable f40730w;

    CronetUrlRequest(CronetUrlRequestContext cronetUrlRequestContext, String str, int i, aw awVar, Executor executor, boolean z, boolean z2, boolean z3) {
        int i2 = 4;
        if (str == null) {
            throw new NullPointerException("URL is required");
        } else if (awVar == null) {
            throw new NullPointerException("Listener is required");
        } else if (executor == null) {
            throw new NullPointerException("Executor is required");
        } else {
            this.f40708a = z3;
            this.f40714g = cronetUrlRequestContext;
            this.f40719l = str;
            this.f40716i.add(str);
            switch (i) {
                case 0:
                    i2 = 1;
                    break;
                case 1:
                    i2 = 2;
                    break;
                case 2:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 5;
                    break;
            }
            this.f40720m = i2;
            this.f40718k = new cg(awVar);
            this.f40715h = executor;
            this.f40723p = z;
            this.f40724q = z2;
        }
    }

    private final native boolean nativeAddRequestHeader(long j, String str, String str2);

    private final native long nativeCreateRequestAdapter(long j, String str, int i, boolean z, boolean z2, boolean z3);

    private final native void nativeDestroy(long j, boolean z);

    private final native void nativeFollowDeferredRedirect(long j);

    private final native void nativeGetStatus(long j, UrlRequestStatusListener urlRequestStatusListener);

    private final native boolean nativeReadData(long j, ByteBuffer byteBuffer, int i, int i2);

    private final native boolean nativeSetHttpMethod(long j, String str);

    private final native void nativeStart(long j);

    public final void mo6594a(String str) {
        m38009h();
        if (str == null) {
            throw new NullPointerException("Method is required.");
        }
        this.f40721n = str;
    }

    public final void mo6595a(String str, String str2) {
        m38009h();
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        } else if (str2 == null) {
            throw new NullPointerException("Invalid header value.");
        } else {
            this.f40722o.add(new SimpleImmutableEntry(str, str2));
        }
    }

    public final void mo6597a(as asVar, Executor executor) {
        if (asVar == null) {
            throw new NullPointerException("Invalid UploadDataProvider.");
        }
        if (this.f40721n == null) {
            this.f40721n = "POST";
        }
        this.f40725r = new CronetUploadDataStream(asVar, executor, this);
    }

    public final void mo6593a() {
        synchronized (this.f40713f) {
            m38009h();
            try {
                this.f40709b = nativeCreateRequestAdapter(this.f40714g.m38038b(), this.f40719l, this.f40720m, this.f40723p, this.f40724q, this.f40714g.m38037a());
                this.f40714g.f40735d.incrementAndGet();
                if (this.f40721n == null || nativeSetHttpMethod(this.f40709b, this.f40721n)) {
                    Object obj = null;
                    Iterator it = this.f40722o.iterator();
                    while (it.hasNext()) {
                        Object obj2;
                        Entry entry = (Entry) it.next();
                        if (!((String) entry.getKey()).equalsIgnoreCase("Content-Type") || ((String) entry.getValue()).isEmpty()) {
                            obj2 = obj;
                        } else {
                            obj2 = 1;
                        }
                        if (nativeAddRequestHeader(this.f40709b, (String) entry.getKey(), (String) entry.getValue())) {
                            obj = obj2;
                        } else {
                            throw new IllegalArgumentException("Invalid header " + ((String) entry.getKey()) + "=" + ((String) entry.getValue()));
                        }
                    }
                    if (this.f40725r == null) {
                        this.f40710c = true;
                        m38020d();
                        return;
                    } else if (obj == null) {
                        throw new IllegalArgumentException("Requests with upload data must have a Content-Type.");
                    } else {
                        this.f40710c = true;
                        this.f40725r.m37999a(new C7954n(this));
                        return;
                    }
                }
                throw new IllegalArgumentException("Invalid http method " + this.f40721n);
            } catch (RuntimeException e) {
                m38011a(1);
                throw e;
            }
        }
    }

    final void m38020d() {
        nativeStart(this.f40709b);
    }

    public final void mo6598b() {
        synchronized (this.f40713f) {
            if (this.f40711d) {
                this.f40711d = false;
                if (m38021e()) {
                    return;
                }
                nativeFollowDeferredRedirect(this.f40709b);
                return;
            }
            throw new IllegalStateException("No redirect to follow.");
        }
    }

    public final void mo6596a(ByteBuffer byteBuffer) {
        bt.m38105b(byteBuffer);
        bt.m38104a(byteBuffer);
        synchronized (this.f40713f) {
            if (this.f40712e) {
                this.f40712e = false;
                if (m38021e()) {
                    return;
                }
                if (nativeReadData(this.f40709b, byteBuffer, byteBuffer.position(), byteBuffer.limit())) {
                    return;
                } else {
                    this.f40712e = true;
                    throw new IllegalArgumentException("Unable to call native read");
                }
            }
            throw new IllegalStateException("Unexpected read attempt.");
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo6599c() {
        /*
        r2 = this;
        r1 = r2.f40713f;
        monitor-enter(r1);
        r0 = r2.m38021e();	 Catch:{ all -> 0x0015 }
        if (r0 != 0) goto L_0x000d;
    L_0x0009:
        r0 = r2.f40710c;	 Catch:{ all -> 0x0015 }
        if (r0 != 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
    L_0x000e:
        return;
    L_0x000f:
        r0 = 2;
        r2.m38011a(r0);	 Catch:{ all -> 0x0015 }
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        goto L_0x000e;
    L_0x0015:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.net.impl.CronetUrlRequest.c():void");
    }

    final boolean m38021e() {
        return this.f40710c && this.f40709b == 0;
    }

    private final void m38007a(Runnable runnable) {
        try {
            this.f40715h.execute(runnable);
        } catch (Throwable e) {
            C7893j.m37818b(CronetUrlRequestContext.f40731a, "Exception posting task to executor", e);
            m38008a(new CronetExceptionImpl("Exception posting task to executor", e));
        }
    }

    private final bx m38006a(int i, String str, String[] strArr, boolean z, String str2, String str3) {
        List c7961u = new C7961u();
        for (int i2 = 0; i2 < strArr.length; i2 += 2) {
            c7961u.add(new SimpleImmutableEntry(strArr[i2], strArr[i2 + 1]));
        }
        return new bx(new ArrayList(this.f40716i), i, str, c7961u, z, str2, str3);
    }

    private final void m38009h() {
        synchronized (this.f40713f) {
            if (this.f40710c || m38021e()) {
                throw new IllegalStateException("Request is already started.");
            }
        }
    }

    final void m38011a(int i) {
        if (this.f40709b != 0) {
            this.f40714g.f40735d.decrementAndGet();
            nativeDestroy(this.f40709b, i == 2);
            this.f40709b = 0;
        }
    }

    final void m38012a(Exception exception) {
        CronetException callbackExceptionImpl = new CallbackExceptionImpl("Exception received from UrlRequest.Callback", exception);
        C7893j.m37818b(CronetUrlRequestContext.f40731a, "Exception in CalledByNative method", exception);
        m38008a(callbackExceptionImpl);
    }

    final void m38015a(Throwable th) {
        CronetException callbackExceptionImpl = new CallbackExceptionImpl("Exception received from UploadDataProvider", th);
        C7893j.m37818b(CronetUrlRequestContext.f40731a, "Exception in upload method", th);
        m38008a(callbackExceptionImpl);
    }

    private final void m38008a(CronetException cronetException) {
        synchronized (this.f40713f) {
            if (m38021e()) {
                return;
            }
            this.f40727t = cronetException;
            m38011a(1);
        }
    }

    @CalledByNative
    private final void onRedirectReceived(String str, int i, String str2, String[] strArr, boolean z, String str3, String str4, long j) {
        bx a = m38006a(i, str2, strArr, z, str3, str4);
        this.f40717j += j;
        a.m38127a(this.f40717j);
        this.f40716i.add(str);
        m38007a(new C7955o(this, a, str));
    }

    @CalledByNative
    private final void onResponseStarted(int i, String str, String[] strArr, boolean z, String str2, String str3) {
        this.f40726s = m38006a(i, str, strArr, z, str2, str3);
        m38007a(new C7956p(this));
    }

    @CalledByNative
    private final void onReadCompleted(ByteBuffer byteBuffer, int i, int i2, int i3, long j) {
        this.f40726s.m38127a(this.f40717j + j);
        if (byteBuffer.position() == i2 && byteBuffer.limit() == i3) {
            if (this.f40729v == null) {
                this.f40729v = new C7962v(this);
            }
            byteBuffer.position(i2 + i);
            this.f40729v.f40935a = byteBuffer;
            m38007a(this.f40729v);
            return;
        }
        m38008a(new CronetExceptionImpl("ByteBuffer modified externally during read", null));
    }

    @CalledByNative
    private final void onSucceeded(long j) {
        this.f40726s.m38127a(this.f40717j + j);
        m38007a(new C7957q(this));
    }

    @CalledByNative
    private final void onError(int i, int i2, int i3, String str, long j) {
        if (this.f40726s != null) {
            this.f40726s.m38127a(this.f40717j + j);
        }
        if (i == 10) {
            m38008a(new QuicExceptionImpl("Exception in CronetUrlRequest: " + str, i2, i3));
            return;
        }
        switch (i) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            case 5:
                i = 5;
                break;
            case 6:
                i = 6;
                break;
            case 7:
                i = 7;
                break;
            case 8:
                i = 8;
                break;
            case 9:
                i = 9;
                break;
            case 10:
                i = 10;
                break;
            case 11:
                i = 11;
                break;
            default:
                C7893j.m37818b(CronetUrlRequestContext.f40731a, "Unknown error code: " + i, new Object[0]);
                break;
        }
        m38008a(new NetworkExceptionImpl("Exception in CronetUrlRequest: " + str, i, i2));
    }

    @CalledByNative
    private final void onCanceled() {
        m38007a(new C7958r(this));
    }

    @CalledByNative
    private final void onStatus(UrlRequestStatusListener urlRequestStatusListener, int i) {
        m38007a(new C7959s(urlRequestStatusListener, i));
    }

    @CalledByNative
    private final void onMetricsCollected(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, boolean z, long j14, long j15) {
        synchronized (this.f40713f) {
            if (this.f40728u != null) {
                throw new IllegalStateException("Metrics collection should only happen once.");
            }
            this.f40728u = new C7949i(j, j12, j13, j14, j15);
        }
    }

    @CalledByNative
    private final void onNativeAdapterDestroyed() {
        synchronized (this.f40713f) {
            if (this.f40730w != null) {
                this.f40730w.run();
            }
            if (this.f40727t == null) {
                return;
            }
            try {
                this.f40715h.execute(new C7960t(this));
            } catch (RejectedExecutionException e) {
                C7893j.m37818b(CronetUrlRequestContext.f40731a, "Exception posting task to executor", e);
            }
        }
    }

    final void m38022f() {
        if (!this.f40708a) {
            if ((Thread.currentThread() == this.f40714g.f40737f ? 1 : null) != null) {
                throw new InlineExecutionProhibitedException();
            }
        }
    }

    final void m38023g() {
        if (this.f40728u != null) {
            CronetUrlRequestContext cronetUrlRequestContext = this.f40714g;
            bu buVar = new bu();
            cronetUrlRequestContext.m38039c();
        }
    }
}
