package com.google.android.finsky.bv;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.ShortcutInfo$Builder;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.br.b;
import java.util.Collections;
import java.util.List;

public final class com.google.android.finsky.bv.c implements com.google.android.finsky.bv.d
{

    public final Context a;
    public final com.google.android.finsky.ba.c b;
    public final com.google.android.finsky.accounts.c c;
    public final com.google.android.finsky.br.b d;

    c(Context p0, com.google.android.finsky.ba.c p1, com.google.android.finsky.accounts.c p2, com.google.android.finsky.br.b p3) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
    }

    public final void a() {
        v2 = this.c.cX();
        v1 = 0;
        while (v1 < v2.size()) {
            v3 = ((Account)v2.get(v1)).name;
            if (this.b.j(v3).a(12630884)) {
                ((ShortcutManager)this.a.getSystemService("shortcut")).addDynamicShortcuts(Collections.singletonList(new ShortcutInfo$Builder(this.a, "VIEW_PLAY_PASS_HOME").setShortLabel("PlayPass").setLongLabel("PlayPass").setIcon(Icon.createWithResource(this.a, 2130837821)).setIntent(this.d.b(this.a, v3)).build()));
                return;
            }
            v1 = v1 + 1;
        }
        v0 = this.a.getSystemService("shortcut");
        v1 = Collections.singletonList("VIEW_PLAY_PASS_HOME");
        ((ShortcutManager)v0).disableShortcuts(v1);
        ((ShortcutManager)v0).removeDynamicShortcuts(v1);
    }

}
