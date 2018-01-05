package me.leolin.shortcutbadger.p566a;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build.VERSION;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.C7865a;
import me.leolin.shortcutbadger.p567b.C7881a;
import me.leolin.shortcutbadger.p567b.C7882b;

public class C7874i implements C7865a {
    public static final String[] f40469a = new String[]{"_id", "class"};
    public C7869d f40470b;

    public C7874i() {
        if (VERSION.SDK_INT >= 21) {
            this.f40470b = new C7869d();
        }
    }

    public final void mo6569a(Context context, ComponentName componentName, int i) {
        Throwable th;
        Cursor cursor;
        if (this.f40470b == null || !C7881a.m37776a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE"))) {
            Uri parse = Uri.parse("content://com.sec.badge/apps?notify=true");
            ContentResolver contentResolver = context.getContentResolver();
            try {
                Cursor query = contentResolver.query(parse, f40469a, "package=?", new String[]{componentName.getPackageName()}, null);
                if (query != null) {
                    try {
                        String className = componentName.getClassName();
                        Object obj = null;
                        while (query.moveToNext()) {
                            int i2 = query.getInt(0);
                            contentResolver.update(parse, C7874i.m37763a(componentName, i, false), "_id=?", new String[]{String.valueOf(i2)});
                            if (className.equals(query.getString(query.getColumnIndex("class")))) {
                                obj = 1;
                            }
                        }
                        if (obj == null) {
                            contentResolver.insert(parse, C7874i.m37763a(componentName, i, true));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        C7882b.m37777a(cursor);
                        throw th;
                    }
                }
                C7882b.m37777a(query);
                return;
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
                C7882b.m37777a(cursor);
                throw th;
            }
        }
        this.f40470b.mo6569a(context, componentName, i);
    }

    private static ContentValues m37763a(ComponentName componentName, int i, boolean z) {
        ContentValues contentValues = new ContentValues();
        if (z) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put("class", componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i));
        return contentValues;
    }

    public final List mo6568a() {
        return Arrays.asList(new String[]{"com.sec.android.app.launcher", "com.sec.android.app.twlauncher"});
    }
}
