package com.google.android.libraries.play.entertainment.story;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.p010b.C0026b;
import android.support.p010b.C0035i;
import android.support.p010b.C0036j;
import android.support.p010b.C0037k;
import android.support.p010b.C0039m;
import android.support.v4.app.C0241f;
import android.support.v4.p028a.C0216d;
import android.support.v7.app.aa;
import com.google.android.libraries.play.entertainment.C6027b;
import com.google.android.libraries.play.entertainment.C6071d;
import com.google.android.libraries.play.entertainment.C6072e;
import com.google.android.libraries.play.entertainment.p346h.C6090b;
import org.chromium.customtabsclient.shared.a;
import org.chromium.customtabsclient.shared.b;

public final class C6139i implements C6137g, b {
    public static final C6090b f30493a = C6090b.m28050a();
    public Bitmap f30494b;
    public C0037k f30495c;
    public C0026b f30496d;
    public C0039m f30497e;

    public final void mo5325a(Activity activity) {
        if (this.f30495c == null) {
            String a = C6140j.m28335a(activity);
            if (a == null) {
                f30493a.m28058b(null, "Unable to resolve application for custom tabs", new Object[0]);
                return;
            }
            this.f30495c = new a(this);
            C0026b.m26a(activity, a, this.f30495c);
        }
    }

    public final void mo5328b(Activity activity) {
        if (this.f30495c != null) {
            activity.unbindService(this.f30495c);
            this.f30496d = null;
            this.f30497e = null;
            this.f30495c = null;
        }
    }

    public final void mo5326a(Activity activity, String str) {
        if (this.f30494b == null) {
            int dimensionPixelSize = activity.getResources().getDimensionPixelSize(C6072e.pe__custom_tab_close_button_size);
            Drawable a = ((aa) activity).G_().mo507j().mo509a();
            a.setColorFilter(-1, Mode.SRC_ATOP);
            this.f30494b = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f30494b);
            a.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            a.draw(canvas);
        }
        C0036j c0036j = new C0036j(this.f30497e);
        c0036j.f51c = C0241f.m1451a(activity, C6027b.text_fragment_in, C6027b.text_fragment_out).mo321a();
        c0036j.f49a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", C0241f.m1451a(activity, C6027b.text_fragment_in, C6027b.text_fragment_out).mo321a());
        c0036j = c0036j.m41a(C0216d.m1116c(activity, C6071d.pe__default_action_bar_color));
        c0036j.f49a.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", this.f30494b);
        C0035i b = c0036j.m40a().m42b();
        b.f47a.addFlags(524288);
        String a2 = C6140j.m28335a(activity);
        if (a2 != null) {
            b.f47a.setPackage(a2);
        }
        try {
            b.m39a(activity, Uri.parse(str));
        } catch (ActivityNotFoundException e) {
            if (a2 == null) {
                throw e;
            }
            b.f47a.setPackage(null);
            C6140j.m28336a();
            String a3 = C6140j.m28335a(activity);
            if (a3 != null) {
                b.f47a.setPackage(a3);
            }
            b.m39a(activity, Uri.parse(str));
        }
    }

    public final boolean mo5327a(String str) {
        if (this.f30496d == null || this.f30497e == null) {
            return false;
        }
        return this.f30497e.m44a(Uri.parse(str));
    }

    public final void m28332a(C0026b c0026b) {
        this.f30496d = c0026b;
        this.f30496d.m28a();
        this.f30497e = this.f30496d.m27a(null);
    }

    public final void m28329a() {
        this.f30496d = null;
        this.f30497e = null;
    }
}
