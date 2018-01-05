package android.support.v4.app;

import android.support.v4.view.ai;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;

final class bl implements Runnable {
    public final /* synthetic */ ArrayList f1413a;
    public final /* synthetic */ Map f1414b;

    bl(ArrayList arrayList, Map map) {
        this.f1413a = arrayList;
        this.f1414b = map;
    }

    public final void run() {
        int size = this.f1413a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.f1413a.get(i);
            ai.m1832a(view, (String) this.f1414b.get(ai.f1848a.mo422u(view)));
        }
    }
}
