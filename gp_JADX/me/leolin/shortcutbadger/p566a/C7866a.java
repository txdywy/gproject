package me.leolin.shortcutbadger.p566a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.C7865a;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.p567b.C7881a;

public class C7866a implements C7865a {
    public final void mo6569a(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", componentName.getPackageName());
        intent.putExtra("CNAME", componentName.getClassName());
        intent.putExtra("COUNT", i);
        if (C7881a.m37776a(context, intent)) {
            context.sendBroadcast(intent);
            return;
        }
        String str = "unable to resolve intent: ";
        String valueOf = String.valueOf(intent.toString());
        throw new ShortcutBadgeException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public final List mo6568a() {
        return Arrays.asList(new String[]{"org.adw.launcher", "org.adwfreak.launcher"});
    }
}
