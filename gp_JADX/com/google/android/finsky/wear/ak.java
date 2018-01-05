package com.google.android.finsky.wear;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.download.C2106x;
import com.google.android.finsky.foregroundcoordinator.C3138b;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.wearable.C5617e;
import com.google.android.gms.wearable.C5620h;
import com.google.android.gms.wearable.C5621i;
import com.google.android.gms.wearable.C5651m;
import com.google.android.gms.wearable.C5652n;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.wireless.android.finsky.dfe.nano.fh;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ak {
    public final C2471a f24791a = C1473m.f7980a.aR();
    public C5058o f24792b;
    public List f24793c;
    public Set f24794d;
    public Handler f24795e;
    public Handler f24796f;
    public C4781b f24797g;
    public C4790k f24798h;
    public boolean f24799i = false;
    public List f24800j = new ArrayList();
    public C4784e f24801k;
    public Map f24802l = new HashMap();
    public ForegroundCoordinator f24803m;
    public C3138b f24804n;

    public ak(C4784e c4784e) {
        this.f24801k = c4784e;
        this.f24794d = new HashSet();
    }

    static Intent m22447a(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context.getApplicationContext(), WearSupportService.class);
        intent.setData(Uri.parse("wearsupportservice://hygiene"));
        intent.putExtra("command", "hygiene");
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("node_id", str);
        }
        intent.putExtra("hygiene_reason", str2);
        intent.putExtra("is_foreground", z);
        return intent;
    }

    final void m22451a() {
        if (this.f24795e == null) {
            this.f24795e = new Handler(Looper.getMainLooper());
        }
        if (this.f24796f == null) {
            HandlerThread handlerThread = new HandlerThread("wear-nodes-content-sync", 10);
            handlerThread.start();
            this.f24796f = new Handler(handlerThread.getLooper());
        }
    }

    final void m22458b() {
        m22451a();
        if (this.f24797g == null) {
            this.f24797g = new C4781b(C1473m.f7980a.f7981b, this.f24792b, this.f24795e, this.f24796f);
        }
    }

    final void m22456a(Runnable runnable, C4780a c4780a, cc ccVar, boolean z) {
        m22458b();
        if (this.f24799i) {
            this.f24798h.m22546a(ccVar);
            this.f24795e.post(runnable);
            return;
        }
        this.f24800j.add(runnable);
        if (this.f24800j.size() == 1) {
            C4781b c4781b = this.f24797g;
            C1473m.f7980a.ah();
            this.f24798h = new C4790k(c4781b, C1473m.f7980a.mo2264w(), C1473m.f7980a.mo2257p(), this.f24792b, this.f24801k, z).m22546a(ccVar);
            if (r2 == 0) {
                m22453a(this.f24795e, c4780a);
                return;
            }
            c4780a.mo4385a();
            Runnable anVar = new an(this, r2, c4780a);
            for (String a : this.f24801k.m22521a()) {
                this.f24797g.m22485a(a, anVar);
            }
        }
    }

    final void m22453a(Handler handler, C4780a c4780a) {
        c4780a.mo4385a();
        C2106x c2106x = this.f24798h;
        Runnable aoVar = new ao(this, c4780a, handler);
        c2106x.f25000c.mo3176a(c2106x);
        bb.m21792a(new C4794o(c2106x, aoVar), new Void[0]);
    }

    final void m22457a(Runnable runnable, Object obj) {
        this.f24794d.add(obj);
        if (this.f24792b == null || !this.f24792b.mo4562j()) {
            if (this.f24793c == null) {
                this.f24793c = new ArrayList(1);
            }
            this.f24793c.add(runnable);
            if (this.f24793c.size() <= 1) {
                FinskyLog.m21659a("Connecting to wearable; initiated by: %s", obj.getClass().getName());
                this.f24792b = new C5089p(C1473m.f7980a.f7981b).m23647a(C5652n.f28712e).m23649a(new aq(this)).m23650a(new ap(this)).m23652b();
                this.f24792b.mo4557e();
                return;
            }
            return;
        }
        runnable.run();
    }

    final void m22454a(C5617e c5617e, String str, String str2, cc ccVar) {
        C5620h a = C5620h.m26634a(c5617e.mo5124c());
        String f = a.m26660f("packageName");
        int d = a.m26658d("packageVersion");
        ArrayList g = a.m26661g("moduleNames");
        ArrayList arrayList = new ArrayList(g.size());
        for (int i = 0; i < g.size(); i++) {
            fh fhVar = new fh();
            fhVar.a((String) g.get(i));
            arrayList.add(fhVar);
        }
        FinskyLog.m21659a("Processing zapp module request from node %s, request id %s, package %s ver %d", str, str2, f, Integer.valueOf(d));
        if (c5617e == null) {
            throw new IllegalStateException("provided dataItem is null");
        }
        C5621i c5621i = new C5621i(c5617e);
        C5651m c5651m = new C5651m(PutDataRequest.m26609a(c5621i.f28576a), c5621i.f28577b);
        c5651m.f28707b.m26648a("phoneskyProcessed", true);
        C5652n.f28708a.mo5117a(this.f24792b, c5651m.m26838a());
        C4805z c4805z = new C4805z(this.f24797g, this.f24792b, str, str2, ccVar);
        C1473m.f7980a.ah();
        c4805z.f25074b.m22485a(c4805z.f25076d, new aa(c4805z, f, d, arrayList));
    }

    final void m22455a(Object obj) {
        if (this.f24798h != null) {
            C2106x c2106x = this.f24798h;
            c2106x.f25000c.removeListener(c2106x);
        }
        if (this.f24792b != null && this.f24792b.mo4562j()) {
            this.f24794d.remove(obj);
            FinskyLog.m21662b("Connections to wearable: %s signs off; remaining callers: %s", obj.getClass().getName(), this.f24794d.toString());
            if (this.f24794d.isEmpty()) {
                FinskyLog.m21659a("Disconnecting wearable", new Object[0]);
                this.f24792b.mo4559g();
            }
        }
    }

    final C2495w m22450a(String str) {
        C2495w c2495w = (C2495w) this.f24802l.get(str);
        if (c2495w != null) {
            return c2495w;
        }
        FinskyLog.m21665c("Logging context for node %s doesn't exist!", str);
        return this.f24791a.m13184a("unknown");
    }

    final void m22452a(Context context, Intent intent) {
        C1552e dj = C1473m.f7980a.aN().dj();
        if (dj.mo2294a(12642048) && this.f24804n == null) {
            if (this.f24803m == null) {
                this.f24803m = C1473m.f7980a.bz();
            }
            this.f24804n = this.f24803m.m16016a(8, dj, new am(context, intent));
            return;
        }
        context.startService(intent);
    }

    static boolean m22448c() {
        return C1473m.f7980a.aN().dj().mo2294a(12643585) && ((Long) C0955b.eE.m28964b()).longValue() > 0;
    }

    static boolean m22449d() {
        return C1473m.f7980a.aN().dj().mo2294a(12642044);
    }
}
