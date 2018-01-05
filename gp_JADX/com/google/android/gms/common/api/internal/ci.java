package com.google.android.gms.common.api.internal;

import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1634r;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class ci extends cp {
    public final SparseArray f25803b = new SparseArray();

    public ci(bg bgVar) {
        super(bgVar);
        this.a.mo4587a("AutoManageHelper", (LifecycleCallback) this);
    }

    private final cj m23540a(int i) {
        return this.f25803b.size() <= i ? null : (cj) this.f25803b.get(this.f25803b.keyAt(i));
    }

    protected final void mo4599a(ConnectionResult connectionResult, int i) {
        Log.w("AutoManageHelper", "Unresolved error while connecting client. Stopping auto-manage.");
        if (i < 0) {
            Log.wtf("AutoManageHelper", "AutoManageLifecycleHelper received onErrorResolutionFailed callback but no failing client ID is set", new Exception());
            return;
        }
        cj cjVar = (cj) this.f25803b.get(i);
        if (cjVar != null) {
            C1634r c1634r = (cj) this.f25803b.get(i);
            this.f25803b.remove(i);
            if (c1634r != null) {
                c1634r.f25805b.mo4554b(c1634r);
                c1634r.f25805b.mo4559g();
            }
            C1634r c1634r2 = cjVar.f25806c;
            if (c1634r2 != null) {
                c1634r2.mo2364a(connectionResult);
            }
        }
    }

    public final void mo4600a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        for (int i = 0; i < this.f25803b.size(); i++) {
            cj a = m23540a(i);
            if (a != null) {
                printWriter.append(str).append("GoogleApiClient #").print(a.f25804a);
                printWriter.println(":");
                a.f25805b.mo4550a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
            }
        }
    }

    public final void mo4596b() {
        super.mo4596b();
        boolean z = this.d;
        String valueOf = String.valueOf(this.f25803b);
        Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 14).append("onStart ").append(z).append(" ").append(valueOf).toString());
        if (this.e.get() == null) {
            for (int i = 0; i < this.f25803b.size(); i++) {
                cj a = m23540a(i);
                if (a != null) {
                    a.f25805b.mo4557e();
                }
            }
        }
    }

    public final void mo4598d() {
        super.mo4598d();
        for (int i = 0; i < this.f25803b.size(); i++) {
            cj a = m23540a(i);
            if (a != null) {
                a.f25805b.mo4559g();
            }
        }
    }

    protected final void mo4601e() {
        for (int i = 0; i < this.f25803b.size(); i++) {
            cj a = m23540a(i);
            if (a != null) {
                a.f25805b.mo4557e();
            }
        }
    }
}
