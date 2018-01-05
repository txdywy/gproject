package android.support.v4.p028a;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.support.v4.p037h.C0326w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

public abstract class C0212a extends C0211f {
    public final Executor f1199a;
    public volatile C0214b f1200b;
    public volatile C0214b f1201c;
    public long f1202d;
    public long f1203e;
    public Handler f1204f;

    public C0212a(Context context) {
        this(context, C0213n.f1207f);
    }

    public abstract Object mo274d();

    private C0212a(Context context, Executor executor) {
        super(context);
        this.f1203e = -10000;
        this.f1199a = executor;
    }

    protected final void mo266a() {
        super.mo266a();
        mo268b();
        this.f1200b = new C0214b(this);
        m1096c();
    }

    protected final boolean mo268b() {
        boolean z = false;
        if (this.f1200b != null) {
            if (!this.s) {
                this.v = true;
            }
            if (this.f1201c != null) {
                if (this.f1200b.f1216b) {
                    this.f1200b.f1216b = false;
                    this.f1204f.removeCallbacks(this.f1200b);
                }
                this.f1200b = null;
            } else if (this.f1200b.f1216b) {
                this.f1200b.f1216b = false;
                this.f1204f.removeCallbacks(this.f1200b);
                this.f1200b = null;
            } else {
                C0213n c0213n = this.f1200b;
                c0213n.f1213l.set(true);
                z = c0213n.f1211j.cancel(false);
                if (z) {
                    this.f1201c = this.f1200b;
                    mo275e();
                }
                this.f1200b = null;
            }
        }
        return z;
    }

    public void mo272a(Object obj) {
    }

    final void m1096c() {
        if (this.f1201c == null && this.f1200b != null) {
            if (this.f1200b.f1216b) {
                this.f1200b.f1216b = false;
                this.f1204f.removeCallbacks(this.f1200b);
            }
            if (this.f1202d <= 0 || SystemClock.uptimeMillis() >= this.f1203e + this.f1202d) {
                C0213n c0213n = this.f1200b;
                Executor executor = this.f1199a;
                if (c0213n.f1212k != C0231t.PENDING) {
                    switch (c0213n.f1212k.ordinal()) {
                        case 1:
                            throw new IllegalStateException("Cannot execute task: the task is already running.");
                        case 2:
                            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                        default:
                            throw new IllegalStateException("We should never reach this state");
                    }
                }
                c0213n.f1212k = C0231t.RUNNING;
                C0226u c0226u = c0213n.f1210i;
                executor.execute(c0213n.f1211j);
                return;
            }
            this.f1200b.f1216b = true;
            this.f1204f.postAtTime(this.f1200b, this.f1203e + this.f1202d);
        }
    }

    final void m1092a(C0214b c0214b, Object obj) {
        mo272a(obj);
        if (this.f1201c == c0214b) {
            if (this.f1198w) {
                mo3893l();
            }
            this.f1203e = SystemClock.uptimeMillis();
            this.f1201c = null;
            if (this.f1192q != null) {
                this.f1192q.mo317d();
            }
            m1096c();
        }
    }

    public void mo275e() {
    }

    public void mo267a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo267a(str, fileDescriptor, printWriter, strArr);
        if (this.f1200b != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f1200b);
            printWriter.print(" waiting=");
            printWriter.println(this.f1200b.f1216b);
        }
        if (this.f1201c != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f1201c);
            printWriter.print(" waiting=");
            printWriter.println(this.f1201c.f1216b);
        }
        if (this.f1202d != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            C0326w.m1719a(this.f1202d, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            C0326w.m1718a(this.f1203e, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
