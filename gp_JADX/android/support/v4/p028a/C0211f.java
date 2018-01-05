package android.support.v4.p028a;

import android.content.Context;
import android.support.v4.p037h.C0311f;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public class C0211f {
    public int f1190o;
    public C0220i f1191p;
    public C0219h f1192q;
    public Context f1193r;
    public boolean f1194s = false;
    public boolean f1195t = false;
    public boolean f1196u = true;
    public boolean f1197v = false;
    public boolean f1198w = false;

    public C0211f(Context context) {
        this.f1193r = context.getApplicationContext();
    }

    public void mo273b(Object obj) {
        if (this.f1191p != null) {
            this.f1191p.mo316a(this, obj);
        }
    }

    public final void m1081a(C0220i c0220i) {
        if (this.f1191p == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f1191p != c0220i) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f1191p = null;
        }
    }

    public final void m1080a(C0219h c0219h) {
        if (this.f1192q == null) {
            throw new IllegalStateException("No listener register");
        } else if (this.f1192q != c0219h) {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        } else {
            this.f1192q = null;
        }
    }

    public void mo276g() {
    }

    public boolean mo268b() {
        return false;
    }

    public final void m1088j() {
        mo266a();
    }

    public void mo266a() {
    }

    public void mo277h() {
    }

    public void mo278i() {
    }

    public final boolean m1089k() {
        boolean z = this.f1197v;
        this.f1197v = false;
        this.f1198w |= z;
        return z;
    }

    public void mo3893l() {
        if (this.f1194s) {
            mo266a();
        } else {
            this.f1197v = true;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(64);
        C0311f.m1677a(this, stringBuilder);
        stringBuilder.append(" id=");
        stringBuilder.append(this.f1190o);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void mo267a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.f1190o);
        printWriter.print(" mListener=");
        printWriter.println(this.f1191p);
        if (this.f1194s || this.f1197v || this.f1198w) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.f1194s);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.f1197v);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.f1198w);
        }
        if (this.f1195t || this.f1196u) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f1195t);
            printWriter.print(" mReset=");
            printWriter.println(this.f1196u);
        }
    }
}
