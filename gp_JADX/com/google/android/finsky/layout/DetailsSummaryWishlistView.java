package com.google.android.finsky.layout;

import android.accounts.Account;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.ee.C1016f;
import com.google.android.finsky.ee.C2974a;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.squareup.leakcanary.C7582R;

public class DetailsSummaryWishlistView extends ImageView implements C1016f {
    public Document f18126a;
    public boolean f18127b;
    public final C2974a f18128c;

    public DetailsSummaryWishlistView(Context context) {
        this(context, null);
    }

    public DetailsSummaryWishlistView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18128c = C1473m.f7980a.bd();
    }

    public final void m17280a(Document document, C3748a c3748a, C2495w c2495w) {
        if (this.f18128c.m15403a(document, C1473m.f7980a.ap())) {
            setVisibility(8);
            return;
        }
        this.f18126a = document;
        setVisibility(0);
        Account cY = C1473m.f7980a.cY();
        m17279a(this.f18128c.m15402a(document, cY), document.f14885a.f12099f);
        setOnClickListener(new C3728u(this, document, cY, c2495w, c3748a));
        this.f18127b = true;
    }

    private final void m17279a(boolean z, int i) {
        if (z) {
            setImageDrawable(C1608h.m9246a(getContext(), (int) C7582R.drawable.ic_menu_wish_on, i));
            setContentDescription(getContext().getString(C7582R.string.content_description_wishlist_remove));
            return;
        }
        setImageDrawable(C1608h.m9246a(getContext(), (int) C7582R.drawable.ic_menu_wish_off, i));
        setContentDescription(getContext().getString(C7582R.string.content_description_wishlist_add));
    }

    public final void mo1217a(String str, boolean z, boolean z2) {
        if (this.f18127b && str.equals(this.f18126a.f14885a.f12096c)) {
            m17279a(z, this.f18126a.f14885a.f12099f);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f18128c.m15399a(this);
    }

    public void onDetachedFromWindow() {
        this.f18128c.m15404b(this);
        super.onDetachedFromWindow();
    }
}
