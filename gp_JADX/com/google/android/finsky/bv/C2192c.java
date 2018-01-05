package com.google.android.finsky.bv;

import android.accounts.Account;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ShortcutInfo.Builder;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.br.C2171b;
import com.squareup.leakcanary.C7582R;
import java.util.Collections;
import java.util.List;

@TargetApi(25)
public final class C2192c implements C2190d {
    public final Context f10979a;
    public final C1461c f10980b;
    public final C0988c f10981c;
    public final C2171b f10982d;

    public C2192c(Context context, C1461c c1461c, C0988c c0988c, C2171b c2171b) {
        this.f10979a = context;
        this.f10980b = c1461c;
        this.f10981c = c0988c;
        this.f10982d = c2171b;
    }

    public final void mo2777a() {
        List cX = this.f10981c.cX();
        for (int i = 0; i < cX.size(); i++) {
            String str = ((Account) cX.get(i)).name;
            if (this.f10980b.mo2249j(str).mo2294a(12630884)) {
                ((ShortcutManager) this.f10979a.getSystemService("shortcut")).addDynamicShortcuts(Collections.singletonList(new Builder(this.f10979a, "VIEW_PLAY_PASS_HOME").setShortLabel("PlayPass").setLongLabel("PlayPass").setIcon(Icon.createWithResource(this.f10979a, C7582R.drawable.ic_shortcut_ticket)).setIntent(this.f10982d.mo2760b(this.f10979a, str)).build()));
                return;
            }
        }
        ShortcutManager shortcutManager = (ShortcutManager) this.f10979a.getSystemService("shortcut");
        List singletonList = Collections.singletonList("VIEW_PLAY_PASS_HOME");
        shortcutManager.disableShortcuts(singletonList);
        shortcutManager.removeDynamicShortcuts(singletonList);
    }
}
