package com.google.android.gms.peerdownloadmanager.comms.rpc;

import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.peerdownloadmanager.common.C5363f;
import com.google.android.gms.peerdownloadmanager.common.C5371a;
import com.google.android.gms.peerdownloadmanager.common.C5374d;
import com.google.android.gms.peerdownloadmanager.common.C5384o;
import com.google.android.gms.peerdownloadmanager.common.aa;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5400g;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5403e;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5404f;
import com.google.android.gms.peerdownloadmanager.comms.p294a.C5406i;
import com.google.android.gms.peerdownloadmanager.comms.p298e.C5433b;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5444b;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5445c;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5450h;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5451i;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5452j;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5453k;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5454l;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5456n;
import com.google.android.gms.peerdownloadmanager.comms.rpc.p300b.C5457o;
import com.google.android.gms.peerdownloadmanager.p301e.C5485a;
import com.google.android.gms.peerdownloadmanager.p301e.C5489e;
import com.google.android.gms.peerdownloadmanager.p301e.C5490f;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.at;
import com.google.protobuf.au;
import com.google.protobuf.ay;
import com.google.protobuf.bh;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class CommsRunnable extends C5436b {
    public static final int f28112n = ((int) TimeUnit.MINUTES.toSeconds(5));
    public static final Set f28113o = Collections.synchronizedSet(new HashSet());
    public OutputStream f28114A;
    public final C5400g f28115B;
    public C5403e f28116C;
    public Collection f28117D;
    public C5457o f28118E;
    public String f28119F;
    public final Set f28120G = new HashSet();
    public final C5485a f28121p;
    public final Handler f28122q = new Handler();
    public final C5366t f28123r;
    public final C5404f f28124s;
    public final C5363f f28125t;
    public final boolean f28126u;
    public final String f28127v;
    public final C5354j f28128w;
    public final ReentrantReadWriteLock f28129x;
    public final C5462f f28130y;
    public InputStream f28131z;

    public class PDMConnectionException extends Exception {
        PDMConnectionException(String str) {
            super(str);
        }
    }

    CommsRunnable(C5485a c5485a, ReentrantReadWriteLock reentrantReadWriteLock, C5366t c5366t, C5400g c5400g, C5403e c5403e, C5404f c5404f, C5363f c5363f, String str, C5354j c5354j, boolean z, C5462f c5462f) {
        this.f28121p = c5485a;
        this.f28129x = reentrantReadWriteLock;
        this.f28123r = c5366t;
        this.f28124s = c5404f;
        this.f28125t = c5363f;
        this.f28116C = c5403e;
        this.f28115B = c5400g;
        this.f28126u = z;
        this.f28128w = c5354j;
        this.f28127v = str;
        this.f28130y = c5462f;
    }

    final void m26285f() {
        String str = this.f28126u ? "MASTER" : "SERVER";
        String a = this.f28126u ? this.f28127v : this.f28115B.mo4985a();
        String a2 = !this.f28126u ? this.f28127v : this.f28115B.mo4985a();
        long j = this.f28100b;
        this.f28119F = String.format("%.4s %s %s -> %s: ", new Object[]{"[" + j + "] ", str, a, a2});
        C5363f c5363f = this.f28125t;
        toString();
        c5363f.mo4973a();
        int i = C5374d.f27943a;
        this.f28108j = SystemClock.elapsedRealtime();
        super.m26261a(i, this.f28105g);
        m26276h();
    }

    private final void m26276h() {
        if (this.f28128w != null) {
            this.f28122q.post(new C5467k(this));
        }
    }

    private static int m26269a(Collection collection) {
        int i = 0;
        for (C5384o c5384o : collection) {
            i = c5384o.f27967b.size() + i;
        }
        return i;
    }

    public final void mo5006b() {
        int a;
        Throwable th;
        String d;
        String message;
        C5363f c5363f;
        String valueOf;
        long a2;
        C5489e c5489e;
        boolean z = false;
        if (f28113o.add(this.f28115B.mo4985a())) {
            Log.d("CommsRunnable", String.valueOf(mo5008d()).concat("starting"));
            C5485a c5485a;
            try {
                String a3;
                m26282b("establishConnection");
                if (this.f28116C != null) {
                    m26277i();
                    Log.d("CommsRunnable", String.valueOf(mo5008d()).concat("socket already connected"));
                } else {
                    Log.d("CommsRunnable", String.valueOf(mo5008d()).concat("connecting..."));
                    this.f28116C = this.f28124s.mo4987a(this.f28115B);
                    if (this.f28116C.mo5020c()) {
                        Log.d("CommsRunnable", String.valueOf(mo5008d()).concat("connected"));
                        m26277i();
                    } else {
                        throw new PDMConnectionException("Couldn't connect to peer, it's probably not running PDM");
                    }
                }
                try {
                    c5485a = this.f28121p;
                    a3 = this.f28115B.mo4985a();
                    boolean z2 = this.f28126u;
                    C5489e c5489e2 = c5485a.f28237d;
                    c5489e2.f28242a++;
                    if (z2) {
                        C5490f c5490f = c5485a.f28238e;
                        c5490f.f28250c++;
                    }
                    a = c5485a.m26358a();
                    c5485a.f28240g.mo5031a(a, a3, z2);
                } catch (Throwable th2) {
                    th = th2;
                    a = -1;
                    z = true;
                    try {
                        if (th instanceof PDMConnectionException) {
                            Log.e("CommsRunnable", String.valueOf(mo5008d()).concat("finished: failure"), th);
                        } else {
                            d = mo5008d();
                            message = th.getMessage();
                            Log.d("CommsRunnable", new StringBuilder((String.valueOf(d).length() + 20) + String.valueOf(message).length()).append(d).append("finished: failure (").append(message).append(")").toString());
                        }
                        c5363f = this.f28125t;
                        d = "failed, ";
                        valueOf = String.valueOf(th.getMessage());
                        if (valueOf.length() != 0) {
                            valueOf = new String(d);
                        } else {
                            d.concat(valueOf);
                        }
                        c5363f.mo4974b();
                        m26271a(z);
                        if (a != -1) {
                            c5485a = this.f28121p;
                            a2 = c5485a.m26359a(a);
                            c5489e = c5485a.f28237d;
                            c5489e.f28246e++;
                            c5485a.f28240g.mo5027a(a, a2);
                        }
                        this.f28130y.m26329b(this);
                        f28113o.remove(this.f28115B.mo4985a());
                        m26276h();
                        return;
                    } catch (Throwable th3) {
                        this.f28130y.m26329b(this);
                        f28113o.remove(this.f28115B.mo4985a());
                        m26276h();
                    }
                }
                try {
                    boolean z3;
                    m26282b("exchangeNeededResources");
                    this.f28117D = this.f28123r.mo4977a();
                    a3 = mo5008d();
                    Log.v("CommsRunnable", new StringBuilder(String.valueOf(a3).length() + 41).append(a3).append("num resources needed locally: ").append(m26269a(this.f28117D)).toString());
                    Collection b = m26273b(this.f28117D);
                    String d2 = mo5008d();
                    Log.v("CommsRunnable", new StringBuilder(String.valueOf(d2).length() + 41).append(d2).append("num resources needed by peer: ").append(m26269a(b)).toString());
                    m26282b("filterByAssets");
                    Collection a4 = this.f28123r.mo4978a(b);
                    a3 = mo5008d();
                    Log.v("CommsRunnable", new StringBuilder(String.valueOf(a3).length() + 42).append(a3).append("num resources matched locally: ").append(m26269a(a4)).toString());
                    b = m26274c(a4);
                    d2 = mo5008d();
                    Log.v("CommsRunnable", new StringBuilder(String.valueOf(d2).length() + 42).append(d2).append("num resources offered by peer: ").append(b.size()).toString());
                    C5485a c5485a2 = this.f28121p;
                    C5489e c5489e3 = c5485a2.f28237d;
                    c5489e3.f28243b++;
                    c5485a2.f28240g.mo5035c();
                    Collection a5 = C5384o.m26158a(this.f28117D, b);
                    if (a4.isEmpty() && a5.isEmpty()) {
                        Log.v("CommsRunnable", String.valueOf(mo5008d()).concat("nothing to fetch or send, skipping fetchResources step"));
                        z3 = true;
                    } else {
                        c5485a = this.f28121p;
                        c5489e = c5485a.f28237d;
                        c5489e.f28244c++;
                        c5485a.f28240g.mo5036d();
                        m26278a("newTransferSocket");
                        Log.v("CommsRunnable", String.valueOf(mo5008d()).concat("upgrading socket bandwidth..."));
                        long currentTimeMillis = System.currentTimeMillis();
                        this.f28116C = this.f28124s.mo4988a(this, this.f28116C);
                        m26282b("initialize transfer");
                        C5485a c5485a3 = this.f28121p;
                        currentTimeMillis = System.currentTimeMillis() - currentTimeMillis;
                        int a6 = this.f28118E.m26325a();
                        C5489e c5489e4 = c5485a3.f28237d;
                        c5489e4.f28245d++;
                        c5485a3.f28240g.mo5028a(a, currentTimeMillis, a6);
                        Log.v("CommsRunnable", String.valueOf(mo5008d()).concat(" got transfer socket"));
                        z3 = m26272a(this.f28116C, a5, a4, new C5469l(this), a);
                        d2 = mo5008d();
                        Log.v("CommsRunnable", new StringBuilder(String.valueOf(d2).length() + 43).append(d2).append("fetch/transfer succeeded: allFinished=").append(z3).toString());
                        Log.d("CommsRunnable", "fetch finished, closing socket");
                        aa.m26135a(this.f28116C);
                    }
                    this.f28125t.mo4975c();
                    c5485a2 = this.f28121p;
                    a2 = c5485a2.m26359a(a);
                    c5485a2.f28237d.f28247f.add(Long.valueOf(a2));
                    c5485a2.f28240g.mo5027a(a, a2);
                    if (this.f28128w != null) {
                        this.f28122q.post(new C5470m(this, z3));
                    }
                    Log.d("CommsRunnable", String.valueOf(mo5008d()).concat("finished: success"));
                    this.f28130y.m26329b(this);
                    f28113o.remove(this.f28115B.mo4985a());
                    m26276h();
                    return;
                } catch (Throwable th4) {
                    th = th4;
                    z = true;
                    if (th instanceof PDMConnectionException) {
                        d = mo5008d();
                        message = th.getMessage();
                        Log.d("CommsRunnable", new StringBuilder((String.valueOf(d).length() + 20) + String.valueOf(message).length()).append(d).append("finished: failure (").append(message).append(")").toString());
                    } else {
                        Log.e("CommsRunnable", String.valueOf(mo5008d()).concat("finished: failure"), th);
                    }
                    c5363f = this.f28125t;
                    d = "failed, ";
                    valueOf = String.valueOf(th.getMessage());
                    if (valueOf.length() != 0) {
                        d.concat(valueOf);
                    } else {
                        valueOf = new String(d);
                    }
                    c5363f.mo4974b();
                    m26271a(z);
                    if (a != -1) {
                        c5485a = this.f28121p;
                        a2 = c5485a.m26359a(a);
                        c5489e = c5485a.f28237d;
                        c5489e.f28246e++;
                        c5485a.f28240g.mo5027a(a, a2);
                    }
                    this.f28130y.m26329b(this);
                    f28113o.remove(this.f28115B.mo4985a());
                    m26276h();
                    return;
                }
            } catch (Throwable th5) {
                th = th5;
                a = -1;
                if (th instanceof PDMConnectionException) {
                    d = mo5008d();
                    message = th.getMessage();
                    Log.d("CommsRunnable", new StringBuilder((String.valueOf(d).length() + 20) + String.valueOf(message).length()).append(d).append("finished: failure (").append(message).append(")").toString());
                } else {
                    Log.e("CommsRunnable", String.valueOf(mo5008d()).concat("finished: failure"), th);
                }
                c5363f = this.f28125t;
                d = "failed, ";
                valueOf = String.valueOf(th.getMessage());
                if (valueOf.length() != 0) {
                    d.concat(valueOf);
                } else {
                    valueOf = new String(d);
                }
                c5363f.mo4974b();
                m26271a(z);
                if (a != -1) {
                    c5485a = this.f28121p;
                    a2 = c5485a.m26359a(a);
                    c5489e = c5485a.f28237d;
                    c5489e.f28246e++;
                    c5485a.f28240g.mo5027a(a, a2);
                }
                this.f28130y.m26329b(this);
                f28113o.remove(this.f28115B.mo4985a());
                m26276h();
                return;
            }
        }
        Log.d("CommsRunnable", String.valueOf(mo5008d()).concat("skipped due to concurrently active connection with peer"));
        m26271a(false);
        m26276h();
    }

    private final void m26271a(boolean z) {
        if (this.f28128w != null) {
            this.f28122q.post(new C5471n(this, z));
        }
    }

    private final void m26277i() {
        C5433b c5433b = new C5433b(this.f28116C.mo5018a(), this.f28116C.mo5019b());
        Log.d("CommsRunnable", "establishConnection: establishing shared secret...");
        Log.d("CommsRunnable", "establishConnection: established shared secret of length " + c5433b.m26258a().length);
        if (c5433b.f28094e == null) {
            throw new IllegalStateException("establishSharedSecret() must be called first");
        }
        this.f28114A = c5433b.f28091b;
        if (c5433b.f28094e == null) {
            throw new IllegalStateException("establishSharedSecret() must be called first");
        }
        this.f28131z = c5433b.f28090a;
    }

    private final Collection m26273b(Collection collection) {
        String d;
        try {
            Log.d("CommsRunnable", String.valueOf(mo5008d()).concat("exchangeNeededResources"));
            m26282b("write needed resources list");
            au d2 = m26275d(collection);
            C5454l b = this.f28124s.mo4991b();
            d2.b();
            C5452j c5452j = (C5452j) d2.b;
            if (b == null) {
                throw new NullPointerException();
            }
            at atVar;
            c5452j.f28165c = b;
            Log.v("CommsRunnable", String.valueOf(mo5008d()).concat("Writing Resources protobuf"));
            if (d2.c) {
                atVar = d2.b;
            } else {
                atVar = d2.b;
                atVar.a(ay.e, null, null);
                atVar.h.f = false;
                d2.c = true;
                atVar = d2.b;
            }
            atVar = atVar;
            if (at.a(atVar, Boolean.TRUE.booleanValue())) {
                C5454l c5454l;
                c5452j = (C5452j) atVar;
                OutputStream outputStream = this.f28114A;
                int a = c5452j.a();
                CodedOutputStream a2 = CodedOutputStream.a(outputStream, CodedOutputStream.a(CodedOutputStream.s(a) + a));
                a2.c(a);
                c5452j.a(a2);
                a2.h();
                this.f28114A.flush();
                Log.v("CommsRunnable", String.valueOf(mo5008d()).concat("Reading Resources protobuf"));
                m26282b("read needed resources list");
                c5452j = (C5452j) C5406i.m26183a((C5452j) C5452j.a(C5452j.f28161d, this.f28131z));
                Log.v("CommsRunnable", String.valueOf(mo5008d()).concat("processing transfer types"));
                m26282b("processTransferOffer");
                C5404f c5404f = this.f28124s;
                if (c5452j.f28165c == null) {
                    c5454l = C5454l.f28167d;
                } else {
                    c5454l = c5452j.f28165c;
                }
                this.f28118E = c5404f.mo4989a(c5454l);
                d = mo5008d();
                Log.v("CommsRunnable", new StringBuilder(String.valueOf(d).length() + 52).append(d).append("extracting keys from ").append(c5452j.f28164b.size()).append("  incoming resources").toString());
                return m26270a(c5452j);
            }
            throw new UninitializedMessageException();
        } catch (IOException e) {
            d = mo5008d();
            String message = e.getMessage();
            Log.e("CommsRunnable", new StringBuilder((String.valueOf(d).length() + 48) + String.valueOf(message).length()).append(d).append(" failed to exchange needed resources with peer: ").append(message).toString());
            throw e;
        }
    }

    private final Collection m26274c(Collection collection) {
        try {
            at atVar;
            au d = m26275d(collection);
            au a = ((C5456n) ((au) C5454l.f28167d.a(ay.g, null, null))).m26323a(this.f28118E);
            d.b();
            C5452j c5452j = (C5452j) d.b;
            if (a.c) {
                atVar = a.b;
            } else {
                at atVar2 = a.b;
                atVar2.a(ay.e, null, null);
                atVar2.h.f = false;
                a.c = true;
                atVar = a.b;
            }
            atVar = atVar;
            if (at.a(atVar, Boolean.TRUE.booleanValue())) {
                at atVar3;
                c5452j.f28165c = (C5454l) atVar;
                m26282b("write offered resources");
                if (d.c) {
                    atVar3 = d.b;
                } else {
                    atVar3 = d.b;
                    atVar3.a(ay.e, null, null);
                    atVar3.h.f = false;
                    d.c = true;
                    atVar3 = d.b;
                }
                atVar3 = atVar3;
                if (at.a(atVar3, Boolean.TRUE.booleanValue())) {
                    C5454l c5454l;
                    c5452j = (C5452j) atVar3;
                    OutputStream outputStream = this.f28114A;
                    int a2 = c5452j.a();
                    CodedOutputStream a3 = CodedOutputStream.a(outputStream, CodedOutputStream.a(CodedOutputStream.s(a2) + a2));
                    a3.c(a2);
                    c5452j.a(a3);
                    a3.h();
                    this.f28114A.flush();
                    m26282b("read offered resources");
                    c5452j = (C5452j) C5406i.m26183a((C5452j) C5452j.a(C5452j.f28161d, this.f28131z));
                    m26282b("read transfer decision");
                    if (c5452j.f28165c == null) {
                        c5454l = C5454l.f28167d;
                    } else {
                        c5454l = c5452j.f28165c;
                    }
                    switch (c5454l.f28169a.size()) {
                        case 0:
                            throw new IOException("Peer did not agree to any transfer type.");
                        case 1:
                            C5457o c5457o = this.f28118E;
                            if (c5452j.f28165c == null) {
                                c5454l = C5454l.f28167d;
                            } else {
                                c5454l = c5452j.f28165c;
                            }
                            if (c5457o == ((C5457o) C5454l.f28166b.a(Integer.valueOf(c5454l.f28169a.c(0))))) {
                                return m26270a(c5452j);
                            }
                            throw new IOException("Peer settled on a different transfer type than it.");
                        default:
                            throw new IOException("Peer returned too many transfer types.");
                    }
                }
                throw new UninitializedMessageException();
            }
            throw new UninitializedMessageException();
        } catch (Throwable e) {
            Log.e("CommsRunnable", String.valueOf(mo5008d()).concat("Failed to exchange offerable resources with peer."), e);
            throw e;
        }
    }

    private final boolean m26272a(C5403e c5403e, Collection collection, Collection collection2, C5468p c5468p, int i) {
        Throwable e;
        Closeable closeable;
        try {
            InputStream a = c5403e.mo5018a();
            OutputStream b = c5403e.mo5019b();
            Map a2 = C5384o.m26159a(collection);
            Map a3 = C5384o.m26159a(collection2);
            Collection hashSet = new HashSet(a2.keySet());
            hashSet.addAll(a3.keySet());
            Collection arrayList = new ArrayList(hashSet);
            Collections.sort(arrayList, C5472o.f28214a);
            ArrayDeque arrayDeque = new ArrayDeque(arrayList);
            if (!arrayDeque.isEmpty()) {
                C5371a c5371a = (C5371a) arrayDeque.removeFirst();
                if (c5468p.mo5023a(c5371a)) {
                    Object obj;
                    Object obj2;
                    String valueOf = String.valueOf(c5371a);
                    Log.d("CommsRunnable", new StringBuilder(String.valueOf(valueOf).length() + 14).append("streaming for ").append(valueOf).toString());
                    if (a2.containsKey(c5371a)) {
                        obj = (List) a2.get(c5371a);
                    } else {
                        List emptyList = Collections.emptyList();
                    }
                    if (a3.containsKey(c5371a)) {
                        obj2 = (List) a3.get(c5371a);
                    } else {
                        obj2 = Collections.emptyList();
                    }
                    this.f28123r.mo4979a(c5371a);
                    Closeable a4;
                    try {
                        C5485a c5485a = this.f28121p;
                        c5485a.f28240g.mo5030a(i, c5371a, obj, obj2);
                        int a5 = c5485a.m26358a();
                        a4 = this.f28123r.mo4976a(c5371a, obj, obj2, this.f28126u);
                        if (a4 == null) {
                            try {
                                this.f28121p.m26360a(i, c5371a, a5, 0, 0, true, true);
                                throw new ClosedChannelException();
                            } catch (IOException e2) {
                                e = e2;
                                closeable = a4;
                                try {
                                    valueOf = String.valueOf(c5371a);
                                    Log.e("CommsRunnable", new StringBuilder(String.valueOf(valueOf).length() + 27).append("unable to open channel for ").append(valueOf).toString(), e);
                                    aa.m26135a(closeable);
                                    this.f28123r.mo4981b(c5371a);
                                    return arrayDeque.isEmpty();
                                } catch (Throwable th) {
                                    e = th;
                                    a4 = closeable;
                                    aa.m26135a(a4);
                                    this.f28123r.mo4981b(c5371a);
                                    throw e;
                                }
                            } catch (Throwable th2) {
                                e = th2;
                                aa.m26135a(a4);
                                this.f28123r.mo4981b(c5371a);
                                throw e;
                            }
                        }
                        String valueOf2 = String.valueOf(c5371a);
                        Log.d("CommsRunnable", new StringBuilder(String.valueOf(valueOf2).length() + 19).append("channel opened for ").append(valueOf2).toString());
                        ab a6 = C5478x.m26354a(c5371a, a4, a, b, f28112n);
                        valueOf2 = String.valueOf(c5371a);
                        Log.d("CommsRunnable", new StringBuilder(String.valueOf(valueOf2).length() + 23).append("streaming finished for ").append(valueOf2).toString());
                        if (a6 != null && a6.mo5010a().f28136a && a6.mo5011b().f28136a) {
                            valueOf2 = String.valueOf(a6.mo5010a());
                            valueOf = String.valueOf(a6.mo5011b());
                            Log.d("CommsRunnable", new StringBuilder((String.valueOf(valueOf2).length() + 52) + String.valueOf(valueOf).length()).append("egress stats: ").append(valueOf2).append(", ingress stats: ").append(valueOf).append(", app finished: ").append(a6.mo5012c()).toString());
                            int i2 = i;
                            this.f28121p.m26360a(i2, c5371a, a5, a6.mo5011b().f28138c, a6.mo5010a().f28137b, a6.mo5012c(), false);
                            if (!a6.mo5012c()) {
                                valueOf2 = String.valueOf(c5371a);
                                Log.d("CommsRunnable", new StringBuilder(String.valueOf(valueOf2).length() + 30).append(valueOf2).append(" not finished, adding to queue").toString());
                                arrayDeque.addLast(c5371a);
                            }
                            aa.m26135a(a4);
                            this.f28123r.mo4981b(c5371a);
                        } else {
                            long j;
                            long j2;
                            valueOf2 = String.valueOf(c5371a);
                            Log.d("CommsRunnable", new StringBuilder(String.valueOf(valueOf2).length() + 38).append("aborting streaming due to failure for ").append(valueOf2).toString());
                            if (a6 == null) {
                                j = 0;
                            } else {
                                j = a6.mo5011b().f28138c;
                            }
                            if (a6 == null) {
                                j2 = 0;
                            } else {
                                j2 = a6.mo5010a().f28137b;
                            }
                            this.f28121p.m26360a(i, c5371a, a5, j, j2, false, true);
                            aa.m26135a(a4);
                            this.f28123r.mo4981b(c5371a);
                            return false;
                        }
                    } catch (IOException e3) {
                        e = e3;
                        closeable = null;
                        valueOf = String.valueOf(c5371a);
                        Log.e("CommsRunnable", new StringBuilder(String.valueOf(valueOf).length() + 27).append("unable to open channel for ").append(valueOf).toString(), e);
                        aa.m26135a(closeable);
                        this.f28123r.mo4981b(c5371a);
                        return arrayDeque.isEmpty();
                    } catch (Throwable th3) {
                        e = th3;
                        a4 = null;
                        aa.m26135a(a4);
                        this.f28123r.mo4981b(c5371a);
                        throw e;
                    }
                }
                Log.d("CommsRunnable", "controller requested to stop streaming early");
                return false;
            }
            return arrayDeque.isEmpty();
        } catch (Throwable e4) {
            Log.e("CommsRunnable", "socket is closed", e4);
            return false;
        }
    }

    public final boolean mo5005a(C5461e c5461e) {
        if (!super.mo5005a(c5461e)) {
            return false;
        }
        if (this.f28116C != null) {
            this.f28116C.mo5022e();
        }
        for (Closeable a : this.f28120G) {
            aa.m26135a(a);
        }
        return true;
    }

    protected final void mo5007c() {
        super.mo5007c();
        aa.m26135a(this.f28116C);
        this.f28116C = null;
    }

    private static C5453k m26275d(Collection collection) {
        C5453k c5453k = (C5453k) ((au) C5452j.f28161d.a(ay.g, null, null));
        for (C5384o c5384o : collection) {
            C5451i c5451i = (C5451i) ((au) C5450h.f28156d.a(ay.g, null, null));
            C5445c c5445c = (C5445c) ((au) C5444b.f28143c.a(ay.g, null, null));
            C5371a c5371a = c5384o.f27966a;
            String str = c5371a.f27935a;
            c5445c.b();
            C5444b c5444b = (C5444b) c5445c.b;
            if (str == null) {
                throw new NullPointerException();
            }
            c5444b.f28145a = str;
            String str2 = c5371a.f27936b;
            c5445c.b();
            c5444b = (C5444b) c5445c.b;
            if (str2 == null) {
                throw new NullPointerException();
            }
            at atVar;
            c5444b.f28146b = str2;
            c5451i.b();
            C5450h c5450h = (C5450h) c5451i.b;
            if (c5445c.c) {
                atVar = c5445c.b;
            } else {
                at atVar2 = c5445c.b;
                atVar2.a(ay.e, null, null);
                atVar2.h.f = false;
                c5445c.c = true;
                atVar = c5445c.b;
            }
            atVar = atVar;
            if (at.a(atVar, Boolean.TRUE.booleanValue())) {
                at atVar3;
                c5450h.f28160c = (C5444b) atVar;
                for (String str3 : c5384o.f27967b) {
                    c5451i.b();
                    C5450h c5450h2 = (C5450h) c5451i.b;
                    if (str3 == null) {
                        throw new NullPointerException();
                    }
                    if (!c5450h2.f28159b.a()) {
                        c5450h2.f28159b = at.a(c5450h2.f28159b);
                    }
                    c5450h2.f28159b.add(str3);
                }
                c5453k.b();
                C5452j c5452j = (C5452j) c5453k.b;
                if (!c5452j.f28164b.a()) {
                    c5452j.f28164b = at.a(c5452j.f28164b);
                }
                bh bhVar = c5452j.f28164b;
                if (c5451i.c) {
                    atVar3 = c5451i.b;
                } else {
                    atVar3 = c5451i.b;
                    atVar3.a(ay.e, null, null);
                    atVar3.h.f = false;
                    c5451i.c = true;
                    atVar3 = c5451i.b;
                }
                atVar3 = atVar3;
                if (at.a(atVar3, Boolean.TRUE.booleanValue())) {
                    bhVar.add((C5450h) atVar3);
                } else {
                    throw new UninitializedMessageException();
                }
            }
            throw new UninitializedMessageException();
        }
        return c5453k;
    }

    private static Collection m26270a(C5452j c5452j) {
        Collection arrayList = new ArrayList();
        for (C5450h c5450h : c5452j.f28164b) {
            C5444b c5444b;
            if (c5450h.f28160c == null) {
                c5444b = C5444b.f28143c;
            } else {
                c5444b = c5450h.f28160c;
            }
            C5384o c5384o = new C5384o(C5371a.m26134a(c5444b.f28145a, c5444b.f28146b));
            for (String a : c5450h.f28159b) {
                c5384o.m26160a(a);
            }
            arrayList.add(c5384o);
        }
        return arrayList;
    }

    public final void m26286g() {
        if (this.f28126u) {
            Log.d("CommsRunnable", String.valueOf(mo5008d()).concat("releaseTransferLock: MASTER unlocked"));
            this.f28129x.readLock().unlock();
            return;
        }
        Log.d("CommsRunnable", String.valueOf(mo5008d()).concat("releaseTransferLock: SERVER unlocked"));
        this.f28129x.writeLock().unlock();
    }

    public final String toString() {
        String str = this.f28126u ? "MASTER" : "SERVER";
        String a = this.f28115B.mo4985a();
        return new StringBuilder((String.valueOf(str).length() + 8) + String.valueOf(a).length()).append("Comms{").append(str).append(" ").append(a).append("}").toString();
    }

    public final String mo5008d() {
        return this.f28119F;
    }

    public final void m26278a(String str) {
        m26260a();
        m26262a(C5374d.f27945c, str);
        m26276h();
    }

    public final void m26282b(String str) {
        m26260a();
        m26262a(C5374d.f27944b, str);
        m26276h();
    }

    final /* synthetic */ boolean m26279a(C5371a c5371a) {
        try {
            long toMillis = TimeUnit.SECONDS.toMillis((long) ((f28112n + 5) + 5));
            String valueOf = String.valueOf(c5371a);
            valueOf = new StringBuilder(String.valueOf(valueOf).length() + 14).append("streaming for ").append(valueOf).toString();
            int i = (int) toMillis;
            m26260a();
            m26262a(i, valueOf);
            m26276h();
            return true;
        } catch (TimeoutException e) {
            Log.d("CommsRunnable", "time limit exceeded, stopping streaming");
            return false;
        }
    }
}
