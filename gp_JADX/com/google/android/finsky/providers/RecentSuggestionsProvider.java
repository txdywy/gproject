package com.google.android.finsky.providers;

import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;

public class RecentSuggestionsProvider extends C3945a {
    public RecentSuggestionsProvider() {
        Object obj = "com.google.android.finsky.RecentSuggestionsProvider";
        if (TextUtils.isEmpty(obj)) {
            throw new IllegalArgumentException();
        }
        this.f19938c = true;
        this.f19936a = new String(obj);
        this.f19937b = 3;
        String str = this.f19936a;
        this.f19940e = Uri.parse(new StringBuilder(String.valueOf(str).length() + 22).append("content://").append(str).append("/suggestions").toString());
        this.f19941f = new UriMatcher(-1);
        this.f19941f.addURI(this.f19936a, "search_suggest_query", 1);
        if (this.f19938c) {
            this.f19942g = "display1 LIKE ? OR display2 LIKE ?";
            this.f19943h = new String[]{"0 AS suggest_format", "display1 AS suggest_text_1", "display2 AS suggest_text_2", "query AS suggest_intent_query", "_id"};
            return;
        }
        this.f19942g = "display1 LIKE ?";
        this.f19943h = new String[]{"0 AS suggest_format", "display1 AS suggest_text_1", "query AS suggest_intent_query", "_id"};
    }

    public /* bridge */ /* synthetic */ int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return super.update(uri, contentValues, str, strArr);
    }

    public /* bridge */ /* synthetic */ Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return super.query(uri, strArr, str, strArr2, str2);
    }

    public /* bridge */ /* synthetic */ boolean onCreate() {
        return super.onCreate();
    }

    public /* bridge */ /* synthetic */ Uri insert(Uri uri, ContentValues contentValues) {
        return super.insert(uri, contentValues);
    }

    public /* bridge */ /* synthetic */ String getType(Uri uri) {
        return super.getType(uri);
    }

    public /* bridge */ /* synthetic */ int delete(Uri uri, String str, String[] strArr) {
        return super.delete(uri, str, strArr);
    }
}
