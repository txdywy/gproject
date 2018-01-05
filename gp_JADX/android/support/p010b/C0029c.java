package android.support.p010b;

import android.os.Handler;
import android.os.Looper;

final class C0029c extends C0028o {
    public Handler f43a = new Handler(Looper.getMainLooper());
    public final /* synthetic */ C0025a f44b;

    C0029c(C0025a c0025a) {
        this.f44b = c0025a;
    }

    public final void mo9a(int i) {
        if (this.f44b != null) {
            this.f43a.post(new C0030d(this, i));
        }
    }

    public final void mo8a() {
        if (this.f44b != null) {
            this.f43a.post(new C0031e());
        }
    }

    public final void mo10b() {
        if (this.f44b != null) {
            this.f43a.post(new C0032f());
        }
    }

    public final void mo11c() {
        if (this.f44b != null) {
            this.f43a.post(new C0033g());
        }
    }

    public final void mo12d() {
        if (this.f44b != null) {
            this.f43a.post(new C0034h());
        }
    }
}
