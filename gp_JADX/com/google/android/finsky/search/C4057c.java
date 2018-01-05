package com.google.android.finsky.search;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.Uri.Builder;
import android.support.v4.p028a.C0216d;
import com.google.android.finsky.aa.C0955b;
import com.squareup.leakcanary.C7582R;

final class C4057c extends C4056i {
    public static final Uri f20385a = new Builder().scheme("content").authority("com.google.android.finsky.RecentSuggestionsProvider").appendPath("search_suggest_query").build();
    public final C4065l f20386b;
    public final Drawable f20387c = C0216d.m1112a(this.l, (int) C7582R.drawable.ic_search_recent);

    public C4057c(String str, Context context, C4065l c4065l) {
        super(str, context);
        this.f20386b = c4065l;
    }

    public final void mo3896a() {
    }

    protected final void mo3897a(C4063k c4063k) {
        Cursor query = this.l.getContentResolver().query(f20385a, null, " ?", new String[]{this.k}, null);
        if (query != null) {
            int columnIndex = query.getColumnIndex("suggest_text_1");
            int columnIndex2 = query.getColumnIndex("suggest_text_2");
            if (columnIndex >= 0 && columnIndex2 >= 0) {
                int intValue = ((Integer) C0955b.fY.m28964b()).intValue();
                query.moveToPosition(0);
                int i = 0;
                while (!query.isAfterLast() && i < intValue) {
                    String string = query.getString(columnIndex);
                    if (string.startsWith(this.k)) {
                        C4065l c4065l = this.f20386b;
                        if (c4065l.m18988a(string, false, null, this.f20387c, null, null, null, true, c4065l.f20410e, null) != null) {
                            columnIndex2 = i + 1;
                            query.moveToNext();
                            i = columnIndex2;
                        }
                    }
                    columnIndex2 = i;
                    query.moveToNext();
                    i = columnIndex2;
                }
                query.close();
            }
        }
        c4063k.mo3898a();
    }
}
