package me.leolin.shortcutbadger.p567b;

import android.content.Context;
import android.content.Intent;
import java.util.List;

public final class C7881a {
    public static boolean m37776a(Context context, Intent intent) {
        List queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            return false;
        }
        return true;
    }
}
