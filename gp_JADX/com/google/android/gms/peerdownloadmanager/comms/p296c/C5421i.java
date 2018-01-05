package com.google.android.gms.peerdownloadmanager.comms.p296c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pGroup;
import android.net.wifi.p2p.WifiP2pManager;
import android.net.wifi.p2p.WifiP2pManager.Channel;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5406i;
import com.google.android.gms.peerdownloadmanager.comms.p294a.p295a.C5396b;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5448f;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5449g;
import com.google.common.f.a.a;
import com.google.common.f.a.ak;
import com.google.common.f.a.au;
import com.google.common.f.a.ba;
import com.google.common.f.a.bf;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.at;
import com.google.protobuf.ay;
import com.squareup.haha.perflib.HprofParser;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

public final class C5421i implements C5420h {
    public static final byte[] f28064a = new byte[]{(byte) -64, (byte) -88, (byte) 49, (byte) 0};
    public static final int[] f28065b = new int[]{2, HprofParser.ROOT_HEAP_DUMP_INFO};
    public static final IntentFilter f28066c = new IntentFilter("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
    public final Context f28067d;
    public final WifiManager f28068e;
    public final WifiP2pManager f28069f;
    public final Channel f28070g;
    public final C5413a f28071h;
    public final C5396b f28072i;
    public int f28073j = 0;

    private static InetAddress m26236a(int i) {
        try {
            return InetAddress.getByAddress(new byte[]{f28064a[0], f28064a[1], f28064a[2], (byte) (i & HprofParser.ROOT_UNKNOWN)});
        } catch (UnknownHostException e) {
            throw new AssertionError(e);
        }
    }

    public C5421i(Context context, C5413a c5413a, C5396b c5396b) {
        this.f28067d = context.getApplicationContext();
        this.f28068e = (WifiManager) context.getSystemService("wifi");
        this.f28069f = (WifiP2pManager) context.getSystemService("wifip2p");
        this.f28070g = this.f28069f.initialize(context, Looper.getMainLooper(), null);
        this.f28071h = c5413a;
        this.f28072i = c5396b;
    }

    public final au mo5002a() {
        try {
            C5406i.m26186a(this.f28068e, this.f28072i);
            List<WifiConfiguration> configuredNetworks = this.f28068e.getConfiguredNetworks();
            if (configuredNetworks != null) {
                for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                    this.f28068e.disableNetwork(wifiConfiguration.networkId);
                }
            }
            au bfVar = new bf();
            this.f28069f.requestGroupInfo(this.f28070g, new C5423k(bfVar));
            return ak.a(bfVar, new C5426n(this), ba.a);
        } catch (Throwable e) {
            Log.d("WifiHotspotManager", "create: enableWifi interrupted");
            Thread.currentThread().interrupt();
            return ak.a(e);
        } catch (Throwable e2) {
            Log.d("WifiHotspotManager", "create: enableWifi got IOException");
            return ak.a(e2);
        }
    }

    public final au mo5004b() {
        Log.d("WifiHotspotManager", "removeAP: calling removeGroup()");
        au bfVar = new bf();
        this.f28069f.removeGroup(this.f28070g, new C5422j(bfVar));
        return bfVar;
    }

    public final au mo5003a(C5448f c5448f) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        String str = c5448f.f28153a;
        wifiConfiguration.SSID = new StringBuilder(String.valueOf(str).length() + 2).append("\"").append(str).append("\"").toString();
        str = c5448f.f28154b;
        wifiConfiguration.preSharedKey = new StringBuilder(String.valueOf(str).length() + 2).append("\"").append(str).append("\"").toString();
        if (VERSION.SDK_INT >= 14) {
            C5413a c5413a = this.f28071h;
            InetAddress a = C5421i.m26236a(c5448f.f28155c);
            InetAddress a2 = C5421i.m26236a(1);
            if (VERSION.SDK_INT >= 21) {
                c5413a.f28058a.mo5000a(wifiConfiguration, a, a2);
            } else if (VERSION.SDK_INT >= 14) {
                c5413a.f28058a.mo5001b(wifiConfiguration, a, a2);
            } else {
                throw new UnsupportedOperationException("static IP not supported on API " + VERSION.SDK_INT);
            }
        }
        Log.d("WifiHotspotManager", "static IP: not supported");
        try {
            C5406i.m26186a(this.f28068e, this.f28072i);
            Log.d("WifiHotspotManager", "join: enableWifi succeeded");
            r1 = new au[3];
            Log.d("WifiHotspotManager", "disconnectAP: calling disconnect()");
            r1[1] = ak.a(Boolean.valueOf(this.f28068e.disconnect()));
            r1[2] = m26235a(wifiConfiguration);
            return ak.a(ak.a(r1), new C5430r(Boolean.valueOf(false), Boolean.valueOf(true), Boolean.valueOf(true)), ba.a);
        } catch (Throwable e) {
            Log.d("WifiHotspotManager", "join: enableWifi interrupted");
            Thread.currentThread().interrupt();
            return ak.a(e);
        } catch (Throwable e2) {
            Log.d("WifiHotspotManager", "join: enableWifi failed");
            return ak.a(e2);
        }
    }

    private final au m26235a(WifiConfiguration wifiConfiguration) {
        a bfVar = new bf();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        BroadcastReceiver c5424l = new C5424l(wifiConfiguration, bfVar);
        bfVar.a(new C5425m(this, c5424l), ba.a);
        this.f28067d.registerReceiver(c5424l, intentFilter);
        List<WifiConfiguration> configuredNetworks = this.f28068e.getConfiguredNetworks();
        if (configuredNetworks == null) {
            Log.e("WifiHotspotManager", "WifiManager.getConfiguredNetworks #1 failed.");
            bfVar.a(new IOException("WifiManager.getConfiguredNetworks #1 failed."));
            return bfVar;
        }
        int i = -1;
        for (WifiConfiguration wifiConfiguration2 : configuredNetworks) {
            int i2;
            String str = "WifiHotspotManager";
            String str2 = "joinInternal: checking network: ";
            String valueOf = String.valueOf(wifiConfiguration2.SSID);
            Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            if (!wifiConfiguration.SSID.equals(wifiConfiguration2.SSID)) {
                i2 = i;
            } else if (i != -1) {
                str = String.valueOf(wifiConfiguration2);
                Log.d("WifiHotspotManager", new StringBuilder(String.valueOf(str).length() + 47).append("joinInternal: removing extra matching network: ").append(str).toString());
                this.f28068e.removeNetwork(wifiConfiguration2.networkId);
            } else {
                Log.d("WifiHotspotManager", "joinInternal: found matching network, updating password and static IP");
                wifiConfiguration.networkId = wifiConfiguration2.networkId;
                i2 = this.f28068e.updateNetwork(wifiConfiguration);
            }
            i = i2;
        }
        if (i == -1) {
            i = this.f28068e.addNetwork(wifiConfiguration);
            Log.d("WifiHotspotManager", "joinInternal: didn't find matching network, adding one now");
        }
        if (i == -1) {
            Log.e("WifiHotspotManager", "invalid network ID");
            bfVar.a(new IOException("invalid network ID"));
            return bfVar;
        }
        Log.d("WifiHotspotManager", "joinInternal: enableNetwork " + i + " just in case it isn't enabled already");
        if (this.f28068e.enableNetwork(i, true)) {
            Log.d("WifiHotspotManager", "joinInternal: returning result");
            return bfVar;
        }
        Log.d("WifiHotspotManager", "enableNetwork " + i + " failed");
        bfVar.a(new IOException("enableNetwork returned error"));
        return bfVar;
    }

    final C5448f m26238a(WifiP2pGroup wifiP2pGroup) {
        C5449g c5449g = (C5449g) ((com.google.protobuf.au) C5448f.f28151d.a(ay.g, null, null));
        String networkName = wifiP2pGroup.getNetworkName();
        c5449g.b();
        C5448f c5448f = (C5448f) c5449g.b;
        if (networkName == null) {
            throw new NullPointerException();
        }
        c5448f.f28153a = networkName;
        networkName = wifiP2pGroup.getPassphrase();
        c5449g.b();
        c5448f = (C5448f) c5449g.b;
        if (networkName == null) {
            throw new NullPointerException();
        }
        at atVar;
        c5448f.f28154b = networkName;
        int c = m26237c();
        c5449g.b();
        ((C5448f) c5449g.b).f28155c = c;
        if (c5449g.c) {
            atVar = c5449g.b;
        } else {
            at atVar2 = c5449g.b;
            atVar2.a(ay.e, null, null);
            atVar2.h.f = false;
            c5449g.c = true;
            atVar = c5449g.b;
        }
        atVar = atVar;
        if (at.a(atVar, Boolean.TRUE.booleanValue())) {
            return (C5448f) atVar;
        }
        throw new UninitializedMessageException();
    }

    private final synchronized int m26237c() {
        int i;
        int i2;
        int i3;
        i = f28065b[0];
        i2 = (f28065b[1] - i) + 1;
        i3 = this.f28073j;
        this.f28073j = i3 + 1;
        return i + (i3 % i2);
    }
}
