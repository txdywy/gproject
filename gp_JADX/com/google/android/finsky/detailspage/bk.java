package com.google.android.finsky.detailspage;

import android.content.pm.PackageManager;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.layout.C3656x;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.C1294w;
import com.google.wireless.android.finsky.dfe.nano.cc;
import com.squareup.leakcanary.C7582R;

public class bk extends ck {
    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.discovery_bar;
    }

    public final boolean mo2979f() {
        if (this.b == null) {
            return false;
        }
        if (((bl) this.b).f14300a.ae()) {
            return false;
        }
        if (((bl) this.b).f14302c != null) {
            return ((bl) this.b).f14302c.length > 0;
        } else {
            switch (((bl) this.b).f14300a.f14885a.f12098e) {
                case 1:
                case 2:
                case 5:
                case 6:
                case 16:
                case 17:
                case 18:
                case 24:
                case 25:
                case 64:
                    return true;
                default:
                    return false;
            }
        }
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (document.ae()) {
            this.u.mo3032a(this);
        } else if (document.f14885a.f12098e != 3) {
            if (this.b == null) {
                this.b = new bl();
            }
            if (((bl) this.b).f14302c == null) {
                ((bl) this.b).f14300a = document;
                ((bl) this.b).f14301b = document2;
                if (z) {
                    cc[] ccVarArr;
                    bl blVar = (bl) this.b;
                    if (c2719i2.f14925a == null) {
                        ccVarArr = null;
                    } else {
                        ccVarArr = c2719i2.f14925a.h;
                    }
                    blVar.f14302c = ccVarArr;
                    if (((bl) this.b).f14302c == null || ((bl) this.b).f14302c.length <= 0) {
                        this.u.mo3032a(this);
                    } else {
                        this.u.mo3033a(this, true);
                    }
                }
            }
        }
    }

    public final void mo2976b(View view, int i) {
        C3656x c3656x = (C3656x) view;
        if (((bl) this.b).f14302c == null) {
            LayoutInflater from = LayoutInflater.from(c3656x.getContext());
            c3656x.f18142j.removeAllViews();
            c3656x.f18142j.setDividerDrawable(null);
            if (c3656x.f18143k) {
                c3656x.setupBadgePlaceholder(from);
            } else {
                c3656x.setupEmptyPlaceholder(from);
            }
        } else if (!c3656x.f18145m) {
            C3748a c3748a = this.z;
            C1294w c1294w = this.y;
            Document document = ((bl) this.b).f14301b;
            cc[] ccVarArr = ((bl) this.b).f14302c;
            DfeToc dn = C1473m.f7980a.dn();
            PackageManager packageManager = C1473m.f7980a.f7981b.getPackageManager();
            boolean z = ((bl) this.b).f14303d;
            int i2 = ((bl) this.b).f14304e;
            ad adVar = this.I;
            C2495w c2495w = this.J;
            if (ccVarArr == null || ccVarArr.length == 0) {
                c3656x.setVisibility(8);
            } else {
                c3656x.setVisibility(0);
                c3656x.f18145m = true;
                c3656x.f18136d = document;
                c3656x.f18137e = ccVarArr;
                c3656x.f18138f = c1294w;
                c3656x.f18139g = c3748a;
                c3656x.f18140h = dn;
                c3656x.f18141i = packageManager;
                c3656x.f18146n = adVar;
                c3656x.f18144l = c2495w;
                c3656x.mo3558a(z, i2);
                c3656x.mo3557a();
            }
            ((bl) this.b).f14303d = false;
        }
    }

    public final void mo3037c(View view, int i) {
        C3656x c3656x = (C3656x) view;
        if (this.b != null) {
            ((bl) this.b).f14303d = true;
            ((bl) this.b).f14304e = c3656x.getScrollPosition();
        }
    }
}
