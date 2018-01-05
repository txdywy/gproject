package me.leolin.shortcutbadger.p566a;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.C7865a;

public class C7875j implements C7865a {
    public final Uri f40471a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");
    public AsyncQueryHandler f40472b;

    public final void mo6569a(Context context, ComponentName componentName, int i) {
        boolean z;
        boolean z2 = true;
        if (context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
            intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i));
            String str = "com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE";
            if (i <= 0) {
                z2 = false;
            }
            intent.putExtra(str, z2);
            context.sendBroadcast(intent);
        } else if (i >= 0) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("badge_count", Integer.valueOf(i));
            contentValues.put("package_name", componentName.getPackageName());
            contentValues.put("activity_name", componentName.getClassName());
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.f40472b == null) {
                    this.f40472b = new C7876k(context.getApplicationContext().getContentResolver());
                }
                this.f40472b.startInsert(0, null, this.f40471a, contentValues);
                return;
            }
            context.getApplicationContext().getContentResolver().insert(this.f40471a, contentValues);
        }
    }

    public final List mo6568a() {
        return Arrays.asList(new String[]{"com.sonyericsson.home", "com.sonymobile.home"});
    }
}
