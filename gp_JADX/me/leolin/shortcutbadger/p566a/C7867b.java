package me.leolin.shortcutbadger.p566a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.C7865a;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.p567b.C7881a;

public class C7867b implements C7865a {
    public final void mo6569a(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i);
        intent.putExtra("class", componentName.getClassName());
        if (C7881a.m37776a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        String str = "unable to resolve intent: ";
        String valueOf = String.valueOf(intent.toString());
        throw new ShortcutBadgeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public final List mo6568a() {
        return Arrays.asList(new String[]{"com.anddoes.launcher"});
    }
}
