package org.chromium.net;

import android.annotation.SuppressLint;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import java.util.ArrayList;
import java.util.Iterator;
import org.chromium.base.C7895l;
import org.chromium.base.annotations.CalledByNative;

public class NetworkChangeNotifier {
    @SuppressLint({"StaticFieldLeak"})
    public static NetworkChangeNotifier f40572e;
    public final ArrayList f40573a = new ArrayList();
    public final C7895l f40574b = new C7895l();
    public NetworkChangeNotifierAutoDetect f40575c;
    public int f40576d = 0;

    protected NetworkChangeNotifier() {
    }

    private native void nativeNotifyConnectionTypeChanged(long j, int i, long j2);

    private native void nativeNotifyMaxBandwidthChanged(long j, int i);

    private native void nativeNotifyOfNetworkConnect(long j, long j2, int i);

    private native void nativeNotifyOfNetworkDisconnect(long j, long j2);

    private native void nativeNotifyOfNetworkSoonToDisconnect(long j, long j2);

    private native void nativeNotifyPurgeActiveNetworkList(long j, long[] jArr);

    @CalledByNative
    public static NetworkChangeNotifier init() {
        if (f40572e == null) {
            f40572e = new NetworkChangeNotifier();
        }
        return f40572e;
    }

    @CalledByNative
    public int getCurrentConnectionType() {
        return this.f40576d;
    }

    @CalledByNative
    public int getCurrentConnectionSubtype() {
        if (this.f40575c == null) {
            return 0;
        }
        return this.f40575c.m37852b().m37928b();
    }

    @CalledByNative
    public long getCurrentDefaultNetId() {
        long j = -1;
        if (this.f40575c != null) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f40575c;
            if (VERSION.SDK_INT >= 21) {
                C7975w c7975w = networkChangeNotifierAutoDetect.f40582f;
                NetworkInfo activeNetworkInfo = c7975w.f40954a.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    for (Network network : NetworkChangeNotifierAutoDetect.m37849a(c7975w, null)) {
                        NetworkInfo a = c7975w.m38164a(network);
                        if (a != null && (a.getType() == activeNetworkInfo.getType() || a.getType() == 17)) {
                            j = NetworkChangeNotifierAutoDetect.m37848a(network);
                        }
                    }
                }
            }
        }
        return j;
    }

    @CalledByNative
    public long[] getCurrentNetworksAndTypes() {
        int i = 0;
        if (this.f40575c == null) {
            return new long[0];
        }
        NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f40575c;
        if (VERSION.SDK_INT < 21) {
            return new long[0];
        }
        Network[] a = NetworkChangeNotifierAutoDetect.m37849a(networkChangeNotifierAutoDetect.f40582f, null);
        long[] jArr = new long[(a.length * 2)];
        int length = a.length;
        int i2 = 0;
        while (i < length) {
            Network network = a[i];
            int i3 = i2 + 1;
            jArr[i2] = NetworkChangeNotifierAutoDetect.m37848a(network);
            i2 = i3 + 1;
            jArr[i3] = (long) networkChangeNotifierAutoDetect.f40582f.m38165b(network);
            i++;
        }
        return jArr;
    }

    @CalledByNative
    public void addNativeObserver(long j) {
        this.f40573a.add(Long.valueOf(j));
    }

    @CalledByNative
    public void removeNativeObserver(long j) {
        this.f40573a.remove(Long.valueOf(j));
    }

    private static void m37838a() {
        f40572e.m37843a(false, new ao());
    }

    public final void m37843a(boolean z, af afVar) {
        if (z) {
            if (this.f40575c == null) {
                this.f40575c = new NetworkChangeNotifierAutoDetect(new C7972t(this), afVar);
                ad b = this.f40575c.m37852b();
                m37840a(b.m37927a());
                m37845b(b.m37928b());
            }
        } else if (this.f40575c != null) {
            NetworkChangeNotifierAutoDetect networkChangeNotifierAutoDetect = this.f40575c;
            networkChangeNotifierAutoDetect.f40581e.mo6587b();
            networkChangeNotifierAutoDetect.m37850a();
            this.f40575c = null;
        }
    }

    @CalledByNative
    public static void forceConnectivityState(boolean z) {
        int i = 6;
        int i2 = 0;
        m37838a();
        NetworkChangeNotifier networkChangeNotifier = f40572e;
        if ((networkChangeNotifier.f40576d != 6) != z) {
            if (z) {
                i = 0;
            }
            networkChangeNotifier.m37840a(i);
            if (!z) {
                i2 = 1;
            }
            networkChangeNotifier.m37845b(i2);
        }
    }

    @CalledByNative
    public static void fakeNetworkConnected(long j, int i) {
        m37838a();
        f40572e.m37842a(j, i);
    }

    @CalledByNative
    public static void fakeNetworkSoonToBeDisconnected(long j) {
        m37838a();
        f40572e.m37841a(j);
    }

    @CalledByNative
    public static void fakeNetworkDisconnected(long j) {
        m37838a();
        f40572e.m37846b(j);
    }

    @CalledByNative
    public static void fakePurgeActiveNetworkList(long[] jArr) {
        m37838a();
        f40572e.m37844a(jArr);
    }

    @CalledByNative
    public static void fakeDefaultNetwork(long j, int i) {
        m37838a();
        f40572e.m37839a(i, j);
    }

    @CalledByNative
    public static void fakeConnectionSubtypeChanged(int i) {
        m37838a();
        f40572e.m37845b(i);
    }

    final void m37840a(int i) {
        this.f40576d = i;
        m37839a(i, getCurrentDefaultNetId());
    }

    private final void m37839a(int i, long j) {
        ArrayList arrayList = this.f40573a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            nativeNotifyConnectionTypeChanged(((Long) arrayList.get(i2)).longValue(), i, j);
            i2 = i3;
        }
        Iterator it = this.f40574b.iterator();
        while (it.hasNext()) {
            ((C7973u) it.next()).m38162a();
        }
    }

    final void m37845b(int i) {
        ArrayList arrayList = this.f40573a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            nativeNotifyMaxBandwidthChanged(((Long) obj).longValue(), i);
        }
    }

    final void m37842a(long j, int i) {
        ArrayList arrayList = this.f40573a;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            nativeNotifyOfNetworkConnect(((Long) arrayList.get(i2)).longValue(), j, i);
            i2 = i3;
        }
    }

    final void m37841a(long j) {
        ArrayList arrayList = this.f40573a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nativeNotifyOfNetworkSoonToDisconnect(((Long) obj).longValue(), j);
        }
    }

    final void m37846b(long j) {
        ArrayList arrayList = this.f40573a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nativeNotifyOfNetworkDisconnect(((Long) obj).longValue(), j);
        }
    }

    final void m37844a(long[] jArr) {
        ArrayList arrayList = this.f40573a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            nativeNotifyPurgeActiveNetworkList(((Long) obj).longValue(), jArr);
        }
    }
}
