package com.google.android.libraries.play.entertainment.p196j;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.wireless.android.finsky.dfe.g.a.ai;
import com.google.wireless.android.finsky.dfe.g.a.k;
import java.util.HashSet;
import java.util.Set;

public abstract class C3006a {
    public final Set f15732m = new HashSet();

    public abstract void mo3259a(View view, ai aiVar, C2980a c2980a);

    public abstract boolean mo3261a(ai aiVar);

    public abstract void mo3264b(View view, ai aiVar);

    public abstract void mo3269c(View view, ai aiVar);

    public abstract boolean mo3270c(ai aiVar);

    public abstract boolean mo3273d(ai aiVar);

    public void mo3268c() {
    }

    public void mo3271d() {
    }

    public final void m15557e() {
        if (!this.f15732m.isEmpty()) {
            for (Runnable run : this.f15732m) {
                run.run();
            }
        }
    }

    public boolean mo3267b(ai aiVar) {
        return false;
    }

    public void mo3258a(View view, ai aiVar) {
    }

    public String mo3257a(ai aiVar, Context context) {
        return aiVar.g;
    }

    public String mo3263b(ai aiVar, Context context) {
        return mo3257a(aiVar, context);
    }

    public boolean mo3260a() {
        return false;
    }

    public boolean mo3266b() {
        return false;
    }

    public boolean mo3262a(k kVar, ai aiVar) {
        if (kVar.d() != null) {
            return true;
        }
        return false;
    }

    public void mo3265b(View view, ai aiVar, C2980a c2980a) {
        mo3259a(view, aiVar, c2980a);
    }

    public void mo3272d(View view, ai aiVar) {
    }
}
