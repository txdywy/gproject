package me.leolin.shortcutbadger.p566a;

import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.C7865a;

public class C7872g implements C7865a {
    public final void mo6569a(Context context, ComponentName componentName, int i) {
        ContentValues contentValues = new ContentValues();
        String packageName = componentName.getPackageName();
        String className = componentName.getClassName();
        contentValues.put("tag", new StringBuilder((String.valueOf(packageName).length() + 1) + String.valueOf(className).length()).append(packageName).append("/").append(className).toString());
        contentValues.put("count", Integer.valueOf(i));
        context.getContentResolver().insert(Uri.parse("content://com.teslacoilsw.notifier/unread_count"), contentValues);
    }

    public final List mo6568a() {
        return Arrays.asList(new String[]{"com.teslacoilsw.launcher"});
    }
}
