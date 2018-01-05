package com.google.android.finsky.detailspage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.detailsmodules.p183a.C2601e;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.a;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class C2655i extends ck implements ad, bm, gn {
    public ce f14694d;

    public final boolean mo2979f() {
        return this.b != null;
    }

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.avatar_title_module;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        int i;
        switch (document.f14885a.f12098e) {
            case 3:
            case 8:
            case 30:
            case 34:
                i = 1;
                break;
            default:
                i = 0;
                break;
        }
        if (i != 0) {
            bd bdVar;
            this.b = new C2656j();
            ((C2656j) this.b).f14695a = document.f14885a.f12100g;
            C2656j c2656j = (C2656j) this.b;
            if (document.m14647d(4)) {
                bdVar = (bd) document.m14644c(4).get(0);
            } else {
                bdVar = null;
            }
            c2656j.f14696b = bdVar;
            ((C2656j) this.b).f14697c = C1608h.m9249a(document.f14885a.f12100g, document.f14885a.f12098e, this.t.getResources());
        }
    }

    public final void mo2976b(View view, int i) {
        AvatarTitleModuleLayout avatarTitleModuleLayout = (AvatarTitleModuleLayout) view;
        CharSequence charSequence = ((C2656j) this.b).f14695a;
        bd bdVar = ((C2656j) this.b).f14696b;
        String str = this.F;
        CharSequence charSequence2 = ((C2656j) this.b).f14697c;
        boolean z = this.G;
        avatarTitleModuleLayout.f13916a.setText(charSequence);
        avatarTitleModuleLayout.f13916a.setSelected(true);
        if (bdVar != null) {
            avatarTitleModuleLayout.f13918c = !TextUtils.isEmpty(str);
            if (C3760e.m17903a() && avatarTitleModuleLayout.f13918c) {
                ai.m1832a(avatarTitleModuleLayout.f13917b, str);
            }
            if (!z) {
                avatarTitleModuleLayout.f13917b.setBitmapTransformation(a.a(avatarTitleModuleLayout.getResources()));
                C1473m.f7980a.ar().m9288a(avatarTitleModuleLayout.f13917b, bdVar.f11860f, bdVar.f11863i);
            }
            avatarTitleModuleLayout.f13917b.setContentDescription(charSequence2);
            avatarTitleModuleLayout.f13917b.setVisibility(0);
        } else {
            avatarTitleModuleLayout.f13917b.setVisibility(4);
        }
        avatarTitleModuleLayout.f13917b.setContentDescription(charSequence2);
        getParentNode().mo1219a(this);
    }

    public final void mo3030a(Bitmap bitmap) {
        AvatarTitleModuleLayout avatarTitleModuleLayout = (AvatarTitleModuleLayout) ((C2601e) this.f13820a.get(0)).a;
        avatarTitleModuleLayout.f13917b.setUseCachedPlaceholder(false);
        avatarTitleModuleLayout.f13917b.setToFadeInAfterLoad(false);
        avatarTitleModuleLayout.f13917b.setBitmapTransformation(null);
        avatarTitleModuleLayout.f13917b.setImageBitmap(bitmap);
        avatarTitleModuleLayout.f13917b.setDefaultDrawable(new BitmapDrawable(avatarTitleModuleLayout.getResources(), bitmap));
    }

    public final void mo3028a() {
        if (((C2656j) this.b).f14696b != null) {
            AvatarTitleModuleLayout avatarTitleModuleLayout = (AvatarTitleModuleLayout) ((C2601e) this.f13820a.get(0)).a;
            bd bdVar = ((C2656j) this.b).f14696b;
            avatarTitleModuleLayout.f13917b.setBitmapTransformation(a.a(avatarTitleModuleLayout.getResources()));
            C1473m.f7980a.ar().m9288a(avatarTitleModuleLayout.f13917b, bdVar.f11860f, bdVar.f11863i);
        }
    }

    public ce getPlayStoreUiElement() {
        if (this.f14694d == null) {
            this.f14694d = C2482j.m13283a(1873);
        }
        return this.f14694d;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
