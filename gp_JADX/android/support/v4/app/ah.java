package android.support.v4.app;

final class ah implements Runnable {
    public final /* synthetic */ ag f1333a;

    ah(ag agVar) {
        this.f1333a = agVar;
    }

    public final void run() {
        this.f1333a.f1329a.endViewTransition(this.f1333a.f1330b);
        if (this.f1333a.f1331c.m566R() != null) {
            this.f1333a.f1331c.d_(null);
            this.f1333a.f1332d.m1230a(this.f1333a.f1331c, this.f1333a.f1331c.m568T(), 0, 0, false);
        }
    }
}
