package com.google.android.libraries.play.entertainment.story;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.bitmap.C6032d;
import com.google.android.libraries.play.entertainment.bitmap.ImageInfo;
import com.google.android.libraries.play.entertainment.bitmap.PEImageView;
import com.google.android.libraries.play.entertainment.p351m.C6116b;
import com.google.android.libraries.play.entertainment.story.model.af;
import com.google.wireless.android.finsky.dfe.g.a.ad;
import com.google.wireless.android.finsky.dfe.g.a.ae;

public final class be extends bd {
    public TextView af;
    public View f30469b;
    public View f30470c;
    public PEImageView f30471d;
    public PEImageView f30472e;
    public TextView f30473f;
    public TextView f30474g;
    public TextView f30475h;
    public TextView f30476i;

    public static be m28304a(af afVar) {
        boolean z = afVar.o == null || afVar.o.d < 500;
        return m28305a(afVar, z);
    }

    public static be m28307b(af afVar) {
        return m28305a(afVar, false);
    }

    private static be m28305a(af afVar, boolean z) {
        String str;
        String str2;
        if (afVar.f30566b != null) {
            str = afVar.f30566b.b;
            str2 = afVar.f30566b.c;
        } else {
            str2 = null;
            str = null;
        }
        if (afVar.o != null) {
            if (((afVar.o.b & 16) != 0 ? 1 : null) != null) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = afVar.o.g;
                } else {
                    String valueOf = String.valueOf(afVar.o.g);
                    str2 = String.valueOf(str2);
                    str2 = str2.length() != 0 ? valueOf.concat(str2) : new String(valueOf);
                }
            }
        }
        int i = afVar.p;
        int i2 = afVar.q;
        int i3 = afVar.r;
        ae aeVar = afVar.o;
        String str3 = afVar.f30565a;
        ad adVar = afVar.f30567c;
        Fragment beVar = new be();
        Bundle bundle = new Bundle();
        bundle.putInt("primaryTextColor", i);
        bundle.putInt("secondaryTextColor", i2);
        bundle.putInt("backgroundColor", i3);
        bundle.putBoolean("imageAvatar", z);
        if (aeVar != null) {
            Parcelable a;
            valueOf = aeVar.c;
            if (aeVar.f && (z || adVar == null)) {
                valueOf = new StringBuilder(String.valueOf(valueOf).length() + 3).append(valueOf).append("=pf").toString();
            }
            if (adVar != null) {
                a = ImageInfo.m27916a(valueOf, aeVar.f, aeVar.d, aeVar.e, adVar);
            } else {
                a = ImageInfo.m27915a(valueOf, aeVar.f, aeVar.d, aeVar.e);
            }
            bundle.putParcelable("imageInfo", a);
        }
        bundle.putString("titleText", str3);
        bundle.putString("subtitle1Text", null);
        bundle.putString("subtitle2Text", null);
        bundle.putString("bodyText", str);
        bundle.putString("attributionHtmlText", str2);
        beVar.m600f(bundle);
        return beVar;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f30469b = layoutInflater.inflate(C6091h.fragment_text, viewGroup, false);
        this.f30470c = this.f30469b.findViewById(C6089g.leading_image_wrapper);
        this.f30471d = (PEImageView) this.f30469b.findViewById(C6089g.leading_image);
        this.f30472e = (PEImageView) this.f30469b.findViewById(C6089g.avatar_image);
        this.f30474g = (TextView) this.f30469b.findViewById(C6089g.title);
        this.f30475h = (TextView) this.f30469b.findViewById(C6089g.subtitle_1);
        this.f30476i = (TextView) this.f30469b.findViewById(C6089g.subtitle_2);
        this.f30473f = (TextView) this.f30469b.findViewById(C6089g.body);
        this.af = (TextView) this.f30469b.findViewById(C6089g.attribution);
        ((TextView) C6116b.m28100a(this.af)).setMovementMethod(LinkMovementMethod.getInstance());
        return this.f30469b;
    }

    public final void mo139d(Bundle bundle) {
        int i = 3;
        super.mo139d(bundle);
        Bundle bundle2 = this.f760q;
        if (bundle2 != null) {
            m28306a(this.f30473f, "bodyText", false, bundle2);
            m28306a(this.f30474g, "titleText", true, bundle2);
            m28306a(this.f30475h, "subtitle1Text", true, bundle2);
            m28306a(this.f30476i, "subtitle2Text", true, bundle2);
            Object obj = this.af;
            bd.m28188b(obj, "attributionHtmlText", bundle2);
            ((TextView) C6116b.m28100a(obj)).setTextColor(bundle2.getInt("secondaryTextColor"));
            obj = this.f30469b;
            C6116b.m28100a(obj);
            if (bundle2.containsKey("backgroundColor")) {
                obj.setBackgroundColor(bundle2.getInt("backgroundColor"));
            }
            C6116b.m28100a(this.f30470c);
            C6116b.m28100a(this.f30471d);
            C6116b.m28100a(this.f30472e);
            if (bundle2.containsKey("imageInfo")) {
                ImageInfo imageInfo = (ImageInfo) bundle2.getParcelable("imageInfo");
                C6116b.m28100a(imageInfo.f30112a);
                int i2 = imageInfo.f30114c;
                int i3 = imageInfo.f30115d;
                if (bundle2.getBoolean("imageAvatar")) {
                    this.f30472e.m27923a(imageInfo, 4, C6136f.f30488b);
                    this.f30470c.setVisibility(8);
                    this.f30471d.setVisibility(8);
                    this.f30472e.setVisibility(0);
                } else {
                    if (imageInfo.m27917a()) {
                        this.f30471d.m27923a(imageInfo, 3, new C6032d[0]);
                    } else {
                        PEImageView pEImageView = this.f30471d;
                        if (i2 <= i3) {
                            i = 5;
                        }
                        pEImageView.m27923a(imageInfo, i, new C6032d[0]);
                    }
                    this.f30472e.setVisibility(8);
                    this.f30470c.setVisibility(0);
                    this.f30471d.setVisibility(0);
                }
            } else {
                this.f30470c.setVisibility(8);
                this.f30471d.setVisibility(8);
                this.f30472e.setVisibility(8);
            }
            aa();
        }
    }

    public final void mo138d() {
        ((PEImageView) C6116b.m28100a(this.f30471d)).m27921a();
        ((PEImageView) C6116b.m28100a(this.f30472e)).m27921a();
        super.mo138d();
    }

    private static void m28306a(TextView textView, String str, boolean z, Bundle bundle) {
        bd.m28186a(textView, str, bundle);
        ((TextView) C6116b.m28100a((Object) textView)).setTextColor(z ? bundle.getInt("primaryTextColor") : bundle.getInt("secondaryTextColor"));
    }
}
