package me.leolin.shortcutbadger.p566a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.C7865a;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.p567b.C7881a;

public class C7871f implements C7865a {
    public final void mo6569a(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i);
        if (C7881a.m37776a(context, intent) || C7881a.m37776a(context, intent2)) {
            context.sendBroadcast(intent);
            context.sendBroadcast(intent2);
            return;
        }
        String str = "unable to resolve intent: ";
        String valueOf = String.valueOf(intent2.toString());
        throw new ShortcutBadgeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public final List mo6568a() {
        return Arrays.asList(new String[]{"com.htc.launcher"});
    }
}
