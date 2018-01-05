package com.google.android.finsky.wear;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.foregroundcoordinator.C3138b;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.wearable.C5652n;
import java.util.ArrayList;
import java.util.List;

public final class ar {
    public static final byte[] f24817a = new byte[0];
    public static final Handler f24818b = new Handler(Looper.getMainLooper());
    public boolean f24819c = false;
    public String f24820d = null;
    public int f24821e = 0;
    public List f24822f;
    public ak f24823g;
    public C4784e f24824h;
    public ForegroundCoordinator f24825i;
    public C3138b f24826j;
    public boolean f24827k;
    public Context f24828l;
    public C4780a f24829m = new av();
    public cc f24830n = new ay(this);

    public ar(Context context, ak akVar, C4784e c4784e) {
        this.f24828l = context;
        this.f24823g = akVar;
        this.f24824h = c4784e;
    }

    public final void m22465a(Context context, String str, String str2, boolean z) {
        if (C1473m.f7980a.dj().mo2294a(12624984)) {
            FinskyLog.m21659a("disabled", new Object[0]);
        } else if (!"hygiene_reason_retry".equals(str2)) {
            Context applicationContext = context.getApplicationContext();
            Intent a = ak.m22447a(context, str, str2, z);
            if (ak.m22449d() && a.getStringExtra("hygiene_reason").equals("hygiene_reason_daily")) {
                f24818b.post(new aw(this, a));
            } else {
                this.f24823g.m22452a(applicationContext, a);
            }
        } else if (ak.m22448c()) {
            r4 = ((Long) C0955b.eD.m28964b()).longValue() * ((long) this.f24821e);
            if (r4 > 0) {
                C1473m.f7980a.am().m22493a(2, "job_tag_hygiene_retry", r4, ((Long) C0955b.eE.m28964b()).longValue(), str, "hygiene_reason_retry");
            }
        } else {
            int i = this.f24821e;
            Context context2 = C1473m.f7980a.f7981b;
            AlarmManager alarmManager = (AlarmManager) context2.getSystemService("alarm");
            r4 = ((Long) C0955b.eD.m28964b()).longValue() * ((long) i);
            if (r4 > 0) {
                FinskyLog.m21659a("Scheduling hygiene retry for node %s in %d MS", str, Long.valueOf(r4));
                alarmManager.set(3, r4 + SystemClock.elapsedRealtime(), PendingIntent.getService(context2, 0, ak.m22447a(context2, str, "hygiene_reason_node_request", true), 0));
            }
        }
    }

    final void m22466a(Intent intent, cc ccVar, C4780a c4780a) {
        String stringExtra = intent.getStringExtra("hygiene_reason");
        FinskyLog.m21659a("Received hygiene command %s, foreground %s", stringExtra, Boolean.valueOf(intent.getBooleanExtra("is_foreground", false)));
        if (!((Boolean) C0955b.er.m28964b()).booleanValue()) {
            ccVar.mo4389a();
        } else if (this.f24819c) {
            FinskyLog.m21659a("Hygiene already running, skip", new Object[0]);
            if ("hygiene_reason_new_node".equals(stringExtra)) {
                m22463b(intent.getStringExtra("node_id"));
            }
        } else {
            boolean z = true;
            switch (stringExtra.hashCode()) {
                case -1037009178:
                    if (stringExtra.equals("hygiene_reason_new_node")) {
                        z = false;
                        break;
                    }
                    break;
                case -627668873:
                    if (stringExtra.equals("hygiene_reason_node_request")) {
                        z = true;
                        break;
                    }
                    break;
                case 2040778531:
                    if (stringExtra.equals("hygiene_reason_retry")) {
                        z = true;
                        break;
                    }
                    break;
            }
            switch (z) {
                case false:
                case true:
                case true:
                    this.f24827k = true;
                    break;
                default:
                    this.f24827k = false;
                    break;
            }
            this.f24819c = true;
            this.f24820d = stringExtra;
            c4780a.mo4385a();
            this.f24824h.m22519a(this.f24823g.f24792b, true, new az(this, c4780a, r5, ccVar));
        }
    }

    final void m22469a(String[] strArr, cc ccVar) {
        if (strArr.length == 0) {
            this.f24819c = false;
            m22462a(ccVar);
            return;
        }
        this.f24823g.m22458b();
        this.f24823g.f24802l.clear();
        for (String str : strArr) {
            FinskyLog.m21659a("Start daily hygiene for node %s", str);
            C2495w a = this.f24823g.f24791a.m13184a("wear_auto_update");
            C4789j c4789j = new C4789j(132, this.f24824h);
            c4789j.f24996b = str;
            a.m13371a(c4789j.m22536a(), null);
            this.f24823g.f24802l.put(str, a);
            m22464c(str);
            this.f24823g.f24797g.m22485a(str, new bd(this, str, ccVar));
        }
    }

    private final synchronized void m22464c(String str) {
        if (this.f24822f == null) {
            this.f24822f = new ArrayList();
        }
        this.f24822f.add(str);
    }

    final synchronized void m22468a(String str, cc ccVar) {
        this.f24822f.remove(str);
        if (this.f24822f.isEmpty()) {
            this.f24819c = false;
            m22462a(ccVar);
        }
    }

    private final void m22462a(cc ccVar) {
        f24818b.post(new bg(this));
        ccVar.mo4390b();
    }

    final boolean m22470a() {
        return this.f24822f == null || this.f24822f.isEmpty();
    }

    final synchronized void m22467a(String str) {
        if (!this.f24827k) {
            FinskyLog.m21659a("Should not retry", new Object[0]);
        } else if (this.f24821e >= ((Integer) C0955b.eC.m28964b()).intValue()) {
            FinskyLog.m21659a("Max retry reached, giving up", new Object[0]);
        } else {
            this.f24821e++;
            FinskyLog.m21659a("Retrying hygiene for node %s, attempt %d", str, Integer.valueOf(this.f24821e));
            C5652n.f28709b.mo5110a(this.f24823g.f24792b, str, "request_checkin", f24817a).mo4490a(new bh());
        }
    }

    static void m22463b(String str) {
        long longValue;
        if (ak.m22448c()) {
            longValue = ((Long) C0955b.eB.m28964b()).longValue();
            if (longValue > 0) {
                C1473m.f7980a.am().m22493a(1, "job_tag_new_node_hygiene", longValue, ((Long) C0955b.eE.m28964b()).longValue(), str, "hygiene_reason_new_node");
                return;
            }
            return;
        }
        Context context = C1473m.f7980a.f7981b;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        longValue = ((Long) C0955b.eB.m28964b()).longValue();
        if (longValue > 0) {
            FinskyLog.m21659a("Scheduling hygiene for node %s in %d MS", str, Long.valueOf(longValue));
            alarmManager.set(3, longValue + SystemClock.elapsedRealtime(), PendingIntent.getService(context, 0, ak.m22447a(context, str, "hygiene_reason_new_node", true), 0));
        }
    }
}
