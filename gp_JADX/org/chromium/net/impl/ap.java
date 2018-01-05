package org.chromium.net.impl;

import java.io.InputStream;
import java.util.AbstractMap.SimpleEntry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class ap implements bd {
    public final /* synthetic */ af f40807a;

    ap(af afVar) {
        this.f40807a = afVar;
    }

    public final void mo6615a() {
        if (this.f40807a.f40792s != null) {
            List arrayList = new ArrayList();
            String str = "http/1.1";
            int i = 0;
            while (true) {
                String headerFieldKey = this.f40807a.f40792s.getHeaderFieldKey(i);
                if (headerFieldKey == null) {
                    break;
                }
                if ("X-Android-Selected-Transport".equalsIgnoreCase(headerFieldKey)) {
                    str = this.f40807a.f40792s.getHeaderField(i);
                }
                if (!headerFieldKey.startsWith("X-Android")) {
                    arrayList.add(new SimpleEntry(headerFieldKey, this.f40807a.f40792s.getHeaderField(i)));
                }
                i++;
            }
            int responseCode = this.f40807a.f40792s.getResponseCode();
            this.f40807a.f40790q = new bx(new ArrayList(this.f40807a.f40779f), responseCode, this.f40807a.f40792s.getResponseMessage(), Collections.unmodifiableList(arrayList), false, str, "");
            if (responseCode < 300 || responseCode >= 400) {
                this.f40807a.m38078d();
                aw awVar;
                bx bxVar;
                if (responseCode >= 400) {
                    InputStream errorStream = this.f40807a.f40792s.getErrorStream();
                    this.f40807a.f40789p = errorStream == null ? null : aa.m38049a(errorStream);
                    awVar = this.f40807a.f40775b;
                    bxVar = this.f40807a.f40790q;
                    awVar.m38085a();
                    return;
                }
                this.f40807a.f40789p = aa.m38049a(this.f40807a.f40792s.getInputStream());
                awVar = this.f40807a.f40775b;
                bxVar = this.f40807a.f40790q;
                awVar.m38085a();
                return;
            }
            af afVar = this.f40807a;
            afVar.m38074a(bq.STARTED, bq.REDIRECT_RECEIVED, new ar(afVar, this.f40807a.f40790q.f40902h.m38130a()));
        }
    }
}
