package com.google.android.finsky.dialogbuilder.p137a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.finsky.billing.common.LightPurchaseButtonBarLayout;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.dialogbuilder.p154b.C2791f;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.c.a.bn;
import com.squareup.leakcanary.C7582R;
import java.util.Arrays;

public final class C2759a extends C1666l {
    public C2798j f15002a;
    public final bn f15003b;
    public final C2791f f15004c;

    public C2759a(LayoutInflater layoutInflater, bn bnVar, C2791f c2791f) {
        super(layoutInflater);
        ((C1379m) C3947d.m18649a(C1379m.class)).mo1817a(this);
        this.f15003b = bnVar;
        this.f15004c = c2791f;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        boolean z = false;
        view.setPadding(0, 0, 0, 0);
        if (this.f15003b.e) {
            ((LightPurchaseButtonBarLayout) view.findViewById(C7582R.id.continue_button_bar)).setShouldShowLogo(false);
        }
        ImageView imageView = (FifeImageView) view.findViewById(C7582R.id.play_logo);
        if (this.f15003b.f == null) {
            if ((this.f15003b.a & 2) != 0) {
                z = true;
            }
            if (z) {
                switch (this.f15003b.g) {
                    case 1:
                        imageView.setImageResource(C7582R.drawable.ic_lock_google_play);
                        break;
                    default:
                        imageView.setImageResource(C7582R.drawable.logo_googleplay);
                        break;
                }
            }
        }
        this.f15002a.m14902a(this.f15003b.f, imageView, c2797e);
        Button button = (Button) view.findViewById(C7582R.id.continue_button);
        this.f15002a.m14901a(this.f15003b.b, button, c2797e);
        if (this.f15003b.d != null && this.f15003b.d.length > 0) {
            C2791f c2791f = this.f15004c;
            String[] strArr = this.f15003b.d;
            c2791f.f15091c = new C2761b(button);
            if (strArr != null && strArr.length > 0) {
                c2791f.f15089a.addAll(Arrays.asList(strArr));
            }
            c2791f.m14867a();
        }
        this.f15002a.m14901a(this.f15003b.c, (Button) view.findViewById(C7582R.id.secondary_button), c2797e);
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_buttonbar;
    }
}
