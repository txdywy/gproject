package com.google.android.finsky.by.a;

import android.database.Cursor;
import com.google.android.finsky.by.f;
import com.google.android.finsky.by.g;
import com.google.android.finsky.by.h;
import com.google.android.finsky.by.i;
import com.google.android.finsky.by.j;
import com.google.android.finsky.by.n;
import com.google.android.finsky.dfemodel.q;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.k;

public final class com.google.android.finsky.by.a.am implements Iterator
{

    public final Cursor a;

    am(Cursor p0) {
        this.a = p0;
    }

    protected final void finalize() {
        if (!this.a.isClosed())
            this.a.close();
        super.finalize();
    }

    public final boolean hasNext() {
        v0 = 0;
        if ((this.a.isAfterLast()) || this.a.isLast())
            this.a.close();
        else if (!this.a.isClosed())
            v0 = 1;
        return v0;
    }

    public final Object next() {
        if (!this.a.moveToNext())
            v21 = 0;
        else {
            v4 = this.a.getString(0).intern();
            v23 = this.a.getString(1);
            v24 = this.a.getInt(2);
            v5 = this.a.getString(3);
            v26 = this.a.getInt(4);
            v6 = this.a.getInt(5);
            v7 = this.a.getLong(6);
            if (this.a.getInt(16) > 0)
                v32 = 1;
            else
                v32 = 0;
            if (this.a.getInt(18) > 0)
                v15 = 1;
            else
                v15 = 0;
            v16 = this.a.getString(19);
            v17 = this.a.getInt(20);
            v18 = this.a.getLong(21);
            if (!this.a.isNull(7))
                v30 = this.a.getLong(7);
            else
                v30 = 9223372036854775807;
            if (v23 == 0) {
                v23 = com.google.android.finsky.by.h.a(v24);
                v3 = new Object[3];
                v3[0] = v5;
                v3[1] = Integer.valueOf(v24);
                v3[2] = v23;
                FinskyLog.a("Library id for doc id %s is restored from backend %d to value %s", v3);
            }
            if (!com.google.android.finsky.by.h.a(v23)) {
                if (v26 == 1) {
                    if (this.a.getInt(17) > 0)
                        v14 = 1;
                    else
                        v14 = 0;
                    v21 = new com.google.android.finsky.by.f(v4, v5, v6, v7, com.google.android.finsky.utils.k.a(this.a.getString(8)), this.a.getLong(9), this.a.getLong(10), v14, v15, v16, v17, v18);
                }
                else if ((com.google.android.finsky.dfemodel.q.b(v26)) || v6 == 13) {
                    if (v24 == 3) {
                        if (this.a.getInt(11) > 0)
                            v36 = 1;
                        else
                            v36 = 0;
                        v37 = "";
                        if (!this.a.isNull(14))
                            v37 = this.a.getString(14);
                        v38 = "";
                        if (!this.a.isNull(15))
                            v38 = this.a.getString(15);
                        v21 = new com.google.android.finsky.by.j(v4, v23, v24, v5, v26, v6, v7, v30, this.a.getLong(12), this.a.getLong(13), v36, v37, v38, v18);
                    }
                    else {
                        if (this.a.getInt(11) > 0)
                            v35 = 1;
                        else
                            v35 = 0;
                        v21 = new com.google.android.finsky.by.n(v4, v23, v24, v5, v26, v6, v7, Long.valueOf(v30), this.a.getLong(12), this.a.getLong(13), v35, v15, v16, v17, v18);
                    }
                }
                else if (com.google.android.finsky.dfemodel.q.a(v26)) {
                    v34 = this.a.getString(14);
                    v35 = this.a.getString(15);
                    if (v34 != 0) {
                        if (v35 != 0)
                            v21 = new com.google.android.finsky.by.i(v4, v23, v5, v26, v6, v34, v35, v7, v18);
                        else
                            v21 = new com.google.android.finsky.by.g(v4, v23, v24, v5, v26, v6, v7, v30, v32, v15, v16, v17, v18);
                    }
                    else
                        v21 = new com.google.android.finsky.by.g(v4, v23, v24, v5, v26, v6, v7, v30, v32, v15, v16, v17, v18);
                }
                else
                    v21 = new com.google.android.finsky.by.g(v4, v23, v24, v5, v26, v6, v7, v30, v32, v15, v16, v17, v18);
            }
            else
                v21 = new com.google.android.finsky.by.g(v4, v23, v24, v5, v26, v6, v7, v30, v32, v15, v16, v17, v18);
        }
        return v21;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

}
