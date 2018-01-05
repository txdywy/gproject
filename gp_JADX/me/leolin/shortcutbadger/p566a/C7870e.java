package me.leolin.shortcutbadger.p566a;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.C7865a;

public class C7870e implements C7865a {
    public final void mo6569a(Context context, ComponentName componentName, int i) {
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString("class", componentName.getClassName());
        bundle.putInt("badgenumber", i);
        context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", null, bundle);
    }

    public final List mo6568a() {
        return Arrays.asList(new String[]{"com.huawei.android.launcher"});
    }
}
