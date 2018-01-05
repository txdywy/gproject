package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.p028a.C0211f;
import android.support.v4.p037h.C0310e;
import android.support.v4.p037h.C0311f;
import android.support.v4.p037h.C0325v;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class by extends bw {
    public static boolean f1442a = false;
    public final C0325v f1443b = new C0325v();
    public final C0325v f1444c = new C0325v();
    public final String f1445d;
    public boolean f1446e;
    public boolean f1447f;
    public boolean f1448g;
    public aa f1449h;

    by(String str, aa aaVar, boolean z) {
        this.f1445d = str;
        this.f1449h = aaVar;
        this.f1446e = z;
    }

    private final bz m1379b(int i, Bundle bundle, bx bxVar) {
        bz bzVar = new bz(this, i, bundle, bxVar);
        bzVar.f1453d = bxVar.mo969a(i, bundle);
        return bzVar;
    }

    private final bz m1380c(int i, Bundle bundle, bx bxVar) {
        try {
            this.f1448g = true;
            bz b = m1379b(i, bundle, bxVar);
            m1384a(b);
            return b;
        } finally {
            this.f1448g = false;
        }
    }

    final void m1384a(bz bzVar) {
        this.f1443b.m1710a(bzVar.f1450a, bzVar);
        if (this.f1446e) {
            bzVar.m1394a();
        }
    }

    public final C0211f mo311a(int i, Bundle bundle, bx bxVar) {
        if (this.f1448g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        Object obj;
        C0325v c0325v = this.f1443b;
        int a = C0310e.m1672a(c0325v.f1769c, c0325v.f1771e, i);
        if (a < 0 || c0325v.f1770d[a] == C0325v.f1767a) {
            obj = null;
        } else {
            obj = c0325v.f1770d[a];
        }
        bz bzVar = (bz) obj;
        if (f1442a) {
            Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
        }
        if (bzVar == null) {
            bzVar = m1380c(i, bundle, bxVar);
            if (f1442a) {
                Log.v("LoaderManager", "  Created new loader " + bzVar);
            }
        } else {
            if (f1442a) {
                Log.v("LoaderManager", "  Re-using existing loader " + bzVar);
            }
            bzVar.f1452c = bxVar;
        }
        if (bzVar.f1454e && this.f1446e) {
            bzVar.m1398b(bzVar.f1453d, bzVar.f1456g);
        }
        return bzVar.f1453d;
    }

    public final C0211f mo312a(int i, bx bxVar) {
        if (this.f1448g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        Bundle bundle;
        C0325v c0325v = this.f1443b;
        int a = C0310e.m1672a(c0325v.f1769c, c0325v.f1771e, i);
        if (a < 0 || c0325v.f1770d[a] == C0325v.f1767a) {
            bundle = null;
        } else {
            bundle = c0325v.f1770d[a];
        }
        bz bzVar = (bz) bundle;
        if (f1442a) {
            Log.v("LoaderManager", "restartLoader in " + this + ": args=" + null);
        }
        if (bzVar != null) {
            Bundle bundle2;
            C0325v c0325v2 = this.f1444c;
            int a2 = C0310e.m1672a(c0325v2.f1769c, c0325v2.f1771e, i);
            if (a2 < 0 || c0325v2.f1770d[a2] == C0325v.f1767a) {
                bundle2 = null;
            } else {
                bundle2 = c0325v2.f1770d[a2];
            }
            bz bzVar2 = (bz) bundle2;
            if (bzVar2 != null) {
                if (bzVar.f1454e) {
                    if (f1442a) {
                        Log.v("LoaderManager", "  Removing last inactive loader: " + bzVar);
                    }
                    bzVar2.f1455f = false;
                    bzVar2.m1399c();
                } else {
                    boolean b;
                    if (f1442a) {
                        Log.v("LoaderManager", "  Canceling: " + bzVar);
                    }
                    if (bzVar.f1457h && bzVar.f1453d != null && bzVar.f1462m) {
                        b = bzVar.f1453d.mo268b();
                        if (!b) {
                            bzVar.mo317d();
                        }
                    } else {
                        b = false;
                    }
                    if (b) {
                        if (f1442a) {
                            Log.v("LoaderManager", "  Current loader is running; configuring pending loader");
                        }
                        if (bzVar.f1463n != null) {
                            if (f1442a) {
                                Log.v("LoaderManager", "  Removing pending loader: " + bzVar.f1463n);
                            }
                            bzVar.f1463n.m1399c();
                            bzVar.f1463n = null;
                        }
                        if (f1442a) {
                            Log.v("LoaderManager", "  Enqueuing as new pending loader");
                        }
                        bzVar.f1463n = m1379b(i, null, bxVar);
                        return bzVar.f1463n.f1453d;
                    }
                    if (f1442a) {
                        Log.v("LoaderManager", "  Current loader is stopped; replacing");
                    }
                    this.f1443b.m1710a(i, null);
                    bzVar.m1399c();
                }
            } else if (f1442a) {
                Log.v("LoaderManager", "  Making last loader inactive: " + bzVar);
            }
            bzVar.f1453d.f1195t = true;
            this.f1444c.m1710a(i, bzVar);
        }
        return m1380c(i, null, bxVar).f1453d;
    }

    public final void mo313a(int i) {
        if (this.f1448g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (f1442a) {
            Log.v("LoaderManager", "destroyLoader in " + this + " of " + i);
        }
        int e = this.f1443b.m1716e(i);
        if (e >= 0) {
            bz bzVar = (bz) this.f1443b.m1715d(e);
            this.f1443b.m1712b(e);
            bzVar.m1399c();
        }
        e = this.f1444c.m1716e(i);
        if (e >= 0) {
            bzVar = (bz) this.f1444c.m1715d(e);
            this.f1444c.m1712b(e);
            bzVar.m1399c();
        }
        if (this.f1449h != null && !mo314a()) {
            this.f1449h.f1288f.m1264j();
        }
    }

    public final C0211f mo315b(int i) {
        if (this.f1448g) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C0211f c0211f;
        C0325v c0325v = this.f1443b;
        int a = C0310e.m1672a(c0325v.f1769c, c0325v.f1771e, i);
        if (a < 0 || c0325v.f1770d[a] == C0325v.f1767a) {
            c0211f = null;
        } else {
            c0211f = c0325v.f1770d[a];
        }
        bz bzVar = (bz) c0211f;
        if (bzVar == null) {
            return null;
        }
        if (bzVar.f1463n != null) {
            return bzVar.f1463n.f1453d;
        }
        return bzVar.f1453d;
    }

    final void m1388b() {
        if (f1442a) {
            Log.v("LoaderManager", "Starting in " + this);
        }
        if (this.f1446e) {
            Throwable runtimeException = new RuntimeException("here");
            runtimeException.fillInStackTrace();
            Log.w("LoaderManager", "Called doStart when already started: " + this, runtimeException);
            return;
        }
        this.f1446e = true;
        for (int a = this.f1443b.m1708a() - 1; a >= 0; a--) {
            ((bz) this.f1443b.m1715d(a)).m1394a();
        }
    }

    final void m1389c() {
        if (f1442a) {
            Log.v("LoaderManager", "Stopping in " + this);
        }
        if (this.f1446e) {
            for (int a = this.f1443b.m1708a() - 1; a >= 0; a--) {
                ((bz) this.f1443b.m1715d(a)).m1397b();
            }
            this.f1446e = false;
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doStop when not started: " + this, runtimeException);
    }

    final void m1390d() {
        if (f1442a) {
            Log.v("LoaderManager", "Retaining in " + this);
        }
        if (this.f1446e) {
            this.f1447f = true;
            this.f1446e = false;
            for (int a = this.f1443b.m1708a() - 1; a >= 0; a--) {
                bz bzVar = (bz) this.f1443b.m1715d(a);
                if (f1442a) {
                    Log.v("LoaderManager", "  Retaining: " + bzVar);
                }
                bzVar.f1458i = true;
                bzVar.f1459j = bzVar.f1457h;
                bzVar.f1457h = false;
                bzVar.f1452c = null;
            }
            return;
        }
        Throwable runtimeException = new RuntimeException("here");
        runtimeException.fillInStackTrace();
        Log.w("LoaderManager", "Called doRetain when not started: " + this, runtimeException);
    }

    final void m1391e() {
        for (int a = this.f1443b.m1708a() - 1; a >= 0; a--) {
            ((bz) this.f1443b.m1715d(a)).f1460k = true;
        }
    }

    final void m1392f() {
        for (int a = this.f1443b.m1708a() - 1; a >= 0; a--) {
            bz bzVar = (bz) this.f1443b.m1715d(a);
            if (bzVar.f1457h && bzVar.f1460k) {
                bzVar.f1460k = false;
                if (bzVar.f1454e && !bzVar.f1458i) {
                    bzVar.m1398b(bzVar.f1453d, bzVar.f1456g);
                }
            }
        }
    }

    final void m1393g() {
        int a;
        if (!this.f1447f) {
            if (f1442a) {
                Log.v("LoaderManager", "Destroying Active in " + this);
            }
            for (a = this.f1443b.m1708a() - 1; a >= 0; a--) {
                ((bz) this.f1443b.m1715d(a)).m1399c();
            }
            this.f1443b.m1711b();
        }
        if (f1442a) {
            Log.v("LoaderManager", "Destroying Inactive in " + this);
        }
        for (a = this.f1444c.m1708a() - 1; a >= 0; a--) {
            ((bz) this.f1444c.m1715d(a)).m1399c();
        }
        this.f1444c.m1711b();
        this.f1449h = null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        C0311f.m1677a(this.f1449h, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public final void m1385a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 0;
        if (this.f1443b.m1708a() > 0) {
            printWriter.print(str);
            printWriter.println("Active Loaders:");
            String str2 = str + "    ";
            for (int i2 = 0; i2 < this.f1443b.m1708a(); i2++) {
                bz bzVar = (bz) this.f1443b.m1715d(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f1443b.m1714c(i2));
                printWriter.print(": ");
                printWriter.println(bzVar.toString());
                bzVar.m1396a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        if (this.f1444c.m1708a() > 0) {
            printWriter.print(str);
            printWriter.println("Inactive Loaders:");
            String str3 = str + "    ";
            while (i < this.f1444c.m1708a()) {
                bzVar = (bz) this.f1444c.m1715d(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f1444c.m1714c(i));
                printWriter.print(": ");
                printWriter.println(bzVar.toString());
                bzVar.m1396a(str3, fileDescriptor, printWriter, strArr);
                i++;
            }
        }
    }

    public final boolean mo314a() {
        int a = this.f1443b.m1708a();
        boolean z = false;
        for (int i = 0; i < a; i++) {
            int i2;
            bz bzVar = (bz) this.f1443b.m1715d(i);
            if (!bzVar.f1457h || bzVar.f1455f) {
                i2 = 0;
            } else {
                i2 = 1;
            }
            z |= i2;
        }
        return z;
    }
}
