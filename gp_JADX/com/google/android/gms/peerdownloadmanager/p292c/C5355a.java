package com.google.android.gms.peerdownloadmanager.p292c;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.wifi.WifiManager;
import android.os.HandlerThread;
import android.support.v4.p028a.C0216d;
import android.support.v4.p028a.C0221j;
import android.util.Log;
import com.google.android.gms.common.p283b.C5092a;
import com.google.android.gms.common.p283b.C5093b;
import com.google.android.gms.peerdownloadmanager.common.C5363f;
import com.google.android.gms.peerdownloadmanager.common.C5372b;
import com.google.android.gms.peerdownloadmanager.common.C5379j;
import com.google.android.gms.peerdownloadmanager.common.C5380k;
import com.google.android.gms.peerdownloadmanager.common.Scheduler;
import com.google.android.gms.peerdownloadmanager.comms.p291b.C5353e;
import com.google.android.gms.peerdownloadmanager.comms.p291b.C5409d;
import com.google.android.gms.peerdownloadmanager.comms.p291b.C5410a;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5398a;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5400g;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5407j;
import com.google.android.gms.peerdownloadmanager.comms.p294a.p295a.C5397a;
import com.google.android.gms.peerdownloadmanager.comms.p296c.C5413a;
import com.google.android.gms.peerdownloadmanager.comms.p296c.C5420h;
import com.google.android.gms.peerdownloadmanager.comms.p296c.C5421i;
import com.google.android.gms.peerdownloadmanager.comms.p297d.C5431a;
import com.google.android.gms.peerdownloadmanager.comms.rpc.C5354j;
import com.google.android.gms.peerdownloadmanager.comms.rpc.C5436b;
import com.google.android.gms.peerdownloadmanager.comms.rpc.C5461e;
import com.google.android.gms.peerdownloadmanager.comms.rpc.C5462f;
import com.google.android.gms.peerdownloadmanager.comms.rpc.C5464g;
import com.google.android.gms.peerdownloadmanager.comms.rpc.C5473q;
import com.google.android.gms.peerdownloadmanager.comms.rpc.CommsRunnable;
import com.google.android.gms.peerdownloadmanager.p289a.C5346a;
import com.google.android.gms.peerdownloadmanager.p289a.C5348c;
import com.google.android.gms.peerdownloadmanager.p301e.C5485a;
import com.google.android.gms.peerdownloadmanager.p301e.C5490f;
import com.google.android.gms.peerdownloadmanager.p301e.C5492h;
import com.google.android.gms.peerdownloadmanager.p303g.C5496b;
import com.google.common.f.a.bf;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class C5355a implements C5353e, C5354j {
    public static final int f27868a = ((int) TimeUnit.SECONDS.toMillis(5));
    public final Context f27869b;
    public final C5485a f27870c;
    public final C5363f f27871d;
    public final C5496b f27872e;
    public final C5346a f27873f;
    public final C5348c f27874g;
    public final C5462f f27875h = new C5462f();
    public C5407j f27876i;
    public C5398a f27877j;
    public C5464g f27878k;
    public C5409d f27879l;
    public int f27880m;
    public C5372b f27881n;
    public int f27882o;
    public final Map f27883p = new ConcurrentHashMap();
    public HandlerThread f27884q;
    public C5360f f27885r;

    public C5355a(Context context, C5346a c5346a, C5348c c5348c) {
        Log.d("PDM", "DownloadManagerImpl constructor");
        this.f27869b = context;
        this.f27882o = 2;
        this.f27880m = 45;
        this.f27873f = c5346a;
        this.f27874g = c5348c;
        this.f27870c = new C5485a();
        this.f27871d = new C5364i();
        this.f27872e = new C5496b(context);
    }

    final boolean m26095b() {
        C5407j c5407j;
        this.f27881n = C5372b.m26136a(this.f27869b);
        try {
            this.f27872e.f28256a.getWritableDatabase().delete("requests", "expiry <> 0 AND expiry <= ?", new String[]{String.valueOf(System.currentTimeMillis())});
        } catch (Throwable e) {
            Log.w("PDM", "some expired requests not removed", e);
        }
        this.f27883p.clear();
        C5420h c5421i = new C5421i(this.f27869b, new C5413a(), C5397a.f28020a);
        Context context = this.f27869b;
        C5348c c5348c = this.f27874g;
        int a = C0216d.m1111a(context, "android.permission.ACCESS_WIFI_STATE");
        int a2 = C0216d.m1111a(context, "android.permission.CHANGE_WIFI_STATE");
        if (a == 0 && a2 == 0) {
            c5407j = new C5407j(context, true, c5348c, c5421i, C5397a.f28020a, (WifiManager) context.getSystemService("wifi"));
        } else {
            Log.w("PDMFactory", "Missing wifi-related permissions; returning null wifi network configurator");
            c5407j = null;
        }
        this.f27876i = c5407j;
        this.f27877j = new C5398a(this.f27869b, BluetoothAdapter.getDefaultAdapter(), true, this.f27873f);
        switch (this.f27882o) {
            case 1:
            case 2:
                boolean z;
                C5398a c5398a = this.f27877j;
                if (c5398a.f28023c.m26070a()) {
                    z = true;
                } else {
                    c5398a.f28024d = new bf();
                    c5398a.f28021a.registerReceiver(c5398a.f28025e, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
                    z = false;
                }
                if (z || c5398a.m26165a()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Log.e("PDM", "Bluetooth couldn't be enabled.");
                    m26096c();
                    return false;
                } else if (this.f27882o != 2 || this.f27876i != null) {
                    C5485a c5485a = this.f27870c;
                    Context context2 = this.f27869b;
                    int i = this.f27880m;
                    C5407j c5407j2 = this.f27876i;
                    boolean z2 = this.f27882o == 2;
                    C5473q c5473q = new C5473q();
                    this.f27879l = new C5410a(c5485a, context2, i, c5407j2, z2);
                    break;
                } else {
                    Log.e("PDM", "Wifi permissions unavailable for bt-wifi transfer mode");
                    return false;
                }
            case 3:
                this.f27879l = new C5431a();
                break;
            default:
                m26096c();
                Log.e("PDM", "invalid discovery type (" + this.f27882o + "), bailing");
                throw new IllegalStateException("unknown comms type: " + this.f27882o);
        }
        C5485a c5485a2 = this.f27870c;
        c5485a2.f28239f.f28251a = new C5492h(c5485a2.f28236c);
        c5485a2.f28240g.mo5026a();
        this.f27879l.mo4992c();
        this.f27878k = new C5464g(this.f27870c, this.f27879l.mo4996h(), new C5367k(this.f27869b, this.f27872e), this, this.f27879l.mo4998j(), this.f27871d, new C5093b(new LinkedBlockingQueue()), this.f27875h);
        this.f27879l.mo4990a(this);
        if (!this.f27879l.mo4995f()) {
            return false;
        }
        Log.d("PDM", "scheduleDiscoveryTimeout: " + this.f27880m + " seconds");
        this.f27885r.sendMessageDelayed(this.f27885r.obtainMessage(1), (long) (this.f27880m * 1000));
        new C5092a(this.f27878k.f28191b).start();
        this.f27879l.mo4994e();
        m26097d();
        Log.d("PDM", "DownloadManagerImpl started");
        return true;
    }

    final Void m26096c() {
        Log.d("PDM", "stopLocked");
        if (this.f27878k != null) {
            C5464g c5464g = this.f27878k;
            synchronized (c5464g.f28197h) {
                if (c5464g.f28201l) {
                } else {
                    Log.d("Comms", "Comms.stop()");
                    c5464g.f28201l = true;
                    c5464g.f28193d.mo4980b();
                    c5464g.f28190a.shutdownNow();
                    Iterator it = c5464g.f28199j.m26327a().iterator();
                    while (it.hasNext()) {
                        ((C5436b) it.next()).mo5005a(C5461e.STOPPED);
                    }
                }
            }
        }
        if (this.f27879l != null) {
            this.f27879l.mo4993d();
            this.f27879l = null;
        }
        if (this.f27876i != null) {
            try {
                this.f27876i.m26194a();
            } catch (Throwable e) {
                Log.e("PDM", "interrupted during wifi cleanup", e);
                Thread.currentThread().interrupt();
            }
        }
        this.f27877j.m26166b();
        try {
            this.f27872e.m26383a(C5380k.f27955a.m26157a()).size();
        } catch (Throwable e2) {
            Log.w("PDM", "# of remaining needs unknown", e2);
        }
        C5485a c5485a = this.f27870c;
        C5492h c5492h = c5485a.f28239f.f28251a;
        c5492h.f28254c = c5492h.f28252a.mo5025a();
        C5379j c5379j = c5485a.f28240g;
        c5485a.f28239f.f28251a.m26377a();
        c5379j.mo5038f();
        c5485a.f28240g.mo5039g();
        this.f27872e.f28256a.close();
        m26097d();
        Log.d("PDM", "cancelDiscoveryTimeout");
        this.f27885r.removeMessages(1);
        this.f27884q.quit();
        this.f27884q = null;
        Scheduler.m26128a(this.f27869b, this.f27881n, C5372b.m26136a(this.f27869b));
        Log.d("PDM", "DownloadManagerImpl stopped");
        return null;
    }

    public final void mo4969a(C5400g c5400g, boolean z) {
        if (this.f27883p.put(c5400g.mo4985a(), new C5361g(c5400g, z)) == null) {
            C5485a c5485a = this.f27870c;
            C5490f c5490f = c5485a.f28238e;
            c5490f.f28249b++;
            c5485a.f28240g.mo5033a(z);
            String valueOf = String.valueOf(c5400g);
            Log.d("PDM", new StringBuilder(String.valueOf(valueOf).length() + 18).append("onPeerDiscovered: ").append(valueOf).toString());
        }
    }

    public final boolean mo4971a(CommsRunnable commsRunnable, C5400g c5400g, boolean z) {
        Log.d("PDM", String.valueOf(commsRunnable.mo5008d()).concat("onCommunicateFailed"));
        C5361g c5361g = (C5361g) this.f27883p.get(c5400g.mo4985a());
        String str = "ERROR: ";
        String valueOf = String.valueOf(commsRunnable.m26267e());
        if (valueOf.length() != 0) {
            str.concat(valueOf);
        } else {
            valueOf = new String(str);
        }
        if (z) {
            c5361g.f27896c = true;
        }
        c5361g.f27898e++;
        int i = c5361g.f27897d;
        int i2 = c5361g.f27896c ? 6 : 3;
        if (!c5361g.f27895b || i >= i2) {
            if (i >= i2) {
                str = commsRunnable.mo5008d();
                Log.d("PDM", new StringBuilder(String.valueOf(str).length() + 65).append(str).append("onCommunicateFailed, not retrying since numRetries is ").append(i).toString());
            } else if (!c5361g.f27895b) {
                Log.d("PDM", String.valueOf(commsRunnable.mo5008d()).concat("onCommunicateFailed, not retrying since we don't have priority."));
            }
            m26097d();
            return false;
        }
        String d = commsRunnable.mo5008d();
        Log.d("PDM", new StringBuilder(String.valueOf(d).length() + 61).append(d).append("onCommunicateFailed, retrying since numRetries is ").append(i).toString());
        m26088a(c5400g, c5361g, (int) ((((double) f27868a) * (0.5d + ((double) new Random().nextFloat()))) * Math.pow(1.5d, (double) (i - 1))));
        m26097d();
        return true;
    }

    public final void mo4968a(C5400g c5400g) {
        String str = "PDM";
        String str2 = "onCommunicateDeferred: peer=";
        String valueOf = String.valueOf(c5400g.mo4985a());
        Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        this.f27883p.get(c5400g.mo4985a());
        m26097d();
        this.f27885r.postDelayed(new C5358d(this, c5400g), (long) f27868a);
    }

    public final void mo4972b(CommsRunnable commsRunnable, C5400g c5400g, boolean z) {
        String d = commsRunnable.mo5008d();
        Log.d("PDM", new StringBuilder(String.valueOf(d).length() + 41).append(d).append("onCommunicateSucceeded: allFinished=").append(z).toString());
        C5361g c5361g = (C5361g) this.f27883p.get(c5400g.mo4985a());
        c5361g.f27899f++;
        c5361g.f27896c = true;
        if (!c5361g.f27895b || z) {
            Log.d("PDM", String.valueOf(commsRunnable.mo5008d()).concat("onCommunicateSucceeded, not retrying since all apps are finished communicating"));
        } else {
            Log.d("PDM", String.valueOf(commsRunnable.mo5008d()).concat("onCommunicateSucceeded, retrying since some apps still need to communicate"));
            m26088a(c5400g, c5361g, 0);
        }
        m26097d();
    }

    public final void mo4967a() {
        m26097d();
    }

    public final void mo4970a(CommsRunnable commsRunnable, C5400g c5400g) {
        Log.d("PDM", String.valueOf(commsRunnable.mo5008d()).concat("onCommunicateStarted"));
        C5361g c5361g = (C5361g) this.f27883p.get(c5400g.mo4985a());
        if (c5361g == null) {
            c5361g = new C5361g(c5400g, false);
            this.f27883p.put(c5400g.mo4985a(), c5361g);
        }
        r0.f27897d++;
        m26097d();
    }

    private final void m26088a(C5400g c5400g, C5361g c5361g, int i) {
        this.f27885r.postDelayed(new C5359e(this, c5361g, c5400g), (long) i);
    }

    final void m26097d() {
        C0221j.m1129a(this.f27869b).m1133a(new Intent("action_debug_pdm_status_changed"));
    }
}
