package me.leolin.shortcutbadger.p566a;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.C7865a;

public class C7880o implements C7865a {
    public final Uri f40473a = Uri.parse("content://com.android.badge/badge");

    @TargetApi(11)
    public final void mo6569a(Context context, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.f40473a, "setAppBadgeCount", null, bundle);
    }

    public final List mo6568a() {
        return Collections.singletonList("com.zui.launcher");
    }
}
