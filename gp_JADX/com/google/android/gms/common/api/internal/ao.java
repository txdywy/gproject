package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.v4.p037h.C0308c;
import android.util.Log;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.C5096b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C5022m;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.tasks.C5587d;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public final class ao implements Callback {
    public static final Status f25697a = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status f25698b = new Status(4, "The user must be signed in to make this API call.");
    public static final Object f25699f = new Object();
    public static ao f25700g;
    public long f25701c = 5000;
    public long f25702d = 120000;
    public long f25703e = 10000;
    public final Context f25704h;
    public final C5096b f25705i;
    public int f25706j = -1;
    public final AtomicInteger f25707k = new AtomicInteger(1);
    public final AtomicInteger f25708l = new AtomicInteger(0);
    public final Map f25709m = new ConcurrentHashMap(5, 0.75f, 1);
    public C5071k f25710n = null;
    public final Set f25711o = new C0308c();
    public final Set f25712p = new C0308c();
    public final Handler f25713q;

    private ao(Context context, Looper looper, C5096b c5096b) {
        this.f25704h = context;
        this.f25713q = new Handler(looper, this);
        this.f25705i = c5096b;
        this.f25713q.sendMessage(this.f25713q.obtainMessage(6));
    }

    public static ao m23404a() {
        ao aoVar;
        synchronized (f25699f) {
            am.m23734a(f25700g, (Object) "Must guarantee manager is non-null before using getInstance");
            aoVar = f25700g;
        }
        return aoVar;
    }

    public static ao m23405a(Context context) {
        ao aoVar;
        synchronized (f25699f) {
            if (f25700g == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f25700g = new ao(context.getApplicationContext(), handlerThread.getLooper(), C5096b.f25938a);
            }
            aoVar = f25700g;
        }
        return aoVar;
    }

    private final void m23409c() {
        for (ch remove : this.f25712p) {
            ((aq) this.f25709m.remove(remove)).m23435c();
        }
        this.f25712p.clear();
    }

    public final void m23419a(C5022m c5022m) {
        this.f25713q.sendMessage(this.f25713q.obtainMessage(7, c5022m));
    }

    public final void m23421b() {
        this.f25713q.sendMessage(this.f25713q.obtainMessage(3));
    }

    public final void m23422b(ConnectionResult connectionResult, int i) {
        if (!m23420a(connectionResult, i)) {
            this.f25713q.sendMessage(this.f25713q.obtainMessage(5, i, 0, connectionResult));
        }
    }

    private final void m23407b(C5022m c5022m) {
        ch chVar = c5022m.f25588d;
        aq aqVar = (aq) this.f25709m.get(chVar);
        if (aqVar == null) {
            aqVar = new aq(this, c5022m);
            this.f25709m.put(chVar, aqVar);
        }
        if (aqVar.m23442j()) {
            this.f25712p.add(chVar);
        }
        aqVar.m23440h();
    }

    public final void m23418a(C5071k c5071k) {
        synchronized (f25699f) {
            if (this.f25710n != c5071k) {
                this.f25710n = c5071k;
                this.f25711o.clear();
                this.f25711o.addAll(c5071k.f25872b);
            }
        }
    }

    public final C5587d m23417a(Iterable iterable) {
        ck ckVar = new ck(iterable);
        for (C5022m c5022m : iterable) {
            aq aqVar = (aq) this.f25709m.get(c5022m.f25588d);
            if (aqVar != null) {
                if (!aqVar.m23441i()) {
                }
            }
            this.f25713q.sendMessage(this.f25713q.obtainMessage(2, ckVar));
            return ckVar.f25809b.f28505a;
        }
        ckVar.f25809b.m26583a(null);
        return ckVar.f25809b.f28505a;
    }

    public final boolean handleMessage(Message message) {
        boolean z = false;
        aq aqVar;
        aq aqVar2;
        switch (message.what) {
            case 1:
                this.f25703e = ((Boolean) message.obj).booleanValue() ? 10000 : 300000;
                this.f25713q.removeMessages(12);
                for (ch obtainMessage : this.f25709m.keySet()) {
                    this.f25713q.sendMessageDelayed(this.f25713q.obtainMessage(12, obtainMessage), this.f25703e);
                }
                break;
            case 2:
                ck ckVar = (ck) message.obj;
                for (ch chVar : ckVar.f25808a.keySet()) {
                    aq aqVar3 = (aq) this.f25709m.get(chVar);
                    if (aqVar3 == null) {
                        ckVar.m23547a(chVar, new ConnectionResult(13));
                        break;
                    } else if (aqVar3.m23441i()) {
                        ckVar.m23547a(chVar, ConnectionResult.f25609a);
                    } else if (aqVar3.m23437e() != null) {
                        ckVar.m23547a(chVar, aqVar3.m23437e());
                    } else {
                        am.m23737a(aqVar3.f25725k.f25713q);
                        aqVar3.f25719e.add(ckVar);
                    }
                }
                break;
            case 3:
                for (aq aqVar4 : this.f25709m.values()) {
                    aqVar4.m23436d();
                    aqVar4.m23440h();
                }
                break;
            case 4:
            case 8:
            case 13:
                bl blVar = (bl) message.obj;
                aqVar2 = (aq) this.f25709m.get(blVar.f25760c.f25588d);
                if (aqVar2 == null) {
                    m23407b(blVar.f25760c);
                    aqVar2 = (aq) this.f25709m.get(blVar.f25760c.f25588d);
                }
                if (aqVar2.m23442j() && this.f25708l.get() != blVar.f25759b) {
                    blVar.f25758a.mo4583a(f25697a);
                    aqVar2.m23435c();
                    break;
                }
                aqVar2.m23433a(blVar.f25758a);
                break;
                break;
            case 5:
                String b;
                String str;
                int i = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                for (aq aqVar22 : this.f25709m.values()) {
                    if (aqVar22.f25721g == i) {
                        if (aqVar22 != null) {
                            Log.wtf("GoogleApiManager", "Could not find API instance " + i + " while trying to fail enqueued calls.", new Exception());
                            break;
                        }
                        b = C5095d.m23661b(connectionResult.f25611c);
                        str = connectionResult.f25613e;
                        aqVar22.m23432a(new Status(17, new StringBuilder((String.valueOf(b).length() + 69) + String.valueOf(str).length()).append("Error resolution was canceled by the user, original error message: ").append(b).append(": ").append(str).toString()));
                        break;
                    }
                }
                aqVar22 = null;
                if (aqVar22 != null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i + " while trying to fail enqueued calls.", new Exception());
                } else {
                    b = C5095d.m23661b(connectionResult.f25611c);
                    str = connectionResult.f25613e;
                    aqVar22.m23432a(new Status(17, new StringBuilder((String.valueOf(b).length() + 69) + String.valueOf(str).length()).append("Error resolution was canceled by the user, original error message: ").append(b).append(": ").append(str).toString()));
                }
            case 6:
                if (this.f25704h.getApplicationContext() instanceof Application) {
                    boolean z2;
                    Application application = (Application) this.f25704h.getApplicationContext();
                    synchronized (cl.f25812a) {
                        if (!cl.f25812a.f25816e) {
                            application.registerActivityLifecycleCallbacks(cl.f25812a);
                            application.registerComponentCallbacks(cl.f25812a);
                            cl.f25812a.f25816e = true;
                        }
                    }
                    cl clVar = cl.f25812a;
                    ap apVar = new ap(this);
                    synchronized (cl.f25812a) {
                        clVar.f25815d.add(apVar);
                    }
                    clVar = cl.f25812a;
                    if (!clVar.f25814c.get()) {
                        if (VERSION.SDK_INT < 16) {
                            z2 = true;
                            if (!z2) {
                                this.f25703e = 300000;
                                break;
                            }
                        }
                        RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
                        ActivityManager.getMyMemoryState(runningAppProcessInfo);
                        if (!clVar.f25814c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                            clVar.f25813b.set(true);
                        }
                    }
                    z2 = clVar.f25813b.get();
                    if (z2) {
                        this.f25703e = 300000;
                    }
                }
                break;
            case 7:
                m23407b((C5022m) message.obj);
                break;
            case 9:
                if (this.f25709m.containsKey(message.obj)) {
                    aqVar4 = (aq) this.f25709m.get(message.obj);
                    am.m23737a(aqVar4.f25725k.f25713q);
                    if (aqVar4.f25723i) {
                        aqVar4.m23440h();
                        break;
                    }
                }
                break;
            case 10:
                m23409c();
                break;
            case 11:
                if (this.f25709m.containsKey(message.obj)) {
                    aqVar4 = (aq) this.f25709m.get(message.obj);
                    am.m23737a(aqVar4.f25725k.f25713q);
                    if (aqVar4.f25723i) {
                        aqVar4.m23438f();
                        aqVar4.m23432a(C5095d.m23655a(aqVar4.f25725k.f25704h) == 18 ? new Status(8, "Connection timed out while waiting for Google Play services update to complete.") : new Status(8, "API failed to connect while resuming due to an unknown error."));
                        aqVar4.f25716b.mo4510e();
                        break;
                    }
                }
                break;
            case 12:
                if (this.f25709m.containsKey(message.obj)) {
                    aqVar4 = (aq) this.f25709m.get(message.obj);
                    am.m23737a(aqVar4.f25725k.f25713q);
                    if (aqVar4.f25716b.m23040j() && aqVar4.f25720f.size() == 0) {
                        C5067h c5067h = aqVar4.f25718d;
                        if (!(c5067h.f25866a.isEmpty() && c5067h.f25867b.isEmpty())) {
                            z = true;
                        }
                        if (!z) {
                            aqVar4.f25716b.mo4510e();
                            break;
                        }
                        aqVar4.m23439g();
                        break;
                    }
                }
                break;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + message.what);
                return false;
        }
        return true;
    }

    final boolean m23420a(ConnectionResult connectionResult, int i) {
        PendingIntent pendingIntent;
        C5096b c5096b = this.f25705i;
        Context context = this.f25704h;
        if (connectionResult.m23263a()) {
            pendingIntent = connectionResult.f25612d;
        } else {
            pendingIntent = C5095d.m23660b(context, connectionResult.f25611c, null);
        }
        if (pendingIntent == null) {
            return false;
        }
        c5096b.m23670a(context, connectionResult.f25611c, PendingIntent.getActivity(context, 0, GoogleApiActivity.m23270a(context, pendingIntent, i, true), 134217728));
        return true;
    }
}
