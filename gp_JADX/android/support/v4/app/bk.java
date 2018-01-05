package android.support.v4.app;

import android.support.v4.view.ai;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

final class bk implements Runnable {
    public final /* synthetic */ ArrayList f1411a;
    public final /* synthetic */ Map f1412b;

    bk(ArrayList arrayList, Map map) {
        this.f1411a = arrayList;
        this.f1412b = map;
    }

    public final void run() {
        int size = this.f1411a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f1411a.get(i);
            String u = ai.f1848a.mo422u(view);
            if (u != null) {
                String str;
                for (Entry entry : this.f1412b.entrySet()) {
                    if (u.equals(entry.getValue())) {
                        str = (String) entry.getKey();
                        break;
                    }
                }
                str = null;
                ai.m1832a(view, str);
            }
        }
    }
}
