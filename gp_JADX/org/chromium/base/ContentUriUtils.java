package org.chromium.base;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.util.Log;
import com.google.p409c.p410a.p411a.p412a.p413a.C6918a;
import java.io.IOException;
import org.chromium.base.annotations.CalledByNative;

public class ContentUriUtils {
    private ContentUriUtils() {
    }

    @CalledByNative
    public static int openContentUriForRead(String str) {
        AssetFileDescriptor a = m37789a(str);
        if (a != null) {
            return a.getParcelFileDescriptor().detachFd();
        }
        return -1;
    }

    @CalledByNative
    public static boolean contentUriExists(String str) {
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            AssetFileDescriptor a = m37789a(str);
            boolean z = a != null;
            if (a != null) {
                try {
                    a.close();
                } catch (IOException e) {
                }
            }
            return z;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e2) {
                }
            }
        }
    }

    @CalledByNative
    public static String getMimeType(String str) {
        ContentResolver contentResolver = C7888e.f40514a.getContentResolver();
        Uri parse = Uri.parse(str);
        if (!m37790a(parse)) {
            return contentResolver.getType(parse);
        }
        String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
        return (streamTypes == null || streamTypes.length <= 0) ? null : streamTypes[0];
    }

    private static AssetFileDescriptor m37789a(String str) {
        ContentResolver contentResolver = C7888e.f40514a.getContentResolver();
        Uri parse = Uri.parse(str);
        try {
            if (m37790a(parse)) {
                String[] streamTypes = contentResolver.getStreamTypes(parse, "*/*");
                if (streamTypes != null && streamTypes.length > 0) {
                    AssetFileDescriptor openTypedAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(parse, streamTypes[0], null);
                    if (openTypedAssetFileDescriptor == null || openTypedAssetFileDescriptor.getStartOffset() == 0) {
                        return openTypedAssetFileDescriptor;
                    }
                    try {
                        openTypedAssetFileDescriptor.close();
                    } catch (IOException e) {
                    }
                    throw new SecurityException("Cannot open files with non-zero offset type.");
                }
                return null;
            }
            ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
            if (openFileDescriptor != null) {
                return new AssetFileDescriptor(openFileDescriptor, 0, -1);
            }
            return null;
        } catch (Throwable e2) {
            Log.w("ContentUriUtils", "Cannot find content uri: " + str, e2);
        } catch (Throwable e22) {
            Log.w("ContentUriUtils", "Cannot open content uri: " + str, e22);
        } catch (Throwable e222) {
            Log.w("ContentUriUtils", "Unknown content uri: " + str, e222);
        }
    }

    private static boolean m37790a(Uri uri) {
        Cursor query;
        Throwable th;
        Throwable th2;
        if (VERSION.SDK_INT < 19 || uri == null || !DocumentsContract.isDocumentUri(C7888e.f40514a, uri)) {
            return false;
        }
        try {
            query = C7888e.f40514a.getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.getCount() > 0) {
                        boolean z;
                        query.moveToFirst();
                        if (VERSION.SDK_INT >= 24) {
                            int columnIndex = query.getColumnIndex("flags");
                            if (columnIndex >= 0 && (query.getLong(columnIndex) & 512) != 0) {
                                z = true;
                                if (query != null) {
                                    query.close();
                                }
                                return z;
                            }
                        }
                        z = false;
                        if (query != null) {
                            query.close();
                        }
                        return z;
                    }
                } catch (Throwable th22) {
                    Throwable th3 = th22;
                    th22 = th;
                    th = th3;
                }
            }
            if (query == null) {
                return false;
            }
            query.close();
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        if (query != null) {
            if (th22 != null) {
                try {
                    query.close();
                } catch (Throwable th4) {
                    C6918a.m31587a(th22, th4);
                }
            } else {
                query.close();
            }
        }
        throw th;
        throw th;
    }

    static {
        Object obj = new Object();
    }
}
