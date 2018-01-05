package com.google.android.wallet.clientlog;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class LogContext implements Parcelable {
    public static final Creator CREATOR = new C6541e();
    public final LogContext f32611a;
    public final LogContext f32612b;
    public final ArrayList f32613c;
    public final long f32614d;
    public final int f32615e;
    public boolean f32616f;
    public final ArrayList f32617g = new ArrayList();
    public final Session f32618h;

    protected LogContext(Session session, long j, int i) {
        if (session == null) {
            throw new IllegalArgumentException("Session can not be null.");
        }
        this.f32615e = i;
        this.f32612b = null;
        this.f32611a = this;
        this.f32618h = session;
        this.f32614d = j;
        this.f32613c = new ArrayList(10);
        C6543g.m29717a().m29718a(m29671b().f32619a, this);
    }

    protected LogContext(LogContext logContext, long j, int i) {
        if (logContext == null) {
            throw new IllegalArgumentException("Parent context can not be null.");
        }
        this.f32615e = i;
        this.f32612b = logContext;
        this.f32611a = logContext.f32611a;
        this.f32618h = null;
        this.f32614d = j;
        this.f32613c = new ArrayList(10);
        this.f32612b.f32613c.add(this);
        C6543g.m29717a().m29718a(m29671b().f32619a, this);
    }

    protected LogContext(Parcel parcel) {
        this.f32615e = parcel.readInt();
        this.f32612b = (LogContext) parcel.readParcelable(getClass().getClassLoader());
        if (parcel.readInt() == 1) {
            this.f32611a = this;
            this.f32618h = (Session) parcel.readParcelable(Session.class.getClassLoader());
        } else {
            this.f32611a = (LogContext) parcel.readParcelable(getClass().getClassLoader());
            this.f32618h = null;
        }
        this.f32614d = parcel.readLong();
        this.f32616f = parcel.readInt() == 1;
        this.f32613c = new ArrayList(10);
    }

    public final boolean m29669a() {
        return this == this.f32611a;
    }

    final long[] m29670a(int i) {
        long[] a = this.f32612b == null ? new long[(i + 1)] : this.f32612b.m29670a(i + 1);
        a[i] = this.f32614d;
        return a;
    }

    public final Session m29671b() {
        while (!m29669a()) {
            this = this.f32611a;
        }
        return this.f32618h;
    }

    public final void m29668a(C6542f c6542f) {
        this.f32617g.add(c6542f);
    }

    public final void m29672b(C6542f c6542f) {
        this.f32617g.remove(c6542f);
    }

    protected final void m29673c() {
        if (!this.f32616f) {
            this.f32616f = true;
            int size = this.f32617g.size();
            for (int i = 0; i < size; i++) {
                ((C6542f) this.f32617g.get(i)).mo5621a();
            }
            if (this.f32612b != null) {
                this.f32612b.f32613c.remove(this);
            }
        }
    }

    protected final void m29674d() {
        if (this.f32616f) {
            this.f32616f = false;
            int size = this.f32617g.size();
            for (int i = 0; i < size; i++) {
                ((C6542f) this.f32617g.get(i)).cU_();
            }
            if (this.f32612b != null) {
                this.f32612b.f32613c.add(this);
            }
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        parcel.writeInt(this.f32615e);
        parcel.writeParcelable(this.f32612b, 0);
        parcel.writeInt(m29669a() ? 1 : 0);
        if (m29669a()) {
            parcel.writeParcelable(this.f32618h, 0);
        } else {
            parcel.writeParcelable(this.f32611a, 0);
        }
        parcel.writeLong(this.f32614d);
        if (!this.f32616f) {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }
}
