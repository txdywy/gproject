package com.google.android.wallet.common.pub;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.aw;
import android.support.v4.app.p;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.a.a.a.a.b.a.a.f.g;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.a.a.a.a.b.a.b.a.ae;
import com.google.a.a.a.a.b.a.b.a.k;
import com.google.a.a.a.a.b.a.b.a.l;
import com.google.a.a.a.a.b.a.b.a.o;
import com.google.a.a.a.a.b.a.b.a.t;
import com.google.a.a.a.a.b.a.c.b;
import com.google.a.a.a.a.b.a.c.e;
import com.google.a.a.a.a.b.a.c.f;
import com.google.android.wallet.analytics.C6493a;
import com.google.android.wallet.analytics.C6496d;
import com.google.android.wallet.analytics.C6502j;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.clientlog.C6537a;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.C6523b;
import com.google.android.wallet.common.C6565a;
import com.google.android.wallet.common.p377b.p379b.C6567a;
import com.google.android.wallet.common.util.C6589a;
import com.google.android.wallet.common.util.C6595g;
import com.google.android.wallet.common.util.C6598j;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.instrumentmanager.C6629a;
import com.google.android.wallet.instrumentmanager.C6634c;
import com.google.android.wallet.instrumentmanager.C6642e;
import com.google.android.wallet.instrumentmanager.ui.common.ButtonBar;
import com.google.android.wallet.instrumentmanager.ui.common.ImInfoMessageView;
import com.google.android.wallet.instrumentmanager.ui.common.TopBarView;
import com.google.android.wallet.nfc.C6525b;
import com.google.android.wallet.p355a.C6489e;
import com.google.android.wallet.p366b.C6511g;
import com.google.android.wallet.p366b.C6512i;
import com.google.android.wallet.p366b.C6513c;
import com.google.android.wallet.p366b.C6516f;
import com.google.android.wallet.p372d.C6524d;
import com.google.android.wallet.p372d.C6531c;
import com.google.android.wallet.ui.common.C6522i;
import com.google.android.wallet.ui.common.C6526e;
import com.google.android.wallet.ui.common.C6527m;
import com.google.android.wallet.ui.common.C6528w;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.FifeNetworkImageView;
import com.google.android.wallet.ui.common.FocusedViewToTopScrollView;
import com.google.android.wallet.ui.common.InfoMessageView;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.ci;
import com.google.android.wallet.ui.common.ct;
import com.google.android.wallet.ui.common.cu;
import com.google.android.wallet.ui.common.cw;
import com.google.android.wallet.ui.p399a.C6709a;
import com.google.p443h.p451c.p457c.p460b.p465c.p466a.C7176c;
import com.google.protobuf.nano.i;
import java.util.ArrayList;
import java.util.Locale;

public abstract class C6529a extends C6522i implements OnClickListener, OnFocusChangeListener, C6493a, C6496d, C6504m, C6511g, C6523b, C6524d, C6525b, cu, C6526e, C6527m, C6528w {
    public FocusedViewToTopScrollView f32589a;
    public boolean aA;
    public boolean aB;
    public Bundle aC;
    public String aD;
    public String aE;
    public boolean aF;
    public boolean aG;
    public boolean aH;
    public boolean aI;
    public boolean aJ;
    public int aK;
    public Bundle aL;
    public Bundle aM;
    public boolean aN;
    public boolean aO;
    public boolean aP;
    public boolean aQ;
    public TextView af;
    public ImInfoMessageView ag;
    public InfoMessageView ah;
    public TextView ai;
    public int aj;
    public boolean ak;
    public boolean al;
    public CharSequence am;
    public boolean an = false;
    public i ao;
    public C6531c ap;
    public e aq;
    public C6513c ar;
    public f as;
    public final C6565a at = new C6565a();
    public Bundle au;
    public byte[] av;
    public C6583d aw;
    public C6502j ax;
    public Account ay;
    public UiConfig az;
    public FifeNetworkImageView f32590b;
    public TopBarView f32591c;
    public View f32592d;
    public View f32593e;
    public ButtonBar f32594f;
    public au f32595g;
    public TopBarView f32596h;
    public ProgressBar f32597i;

    public abstract void mo5483a(Bundle bundle, byte[] bArr, b bVar);

    public abstract void mo5484a(long[] jArr, Bundle bundle, byte[] bArr);

    public abstract String aa();

    public abstract ad ab();

    public abstract String ac();

    public abstract String ad();

    public abstract k ae();

    public abstract C7176c af();

    public abstract g[] ag();

    public abstract long ah();

    public abstract ae ai();

    public abstract au aj();

    public abstract C6531c ak();

    public abstract void al();

    public abstract void am();

    public abstract boolean an();

    public abstract void ao();

    public abstract boolean ap();

    public abstract void aq();

    public abstract void ar();

    public static Bundle m29601a(UiConfig uiConfig, Account account, Bundle bundle) {
        Bundle a = C6522i.m29587a(uiConfig.f32712a, null);
        a.putParcelable("account", account);
        a.putParcelable("uiConfig", uiConfig);
        String str = "additionalArgs";
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        a.putParcelable(str, bundle);
        return a;
    }

    public final void mo5470a(Activity activity) {
        super.mo5470a(activity);
        this.am = activity.getTitle();
    }

    public final void m29608a() {
        h().setTitle(this.am);
        if (!h().isFinishing() && this.v) {
            h().H_().a().a(this.ap).c();
            this.ap = null;
            C6589a.m29895a(h(), true);
        }
        super.a();
        this.aw = null;
    }

    public void mo5477b(Bundle bundle) {
        Fragment fragment = this.F;
        if (fragment instanceof C6583d) {
            this.aw = (C6583d) fragment;
        } else {
            this.aw = (C6583d) h();
        }
        com.google.android.c.i.a = h().getApplicationContext().getContentResolver();
        super.mo5477b(bundle);
        Bundle bundle2 = this.q;
        this.ay = (Account) bundle2.getParcelable("account");
        this.az = (UiConfig) bundle2.getParcelable("uiConfig");
        TypedArray obtainStyledAttributes = this.bd.obtainStyledAttributes(new int[]{16843611, C6629a.imShowErrorMessagesInDialog, C6629a.imRootLayout});
        this.ak = obtainStyledAttributes.getBoolean(0, false);
        this.al = obtainStyledAttributes.getBoolean(1, false);
        this.aj = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
        if (bundle != null) {
            this.as = (f) ParcelableProto.m29887a(bundle, "secureHeader");
            this.au = bundle.getBundle("lastEventDetailsForPageValue");
            this.av = bundle.getByteArray("lastDependencyGraphRequestTokenForPageValue");
            this.ax = new C6502j(bundle.getBoolean("impressionForPageTracked"), this);
            this.aD = bundle.getString("progressTitle");
            this.aE = bundle.getString("progressMessage");
            this.aC = bundle.getBundle("inlineErrorMessageDetails");
            this.ao = ParcelableProto.m29887a(bundle, "lastRequest");
            this.aI = bundle.getBoolean("sidecarInitialized");
            this.aN = bundle.getBoolean("beforePermissionsRequestedMessageShown");
            this.aO = bundle.getBoolean("permissionsRequested");
            this.aP = bundle.getBoolean("permissionsGranted");
            this.aQ = bundle.getBoolean("permissionsFlowCompleted");
        } else {
            this.ax = new C6502j(false, this);
        }
        C6589a.m29895a(h(), false);
    }

    public final void m29634w() {
        super.w();
        C6537a.m29681a(as());
    }

    protected final View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.aj, viewGroup, false);
        if (VERSION.SDK_INT >= 26) {
            inflate.setImportantForAutofill(8);
        }
        this.f32589a = (FocusedViewToTopScrollView) inflate.findViewById(C6634c.main_content);
        this.f32590b = (FifeNetworkImageView) inflate.findViewById(C6634c.title_image);
        this.f32591c = (TopBarView) inflate.findViewById(C6634c.top_bar);
        this.f32592d = inflate.findViewById(C6634c.top_bar_container);
        this.f32593e = inflate.findViewById(C6634c.title_separator);
        this.f32594f = (ButtonBar) inflate.findViewById(C6634c.button_bar);
        this.f32594f.setLogContext(as());
        this.f32594f.setDynamicButtonsOnClickListener(this);
        this.f32594f.setErrorButtonOnClickListener(this);
        this.f32594f.setNegativeButtonOnClickListener(this);
        this.f32594f.setExpandButtonOnClickListener(this);
        Object string = this.q.getBundle("additionalArgs").getString("com.google.android.wallet.orchestration.TITLE_IMAGE_FIFE_URL");
        if (!TextUtils.isEmpty(string)) {
            this.f32590b.setOnLoadedListener(new C6581b(this));
            this.f32590b.setVisibility(0);
            this.f32590b.setFadeIn(false);
            this.f32590b.m30606a(string, C6600l.m29933a(h().getApplicationContext()), ((Boolean) C6489e.f32495a.a()).booleanValue());
        }
        this.ag = (ImInfoMessageView) inflate.findViewById(C6634c.top_info_text);
        this.ag.setParentUiNode(this);
        this.ag.setUrlClickListener(this);
        this.f32596h = (TopBarView) inflate.findViewById(C6634c.progress_top_bar);
        this.f32597i = (ProgressBar) inflate.findViewById(C6634c.progress_bar);
        this.af = (TextView) inflate.findViewById(C6634c.progress_text);
        this.ah = (InfoMessageView) inflate.findViewById(C6634c.info_message);
        this.ah.setUrlClickListener(this);
        this.ai = (TextView) inflate.findViewById(C6634c.details);
        m29605X();
        this.f32595g = (au) j().a(C6634c.sub_form_holder);
        if (this.f32595g == null) {
            m29607Z();
        } else {
            aw();
            ax();
        }
        if (!(bundle == null || this.aC == null)) {
            ay();
        }
        inflate.findViewById(C6634c.steal_focus_and_hide_keyboard).setOnFocusChangeListener(this);
        return inflate;
    }

    public void mo5504u() {
        super.u();
        this.ap.m29648a((C6524d) this);
        if (this.aJ) {
            m29603b(this.aK, this.aL);
            this.aJ = false;
        }
        if (this.aM != null) {
            m29602a(false, false);
            mo5469a(5, this.aM);
            this.aM = null;
        }
    }

    public final void m29633v() {
        super.v();
        h().setFinishOnTouchOutside(this.ak);
        this.ap.m29648a(null);
    }

    public void mo5482e(Bundle bundle) {
        super.mo5482e(bundle);
        bundle.putParcelable("responseContext", ParcelableProto.m29885a(this.aq));
        bundle.putParcelable("secureHeader", ParcelableProto.m29885a(this.as));
        bundle.putBoolean("impressionForPageTracked", this.ax.f32557b);
        bundle.putString("progressTitle", this.aD);
        bundle.putString("progressMessage", this.aE);
        bundle.putBundle("inlineErrorMessageDetails", this.aC);
        if (this.ao != null) {
            bundle.putParcelable("lastRequest", ParcelableProto.m29885a(this.ao));
        }
        if (this.au != null) {
            bundle.putBundle("lastEventDetailsForPageValue", this.au);
        }
        if (this.av != null) {
            bundle.putByteArray("lastDependencyGraphRequestTokenForPageValue", this.av);
        }
        bundle.putBoolean("sidecarInitialized", this.aI);
        bundle.putBoolean("beforePermissionsRequestedMessageShown", this.aN);
        bundle.putBoolean("permissionsRequested", this.aO);
        bundle.putBoolean("permissionsGranted", this.aP);
        bundle.putBoolean("permissionsFlowCompleted", this.aQ);
    }

    public void mo5473a(C6531c c6531c) {
        if (C6598j.m29927a(c6531c, this.ap)) {
            switch (this.ap.f32598l) {
                case 0:
                    this.aI = true;
                    if (this.aP) {
                        aq();
                        return;
                    }
                    return;
                case 1:
                    m29602a(true, false);
                    return;
                case 2:
                    ao();
                    am();
                    return;
                case 3:
                    m29602a(false, false);
                    ao();
                    if (!an()) {
                        switch (this.ap.ak) {
                            case 1:
                            case 3:
                                m29612a(C6595g.m29923a(new Bundle(), 2, c(C6642e.wallet_uic_error_title), c(C6642e.wallet_im_unknown_error), null, null, c(17039370)));
                                return;
                            case 2:
                                m29612a(C6595g.m29923a(new Bundle(), 500, c(C6642e.wallet_uic_network_error_title), c(C6642e.wallet_uic_network_error_message), null, null, c(C6642e.wallet_uic_retry)));
                                return;
                            default:
                                throw new IllegalArgumentException("Unknown sidecar substate: " + this.ap.ak);
                        }
                    }
                    return;
                default:
                    throw new IllegalArgumentException("Unknown sidecar state: " + this.ap.ak);
            }
        }
        throw new IllegalArgumentException("Unexpected sidecar");
    }

    public final void m29621a(com.google.a.a.a.a.b.a.c.g[] gVarArr) {
        int length = gVarArr.length;
        int i = 0;
        while (i < length) {
            com.google.a.a.a.a.b.a.c.g gVar = gVarArr[i];
            if (this.f32595g.mo5535a(gVar)) {
                i++;
            } else {
                String str = "FormFieldMessage form not found: ";
                String valueOf = String.valueOf(gVar.b.b);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
        C6567a.m29804a(this.f32595g, 1623);
        C6749z.m30560b(this.f32595g.aa());
    }

    private final void aw() {
        int i;
        C6565a c6565a = this.at;
        int[] iArr = this.aq.f;
        ArrayList arrayList = c6565a.f32684a[0];
        arrayList.clear();
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        this.f32589a.setAnimateScroll(this.at.m29797a(3));
        Window window = h().getWindow();
        if (window == null || window.getAttributes() == null) {
            i = 0;
        } else {
            i = window.getAttributes().softInputMode;
        }
        this.f32589a.m30618a(false, false, i);
    }

    protected final void m29604W() {
        boolean a = this.at.m29797a(2);
        boolean a2 = this.at.m29797a(5);
        Window window = h().getWindow();
        int i = (window == null || window.getAttributes() == null) ? 0 : window.getAttributes().softInputMode;
        this.f32589a.m30618a(a, a2, i);
    }

    private final void ax() {
        this.ar = new C6513c(ae());
        this.f32595g.m29835a(this.ar, this.ar);
        ButtonBar buttonBar = this.f32594f;
        buttonBar.f32888g = this.ar;
        buttonBar.m30161a();
        C6512i c6512i = this.ar;
        C6516f.m29562a(this, 1, c6512i, c6512i);
        c6512i = this.ar;
        C6516f.m29562a(this, 2, c6512i, c6512i);
    }

    public final void m29605X() {
        CharSequence aa;
        ad adVar = null;
        if (this.aC == null) {
            aa = aa();
            adVar = ab();
            g[] ag = ag();
            if (ag.length == 1 && ae() == null) {
                ag[0].i = 2;
                ag[0].c = true;
                Log.i("BaseOrchestrationFragme", "Back filling button type and enabled status for bad server response");
            }
            this.ag.setInfoMessage(ai());
            ButtonBar buttonBar = this.f32594f;
            buttonBar.m30162a(buttonBar.f32892k);
            this.f32594f.m30163b(false);
            this.f32594f.setDynamicButtons(ag);
        } else {
            aa = this.aC.getString("ErrorUtils.KEY_TITLE");
            Object string = this.aC.getString("ErrorUtils.KEY_ERROR_BUTTON_TEXT");
            if (TextUtils.isEmpty(string)) {
                throw new IllegalStateException("InlineErrorMessageDetails is missing button text.");
            }
            this.f32594f.setErrorButtonText(string);
            this.f32594f.m30163b(true);
            this.f32594f.m30162a(false);
        }
        this.f32591c.m30185a(aa, adVar);
        h().setTitle(aa);
        az();
    }

    public void mo5539Y() {
        if (!this.aF && !ap()) {
            this.f32592d.setVisibility(0);
            this.f32593e.setVisibility(0);
            this.f32594f.setVisibility(0);
        }
    }

    public final void m29607Z() {
        this.ag.m30180a(false);
        this.aA = true;
        this.aB = false;
        this.ax.f32557b = false;
        aw();
        this.f32595g = aj();
        if (C6600l.m29957a(g(), af()) == null) {
            this.aP = true;
            this.aQ = true;
        }
        if (this.an) {
            ci.m30861a(this.f32591c, this.f32591c.getTitle());
        } else {
            this.an = true;
        }
        mo5539Y();
        ax();
    }

    private final void m29602a(boolean z, boolean z2) {
        boolean z3;
        boolean z4 = true;
        this.f32595g.mo5519b(!z);
        ButtonBar buttonBar = this.f32594f;
        if (z || !this.f32595g.mo5534X()) {
            z3 = false;
        } else {
            z3 = true;
        }
        buttonBar.setDynamicButtonsEnabled(z3);
        InfoMessageView infoMessageView = this.ag;
        if (z) {
            z3 = false;
        } else {
            z3 = true;
        }
        infoMessageView.setEnabled(z3);
        ButtonBar buttonBar2 = this.f32594f;
        if (z) {
            z4 = false;
        }
        buttonBar2.setExpandButtonEnabled(z4);
        if (z) {
            ci.m30879b(h(), this.f32589a);
        }
        if (z && (this.f32595g instanceof C6709a)) {
            h().setFinishOnTouchOutside(false);
        } else {
            h().setFinishOnTouchOutside(this.ak);
        }
        if (!z2 && z) {
            C6567a.m29804a(this.f32595g, 1625);
        }
        mo5540a(z);
    }

    @TargetApi(17)
    public void mo5540a(boolean z) {
        boolean z2 = (this.f32589a.getVisibility() == 0 || this.f32597i.getVisibility() == 0) ? false : true;
        if (z) {
            LayoutParams layoutParams;
            if (TextUtils.isEmpty(this.aE)) {
                layoutParams = (LayoutParams) this.f32597i.getLayoutParams();
                ci.m30865a(layoutParams, ci.m30835a(20), ai.a.k(this.f32597i));
                layoutParams.addRule(ci.m30835a(14));
            } else {
                layoutParams = (LayoutParams) this.f32597i.getLayoutParams();
                ci.m30865a(layoutParams, ci.m30835a(14), ai.a.k(this.f32597i));
                layoutParams.addRule(ci.m30835a(20));
            }
            if (z2) {
                this.f32597i.setVisibility(0);
            } else if (!this.aF) {
                ci.m30876b(this.f32591c, 0, 0);
                ci.m30876b(this.f32593e, 0, 0);
                ci.m30876b(this.f32594f, 0, 0);
                ci.m30876b(this.f32589a, 0, 0);
                ci.m30855a(this.f32597i, 0);
            }
            this.aF = true;
        } else {
            if (z2) {
                this.f32592d.setVisibility(0);
                this.f32593e.setVisibility(0);
                this.f32594f.setVisibility(0);
                this.f32591c.setVisibility(0);
                this.f32589a.setVisibility(0);
            } else if (this.aF) {
                ci.m30855a(this.f32591c, 0);
                ci.m30855a(this.f32593e, 0);
                ci.m30855a(this.f32594f, 0);
                ci.m30855a(this.f32589a, 0);
                ci.m30856a(this.f32597i, 0, 0);
            }
            this.aF = false;
        }
        if (!z || TextUtils.isEmpty(this.aD)) {
            this.aD = null;
            if (!z2 && this.aG) {
                ci.m30876b(this.f32596h, 0, 0);
            }
            this.aG = false;
        } else {
            this.f32596h.m30185a(this.aD, null);
            if (z2) {
                this.f32596h.setVisibility(0);
            } else if (!this.aG) {
                ci.m30855a(this.f32596h, 0);
            }
            this.aG = true;
        }
        if (!z || TextUtils.isEmpty(this.aE)) {
            this.aE = null;
            if (!z2 && this.aH) {
                ci.m30856a(this.af, 0, 0);
            }
            this.aH = false;
            return;
        }
        this.af.setText(this.aE);
        if (z2) {
            this.af.setVisibility(0);
        } else if (!this.aH) {
            ci.m30855a(this.af, 0);
        }
        this.aH = true;
    }

    private final void ay() {
        if (this.aC == null) {
            this.ag.setVisibility(0);
            j().a().c(this.f32595g).c();
            this.ah.setVisibility(8);
            this.ai.setVisibility(8);
            this.ah.setInfoMessage(null);
            this.ai.setText(null);
            this.f32594f.m30163b(false);
            this.f32594f.setDynamicButtonsEnabled(this.f32595g.mo5534X());
        } else {
            this.ah.setInfoMessage((ae) ParcelableProto.m29887a(this.aC, "ErrorUtils.KEY_ERROR_INFO_MESSAGE"));
            CharSequence string = this.aC.getString("ErrorUtils.KEY_ERROR_CODE");
            if (!TextUtils.isEmpty(string)) {
                this.ai.setText(string);
            }
            this.ag.setVisibility(8);
            j().a().b(this.f32595g).c();
            this.ah.setVisibility(0);
            this.ai.setVisibility(0);
            this.f32594f.m30163b(true);
        }
        mo5539Y();
    }

    public final void m29612a(Bundle bundle) {
        if (l()) {
            if (this.al) {
                p pVar = (p) this.B.a("BaseOrchestrationFragmeserverErrorDialog");
                if (pVar != null) {
                    pVar.a(false);
                }
                ct ctVar = new ct();
                ctVar.f33658a = bundle.getInt("ErrorUtils.KEY_TYPE");
                ctVar.f33659b = bundle.getString("ErrorUtils.KEY_TITLE");
                ctVar.f33661d = (ae) ParcelableProto.m29887a(bundle, "ErrorUtils.KEY_ERROR_INFO_MESSAGE");
                ctVar.f33662e = bundle.getString("ErrorUtils.KEY_ERROR_CODE");
                ctVar.f33663f = bundle.getString("ErrorUtils.KEY_ERROR_BUTTON_TEXT");
                ctVar.f33666i = this.bc;
                Fragment a = ctVar.m30918a();
                a.a(this, 0);
                a.a(this.B, "BaseOrchestrationFragmeserverErrorDialog");
            } else {
                this.aC = bundle;
                m29605X();
                ay();
                ci.m30879b(h(), this.f32589a);
                ci.m30861a(this.ah, this.ah.getText());
            }
            C6567a.m29804a(this.f32595g, 1626);
            return;
        }
        this.aM = bundle;
    }

    private final void az() {
        if (this.aC == null && this.f32595g != null && this.f32595g.ae()) {
            this.f32594f.m30164c(true);
            this.f32594f.setExpandButtonText(this.f32595g.ag());
            return;
        }
        this.f32594f.m30164c(false);
    }

    public final void mo5475b(int i, int i2) {
        switch (i2) {
            case 1:
                if (i == -1) {
                    if (this.aP) {
                        aq();
                        return;
                    }
                    return;
                } else if (ap()) {
                    m29610a(51, Bundle.EMPTY, false);
                    return;
                } else {
                    return;
                }
            case 2:
                m29610a(52, Bundle.EMPTY, false);
                return;
            case 500:
                if (i == -2) {
                    m29610a(51, Bundle.EMPTY, false);
                    return;
                } else {
                    al();
                    return;
                }
            case 501:
                if (i == -1) {
                    m29607Z();
                    return;
                } else {
                    m29610a(51, Bundle.EMPTY, false);
                    return;
                }
            case 600:
                m29602a(true, false);
                this.aO = true;
                a_(C6600l.m29957a(g(), af()));
                return;
            case 601:
                m29610a(51, Bundle.EMPTY, false);
                return;
            default:
                throw new IllegalArgumentException("Unknown errorType: " + i2);
        }
    }

    public void mo5471a(View view, int i) {
        if (!ci.m30878b(i)) {
            return;
        }
        if (this.aC != null) {
            throw new IllegalStateException("Error button clicks should be handled without ButtonComponent listener");
        }
        this.aD = ac();
        this.aE = ad();
        C6567a.m29803a(this.f32595g);
        mo5484a(null, Bundle.EMPTY, null);
    }

    public void onClick(View view) {
        if (view.getId() == C6634c.expand_btn) {
            this.f32594f.m30164c(false);
            this.f32595g.af();
        } else if (view.getId() == C6634c.negative_btn) {
            C6537a.m29700b(as(), ah());
            C6567a.m29805a(this.f32595g, -1, 1622);
            m29610a(51, Bundle.EMPTY, false);
        } else if (view.getId() == C6634c.error_btn) {
            String string = this.aC.getString("EventListener.EXTRA_FORM_ID");
            int i = this.aC.getInt("ErrorUtils.KEY_TYPE");
            this.aC = null;
            m29605X();
            ay();
            if (string == null) {
                mo5475b(-1, i);
            } else if (!this.f32595g.mo5523a(string, i)) {
                String str = "Form to handle error message not found: ";
                string = String.valueOf(string);
                throw new IllegalArgumentException(string.length() != 0 ? str.concat(string) : new String(str));
            }
        }
    }

    public void mo5469a(int i, Bundle bundle) {
        boolean z = true;
        switch (i) {
            case 1:
                this.f32594f.setDynamicButtonsEnabled(this.f32595g.mo5534X());
                if (this.aP) {
                    aq();
                    return;
                }
                return;
            case 4:
                this.ax.m29545a(this);
                if (!this.aP && !this.aQ) {
                    C7176c af = af();
                    String[] a = C6600l.m29957a(g(), af);
                    boolean z2 = af.f35021b != null && C6600l.m29949a(h(), a);
                    if (z2 && !this.aN) {
                        this.aN = true;
                        m29602a(false, false);
                        m29612a(C6595g.m29923a(new Bundle(), 600, c(17039380), null, af.f35021b, null, c(17039370)));
                        return;
                    } else if (!this.aN && !this.aO) {
                        m29602a(true, false);
                        this.aO = true;
                        a_(a);
                        return;
                    } else if (this.aO) {
                        m29602a(true, false);
                        return;
                    } else {
                        return;
                    }
                } else if (this.ap.f32598l != 1 && !ap()) {
                    m29602a(false, false);
                    mo5539Y();
                    if (!this.aA) {
                        m29604W();
                        return;
                    } else if (this.aA && !this.aB) {
                        EditText d = ci.m30885d(this.f32589a);
                        if (d != null) {
                            this.aB = true;
                            d.setOnFocusChangeListener(new C6582c(this));
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                if (this.ap.f32598l != 1) {
                    m29612a(bundle);
                    return;
                }
                return;
            case 6:
                az();
                return;
            case 7:
                C6567a.m29802a(bundle, this.aq.c);
                return;
            case 8:
                if (this.f32595g.mo5534X()) {
                    mo5484a(null, Bundle.EMPTY, bundle.getByteArray("EventListener.EXTRA_DEPENDENCY_GRAPH_ACTION_TOKEN"));
                    return;
                }
                return;
            case 10:
            case 19:
                m29610a(51, Bundle.EMPTY, false);
                return;
            case 12:
            case 15:
            case 16:
            case 20:
                return;
            case 18:
                if (bundle.getBoolean("EventListener.EXTRA_ENABLE_UI_ENABLED", true)) {
                    z = false;
                }
                m29602a(z, false);
                return;
            default:
                throw new IllegalArgumentException("Unknown formEvent: " + i);
        }
    }

    public final void m29619a(int[] iArr) {
        this.aQ = true;
        m29602a(false, false);
        for (int i : iArr) {
            if (i == -1) {
                C7176c af = af();
                if (af.f35022c != null) {
                    m29612a(C6595g.m29923a(new Bundle(), 601, c(17039380), null, af.f35022c, null, c(17039370)));
                    return;
                }
                m29610a(51, Bundle.EMPTY, false);
                return;
            }
        }
        this.aP = true;
        ar();
        aq();
    }

    public final void mo5459a(l lVar, t[] tVarArr) {
        o oVar = null;
        switch (lVar.c) {
            case 3:
            case 4:
                byte[] bArr = lVar.c().c;
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("EventListener.EXTRA_TRIGGER_VALUE_REFERENCES", ParcelableProto.m29890a((i[]) tVarArr));
                if (lVar.c == 3) {
                    long[] jArr;
                    if (!lVar.c().b) {
                        jArr = lVar.c().a;
                    }
                    mo5484a(jArr, bundle, bArr);
                    return;
                }
                mo5483a(bundle, bArr, null);
                return;
            case 8:
                m29610a(50, Bundle.EMPTY, false);
                return;
            case 25:
                if (lVar.a == 6) {
                    oVar = lVar.k;
                }
                switch (oVar.a) {
                    case 3:
                        m29610a(50, Bundle.EMPTY, false);
                        return;
                    case 27:
                        m29610a(51, Bundle.EMPTY, false);
                        return;
                    default:
                        throw new IllegalArgumentException(String.format(Locale.US, "Unsupported FLOW_INSTRUCTION resulting action instruction: %d", new Object[]{Integer.valueOf(oVar.a)}));
                }
            default:
                throw new IllegalArgumentException("Unsupported resulting action type: " + lVar.c);
        }
    }

    public final void m29630d(Bundle bundle) {
        super.d(bundle);
        this.ap = (C6531c) h().H_().a("BaseOrchestrationFragmesidecar");
        if (this.ap == null || bundle == null) {
            aw a = h().H_().a();
            if (this.ap != null) {
                a.a(this.ap);
            }
            this.ap = ak();
            a.a(this.ap, "BaseOrchestrationFragmesidecar").c();
        }
        if (bundle != null) {
            m29602a(this.ap.f32598l == 1, true);
        }
    }

    public final void mo5472a(View view, String str) {
        if (view == this.ah) {
            Context g = g();
            Intent a = ci.m30842a(g, str);
            try {
                g.startActivity(a);
            } catch (ActivityNotFoundException e) {
                String str2 = "BaseOrchestrationFragme";
                String str3 = "Actvity was not found for intent, ";
                String valueOf = String.valueOf(a.toString());
                Log.w(str2, valueOf.length() != 0 ? str3.concat(valueOf) : new String(str3));
            }
        } else if (view == this.ag && this.B.a("BaseOrchestrationFragmewebViewDialog") == null) {
            cw.m30919a(str, this.bc).a(this.B, "BaseOrchestrationFragmewebViewDialog");
        }
    }

    public void onFocusChange(View view, boolean z) {
        if (view.getId() == C6634c.steal_focus_and_hide_keyboard && z) {
            ci.m30879b(h(), view);
        }
    }

    public final void mo5476b(Intent intent) {
        if (this.f32595g instanceof C6525b) {
            ((C6525b) this.f32595g).mo5476b(intent);
        }
    }

    public C6504m getParentUiNode() {
        return null;
    }

    public void setParentUiNode(C6504m c6504m) {
        throw new UnsupportedOperationException("Top level UiNode doesn't support custom parents.");
    }

    public final C6565a mo5480c() {
        return this.at;
    }

    public final void m29610a(int i, Bundle bundle, boolean z) {
        if (z) {
            this.aw.m29882b(i, bundle);
        } else if (l()) {
            m29603b(i, bundle);
        } else {
            this.aJ = true;
            this.aK = i;
            this.aL = bundle;
        }
    }

    private final void m29603b(int i, Bundle bundle) {
        int i2 = 1;
        this.aw.m29881a(i, bundle);
        LogContext as = as();
        switch (i) {
            case 50:
                break;
            case 51:
                i2 = 3;
                break;
            case 52:
                i2 = 4;
                break;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Unknown orchestration result: %d", new Object[]{Integer.valueOf(i)}));
        }
        C6537a.m29682a(as, i2);
    }

    public final Account mo5474b() {
        return this.ay;
    }

    public final void mo5478b(C6504m c6504m) {
        C6567a.m29804a(c6504m, -1);
    }

    public final void mo5481c(C6504m c6504m) {
        C6567a.m29804a(c6504m, 1636);
    }
}
