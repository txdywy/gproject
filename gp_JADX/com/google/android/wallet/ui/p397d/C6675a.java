package com.google.android.wallet.ui.p397d;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.aw;
import android.support.v4.h.i;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.a.f.o;
import com.google.a.a.a.a.b.a.a.h.a.a;
import com.google.a.a.a.a.b.a.a.h.a.b;
import com.google.a.a.a.a.b.a.a.h.a.c;
import com.google.a.a.a.a.b.a.a.h.a.e;
import com.google.a.a.a.a.b.a.b.a.l;
import com.google.a.a.a.a.b.a.b.a.t;
import com.google.a.a.a.a.b.a.c.g;
import com.google.android.wallet.analytics.AppValidationResult;
import com.google.android.wallet.analytics.C6504m;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.clientlog.C6537a;
import com.google.android.wallet.common.util.C6589a;
import com.google.android.wallet.common.util.C6595g;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p366b.C6508h;
import com.google.android.wallet.p366b.C6511g;
import com.google.android.wallet.p366b.C6512i;
import com.google.android.wallet.p366b.C6515e;
import com.google.android.wallet.p366b.C6516f;
import com.google.android.wallet.p372d.C6524d;
import com.google.android.wallet.p372d.C6531c;
import com.google.android.wallet.p372d.C6615a;
import com.google.android.wallet.p372d.C6616b;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.ui.common.C6749z;
import com.google.android.wallet.ui.common.ai;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.common.ch;
import com.google.android.wallet.ui.expander.C6811c;
import com.google.android.wallet.ui.p393e.C6670a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public abstract class C6675a extends au implements C6511g, C6508h, C6524d {
    public static i al = new i(5);
    public final C6506n f32956a = new C6506n(1745);
    public C6670a af;
    public final ArrayList ag = new ArrayList();
    public e ah;
    public boolean ai = false;
    public boolean aj = false;
    public final ArrayList ak = new ArrayList();
    public final C6811c f32957b = new C6811c();
    public boolean f32958c;
    public boolean f32959d;
    public boolean f32960e;
    public byte[] f32961f;
    public ArrayList f32962g = new ArrayList();
    public c f32963h;
    public C6615a f32964i;

    public abstract C6670a mo5589a(o oVar);

    public abstract Intent ab();

    public abstract Intent ac();

    public final void mo5469a(int i, Bundle bundle) {
        super.mo5469a(i, bundle);
        if (i == 4 && !this.ai && ((b) this.aD).p == null && !this.f32960e) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("EventListener.EXTRA_ENABLE_UI_ENABLED", false);
            mo5469a(18, bundle2);
        }
    }

    protected final void mo5533W() {
        if (this.af != null) {
            boolean z = this.aH;
            int size = this.ag.size();
            for (int i = 0; i < size; i++) {
                ((ch) ((C6749z) this.ag.get(i)).f33285e).mo5519b(z);
            }
        }
    }

    public final void mo5477b(Bundle bundle) {
        super.mo5477b(bundle);
        if (bundle != null) {
            this.f32958c = bundle.getBoolean("androidAppValidationFinished");
            this.f32962g = ParcelableProto.m29891b(bundle, "successfullyValidatedApps");
            this.f32963h = (c) ParcelableProto.m29887a(bundle, "launchedAppRedirectInfo");
            this.f32959d = bundle.getBoolean("dependencyGraphTriggeredRedirect");
            this.f32960e = bundle.getBoolean("launchedRedirect");
            this.f32961f = bundle.getByteArray("dependencyGraphActionToken");
            this.ai = bundle.getBoolean("otherInstrumentSelectionsAvailable");
            this.aj = bundle.getBoolean("previouslyLaunchedAndAborted");
        } else {
            al.a(((b) this.aD).a.a, Boolean.valueOf(true));
        }
        if (this.f32960e && bundle != null && al.a(((b) this.aD).a.a) == null) {
            C6537a.m29707e(as());
        }
    }

    public final void m30265d(Bundle bundle) {
        super.d(bundle);
        this.f32964i = (C6615a) h().H_().a("appValidationSidecar");
        if (this.f32964i == null || bundle == null) {
            aw a = h().H_().a();
            if (this.f32964i != null) {
                a.a(this.f32964i);
            }
            this.f32964i = new C6615a();
            a.a(this.f32964i, "appValidationSidecar").c();
        }
    }

    public final void mo5537u() {
        super.mo5537u();
        this.f32964i.m29648a((C6524d) this);
    }

    public final void mo5559v() {
        super.mo5559v();
        this.f32964i.m29648a(null);
    }

    public final void mo5482e(Bundle bundle) {
        super.mo5482e(bundle);
        bundle.putBoolean("androidAppValidationFinished", this.f32958c);
        bundle.putParcelableArrayList("successfullyValidatedApps", ParcelableProto.m29889a(this.f32962g));
        bundle.putParcelable("launchedAppRedirectInfo", ParcelableProto.m29885a(this.f32963h));
        bundle.putBoolean("dependencyGraphTriggeredRedirect", this.f32959d);
        bundle.putBoolean("launchedRedirect", this.f32960e);
        bundle.putByteArray("dependencyGraphActionToken", this.f32961f);
        bundle.putBoolean("otherInstrumentSelectionsAvailable", this.ai);
        bundle.putBoolean("previouslyLaunchedAndAborted", this.aj);
    }

    public final void m30254a() {
        if (!h().isFinishing() && this.v) {
            h().H_().a().a(this.f32964i).c();
            this.f32964i = null;
        }
        super.a();
    }

    public final void mo5473a(C6531c c6531c) {
        if (c6531c != this.f32964i) {
            throw new IllegalArgumentException("Unexpected sidecar");
        }
        switch (c6531c.f32598l) {
            case 0:
                if (!this.f32958c) {
                    if (((b) this.aD).o.length > 0) {
                        C6615a c6615a = this.f32964i;
                        Context h = h();
                        new C6616b(c6615a, h, as()).execute(((b) this.aD).o);
                        return;
                    } else if (ah()) {
                        this.f32958c = true;
                        this.f32962g = new ArrayList();
                        ai();
                        return;
                    } else {
                        throw new IllegalStateException("No native apps to validate and no web flow fallback");
                    }
                }
                return;
            case 1:
                return;
            case 2:
                this.f32958c = true;
                this.f32962g = this.f32964i.mo5505W();
                ai();
                ArrayList X = this.f32964i.m29991X();
                int size = X.size();
                Bundle bundle = new Bundle();
                for (int i = 0; i < size; i++) {
                    AppValidationResult appValidationResult = (AppValidationResult) X.get(i);
                    bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE", 777);
                    bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", appValidationResult.f32503b);
                    bundle.putParcelable("EventListener.EXTRA_BACKGROUND_EVENT_DATA", appValidationResult);
                    mo5469a(7, bundle);
                }
                return;
            default:
                Log.e("DummyFormFragment", "Unexpected sidecar state: " + c6531c.f32598l);
                return;
        }
    }

    private final boolean ah() {
        return !TextUtils.isEmpty(((b) this.aD).b);
    }

    private final void ai() {
        boolean z = this.ai || ((b) this.aD).p != null;
        if (!this.f32958c || (z && !this.f32959d)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f32959d = false;
            c a = C6600l.m29937a(this.f32962g);
            if (a != null) {
                startActivityForResult(C6589a.m29892a(a), 502);
                this.f32963h = a;
                m30248a(false);
            } else if (ah()) {
                switch (((b) this.aD).g) {
                    case 2:
                        startActivityForResult(ab(), 501);
                        break;
                    case 3:
                        startActivityForResult(ac(), 500);
                        break;
                    default:
                        throw new IllegalArgumentException(String.format(Locale.US, "Unknown RedirectForm DisplayType: %d", new Object[]{Integer.valueOf(((b) this.aD).g)}));
                }
                m30248a(false);
            } else if (((b) this.aD).o.length > 0) {
                int i;
                String str = ((b) this.aD).o[0].j;
                if (this.ai) {
                    i = 1;
                } else {
                    i = 2;
                }
                mo5469a(5, C6595g.m29923a(new Bundle(), i, c(C6625i.wallet_uic_error_title), str, null, null, c(17039370)));
            } else {
                throw new IllegalStateException("Ready to launch redirect, but no details to proceed.");
            }
            this.f32960e = true;
        }
    }

    private final void m30248a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EventListener.EXTRA_ENABLE_UI_ENABLED", z);
        mo5469a(18, bundle);
    }

    protected final View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long j = ((b) this.aD).a.b;
        C6512i c6512i = this.aI;
        C6516f.m29562a(this, j, c6512i, c6512i);
        if (((b) this.aD).p == null) {
            return null;
        }
        View inflate = layoutInflater.inflate(C6623g.fragment_dummy_form, viewGroup, false);
        this.af = (C6670a) j().a(C6622f.fragment_holder);
        if (this.af == null) {
            this.af = mo5589a(((b) this.aD).p);
            j().a().a(C6622f.fragment_holder, this.af).c();
        }
        this.af.m29835a(this.aI, this.aJ);
        this.ag.add(new C6749z(this.af));
        return inflate;
    }

    public final void m30255a(int i, int i2, Intent intent) {
        switch (i) {
            case 500:
                if (i2 == -1) {
                    m30249b(0);
                    this.ah = al();
                    this.ah.a(intent.getData().toString());
                    mo5469a(8, C6675a.m30247a(this.f32961f));
                    return;
                }
                if (intent != null) {
                    m30249b(intent.getIntExtra("analyticsResult", -1));
                } else {
                    m30249b(4);
                }
                ak();
                return;
            case 501:
                switch (i2) {
                    case -1:
                        this.ah = (e) ParcelableProto.m29886a(intent, "formValue");
                        mo5469a(8, C6675a.m30247a(this.f32961f));
                        return;
                    case 0:
                    case 2:
                        ak();
                        return;
                    case 1:
                        Bundle bundleExtra = intent.getBundleExtra("errorDetails");
                        if (bundleExtra == null) {
                            throw new IllegalArgumentException("Error result must provide error details.");
                        }
                        mo5469a(5, bundleExtra);
                        return;
                    default:
                        throw new RuntimeException(String.format(Locale.US, "Unknown result code from popup redirect: %d", new Object[]{Integer.valueOf(i2)}));
                }
            case 502:
                switch (i2) {
                    case -1:
                        int size;
                        m30249b(0);
                        Bundle extras = intent.getExtras();
                        Set<String> keySet = extras != null ? extras.keySet() : null;
                        if (keySet != null) {
                            size = keySet.size();
                        } else {
                            size = 0;
                        }
                        a[] aVarArr = new a[size];
                        if (size > 0) {
                            HashSet hashSet = new HashSet(Arrays.asList(this.f32963h.i));
                            int i3 = 0;
                            for (String str : keySet) {
                                aVarArr[i3] = new a();
                                aVarArr[i3].c = str;
                                String string = extras.getString(str);
                                a aVar;
                                if (hashSet.contains(str)) {
                                    aVar = aVarArr[i3];
                                    if (string == null) {
                                        aVar.e = null;
                                        if (aVar.a == 1) {
                                            aVar.a = -1;
                                        }
                                    } else {
                                        aVar.a = -1;
                                        aVar.e = string;
                                        aVar.a = 1;
                                    }
                                } else {
                                    aVar = aVarArr[i3];
                                    if (string == null) {
                                        aVar.d = null;
                                        if (aVar.a == 0) {
                                            aVar.a = -1;
                                        }
                                    } else {
                                        aVar.a = -1;
                                        aVar.d = string;
                                        aVar.a = 0;
                                    }
                                }
                                i3++;
                            }
                        }
                        this.ah = al();
                        this.ah.k = aVarArr;
                        mo5469a(8, C6675a.m30247a(this.f32961f));
                        return;
                    case 0:
                        m30249b(5);
                        ak();
                        return;
                    default:
                        m30249b(4);
                        ak();
                        return;
                }
            default:
                super.a(i, i2, intent);
                return;
        }
    }

    private final void ak() {
        this.aj = true;
        m30248a(true);
        int size = this.ak.size();
        for (int i = 0; i < size; i++) {
            this.aJ.mo5460a((C6515e) this.ak.get(i));
        }
    }

    private final e al() {
        e eVar = new e();
        eVar.b = ((b) this.aD).a.a;
        eVar.c = ((b) this.aD).a.c;
        if (this.af != null) {
            eVar.j = this.af.m30218a(Bundle.EMPTY);
        }
        return eVar;
    }

    private static Bundle m30247a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("EventListener.EXTRA_DEPENDENCY_GRAPH_ACTION_TOKEN", bArr);
        return bundle;
    }

    private final void m30249b(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE", 778);
        bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", i);
        mo5469a(7, bundle);
    }

    public final boolean mo5535a(g gVar) {
        int size = this.ag.size();
        int i = 0;
        while (i < size) {
            if ((((C6749z) this.ag.get(i)).f33285e instanceof ai) && ((ai) ((C6749z) this.ag.get(i)).f33285e).mo5535a(gVar)) {
                return true;
            }
            i++;
        }
        return false;
    }

    public final boolean mo5523a(String str, int i) {
        int size = this.ag.size();
        int i2 = 0;
        while (i2 < size) {
            if ((((C6749z) this.ag.get(i2)).f33285e instanceof ai) && ((ai) ((C6749z) this.ag.get(i2)).f33285e).mo5523a(str, i)) {
                return true;
            }
            i2++;
        }
        return false;
    }

    public final boolean mo5534X() {
        int size = this.ag.size();
        int i = 0;
        while (i < size) {
            if ((((C6749z) this.ag.get(i)).f33285e instanceof ai) && !((ai) ((C6749z) this.ag.get(i)).f33285e).mo5534X()) {
                return false;
            }
            i++;
        }
        return true;
    }

    public C6506n getUiElement() {
        return this.f32956a;
    }

    public List getChildren() {
        int size = this.ag.size();
        List arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            Object obj = ((C6749z) this.ag.get(i)).f33285e;
            if (obj instanceof C6504m) {
                arrayList.add((C6504m) obj);
            }
        }
        return arrayList;
    }

    public final ArrayList aa() {
        return this.ag;
    }

    public C6811c getExpandable() {
        return this.f32957b;
    }

    public void setTriggerListener(C6512i c6512i) {
        this.aJ = c6512i;
    }

    public final void mo5456a(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C6515e c6515e = (C6515e) arrayList.get(i);
            if (c6515e.f32578a.d != 10) {
                throw new IllegalArgumentException(String.format(Locale.US, "Trigger received for unsupported type: %d", new Object[]{Integer.valueOf(c6515e.f32578a.d)}));
            } else {
                this.ak.add(c6515e);
                i++;
            }
        }
    }

    public final boolean mo5457a(t tVar) {
        return false;
    }

    public final void mo5459a(l lVar, t[] tVarArr) {
        switch (lVar.c) {
            case 19:
                break;
            case 26:
                if (this.aj) {
                    this.ah = al();
                    this.ah.g = true;
                    Bundle bundle = Bundle.EMPTY;
                    if (lVar.e() != null) {
                        bundle = C6675a.m30247a(lVar.e().a);
                    }
                    mo5469a(8, bundle);
                    return;
                }
                break;
            default:
                throw new IllegalArgumentException(String.format(Locale.US, "Resulting action received for unsupported action: %d", new Object[]{Integer.valueOf(lVar.c)}));
        }
        this.f32959d = true;
        if (lVar.e() != null) {
            this.f32961f = lVar.e().a;
        }
        ai();
    }

    protected final h mo5521Z() {
        ao();
        return ((b) this.aD).a;
    }
}
