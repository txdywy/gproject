package com.google.android.gms.peerdownloadmanager.service;

import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import com.google.android.gms.peerdownloadmanager.common.C5371a;
import com.google.android.gms.peerdownloadmanager.common.C5379j;
import com.google.android.gms.peerdownloadmanager.common.C5389t;
import com.google.android.gms.peerdownloadmanager.common.C5390u;
import com.google.android.gms.peerdownloadmanager.p302f.C5494b;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public final class C5500d implements C5379j {
    public final long f28268a = TimeUnit.MINUTES.toMillis(1);
    public final SparseBooleanArray f28269b = new SparseBooleanArray();
    public final SparseBooleanArray f28270c = new SparseBooleanArray();
    public final SparseArray f28271d = new SparseArray();
    public final SparseArray f28272e = new SparseArray();
    public final SparseLongArray f28273f = new SparseLongArray();
    public final SparseLongArray f28274g = new SparseLongArray();
    public final SparseLongArray f28275h = new SparseLongArray();
    public final SparseLongArray f28276i = new SparseLongArray();
    public final SparseIntArray f28277j = new SparseIntArray();
    public final Set f28278k = new HashSet();
    public final C5494b f28279l;
    public int f28280m = 0;
    public int f28281n = 0;

    C5500d(C5494b c5494b) {
        this.f28279l = c5494b;
    }

    public final void mo5026a() {
    }

    public final void mo5034b() {
    }

    public final void mo5033a(boolean z) {
        Log.d("PdmTransfer", "PeerFound: " + z);
        if (z) {
            this.f28281n++;
        }
        this.f28280m++;
    }

    public final void mo5031a(int i, String str, boolean z) {
        Log.d("PdmTransfer", "Meeting begins: " + i + " " + z);
        this.f28270c.put(i, z);
        this.f28269b.put(i, !this.f28278k.add(str));
        if (this.f28271d.get(i) == null) {
            this.f28271d.put(i, new HashMap());
        }
        if (this.f28272e.get(i) == null) {
            this.f28272e.put(i, new HashMap());
        }
    }

    public final void mo5035c() {
    }

    public final void mo5036d() {
    }

    public final void mo5028a(int i, long j, int i2) {
        this.f28276i.put(i, j);
        this.f28277j.put(i, i2);
    }

    public final void mo5030a(int i, C5371a c5371a, Collection collection, Collection collection2) {
        String valueOf = String.valueOf(c5371a);
        int size = collection.size();
        Log.d("PdmTransfer", new StringBuilder(String.valueOf(valueOf).length() + 75).append("Meeting ").append(i).append(" for app ").append(valueOf).append(" would receive ").append(size).append(" and send ").append(collection2.size()).toString());
        if (!((Map) this.f28271d.get(i)).containsKey(c5371a.toString())) {
            ((Map) this.f28271d.get(i)).put(c5371a.toString(), new HashSet());
        }
        ((Collection) ((Map) this.f28271d.get(i)).get(c5371a.toString())).addAll(collection);
        if (!((Map) this.f28272e.get(i)).containsKey(c5371a.toString())) {
            ((Map) this.f28272e.get(i)).put(c5371a.toString(), new HashSet());
        }
        ((Collection) ((Map) this.f28272e.get(i)).get(c5371a.toString())).addAll(collection2);
    }

    public final void mo5029a(int i, C5371a c5371a, long j, long j2, long j3, boolean z, boolean z2) {
        String valueOf = String.valueOf(c5371a);
        Log.d("PdmTransfer", new StringBuilder(String.valueOf(valueOf).length() + 109).append("Meeting ").append(i).append(" for app ").append(valueOf).append(" done: ").append(j).append(" ").append(j2).append(" ").append(j3).append(" ").append(z).append(" ").append(z2).toString());
        this.f28273f.put(i, this.f28273f.get(i, 0) + j2);
        this.f28274g.put(i, this.f28274g.get(i, 0) + j3);
        this.f28275h.put(i, this.f28275h.get(i, 0) + j);
    }

    public final void mo5027a(int i, long j) {
        C5390u c5390u = new C5390u((Map) this.f28272e.get(i), (Map) this.f28271d.get(i), this.f28274g.get(i), this.f28273f.get(i), j, this.f28270c.get(i), this.f28275h.get(i), this.f28269b.get(i), this.f28276i.get(i), this.f28277j.get(i));
        int size = c5390u.f27995a.size();
        int size2 = c5390u.f27996b.size();
        long j2 = c5390u.f27997c;
        long j3 = c5390u.f27998d;
        long j4 = c5390u.f27999e;
        boolean z = c5390u.f28000f;
        long j5 = c5390u.f28001g;
        boolean z2 = c5390u.f28002h;
        long j6 = c5390u.f28003i;
        Log.d("PdmTransfer", "Meeting " + i + " done: " + size + " " + size2 + " " + j2 + " " + j3 + " " + j4 + " " + z + " " + j5 + " " + z2 + " " + j6 + " " + c5390u.f28004j);
        try {
            this.f28279l.m26379a(C5499c.f28267b, c5390u);
        } catch (Throwable e) {
            Log.w("PdmTransfer", "sqlite error, meeting not logged", e);
        }
    }

    public final void mo5032a(long j) {
        C5389t c5389t = new C5389t(this.f28280m, this.f28281n, j, this.f28268a);
        int i = this.f28280m;
        int i2 = this.f28281n;
        Log.d("PdmTransfer", "StopDiscovery " + i + " " + i2 + " " + j + " " + this.f28268a);
        try {
            this.f28279l.m26378a(C5499c.f28267b, c5389t);
        } catch (Throwable e) {
            Log.w("PdmTransfer", "sqlite error, discovery not logged", e);
        }
    }

    public final void mo5037e() {
        C5389t c5389t = new C5389t(this.f28280m, this.f28281n, 0, this.f28268a);
        int i = this.f28280m;
        int i2 = this.f28281n;
        Log.d("PdmTransfer", "StopDiscovery " + i + " " + i2 + " 0 " + this.f28268a);
        try {
            this.f28279l.m26378a(C5499c.f28267b, c5389t);
        } catch (Throwable e) {
            Log.w("PdmTransfer", "sqlite error, discovery not logged", e);
        }
    }

    public final void mo5038f() {
    }

    public final void mo5039g() {
        this.f28279l.f28255a.close();
    }
}
