package com.google.android.finsky.by.a;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.finsky.by.f;
import com.google.android.finsky.by.g;
import com.google.android.finsky.by.i;
import com.google.android.finsky.by.j;
import com.google.android.finsky.by.n;
import com.google.android.finsky.utils.k;
import java.util.Collection;
import java.util.Iterator;

public final synchronized class com.google.android.finsky.by.a.al implements com.google.android.finsky.by.e
{

    public static final String[] a;
    public final Context b;
    public final com.google.android.finsky.by.a.an c;

    static {
        v0 = new String[22];
        v0[0] = "account";
        v0[1] = "library_id";
        v0[2] = "backend";
        v0[3] = "doc_id";
        v0[4] = "doc_type";
        v0[5] = "offer_type";
        v0[6] = "document_hash";
        v0[7] = "subs_valid_until_time";
        v0[8] = "app_certificate_hash";
        v0[9] = "app_refund_pre_delivery_endtime_ms";
        v0[10] = "app_refund_post_delivery_window_ms";
        v0[11] = "subs_auto_renewing";
        v0[12] = "subs_initiation_time";
        v0[13] = "subs_trial_until_time";
        v0[14] = "inapp_purchase_data";
        v0[15] = "inapp_signature";
        v0[16] = "preordered";
        v0[17] = "owned_via_license";
        v0[18] = "shared_by_me";
        v0[19] = "sharer_gaia_id";
        v0[20] = "shareability";
        v0[21] = "purchase_time";
        com.google.android.finsky.by.a.al.a = v0;
    }

    al(Context p0) {
        this.b = p0;
        this.c = new com.google.android.finsky.by.a.an(this.b);
    }

    private final synchronized void d(com.google.android.finsky.by.g p0) {
        enter this;
        try {
            v0 = new ContentValues();
            v0.put("account", p0.h);
            v0.put("library_id", p0.i);
            v0.put("backend", Integer.valueOf(p0.j));
            v0.put("doc_id", p0.k);
            v0.put("doc_type", Integer.valueOf(p0.l));
            v0.put("offer_type", Integer.valueOf(p0.m));
            v0.put("document_hash", Long.valueOf(p0.n));
            v0.put("preordered", Boolean.valueOf(p0.p));
            v0.put("shared_by_me", Boolean.valueOf(p0.q));
            v0.put("sharer_gaia_id", p0.r);
            v0.put("shareability", Integer.valueOf(p0.s));
            v0.put("purchase_time", Long.valueOf(p0.t));
            if (p0.o != 9223372036854775807)
                v0.put("subs_valid_until_time", Long.valueOf(p0.o));
            else {
                try {
                    v0.putNull("subs_valid_until_time");
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
            if (p0 instanceof com.google.android.finsky.by.f) {
                v0.put("app_certificate_hash", com.google.android.finsky.utils.k.a(((com.google.android.finsky.by.f)p0).c));
                v0.put("app_refund_pre_delivery_endtime_ms", Long.valueOf(((com.google.android.finsky.by.f)p0).d));
                v0.put("app_refund_post_delivery_window_ms", Long.valueOf(((com.google.android.finsky.by.f)p0).e));
                v0.put("owned_via_license", Boolean.valueOf(((com.google.android.finsky.by.f)p0).f));
            }
            else {
                try {
                    if (p0 instanceof com.google.android.finsky.by.j) {
                        v0.put("subs_auto_renewing", Boolean.valueOf(((com.google.android.finsky.by.j)p0).e));
                        v0.put("subs_initiation_time", Long.valueOf(((com.google.android.finsky.by.j)p0).c));
                        v0.put("subs_trial_until_time", Long.valueOf(((com.google.android.finsky.by.j)p0).d));
                        v0.put("inapp_purchase_data", ((com.google.android.finsky.by.j)p0).a);
                        v0.put("inapp_signature", ((com.google.android.finsky.by.j)p0).b);
                    }
                    else if (p0 instanceof com.google.android.finsky.by.n) {
                        v0.put("subs_auto_renewing", Boolean.valueOf(((com.google.android.finsky.by.n)p0).e));
                        v0.put("subs_initiation_time", Long.valueOf(((com.google.android.finsky.by.n)p0).c));
                        v0.put("subs_trial_until_time", Long.valueOf(((com.google.android.finsky.by.n)p0).d));
                    }
                    else if (p0 instanceof com.google.android.finsky.by.i) {
                        v0.put("inapp_purchase_data", ((com.google.android.finsky.by.i)p0).a);
                        v0.put("inapp_signature", ((com.google.android.finsky.by.i)p0).b);
                    }
                }
                catch (Throwable ex) {
                    exit this;
                    throw ex;
                }
            }
            this.c.getWritableDatabase().replace("ownership", 0, v0);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(Account p0, String p1) {
        enter this;
        try {
            v2 = new Object[2];
            v2[0] = p0.name;
            v2[1] = p1;
            this.c.getWritableDatabase().execSQL("DELETE FROM ownership WHERE account=? AND library_id=?", v2);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized void a(Collection p0) {
        enter this;
        try {
            this.c.getWritableDatabase().beginTransaction();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        try {
            v1 = p0.iterator();
            while (v1.hasNext())
                this.d((com.google.android.finsky.by.g)v1.next());
        }
        catch (Throwable ex) {
            try {
                this.c.getWritableDatabase().endTransaction();
                throw ex;
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
            try {
                this.c.getWritableDatabase().setTransactionSuccessful();
            }
            catch (Throwable ex) {
                this.c.getWritableDatabase().endTransaction();
                throw ex;
            }
            try {
                this.c.getWritableDatabase().endTransaction();
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
            exit this;
            return;
        }
        try {
            this.c.getWritableDatabase().setTransactionSuccessful();
        }
        catch (Throwable ex) {
            this.c.getWritableDatabase().endTransaction();
            throw ex;
        }
        try {
            this.c.getWritableDatabase().endTransaction();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized boolean a(com.google.android.finsky.by.g p0) {
        v0 = 1;
        enter this;
        try {
            v4 = new String[6];
            v4[0] = p0.h;
            v4[1] = p0.i;
            v4[2] = String.valueOf(p0.j);
            v4[3] = p0.k;
            v4[4] = String.valueOf(p0.l);
            v4[5] = String.valueOf(p0.m);
            v2 = this.c.getWritableDatabase().rawQuery("SELECT COUNT(*) FROM ownership WHERE account=? AND library_id=? AND backend=? AND doc_id=? AND doc_type=? AND offer_type=?", v4);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        try {
            v2.moveToNext();
        }
        catch (Throwable ex) {
            try {
                v2.close();
                throw ex;
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
            exit this;
            throw ex;
        }
        if (v2.getLong(0) < 1)
            v0 = 0;
        try {
            v2.close();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v0;
        try {
            v2.close();
            throw ex;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

    public final synchronized com.google.android.finsky.by.g b(com.google.android.finsky.by.g p0) {
        enter this;
        try {
            throw new UnsupportedOperationException("getEntry not supported.");
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

    public final synchronized void c(com.google.android.finsky.by.g p0) {
        enter this;
        try {
            v2 = new Object[6];
            v2[0] = p0.h;
            v2[1] = p0.i;
            v2[2] = Integer.valueOf(p0.j);
            v2[3] = p0.k;
            v2[4] = Integer.valueOf(p0.l);
            v2[5] = Integer.valueOf(p0.m);
            this.c.getWritableDatabase().execSQL("DELETE FROM ownership WHERE account=? AND library_id=? AND backend=? AND doc_id=? AND doc_type=? AND offer_type=?", v2);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
    }

    public final synchronized int g() {
        enter this;
        try {
            v1 = this.c.getWritableDatabase().rawQuery("SELECT COUNT(*) FROM ownership", new String[0]);
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        try {
            v1.moveToNext();
        }
        catch (Throwable ex) {
            try {
                v1.close();
                throw ex;
            }
            catch (Throwable ex) {
                exit this;
                throw ex;
            }
            exit this;
            throw ex;
        }
        try {
            v1.close();
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        exit this;
        return v1.getInt(0);
        try {
            v1.close();
            throw ex;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
    }

    public final long h() {
        throw new UnsupportedOperationException();
    }

    public final synchronized Iterator iterator() {
        enter this;
        try {
            exit this;
        }
        catch (Throwable ex) {
            exit this;
            throw ex;
        }
        return new com.google.android.finsky.by.a.am(this.c.getWritableDatabase().query("ownership", com.google.android.finsky.by.a.al.a, 0, 0, 0, 0, 0));
    }

}
