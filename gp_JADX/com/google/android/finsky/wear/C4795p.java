package com.google.android.finsky.wear;

import android.net.Uri;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.wearable.C5617e;
import com.google.android.gms.wearable.C5619g;
import com.google.android.gms.wearable.C5620h;
import com.google.android.gms.wearable.C5652n;
import java.util.List;

final class C4795p {
    public final Uri f25020a;
    public final String f25021b;
    public final String f25022c;
    public final String f25023d;
    public final String f25024e;
    public final String[] f25025f;
    public final boolean f25026g;
    public Uri f25027h;
    public Uri f25028i;
    public int f25029j;
    public String f25030k;
    public C3647b f25031l;

    private C4795p(C5617e c5617e) {
        this.f25020a = c5617e.mo5123b();
        List pathSegments = this.f25020a.getPathSegments();
        if (pathSegments == null || pathSegments.size() < 3) {
            this.f25022c = null;
            this.f25023d = null;
        } else {
            this.f25022c = (String) pathSegments.get(1);
            this.f25023d = (String) pathSegments.get(2);
        }
        C5620h a = C5620h.m26634a(c5617e.mo5124c());
        this.f25025f = a.m26664j("nodeIds");
        if (this.f25025f == null || this.f25025f.length != 1) {
            this.f25021b = null;
        } else {
            this.f25021b = this.f25025f[0];
        }
        if ("install_wearable".equals(pathSegments.get(0))) {
            this.f25026g = false;
            this.f25024e = a.m26660f("assetIdentifier");
            return;
        }
        this.f25026g = true;
        this.f25024e = null;
    }

    public static void m22560a(C5058o c5058o, List list, boolean z) {
        Uri uri;
        if (z) {
            uri = cl.f24962f;
        } else {
            uri = cl.f24961e;
        }
        C5619g c5619g = (C5619g) C5652n.f28708a.mo5116a(c5058o, uri, 1).mo4487a();
        if (c5619g.f28574d.m23271a()) {
            int c = c5619g.mo4501c();
            for (int i = 0; i < c; i++) {
                list.add(new C4795p((C5617e) c5619g.mo4502a(i)));
            }
        } else {
            FinskyLog.m21665c("Error %d getting requests. (%s)", Integer.valueOf(c5619g.f28574d.f25631g), c5619g.f28574d.f25632h);
        }
        c5619g.mo4500a();
    }

    public final void m22561a(List list) {
        if (this.f25027h != null) {
            list.add(this.f25027h);
        }
        if (this.f25028i != null) {
            list.add(this.f25028i);
        }
        list.add(this.f25020a);
    }
}
