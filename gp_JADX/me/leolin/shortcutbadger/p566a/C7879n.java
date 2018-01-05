package me.leolin.shortcutbadger.p566a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import me.leolin.shortcutbadger.C7865a;

public class C7879n implements C7865a {
    public final void mo6569a(Context context, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        bundle.putString("app_badge_component_name", componentName.flattenToString());
        if (VERSION.SDK_INT >= 11) {
            context.getContentResolver().call(Uri.parse("content://com.android.launcher3.cornermark.unreadbadge"), "setAppUnreadCount", null, bundle);
        }
    }

    public final List mo6568a() {
        return new ArrayList(0);
    }
}
