package com.google.android.finsky.entertainment;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.C0241f;
import android.support.v4.p028a.C0216d;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.android.finsky.ee.C1016f;
import com.google.android.finsky.ee.C2974a;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.libraries.play.entertainment.p191c.C2980a;
import com.google.android.libraries.play.entertainment.p195e.C3004a;
import com.google.android.libraries.play.entertainment.p196j.C3006a;
import com.google.wireless.android.finsky.dfe.g.a.ai;
import com.google.wireless.android.finsky.dfe.g.a.k;
import com.squareup.leakcanary.C7582R;

final class C3007q extends C3006a implements C1016f, C0983h {
    public final C2974a f15733a;
    public final C0988c f15734b;
    public final C2206c f15735c;
    public final C2233o f15736d;
    public final C2171b f15737e;
    public final C1287h f15738f;
    public final C2162a f15739g;
    public final C3028c f15740h;
    public final C2994i f15741i;
    public final C3004a f15742j;
    public final C3851f f15743k;
    public final PackageManager f15744l;

    C3007q(C2974a c2974a, C0988c c0988c, C2206c c2206c, C2233o c2233o, C2171b c2171b, C1287h c1287h, C2162a c2162a, C3028c c3028c, C2994i c2994i, C3004a c3004a, C3851f c3851f, PackageManager packageManager) {
        this.f15733a = c2974a;
        this.f15734b = c0988c;
        this.f15735c = c2206c;
        this.f15736d = c2233o;
        this.f15737e = c2171b;
        this.f15738f = c1287h;
        this.f15739g = c2162a;
        this.f15740h = c3028c;
        this.f15741i = c2994i;
        this.f15742j = c3004a;
        this.f15743k = c3851f;
        this.f15744l = packageManager;
        this.f15733a.m15399a(this);
    }

    public final boolean mo3261a(ai aiVar) {
        return this.f15736d.m11645a(C3007q.m15558e(aiVar), this.f15735c.mo2811a(this.f15734b.cY())) || aiVar.b.f11835d == 2;
    }

    public final boolean mo3267b(ai aiVar) {
        if (this.f15742j.mo3256b() && aiVar.b != null && !TextUtils.isEmpty(aiVar.b.f11833b) && this.f15740h.m15635a(aiVar.b.f11833b)) {
            return true;
        }
        return false;
    }

    public final void mo3258a(View view, ai aiVar) {
        Intent intent = null;
        if (!(!this.f15742j.mo3256b() || aiVar.b == null || TextUtils.isEmpty(aiVar.b.f11833b))) {
            intent = this.f15744l.getLaunchIntentForPackage(aiVar.b.f11833b);
        }
        if (intent == null) {
            Toast.makeText(view.getContext(), C7582R.string.launch_error, 0).show();
        } else {
            view.getContext().startActivity(intent);
        }
    }

    public final void mo3259a(View view, ai aiVar, C2980a c2980a) {
        if (((aiVar.a & 1) != 0 ? 1 : 0) != 0) {
            String a = C1289l.m7694a(aiVar.c);
            Context context = view.getContext();
            C0216d.m1113a(context, this.f15737e.mo2745a(context, a, this.f15741i.m15466a(null, c2980a)), C0241f.m1451a(context, 0, 0).mo321a());
        }
    }

    public final String mo3257a(ai aiVar, Context context) {
        if (aiVar.b.f11835d == 2 && mo3266b()) {
            return context.getResources().getString(C7582R.string.listen);
        }
        return super.mo3257a(aiVar, context);
    }

    public final boolean mo3270c(ai aiVar) {
        return this.f15733a.m15401a(C3007q.m15558e(aiVar), this.f15734b.cY());
    }

    public final void mo3264b(View view, ai aiVar) {
        this.f15733a.m15397a(view, C3007q.m15558e(aiVar), aiVar.c, aiVar.i, this.f15738f.mo2015a());
    }

    private static ax m15558e(ai aiVar) {
        return C2726q.m14747a(aiVar.b.f11835d, aiVar.b.f11834c, aiVar.b.f11833b);
    }

    public final void mo1217a(String str, boolean z, boolean z2) {
        m15557e();
    }

    public final boolean mo3273d(ai aiVar) {
        if (aiVar.b.f11835d == 1 && this.f15739g.mo2703a(this.f15744l, 1)) {
            return true;
        }
        return false;
    }

    public final void mo3269c(View view, ai aiVar) {
        Intent putExtra;
        if (mo3273d(aiVar)) {
            putExtra = this.f15739g.mo2683a(1, Uri.parse((String) C0955b.f5905u.m28964b()).buildUpon().appendQueryParameter("id", aiVar.b.f11833b).build().toString(), this.f15734b.cZ()).putExtra("preview", true).putExtra("books:promptBeforeAdding", false);
        } else {
            putExtra = null;
        }
        if (putExtra != null) {
            view.getContext().startActivity(putExtra);
        }
    }

    public final String mo3263b(ai aiVar, Context context) {
        switch (aiVar.b.f11835d) {
            case 3:
                if (this.f15740h.m15635a(aiVar.b.f11833b)) {
                    return context.getResources().getString(C7582R.string.details);
                }
                break;
        }
        return super.mo3263b(aiVar, context);
    }

    public final boolean mo3260a() {
        return true;
    }

    public final boolean mo3266b() {
        return this.f15736d.m11644a(this.f15735c.mo2811a(this.f15734b.cY()));
    }

    public final boolean mo3262a(k kVar, ai aiVar) {
        if (kVar.f() != null) {
            return this.f15739g.mo2714b(((String) C0955b.ee.m28964b()).replace("%artistId%", aiVar.b.f11833b), this.f15734b.cY().name);
        }
        if ((!this.f15742j.mo3256b() || kVar.g() == null) && kVar.e() == null) {
            return super.mo3262a(kVar, aiVar);
        }
        return true;
    }

    public final void mo3265b(View view, ai aiVar, C2980a c2980a) {
        if (aiVar.b.f11835d == 2 && mo3266b() && this.f15739g.mo2703a(this.f15744l, 2)) {
            Context context = view.getContext();
            Intent intent = new Intent("com.google.android.music.PLAY");
            intent.putExtra("storeId", aiVar.b.f11833b);
            intent.putExtra("authAccount", this.f15734b.cY().name);
            context.startActivity(intent);
            return;
        }
        mo3259a(view, aiVar, c2980a);
    }

    public final void mo3272d(View view, ai aiVar) {
        try {
            Context context = view.getContext();
            Account cY = this.f15734b.cY();
            context.startActivity(this.f15739g.mo2683a(2, ((String) C0955b.ee.m28964b()).replace("%artistId%", aiVar.b.f11833b).replace("&utm_campaign=artist_play_button", "&utm_campaign=play_story_listen"), cY.name));
        } catch (ActivityNotFoundException e) {
            Toast.makeText(view.getContext(), C7582R.string.music_download_required, 0).show();
        }
    }

    protected final void mo3268c() {
        if (this.f15742j.mo3256b()) {
            this.f15743k.mo3818a((C0983h) this);
        }
    }

    protected final void mo3271d() {
        if (this.f15742j.mo3256b()) {
            this.f15743k.mo3819b(this);
        }
    }

    public final void mo1175b(String str, boolean z) {
        if (this.f15742j.mo3256b()) {
            m15557e();
        }
    }

    public final void mo1176c(String str, boolean z) {
        if (this.f15742j.mo3256b()) {
            m15557e();
        }
    }

    public final void mo1177d(String str) {
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1178e(String str) {
    }
}
