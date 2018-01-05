package com.google.android.finsky.providers;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.finsky.bx.C2195a;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;

class C3945a extends ContentProvider {
    public String f19936a;
    public int f19937b;
    public boolean f19938c;
    public SQLiteOpenHelper f19939d;
    public Uri f19940e;
    public UriMatcher f19941f;
    public String f19942g;
    public String[] f19943h;

    C3945a() {
    }

    public int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase writableDatabase = this.f19939d.getWritableDatabase();
        if (uri.getPathSegments().size() != 1) {
            throw new IllegalArgumentException("Unknown Uri");
        } else if (((String) uri.getPathSegments().get(0)).equals("suggestions")) {
            int delete = writableDatabase.delete("suggestions", str, strArr);
            getContext().getContentResolver().notifyChange(uri, null);
            return delete;
        } else {
            throw new IllegalArgumentException("Unknown Uri");
        }
    }

    public String getType(Uri uri) {
        if (this.f19941f.match(uri) == 1) {
            return "vnd.android.cursor.dir/vnd.android.search.suggest";
        }
        int size = uri.getPathSegments().size();
        if (size > 0 && ((String) uri.getPathSegments().get(0)).equals("suggestions")) {
            if (size == 1) {
                return "vnd.android.cursor.dir/suggestion";
            }
            if (size == 2) {
                return "vnd.android.cursor.item/suggestion";
            }
        }
        throw new IllegalArgumentException("Unknown Uri");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        SQLiteDatabase writableDatabase = this.f19939d.getWritableDatabase();
        int size = uri.getPathSegments().size();
        if (size <= 0) {
            throw new IllegalArgumentException("Unknown Uri");
        }
        Uri withAppendedPath;
        long j = -1;
        if (((String) uri.getPathSegments().get(0)).equals("suggestions") && size == 1) {
            j = writableDatabase.insert("suggestions", "query", contentValues);
            if (j > 0) {
                withAppendedPath = Uri.withAppendedPath(this.f19940e, String.valueOf(j));
                if (j >= 0) {
                    throw new IllegalArgumentException("Unknown Uri");
                }
                getContext().getContentResolver().notifyChange(withAppendedPath, null);
                return withAppendedPath;
            }
        }
        withAppendedPath = null;
        if (j >= 0) {
            getContext().getContentResolver().notifyChange(withAppendedPath, null);
            return withAppendedPath;
        }
        throw new IllegalArgumentException("Unknown Uri");
    }

    public boolean onCreate() {
        C6331c.m28983a((ContentProvider) this, C2195a.f10984a);
        if (this.f19936a == null || this.f19937b == 0) {
            throw new IllegalArgumentException("Provider not configured");
        }
        this.f19939d = new C3946b(getContext(), this.f19937b + 512);
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        SQLiteDatabase readableDatabase = this.f19939d.getReadableDatabase();
        if (this.f19941f.match(uri) == 1) {
            String[] strArr3;
            String str3;
            if (TextUtils.isEmpty(strArr2[0])) {
                strArr3 = null;
                str3 = null;
            } else {
                String str4 = strArr2[0];
                String stringBuilder = new StringBuilder(String.valueOf(str4).length() + 2).append("%").append(str4).append("%").toString();
                String[] strArr4 = this.f19938c ? new String[]{stringBuilder, stringBuilder} : new String[]{stringBuilder};
                str3 = this.f19942g;
                strArr3 = strArr4;
            }
            Cursor query = readableDatabase.query("suggestions", this.f19943h, str3, strArr3, null, null, "date DESC", null);
            query.setNotificationUri(getContext().getContentResolver(), uri);
            return query;
        }
        int size = uri.getPathSegments().size();
        if (size == 1 || size == 2) {
            str4 = (String) uri.getPathSegments().get(0);
            if (str4.equals("suggestions")) {
                String[] strArr5;
                if (strArr == null || strArr.length <= 0) {
                    strArr5 = null;
                } else {
                    strArr5 = new String[(strArr.length + 1)];
                    System.arraycopy(strArr, 0, strArr5, 0, strArr.length);
                    strArr5[strArr.length] = "_id AS _id";
                }
                StringBuilder stringBuilder2 = new StringBuilder(256);
                if (size == 2) {
                    stringBuilder2.append("(_id = ").append((String) uri.getPathSegments().get(1)).append(")");
                }
                if (str != null && str.length() > 0) {
                    if (stringBuilder2.length() > 0) {
                        stringBuilder2.append(" AND ");
                    }
                    stringBuilder2.append('(');
                    stringBuilder2.append(str);
                    stringBuilder2.append(')');
                }
                query = readableDatabase.query(str4, strArr5, stringBuilder2.toString(), strArr2, null, null, str2, null);
                query.setNotificationUri(getContext().getContentResolver(), uri);
                return query;
            }
            throw new IllegalArgumentException("Unknown Uri");
        }
        throw new IllegalArgumentException("Unknown Uri");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Not implemented");
    }
}
