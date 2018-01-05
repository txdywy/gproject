package com.google.android.finsky.layout.play;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.caverock.androidsvg.C0722q;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.a;
import com.google.android.play.image.ac;
import com.google.wireless.android.finsky.dfe.nano.cc;
import com.squareup.leakcanary.C7582R;

public class DiscoveryBadgeFamilyCategory extends C3689a {
    public ImageView f18646w;

    public DiscoveryBadgeFamilyCategory(Context context) {
        this(context, null);
    }

    public DiscoveryBadgeFamilyCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18646w = (ImageView) findViewById(C7582R.id.overlay_icon);
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.q) {
            m17493a(canvas);
        }
    }

    public final void mo3583a(cc ccVar, C1294w c1294w, C3748a c3748a, Document document, DfeToc dfeToc, PackageManager packageManager, ad adVar, C2495w c2495w) {
        int i = C7582R.raw.family_apps_mini_badge;
        super.mo3583a(ccVar, c1294w, c3748a, document, dfeToc, packageManager, adVar, c2495w);
        ImageView imageView = this.f18646w;
        Resources resources = getContext().getResources();
        switch (document.f14885a.f12099f) {
            case 1:
                i = C7582R.raw.family_books_mini_badge;
                break;
            case 4:
                i = C7582R.raw.family_movies_mini_badge;
                break;
        }
        imageView.setImageDrawable(C0722q.m4782a(resources, i, null));
    }

    protected int getPlayStoreUiElementType() {
        return 1801;
    }

    protected final void mo3589a() {
        ac c;
        if (this.q) {
            c = a.c(getResources(), getResources().getColor(C7582R.color.play_transparent));
        } else {
            c = a.b(getResources(), this.e);
        }
        this.b.setBitmapTransformation(c);
    }
}
