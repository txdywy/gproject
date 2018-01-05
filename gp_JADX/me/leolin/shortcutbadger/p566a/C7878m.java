package me.leolin.shortcutbadger.p566a;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.C7865a;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import me.leolin.shortcutbadger.p567b.C7881a;

public class C7878m implements C7865a {
    public final void mo6569a(Context context, ComponentName componentName, int i) {
        try {
            Object obj;
            Object newInstance = Class.forName("android.app.MiuiNotification").newInstance();
            Field declaredField = newInstance.getClass().getDeclaredField("messageCount");
            declaredField.setAccessible(true);
            if (i == 0) {
                try {
                    obj = "";
                } catch (Exception e) {
                    declaredField.set(newInstance, Integer.valueOf(i));
                    return;
                }
            }
            obj = Integer.valueOf(i);
            declaredField.set(newInstance, String.valueOf(obj));
        } catch (Exception e2) {
            Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
            String packageName = componentName.getPackageName();
            String className = componentName.getClassName();
            intent.putExtra("android.intent.extra.update_application_component_name", new StringBuilder((String.valueOf(packageName).length() + 1) + String.valueOf(className).length()).append(packageName).append("/").append(className).toString());
            intent.putExtra("android.intent.extra.update_application_message_text", String.valueOf(i == 0 ? "" : Integer.valueOf(i)));
            if (C7881a.m37776a(context, intent)) {
                context.sendBroadcast(intent);
                return;
            }
            className = "unable to resolve intent: ";
            String valueOf = String.valueOf(intent.toString());
            throw new ShortcutBadgeException(valueOf.length() != 0 ? className.concat(valueOf) : new String(className));
        }
    }

    public final List mo6568a() {
        return Arrays.asList(new String[]{"com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2"});
    }
}
