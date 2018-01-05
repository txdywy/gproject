package com.google.android.finsky.stream.controllers.editorial;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1607g;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.base.C4239i;
import com.google.android.finsky.stream.base.C4253a;
import com.google.android.finsky.stream.base.C4256g;
import com.google.android.finsky.stream.controllers.editorial.view.C4379b;
import com.google.android.finsky.stream.controllers.editorial.view.C4381a;
import com.google.android.finsky.stream.controllers.editorial.view.EditorialDescriptionSection;
import com.google.android.play.utils.UrlSpanUtils;
import com.squareup.leakcanary.C7582R;

public final class C4380a extends C4253a implements C4379b {
    public C4381a f22224E;

    public C4380a(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C4239i c4239i, C2495w c2495w, C3340g c3340g, C1287h c1287h, C1461c c1461c, ao aoVar, ac acVar) {
        super(context, c3748a, c4808a, adVar, c4230c, c1611k, c1556d, c4239i, c2495w, c3340g, c1287h, c1461c, aoVar, acVar);
        this.D = new C4256g();
    }

    protected final int mo4094d() {
        if (this.g.mo3119b() == 3) {
            return C7582R.layout.editorial_app_bucket_entry;
        }
        return C7582R.layout.editorial_nonapp_bucket_entry;
    }

    protected final int mo4151n() {
        return C7582R.layout.editorial_text_description;
    }

    protected final void mo4150b(View view) {
        C4381a c4381a;
        int color;
        EditorialDescriptionSection editorialDescriptionSection = (EditorialDescriptionSection) view;
        if (this.f22224E == null) {
            c4381a = new C4381a();
            Document document = this.g.f14908a;
            color = this.e.getResources().getColor(C7582R.color.white);
            if (document.m14647d(1)) {
                color = C1607g.m9237a(document.aD(), color);
            }
            c4381a.f22233a = document.m14612A();
            c4381a.f22234b = color;
            this.f22224E = c4381a;
        }
        c4381a = this.f22224E;
        editorialDescriptionSection.f22232h = this;
        if (!TextUtils.isEmpty(c4381a.f22233a)) {
            UrlSpanUtils.a(c4381a.f22233a, null, editorialDescriptionSection);
        }
        editorialDescriptionSection.f22226b.setVisibility(8);
        editorialDescriptionSection.f22228d.m13581a(null, c4381a.f22233a, editorialDescriptionSection.f22225a);
        editorialDescriptionSection.f22228d.m13578a();
        editorialDescriptionSection.f22227c.setVisibility(0);
        editorialDescriptionSection.setOnClickListener(editorialDescriptionSection);
        editorialDescriptionSection.f22228d.setBodyClickListener(editorialDescriptionSection);
        color = editorialDescriptionSection.getResources().getColor(C1607g.m9240a(c4381a.f22234b) ? C7582R.color.play_fg_primary : C7582R.color.white);
        editorialDescriptionSection.setBackgroundColor(c4381a.f22234b);
        editorialDescriptionSection.f22228d.m13579a(c4381a.f22234b, color);
        editorialDescriptionSection.f22229e.setTextColor(color);
        editorialDescriptionSection.setVisibility(0);
    }

    protected final int mo4095l() {
        return this.e.getResources().getInteger(C7582R.integer.editorial_bucket_columns);
    }

    protected final int mo4096m() {
        return C7582R.layout.editorials_cluster_row;
    }

    public final void mo1511b(View view, int i) {
        super.mo1511b(view, i);
        if (view instanceof EditorialDescriptionSection) {
            ((EditorialDescriptionSection) view).Z_();
        }
    }

    protected final int mo4097o() {
        return 456;
    }

    public final void mo4183a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri parse = Uri.parse(str);
        intent.setData(parse);
        intent.setPackage(this.e.getPackageName());
        if (this.e.getPackageManager().resolveActivity(intent, 65536) != null) {
            this.f.mo3635a(parse, null, this.i);
            return;
        }
        intent.setPackage(null);
        this.e.startActivity(intent);
    }
}
