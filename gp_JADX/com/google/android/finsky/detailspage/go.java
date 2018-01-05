package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.cu;
import com.google.android.finsky.billing.common.C1804v;
import com.google.android.finsky.bq.C2156a;
import com.google.android.finsky.bq.C2157b;
import com.google.android.finsky.bq.C2160e;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.cv.p177a.bl;
import com.google.android.finsky.cv.p177a.lt;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.instantapps.p220f.C3492q;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class go extends ck implements C2160e, C0999d, ad, bm, gn {
    public ce f14633d;
    public cu f14634e;
    public C2156a f14635f;

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.title_module;
    }

    public final boolean mo2979f() {
        return this.b != null;
    }

    public final void m14397a(gp gpVar) {
        super.mo2973a(gpVar);
        if (this.b != null) {
            m14389d();
            this.D.mo2814a((C0999d) this);
        }
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        boolean z2;
        switch (document.f14885a.f12098e) {
            case 1:
            case 2:
            case 5:
            case 6:
            case 16:
            case 17:
            case 18:
            case 24:
            case 25:
            case 44:
            case 64:
                z2 = true;
                break;
            default:
                z2 = false;
                break;
        }
        if (z2) {
            if (this.b == null) {
                this.b = new gp();
                ((gp) this.b).f14640e = z;
                ((gp) this.b).f14637b = document;
                ((gp) this.b).f14638c = document2;
                if (document.aZ()) {
                    ((gp) this.b).f14641f = String.valueOf(document.bc());
                }
                m14389d();
                this.D.mo2814a((C0999d) this);
            } else if (z) {
                ((gp) this.b).f14636a = document;
                ((gp) this.b).f14640e = z;
                m14388b();
                this.u.mo3033a(this, false);
            }
            if (C1473m.f7980a.dj().mo2294a(12636357) && this.f14635f == null) {
                this.f14635f = new C2156a();
                if (this.b != null && !((gp) this.b).f14643h) {
                    C2156a c2156a = this.f14635f;
                    Context context = this.t;
                    c2156a.f10909a = this.J;
                    c2156a.f10910b = this;
                    if (TextUtils.isEmpty(document.cD())) {
                        Log.d("InstantAppsLauncher", "shouldShowLaunchButton false: no instant default url");
                        c2156a.f10909a.m13367a(new C2474c(2900));
                        c2156a.f10910b.mo3099a(null);
                    } else if (C3492q.m17062a(context.getPackageManager())) {
                        bb.m21792a(new C2157b(context, document.cD(), this, c2156a.f10911c, c2156a.f10909a), new Void[0]);
                    } else {
                        Log.d("InstantAppsLauncher", "shouldShowLaunchButton false: no runtime present");
                        c2156a.f10909a.m13367a(new C2474c(2901));
                        c2156a.f10910b.mo3099a(null);
                    }
                }
            }
        }
    }

    private final void m14388b() {
        if (((gp) this.b).f14636a != null) {
            if (C1473m.f7980a.dj().mo2294a(12620851) && ((gp) this.b).f14636a.f14885a.f12098e == 6) {
                bl blVar;
                Parcel obtain = Parcel.obtain();
                ((gp) this.b).f14636a.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                Document document = (Document) Document.CREATOR.createFromParcel(obtain);
                obtain.recycle();
                C1473m.f7980a.ab();
                Collection b = C1804v.m9805b(this.D.mo2811a(this.w.mo1620b()));
                Map hashMap = new HashMap();
                for (lt ltVar : document.m14615D()) {
                    if (b.contains(ltVar.f13059b.f12097d)) {
                        for (bl blVar2 : ltVar.f13060c) {
                            blVar = (bl) hashMap.get(blVar2.f11907B);
                            if (blVar == null || blVar2.f11932v.f12004c < blVar.f11932v.f12004c) {
                                hashMap.put(blVar2.f11907B, blVar2);
                            }
                        }
                    }
                }
                for (bl blVar3 : document.f14885a.f12107n) {
                    blVar = (bl) hashMap.get(blVar3.f11907B);
                    if (blVar != null) {
                        blVar3.f11915e = blVar.f11932v.f12004c;
                        blVar3.m12272a(blVar.f11915e);
                        blVar3.m12273a(blVar.f11917g);
                        blVar3.m12277b(blVar.f11922l);
                    }
                }
                ((gp) this.b).f14637b = document;
                return;
            }
            ((gp) this.b).f14637b = ((gp) this.b).f14636a;
        }
    }

    private final void m14389d() {
        if (this.f14634e != null) {
            this.f14634e.mo1313a();
        }
        this.f14634e = com.google.android.finsky.activities.bl.m6308a(this.v, ((gp) this.b).f14637b.f14885a.f12099f, this.w.mo1620b());
        this.f14634e.mo1316a(this.t, this.z, this.y, this.A, true, this.C, this.F, this.G, this, this.J);
    }

    public final void mo2976b(View view, int i) {
        this.f14634e.mo1317a(((gp) this.b).f14637b, ((gp) this.b).f14638c, true, ((gp) this.b).f14641f, ((gp) this.b).f14640e, ((gp) this.b).f14642g, view);
    }

    public final void mo2980h() {
        if (this.f14634e != null) {
            this.f14634e.mo1313a();
        }
        this.D.mo2819b(this);
        if (this.f14635f != null) {
            this.f14635f.f10910b = null;
        }
    }

    public final void mo1202a(int i, Bundle bundle) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
                this.f14634e.mo1315a(i, bundle);
                return;
            case 5:
                Intent intent = new Intent("android.settings.WIFI_SETTINGS");
                intent.setFlags(537526272);
                this.A.m580a(intent);
                return;
            default:
                return;
        }
    }

    public final void mo1211b(int i, Bundle bundle) {
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        m14388b();
        this.u.mo3033a(this, false);
    }

    public final void mo3030a(Bitmap bitmap) {
        if (!((gp) this.b).f14639d) {
            this.f14634e.mo1321a(bitmap);
        }
    }

    public final void mo3028a() {
        if (!((gp) this.b).f14639d) {
            this.f14634e.mo1328n();
        }
    }

    public ce getPlayStoreUiElement() {
        if (this.f14633d == null) {
            this.f14633d = C2482j.m13283a(1869);
        }
        return this.f14633d;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final void mo3099a(Intent intent) {
        ((gp) this.b).f14643h = true;
        ((gp) this.b).f14642g = intent;
        if (intent != null) {
            this.u.mo3033a(this, false);
        }
    }
}
