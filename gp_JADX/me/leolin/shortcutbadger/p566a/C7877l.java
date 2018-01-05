package me.leolin.shortcutbadger.p566a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.C7865a;

public class C7877l implements C7865a {
    public final void mo6569a(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i);
        context.sendBroadcast(intent);
    }

    public final List mo6568a() {
        return Arrays.asList(new String[]{"com.vivo.launcher"});
    }
}
