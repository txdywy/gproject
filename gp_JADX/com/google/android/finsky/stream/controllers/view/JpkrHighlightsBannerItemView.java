package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.ai;
import android.support.v4.view.av;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.navigationmanager.C3760e;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.controllers.ca;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.be;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public class JpkrHighlightsBannerItemView extends C4502s implements OnClickListener, ad, ae, be {
    public static final int[] f22947a = new int[]{2};
    public static StringBuilder f22948l;
    public C1294w f22949b;
    public TextView f22950c;
    public View f22951d;
    public DocImageView f22952e;
    public be f22953f;
    public Document f22954g;
    public C3748a f22955h;
    public C2495w f22956i;
    public ce f22957j;
    public ad f22958k;

    private static void m21022b() {
        StringBuilder stringBuilder = new StringBuilder();
        f22948l = stringBuilder;
        stringBuilder.append("transition_generic_circle:");
    }

    public JpkrHighlightsBannerItemView(Context context) {
        this(context, null);
    }

    public JpkrHighlightsBannerItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public JpkrHighlightsBannerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22957j = C2482j.m13283a(523);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, i);
    }

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    protected void onFinishInflate() {
        ((ca) C3947d.m18649a(ca.class)).mo1954a(this);
        super.onFinishInflate();
        this.f22950c = (TextView) findViewById(C7582R.id.li_title);
        this.f22952e = (DocImageView) findViewById(C7582R.id.li_thumbnail);
        this.f22951d = findViewById(C7582R.id.gradient_overlay);
    }

    public final void mo4236a(String str, Document document, C3748a c3748a, ad adVar, C2495w c2495w) {
        CharSequence charSequence;
        this.f22954g = document;
        this.f22955h = c3748a;
        this.f22956i = c2495w;
        if (TextUtils.isEmpty(document.f14885a.f12100g)) {
            charSequence = document.f14885a.f12101h;
        } else {
            charSequence = document.f14885a.f12100g;
        }
        if (this.f22950c != null) {
            this.f22950c.setText(charSequence);
        }
        if (this.f22951d != null) {
            this.f22951d.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        }
        this.f22952e.setOnLoadedListener(this);
        this.f22953f = null;
        this.f22952e.m13584a(document, this.f22949b, f22947a);
        if (C3760e.m17903a()) {
            if (f22948l == null) {
                m21022b();
            }
            f22948l.setLength(26);
            f22948l.append(document.f14885a.f12096c);
            f22948l.append(':');
            f22948l.append(str);
            ai.m1832a(this.f22952e, f22948l.toString());
            av.f1860a.mo430a(this);
        }
        setOnClickListener(this.f22955h.mo3625a((OnClickListener) this, document));
        C2482j.m13285a(this.f22957j, document.f14885a.f12087D);
        this.f22958k = adVar;
        getParentNode().mo1219a(this);
        String string = getContext().getString(C7582R.string.content_description_featured_prefix);
        String str2 = document.f14885a.f12100g;
        setContentDescription(new StringBuilder((String.valueOf(string).length() + 1) + String.valueOf(str2).length()).append(string).append("\n").append(str2).toString());
    }

    public View getImageView() {
        return this.f22952e;
    }

    public Document getDoc() {
        return this.f22954g;
    }

    public ce getPlayStoreUiElement() {
        return this.f22957j;
    }

    public ad getParentNode() {
        return this.f22958k;
    }

    public final void mo1219a(ad adVar) {
        throw new IllegalStateException("unwanted children");
    }

    public final void m21025a(FifeImageView fifeImageView, Bitmap bitmap) {
        if (this.f22953f != null) {
            this.f22953f.a(fifeImageView, bitmap);
        }
    }

    public final void m21024a(FifeImageView fifeImageView) {
        if (this.f22953f != null) {
            this.f22953f.a(fifeImageView);
        }
    }

    public final void Z_() {
        this.f22952e.setOnLoadedListener(null);
        this.f22952e.a();
        this.f22953f = null;
        setOnClickListener(null);
    }

    public void onClick(View view) {
        this.f22955h.mo3655a(this.f22954g, (ad) this, this.f22956i);
    }

    static {
        if (C3760e.m17903a()) {
            m21022b();
        }
    }
}
