package com.google.android.wallet.ui.p397d;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.p;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.a.h.a.c;
import com.google.a.a.a.a.b.a.a.h.a.e;
import com.google.a.a.a.a.b.a.c.g;
import com.google.android.gms.common.d;
import com.google.android.gms.f.a;
import com.google.android.gms.f.b;
import com.google.android.wallet.analytics.C6494b;
import com.google.android.wallet.analytics.C6496d;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.clientlog.C6537a;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.common.util.C6589a;
import com.google.android.wallet.common.util.C6595g;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.redirect.C6677m;
import com.google.android.wallet.redirect.C6697b;
import com.google.android.wallet.redirect.C6699e;
import com.google.android.wallet.redirect.C6703h;
import com.google.android.wallet.ui.common.WebViewLayout;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.ct;
import java.util.ArrayList;
import java.util.List;

public abstract class C6678c extends au implements b, C6677m {
    public final C6506n f32965a = new C6506n(1745);
    public c af;
    public List ag = new ArrayList();
    public C6494b ah;
    public C6496d ai;
    public WebViewLayout f32966b;
    public C6703h f32967c;
    public String f32968d;
    public String f32969e;
    public C6699e f32970f;
    public String f32971g;
    public boolean f32972h;
    public boolean f32973i;

    public abstract Intent mo5599a(Context context, c cVar, String str, int i, LogContext logContext);

    public static Bundle m30276a(com.google.a.a.a.a.b.a.a.h.a.b bVar, ArrayList arrayList, int i, LogContext logContext) {
        Bundle a = au.m29850a(i, bVar, logContext);
        a.putParcelableArrayList("successfullyValidatedApps", ParcelableProto.m29889a(arrayList));
        return a;
    }

    protected final void mo5533W() {
        if (this.f32966b != null) {
            this.f32966b.setEnabled(this.aH);
        }
    }

    public final void mo5477b(Bundle bundle) {
        super.mo5477b(bundle);
        this.ag = ParcelableProto.m29891b(this.q, "successfullyValidatedApps");
    }

    protected final View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C6623g.fragment_redirect, viewGroup, false);
        this.f32966b = (WebViewLayout) inflate.findViewById(C6622f.web_view_layout);
        if (bundle != null) {
            this.af = (c) ParcelableProto.m29887a(bundle, "launchedAppRedirectInfo");
        }
        if (this.af == null && ai()) {
            if (!TextUtils.isEmpty(((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).j)) {
                this.f32966b.setUserAgent(((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).j);
            }
            this.f32966b.setLoadingText(((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).d);
            this.f32966b.setErrorText(((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).l);
            this.f32966b.setWebViewSizingMode(2);
            this.f32967c = new C6703h(h(), this.f32966b.getWebView(), ((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).e, ((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).f, ((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).h, ((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).i, ((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).r, as());
            this.f32967c.f33064q = this;
            this.f32967c.f33065r = this;
            if (this.f32967c != null && VERSION.SDK_INT >= 21) {
                this.f32967c.f33068u = this.ag;
            }
            this.f32966b.setWebViewClient(this.f32967c);
            if (((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).u && VERSION.SDK_INT >= 21) {
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.f32966b.getWebView(), true);
            }
            C6697b.m30347a(h(), this);
        } else {
            an();
        }
        mo5519b(false);
        return inflate;
    }

    public void mo5470a(Activity activity) {
        super.mo5470a(activity);
        if (this.f32967c != null) {
            this.f32967c.f33064q = this;
            this.f32967c.f33065r = this;
        }
    }

    public final void m30284a() {
        super.a();
        if (this.f32967c != null) {
            this.f32967c.f33064q = null;
            this.f32967c.f33065r = null;
        }
    }

    public final void mo5482e(Bundle bundle) {
        super.mo5482e(bundle);
        bundle.putParcelable("launchedAppRedirectInfo", ParcelableProto.m29885a(this.af));
    }

    private final boolean ai() {
        return !TextUtils.isEmpty(((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).b);
    }

    public final boolean mo5535a(g gVar) {
        return false;
    }

    public final boolean mo5534X() {
        return ak() || al() || am() || this.f32972h;
    }

    public C6506n getUiElement() {
        return this.f32965a;
    }

    public List getChildren() {
        return null;
    }

    public final ArrayList aa() {
        return new ArrayList();
    }

    protected final h mo5521Z() {
        ao();
        return ((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).a;
    }

    public final e ac() {
        e eVar = new e();
        eVar.b = ((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).a.a;
        eVar.c = ((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).a.c;
        if (ak()) {
            String str = this.f32969e;
            if (str == null) {
                eVar.d = null;
                if (eVar.a == 0) {
                    eVar.a = -1;
                }
            } else {
                eVar.a = -1;
                eVar.d = str;
                eVar.a = 0;
            }
        } else if (al()) {
            eVar.a(this.f32968d);
        } else if (am()) {
            eVar.i = this.f32971g;
        } else if (this.f32972h) {
            eVar.h = true;
        } else {
            throw new IllegalStateException("Unknown RedirectFormValue state.");
        }
        if (this.f32970f != null && this.f32970f.m30351b()) {
            eVar.f = this.f32970f.m30350a();
        }
        return eVar;
    }

    public final void mo5594a(String str, C6699e c6699e) {
        this.f32969e = str;
        this.f32968d = null;
        this.f32970f = c6699e;
        mo5469a(8, Bundle.EMPTY);
    }

    public final void mo5596b(String str, C6699e c6699e) {
        this.f32968d = str;
        this.f32969e = null;
        this.f32970f = c6699e;
        mo5469a(8, Bundle.EMPTY);
    }

    public final void mo5595b() {
        m30278b(((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).k);
    }

    public final void mo5593a(c cVar, String str) {
        int i;
        int size = this.ag.size();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar2 = (c) this.ag.get(i2);
            if (cVar2.b == 1 && cVar.c.equals(cVar2.c)) {
                i = 1;
                break;
            }
        }
        i = 0;
        if (i == 0) {
            String str2 = "Trying to Intent to invalid third-party app with URL: ";
            String valueOf = String.valueOf(str);
            throw new UnsupportedOperationException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
        }
        this.f32966b.getWebView().stopLoading();
        an();
        TypedArray obtainStyledAttributes = this.bd.obtainStyledAttributes(new int[]{C6617a.uicPopupRedirectActivityTheme});
        size = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        startActivityForResult(mo5599a(h(), cVar, str, size, as()), 502);
        this.af = cVar;
    }

    public final void b_(String str) {
        this.f32971g = str;
        mo5469a(8, Bundle.EMPTY);
        C6537a.m29706d(as());
    }

    public final void mo5592a(int i, String str) {
        Object obj = null;
        Object obj2 = (i == -1 && "net::ERR_CACHE_MISS".equals(str)) ? 1 : null;
        if (obj2 == null) {
            switch (i) {
                case -8:
                case -6:
                case -1:
                    break;
                default:
                    obj = 1;
                    break;
            }
            if (obj != null) {
                m30278b(((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).m);
            }
        } else if (h() != null && !h().isFinishing()) {
            m30278b(((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).l);
        }
    }

    public final void mo5598c() {
        p pVar = (p) this.B.a("errorDialog");
        if (pVar != null) {
            pVar.a(false);
        }
        ct ctVar = new ct();
        ctVar.f33659b = c(C6625i.wallet_uic_error_title);
        ctVar.f33660c = ((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).n;
        ctVar.f33663f = c(17039370);
        ctVar.f33666i = this.bc;
        ctVar.m30918a().a(this.B, "errorDialog");
    }

    private final void m30278b(String str) {
        if (this.f32966b != null) {
            this.f32966b.setVisibility(4);
        }
        this.f32968d = null;
        this.f32969e = null;
        this.f32970f = null;
        mo5469a(5, C6595g.m29923a(new Bundle(), 2, c(C6625i.wallet_uic_error_title), str, null, null, c(17039370)));
    }

    private final boolean ak() {
        return !TextUtils.isEmpty(this.f32969e);
    }

    private final boolean al() {
        return !TextUtils.isEmpty(this.f32968d);
    }

    private final boolean am() {
        return !TextUtils.isEmpty(this.f32971g);
    }

    public final void cS_() {
        this.f32973i = true;
        if (ai() && this.f32973i) {
            this.f32966b.m30704a(((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).b, C6678c.m30279c(((com.google.a.a.a.a.b.a.a.h.a.b) this.aD).c));
            mo5519b(true);
        }
        m30277b(776, 0);
    }

    public final void m30286a(int i, Intent intent) {
        if (C6589a.m29896a()) {
            cS_();
            return;
        }
        m30277b(776, i);
        if (d.a(i)) {
            com.google.android.gms.common.e.a(i, h(), this, 6000, new C6801d(this));
            if (this.ai != null) {
                this.ai.mo5481c(this);
                return;
            }
            return;
        }
        ah();
    }

    final void ah() {
        mo5469a(10, Bundle.EMPTY);
    }

    public final void m30285a(int i, int i2, Intent intent) {
        switch (i) {
            case 502:
                if (i2 == -1) {
                    m30277b(778, 0);
                    this.f32968d = intent.getData().toString();
                    this.f32969e = null;
                    this.f32970f = null;
                    mo5469a(8, Bundle.EMPTY);
                    return;
                } else if (i2 == 0 && this.af.k) {
                    this.f32972h = true;
                    mo5469a(8, Bundle.EMPTY);
                    return;
                } else {
                    int intExtra;
                    if (intent != null) {
                        intExtra = intent.getIntExtra("analyticsResult", -1);
                    } else if (i2 == 0) {
                        intExtra = 5;
                    } else {
                        intExtra = 4;
                    }
                    m30277b(778, intExtra);
                    mo5469a(10, Bundle.EMPTY);
                    return;
                }
            case 6000:
                a.a(h(), this);
                return;
            default:
                super.a(i, i2, intent);
                return;
        }
    }

    private final void m30277b(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE", i);
        bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", i2);
        mo5469a(7, bundle);
    }

    private final void an() {
        ViewGroup viewGroup = (ViewGroup) this.f32966b.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f32966b);
        }
        this.f32966b = null;
        this.f32967c = null;
    }

    private static String m30279c(String str) {
        C6699e c6699e = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Throwable th;
        try {
            c6699e = new C6699e("POST", str);
            th = null;
        } catch (IllegalArgumentException e) {
            th = e;
        }
        if (th == null && c6699e != null && c6699e.m30352c()) {
            return c6699e.m30350a();
        }
        if (((Boolean) com.google.android.wallet.a.a.i.a()).booleanValue()) {
            String str2 = "Invalid initial post body: ";
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
        }
        throw new IllegalArgumentException("Invalid initial post body.");
    }
}
