package org.chromium.net;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.NetworkRequest;
import android.net.NetworkRequest.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import org.chromium.base.ApplicationStatus;
import org.chromium.base.C7888e;

@SuppressLint({"NewApi"})
public class NetworkChangeNotifierAutoDetect extends BroadcastReceiver {
    public final Looper f40577a = Looper.myLooper();
    public final Handler f40578b = new Handler(this.f40577a);
    public final NetworkConnectivityIntentFilter f40579c;
    public final ae f40580d;
    public final af f40581e;
    public C7975w f40582f;
    public ag f40583g;
    public final C7976x f40584h;
    public final NetworkRequest f40585i;
    public boolean f40586j;
    public ad f40587k;
    public boolean f40588l;
    public boolean f40589m;

    @SuppressLint({"NewApi", "ParcelCreator"})
    class NetworkConnectivityIntentFilter extends IntentFilter {
        NetworkConnectivityIntentFilter() {
            addAction("android.net.conn.CONNECTIVITY_CHANGE");
        }
    }

    @TargetApi(21)
    public NetworkChangeNotifierAutoDetect(ae aeVar, af afVar) {
        this.f40580d = aeVar;
        this.f40582f = new C7975w(C7888e.f40514a);
        this.f40583g = new ag(C7888e.f40514a);
        if (VERSION.SDK_INT >= 21) {
            this.f40584h = new C7976x(this);
            this.f40585i = new Builder().addCapability(12).removeCapability(15).build();
        } else {
            this.f40584h = null;
            this.f40585i = null;
        }
        this.f40587k = m37852b();
        this.f40579c = new NetworkConnectivityIntentFilter();
        this.f40588l = false;
        this.f40589m = false;
        this.f40581e = afVar;
        this.f40581e.mo6586a(this);
        this.f40589m = true;
    }

    final void m37851a(Runnable runnable) {
        if ((this.f40577a == Looper.myLooper() ? 1 : null) != null) {
            runnable.run();
        } else {
            this.f40578b.post(runnable);
        }
    }

    public final void m37850a() {
        if (this.f40586j) {
            C7888e.f40514a.unregisterReceiver(this);
            this.f40586j = false;
            if (this.f40584h != null) {
                C7975w c7975w = this.f40582f;
                c7975w.f40954a.unregisterNetworkCallback(this.f40584h);
            }
        }
    }

    public final ad m37852b() {
        NetworkInfo networkInfo;
        C7975w c7975w = this.f40582f;
        ag agVar = this.f40583g;
        NetworkInfo activeNetworkInfo = c7975w.f40954a.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            networkInfo = null;
        } else {
            if (!activeNetworkInfo.isConnected()) {
                if (VERSION.SDK_INT < 21) {
                    networkInfo = null;
                } else if (activeNetworkInfo.getDetailedState() != DetailedState.BLOCKED) {
                    networkInfo = null;
                } else if (ApplicationStatus.getStateForApplication() != 1) {
                    networkInfo = null;
                }
            }
            networkInfo = activeNetworkInfo;
        }
        if (networkInfo == null) {
            return new ad(false, -1, -1, null);
        }
        if (networkInfo.getType() != 1) {
            return new ad(true, networkInfo.getType(), networkInfo.getSubtype(), null);
        }
        if (networkInfo.getExtraInfo() == null || "".equals(networkInfo.getExtraInfo())) {
            return new ad(true, networkInfo.getType(), networkInfo.getSubtype(), agVar.m37939a());
        }
        return new ad(true, networkInfo.getType(), networkInfo.getSubtype(), networkInfo.getExtraInfo());
    }

    @TargetApi(21)
    static Network[] m37849a(C7975w c7975w, Network network) {
        Object[] allNetworks = c7975w.f40954a.getAllNetworks();
        if (allNetworks == null) {
            allNetworks = new Network[0];
        }
        int i = 0;
        for (Network network2 : allNetworks) {
            if (!network2.equals(network)) {
                NetworkCapabilities d = c7975w.m38166d(network2);
                if (d != null && d.hasCapability(12)) {
                    if (!d.hasTransport(4)) {
                        int i2 = i + 1;
                        allNetworks[i] = network2;
                        i = i2;
                    } else if (C7975w.m38163c(network2)) {
                        return new Network[]{network2};
                    }
                }
            }
        }
        return (Network[]) Arrays.copyOf(allNetworks, i);
    }

    static int m37847a(int i, int i2) {
        switch (i) {
            case 0:
                switch (i2) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 3;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return 4;
                    case 13:
                        return 5;
                    default:
                        return 0;
                }
            case 1:
                return 2;
            case 6:
                return 5;
            case 7:
                return 7;
            case 9:
                return 1;
            default:
                return 0;
        }
    }

    public void onReceive(Context context, Intent intent) {
        m37851a(new C7974v(this));
    }

    final void m37853c() {
        ad b = m37852b();
        if (!(b.m37927a() == this.f40587k.m37927a() && b.f40658d.equals(this.f40587k.f40658d))) {
            this.f40580d.mo6643a(b.m37927a());
        }
        if (!(b.m37927a() == this.f40587k.m37927a() && b.m37928b() == this.f40587k.m37928b())) {
            this.f40580d.mo6647b(b.m37928b());
        }
        this.f40587k = b;
    }

    @TargetApi(21)
    static long m37848a(Network network) {
        if (VERSION.SDK_INT >= 23) {
            return network.getNetworkHandle();
        }
        return (long) Integer.parseInt(network.toString());
    }

    static {
        NetworkChangeNotifierAutoDetect.class.getSimpleName();
    }
}
