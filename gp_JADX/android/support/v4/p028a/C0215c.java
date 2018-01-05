package android.support.v4.p028a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.support.v4.os.C0328b;

public final class C0215c {
    public static Cursor m1110a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, C0328b c0328b) {
        if (VERSION.SDK_INT >= 16) {
            Object b;
            if (c0328b != null) {
                try {
                    b = c0328b.m1725b();
                } catch (Exception e) {
                    if (e instanceof OperationCanceledException) {
                        throw new android.support.v4.os.OperationCanceledException();
                    }
                    throw e;
                }
            }
            b = null;
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) b);
        } else if (c0328b == null || !c0328b.m1724a()) {
            return contentResolver.query(uri, strArr, str, strArr2, str2);
        } else {
            throw new android.support.v4.os.OperationCanceledException();
        }
    }
}
