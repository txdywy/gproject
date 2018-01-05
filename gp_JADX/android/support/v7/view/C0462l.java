package android.support.v7.view;

import android.support.v4.view.bt;
import android.support.v4.view.bx;
import android.support.v4.view.by;
import android.view.animation.Interpolator;
import java.util.ArrayList;

public final class C0462l {
    public final ArrayList f2612a = new ArrayList();
    public long f2613b = -1;
    public Interpolator f2614c;
    public bx f2615d;
    public boolean f2616e;
    public final by f2617f = new C0463m(this);

    public final C0462l m2717a(bt btVar) {
        if (!this.f2616e) {
            this.f2612a.add(btVar);
        }
        return this;
    }

    public final void m2720a() {
        if (!this.f2616e) {
            ArrayList arrayList = this.f2612a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                bt btVar = (bt) obj;
                if (this.f2613b >= 0) {
                    btVar.m1994a(this.f2613b);
                }
                if (this.f2614c != null) {
                    btVar.m1997a(this.f2614c);
                }
                if (this.f2615d != null) {
                    btVar.m1995a(this.f2617f);
                }
                btVar.m2000b();
            }
            this.f2616e = true;
        }
    }

    public final void m2721b() {
        if (this.f2616e) {
            ArrayList arrayList = this.f2612a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((bt) obj).m1998a();
            }
            this.f2616e = false;
        }
    }

    public final C0462l m2722c() {
        if (!this.f2616e) {
            this.f2613b = 250;
        }
        return this;
    }

    public final C0462l m2719a(Interpolator interpolator) {
        if (!this.f2616e) {
            this.f2614c = interpolator;
        }
        return this;
    }

    public final C0462l m2718a(bx bxVar) {
        if (!this.f2616e) {
            this.f2615d = bxVar;
        }
        return this;
    }
}
