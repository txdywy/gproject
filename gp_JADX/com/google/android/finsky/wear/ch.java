package com.google.android.finsky.wear;

import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2718h;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

final class ch implements C1031w {
    public final /* synthetic */ C2718h f24948a;
    public final /* synthetic */ int f24949b;
    public final /* synthetic */ String f24950c;
    public final /* synthetic */ cj f24951d;
    public final /* synthetic */ String f24952e;
    public final /* synthetic */ cd f24953f;

    ch(cd cdVar, C2718h c2718h, int i, String str, cj cjVar, String str2) {
        this.f24953f = cdVar;
        this.f24948a = c2718h;
        this.f24949b = i;
        this.f24950c = str;
        this.f24951d = cjVar;
        this.f24952e = str2;
    }

    public final void m_() {
        if (!this.f24948a.mo2861a()) {
            return;
        }
        if (this.f24953f.f24933f.mo2817b() != this.f24949b) {
            FinskyLog.m21665c("Skip check update for node %s package %s - account hash changed.", this.f24953f.f24932e, this.f24950c);
            cd.m22508a(this.f24951d, false);
            return;
        }
        List b = this.f24948a.m14719b();
        cd cdVar = this.f24953f;
        String str = this.f24950c;
        String str2 = this.f24952e;
        cj cjVar = this.f24951d;
        if (b == null) {
            FinskyLog.m21665c("Doc list is null", new Object[0]);
            cd.m22508a(cjVar, false);
        } else if (b.isEmpty()) {
            FinskyLog.m21659a("No documents returned", new Object[0]);
            cd.m22508a(cjVar, false);
        } else {
            Document document = (Document) b.get(0);
            C2441n N = document.m14625N();
            if (N.f13171k.equals(str)) {
                cdVar.f24936i.m22550a(cdVar.f24932e, N.f13171k, N.f13163c, str2, document.f14885a.f12100g, cdVar.f24929b.m13184a("wear_auto_install"));
                cd.m22508a(cjVar, true);
                return;
            }
            FinskyLog.m21667d("Wrong document returned %s, expect %s", N.f13171k, str);
            cd.m22508a(cjVar, false);
        }
    }
}
