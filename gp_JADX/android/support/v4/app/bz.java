package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.p028a.C0211f;
import android.support.v4.p028a.C0219h;
import android.support.v4.p028a.C0220i;
import android.support.v4.p037h.C0310e;
import android.support.v4.p037h.C0311f;
import android.support.v4.p037h.C0325v;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

final class bz implements C0219h, C0220i {
    public final int f1450a;
    public final Bundle f1451b;
    public bx f1452c;
    public C0211f f1453d;
    public boolean f1454e;
    public boolean f1455f;
    public Object f1456g;
    public boolean f1457h;
    public boolean f1458i;
    public boolean f1459j;
    public boolean f1460k;
    public boolean f1461l;
    public boolean f1462m;
    public bz f1463n;
    public final /* synthetic */ by f1464o;

    public bz(by byVar, int i, Bundle bundle, bx bxVar) {
        this.f1464o = byVar;
        this.f1450a = i;
        this.f1451b = bundle;
        this.f1452c = bxVar;
    }

    final void m1394a() {
        if (this.f1458i && this.f1459j) {
            this.f1457h = true;
        } else if (!this.f1457h) {
            this.f1457h = true;
            if (by.f1442a) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            if (this.f1453d == null && this.f1452c != null) {
                this.f1453d = this.f1452c.mo969a(this.f1450a, this.f1451b);
            }
            if (this.f1453d == null) {
                return;
            }
            if (!this.f1453d.getClass().isMemberClass() || Modifier.isStatic(this.f1453d.getClass().getModifiers())) {
                C0211f c0211f;
                if (!this.f1462m) {
                    c0211f = this.f1453d;
                    int i = this.f1450a;
                    if (c0211f.f1191p != null) {
                        throw new IllegalStateException("There is already a listener registered");
                    }
                    c0211f.f1191p = this;
                    c0211f.f1190o = i;
                    c0211f = this.f1453d;
                    if (c0211f.f1192q != null) {
                        throw new IllegalStateException("There is already a listener registered");
                    }
                    c0211f.f1192q = this;
                    this.f1462m = true;
                }
                c0211f = this.f1453d;
                c0211f.f1194s = true;
                c0211f.f1196u = false;
                c0211f.f1195t = false;
                c0211f.mo276g();
                return;
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + this.f1453d);
        }
    }

    final void m1397b() {
        if (by.f1442a) {
            Log.v("LoaderManager", "  Stopping: " + this);
        }
        this.f1457h = false;
        if (!this.f1458i && this.f1453d != null && this.f1462m) {
            this.f1462m = false;
            this.f1453d.m1081a((C0220i) this);
            this.f1453d.m1080a((C0219h) this);
            C0211f c0211f = this.f1453d;
            c0211f.f1194s = false;
            c0211f.mo277h();
        }
    }

    final void m1399c() {
        String str;
        Object obj = 1;
        bx bxVar = null;
        Object obj2 = null;
        while (true) {
            C0219h c0219h;
            if (by.f1442a) {
                Log.v("LoaderManager", "  Destroying: " + c0219h);
            }
            c0219h.f1461l = obj;
            boolean z = c0219h.f1455f;
            c0219h.f1455f = obj2;
            if (c0219h.f1452c != null && c0219h.f1453d != null && c0219h.f1454e && z) {
                if (by.f1442a) {
                    Log.v("LoaderManager", "  Resetting: " + c0219h);
                }
                if (c0219h.f1464o.f1449h != null) {
                    String str2 = c0219h.f1464o.f1449h.f1288f.f1322v;
                    c0219h.f1464o.f1449h.f1288f.f1322v = "onLoaderReset";
                    str = str2;
                } else {
                    Object obj3 = bxVar;
                }
                try {
                    c0219h.f1452c.mo973b();
                } finally {
                    bxVar = c0219h.f1464o.f1449h;
                    if (bxVar != null) {
                        bxVar = c0219h.f1464o.f1449h.f1288f;
                        bxVar.f1322v = str;
                    }
                }
            }
            c0219h.f1452c = bxVar;
            c0219h.f1456g = bxVar;
            c0219h.f1454e = obj2;
            if (c0219h.f1453d != null) {
                if (c0219h.f1462m) {
                    c0219h.f1462m = obj2;
                    c0219h.f1453d.m1081a((C0220i) c0219h);
                    c0219h.f1453d.m1080a(c0219h);
                }
                C0211f c0211f = c0219h.f1453d;
                c0211f.mo278i();
                c0211f.f1196u = obj;
                c0211f.f1194s = obj2;
                c0211f.f1195t = obj2;
                c0211f.f1197v = obj2;
                c0211f.f1198w = obj2;
            }
            if (c0219h.f1463n != null) {
                c0219h = c0219h.f1463n;
            } else {
                return;
            }
        }
    }

    public final void mo317d() {
        if (by.f1442a) {
            Log.v("LoaderManager", "onLoadCanceled: " + this);
        }
        if (!this.f1461l) {
            bz bzVar;
            C0325v c0325v = this.f1464o.f1443b;
            int a = C0310e.m1672a(c0325v.f1769c, c0325v.f1771e, this.f1450a);
            if (a < 0 || c0325v.f1770d[a] == C0325v.f1767a) {
                bzVar = null;
            } else {
                bzVar = c0325v.f1770d[a];
            }
            if (bzVar == this) {
                bzVar = this.f1463n;
                if (bzVar != null) {
                    if (by.f1442a) {
                        Log.v("LoaderManager", "  Switching to pending loader: " + bzVar);
                    }
                    this.f1463n = null;
                    this.f1464o.f1443b.m1710a(this.f1450a, null);
                    m1399c();
                    this.f1464o.m1384a(bzVar);
                }
            } else if (by.f1442a) {
                Log.v("LoaderManager", "  Ignoring load canceled -- not active");
            }
        } else if (by.f1442a) {
            Log.v("LoaderManager", "  Ignoring load canceled -- destroyed");
        }
    }

    public final void mo316a(C0211f c0211f, Object obj) {
        bz bzVar = null;
        if (by.f1442a) {
            Log.v("LoaderManager", "onLoadComplete: " + this);
        }
        if (!this.f1461l) {
            bz bzVar2;
            C0325v c0325v = this.f1464o.f1443b;
            int a = C0310e.m1672a(c0325v.f1769c, c0325v.f1771e, this.f1450a);
            if (a < 0 || c0325v.f1770d[a] == C0325v.f1767a) {
                bzVar2 = null;
            } else {
                bzVar2 = c0325v.f1770d[a];
            }
            if (bzVar2 == this) {
                bzVar2 = this.f1463n;
                if (bzVar2 != null) {
                    if (by.f1442a) {
                        Log.v("LoaderManager", "  Switching to pending loader: " + bzVar2);
                    }
                    this.f1463n = null;
                    this.f1464o.f1443b.m1710a(this.f1450a, null);
                    m1399c();
                    this.f1464o.m1384a(bzVar2);
                    return;
                }
                if (!(this.f1456g == obj && this.f1454e)) {
                    this.f1456g = obj;
                    this.f1454e = true;
                    if (this.f1457h) {
                        m1398b(c0211f, obj);
                    }
                }
                c0325v = this.f1464o.f1444c;
                a = C0310e.m1672a(c0325v.f1769c, c0325v.f1771e, this.f1450a);
                if (a >= 0 && c0325v.f1770d[a] != C0325v.f1767a) {
                    bzVar = c0325v.f1770d[a];
                }
                bzVar = bzVar;
                if (!(bzVar == null || bzVar == this)) {
                    bzVar.f1455f = false;
                    bzVar.m1399c();
                    C0325v c0325v2 = this.f1464o.f1444c;
                    int a2 = C0310e.m1672a(c0325v2.f1769c, c0325v2.f1771e, this.f1450a);
                    if (a2 >= 0 && c0325v2.f1770d[a2] != C0325v.f1767a) {
                        c0325v2.f1770d[a2] = C0325v.f1767a;
                        c0325v2.f1768b = true;
                    }
                }
                if (this.f1464o.f1449h != null && !this.f1464o.mo314a()) {
                    this.f1464o.f1449h.f1288f.m1264j();
                }
            } else if (by.f1442a) {
                Log.v("LoaderManager", "  Ignoring load complete -- not active");
            }
        } else if (by.f1442a) {
            Log.v("LoaderManager", "  Ignoring load complete -- destroyed");
        }
    }

    final void m1398b(C0211f c0211f, Object obj) {
        String str;
        if (this.f1452c != null) {
            if (this.f1464o.f1449h != null) {
                String str2 = this.f1464o.f1449h.f1288f.f1322v;
                this.f1464o.f1449h.f1288f.f1322v = "onLoadFinished";
                str = str2;
            } else {
                str = null;
            }
            try {
                if (by.f1442a) {
                    StringBuilder append = new StringBuilder("  onLoadFinished in ").append(c0211f).append(": ");
                    StringBuilder stringBuilder = new StringBuilder(64);
                    C0311f.m1677a(obj, stringBuilder);
                    stringBuilder.append("}");
                    Log.v("LoaderManager", append.append(stringBuilder.toString()).toString());
                }
                this.f1452c.mo972a(c0211f, obj);
                this.f1455f = true;
            } finally {
                if (this.f1464o.f1449h != null) {
                    this.f1464o.f1449h.f1288f.f1322v = str;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        stringBuilder.append("LoaderInfo{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" #");
        stringBuilder.append(this.f1450a);
        stringBuilder.append(" : ");
        C0311f.m1677a(this.f1453d, stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public final void m1396a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        while (true) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f1450a);
            printWriter.print(" mArgs=");
            printWriter.println(this.f1451b);
            printWriter.print(str);
            printWriter.print("mCallbacks=");
            printWriter.println(this.f1452c);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f1453d);
            if (this.f1453d != null) {
                this.f1453d.mo267a(str + "  ", fileDescriptor, printWriter, strArr);
            }
            if (this.f1454e || this.f1455f) {
                printWriter.print(str);
                printWriter.print("mHaveData=");
                printWriter.print(this.f1454e);
                printWriter.print("  mDeliveredData=");
                printWriter.println(this.f1455f);
                printWriter.print(str);
                printWriter.print("mData=");
                printWriter.println(this.f1456g);
            }
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f1457h);
            printWriter.print(" mReportNextStart=");
            printWriter.print(this.f1460k);
            printWriter.print(" mDestroyed=");
            printWriter.println(this.f1461l);
            printWriter.print(str);
            printWriter.print("mRetaining=");
            printWriter.print(this.f1458i);
            printWriter.print(" mRetainingStarted=");
            printWriter.print(this.f1459j);
            printWriter.print(" mListenerRegistered=");
            printWriter.println(this.f1462m);
            if (this.f1463n != null) {
                printWriter.print(str);
                printWriter.println("Pending Loader ");
                printWriter.print(this.f1463n);
                printWriter.println(":");
                this = this.f1463n;
                str = str + "  ";
            } else {
                return;
            }
        }
    }
}
