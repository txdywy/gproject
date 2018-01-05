package com.google.android.finsky.layout.structuredreviews;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.play.layout.g;
import com.squareup.leakcanary.C7582R;

final class C3722d implements OnClickListener {
    public final /* synthetic */ C2495w f18836a;
    public final /* synthetic */ ad f18837b;
    public final /* synthetic */ ReviewRatedLayout f18838c;

    C3722d(ReviewRatedLayout reviewRatedLayout, C2495w c2495w, ad adVar) {
        this.f18838c = reviewRatedLayout;
        this.f18836a = c2495w;
        this.f18837b = adVar;
    }

    public final void onClick(View view) {
        g gVar = new g(this.f18838c.getContext(), this.f18838c.f18825i);
        Resources resources = this.f18838c.getContext().getResources();
        this.f18836a.m13368a(new C2475d(this.f18837b).m13256a(238));
        gVar.a(1, resources.getString(C7582R.string.edit_review), true, this.f18838c);
        gVar.a(2, resources.getString(C7582R.string.delete_review), true, this.f18838c);
        this.f18838c.f18825i.setImageResource(C7582R.drawable.play_overflow_menu_open);
        gVar.e = new C3723e(this);
        gVar.a();
    }
}
