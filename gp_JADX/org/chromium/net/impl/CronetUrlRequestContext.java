package org.chromium.net.impl;

import android.os.ConditionVariable;
import android.os.Process;
import android.util.Log;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.chromium.base.C7893j;
import org.chromium.base.C7895l;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.annotations.UsedByReflection;
import org.chromium.net.aw;
import org.chromium.net.p568a.C7923g;

@UsedByReflection
public class CronetUrlRequestContext extends C7939d {
    public static final String f40731a = CronetUrlRequestContext.class.getSimpleName();
    public static final HashSet f40732o = new HashSet();
    public final Object f40733b = new Object();
    public final ConditionVariable f40734c = new ConditionVariable(false);
    public final AtomicInteger f40735d = new AtomicInteger(0);
    public long f40736e = 0;
    public Thread f40737f;
    public final int f40738g;
    public final Object f40739h = new Object();
    public final Object f40740i = new Object();
    public final C7895l f40741j = new C7895l();
    public final C7895l f40742k = new C7895l();
    public final Map f40743l = new HashMap();
    public ConditionVariable f40744m = new ConditionVariable();
    public volatile ConditionVariable f40745n;
    public final String f40746p;

    @UsedByReflection
    public CronetUrlRequestContext(C7942e c7942e) {
        int i = 3;
        boolean z = c7942e.f40771o;
        this.f40738g = c7942e.m38058a(10);
        CronetLibraryLoader.m37992a(c7942e.f40757a, c7942e);
        if (Log.isLoggable(f40731a, 2)) {
            i = -2;
        } else if (Log.isLoggable(f40731a, 3)) {
            i = -1;
        }
        nativeSetMinLogLevel(i);
        if (c7942e.f40767k == 1) {
            this.f40746p = c7942e.f40762f;
            synchronized (f40732o) {
                if (f40732o.add(this.f40746p)) {
                } else {
                    throw new IllegalStateException("Disk cache storage path already in use");
                }
            }
        }
        this.f40746p = null;
        synchronized (this.f40733b) {
            this.f40736e = nativeCreateRequestContextAdapter(m38030a(c7942e));
            if (this.f40736e == 0) {
                throw new NullPointerException("Context Adapter creation failed.");
            }
        }
        CronetLibraryLoader.m37993a(new C7963w(this));
    }

    private static native void nativeAddPkp(long j, String str, byte[][] bArr, boolean z, long j2);

    private static native void nativeAddQuicHint(long j, String str, int i, int i2);

    private native void nativeConfigureNetworkQualityEstimatorForTesting(long j, boolean z, boolean z2, boolean z3);

    private static native long nativeCreateRequestContextAdapter(long j);

    private static native long nativeCreateRequestContextConfig(String str, String str2, boolean z, String str3, boolean z2, boolean z3, boolean z4, int i, long j, String str4, long j2, boolean z5, boolean z6, String str5);

    private native void nativeDestroy(long j);

    private native void nativeGetCertVerifierData(long j);

    private static native byte[] nativeGetHistogramDeltas();

    private native void nativeInitRequestContextOnInitThread(long j);

    private native void nativeProvideRTTObservations(long j, boolean z);

    private native void nativeProvideThroughputObservations(long j, boolean z);

    private static native int nativeSetMinLogLevel(int i);

    private native void nativeStartNetLogToDisk(long j, String str, boolean z, int i);

    private native boolean nativeStartNetLogToFile(long j, String str, boolean z);

    private native void nativeStopNetLog(long j);

    private static long m38030a(C7942e c7942e) {
        long nativeCreateRequestContextConfig = nativeCreateRequestContextConfig(c7942e.f40761e, c7942e.f40762f, c7942e.f40763g, c7942e.f40763g ? bz.m38133b(c7942e.f40757a) : "", c7942e.f40764h, c7942e.f40765i, c7942e.f40766j, c7942e.f40767k, c7942e.f40768l, c7942e.f40769m, c7942e.f40770n, c7942e.f40771o, c7942e.f40760d, c7942e.f40772p);
        for (C7947g c7947g : c7942e.f40758b) {
            nativeAddQuicHint(nativeCreateRequestContextConfig, c7947g.f40914a, c7947g.f40915b, c7947g.f40916c);
        }
        for (C7946f c7946f : c7942e.f40759c) {
            nativeAddPkp(nativeCreateRequestContextConfig, c7946f.f40910a, c7946f.f40911b, c7946f.f40912c, c7946f.f40913d.getTime());
        }
        return nativeCreateRequestContextConfig;
    }

    public final bv mo6604a(String str, aw awVar, Executor executor, int i, boolean z, boolean z2, boolean z3) {
        bv cronetUrlRequest;
        synchronized (this.f40733b) {
            m38033d();
            cronetUrlRequest = new CronetUrlRequest(this, str, i, awVar, executor, z, z2, z3);
        }
        return cronetUrlRequest;
    }

    @CalledByNative
    public void stopNetLogCompleted() {
        this.f40745n.open();
    }

    final boolean m38037a() {
        boolean z;
        synchronized (this.f40740i) {
            z = !this.f40743l.isEmpty();
        }
        return z;
    }

    public final URLConnection mo6602a(URL url) {
        return mo6603a(url, Proxy.NO_PROXY);
    }

    public final URLConnection mo6603a(URL url, Proxy proxy) {
        if (proxy.type() != Type.DIRECT) {
            throw new UnsupportedOperationException();
        }
        String protocol = url.getProtocol();
        if ("http".equals(protocol) || "https".equals(protocol)) {
            return new C7923g(url, this);
        }
        throw new UnsupportedOperationException("Unexpected protocol:" + protocol);
    }

    public final long m38038b() {
        long j;
        synchronized (this.f40733b) {
            m38033d();
            j = this.f40736e;
        }
        return j;
    }

    private final void m38033d() {
        if ((this.f40736e != 0 ? 1 : null) == null) {
            throw new IllegalStateException("Engine is shut down.");
        }
    }

    @CalledByNative
    private void initNetworkThread() {
        this.f40737f = Thread.currentThread();
        this.f40734c.open();
        Thread.currentThread().setName("ChromiumNet");
        Process.setThreadPriority(this.f40738g);
    }

    @CalledByNative
    private void onEffectiveConnectionTypeChanged(int i) {
        synchronized (this.f40739h) {
        }
    }

    @CalledByNative
    private void onRTTOrThroughputEstimatesComputed(int i, int i2, int i3) {
        synchronized (this.f40739h) {
        }
    }

    @CalledByNative
    private void onRttObservation(int i, long j, int i2) {
        synchronized (this.f40739h) {
            Iterator it = this.f40741j.iterator();
            while (it.hasNext()) {
                cc ccVar = (cc) it.next();
                m38031a(ccVar.mo6632a(), new C7964x(ccVar));
            }
        }
    }

    @CalledByNative
    private void onThroughputObservation(int i, long j, int i2) {
        synchronized (this.f40739h) {
            Iterator it = this.f40742k.iterator();
            while (it.hasNext()) {
                cd cdVar = (cd) it.next();
                m38031a(cdVar.mo6634a(), new C7965y(cdVar));
            }
        }
    }

    @CalledByNative
    private void onGetCertVerifierData(String str) {
        this.f40744m.open();
    }

    final void m38039c() {
        ArrayList arrayList;
        synchronized (this.f40740i) {
            arrayList = new ArrayList(this.f40743l.values());
        }
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ce ceVar = (ce) obj;
            m38031a(ceVar.mo6637b(), new C7966z(ceVar));
        }
    }

    private static void m38031a(Executor executor, Runnable runnable) {
        try {
            executor.execute(runnable);
        } catch (RejectedExecutionException e) {
            C7893j.m37818b(f40731a, "Exception posting task to executor", e);
        }
    }
}
