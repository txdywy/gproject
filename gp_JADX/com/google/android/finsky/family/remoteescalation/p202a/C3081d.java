package com.google.android.finsky.family.remoteescalation.p202a;

import android.content.Intent;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.h.a.ae;
import java.util.HashSet;
import java.util.Set;

public final class C3081d {
    public static final C3081d f16001e = new C3081d();
    public final Set f16002a = new HashSet();
    public final C2471a f16003b = C1473m.f7980a.aR();
    public boolean f16004c = false;
    public C3082e f16005d;

    public final void m15802a(C2495w c2495w, Intent intent, String str, ae aeVar) {
        C3078a c3078a = new C3078a(C1473m.f7980a.f7981b, str, this, c2495w);
        String action = intent.getAction();
        Object[] objArr = new Object[]{action, aeVar};
        boolean z = true;
        switch (action.hashCode()) {
            case 115598201:
                if (action.equals("com.android.vending.REMOTE_ESCALATION_CLICKED")) {
                    z = true;
                    break;
                }
                break;
            case 247794279:
                if (action.equals("com.android.vending.REMOTE_ESCALATION_APPROVE_CLICKED")) {
                    z = false;
                    break;
                }
                break;
            case 805536619:
                if (action.equals("com.android.vending.REMOTE_ESCALATION_DELETED")) {
                    z = true;
                    break;
                }
                break;
            case 937688226:
                if (action.equals("com.android.vending.REMOTE_ESCALATION_DENY_CLICKED")) {
                    z = true;
                    break;
                }
                break;
        }
        switch (z) {
            case false:
                c2495w.m13379b(new C2475d(null).m13256a(5250));
                c3078a.m15797a(aeVar, true);
                return;
            case true:
                c2495w.m13379b(new C2475d(null).m13256a(5251));
                c3078a.m15797a(aeVar, false);
                return;
            case true:
                Intent putExtra;
                c2495w.m13379b(new C2475d(null).m13256a(5249));
                if (c3078a.f15991a.mo2306a(c3078a.f15993c).mo2328i() || aeVar.l == null) {
                    putExtra = C1473m.f7980a.bo().mo2762b(c3078a.f15992b, c3078a.f15993c, c2495w).setFlags(268435456).putExtra("remote_escalation_item", ParcelableProto.m21671a((C0757i) aeVar));
                    c3078a.f15995e.m15801a();
                } else {
                    putExtra = C1473m.f7980a.bn().mo2686a(c3078a.f15992b, new Document(aeVar.l), c3078a.f15993c);
                    if (!C1473m.f7980a.bn().mo2704a(c3078a.f15992b.getPackageManager(), putExtra)) {
                        putExtra = C1473m.f7980a.bo().mo2745a(c3078a.f15992b, aeVar.l.f12116w, c3078a.f15996f);
                    }
                }
                c3078a.f15992b.startActivity(putExtra);
                return;
            case true:
                c2495w.m13379b(new C2475d(null).m13256a(5252));
                c3078a.f15995e.m15799b(aeVar);
                return;
            default:
                return;
        }
    }

    final void m15804a(ae aeVar, String str, C2495w c2495w) {
        m15805a(aeVar, str, c2495w, false);
    }

    final void m15805a(ae aeVar, String str, C2495w c2495w, boolean z) {
        C1473m.f7980a.mo2259r().mo3779a(aeVar, str, z, c2495w);
        if (aeVar.j) {
            this.f16004c = true;
        } else {
            this.f16002a.add(Integer.valueOf(C3081d.m15800c(aeVar)));
        }
    }

    final void m15803a(ae aeVar) {
        C1473m.f7980a.mo2259r().mo3778a(aeVar);
        m15799b(aeVar);
    }

    private final void m15799b(ae aeVar) {
        if (aeVar.j) {
            this.f16004c = false;
            return;
        }
        this.f16002a.remove(Integer.valueOf(C3081d.m15800c(aeVar)));
        if (this.f16002a.isEmpty()) {
            m15801a();
        }
    }

    final void m15801a() {
        m15803a(new ae().e());
    }

    private static int m15800c(ae aeVar) {
        String valueOf = String.valueOf(aeVar.g);
        String valueOf2 = String.valueOf(aeVar.h);
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }
}
