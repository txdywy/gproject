package com.google.android.wallet.instrumentmanager.p388c;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.android.volley.n;
import com.google.a.a.a.a.b.a.a.c.b.a.ab;
import com.google.a.a.a.a.b.a.a.c.b.a.ad;
import com.google.a.a.a.a.b.a.a.j.a.a;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.a.a.a.a.b.a.b.a.at;
import com.google.a.a.a.a.b.a.c.b;
import com.google.a.a.a.a.b.a.c.e;
import com.google.a.a.a.a.b.a.c.h;
import com.google.a.a.a.a.b.b.a.c;
import com.google.a.a.a.a.b.b.a.d;
import com.google.a.a.a.a.b.b.a.f;
import com.google.a.a.a.a.b.b.a.g;
import com.google.a.a.a.a.b.b.a.k;
import com.google.a.a.a.a.b.b.a.l;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.clientlog.C6537a;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.p374d.C6532b;
import com.google.android.wallet.common.p374d.C6574c;
import com.google.android.wallet.common.p376a.C6563p;
import com.google.android.wallet.common.p377b.p378a.C6566a;
import com.google.android.wallet.common.p377b.p379b.C6567a;
import com.google.android.wallet.common.pub.C6529a;
import com.google.android.wallet.common.pub.UiConfig;
import com.google.android.wallet.common.util.C6591c;
import com.google.android.wallet.common.util.C6595g;
import com.google.android.wallet.common.util.C6598j;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.common.util.C6607s;
import com.google.android.wallet.common.util.C6608t;
import com.google.android.wallet.common.util.C6611w;
import com.google.android.wallet.common.util.C6612x;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.instrumentmanager.C6634c;
import com.google.android.wallet.instrumentmanager.C6641d;
import com.google.android.wallet.instrumentmanager.C6642e;
import com.google.android.wallet.instrumentmanager.p384a.p385a.C6627a;
import com.google.android.wallet.instrumentmanager.p386b.p387a.C6630a;
import com.google.android.wallet.instrumentmanager.p389d.C6635a;
import com.google.android.wallet.instrumentmanager.p389d.C6636b;
import com.google.android.wallet.instrumentmanager.p389d.C6637c;
import com.google.android.wallet.instrumentmanager.p389d.C6638d;
import com.google.android.wallet.instrumentmanager.p389d.C6639e;
import com.google.android.wallet.instrumentmanager.p389d.C6640f;
import com.google.android.wallet.instrumentmanager.ui.p391b.C6664h;
import com.google.android.wallet.instrumentmanager.ui.p392c.C6667a;
import com.google.android.wallet.p355a.C6486b;
import com.google.android.wallet.p372d.C6531c;
import com.google.android.wallet.ui.address.C6711b;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.aa;
import com.google.android.wallet.ui.common.ai;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.ci;
import com.google.android.wallet.ui.common.cp;
import com.google.android.wallet.ui.p405f.C6818a;
import com.google.p443h.p451c.p457c.p460b.p465c.p466a.C7176c;
import com.google.p443h.p451c.p457c.p460b.p467d.C7178b;
import com.google.protobuf.nano.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class C6633a extends C6529a {
    public l aR;
    public d aS;
    public c aT;
    public LogContext aU;
    public C6566a aV;
    public boolean aW;
    public boolean aX;
    @Deprecated
    public String aY;
    public byte[] aZ;
    public com.google.a.a.a.a.b.a.c.c ba;

    public static C6633a m30011a(Account account, byte[] bArr, byte[] bArr2, UiConfig uiConfig, Bundle bundle) {
        if (account == null) {
            throw new IllegalArgumentException("Account is a required parameter");
        } else if (bArr.length == 0) {
            throw new IllegalArgumentException("Common token is a required parameter");
        } else if (bArr2.length == 0) {
            throw new IllegalArgumentException("Action token is a required parameter");
        } else {
            Fragment c6633a = new C6633a();
            Bundle a = C6529a.m29601a(uiConfig, account, bundle);
            a.putByteArray("commonToken", bArr);
            a.putByteArray("actionToken", bArr2);
            c6633a.f(a);
            return c6633a;
        }
    }

    public final void mo5477b(Bundle bundle) {
        boolean z = true;
        this.aR = (l) C6608t.m29984a(this.q.getByteArray("commonToken"), l.class);
        if (bundle != null) {
            this.aq = (e) ParcelableProto.m29887a(bundle, "responseContext");
            this.aU = (LogContext) bundle.getParcelable("logContext");
            this.aV = new C6566a();
            this.aV.f32685a = this.aq.c;
            C6537a.m29694a(this.aV, this.aU.m29671b());
        }
        super.mo5477b(bundle);
        if (bundle == null) {
            i iVar = (k) C6608t.m29984a(this.q.getByteArray("actionToken"), k.class);
            C6608t.m29985a(iVar, "actionToken=");
            this.aq = iVar.b.b;
            this.as = iVar.b.c;
            this.aT = iVar.a;
            this.aV = new C6566a();
            this.aV.f32685a = this.aq.c;
            this.aU = C6537a.m29675a(2, C6537a.m29677a(this.aV, ((Boolean) C6486b.f32488a.a()).booleanValue()));
            C6537a.m29684a(as(), this.aq.g, this.aq.h, this.aq.i);
            C6537a.m29687a(this.aU, this.aq);
            switch (iVar.b.f) {
                case 1:
                    this.aS = iVar.b.d;
                    break;
                case 4:
                    this.aS = iVar.b.d;
                    this.aX = true;
                    this.aY = iVar.b.g;
                    this.aZ = iVar.b.i;
                    this.ba = null;
                    if (C6600l.m29957a(g(), this.aS.d) == null) {
                        String str = this.aY;
                        byte[] bArr = this.aZ;
                        com.google.a.a.a.a.b.a.c.c cVar = this.ba;
                        byte[] bArr2 = this.aq.c;
                        if (ap()) {
                            z = false;
                        }
                        m30014a(str, bArr, cVar, bArr2, z);
                        break;
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unknown initializePage flow instruction: " + iVar.b.f);
            }
        }
        this.aS = (d) ParcelableProto.m29887a(bundle, "page");
        this.aT = (c) ParcelableProto.m29887a(bundle, "instrumentManagerParameters");
        this.aW = bundle.getBoolean("hasAutoSubmittedForPage");
        this.aX = bundle.getBoolean("queuedIsFlowComplete");
        this.aY = bundle.getString("queuedInstrumentId");
        this.aZ = bundle.getByteArray("queuedInstrumentToken");
        this.ba = (com.google.a.a.a.a.b.a.c.c) ParcelableProto.m29887a(bundle, "queuedCallbackData");
        C6537a.m29686a(this.aU, h().getApplicationContext());
    }

    public final void mo5504u() {
        super.mo5504u();
        if (this.aX && C6600l.m29957a(g(), this.aS.d) == null) {
            m30014a(this.aY, this.aZ, this.ba, this.aq.c, !ap());
        }
    }

    protected final au aj() {
        Fragment a;
        if (this.aS.c() != null) {
            a = C6630a.m30007a(this.aS.c(), this.bc, this.aS.b, as(), this.aq.c);
        } else if (this.aS.d() != null) {
            r1 = this.aS.d();
            r2 = this.bc;
            r3 = as();
            a = new C6664h();
            a.f(au.m29850a(r2, r1, r3));
        } else if (this.aS.a() != null) {
            r1 = this.aS.a();
            r2 = this.bc;
            r3 = as();
            if (r1.b == null || r1.c == null || C6591c.m29906a(r1.c.v, 1)) {
                a = new C6667a();
                a.f(au.m29850a(r2, r1, r3));
            } else {
                throw new IllegalArgumentException("Customer form with both a legal country selector and a legal address form containing a country selector is not supported");
            }
        } else {
            throw new IllegalStateException("No top level form specified");
        }
        j().a().b(C6634c.sub_form_holder, a).c();
        return a;
    }

    public final void mo5482e(Bundle bundle) {
        super.mo5482e(bundle);
        bundle.putParcelable("logContext", this.aU);
        bundle.putParcelable("page", ParcelableProto.m29885a(this.aS));
        bundle.putParcelable("instrumentManagerParameters", ParcelableProto.m29885a(this.aT));
        bundle.putBoolean("hasAutoSubmittedForPage", this.aW);
        bundle.putBoolean("queuedIsFlowComplete", this.aX);
        bundle.putString("queuedInstrumentId", this.aY);
        bundle.putByteArray("queuedInstrumentToken", this.aZ);
        bundle.putParcelable("queuedCallbackData", ParcelableProto.m29885a(this.ba));
    }

    public final void mo5471a(View view, int i) {
        if (this.aX && ci.m30878b(i)) {
            C6567a.m29805a(this.g, -1, 1621);
            m30014a(this.aY, this.aZ, this.ba, this.aq.c, false);
            return;
        }
        super.mo5471a(view, i);
    }

    protected final void am() {
        C6537a.m29684a(as(), this.aq.g, this.aq.h, this.aq.i);
        this.aV.f32685a = this.aq.c;
        com.google.a.a.a.a.b.b.a.i iVar = ((C6635a) this.ap).af;
        g gVar = ((C6635a) this.ap).ag;
        if (iVar != null) {
            switch (iVar.f) {
                case 1:
                    d dVar;
                    this.aW = false;
                    if (iVar.a == 0) {
                        dVar = iVar.h;
                    } else {
                        dVar = null;
                    }
                    this.aS = dVar;
                    m29605X();
                    m29607Z();
                    return;
                case 2:
                    mo5469a(4, Bundle.EMPTY);
                    return;
                case 3:
                    m30014a(iVar.g, iVar.k, iVar.l, iVar.c.c, false);
                    return;
                case 27:
                    m29610a(51, Bundle.EMPTY, false);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown savePage flow instruction: " + iVar.f);
            }
        } else if (gVar != null) {
            switch (gVar.d) {
                case 1:
                    this.aW = false;
                    this.aS = gVar.e;
                    m29605X();
                    m29607Z();
                    return;
                default:
                    throw new IllegalArgumentException("Unknown refreshPage flow instruction: " + gVar.d);
            }
        } else {
            throw new IllegalStateException("Sidecar successful but no response was found");
        }
    }

    protected final boolean an() {
        com.google.a.a.a.a.b.b.a.i iVar = ((C6635a) this.ap).af;
        switch (((C6635a) this.ap).ak) {
            case 4:
                m29621a(iVar.b.c);
                return true;
            case 5:
                h hVar;
                if (iVar != null) {
                    hVar = iVar.b;
                } else {
                    hVar = ((C6635a) this.ap).ag.a;
                }
                String c = c(17039370);
                if (this.aS.o && hVar.b == 1) {
                    c = c(C6642e.wallet_uic_retry);
                    this.aW = false;
                }
                m29612a(C6595g.m29923a(new Bundle(), hVar.b, c(C6642e.wallet_uic_error_title), hVar.a, null, hVar.d, c));
                return true;
            case 1000:
                m29612a(C6595g.m29923a(new Bundle(), 500, c(C6642e.wallet_uic_error_title), c(C6642e.wallet_uic_send_sms_for_dcb_error), null, null, c(C6642e.wallet_uic_retry)));
                return true;
            default:
                return false;
        }
    }

    protected final void ao() {
        com.google.a.a.a.a.b.b.a.i iVar = ((C6635a) this.ap).af;
        g gVar = ((C6635a) this.ap).ag;
        if (iVar != null) {
            this.aq = iVar.c;
            this.as = iVar.d;
        } else if (gVar != null) {
            this.aq = gVar.b;
            this.as = gVar.c;
        }
    }

    public final void mo5469a(int i, Bundle bundle) {
        switch (i) {
            case 3:
                if (((C6635a) this.ap).f32598l != 1) {
                    String string = bundle.getString("EventListener.EXTRA_FORM_ID");
                    int i2 = bundle.getInt("EventListener.EXTRA_FIELD_ID");
                    for (b bVar : this.aS.n) {
                        if (i2 == bVar.c && C6598j.m29927a(string, bVar.b)) {
                            mo5483a(bundle, null, bVar);
                            return;
                        }
                    }
                    return;
                }
                return;
            default:
                super.mo5469a(i, bundle);
                return;
        }
    }

    protected final void mo5540a(boolean z) {
        if (this.aj != C6641d.fragment_instrument_manager_full_screen) {
            super.mo5540a(z);
            return;
        }
        boolean z2 = (this.e.getVisibility() == 0 || this.i.getVisibility() == 0) ? false : true;
        if (z) {
            if (z2) {
                this.i.setVisibility(0);
            } else if (!this.aF) {
                ci.m30876b(this.e, 0, 0);
                ci.m30855a(this.i, 0);
            }
            this.aF = true;
        } else {
            if (z2) {
                this.e.setVisibility(0);
            } else if (this.aF) {
                ci.m30855a(this.e, 0);
                ci.m30876b(this.i, 0, 0);
            }
            this.aF = false;
        }
        if (!z || TextUtils.isEmpty(this.aD)) {
            this.aD = null;
            if (z2) {
                this.c.setVisibility(0);
            } else if (this.aG) {
                ci.m30855a(this.c, 0);
                ci.m30876b(this.h, 0, 0);
            }
            this.aG = false;
        } else {
            this.h.m30185a(this.aD, null);
            if (z2) {
                this.h.setVisibility(0);
            } else if (!this.aG) {
                ci.m30876b(this.c, 0, 0);
                ci.m30855a(this.h, 0);
            }
            this.aG = true;
        }
        if (!z || TextUtils.isEmpty(this.aE)) {
            this.aE = null;
            if (z2) {
                this.a.setVisibility(0);
            } else if (this.aH) {
                ci.m30855a(this.a, 0);
                ci.m30856a(this.af, 0, 0);
            }
            this.aH = false;
            return;
        }
        this.af.setText(this.aE);
        if (z2) {
            this.af.setVisibility(0);
        } else if (!this.aH) {
            ci.m30876b(this.a, 0, 0);
            ci.m30855a(this.af, 0);
        }
        this.aH = true;
    }

    protected final void mo5484a(long[] jArr, Bundle bundle, byte[] bArr) {
        if (this.g.mo5524a(jArr)) {
            this.au = bundle;
            this.av = bArr;
            com.google.a.a.a.a.b.b.a.h hVar = new com.google.a.a.a.a.b.b.a.h();
            hVar.b = this.aT;
            hVar.c = m30010a(bundle, bArr);
            m30013a(hVar);
            return;
        }
        C6567a.m29804a(this.g, 1623);
        List aa = this.g.aa();
        int size = aa.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((C6749z) aa.get(i)).f33285e;
            if (obj instanceof ai) {
                if (((ai) obj).mo5529e()) {
                    return;
                }
            } else if (obj instanceof aa) {
                aa aaVar = (aa) obj;
                if (!TextUtils.isEmpty(aaVar.getError())) {
                    aaVar.cT_();
                    return;
                }
            } else if (obj instanceof View) {
                View view = (View) obj;
                if (!TextUtils.isEmpty(cp.m30909b(view))) {
                    ci.m30875b(view);
                    return;
                }
            } else {
                throw new IllegalStateException(String.format("Unexpected field type: %s", new Object[]{obj.getClass().getName()}));
            }
        }
    }

    protected final void mo5483a(Bundle bundle, byte[] bArr, b bVar) {
        this.au = bundle;
        this.av = bArr;
        f fVar = new f();
        fVar.b = m30010a(bundle, bArr);
        if (bVar != null) {
            fVar.c = (b) C6608t.m29983a(bVar);
        }
        m30012a(fVar);
    }

    private final com.google.a.a.a.a.b.b.a.e m30010a(Bundle bundle, byte[] bArr) {
        com.google.a.a.a.a.b.b.a.e eVar = new com.google.a.a.a.a.b.b.a.e();
        if (this.g instanceof C6664h) {
            C6664h c6664h = (C6664h) this.g;
            String a = C6600l.m29944a(c6664h.f32873e.getText().toString());
            ab abVar = new ab();
            abVar.a = ((com.google.a.a.a.a.b.a.a.c.b.a.aa) c6664h.aD).a.a;
            abVar.b = ((com.google.a.a.a.a.b.a.a.c.b.a.aa) c6664h.aD).a.c;
            abVar.c = c6664h.f32872d.getMonth();
            abVar.d = c6664h.f32872d.getYear();
            abVar.e = a;
            eVar.a = -1;
            eVar.a = 2;
            eVar.d = abVar;
        } else if (this.g instanceof C6667a) {
            C6667a c6667a = (C6667a) this.g;
            com.google.a.a.a.a.b.a.a.a.a.b bVar = new com.google.a.a.a.a.b.a.a.a.a.b();
            if (c6667a.f32879e != null) {
                bVar.d = C6563p.m29793a(c6667a.f32879e.getSelectedRegionCode());
            }
            if (c6667a.f32875a != null) {
                bVar.c = c6667a.f32875a.g;
            }
            int size = c6667a.f32880f.size();
            for (int i = 0; i < size; i++) {
                ai aiVar = (ai) ((C6749z) c6667a.f32880f.get(i)).f33285e;
                if (aiVar instanceof C6818a) {
                    C6818a c6818a = (C6818a) aiVar;
                    int length = ((a) c6818a.aD).e.length;
                    com.google.a.a.a.a.b.a.a.j.a.b bVar2 = new com.google.a.a.a.a.b.a.a.j.a.b();
                    if (((a) c6818a.aD).c != null) {
                        bVar2.a = ((a) c6818a.aD).c.a;
                        bVar2.b = ((a) c6818a.aD).c.b;
                        bVar2.c = ((a) c6818a.aD).c.c;
                    } else {
                        bVar2.a = ((a) c6818a.aD).b;
                    }
                    bVar2.d = new at[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        bVar2.d[i2] = cp.m30901a(c6818a.m31038b(i2), ((a) c6818a.aD).e[i2]);
                    }
                    bVar.e = bVar2;
                } else if (aiVar instanceof C6711b) {
                    bVar.b = ((C6711b) aiVar).al();
                } else {
                    bVar.a = C6630a.m30006a(aiVar, bundle);
                }
            }
            eVar.a = -1;
            eVar.a = 0;
            eVar.b = bVar;
        } else {
            com.google.a.a.a.a.b.a.a.c.a.e a2 = C6630a.m30006a(this.g, bundle);
            if (a2 == null) {
                if (eVar.a == 1) {
                    eVar.a = -1;
                }
                eVar.c = null;
            } else {
                eVar.a = -1;
                eVar.a = 1;
                eVar.c = a2;
            }
        }
        if (bArr != null) {
            eVar.f = bArr;
        }
        return eVar;
    }

    public final C6506n getUiElement() {
        return new C6506n(1620, this.aq.c);
    }

    public final List getChildren() {
        List arrayList = new ArrayList();
        if (this.aS.f != null) {
            arrayList.add(this.ag);
        }
        arrayList.add(this.g);
        return arrayList;
    }

    private final void m30013a(com.google.a.a.a.a.b.b.a.h hVar) {
        this.ao = hVar;
        Map a = C6600l.m29945a(this.as.a);
        if (this.aS.c() == null || this.aS.c().b == null) {
            C6635a c6635a = (C6635a) this.ap;
            e eVar = this.aq;
            c6635a.m30026a(hVar, eVar, a, new C6638d(c6635a), new C6574c(c6635a, eVar.c), null);
            return;
        }
        ad adVar = this.aS.c().b;
        C6635a c6635a2 = (C6635a) this.ap;
        Object obj = adVar.c;
        String str = adVar.d;
        e eVar2 = this.aq;
        C6611w c6611w = new C6611w(c6635a2.h().getApplicationContext(), new C6636b(c6635a2, eVar2.c));
        if (TextUtils.isEmpty(obj)) {
            throw new IllegalArgumentException("SMS destination address must be provided");
        }
        if (C6607s.m29980a(c6611w.f32779a, "android.permission.SEND_SMS")) {
            PendingIntent broadcast;
            if (c6611w.f32780b != null) {
                broadcast = PendingIntent.getBroadcast(c6611w.f32779a, 0, new Intent("com.google.android.wallet.SMS_SENT_ACTION"), 0);
                c6611w.f32779a.registerReceiver(new C6612x(c6611w), new IntentFilter("com.google.android.wallet.SMS_SENT_ACTION"));
            } else {
                broadcast = null;
            }
            SmsManager.getDefault().sendTextMessage(obj, null, str, broadcast, null);
        } else {
            Log.d("SmsSender", "Sending an SMS text requires the SEND_SMS permission.");
            c6611w.m29988a(5);
        }
        c6635a2.m30026a(hVar, eVar2, a, new C6640f(c6635a2, c6611w), new C6639e(c6635a2, eVar2.c, c6611w), C6635a.f32805i);
        c6635a2.ah = true;
    }

    private final void m30012a(f fVar) {
        this.ao = fVar;
        Map a = C6600l.m29945a(this.as.b);
        C6635a c6635a = (C6635a) this.ap;
        e eVar = this.aq;
        if (fVar.a != null) {
            throw new IllegalArgumentException("RefreshPageRequest's RequestContext should not be set by the caller");
        }
        Object c6574c = new C6574c(c6635a, eVar.c);
        n c6627a = new C6627a(c6635a.d, fVar, a, eVar.b, c6635a.e, new C6637c(c6635a), c6574c);
        c6574c.f32703a = c6627a;
        c6635a.m29658a(c6627a, true);
        C6567a.m29801a(722, 1, eVar.c);
        c6635a.ah = false;
    }

    protected final void al() {
        if (this.ao instanceof com.google.a.a.a.a.b.b.a.h) {
            com.google.a.a.a.a.b.b.a.h hVar = (com.google.a.a.a.a.b.b.a.h) this.ao;
            hVar.c = m30010a(this.au, this.av);
            m30013a(hVar);
        } else if (this.ao instanceof f) {
            f fVar = (f) this.ao;
            fVar.b = m30010a(this.au, this.av);
            m30012a(fVar);
        } else {
            String str = "retryLastRequest() called with invalid last request. Unexpected request class: ";
            String valueOf = String.valueOf(this.ao != null ? this.ao.getClass().getName() : null);
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    protected final String aa() {
        return this.aS.b;
    }

    protected final com.google.a.a.a.a.b.a.b.a.ad ab() {
        return this.aS.e;
    }

    protected final String ac() {
        return this.aS.m;
    }

    protected final String ad() {
        return this.aS.l;
    }

    protected final com.google.a.a.a.a.b.a.b.a.k ae() {
        return this.aS.p;
    }

    protected final C7176c af() {
        return this.aS.d;
    }

    protected final com.google.a.a.a.a.b.a.a.f.g[] ag() {
        return this.aS.g;
    }

    protected final long ah() {
        return this.aS.i;
    }

    protected final ae ai() {
        return this.aS.f;
    }

    protected final boolean ap() {
        return this.aS.o && !this.aW;
    }

    protected final void aq() {
        if (!this.aX && this.aI && ap() && this.g.mo5534X()) {
            this.aD = this.aS.m;
            this.aE = this.aS.l;
            this.aW = true;
            mo5484a(null, Bundle.EMPTY, null);
        }
    }

    protected final void ar() {
        if (this.aX) {
            m30014a(this.aY, this.aZ, this.ba, this.aq.c, !ap());
        }
    }

    public final void mo5539Y() {
        if (this.aj != C6641d.fragment_instrument_manager_full_screen) {
            super.mo5539Y();
        }
    }

    public final LogContext as() {
        return this.aU;
    }

    public final C7178b at() {
        return this.aR.a();
    }

    private final void m30014a(String str, byte[] bArr, com.google.a.a.a.a.b.a.c.c cVar, byte[] bArr2, boolean z) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("com.google.android.wallet.instrumentmanager.INSTRUMENT_ID", str);
        }
        if (bArr != null && bArr.length > 0) {
            bundle.putByteArray("com.google.android.wallet.instrumentmanager.INSTRUMENT_TOKEN", bArr);
        }
        if (!(cVar == null || cVar.a() == null || cVar.a().length <= 0)) {
            bundle.putByteArray("com.google.android.wallet.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", cVar.a());
        }
        if (bArr2 != null && bArr2.length > 0) {
            bundle.putByteArray("com.google.android.wallet.EXTRA_LOG_TOKEN", bArr2);
        }
        m29610a(50, bundle, z);
    }

    protected final /* synthetic */ C6531c ak() {
        Account account = this.ay;
        C7178b a = this.aR.a();
        UiConfig uiConfig = this.az;
        LogContext logContext = this.aU;
        Fragment c6635a = new C6635a();
        c6635a.f(C6532b.m29653a(account, a, uiConfig, logContext));
        return c6635a;
    }
}
