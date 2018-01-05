package com.google.android.finsky.wear;

import android.accounts.Account;
import android.os.AsyncTask;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.dv.C2903e;
import com.google.android.finsky.dv.C2906h;
import java.util.Map;

final class ce extends AsyncTask {
    public final /* synthetic */ Account f24941a;
    public final /* synthetic */ int f24942b;
    public final /* synthetic */ cj f24943c;
    public final /* synthetic */ String[] f24944d;
    public final /* synthetic */ cd f24945e;

    ce(cd cdVar, Account account, int i, cj cjVar, String[] strArr) {
        this.f24945e = cdVar;
        this.f24941a = account;
        this.f24942b = i;
        this.f24943c = cjVar;
        this.f24944d = strArr;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Map map = (Map) obj;
        C1473m c1473m = C1473m.f7980a;
        cd cdVar = this.f24945e;
        C2906h c2906h = new C2906h(this.f24945e.f24931d, c1473m.aN(), this.f24945e.f24935h, c1473m.mo2169c(), this.f24945e.f24933f, c1473m.mo2045Y(), this.f24945e.f24934g.f18023c, c1473m.mo2041U(), c1473m.bv(), c1473m.bF());
        C2903e c2903e = new C2903e();
        c2903e.f15437a = true;
        cdVar.f24939l = c2906h.m15161a(c2903e);
        this.f24945e.f24939l.m15156a(this.f24941a.name, map);
        this.f24945e.f24939l.m11918a(new cf(this));
        this.f24945e.f24939l.m11917a(new cg(this));
        this.f24945e.f24939l.m15157a(map);
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        if (((Boolean) C0955b.ew.m28964b()).booleanValue()) {
            return C1473m.f7980a.mo2029I().m17246a(this.f24945e.f24933f, true);
        }
        return this.f24945e.f24934g.m17246a(this.f24945e.f24933f, true);
    }
}
