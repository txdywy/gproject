package android.support.v4.p028a;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.support.v4.os.C0328b;
import android.support.v4.os.C0329c;
import android.support.v4.os.OperationCanceledException;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;

public class C0217e extends C0212a {
    public final C0218g f1220g = new C0218g(this);
    public Uri f1221h;
    public String[] f1222i;
    public String f1223j;
    public String[] f1224k;
    public String f1225l;
    public Cursor f1226m;
    public C0328b f1227n;

    public Cursor mo982f() {
        synchronized (this) {
            if ((this.f1201c != null ? 1 : null) != null) {
                throw new OperationCanceledException();
            }
            this.f1227n = new C0328b();
        }
        Cursor a;
        try {
            a = C0215c.m1110a(this.f1193r.getContentResolver(), this.f1221h, this.f1222i, this.f1223j, this.f1224k, this.f1225l, this.f1227n);
            if (a != null) {
                a.getCount();
                a.registerContentObserver(this.f1220g);
            }
            synchronized (this) {
                this.f1227n = null;
            }
            return a;
        } catch (RuntimeException e) {
            a.close();
            throw e;
        } catch (Throwable th) {
            synchronized (this) {
                this.f1227n = null;
            }
        }
    }

    public final void mo275e() {
        super.mo275e();
        synchronized (this) {
            if (this.f1227n != null) {
                C0328b c0328b = this.f1227n;
                synchronized (c0328b) {
                    if (c0328b.f1774a) {
                    } else {
                        c0328b.f1774a = true;
                        C0329c c0329c = c0328b.f1775b;
                        Object obj = c0328b.f1776c;
                        if (c0329c != null) {
                            try {
                                c0329c.m1726a();
                            } catch (Throwable th) {
                                synchronized (c0328b) {
                                    c0328b.notifyAll();
                                }
                            }
                        }
                        if (obj != null && VERSION.SDK_INT >= 16) {
                            ((CancellationSignal) obj).cancel();
                        }
                        synchronized (c0328b) {
                            c0328b.notifyAll();
                        }
                    }
                }
            }
        }
        return;
    }

    private final void m1117a(Cursor cursor) {
        if (!this.f1196u) {
            Cursor cursor2 = this.f1226m;
            this.f1226m = cursor;
            if (this.f1194s) {
                super.mo273b(cursor);
            }
            if (cursor2 != null && cursor2 != cursor && !cursor2.isClosed()) {
                cursor2.close();
            }
        } else if (cursor != null) {
            cursor.close();
        }
    }

    public C0217e(Context context) {
        super(context);
    }

    protected final void mo276g() {
        if (this.f1226m != null) {
            m1117a(this.f1226m);
        }
        if (m1089k() || this.f1226m == null) {
            mo266a();
        }
    }

    protected final void mo277h() {
        mo268b();
    }

    protected final void mo278i() {
        super.mo278i();
        mo277h();
        if (!(this.f1226m == null || this.f1226m.isClosed())) {
            this.f1226m.close();
        }
        this.f1226m = null;
    }

    public final void mo267a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.mo267a(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("mUri=");
        printWriter.println(this.f1221h);
        printWriter.print(str);
        printWriter.print("mProjection=");
        printWriter.println(Arrays.toString(this.f1222i));
        printWriter.print(str);
        printWriter.print("mSelection=");
        printWriter.println(this.f1223j);
        printWriter.print(str);
        printWriter.print("mSelectionArgs=");
        printWriter.println(Arrays.toString(this.f1224k));
        printWriter.print(str);
        printWriter.print("mSortOrder=");
        printWriter.println(this.f1225l);
        printWriter.print(str);
        printWriter.print("mCursor=");
        printWriter.println(this.f1226m);
        printWriter.print(str);
        printWriter.print("mContentChanged=");
        printWriter.println(this.v);
    }

    public /* synthetic */ Object mo274d() {
        return mo982f();
    }

    public final /* synthetic */ void mo272a(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (cursor != null && !cursor.isClosed()) {
            cursor.close();
        }
    }

    public final /* synthetic */ void mo273b(Object obj) {
        m1117a((Cursor) obj);
    }
}
