package com.google.android.finsky.by.p132a;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.google.android.finsky.by.C2196e;
import com.google.android.finsky.by.C2227g;
import com.google.android.finsky.by.C2228f;
import com.google.android.finsky.by.C2230i;
import com.google.android.finsky.by.C2231n;
import com.google.android.finsky.by.C2232j;
import com.google.android.finsky.utils.C4680k;
import java.util.Collection;
import java.util.Iterator;

public final class al implements C2196e {
    public static final String[] f11026a = new String[]{"account", "library_id", "backend", "doc_id", "doc_type", "offer_type", "document_hash", "subs_valid_until_time", "app_certificate_hash", "app_refund_pre_delivery_endtime_ms", "app_refund_post_delivery_window_ms", "subs_auto_renewing", "subs_initiation_time", "subs_trial_until_time", "inapp_purchase_data", "inapp_signature", "preordered", "owned_via_license", "shared_by_me", "sharer_gaia_id", "shareability", "purchase_time"};
    public final Context f11027b;
    public final an f11028c = new an(this.f11027b);

    public al(Context context) {
        this.f11027b = context;
    }

    public final synchronized boolean mo2782a(C2227g c2227g) {
        boolean z = true;
        synchronized (this) {
            Cursor rawQuery = this.f11028c.getWritableDatabase().rawQuery("SELECT COUNT(*) FROM ownership WHERE account=? AND library_id=? AND backend=? AND doc_id=? AND doc_type=? AND offer_type=?", new String[]{c2227g.f11101h, c2227g.f11102i, String.valueOf(c2227g.f11103j), c2227g.f11104k, String.valueOf(c2227g.f11105l), String.valueOf(c2227g.f11106m)});
            try {
                rawQuery.moveToNext();
                if (rawQuery.getLong(0) < 1) {
                    z = false;
                }
                rawQuery.close();
            } catch (Throwable th) {
                rawQuery.close();
            }
        }
        return z;
    }

    private final synchronized void m11556d(C2227g c2227g) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("account", c2227g.f11101h);
        contentValues.put("library_id", c2227g.f11102i);
        contentValues.put("backend", Integer.valueOf(c2227g.f11103j));
        contentValues.put("doc_id", c2227g.f11104k);
        contentValues.put("doc_type", Integer.valueOf(c2227g.f11105l));
        contentValues.put("offer_type", Integer.valueOf(c2227g.f11106m));
        contentValues.put("document_hash", Long.valueOf(c2227g.f11107n));
        contentValues.put("preordered", Boolean.valueOf(c2227g.f11109p));
        contentValues.put("shared_by_me", Boolean.valueOf(c2227g.f11110q));
        contentValues.put("sharer_gaia_id", c2227g.f11111r);
        contentValues.put("shareability", Integer.valueOf(c2227g.f11112s));
        contentValues.put("purchase_time", Long.valueOf(c2227g.f11113t));
        if (c2227g.f11108o != Long.MAX_VALUE) {
            contentValues.put("subs_valid_until_time", Long.valueOf(c2227g.f11108o));
        } else {
            contentValues.putNull("subs_valid_until_time");
        }
        if (c2227g instanceof C2228f) {
            C2228f c2228f = (C2228f) c2227g;
            contentValues.put("app_certificate_hash", C4680k.m21817a(c2228f.f11116c));
            contentValues.put("app_refund_pre_delivery_endtime_ms", Long.valueOf(c2228f.f11117d));
            contentValues.put("app_refund_post_delivery_window_ms", Long.valueOf(c2228f.f11118e));
            contentValues.put("owned_via_license", Boolean.valueOf(c2228f.f11119f));
        } else if (c2227g instanceof C2232j) {
            C2232j c2232j = (C2232j) c2227g;
            contentValues.put("subs_auto_renewing", Boolean.valueOf(c2232j.e));
            contentValues.put("subs_initiation_time", Long.valueOf(c2232j.c));
            contentValues.put("subs_trial_until_time", Long.valueOf(c2232j.d));
            contentValues.put("inapp_purchase_data", c2232j.f11132a);
            contentValues.put("inapp_signature", c2232j.f11133b);
        } else if (c2227g instanceof C2231n) {
            C2231n c2231n = (C2231n) c2227g;
            contentValues.put("subs_auto_renewing", Boolean.valueOf(c2231n.f11131e));
            contentValues.put("subs_initiation_time", Long.valueOf(c2231n.f11129c));
            contentValues.put("subs_trial_until_time", Long.valueOf(c2231n.f11130d));
        } else if (c2227g instanceof C2230i) {
            C2230i c2230i = (C2230i) c2227g;
            contentValues.put("inapp_purchase_data", c2230i.f11127a);
            contentValues.put("inapp_signature", c2230i.f11128b);
        }
        this.f11028c.getWritableDatabase().replace("ownership", null, contentValues);
    }

    public final synchronized C2227g mo2784b(C2227g c2227g) {
        throw new UnsupportedOperationException("getEntry not supported.");
    }

    public final synchronized void m11558a(Collection collection) {
        this.f11028c.getWritableDatabase().beginTransaction();
        try {
            for (C2227g d : collection) {
                m11556d(d);
            }
            this.f11028c.getWritableDatabase().setTransactionSuccessful();
            this.f11028c.getWritableDatabase().endTransaction();
        } catch (Throwable th) {
            this.f11028c.getWritableDatabase().endTransaction();
        }
    }

    public final synchronized void mo2788c(C2227g c2227g) {
        this.f11028c.getWritableDatabase().execSQL("DELETE FROM ownership WHERE account=? AND library_id=? AND backend=? AND doc_id=? AND doc_type=? AND offer_type=?", new Object[]{c2227g.f11101h, c2227g.f11102i, Integer.valueOf(c2227g.f11103j), c2227g.f11104k, Integer.valueOf(c2227g.f11105l), Integer.valueOf(c2227g.f11106m)});
    }

    public final synchronized int mo2792g() {
        int i;
        Cursor rawQuery = this.f11028c.getWritableDatabase().rawQuery("SELECT COUNT(*) FROM ownership", new String[0]);
        try {
            rawQuery.moveToNext();
            i = rawQuery.getInt(0);
            rawQuery.close();
        } catch (Throwable th) {
            rawQuery.close();
        }
        return i;
    }

    public final synchronized void m11557a(Account account, String str) {
        this.f11028c.getWritableDatabase().execSQL("DELETE FROM ownership WHERE account=? AND library_id=?", new Object[]{account.name, str});
    }

    public final synchronized Iterator iterator() {
        return new am(this.f11028c.getWritableDatabase().query("ownership", f11026a, null, null, null, null, null));
    }

    public final long mo2794h() {
        throw new UnsupportedOperationException();
    }
}
