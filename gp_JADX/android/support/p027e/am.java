package android.support.p027e;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class am {
    public Context f1018a;
    public int f1019b = -1;
    public ViewGroup f1020c;
    public View f1021d;
    public Runnable f1022e;
    public Runnable f1023f;

    public am(ViewGroup viewGroup) {
        this.f1020c = viewGroup;
    }

    public final void m830a() {
        if (this.f1019b > 0 || this.f1021d != null) {
            this.f1020c.removeAllViews();
            if (this.f1019b > 0) {
                LayoutInflater.from(this.f1018a).inflate(this.f1019b, this.f1020c);
            } else {
                this.f1020c.addView(this.f1021d);
            }
        }
        if (this.f1022e != null) {
            this.f1022e.run();
        }
        am.m829a(this.f1020c, this);
    }

    static void m829a(View view, am amVar) {
        view.setTag(ak.transition_current_scene, amVar);
    }

    public static am m828a(View view) {
        return (am) view.getTag(ak.transition_current_scene);
    }
}
