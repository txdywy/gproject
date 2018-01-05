package com.google.android.gms.peerdownloadmanager.comms.p291b;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.provider.Settings.Secure;
import android.util.Log;
import com.google.android.gms.peerdownloadmanager.common.C5378i;
import com.google.android.gms.peerdownloadmanager.common.aa;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5400g;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5401c;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5402d;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5403e;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5404f;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5405h;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5406i;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5407j;
import com.google.android.gms.peerdownloadmanager.comms.rpc.C5465h;
import com.google.android.gms.peerdownloadmanager.comms.rpc.C5466i;
import com.google.android.gms.peerdownloadmanager.comms.rpc.C5474r;
import com.google.android.gms.peerdownloadmanager.comms.rpc.C5475s;
import com.google.android.gms.peerdownloadmanager.comms.rpc.CommsRunnable;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5446d;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5447e;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5448f;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5454l;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5456n;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5457o;
import com.google.android.gms.peerdownloadmanager.p301e.C5485a;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.at;
import com.google.protobuf.au;
import com.google.protobuf.ay;
import com.google.protobuf.bf;
import java.io.Closeable;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@TargetApi(16)
public final class C5410a implements C5404f, C5409d {
    public static final long f28038a = TimeUnit.SECONDS.toMillis(5);
    public static final long f28039b = TimeUnit.SECONDS.toMillis(20);
    public static final long f28040c = TimeUnit.SECONDS.toMillis(2);
    public final C5485a f28041d;
    public final Context f28042e;
    public final C5407j f28043f;
    public final boolean f28044g;
    public final BluetoothAdapter f28045h;
    public final int f28046i;
    public final boolean f28047j;
    public final String f28048k;
    public C5353e f28049l;
    public final Object f28050m = new Object();
    public Boolean f28051n = Boolean.valueOf(false);
    public Method f28052o;
    public volatile int f28053p;
    public volatile boolean f28054q;
    public final BroadcastReceiver f28055r = new C5411b(this);

    public C5410a(C5485a c5485a, Context context, int i, C5407j c5407j, boolean z) {
        boolean z2 = true;
        this.f28041d = c5485a;
        this.f28042e = context;
        this.f28043f = c5407j;
        this.f28044g = z;
        this.f28045h = BluetoothAdapter.getDefaultAdapter();
        if (i != 0) {
            z2 = false;
        }
        this.f28047j = z2;
        if (this.f28047j) {
            i = 120;
        }
        this.f28046i = i;
        this.f28048k = Secure.getString(context.getContentResolver(), "bluetooth_address");
        if (this.f28048k == null) {
            Log.w("BluetoothDiscovery", "unable to determine local MAC");
        }
        try {
            this.f28052o = BluetoothAdapter.class.getMethod("setScanMode", new Class[]{Integer.TYPE, Integer.TYPE});
        } catch (Throwable e) {
            Log.e("BluetoothDiscovery", "Couldn't find setScanMode.", e);
        }
    }

    public final void mo4992c() {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.device.action.UUID");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        intentFilter.addAction("android.bluetooth.adapter.action.SCAN_MODE_CHANGED");
        Log.d("BluetoothDiscovery", "Registering BluetoothReceiver.");
        this.f28042e.registerReceiver(this.f28055r, intentFilter, null, new Handler(Looper.myLooper()));
    }

    public final synchronized void mo4993d() {
        Log.d("BluetoothDiscovery", "Discovery stopped.");
        synchronized (this.f28050m) {
            if (this.f28051n.booleanValue()) {
            } else {
                this.f28051n = Boolean.valueOf(true);
                this.f28042e.unregisterReceiver(this.f28055r);
                this.f28045h.cancelDiscovery();
                if (!m26207a(21, 0)) {
                    Log.e("BluetoothDiscovery", "Failed to set scan mode to SCAN_MODE_CONNECTABLE.");
                }
            }
        }
    }

    public final void mo4994e() {
    }

    public final void mo4990a(C5353e c5353e) {
        this.f28049l = c5353e;
    }

    static void m26206a(Intent intent) {
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.bluetooth.device.extra.UUID");
        String valueOf = String.valueOf(intent.getExtras());
        Log.v("BluetoothDiscovery", new StringBuilder(String.valueOf(valueOf).length() + 24).append("BluetoothDevice action: ").append(valueOf).toString());
        if (parcelableArrayExtra != null) {
            for (Object obj : parcelableArrayExtra) {
                Log.v("BluetoothDiscovery", obj.toString());
            }
        }
    }

    public final boolean mo4995f() {
        Log.d("BluetoothDiscovery", "discover(): making this device discoverable and start scanning for peers");
        if (!m26220g()) {
            return false;
        }
        new Handler(Looper.myLooper()).postDelayed(new C5412c(this), f28038a + ((long) (Math.random() * ((double) f28039b))));
        return true;
    }

    final boolean m26220g() {
        if (m26207a(23, this.f28046i)) {
            return true;
        }
        Log.e("BluetoothDiscovery", "Failed to set scan mode to SCAN_MODE_CONNECTABLE_DISCOVERABLE.");
        return false;
    }

    private final boolean m26207a(int i, int i2) {
        try {
            if (this.f28052o != null) {
                if (((Boolean) this.f28052o.invoke(this.f28045h, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)})).booleanValue()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable e) {
            Log.e("BluetoothDiscovery", "setScanMode failed.", e);
            return false;
        }
    }

    public final String mo4996h() {
        return this.f28048k;
    }

    public final void mo4997i() {
    }

    public final C5404f mo4998j() {
        return this;
    }

    public final C5403e mo4987a(C5400g c5400g) {
        if (c5400g instanceof C5401c) {
            return new C5466i((C5401c) c5400g);
        }
        String str = "BluetoothDiscovery";
        String str2 = "Expected BluetoothSocketPeer. Got ";
        String valueOf = String.valueOf(c5400g.getClass().getName());
        Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        return null;
    }

    public final C5402d mo4986a() {
        return new C5465h();
    }

    public final C5454l mo4991b() {
        at atVar;
        C5456n c5456n = (C5456n) ((au) C5454l.f28167d.a(ay.g, null, null));
        c5456n.m26323a(C5457o.REUSE_CONN);
        if (this.f28044g) {
            c5456n.m26323a(C5457o.WIFI_HOTSPOT);
        }
        if (c5456n.c) {
            atVar = c5456n.b;
        } else {
            at atVar2 = c5456n.b;
            atVar2.a(ay.e, null, null);
            atVar2.h.f = false;
            c5456n.c = true;
            atVar = c5456n.b;
        }
        atVar = atVar;
        if (at.a(atVar, Boolean.TRUE.booleanValue())) {
            return (C5454l) atVar;
        }
        throw new UninitializedMessageException();
    }

    public final C5457o mo4989a(C5454l c5454l) {
        Object obj = null;
        Object obj2 = null;
        for (C5457o c5457o : new bf(c5454l.f28169a, C5454l.f28166b)) {
            switch (c5457o.ordinal()) {
                case 1:
                    obj2 = 1;
                    break;
                case 3:
                    obj = 1;
                    break;
                default:
                    String valueOf = String.valueOf(c5457o);
                    throw new IOException(new StringBuilder(String.valueOf(valueOf).length() + 81).append("mismatching TransferType, other side wants ").append(valueOf).append(" and this side supports WIFI and REUSE").toString());
            }
        }
        if (this.f28044g && r1 != null) {
            return C5457o.WIFI_HOTSPOT;
        }
        if (obj2 != null) {
            return C5457o.REUSE_CONN;
        }
        throw new IOException("unable to reconcile supported transfer types with peer");
    }

    public final C5403e mo4988a(CommsRunnable commsRunnable, C5403e c5403e) {
        InterruptedException e;
        C5457o c5457o = commsRunnable.f28118E;
        String d = commsRunnable.mo5008d();
        String valueOf = String.valueOf(c5457o);
        Log.d("BluetoothDiscovery", new StringBuilder((String.valueOf(d).length() + 29) + String.valueOf(valueOf).length()).append(d).append("upgradeSocketBandwidth: type ").append(valueOf).toString());
        if (c5457o == C5457o.REUSE_CONN) {
            return c5403e;
        }
        if (c5457o == C5457o.WIFI_HOTSPOT) {
            try {
                commsRunnable.m26278a("acquireTransferLock");
                if (commsRunnable.f28126u) {
                    Log.d("CommsRunnable", String.valueOf(commsRunnable.mo5008d()).concat("acquireTransferLock: MASTER locking..."));
                    commsRunnable.f28129x.readLock().lock();
                    Log.d("CommsRunnable", String.valueOf(commsRunnable.mo5008d()).concat("acquireTransferLock: MASTER locked"));
                } else {
                    Log.d("CommsRunnable", String.valueOf(commsRunnable.mo5008d()).concat("acquireTransferLock: SERVER locking..."));
                    commsRunnable.f28129x.writeLock().lock();
                    Log.d("CommsRunnable", String.valueOf(commsRunnable.mo5008d()).concat("acquireTransferLock: SERVER locked"));
                }
                try {
                    C5475s c;
                    if (commsRunnable.f28126u) {
                        c = m26209c(commsRunnable, c5403e);
                    } else {
                        c = m26208b(commsRunnable, c5403e);
                    }
                    c.f28219d.set(commsRunnable);
                    return c;
                } catch (TimeoutException e2) {
                    e = e2;
                    commsRunnable.m26286g();
                    throw e;
                } catch (IOException e3) {
                    e = e3;
                    commsRunnable.m26286g();
                    throw e;
                } catch (InterruptedException e4) {
                    e = e4;
                    commsRunnable.m26286g();
                    throw e;
                }
            } finally {
                aa.m26135a(c5403e);
            }
        } else {
            aa.m26135a(c5403e);
            String valueOf2 = String.valueOf(c5457o);
            throw new IOException(new StringBuilder(String.valueOf(valueOf2).length() + 27).append("unsupported transfer type: ").append(valueOf2).toString());
        }
    }

    private final C5475s m26208b(CommsRunnable commsRunnable, C5403e c5403e) {
        Closeable c5475s;
        Log.d("BluetoothDiscovery", String.valueOf(commsRunnable.mo5008d()).concat("getDataTransferSocket: setting up network as AP joiner"));
        commsRunnable.m26282b("read hotspot details");
        C5448f c5448f = (C5448f) C5406i.m26183a((C5448f) C5448f.a(C5448f.f28151d, c5403e.mo5018a()));
        String d = commsRunnable.mo5008d();
        String str = c5448f.f28153a;
        String str2 = c5448f.f28154b;
        Log.d("BluetoothDiscovery", new StringBuilder(((String.valueOf(d).length() + 46) + String.valueOf(str).length()) + String.valueOf(str2).length()).append(d).append("getDataTransferSocket: read hotspotDetails: ").append(str).append(", ").append(str2).toString());
        commsRunnable.m26278a("useNetwork");
        this.f28043f.m26195a(c5448f);
        Log.d("BluetoothDiscovery", String.valueOf(commsRunnable.mo5008d()).concat("getDataTransferSocket: set up network as the client"));
        commsRunnable.m26282b("read endpoint");
        C5446d c5446d = (C5446d) C5406i.m26183a((C5446d) C5446d.a(C5446d.f28147c, c5403e.mo5018a()));
        d = commsRunnable.mo5008d();
        str = c5446d.f28149a;
        Log.d("BluetoothDiscovery", new StringBuilder((String.valueOf(d).length() + 50) + String.valueOf(str).length()).append(d).append("getDataTransferSocket: read Endpoint: ").append(str).append(":").append(c5446d.f28150b).toString());
        C5405h c5405h = new C5405h(c5446d.f28149a, c5446d.f28150b);
        Log.d("BluetoothDiscovery", String.valueOf(commsRunnable.mo5008d()).concat("getDataTransferSocket: creating socket for peer"));
        int i = 0;
        while (true) {
            commsRunnable.m26282b("waiting to open the socket");
            Thread.sleep(f28040c);
            c5475s = new C5475s(c5405h);
            try {
                commsRunnable.m26282b("opening transfer socket");
                c5475s.mo5020c();
                Log.d("BluetoothDiscovery", String.valueOf(commsRunnable.mo5008d()).concat("getDataTransferSocket: successfully opened a client socket"));
                break;
            } catch (Throwable e) {
                Throwable th = e;
                aa.m26135a(c5475s);
                int i2 = i + 1;
                if (i2 >= 5) {
                    d = commsRunnable.mo5008d();
                    Log.d("BluetoothDiscovery", new StringBuilder(String.valueOf(d).length() + 111).append(d).append("getDataTransferSocket: got an IOException while connecting, try ").append(i2).append(", giving up and rethrowing exception").toString(), th);
                    throw th;
                }
                str = commsRunnable.mo5008d();
                Log.d("BluetoothDiscovery", new StringBuilder(String.valueOf(str).length() + 75).append(str).append("getDataTransferSocket: got an IOException while connecting, try ").append(i2).toString());
                i = i2;
            }
        }
        return c5475s;
    }

    private final C5475s m26209c(CommsRunnable commsRunnable, C5403e c5403e) {
        Log.d("BluetoothDiscovery", String.valueOf(commsRunnable.mo5008d()).concat("upgradeSocketBandwidthHotspot: setting up network as AP creator"));
        commsRunnable.m26282b("setupNetwork");
        C5407j c5407j = this.f28043f;
        Log.d("NetworkCtrlDelegate", "setupNetwork: WIFI_HOTSPOT");
        C5448f c5448f = (C5448f) C5378i.m26141a(c5407j.f28033c.mo5002a(), IOException.class);
        Log.d("BluetoothDiscovery", String.valueOf(commsRunnable.mo5008d()).concat("upgradeSocketBandwidthHotspot: set up network"));
        commsRunnable.m26282b("send hotspotDetails");
        OutputStream b = c5403e.mo5019b();
        int a = c5448f.a();
        CodedOutputStream a2 = CodedOutputStream.a(b, CodedOutputStream.a(CodedOutputStream.s(a) + a));
        a2.c(a);
        c5448f.a(a2);
        a2.h();
        b.flush();
        Log.d("BluetoothDiscovery", String.valueOf(commsRunnable.mo5008d()).concat("upgradeSocketBandwidthHotspot: wrote hotspotDetails"));
        commsRunnable.m26282b("create server socket");
        Closeable c5474r = new C5474r();
        commsRunnable.f28120G.add(c5474r);
        try {
            String d = commsRunnable.mo5008d();
            String valueOf = String.valueOf(c5474r);
            Log.d("BluetoothDiscovery", new StringBuilder((String.valueOf(d).length() + 53) + String.valueOf(valueOf).length()).append(d).append("upgradeSocketBandwidthHotspot: created server socket ").append(valueOf).toString());
            commsRunnable.m26282b("bind to server socket");
            c5474r.mo5017c();
            d = commsRunnable.mo5008d();
            valueOf = String.valueOf(c5474r);
            Log.d("BluetoothDiscovery", new StringBuilder((String.valueOf(d).length() + 54) + String.valueOf(valueOf).length()).append(d).append("upgradeSocketBandwidthHotspot: bound to server socket ").append(valueOf).toString());
            commsRunnable.m26282b("write endpoint");
            valueOf = c5474r.f28215a.getInetAddress().getHostAddress();
            int localPort = c5474r.f28215a.getLocalPort();
            OutputStream b2 = c5403e.mo5019b();
            C5447e c5447e = (C5447e) ((au) C5446d.f28147c.a(ay.g, null, null));
            c5447e.b();
            C5446d c5446d = (C5446d) c5447e.b;
            if (valueOf == null) {
                throw new NullPointerException();
            }
            at atVar;
            c5446d.f28149a = valueOf;
            c5447e.b();
            ((C5446d) c5447e.b).f28150b = localPort;
            if (c5447e.c) {
                atVar = c5447e.b;
            } else {
                at atVar2 = c5447e.b;
                atVar2.a(ay.e, null, null);
                atVar2.h.f = false;
                c5447e.c = true;
                atVar = c5447e.b;
            }
            atVar = atVar;
            if (at.a(atVar, Boolean.TRUE.booleanValue())) {
                C5446d c5446d2 = (C5446d) atVar;
                int a3 = c5446d2.a();
                a2 = CodedOutputStream.a(b2, CodedOutputStream.a(CodedOutputStream.s(a3) + a3));
                a2.c(a3);
                c5446d2.a(a2);
                a2.h();
                b2.flush();
                valueOf = commsRunnable.mo5008d();
                String str = c5446d2.f28149a;
                Log.d("BluetoothDiscovery", new StringBuilder((String.valueOf(valueOf).length() + 53) + String.valueOf(str).length()).append(valueOf).append("newTransferSocketHotspot: wrote Endpoint ").append(str).append(":").append(c5446d2.f28150b).toString());
                Log.d("BluetoothDiscovery", String.valueOf(commsRunnable.mo5008d()).concat("upgradeSocketBandwidthHotspot: accepting..."));
                commsRunnable.m26278a("accept, waiting for other end to connect");
                C5475s c5475s = new C5475s(c5474r.f28215a.accept());
                valueOf = commsRunnable.mo5008d();
                str = String.valueOf(c5475s);
                Log.d("BluetoothDiscovery", new StringBuilder((String.valueOf(valueOf).length() + 54) + String.valueOf(str).length()).append(valueOf).append("upgradeSocketBandwidthHotspot: accept returned socket ").append(str).toString());
                return c5475s;
            }
            throw new UninitializedMessageException();
        } finally {
            aa.m26135a(c5474r);
        }
    }
}
