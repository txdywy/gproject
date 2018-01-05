package com.google.android.finsky.entertainment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.C0241f;
import android.support.v4.p028a.C0216d;
import android.text.TextUtils;
import com.google.android.agera.C0896s;
import com.google.android.agera.aa;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p348i.C6092a;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.story.ai;
import com.google.android.libraries.play.entertainment.story.az;
import com.squareup.leakcanary.C7582R;

public class PEFinskyStoryActivity extends ai {
    public static final C0896s f15663r = aa.m5567b(Boolean.valueOf(false));
    public C2171b f15664q;

    static void m15410a(Activity activity, C2495w c2495w, String str, int i) {
        new Object[1][0] = str;
        m15411a(activity, c2495w, str, i, true);
    }

    static void m15412b(Activity activity, C2495w c2495w, String str, int i) {
        new Object[1][0] = str;
        m15411a(activity, c2495w, str, i, false);
    }

    private static void m15411a(Activity activity, C2495w c2495w, String str, int i, boolean z) {
        C6092a azVar = new az(activity, (String) C6116b.m28099a((CharSequence) str));
        azVar.f30460d = (Class) C6116b.m28100a((Object) PEFinskyStoryActivity.class);
        C6116b.m28107b((i & -16777216) == -16777216, "backgroundColor must be opaque");
        azVar.f30462f = i;
        azVar.f30463g = (C2980a) C6116b.m28100a(new C2995j(c2495w));
        m15409a(activity, azVar.mo5317a().putExtra("newInstance", z));
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        String stringExtra = intent.getStringExtra("storyId");
        boolean booleanExtra = intent.getBooleanExtra("newInstance", true);
        if (!TextUtils.isEmpty(stringExtra) && booleanExtra) {
            new Object[1][0] = stringExtra;
            m15408a(stringExtra);
        }
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C1381a) C3947d.m18649a(C1381a.class)).mo1835a(this);
    }

    protected void onResume() {
        super.onResume();
        f15663r.mo1146b(Boolean.valueOf(true));
    }

    protected void onPause() {
        super.onPause();
        new Object[1][0] = Boolean.valueOf(isFinishing());
        if (isFinishing()) {
            f15663r.mo1146b(Boolean.valueOf(false));
            m15409a(this, this.f15664q.mo2767g(getApplicationContext()));
        }
    }

    protected void onDestroy() {
        super.onDestroy();
        if (((Boolean) f15663r.i_()).booleanValue()) {
            f15663r.mo1146b(Boolean.valueOf(false));
        }
    }

    private static void m15409a(Activity activity, Intent intent) {
        C0216d.m1113a(activity, intent, C0241f.m1451a(activity, C7582R.anim.play_fade_in, C7582R.anim.keep_visible).mo321a());
    }
}
