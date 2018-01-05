package com.google.android.finsky.stream.myapps;

import android.os.AsyncTask;
import com.google.android.finsky.dv.C2903e;
import com.google.android.finsky.dv.C2906h;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class C4555v extends AsyncTask {
    public final /* synthetic */ C4552s f23293a;

    C4555v(C4552s c4552s) {
        this.f23293a = c4552s;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        Map map = (Map) obj;
        boolean z = false;
        if (this.f23293a.f23286m != null) {
            this.f23293a.f23286m.m15156a(this.f23293a.f23278e, map);
            if (!this.f23293a.f23287n.equals(map)) {
                this.f23293a.f23286m.m11922b(this.f23293a.f23276c);
                this.f23293a.f23286m.m11921b(this.f23293a.f23277d);
                z = true;
            }
            this.f23293a.m21169a();
        }
        boolean a = this.f23293a.f23281h.dj().mo2294a(12609858);
        C4552s c4552s = this.f23293a;
        C2906h c2906h = this.f23293a.f23282i;
        C2903e c2903e = new C2903e();
        c2903e.f15438b = a;
        c2903e.f15439c = this.f23293a.f23279f;
        c2903e.f15440d = true;
        c4552s.f23286m = c2906h.m15161a(c2903e);
        if (!z) {
            this.f23293a.f23286m.m15156a(this.f23293a.f23278e, map);
        }
        this.f23293a.f23287n = map;
        this.f23293a.f23286m.m11918a(this.f23293a.f23276c);
        this.f23293a.f23286m.m11917a(this.f23293a.f23277d);
        this.f23293a.f23286m.m15157a(map);
        for (Entry value : map.entrySet()) {
            if (((Set) value.getValue()).size() > 0) {
                return;
            }
        }
        this.f23293a.m21169a();
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f23293a.f23283j.m17246a(this.f23293a.f23280g, false);
    }
}
