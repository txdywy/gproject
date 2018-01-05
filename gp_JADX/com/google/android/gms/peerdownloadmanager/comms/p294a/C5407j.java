package com.google.android.gms.peerdownloadmanager.comms.p294a;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import android.provider.Settings.System;
import android.util.Log;
import com.google.android.gms.peerdownloadmanager.comms.p294a.p295a.C5396b;
import com.google.android.gms.peerdownloadmanager.comms.p296c.C5420h;
import com.google.android.gms.peerdownloadmanager.p289a.C5348c;
import com.google.common.f.a.ak;
import com.google.common.f.a.ba;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class C5407j {
    public static final int f28031a = ((int) TimeUnit.SECONDS.toMillis(4));
    public static final int f28032b = ((int) TimeUnit.SECONDS.toMillis(1));
    public final C5420h f28033c;
    public final C5396b f28034d;
    public final WifiManager f28035e;
    public final C5348c f28036f;
    public boolean f28037g = false;

    public C5407j(Context context, boolean z, C5348c c5348c, C5420h c5420h, C5396b c5396b, WifiManager wifiManager) {
        String str = null;
        this.f28033c = c5420h;
        this.f28034d = c5396b;
        this.f28035e = wifiManager;
        this.f28036f = c5348c;
        if (VERSION.SDK_INT >= 23 && !System.canWrite(context)) {
            context.startActivity(new Intent("android.settings.action.MANAGE_WRITE_SETTINGS"));
        }
        if (!z) {
            return;
        }
        if (this.f28035e.isWifiEnabled()) {
            C5348c c5348c2 = this.f28036f;
            if (this.f28035e.getConnectionInfo().getNetworkId() != -1) {
                str = this.f28035e.getConnectionInfo().getSSID();
            }
            c5348c2.m26077a(true, str);
            return;
        }
        this.f28036f.m26077a(false, null);
    }

    public final void m26195a(com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5448f r13) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException
	at jadx.core.dex.visitors.ssa.SSATransform.placePhi(SSATransform.java:82)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:50)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r12 = this;
        r11 = 3;
        r10 = 1;
        r12.m26190b();
        r0 = 0;
    L_0x0006:
        r1 = r0 + 1;
        if (r0 >= r11) goto L_0x0093;
    L_0x000a:
        r0 = "NetworkCtrlDelegate";
        r2 = 26;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "joinAP attempt ";
        r2 = r3.append(r2);
        r2 = r2.append(r1);
        r2 = r2.toString();
        android.util.Log.d(r0, r2);
        r0 = r12.f28033c;
        r2 = r0.mo5003a(r13);
        r0 = java.io.IOException.class;	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r3 = f28031a;	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r4 = (double) r3;	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r6 = 4612811918334230528; // 0x4004000000000000 float:0.0 double:2.5;	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r3 = r1 + -1;	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r8 = (double) r3;	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r6 = java.lang.Math.pow(r6, r8);	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r4 = r4 * r6;	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r3 = (int) r4;	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r4 = (long) r3;	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r3 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r0 = com.google.android.gms.peerdownloadmanager.common.C5378i.m26142a(r2, r0, r4, r3);	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r0 = (java.lang.Boolean) r0;	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r0 = r0.booleanValue();	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        if (r0 == 0) goto L_0x005e;	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
    L_0x0049:
        r0 = "NetworkCtrlDelegate";	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r3 = "joinAP returned success";	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        android.util.Log.d(r0, r3);	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r0 = r12.f28036f;	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r3 = r13.f28153a;	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r0.m26075a(r3);	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r12.m26191c();
        r2.cancel(r10);
        return;
    L_0x005e:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r3 = "call to joinAP returned failure";	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        r0.<init>(r3);	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
        throw r0;	 Catch:{ IOException -> 0x0066, TimeoutException -> 0x00ba }
    L_0x0066:
        r0 = move-exception;
    L_0x0067:
        if (r1 >= r11) goto L_0x007e;
    L_0x0069:
        r0 = "NetworkCtrlDelegate";	 Catch:{ all -> 0x008b }
        r3 = "joinAP failed, will retry in a moment";	 Catch:{ all -> 0x008b }
        android.util.Log.d(r0, r3);	 Catch:{ all -> 0x008b }
        r0 = f28032b;	 Catch:{ all -> 0x008b }
        r4 = (long) r0;	 Catch:{ all -> 0x008b }
        android.os.SystemClock.sleep(r4);	 Catch:{ all -> 0x008b }
        r12.m26191c();
        r2.cancel(r10);
        r0 = r1;
        goto L_0x0006;
    L_0x007e:
        r1 = "NetworkCtrlDelegate";	 Catch:{ all -> 0x008b }
        r3 = "joinAP failed, will NOT retry";	 Catch:{ all -> 0x008b }
        android.util.Log.d(r1, r3);	 Catch:{ all -> 0x008b }
        r1 = new java.io.IOException;	 Catch:{ all -> 0x008b }
        r1.<init>(r0);	 Catch:{ all -> 0x008b }
        throw r1;	 Catch:{ all -> 0x008b }
    L_0x008b:
        r0 = move-exception;
        r12.m26191c();
        r2.cancel(r10);
        throw r0;
    L_0x0093:
        r0 = new java.io.IOException;
        r1 = java.lang.String.valueOf(r13);
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r2 = r2 + 27;
        r3 = new java.lang.StringBuilder;
        r3.<init>(r2);
        r2 = "unable to join network for ";
        r2 = r3.append(r2);
        r1 = r2.append(r1);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x00ba:
        r0 = move-exception;
        goto L_0x0067;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.peerdownloadmanager.comms.a.j.a(com.google.android.gms.peerdownloadmanager.comms.rpc.b.f):void");
    }

    private final synchronized void m26190b() {
        if (!this.f28037g) {
            C5406i.m26186a(this.f28035e, this.f28034d);
            this.f28036f.m26076a(m26193e());
            this.f28037g = true;
        }
    }

    private final void m26191c() {
        if (this.f28035e.isWifiEnabled()) {
            this.f28036f.m26078b(m26193e());
        }
    }

    private final synchronized void m26192d() {
        int i = -1;
        synchronized (this) {
            if (this.f28035e.isWifiEnabled()) {
                int size;
                Set e = m26193e();
                Set stringSet = this.f28036f.f27864e.getSharedPreferences("peerdownloadmanager_cleanup.prefs", 0).getStringSet("wifi_original_ssids", C5348c.f27862c);
                Set stringSet2 = this.f28036f.f27864e.getSharedPreferences("peerdownloadmanager_cleanup.prefs", 0).getStringSet("wifi_expected_ssids", C5348c.f27863d);
                Log.d("NetworkCtrlDelegate", "Current: " + (e != null ? e.size() : -1));
                String str = "NetworkCtrlDelegate";
                if (stringSet != null) {
                    size = stringSet.size();
                } else {
                    size = -1;
                }
                Log.d(str, "Original: " + size);
                String str2 = "NetworkCtrlDelegate";
                if (stringSet2 != null) {
                    i = stringSet2.size();
                }
                Log.d(str2, "Expected: " + i);
                if (stringSet == null || e == null || !e.equals(stringSet2)) {
                    Log.d("NetworkCtrlDelegate", "expected SSIDs did not match current SSIDs; no cleanup");
                } else {
                    Log.d("NetworkCtrlDelegate", "expected SSIDs matched; cleanup networks");
                    m26189a(stringSet);
                }
            }
        }
    }

    private final void m26189a(Set set) {
        List<WifiConfiguration> configuredNetworks = this.f28035e.getConfiguredNetworks();
        if (configuredNetworks == null) {
            Log.w("NetworkCtrlDelegate", "unable to get list of networks");
            return;
        }
        for (WifiConfiguration wifiConfiguration : configuredNetworks) {
            if (!set.contains(wifiConfiguration.SSID)) {
                int i = wifiConfiguration.networkId;
                String str = wifiConfiguration.SSID;
                Log.d("NetworkCtrlDelegate", new StringBuilder(String.valueOf(str).length() + 48).append("Removed network ").append(i).append(" for having new SSID ").append(str).toString());
                this.f28035e.removeNetwork(wifiConfiguration.networkId);
            }
        }
        this.f28035e.saveConfiguration();
    }

    public final void m26194a() {
        if (this.f28035e.isWifiEnabled()) {
            String string = this.f28036f.f27864e.getSharedPreferences("peerdownloadmanager_cleanup.prefs", 0).getString("wifi_mitosis_ssid", C5348c.f27861b);
            String ssid = this.f28035e.getConnectionInfo().getSSID();
            if (string != null && string.equals(ssid)) {
                this.f28035e.disconnect();
            }
        }
        m26192d();
        try {
            if (!this.f28036f.f27864e.getSharedPreferences("peerdownloadmanager_cleanup.prefs", 0).getBoolean("wifi_on", false)) {
                C5406i.m26188b(this.f28035e, this.f28034d);
            } else if (this.f28035e.isWifiEnabled()) {
                ak.a(this.f28033c.mo5004b(), new C5408k(), ba.a);
                ssid = this.f28036f.f27864e.getSharedPreferences("peerdownloadmanager_cleanup.prefs", 0).getString("wifi_ssid", C5348c.f27860a);
                if (ssid != null && this.f28035e.getConnectionInfo().getNetworkId() == -1) {
                    int i;
                    WifiManager wifiManager = this.f28035e;
                    List<WifiConfiguration> configuredNetworks = this.f28035e.getConfiguredNetworks();
                    if (configuredNetworks != null) {
                        for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                            if (wifiConfiguration.SSID.equals(ssid)) {
                                i = wifiConfiguration.networkId;
                                break;
                            }
                        }
                    }
                    Log.w("NetworkCtrlDelegate", "unable to get list of networks");
                    i = -1;
                    wifiManager.enableNetwork(i, true);
                }
            }
        } catch (IOException e) {
            Log.d("NetworkCtrlDelegate", "restore: unable to restore the wifi enabled/disabled state");
        }
    }

    private final Set m26193e() {
        List<WifiConfiguration> configuredNetworks = this.f28035e.getConfiguredNetworks();
        if (configuredNetworks == null) {
            Log.w("NetworkCtrlDelegate", "unable to get list of networks");
            return null;
        }
        Set hashSet = new HashSet();
        for (WifiConfiguration wifiConfiguration : configuredNetworks) {
            hashSet.add(wifiConfiguration.SSID);
        }
        return hashSet;
    }
}
