package com.google.android.finsky.instantappsbackendclient.impl;

import com.google.protobuf.nano.C0757i;
import com.squareup.okhttp.ac;
import com.squareup.okhttp.ad;
import com.squareup.okhttp.ah;
import com.squareup.okhttp.ai;
import java.util.Collections;
import java.util.Map;

public final class C3598z implements C3570t {
    public final ad f17908a;

    C3598z(ad adVar) {
        this.f17908a = adVar;
    }

    public final af mo3544a(ac acVar) {
        ah a;
        ah ahVar = new ah();
        String str = acVar.f17861d;
        Map unmodifiableMap = Collections.unmodifiableMap(acVar.f17860c);
        C0757i c0757i = acVar.f17859b;
        if (acVar.f17858a == 0) {
            a = ahVar.a(str).a("GET", null);
        } else if (acVar.f17858a == 1) {
            ahVar = ahVar.a(str);
            ahVar.a("POST", ai.a(ac.a("application/x-protobuf"), C0757i.m4909a(c0757i)));
            a = ahVar;
        } else {
            a = ahVar;
        }
        String str2 = "Authorization";
        a.b(str2, (String) unmodifiableMap.get(str2));
        a.b("Content-Type", "application/x-protobuf");
        return new ab(this.f17908a.m29020a(a.a()).a());
    }
}
