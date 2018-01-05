package org.chromium.net.impl;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map.Entry;

final class at implements bd {
    public final /* synthetic */ af f40812a;

    at(af afVar) {
        this.f40812a = afVar;
    }

    public final void mo6615a() {
        if (this.f40812a.f40780g.get() != bq.CANCELLED) {
            URL url = new URL(this.f40812a.f40788o);
            if (this.f40812a.f40792s != null) {
                this.f40812a.f40792s.disconnect();
                this.f40812a.f40792s = null;
            }
            this.f40812a.f40792s = (HttpURLConnection) url.openConnection();
            this.f40812a.f40792s.setInstanceFollowRedirects(false);
            if (!this.f40812a.f40778e.containsKey("User-Agent")) {
                this.f40812a.f40778e.put("User-Agent", this.f40812a.f40777d);
            }
            for (Entry entry : this.f40812a.f40778e.entrySet()) {
                this.f40812a.f40792s.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            if (this.f40812a.f40784k == null) {
                this.f40812a.f40784k = "GET";
            }
            this.f40812a.f40792s.setRequestMethod(this.f40812a.f40784k);
            if (this.f40812a.f40785l != null) {
                boolean z;
                this.f40812a.f40793t = new bg(this.f40812a, this.f40812a.f40786m, this.f40812a.f40776c, this.f40812a.f40792s, this.f40812a.f40785l);
                bg bgVar = this.f40812a.f40793t;
                if (this.f40812a.f40779f.size() == 1) {
                    z = true;
                } else {
                    z = false;
                }
                bgVar.m38092a(new bm(bgVar, z));
                return;
            }
            this.f40812a.f40787n = 10;
            this.f40812a.f40792s.connect();
            af afVar = this.f40812a;
            afVar.f40787n = 13;
            afVar.f40776c.execute(afVar.m38066a(new ap(afVar)));
        }
    }
}
