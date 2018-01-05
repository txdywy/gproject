package com.google.android.wallet.p369c.p373b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.android.volley.n;
import com.google.a.a.a.a.b.a.a.f.g;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.a.a.a.a.b.a.b.a.k;
import com.google.a.a.a.a.b.a.c.b;
import com.google.a.a.a.a.b.a.c.c;
import com.google.a.a.a.a.b.a.c.e;
import com.google.a.a.a.a.b.a.c.h;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.analytics.p365a.C6492a;
import com.google.android.wallet.clientlog.C6537a;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.p374d.C6532b;
import com.google.android.wallet.common.p374d.C6574c;
import com.google.android.wallet.common.p377b.p378a.C6566a;
import com.google.android.wallet.common.p377b.p379b.C6567a;
import com.google.android.wallet.common.p380e.C6576a;
import com.google.android.wallet.common.pub.C6529a;
import com.google.android.wallet.common.pub.SecurePaymentsPayload;
import com.google.android.wallet.common.pub.UiConfig;
import com.google.android.wallet.common.pub.p381a.C6579a;
import com.google.android.wallet.common.util.C6595g;
import com.google.android.wallet.common.util.C6598j;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.common.util.C6608t;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.instrumentmanager.C6634c;
import com.google.android.wallet.instrumentmanager.C6642e;
import com.google.android.wallet.instrumentmanager.p386b.p387a.C6630a;
import com.google.android.wallet.p355a.C6486b;
import com.google.android.wallet.p369c.p370a.p371a.C6519a;
import com.google.android.wallet.p369c.p375c.C6533a;
import com.google.android.wallet.p369c.p375c.C6534b;
import com.google.android.wallet.p369c.p375c.C6536c;
import com.google.android.wallet.p372d.C6531c;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.aa;
import com.google.android.wallet.ui.common.ai;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.ci;
import com.google.android.wallet.ui.common.cp;
import com.google.p443h.p447b.p448a.p449a.p450a.C7149a;
import com.google.p443h.p451c.p457c.p460b.p465c.p466a.C7176c;
import com.google.p443h.p451c.p457c.p460b.p467d.C7178b;
import com.google.p443h.p451c.p457c.p460b.p467d.C7180d;
import com.google.p443h.p451c.p457c.p470c.p471a.C7185c;
import com.google.p443h.p451c.p457c.p470c.p471a.C7186d;
import com.google.p443h.p451c.p457c.p470c.p471a.C7187e;
import com.google.p443h.p451c.p457c.p470c.p471a.C7188f;
import com.google.p443h.p451c.p457c.p470c.p471a.C7189g;
import com.google.p443h.p451c.p457c.p470c.p471a.C7190h;
import com.google.p443h.p451c.p457c.p470c.p471a.C7192j;
import com.google.protobuf.nano.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class C6530a extends C6529a {
    public C7186d aR;
    public C7188f aS;
    public C7178b aT;
    public boolean aU;
    public String aV;
    public c aW;
    public h aX;
    public boolean aY;
    public C7180d[] aZ;
    public LogContext ba;
    public C6566a bb;

    public static C6530a m29635a(Account account, SecurePaymentsPayload securePaymentsPayload, UiConfig uiConfig, Bundle bundle) {
        if (account == null) {
            throw new IllegalArgumentException("Account is a required parameter");
        } else if (securePaymentsPayload == null) {
            throw new IllegalArgumentException("SecurePaymentsPayload is a required parameter");
        } else {
            Fragment c6530a = new C6530a();
            Bundle a = C6529a.m29601a(uiConfig, account, bundle);
            a.putParcelable("securePaymentsPayload", securePaymentsPayload);
            c6530a.f(a);
            return c6530a;
        }
    }

    public final void mo5477b(Bundle bundle) {
        i iVar;
        SecurePaymentsPayload securePaymentsPayload;
        if (bundle == null) {
            C7178b c7178b;
            SecurePaymentsPayload securePaymentsPayload2 = (SecurePaymentsPayload) this.q.getParcelable("securePaymentsPayload");
            i iVar2 = (C7192j) C6608t.m29984a(securePaymentsPayload2.f32711c.f34920a, C7192j.class);
            if (iVar2.f35070a == 0) {
                c7178b = iVar2.f35073d;
            } else {
                c7178b = null;
            }
            this.aT = c7178b;
            iVar = iVar2;
            securePaymentsPayload = securePaymentsPayload2;
        } else {
            this.aT = (C7178b) ParcelableProto.m29887a(bundle, "androidEnvironmentConfig");
            securePaymentsPayload = null;
            iVar = null;
        }
        if (bundle != null) {
            this.aq = (e) ParcelableProto.m29887a(bundle, "responseContext");
            this.ba = (LogContext) bundle.getParcelable("logContext");
            this.bb = new C6566a();
            this.bb.f32685a = this.aq.c;
            C6537a.m29694a(this.bb, this.ba.m29671b());
        }
        super.mo5477b(bundle);
        if (bundle == null) {
            C6608t.m29985a(iVar, "actionToken=");
            C7185c c7185c = iVar.f35072c;
            this.aq = c7185c.f35037b;
            this.as = c7185c.f35038c;
            this.aS = iVar.f35071b;
            this.aY = iVar.f35075f;
            this.aZ = iVar.f35076g;
            this.bb = new C6566a();
            this.bb.f32685a = this.aq.c;
            this.ba = C6537a.m29675a(3, C6537a.m29677a(this.bb, ((Boolean) C6486b.f32489b.a()).booleanValue()));
            C6537a.m29684a(as(), this.aq.g, this.aq.h, this.aq.i);
            C6537a.m29687a(this.ba, this.aq);
            switch (c7185c.f35039d) {
                case 1:
                    this.aR = c7185c.f35040e;
                    break;
                case 4:
                    this.aR = c7185c.f35040e;
                    this.aU = true;
                    this.aV = c7185c.f35042g;
                    this.aW = null;
                    m29638a(c7185c.f35042g, null, this.aq.c, true);
                    break;
                case 5:
                    this.aR = new C7186d();
                    this.aX = c7185c.f35036a;
                    if (this.aX.b != 2) {
                        throw new IllegalArgumentException("Invalid initialize error action: " + this.aX.b);
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported flow instruction: " + c7185c.f35039d);
            }
            if (this.aR.f35051i != null) {
                C6630a.m30008a(this.aR.f35051i, securePaymentsPayload.f32711c.f34921b, iVar.f35074e);
            }
        } else {
            this.aR = (C7186d) ParcelableProto.m29887a(bundle, "page");
            this.aS = (C7188f) ParcelableProto.m29887a(bundle, "purchaseManagerParameters");
            this.aU = bundle.getBoolean("queuedIsFlowComplete");
            this.aV = bundle.getString("queuedCheckoutOrderId");
            this.aW = (c) ParcelableProto.m29887a(bundle, "queuedCallbackData");
            this.aY = bundle.getBoolean("returnSecurePayloadToIntegrator");
            ArrayList b = ParcelableProto.m29891b(bundle, "forwardSecureDataMappings");
            this.aZ = (C7180d[]) b.toArray(new C7180d[b.size()]);
        }
        C6537a.m29686a(this.ba, h().getApplicationContext());
    }

    public final void mo5504u() {
        super.mo5504u();
        if (this.aU) {
            m29638a(this.aV, this.aW, this.aq.c, true);
        }
    }

    protected final au aj() {
        Fragment fragment;
        if (this.aX != null) {
            Context h = h();
            int i = this.bc;
            h hVar = this.aX;
            LogContext as = as();
            Fragment c6576a = new C6576a();
            Bundle a = au.m29850a(i, null, as);
            Bundle bundle = new Bundle();
            C6595g.m29923a(bundle, hVar.b, h.getString(C6625i.wallet_uic_error_title), hVar.a, null, hVar.d, h.getString(17039370));
            a.putBundle("errorDetails", bundle);
            c6576a.f(a);
            fragment = c6576a;
        } else if (this.aR.f35051i != null) {
            fragment = C6630a.m30007a(this.aR.f35051i, this.bc, this.aR.f35043a, as(), this.aq.c);
        } else {
            throw new IllegalStateException("No form specified");
        }
        j().a().b(C6634c.sub_form_holder, fragment).c();
        return fragment;
    }

    public final void mo5482e(Bundle bundle) {
        super.mo5482e(bundle);
        bundle.putParcelable("logContext", this.ba);
        bundle.putParcelable("page", ParcelableProto.m29885a(this.aR));
        bundle.putParcelable("purchaseManagerParameters", ParcelableProto.m29885a(this.aS));
        bundle.putParcelable("androidEnvironmentConfig", ParcelableProto.m29885a(this.aT));
        bundle.putBoolean("queuedIsFlowComplete", this.aU);
        bundle.putString("queuedCheckoutOrderId", this.aV);
        bundle.putParcelable("queuedCallbackData", ParcelableProto.m29885a(this.aW));
        bundle.putBoolean("returnSecurePayloadToIntegrator", this.aY);
        bundle.putParcelableArrayList("forwardSecureDataMappings", ParcelableProto.m29890a(this.aZ));
    }

    public final void mo5473a(C6531c c6531c) {
        if (!C6598j.m29927a(c6531c, this.ap)) {
            throw new IllegalArgumentException("Unexpected sidecar");
        } else if (((C6533a) this.ap).f32598l != 2 || ((C6533a) this.ap).f32607i == null) {
            super.mo5473a(c6531c);
        } else {
            i iVar = ((C6533a) this.ap).f32607i;
            C7149a c7149a = new C7149a();
            c7149a.f34921b = C6630a.m30009a(iVar.f35061b.f35055a, this.aZ);
            c7149a.f34920a = i.a(iVar);
            Parcelable securePaymentsPayload = new SecurePaymentsPayload(c7149a);
            Bundle bundle = new Bundle();
            bundle.putParcelable("com.google.android.wallet.purchasemanager.EXTRA_SECURE_PAYMENTS_PAYLOAD", securePaymentsPayload);
            if (this.aq.c != null && this.aq.c.length > 0) {
                bundle.putByteArray("com.google.android.wallet.EXTRA_LOG_TOKEN", this.aq.c);
            }
            C6579a.m29875a(new C6492a(this.aq.c));
            m29610a(50, bundle, false);
        }
    }

    protected final void mo5484a(long[] jArr, Bundle bundle, byte[] bArr) {
        if (this.g.mo5524a(jArr)) {
            this.au = bundle;
            this.av = bArr;
            C7189g c7189g = new C7189g();
            c7189g.f35061b = m29636a(bundle, bArr);
            if (this.aY) {
                C6533a c6533a = (C6533a) this.ap;
                e eVar = this.aq;
                c6533a.mo5505W();
                new C6534b(c6533a, eVar.b).execute(new C7189g[]{c7189g});
                return;
            }
            m29637a(c7189g);
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
        throw new UnsupportedOperationException("PurchaseManager API doesn't support refresh.");
    }

    private final C7187e m29636a(Bundle bundle, byte[] bArr) {
        C7187e c7187e = new C7187e();
        c7187e.f35055a = C6630a.m30006a(this.g, bundle);
        if (bArr != null) {
            c7187e.f35056b = bArr;
        }
        return c7187e;
    }

    protected final void am() {
        C6537a.m29684a(as(), this.aq.g, this.aq.h, this.aq.i);
        this.bb.f32685a = this.aq.c;
        C7190h c7190h = ((C6533a) this.ap).af;
        switch (c7190h.f35065d) {
            case 1:
                this.aR = c7190h.f35066e;
                this.aY = false;
                this.aZ = null;
                m29605X();
                m29607Z();
                return;
            case 2:
                mo5469a(4, Bundle.EMPTY);
                return;
            case 3:
                m29638a(c7190h.f35067f, c7190h.f35069h, this.aq.c, false);
                return;
            case 4:
                this.aR = c7190h.f35066e;
                this.aY = false;
                this.aZ = null;
                m29605X();
                m29607Z();
                this.aU = true;
                this.aV = c7190h.f35067f;
                this.aW = c7190h.f35069h;
                m29638a(c7190h.f35067f, c7190h.f35069h, this.aq.c, true);
                return;
            case 27:
                m29610a(51, Bundle.EMPTY, false);
                return;
            default:
                throw new IllegalArgumentException("Unknown flow instruction: " + c7190h.f35065d);
        }
    }

    private final void m29638a(String str, c cVar, byte[] bArr, boolean z) {
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("com.google.android.wallet.purchasemanager.CHECKOUT_ORDER_ID", str);
        }
        if (!(cVar == null || cVar.a() == null || cVar.a().length <= 0)) {
            bundle.putByteArray("com.google.android.wallet.EXTRA_INTEGRATOR_CALLBACK_DATA_TOKEN", cVar.a());
        }
        if (bArr != null && bArr.length > 0) {
            bundle.putByteArray("com.google.android.wallet.EXTRA_LOG_TOKEN", bArr);
        }
        m29610a(50, bundle, z);
    }

    public final void mo5471a(View view, int i) {
        if (this.aU && ci.m30878b(i)) {
            C6567a.m29805a(this.g, -1, 1621);
            m29638a(this.aV, this.aW, this.aq.c, false);
            return;
        }
        super.mo5471a(view, i);
    }

    protected final boolean an() {
        C7190h c7190h = ((C6533a) this.ap).af;
        switch (((C6533a) this.ap).ak) {
            case 4:
                m29621a(c7190h.f35062a.c);
                return true;
            case 5:
                h hVar = c7190h.f35062a;
                m29612a(C6595g.m29923a(new Bundle(), hVar.b, c(C6642e.wallet_uic_error_title), hVar.a, null, hVar.d, c(17039370)));
                return true;
            default:
                return false;
        }
    }

    protected final void ao() {
        C7190h c7190h = ((C6533a) this.ap).af;
        if (c7190h != null) {
            this.aq = c7190h.f35063b;
            this.as = c7190h.f35064c;
        }
    }

    public final C6506n getUiElement() {
        return new C6506n(1619, this.aq.c);
    }

    public final List getChildren() {
        List arrayList = new ArrayList();
        if (this.aR.f35045c != null) {
            arrayList.add(this.ag);
        }
        arrayList.add(this.g);
        return arrayList;
    }

    public final LogContext as() {
        return this.ba;
    }

    private final void m29637a(C7189g c7189g) {
        this.ao = c7189g;
        Map a = C6600l.m29945a(this.as.a);
        C6533a c6533a = (C6533a) this.ap;
        e eVar = this.aq;
        if (c7189g.f35060a != null) {
            throw new IllegalArgumentException("SubmitRequest's RequestContext should not be set by the caller");
        }
        Object c6574c = new C6574c(c6533a, eVar.c);
        n c6519a = new C6519a(c6533a.d, c7189g, a, eVar.b, c6533a.e, new C6536c(c6533a), c6574c);
        c6574c.f32703a = c6519a;
        c6533a.m29658a(c6519a, true);
        C6567a.m29801a(724, 1, eVar.c);
    }

    protected final void al() {
        C7189g c7189g = (C7189g) this.ao;
        c7189g.f35061b = m29636a(this.au, this.av);
        m29637a(c7189g);
    }

    protected final String aa() {
        return this.aR.f35043a;
    }

    protected final ad ab() {
        return this.aR.f35044b;
    }

    protected final String ac() {
        return this.aR.f35050h;
    }

    protected final String ad() {
        return this.aR.f35049g;
    }

    protected final k ae() {
        return this.aR.f35046d;
    }

    protected final C7176c af() {
        return null;
    }

    protected final g[] ag() {
        if (this.aR.f35047e == null) {
            return g.a();
        }
        return new g[]{this.aR.f35047e};
    }

    protected final long ah() {
        return 0;
    }

    protected final ae ai() {
        return this.aR.f35045c;
    }

    protected final boolean ap() {
        return false;
    }

    protected final void aq() {
    }

    protected final void ar() {
    }

    public final C7178b at() {
        return this.aT;
    }

    protected final /* synthetic */ C6531c ak() {
        Account account = this.ay;
        C7178b c7178b = this.aT;
        UiConfig uiConfig = this.az;
        LogContext logContext = this.ba;
        Fragment c6533a = new C6533a();
        c6533a.f(C6532b.m29653a(account, c7178b, uiConfig, logContext));
        return c6533a;
    }
}
