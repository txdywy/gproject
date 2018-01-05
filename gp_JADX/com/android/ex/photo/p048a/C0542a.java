package com.android.ex.photo.p048a;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.util.HashMap;

public abstract class C0542a extends C0541b {
    public Context f3730c;
    public Cursor f3731d = null;
    public int f3732e;
    public SparseIntArray f3733f;
    public final HashMap f3734g = new HashMap();

    public C0542a(Context context, ab abVar) {
        super(abVar);
        this.f3730c = context;
        this.f3732e = -1;
    }

    public abstract Fragment mo967a(Cursor cursor, int i);

    public final Fragment mo964c(int i) {
        if (this.f3731d == null || !m4021d(i)) {
            return null;
        }
        return mo967a(this.f3731d, i);
    }

    public final int mo961a() {
        if (this.f3731d != null) {
            return this.f3731d.getCount();
        }
        return 0;
    }

    public final Object mo956a(View view, int i) {
        if (this.f3731d == null) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        Object valueOf;
        if (m4021d(i)) {
            valueOf = Integer.valueOf(this.f3731d.getString(this.f3732e).hashCode());
        } else {
            valueOf = null;
        }
        Object a = super.mo956a(view, i);
        if (a != null) {
            this.f3734g.put(a, valueOf);
        }
        return a;
    }

    public final void mo957a(View view, int i, Object obj) {
        this.f3734g.remove(obj);
        super.mo957a(view, i, obj);
    }

    public final int mo963b(Object obj) {
        Integer num = (Integer) this.f3734g.get(obj);
        if (num == null || this.f3733f == null) {
            return -2;
        }
        return this.f3733f.get(num.intValue(), -2);
    }

    public Cursor mo966a(Cursor cursor) {
        if (Log.isLoggable("BaseCursorPagerAdapter", 2)) {
            Log.v("BaseCursorPagerAdapter", "swapCursor old=" + (this.f3731d == null ? -1 : this.f3731d.getCount()) + "; new=" + (cursor == null ? -1 : cursor.getCount()));
        }
        if (cursor == this.f3731d) {
            return null;
        }
        Cursor cursor2 = this.f3731d;
        this.f3731d = cursor;
        if (cursor != null) {
            this.f3732e = cursor.getColumnIndex("uri");
        } else {
            this.f3732e = -1;
        }
        m4022e();
        M_();
        return cursor2;
    }

    protected final String mo962a(int i, int i2) {
        if (!m4021d(i2)) {
            return super.mo962a(i, i2);
        }
        return "android:pager:" + i + ":" + this.f3731d.getString(this.f3732e).hashCode();
    }

    private final boolean m4021d(int i) {
        if (this.f3731d == null || this.f3731d.isClosed()) {
            return false;
        }
        return this.f3731d.moveToPosition(i);
    }

    private final void m4022e() {
        if (this.f3731d == null || this.f3731d.isClosed()) {
            this.f3733f = null;
            return;
        }
        SparseIntArray sparseIntArray = new SparseIntArray(this.f3731d.getCount());
        this.f3731d.moveToPosition(-1);
        while (this.f3731d.moveToNext()) {
            sparseIntArray.append(this.f3731d.getString(this.f3732e).hashCode(), this.f3731d.getPosition());
        }
        this.f3733f = sparseIntArray;
    }
}
