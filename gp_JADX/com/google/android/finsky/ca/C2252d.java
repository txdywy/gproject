package com.google.android.finsky.ca;

import android.os.AsyncTask;
import com.google.wireless.android.finsky.dfe.nano.dj;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class C2252d extends AsyncTask {
    public final /* synthetic */ boolean f11187a;
    public final /* synthetic */ C2251c f11188b;

    public C2252d(C2251c c2251c, boolean z) {
        this.f11188b = c2251c;
        this.f11187a = z;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        for (Entry entry : ((Map) obj).entrySet()) {
            String str = (String) entry.getKey();
            Set<String> set = (Set) entry.getValue();
            dj[] djVarArr = new dj[set.size()];
            int i = 0;
            for (String a : set) {
                int i2 = i + 1;
                djVarArr[i] = this.f11188b.m11684a(a, str);
                i = i2;
            }
            if (this.f11187a) {
                this.f11188b.m11686a(djVarArr, str, null);
            } else {
                this.f11188b.m11687b(djVarArr, str, null);
            }
        }
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f11188b.f11179b.m17246a(this.f11188b.f11178a, true);
    }
}
