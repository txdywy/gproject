package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.C5096b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C4931e;
import com.google.android.gms.common.api.C4949i;
import com.google.android.gms.common.api.C4954s;
import com.google.android.gms.common.api.C5056g;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.common.api.C5091z;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C4950g;
import com.google.android.gms.common.internal.C5118f;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.bd;
import com.google.android.gms.internal.cy;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;

public final class ac extends C5058o implements be {
    public final Lock f25643b;
    public boolean f25644c;
    public final C5118f f25645d;
    public bd f25646e = null;
    public final int f25647f;
    public final Context f25648g;
    public final Looper f25649h;
    public final Queue f25650i = new LinkedList();
    public volatile boolean f25651j;
    public long f25652k = 120000;
    public long f25653l = 5000;
    public final ah f25654m;
    public final C5096b f25655n;
    public ax f25656o;
    public final Map f25657p;
    public Set f25658q = new HashSet();
    public bd f25659r;
    public Map f25660s;
    public C4931e f25661t;
    public final bk f25662u = new bk();
    public final ArrayList f25663v;
    public Integer f25664w = null;
    public Set f25665x = null;
    public final bz f25666y;
    public final C4950g f25667z = new ad(this);

    public ac(Context context, Lock lock, Looper looper, bd bdVar, C5096b c5096b, C4931e c4931e, Map map, List list, List list2, Map map2, int i, int i2, ArrayList arrayList) {
        this.f25648g = context;
        this.f25643b = lock;
        this.f25644c = false;
        this.f25645d = new C5118f(looper, this.f25667z);
        this.f25649h = looper;
        this.f25654m = new ah(this, looper);
        this.f25655n = c5096b;
        this.f25647f = i;
        if (this.f25647f >= 0) {
            this.f25664w = Integer.valueOf(i2);
        }
        this.f25660s = map;
        this.f25657p = map2;
        this.f25663v = arrayList;
        this.f25666y = new bz(this.f25657p);
        for (Object obj : list) {
            C5118f c5118f = this.f25645d;
            am.m23733a(obj);
            synchronized (c5118f.f26038i) {
                if (c5118f.f26031b.contains(obj)) {
                    String valueOf = String.valueOf(obj);
                    Log.w("GmsClientEvents", new StringBuilder(String.valueOf(valueOf).length() + 62).append("registerConnectionCallbacks(): listener ").append(valueOf).append(" is already registered").toString());
                } else {
                    c5118f.f26031b.add(obj);
                }
            }
            if (c5118f.f26030a.mo4565j()) {
                c5118f.f26037h.sendMessage(c5118f.f26037h.obtainMessage(1, obj));
            }
        }
        for (C1634r a : list2) {
            this.f25645d.m23788a(a);
        }
        this.f25659r = bdVar;
        this.f25661t = c4931e;
    }

    public static int m23331a(Iterable iterable, boolean z) {
        int i = 0;
        int i2 = 0;
        for (C4949i c4949i : iterable) {
            if (c4949i.mo4826l()) {
                i2 = 1;
            }
            i = c4949i.mo4484c() ? 1 : i;
        }
        return i2 != 0 ? (i == 0 || !z) ? 1 : 2 : 3;
    }

    private final void m23334a(C5058o c5058o, bt btVar, boolean z) {
        cy.f26653d.mo4710a(c5058o).mo4490a(new ag(this, btVar, z, c5058o));
    }

    private final void m23335b(int i) {
        if (this.f25664w == null) {
            this.f25664w = Integer.valueOf(i);
        } else if (this.f25664w.intValue() != i) {
            String c = m23338c(i);
            String c2 = m23338c(this.f25664w.intValue());
            throw new IllegalStateException(new StringBuilder((String.valueOf(c).length() + 51) + String.valueOf(c2).length()).append("Cannot use sign-in mode: ").append(c).append(". Mode was already set to ").append(c2).toString());
        }
        if (this.f25646e == null) {
            boolean z = false;
            boolean z2 = false;
            for (C4949i c4949i : this.f25657p.values()) {
                if (c4949i.mo4826l()) {
                    z2 = true;
                }
                z = c4949i.mo4484c() ? true : z;
            }
            switch (this.f25664w.intValue()) {
                case 1:
                    if (!z2) {
                        throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
                    } else if (z) {
                        throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
                    }
                    break;
                case 2:
                    if (z2) {
                        if (this.f25644c) {
                            this.f25646e = new C5064e(this.f25648g, this.f25643b, this.f25649h, this.f25657p, this.f25659r, this.f25660s, this.f25661t, this.f25663v, this, true);
                            return;
                        } else {
                            this.f25646e = cz.m23555a(this.f25648g, this, this.f25643b, this.f25649h, this.f25655n, this.f25657p, this.f25659r, this.f25660s, this.f25661t, this.f25663v);
                            return;
                        }
                    }
                    break;
            }
            if (!this.f25644c || z) {
                this.f25646e = new ak(this.f25648g, this, this.f25643b, this.f25649h, this.f25655n, this.f25657p, this.f25659r, this.f25660s, this.f25661t, this.f25663v, this);
            } else {
                this.f25646e = new C5064e(this.f25648g, this.f25643b, this.f25649h, this.f25657p, this.f25659r, this.f25660s, this.f25661t, this.f25663v, this, false);
            }
        }
    }

    private static String m23338c(int i) {
        switch (i) {
            case 1:
                return "SIGN_IN_MODE_REQUIRED";
            case 2:
                return "SIGN_IN_MODE_OPTIONAL";
            case 3:
                return "SIGN_IN_MODE_NONE";
            default:
                return "UNKNOWN";
        }
    }

    public final C4949i mo4543a(C5056g c5056g) {
        Object obj = (C4949i) this.f25657p.get(c5056g);
        am.m23734a(obj, (Object) "Appropriate Api was not requested.");
        return obj;
    }

    public final void mo4545a(int i) {
        boolean z = true;
        this.f25643b.lock();
        if (!(i == 3 || i == 1 || i == 2)) {
            z = false;
        }
        try {
            am.m23743b(z, "Illegal sign-in mode: " + i);
            m23335b(i);
            m23339o();
        } finally {
            this.f25643b.unlock();
        }
    }

    public final void mo4549a(C1634r c1634r) {
        this.f25645d.m23788a(c1634r);
    }

    public final void mo4550a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mContext=").println(this.f25648g);
        printWriter.append(str).append("mResuming=").print(this.f25651j);
        printWriter.append(" mWorkQueue.size()=").print(this.f25650i.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.f25666y.f25782c.size());
        if (this.f25646e != null) {
            this.f25646e.mo4571a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final boolean mo4551a(bo boVar) {
        return this.f25646e != null && this.f25646e.mo4572a(boVar);
    }

    public final Context mo4552b() {
        return this.f25648g;
    }

    public final Looper mo4555c() {
        return this.f25649h;
    }

    public final void mo4556d() {
        if (this.f25646e != null) {
            this.f25646e.mo4578f();
        }
    }

    public final void mo4557e() {
        boolean z = false;
        this.f25643b.lock();
        try {
            if (this.f25647f >= 0) {
                if (this.f25664w != null) {
                    z = true;
                }
                am.m23739a(z, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f25664w == null) {
                this.f25664w = Integer.valueOf(m23331a(this.f25657p.values(), false));
            } else if (this.f25664w.intValue() == 2) {
                throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            mo4545a(this.f25664w.intValue());
        } finally {
            this.f25643b.unlock();
        }
    }

    public final void mo4560h() {
        mo4559g();
        mo4557e();
    }

    public final C4954s mo4561i() {
        am.m23739a(mo4562j(), (Object) "GoogleApiClient is not connected yet.");
        am.m23739a(this.f25664w.intValue() != 2, (Object) "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        bt btVar = new bt((C5058o) this);
        if (this.f25657p.containsKey(cy.f26650a)) {
            m23334a((C5058o) this, btVar, false);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            C5058o b = new C5089p(this.f25648g).m23647a(cy.f26652c).m23649a(new ae(this, atomicReference, btVar)).m23650a(new af(btVar)).m23646a(this.f25654m).m23652b();
            atomicReference.set(b);
            b.mo4557e();
        }
        return btVar;
    }

    public final boolean mo4562j() {
        return this.f25646e != null && this.f25646e.mo4576d();
    }

    public final boolean mo4563k() {
        return this.f25646e != null && this.f25646e.mo4577e();
    }

    final boolean m23362l() {
        if (!this.f25651j) {
            return false;
        }
        this.f25651j = false;
        this.f25654m.removeMessages(2);
        this.f25654m.removeMessages(1);
        if (this.f25656o != null) {
            this.f25656o.m23465a();
            this.f25656o = null;
        }
        return true;
    }

    final boolean m23363m() {
        boolean z = false;
        this.f25643b.lock();
        try {
            if (this.f25665x != null) {
                if (!this.f25665x.isEmpty()) {
                    z = true;
                }
                this.f25643b.unlock();
            }
            return z;
        } finally {
            this.f25643b.unlock();
        }
    }

    final String m23364n() {
        Writer stringWriter = new StringWriter();
        mo4550a("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    public final cn mo4544a(cn cnVar) {
        String str;
        am.m23743b(cnVar.f25455b != null, "This task can not be enqueued (it's probably a Batch or malformed)");
        boolean containsKey = this.f25657p.containsKey(cnVar.f25455b);
        if (cnVar.f25456c != null) {
            str = cnVar.f25456c.f25636c;
        } else {
            str = "the API";
        }
        am.m23743b(containsKey, new StringBuilder(String.valueOf(str).length() + 65).append("GoogleApiClient is not configured to use ").append(str).append(" required for this call.").toString());
        this.f25643b.lock();
        try {
            if (this.f25646e == null) {
                this.f25650i.add(cnVar);
            } else {
                cnVar = this.f25646e.mo4568a(cnVar);
                this.f25643b.unlock();
            }
            return cnVar;
        } finally {
            this.f25643b.unlock();
        }
    }

    public final cn mo4553b(cn cnVar) {
        String str;
        am.m23743b(cnVar.f25455b != null, "This task can not be executed (it's probably a Batch or malformed)");
        boolean containsKey = this.f25657p.containsKey(cnVar.f25455b);
        if (cnVar.f25456c != null) {
            str = cnVar.f25456c.f25636c;
        } else {
            str = "the API";
        }
        am.m23743b(containsKey, new StringBuilder(String.valueOf(str).length() + 65).append("GoogleApiClient is not configured to use ").append(str).append(" required for this call.").toString());
        this.f25643b.lock();
        try {
            if (this.f25646e == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.f25651j) {
                this.f25650i.add(cnVar);
                while (!this.f25650i.isEmpty()) {
                    ct ctVar = (cn) this.f25650i.remove();
                    this.f25666y.m23509a(ctVar);
                    ctVar.m23084b(Status.f25627c);
                }
            } else {
                cnVar = this.f25646e.mo4574b(cnVar);
                this.f25643b.unlock();
            }
            return cnVar;
        } finally {
            this.f25643b.unlock();
        }
    }

    public final ConnectionResult mo4558f() {
        boolean z;
        boolean z2 = true;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            z = true;
        } else {
            z = false;
        }
        am.m23739a(z, (Object) "blockingConnect must not be called on the UI thread");
        this.f25643b.lock();
        try {
            if (this.f25647f >= 0) {
                if (this.f25664w == null) {
                    z2 = false;
                }
                am.m23739a(z2, (Object) "Sign-in mode should have been set explicitly by auto-manage.");
            } else if (this.f25664w == null) {
                this.f25664w = Integer.valueOf(m23331a(this.f25657p.values(), false));
            } else if (this.f25664w.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m23335b(this.f25664w.intValue());
            this.f25645d.f26034e = true;
            ConnectionResult b = this.f25646e.mo4573b();
            return b;
        } finally {
            this.f25643b.unlock();
        }
    }

    public final ConnectionResult mo4542a(long j, TimeUnit timeUnit) {
        boolean z = true;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            z = false;
        }
        am.m23739a(z, (Object) "blockingConnect must not be called on the UI thread");
        am.m23734a((Object) timeUnit, (Object) "TimeUnit must not be null");
        this.f25643b.lock();
        try {
            if (this.f25664w == null) {
                this.f25664w = Integer.valueOf(m23331a(this.f25657p.values(), false));
            } else if (this.f25664w.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            m23335b(this.f25664w.intValue());
            this.f25645d.f26034e = true;
            ConnectionResult a = this.f25646e.mo4567a(j, timeUnit);
            return a;
        } finally {
            this.f25643b.unlock();
        }
    }

    public final void mo4559g() {
        this.f25643b.lock();
        bz bzVar = this.f25666y;
        for (C4954s c4954s : (ct[]) bzVar.f25782c.toArray(bz.f25781b)) {
            c4954s.m23069a(null);
            if (c4954s.mo4493d() != null) {
                c4954s.mo4490a(null);
                IBinder n = ((C4949i) bzVar.f25785f.get(((cn) c4954s).f25455b)).m23044n();
                C5091z c5091z = bzVar.f25784e;
                if (c4954s.m23077e()) {
                    c4954s.m23069a(new cb(c4954s, c5091z, n));
                } else {
                    if (n != null) {
                        try {
                            if (n.isBinderAlive()) {
                                cc cbVar = new cb(c4954s, c5091z, n);
                                c4954s.m23069a(cbVar);
                                n.linkToDeath(cbVar, 0);
                            }
                        } catch (RemoteException e) {
                            c4954s.mo4491b();
                            c4954s.mo4493d().intValue();
                            c5091z.m23653a();
                        } catch (Throwable th) {
                            this.f25643b.unlock();
                        }
                    }
                    c4954s.m23069a(null);
                    c4954s.mo4491b();
                    c4954s.mo4493d().intValue();
                    c5091z.m23653a();
                }
                bzVar.f25782c.remove(c4954s);
            } else if (c4954s.m23078f()) {
                bzVar.f25782c.remove(c4954s);
            }
        }
        if (this.f25646e != null) {
            this.f25646e.mo4575c();
        }
        bk bkVar = this.f25662u;
        Iterator it = bkVar.f25757a.iterator();
        if (it.hasNext()) {
            it.next();
            throw new NoSuchMethodError();
        }
        bkVar.f25757a.clear();
        for (cn cnVar : this.f25650i) {
            cnVar.m23069a(null);
            cnVar.mo4491b();
        }
        this.f25650i.clear();
        if (this.f25646e == null) {
            this.f25643b.unlock();
            return;
        }
        m23362l();
        this.f25645d.m23787a();
        this.f25643b.unlock();
    }

    private final void m23339o() {
        this.f25645d.f26034e = true;
        this.f25646e.mo4569a();
    }

    public final void mo4554b(C1634r c1634r) {
        C5118f c5118f = this.f25645d;
        am.m23733a((Object) c1634r);
        synchronized (c5118f.f26038i) {
            if (!c5118f.f26033d.remove(c1634r)) {
                String valueOf = String.valueOf(c1634r);
                Log.w("GmsClientEvents", new StringBuilder(String.valueOf(valueOf).length() + 57).append("unregisterConnectionFailedListener(): listener ").append(valueOf).append(" not found").toString());
            }
        }
    }

    public final void mo4547a(Bundle bundle) {
        boolean z = true;
        int i = 0;
        while (!this.f25650i.isEmpty()) {
            mo4553b((cn) this.f25650i.remove());
        }
        C5118f c5118f = this.f25645d;
        am.m23739a(Looper.myLooper() == c5118f.f26037h.getLooper(), (Object) "onConnectionSuccess must only be called on the Handler thread");
        synchronized (c5118f.f26038i) {
            am.m23738a(!c5118f.f26036g);
            c5118f.f26037h.removeMessages(1);
            c5118f.f26036g = true;
            if (c5118f.f26032c.size() != 0) {
                z = false;
            }
            am.m23738a(z);
            ArrayList arrayList = new ArrayList(c5118f.f26031b);
            int i2 = c5118f.f26035f.get();
            arrayList = arrayList;
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                C1632q c1632q = (C1632q) obj;
                if (c5118f.f26034e && c5118f.f26030a.mo4565j() && c5118f.f26035f.get() == i2) {
                    if (!c5118f.f26032c.contains(c1632q)) {
                        c1632q.mo2363a(bundle);
                    }
                }
            }
            c5118f.f26032c.clear();
            c5118f.f26036g = false;
        }
    }

    public final void mo4548a(ConnectionResult connectionResult) {
        int i = 0;
        if (!C5095d.m23659a(this.f25648g, connectionResult.f25611c)) {
            m23362l();
        }
        if (!this.f25651j) {
            boolean z;
            C5118f c5118f = this.f25645d;
            if (Looper.myLooper() == c5118f.f26037h.getLooper()) {
                z = true;
            } else {
                z = false;
            }
            am.m23739a(z, (Object) "onConnectionFailure must only be called on the Handler thread");
            c5118f.f26037h.removeMessages(1);
            synchronized (c5118f.f26038i) {
                ArrayList arrayList = new ArrayList(c5118f.f26033d);
                int i2 = c5118f.f26035f.get();
                arrayList = arrayList;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    C1634r c1634r = (C1634r) obj;
                    if (!c5118f.f26034e || c5118f.f26035f.get() != i2) {
                        break;
                    } else if (c5118f.f26033d.contains(c1634r)) {
                        c1634r.mo2364a(connectionResult);
                    }
                }
            }
            this.f25645d.m23787a();
        }
    }

    public final void mo4546a(int i, boolean z) {
        int i2 = 0;
        if (!(i != 1 || z || this.f25651j)) {
            this.f25651j = true;
            if (this.f25656o == null) {
                this.f25656o = C5096b.m23667a(this.f25648g.getApplicationContext(), new ai(this));
            }
            this.f25654m.sendMessageDelayed(this.f25654m.obtainMessage(1), this.f25652k);
            this.f25654m.sendMessageDelayed(this.f25654m.obtainMessage(2), this.f25653l);
        }
        for (ct c : (ct[]) this.f25666y.f25782c.toArray(bz.f25781b)) {
            c.m23074c(bz.f25780a);
        }
        C5118f c5118f = this.f25645d;
        am.m23739a(Looper.myLooper() == c5118f.f26037h.getLooper(), (Object) "onUnintentionalDisconnection must only be called on the Handler thread");
        c5118f.f26037h.removeMessages(1);
        synchronized (c5118f.f26038i) {
            c5118f.f26036g = true;
            ArrayList arrayList = new ArrayList(c5118f.f26031b);
            int i3 = c5118f.f26035f.get();
            arrayList = arrayList;
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                C1632q c1632q = (C1632q) obj;
                if (c5118f.f26034e && c5118f.f26035f.get() == i3) {
                    if (c5118f.f26031b.contains(c1632q)) {
                        c1632q.mo2362a(i);
                    }
                }
            }
            c5118f.f26032c.clear();
            c5118f.f26036g = false;
        }
        this.f25645d.m23787a();
        if (i == 2) {
            m23339o();
        }
    }

    static /* synthetic */ void m23332a(ac acVar) {
        acVar.f25643b.lock();
        try {
            if (acVar.f25651j) {
                acVar.m23339o();
            }
            acVar.f25643b.unlock();
        } catch (Throwable th) {
            acVar.f25643b.unlock();
        }
    }

    static /* synthetic */ void m23336b(ac acVar) {
        acVar.f25643b.lock();
        try {
            if (acVar.m23362l()) {
                acVar.m23339o();
            }
            acVar.f25643b.unlock();
        } catch (Throwable th) {
            acVar.f25643b.unlock();
        }
    }
}
