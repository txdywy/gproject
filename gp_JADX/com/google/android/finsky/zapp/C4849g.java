package com.google.android.finsky.zapp;

import android.app.DownloadManager;
import android.app.DownloadManager.Query;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;

public final class C4849g implements C4848l {
    public final DownloadManager f25149a;

    public C4849g(Context context) {
        this.f25149a = (DownloadManager) context.getSystemService("download");
    }

    public final Cursor mo4420a(long... jArr) {
        Query query = new Query();
        query.setFilterById(jArr);
        return this.f25149a.query(query);
    }

    public final ParcelFileDescriptor mo4421a(long j) {
        return this.f25149a.openDownloadedFile(j);
    }

    public final int mo4422b(long... jArr) {
        return this.f25149a.remove(jArr);
    }

    public final long mo4419a(Uri uri, boolean z) {
        Request request = new Request(uri);
        request.setAllowedOverMetered(z);
        return this.f25149a.enqueue(request);
    }
}
