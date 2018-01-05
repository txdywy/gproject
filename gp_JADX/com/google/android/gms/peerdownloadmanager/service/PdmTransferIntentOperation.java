package com.google.android.gms.peerdownloadmanager.service;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.android.gms.peerdownloadmanager.common.C5375e;
import com.google.android.gms.peerdownloadmanager.common.C5387r;
import com.google.android.gms.peerdownloadmanager.common.Scheduler;
import com.google.android.gms.peerdownloadmanager.p289a.C5347b;
import com.google.android.gms.peerdownloadmanager.p302f.C5494b;
import com.google.android.p101b.C0918a;
import com.google.common.f.a.au;
import com.google.common.f.a.bf;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class PdmTransferIntentOperation extends C0918a {
    public static final IntentFilter f28257a = new IntentFilter("STOP_PDM");
    public static final IntentFilter f28258b = new IntentFilter("android.intent.action.SCREEN_ON");
    public static final long f28259c = TimeUnit.SECONDS.toMillis(3);
    public static volatile C5375e f28260e;
    public volatile C5498b f28261d = null;
    public final BroadcastReceiver f28262f = new C5497a(this);

    public void onHandleIntent(android.content.Intent r24) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:205:?
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.modifyBlocksTree(BlockProcessor.java:248)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:52)
	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.rerun(BlockProcessor.java:44)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.visit(BlockFinallyExtract.java:57)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r23 = this;
        r7 = new com.google.android.gms.peerdownloadmanager.a.c;
        r4 = r23.getApplicationContext();
        r7.<init>(r4);
        r20 = new com.google.android.gms.peerdownloadmanager.a.a;
        r4 = r23.getApplicationContext();
        r0 = r20;
        r0.<init>(r4);
        r11 = r24.getAction();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = "PdmTransfer";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = "onHandleIntent: Handling PDM request: ";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = java.lang.String.valueOf(r11);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = r4.length();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r8 == 0) goto L_0x00db;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0026:
        r4 = r6.concat(r4);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x002a:
        android.util.Log.d(r5, r4);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = "peerdownloadmanager_cleanup.prefs";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r23;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = r0.getSharedPreferences(r4, r5);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = "peerdownloadmanager_needs_cleanup";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = r4.getBoolean(r5, r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = "PdmCleanup";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = 35;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8.<init>(r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = "Cleanup called. Should clean? ";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r8.append(r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r4);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.toString();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        android.util.Log.d(r5, r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r4 == 0) goto L_0x00cf;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0059:
        com.google.android.gms.peerdownloadmanager.p289a.C5347b.m26071a(r23);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r20;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = r0.f27858a;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = "peerdownloadmanager_cleanup.prefs";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = r4.getSharedPreferences(r5, r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = "bt_needs_cleanup";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = r4.getBoolean(r5, r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r4 == 0) goto L_0x0095;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0070:
        r4 = new com.google.android.gms.peerdownloadmanager.comms.a.a;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r20;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = r0.f27858a;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = android.bluetooth.BluetoothAdapter.getDefaultAdapter();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r20;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4.<init>(r5, r6, r8, r0);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4.m26166b();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r20;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = r0.f27858a;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = com.google.android.gms.peerdownloadmanager.p289a.C5347b.m26073b(r4);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = "bt_needs_cleanup";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = r4.putBoolean(r5, r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4.apply();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0095:
        r4 = r7.f27864e;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = "peerdownloadmanager_cleanup.prefs";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = r4.getSharedPreferences(r5, r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = "wifi_needs_cleanup";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = r4.getBoolean(r5, r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r4 == 0) goto L_0x00cf;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x00a7:
        r4 = new com.google.android.gms.peerdownloadmanager.comms.a.j;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = r7.f27864e;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r9 = com.google.android.gms.peerdownloadmanager.comms.p294a.p295a.C5397a.f28020a;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = r7.f27864e;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r12 = "wifi";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = r10.getSystemService(r12);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = (android.net.wifi.WifiManager) r10;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4.<init>(r5, r6, r7, r8, r9, r10);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4.m26194a();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = r7.f27864e;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = com.google.android.gms.peerdownloadmanager.p289a.C5347b.m26073b(r4);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = "wifi_needs_cleanup";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = r4.putBoolean(r5, r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4.apply();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x00cf:
        r4 = "RESET_STATE";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = r4.equals(r11);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r4 == 0) goto L_0x00f7;
    L_0x00d7:
        com.google.android.gms.peerdownloadmanager.service.C5499c.m26386a();
    L_0x00da:
        return;
    L_0x00db:
        r4 = new java.lang.String;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4.<init>(r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x002a;
    L_0x00e2:
        r4 = move-exception;
        com.google.android.gms.peerdownloadmanager.service.C5499c.m26386a();
        throw r4;
    L_0x00e7:
        r4 = move-exception;
        r5 = "PdmTransfer";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = "interrupted during cleanup";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        android.util.Log.e(r5, r6, r4);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = java.lang.Thread.currentThread();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4.interrupt();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x00cf;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x00f7:
        r4 = "extraScheduler";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r24;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = r0.getBundleExtra(r4);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = "extraScheduler";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = r4.getParcelable(r5);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = (com.google.android.gms.peerdownloadmanager.common.Scheduler) r4;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r21 = new com.google.android.gms.peerdownloadmanager.f.b;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r21;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r1 = r23;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0.<init>(r1);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = com.google.android.gms.peerdownloadmanager.common.C5372b.m26136a(r23);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r5.f27937a;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r22 = r0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = new android.os.StatFs;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = android.os.Environment.getDataDirectory();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.getPath();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5.<init>(r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = android.os.Build.VERSION.SDK_INT;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = 18;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r6 < r8) goto L_0x037f;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x012b:
        r8 = r5.getTotalBytes();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r18 = r8;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0131:
        r5 = "PdmTransfer";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = 43;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8.<init>(r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = "start: ";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r8.append(r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r22;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r0);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = " ";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r18;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r0);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.toString();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        android.util.Log.d(r5, r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = android.bluetooth.BluetoothAdapter.getDefaultAdapter();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r5 == 0) goto L_0x038e;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x015f:
        r5 = r5.isEnabled();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r5 == 0) goto L_0x038e;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0165:
        r9 = 1;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0166:
        if (r9 == 0) goto L_0x0391;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0168:
        r5 = r23.getPackageManager();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = "android.hardware.bluetooth_le";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = r5.hasSystemFeature(r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r5 == 0) goto L_0x0391;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0174:
        r10 = 1;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0175:
        r5 = "wifi";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r23;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = r0.getSystemService(r5);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = (android.net.wifi.WifiManager) r5;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r5 == 0) goto L_0x0394;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0181:
        r6 = r5.isWifiEnabled();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r6 == 0) goto L_0x0394;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0187:
        r11 = 1;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0188:
        if (r5 == 0) goto L_0x0397;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x018a:
        r6 = r5.getConnectionInfo();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x018e:
        if (r6 == 0) goto L_0x039a;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0190:
        r6 = r6.getNetworkId();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = -1;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r6 == r8) goto L_0x039a;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0197:
        r12 = 1;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0198:
        r13 = com.google.android.gms.peerdownloadmanager.service.C5499c.m26391a(r5);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = new android.content.IntentFilter;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5.<init>();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = "android.net.wifi.p2p.STATE_CHANGED";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5.addAction(r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r23;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = r0.registerReceiver(r6, r5);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r5 == 0) goto L_0x03a0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x01af:
        r6 = "wifi_p2p_state";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = -1;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = r5.getIntExtra(r6, r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = 2;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r5 != r6) goto L_0x039d;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x01b9:
        r14 = 1;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x01ba:
        r5 = "phone";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r23;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = r0.getSystemService(r5);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = (android.telephony.TelephonyManager) r5;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = r5.getNetworkType();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r5 == 0) goto L_0x03a3;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x01ca:
        r15 = 1;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x01cb:
        r16 = com.google.android.gms.peerdownloadmanager.service.C5499c.m26390a(r23);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r17 = com.google.android.gms.common.util.C5146a.m23876a(r23);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = "PdmTransfer";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = 53;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8.<init>(r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r8.append(r9);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = " ";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r10);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = " ";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r11);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = " ";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r12);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = " ";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r13);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = " ";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r14);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = " ";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r15);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = " ";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r16;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r0);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = " ";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r17;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.append(r0);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.toString();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        android.util.Log.d(r5, r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = new com.google.android.gms.peerdownloadmanager.common.q;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = new com.google.android.gms.peerdownloadmanager.common.s;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r22;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r1 = r18;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5.<init>(r0, r1, r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = new com.google.android.gms.peerdownloadmanager.common.p;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6.<init>();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6.f27969b = r8;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6.f27971d = r5;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r21;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r0.f28255a;	 Catch:{ SQLiteException -> 0x03c1 }
        r8 = r5.getWritableDatabase();	 Catch:{ SQLiteException -> 0x03c1 }
        r9 = new android.content.ContentValues;	 Catch:{ SQLiteException -> 0x03c1 }
        r9.<init>();	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = "start_time";	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = r6.f27969b;	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = java.lang.Long.valueOf(r10);	 Catch:{ SQLiteException -> 0x03c1 }
        r9.put(r5, r10);	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = "battery_percent_start";	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = r6.f27971d;	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = r10.f27988a;	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = java.lang.Float.valueOf(r10);	 Catch:{ SQLiteException -> 0x03c1 }
        r9.put(r5, r10);	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = "storage_left";	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = r6.f27971d;	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = r10.f27989b;	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = java.lang.Long.valueOf(r10);	 Catch:{ SQLiteException -> 0x03c1 }
        r9.put(r5, r10);	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = "bt_enabled";	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r6.f27971d;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27990c;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27975a;	 Catch:{ SQLiteException -> 0x03c1 }
        if (r5 == 0) goto L_0x03a6;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x0292:
        r5 = 1;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x0293:
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r9.put(r10, r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = "ble_enabled";	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r6.f27971d;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27990c;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27976b;	 Catch:{ SQLiteException -> 0x03c1 }
        if (r5 == 0) goto L_0x03a9;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x02a4:
        r5 = 1;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x02a5:
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r9.put(r10, r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = "wifi_enabled";	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r6.f27971d;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27990c;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27977c;	 Catch:{ SQLiteException -> 0x03c1 }
        if (r5 == 0) goto L_0x03ac;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x02b6:
        r5 = 1;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x02b7:
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r9.put(r10, r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = "wifi_connected";	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r6.f27971d;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27990c;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27978d;	 Catch:{ SQLiteException -> 0x03c1 }
        if (r5 == 0) goto L_0x03af;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x02c8:
        r5 = 1;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x02c9:
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r9.put(r10, r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = "wifi_hotspot_enabled";	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r6.f27971d;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27990c;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27979e;	 Catch:{ SQLiteException -> 0x03c1 }
        if (r5 == 0) goto L_0x03b2;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x02da:
        r5 = 1;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x02db:
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r9.put(r10, r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = "wifi_direct_enabled";	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r6.f27971d;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27990c;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27980f;	 Catch:{ SQLiteException -> 0x03c1 }
        if (r5 == 0) goto L_0x03b5;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x02ec:
        r5 = 1;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x02ed:
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r9.put(r10, r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = "cell_enabled";	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r6.f27971d;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27990c;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27981g;	 Catch:{ SQLiteException -> 0x03c1 }
        if (r5 == 0) goto L_0x03b8;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x02fe:
        r5 = 1;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x02ff:
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r9.put(r10, r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = "cell_data_enabled";	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r6.f27971d;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27990c;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27982h;	 Catch:{ SQLiteException -> 0x03c1 }
        if (r5 == 0) goto L_0x03bb;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x0310:
        r5 = 1;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x0311:
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r9.put(r10, r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r10 = "airplane_mode_enabled";	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r6.f27971d;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27990c;	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = r5.f27983i;	 Catch:{ SQLiteException -> 0x03c1 }
        if (r5 == 0) goto L_0x03be;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x0322:
        r5 = 1;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x0323:
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r9.put(r10, r5);	 Catch:{ SQLiteException -> 0x03c1 }
        r5 = "start";	 Catch:{ SQLiteException -> 0x03c1 }
        r6 = 0;	 Catch:{ SQLiteException -> 0x03c1 }
        r8 = r8.insert(r5, r6, r9);	 Catch:{ SQLiteException -> 0x03c1 }
        com.google.android.gms.peerdownloadmanager.service.C5499c.f28267b = r8;	 Catch:{ SQLiteException -> 0x03c1 }
    L_0x0333:
        r0 = r23;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r1 = r21;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        com.google.android.gms.peerdownloadmanager.service.C5499c.m26389a(r0, r1);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r23;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r1 = r21;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        com.google.android.gms.peerdownloadmanager.service.C5499c.m26392b(r0, r1);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r21;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = r0.f28255a;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5.close();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = 19;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r5 < r6) goto L_0x03cb;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x034e:
        r6 = "android:coarse_location";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = "appops";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r23;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = r0.getSystemService(r5);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = (android.app.AppOpsManager) r5;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = android.os.Binder.getCallingUid();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r9 = r23.getPackageName();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = r5.checkOp(r6, r8, r9);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r5 == 0) goto L_0x03cb;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0368:
        r5 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0369:
        if (r5 != 0) goto L_0x03cd;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x036b:
        r4 = "PdmTransfer";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = "runWithWakelock: coarse location cannot be used, bailing out";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        android.util.Log.d(r4, r5);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = 6;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r23;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        com.google.android.gms.peerdownloadmanager.service.C5499c.m26388a(r0, r4, r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x037a:
        com.google.android.gms.peerdownloadmanager.service.C5499c.m26386a();
        goto L_0x00da;
    L_0x037f:
        r6 = r5.getBlockSize();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = (long) r6;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = r5.getBlockCount();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = (long) r5;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = r8 * r10;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r18 = r8;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x0131;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x038e:
        r9 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x0166;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0391:
        r10 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x0175;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0394:
        r11 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x0188;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0397:
        r6 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x018e;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x039a:
        r12 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x0198;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x039d:
        r14 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x01ba;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x03a0:
        r14 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x01ba;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x03a3:
        r15 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x01cb;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x03a6:
        r5 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x0293;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x03a9:
        r5 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x02a5;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x03ac:
        r5 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x02b7;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x03af:
        r5 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x02c9;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x03b2:
        r5 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x02db;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x03b5:
        r5 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x02ed;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x03b8:
        r5 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x02ff;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x03bb:
        r5 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x0311;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x03be:
        r5 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x0323;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x03c1:
        r5 = move-exception;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = "PdmTransfer";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = "sqlite error, start not logged; no run id set";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        android.util.Log.w(r6, r8, r5);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x0333;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x03cb:
        r5 = 1;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x0369;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x03cd:
        r5 = r23.getApplicationContext();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        com.google.android.gms.peerdownloadmanager.common.Scheduler.m26130b(r5);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = r4.f27916d;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r5 != 0) goto L_0x040d;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x03d8:
        r5 = r23.getApplicationContext();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = "PdmScheduler";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = r4.f27917e;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r9 = java.lang.String.valueOf(r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r9 = r9.length();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r9 = r9 + 27;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10.<init>(r9);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r9 = "Scheduling alarm, accuracy ";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r9 = r10.append(r9);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = r9.append(r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = r8.toString();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        android.util.Log.d(r6, r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r4.f27917e;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = r6.ordinal();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        switch(r6) {
            case 0: goto L_0x0426;
            case 1: goto L_0x04cb;
            default: goto L_0x040d;
        };	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x040d:
        r0 = r23;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = r4.m26133a(r0);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r5 != 0) goto L_0x04ee;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0415:
        r4 = "PdmTransfer";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = "runWithWakelock: scheduler conditions not met, bailing out";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        android.util.Log.d(r4, r5);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r4 = 2;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r23;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        com.google.android.gms.peerdownloadmanager.service.C5499c.m26388a(r0, r4, r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x037a;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0426:
        r6 = r4.f27929q;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r6 != 0) goto L_0x0478;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x042a:
        r6 = "PdmScheduler";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = "scheduleExact: calling justStartNow";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        android.util.Log.d(r6, r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = new android.content.Intent;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = com.google.android.gms.peerdownloadmanager.service.PdmTransferIntentReceiver.class;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6.<init>(r5, r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r4 == 0) goto L_0x0449;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x043a:
        r8 = new android.os.Bundle;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8.<init>();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r9 = "extraScheduler";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8.putParcelable(r9, r4);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r9 = "extraScheduler";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6.putExtra(r9, r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0449:
        r8 = "TRANSFER";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6.setAction(r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = "PdmScheduler";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r9 = java.lang.String.valueOf(r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = java.lang.String.valueOf(r9);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = r10.length();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = r10 + 35;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r11 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r11.<init>(r10);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = "justStartNow: starting the service ";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = r11.append(r10);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r9 = r10.append(r9);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r9 = r9.toString();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        android.util.Log.d(r8, r9);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5.sendBroadcast(r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x040d;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0478:
        r6 = com.google.android.gms.peerdownloadmanager.common.Scheduler.m26125a(r5, r4);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = r4.f27916d;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r8 == 0) goto L_0x04c6;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0480:
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = r4.f27929q;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = r10 * 1000;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = (long) r10;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = r8 + r10;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x048a:
        r10 = "PdmScheduler";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r12 = java.lang.System.currentTimeMillis();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r11 = 90;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r14 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r14.<init>(r11);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r11 = "scheduleExact: now is ";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r11 = r14.append(r11);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r11 = r11.append(r12);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r12 = ", scheduling exact alarm at ";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r11 = r11.append(r12);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r11 = r11.append(r8);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r11 = r11.toString();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        android.util.Log.d(r10, r11);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = new com.google.android.gms.common.a.a;	 Catch:{ NoSuchMethodError -> 0x04bc }
        r10.<init>(r5);	 Catch:{ NoSuchMethodError -> 0x04bc }
        r10.m23265a(r8, r6);	 Catch:{ NoSuchMethodError -> 0x04bc }
        goto L_0x040d;
    L_0x04bc:
        r5 = move-exception;
        r6 = "PdmScheduler";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = "No suitable alarm scheduling method found";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        android.util.Log.e(r6, r8, r5);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x040d;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x04c6:
        r8 = r4.m26132a();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x048a;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x04cb:
        r6 = new com.google.android.gms.common.a.a;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6.<init>(r5);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r8 = r4.m26132a();	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = com.google.android.gms.peerdownloadmanager.common.Scheduler.m26125a(r5, r4);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = android.os.Build.VERSION.SDK_INT;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r11 = 23;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r10 < r11) goto L_0x04e6;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x04de:
        r6 = r6.f25617a;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6.setAndAllowWhileIdle(r10, r8, r5);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x040d;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x04e6:
        r6 = r6.f25617a;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r10 = 0;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6.set(r10, r8, r5);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x040d;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x04ee:
        r5 = "PdmTransfer";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = "runWithWakelock: location and scheduler conditions are met, entering foreground";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        android.util.Log.d(r5, r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = r4.f27934v;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        if (r5 != 0) goto L_0x0594;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x04f9:
        r5 = "PdmTransfer";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = "not promoting to foreground service because notification is null";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        android.util.Log.w(r5, r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0500:
        r5 = "PdmTransfer";	 Catch:{ all -> 0x058f }
        r6 = "runInForeground: registering broadcast receiver";	 Catch:{ all -> 0x058f }
        android.util.Log.d(r5, r6);	 Catch:{ all -> 0x058f }
        r5 = new com.google.common.f.a.bf;	 Catch:{ all -> 0x058f }
        r5.<init>();	 Catch:{ all -> 0x058f }
        r6 = new com.google.android.gms.peerdownloadmanager.service.b;	 Catch:{ all -> 0x058f }
        r8 = r4.f27921i;	 Catch:{ all -> 0x058f }
        r6.<init>(r5, r8);	 Catch:{ all -> 0x058f }
        r0 = r23;	 Catch:{ all -> 0x058f }
        r0.f28261d = r6;	 Catch:{ all -> 0x058f }
        r0 = r23;	 Catch:{ all -> 0x058f }
        r6 = r0.f28261d;	 Catch:{ all -> 0x058f }
        r8 = f28257a;	 Catch:{ all -> 0x058f }
        r0 = r23;	 Catch:{ all -> 0x058f }
        r0.registerReceiver(r6, r8);	 Catch:{ all -> 0x058f }
        r6 = "PdmTransfer";	 Catch:{ all -> 0x057a, all -> 0x057f }
        r8 = "runWithReceiver: starting download manager";	 Catch:{ all -> 0x057a, all -> 0x057f }
        android.util.Log.d(r6, r8);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r6 = new com.google.android.gms.peerdownloadmanager.c.a;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r8 = r23.getApplicationContext();	 Catch:{ all -> 0x057a, all -> 0x057f }
        r9 = new com.google.android.gms.peerdownloadmanager.c.h;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r9.<init>();	 Catch:{ all -> 0x057a, all -> 0x057f }
        r0 = r20;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r6.<init>(r8, r0, r7);	 Catch:{ all -> 0x057a, all -> 0x057f }
        f28260e = r6;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = "PdmTransfer";	 Catch:{ all -> 0x057a, all -> 0x057f }
        r8 = "runSession: preparing DownloadManagerImpl";	 Catch:{ all -> 0x057a, all -> 0x057f }
        android.util.Log.d(r7, r8);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = r4.f27926n;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r6.f27880m = r7;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = r4.f27927o;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r6.f27882o = r7;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = r4.f27928p;	 Catch:{ all -> 0x057a, all -> 0x057f }
        if (r7 == 0) goto L_0x0560;	 Catch:{ all -> 0x057a, all -> 0x057f }
    L_0x054e:
        r7 = r23.getBaseContext();	 Catch:{ all -> 0x057a, all -> 0x057f }
        r8 = new com.google.android.gms.peerdownloadmanager.service.d;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r9 = new com.google.android.gms.peerdownloadmanager.f.b;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r9.<init>(r7);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r8.<init>(r9);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = r6.f27870c;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7.f28240g = r8;	 Catch:{ all -> 0x057a, all -> 0x057f }
    L_0x0560:
        r7 = "PdmTransfer";	 Catch:{ all -> 0x057a, all -> 0x057f }
        r8 = "runSession: starting session";	 Catch:{ all -> 0x057a, all -> 0x057f }
        android.util.Log.d(r7, r8);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = "PDM";	 Catch:{ all -> 0x057a, all -> 0x057f }
        r8 = "Starting PDM";	 Catch:{ all -> 0x057a, all -> 0x057f }
        android.util.Log.d(r7, r8);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = r6.f27884q;	 Catch:{ all -> 0x057a, all -> 0x057f }
        if (r7 == 0) goto L_0x05a5;	 Catch:{ all -> 0x057a, all -> 0x057f }
    L_0x0572:
        r4 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r5 = "dm already running";	 Catch:{ all -> 0x057a, all -> 0x057f }
        r4.<init>(r5);	 Catch:{ all -> 0x057a, all -> 0x057f }
        throw r4;	 Catch:{ all -> 0x057a, all -> 0x057f }
    L_0x057a:
        r4 = move-exception;
        r5 = 0;
        f28260e = r5;	 Catch:{ all -> 0x057a, all -> 0x057f }
        throw r4;	 Catch:{ all -> 0x057a, all -> 0x057f }
    L_0x057f:
        r4 = move-exception;
        r0 = r23;	 Catch:{ all -> 0x058f }
        r5 = r0.f28261d;	 Catch:{ all -> 0x058f }
        r0 = r23;	 Catch:{ all -> 0x058f }
        r0.unregisterReceiver(r5);	 Catch:{ all -> 0x058f }
        r5 = 0;	 Catch:{ all -> 0x058f }
        r0 = r23;	 Catch:{ all -> 0x058f }
        r0.f28261d = r5;	 Catch:{ all -> 0x058f }
        throw r4;	 Catch:{ all -> 0x058f }
    L_0x058f:
        r4 = move-exception;
        com.google.android.gms.peerdownloadmanager.service.C5499c.m26387a(r23);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        throw r4;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
    L_0x0594:
        r6 = 1346653473; // 0x50444d21 float:1.31735562E10 double:6.65335218E-315;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0 = r23;	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r0.startForeground(r6, r5);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r5 = "PdmTransfer";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        r6 = "promoted to foreground service";	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        android.util.Log.d(r5, r6);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x0500;
    L_0x05a5:
        r7 = new android.os.HandlerThread;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r8 = "PDMThread";	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7.<init>(r8);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r6.f27884q = r7;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = r6.f27884q;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7.start();	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = new com.google.android.gms.peerdownloadmanager.c.f;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r8 = r6.f27884q;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r8 = r8.getLooper();	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7.<init>(r6, r8);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r6.f27885r = r7;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = new com.google.android.gms.peerdownloadmanager.c.b;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7.<init>(r6);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = com.google.common.f.a.av.a(r7);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r8 = r6.f27885r;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r8.post(r7);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r8 = "PdmTransfer";	 Catch:{ all -> 0x057a, all -> 0x057f }
        r9 = "runSession: session started";	 Catch:{ all -> 0x057a, all -> 0x057f }
        android.util.Log.d(r8, r9);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r0 = r23;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r4 = r0.m26384a(r4, r7, r5);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r5 = "PdmTransfer";	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = 57;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r8 = new java.lang.StringBuilder;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r8.<init>(r7);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = "runSession: stopping session with reason code ";	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = r8.append(r7);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = r7.append(r4);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = r7.toString();	 Catch:{ all -> 0x057a, all -> 0x057f }
        android.util.Log.d(r5, r7);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r8 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x057a, all -> 0x057f }
        r5 = "PDM";	 Catch:{ all -> 0x057a, all -> 0x057f }
        r7 = "Stopping PDM by posting call to stopLocked";	 Catch:{ all -> 0x057a, all -> 0x057f }
        android.util.Log.d(r5, r7);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r5 = new com.google.android.gms.peerdownloadmanager.c.c;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r5.<init>(r6);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r5 = com.google.common.f.a.av.a(r5);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r6 = r6.f27885r;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r6.post(r5);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r6 = f28259c;	 Catch:{ InterruptedException -> 0x063f, TimeoutException -> 0x064b, ExecutionException -> 0x0649 }
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ InterruptedException -> 0x063f, TimeoutException -> 0x064b, ExecutionException -> 0x0649 }
        r5.get(r6, r10);	 Catch:{ InterruptedException -> 0x063f, TimeoutException -> 0x064b, ExecutionException -> 0x0649 }
        com.google.android.gms.peerdownloadmanager.p289a.C5347b.m26071a(r23);	 Catch:{ InterruptedException -> 0x063f, TimeoutException -> 0x064b, ExecutionException -> 0x0649 }
        r5 = "PdmTransfer";	 Catch:{ InterruptedException -> 0x063f, TimeoutException -> 0x064b, ExecutionException -> 0x0649 }
        r6 = "runSession: session stopped";	 Catch:{ InterruptedException -> 0x063f, TimeoutException -> 0x064b, ExecutionException -> 0x0649 }
        android.util.Log.d(r5, r6);	 Catch:{ InterruptedException -> 0x063f, TimeoutException -> 0x064b, ExecutionException -> 0x0649 }
    L_0x061f:
        r6 = java.lang.System.currentTimeMillis();	 Catch:{ all -> 0x057a, all -> 0x057f }
        r6 = r6 - r8;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r0 = r23;	 Catch:{ all -> 0x057a, all -> 0x057f }
        com.google.android.gms.peerdownloadmanager.service.C5499c.m26388a(r0, r4, r6);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r4 = 0;
        f28260e = r4;	 Catch:{ all -> 0x057a, all -> 0x057f }
        r0 = r23;	 Catch:{ all -> 0x058f }
        r4 = r0.f28261d;	 Catch:{ all -> 0x058f }
        r0 = r23;	 Catch:{ all -> 0x058f }
        r0.unregisterReceiver(r4);	 Catch:{ all -> 0x058f }
        r4 = 0;	 Catch:{ all -> 0x058f }
        r0 = r23;	 Catch:{ all -> 0x058f }
        r0.f28261d = r4;	 Catch:{ all -> 0x058f }
        com.google.android.gms.peerdownloadmanager.service.C5499c.m26387a(r23);	 Catch:{ InterruptedException -> 0x00e7, all -> 0x00e2 }
        goto L_0x037a;
    L_0x063f:
        r4 = move-exception;
    L_0x0640:
        r5 = "PdmTransfer";	 Catch:{ all -> 0x057a, all -> 0x057f }
        r6 = "runSession: error during stop";	 Catch:{ all -> 0x057a, all -> 0x057f }
        android.util.Log.e(r5, r6, r4);	 Catch:{ all -> 0x057a, all -> 0x057f }
        r4 = 5;
        goto L_0x061f;
    L_0x0649:
        r4 = move-exception;
        goto L_0x0640;
    L_0x064b:
        r4 = move-exception;
        goto L_0x0640;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.peerdownloadmanager.service.PdmTransferIntentOperation.onHandleIntent(android.content.Intent):void");
    }

    public void onCreate() {
        super.onCreate();
        Log.d("PdmTransfer", "onCreate() called.");
        registerReceiver(this.f28262f, f28258b);
    }

    public void onDestroy() {
        Log.d("PdmTransfer", "onDestroy() called.");
        C5498b c5498b = this.f28261d;
        if (c5498b != null) {
            c5498b.m26385a();
        }
        unregisterReceiver(this.f28262f);
        super.onDestroy();
    }

    private final int m26384a(Scheduler scheduler, au auVar, bf bfVar) {
        Throwable e;
        try {
            if (((Boolean) auVar.get(f28259c, TimeUnit.MILLISECONDS)).booleanValue()) {
                boolean z;
                boolean z2;
                boolean z3;
                boolean z4;
                int i = scheduler.f27925m;
                C5347b.m26072a(this, true);
                Intent intent = new Intent(this, PdmTransferIntentReceiver.class);
                intent.setAction("RESET_STATE");
                PendingIntent broadcast = PendingIntent.getBroadcast(this, 1, intent, 134217728);
                long currentTimeMillis = System.currentTimeMillis() + ((long) (i * 1000));
                Log.d("PdmCleanup", "Scheduling cleanup for: " + currentTimeMillis);
                C5347b.m26074c(this).m23265a(currentTimeMillis, broadcast);
                if (getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
                    z = true;
                } else {
                    z = false;
                }
                if (VERSION.SDK_INT < 21 || !BluetoothAdapter.getDefaultAdapter().isMultipleAdvertisementSupported()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (getPackageManager().hasSystemFeature("android.hardware.wifi")) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (getPackageManager().hasSystemFeature("android.hardware.wifi.direct")) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Log.d("PdmTransfer", "DeviceInfo: " + z + " " + z2 + " " + z3 + " " + z4);
                C5387r c5387r = new C5387r(z, z2, z3, z4);
                C5494b c5494b = new C5494b(this);
                try {
                    long j = C5499c.f28267b;
                    SQLiteDatabase writableDatabase = c5494b.f28255a.getWritableDatabase();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("run_id", Long.valueOf(j));
                    contentValues.put("ble", Integer.valueOf(c5387r.f27984a ? 1 : 0));
                    String str = "ble_beacon";
                    if (c5387r.f27985b) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    contentValues.put(str, Integer.valueOf(i));
                    str = "wifi";
                    if (c5387r.f27986c) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    contentValues.put(str, Integer.valueOf(i));
                    str = "wifi_hotspot";
                    if (c5387r.f27987d) {
                        i = 1;
                    } else {
                        i = 0;
                    }
                    contentValues.put(str, Integer.valueOf(i));
                    writableDatabase.insert("device_info", null, contentValues);
                } catch (Throwable e2) {
                    Log.w("PdmTransfer", "sqlite error, device info not logged", e2);
                }
                c5494b.f28255a.close();
                Log.d("PdmTransfer", "getSessionShutdownReason: discoveryTimeout: " + scheduler.f27926n);
                try {
                    bfVar.get((long) scheduler.f27925m, TimeUnit.SECONDS);
                    return 3;
                } catch (InterruptedException e3) {
                    Log.e("PdmTransfer", "getSessionShutdownReason: canceled early");
                    return 1;
                } catch (Throwable e22) {
                    Log.e("PdmTransfer", "getSessionShutdownReason: error, this shouldn't happen", e22);
                    return 1;
                } catch (TimeoutException e4) {
                    Log.e("PdmTransfer", "getSessionShutdownReason: timeout");
                    return 1;
                }
            }
            Log.d("PdmTransfer", "getSessionShutdownReason: failed to start download manager");
            return 4;
        } catch (InterruptedException e5) {
            e22 = e5;
            Log.e("PdmTransfer", "runSession: error during start", e22);
            return 4;
        } catch (ExecutionException e6) {
            e22 = e6;
            Log.e("PdmTransfer", "runSession: error during start", e22);
            return 4;
        } catch (TimeoutException e7) {
            e22 = e7;
            Log.e("PdmTransfer", "runSession: error during start", e22);
            return 4;
        }
    }
}
