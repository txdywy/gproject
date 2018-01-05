package com.android.ex.photo.a;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v4.view.af;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.util.HashMap;

public final class com.android.ex.photo.a.a extends com.android.ex.photo.a.b
{

    public Context c;
    public Cursor d;
    public int e;
    public SparseIntArray f;
    public final HashMap g;

    a(Context p0, android.support.v4.app.ab p1) {
        com.android.ex.photo.a.b(p1);
        this.g = new HashMap();
        this.d = 0;
        this.c = p0;
        this.e = -1;
    }

    private final boolean d(int p0) {
        if (this.d != 0 && !this.d.isClosed())
            v0 = this.d.moveToPosition(p0);
        else
            v0 = 0;
        return v0;
    }

    private final void e() {
        if (this.d == 0 || this.d.isClosed())
            this.f = 0;
        else {
            v0 = new SparseIntArray(this.d.getCount());
            this.d.moveToPosition(-1);
            while (this.d.moveToNext())
                v0.append(this.d.getString(this.e).hashCode(), this.d.getPosition());
            this.f = v0;
        }
    }

    public final int a() {
        if (this.d != 0)
            v0 = this.d.getCount();
        else
            v0 = 0;
        return v0;
    }

    public Cursor a(Cursor p0) {
        if (Log.isLoggable("BaseCursorPagerAdapter", 2)) {
            if (this.d == 0)
                v2 = -1;
            else
                v2 = this.d.getCount();
            if (p0 == 0)
                v0 = -1;
            else
                v0 = p0.getCount();
            Log.v("BaseCursorPagerAdapter", 43 + "swapCursor old=" + v2 + "; new=" + v0);
        }
        if (p0 == this.d)
            v0 = 0;
        else {
            v0 = this.d;
            this.d = p0;
            if (p0 != 0)
                this.e = p0.getColumnIndex("uri");
            else
                this.e = -1;
            this.e();
            this.M_();
        }
        return v0;
    }

    public abstract Fragment a(Cursor p0, int p1);

    public final Object a(View p0, int p1) {
        if (this.d == 0)
            throw new IllegalStateException("this should only be called when the cursor is valid");
        if (this.d(p1))
            v0 = Integer.valueOf(this.d.getString(this.e).hashCode());
        else
            v0 = 0;
        v1 = super.a(p0, p1);
        if (v1 != 0)
            this.g.put(v1, v0);
        return v1;
    }

    protected final String a(int p0, int p1) {
        if (this.d(p1))
            v0 = 37 + "android:pager:" + p0 + ":" + this.d.getString(this.e).hashCode();
        else
            v0 = super.a(p0, p1);
        return v0;
    }

    public final void a(View p0, int p1, Object p2) {
        this.g.remove(p2);
        super.a(p0, p1, p2);
    }

    public final int b(Object p0) {
        v0 = (Integer)this.g.get(p0);
        if (v0 == 0 || this.f == 0)
            v0 = -2;
        else
            v0 = this.f.get(v0.intValue(), -2);
        return v0;
    }

    public final Fragment c(int p0) {
        if (this.d != 0 && this.d(p0))
            v0 = this.a(this.d, p0);
        else
            v0 = 0;
        return v0;
    }

}
