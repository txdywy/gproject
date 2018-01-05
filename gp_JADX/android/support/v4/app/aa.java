package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.p037h.C0304u;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

public class aa extends C0235y {
    public final Activity f1284b;
    public final Context f1285c;
    public final Handler f1286d;
    public final int f1287e;
    public final ae f1288f;
    public C0304u f1289g;
    public boolean f1290h;
    public by f1291i;
    public boolean f1292j;
    public boolean f1293k;

    aa(C0254u c0254u) {
        this(c0254u, c0254u, c0254u.f1609c);
    }

    private aa(Activity activity, Context context, Handler handler) {
        this.f1288f = new ae();
        this.f1284b = activity;
        this.f1285c = context;
        this.f1286d = handler;
        this.f1287e = 0;
    }

    public void mo354a(String str, PrintWriter printWriter, String[] strArr) {
    }

    public boolean mo355b() {
        return true;
    }

    public LayoutInflater mo356c() {
        return LayoutInflater.from(this.f1285c);
    }

    public void mo357d() {
    }

    public void mo352a(Fragment fragment, Intent intent, int i) {
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        this.f1285c.startActivity(intent);
    }

    public void mo353a(Fragment fragment, String[] strArr) {
    }

    public boolean mo358e() {
        return true;
    }

    public int mo359f() {
        return this.f1287e;
    }

    public View mo279a(int i) {
        return null;
    }

    public boolean mo280a() {
        return true;
    }

    final void m1150a(String str) {
        if (this.f1289g != null) {
            by byVar = (by) this.f1289g.get(str);
            if (byVar != null && !byVar.f1447f) {
                byVar.m1393g();
                this.f1289g.remove(str);
            }
        }
    }

    final by m1146a(String str, boolean z, boolean z2) {
        if (this.f1289g == null) {
            this.f1289g = new C0304u();
        }
        by byVar = (by) this.f1289g.get(str);
        if (byVar == null && z2) {
            byVar = new by(str, this, z);
            this.f1289g.put(str, byVar);
            return byVar;
        } else if (!z || byVar == null || byVar.f1446e) {
            return byVar;
        } else {
            byVar.m1388b();
            return byVar;
        }
    }
}
