package com.google.android.finsky.billing.gifting;

import android.content.res.Resources;
import android.support.v4.view.ai;
import android.support.v7.widget.fr;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.recyclerview.C1137h;
import com.google.android.finsky.recyclerview.C1155g;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.nano.ds;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;

public final class C1839e extends C1137h {
    public final Resources f9453c;
    public final LayoutInflater f9454d;
    public final C1840i f9455e;
    public final ad f9456f;
    public final C2495w f9457g;
    public final ds f9458h;
    public final ArrayList f9459i = new ArrayList();
    public final int f9460j;
    public final int f9461k;
    public final int f9462l;
    public final C1611k f9463m;

    public C1839e(Resources resources, LayoutInflater layoutInflater, C1840i c1840i, ad adVar, ds dsVar, int i, int i2, C2495w c2495w, C1611k c1611k) {
        int i3 = 0;
        this.f9453c = resources;
        this.f9454d = layoutInflater;
        this.f9455e = c1840i;
        this.f9456f = adVar;
        this.f9457g = c2495w;
        this.f9458h = dsVar;
        this.f9460j = i;
        this.f9461k = i2;
        this.f9459i.add(Integer.valueOf(0));
        while (i3 < this.f9461k) {
            this.f9459i.add(Integer.valueOf(1));
            i3++;
        }
        this.f9459i.add(Integer.valueOf(2));
        this.f9462l = this.f9459i.indexOf(Integer.valueOf(1));
        this.f9463m = c1611k;
    }

    public final int mo1039a() {
        return this.f9459i.size();
    }

    public final int mo1040a(int i) {
        return ((Integer) this.f9459i.get(i)).intValue();
    }

    public final /* synthetic */ void mo1042a(fr frVar, int i) {
        C1155g c1155g = (C1155g) frVar;
        int i2 = c1155g.f3216f;
        View view = c1155g.a;
        switch (i2) {
            case 0:
                PlayCreditGiftingHeader playCreditGiftingHeader = (PlayCreditGiftingHeader) view;
                CharSequence charSequence = this.f9458h.b;
                String str = this.f9458h.c;
                bd bdVar = this.f9458h.d;
                playCreditGiftingHeader.f9430c.setText(charSequence);
                playCreditGiftingHeader.f9431d.setText(Html.fromHtml(str));
                playCreditGiftingHeader.f9432e.setOnLoadedListener(playCreditGiftingHeader);
                playCreditGiftingHeader.f9428a.m9288a(playCreditGiftingHeader.f9432e, bdVar.f11860f, bdVar.f11863i);
                return;
            case 1:
                PlayCreditGiftingRow playCreditGiftingRow = (PlayCreditGiftingRow) view;
                cv[] cvVarArr = this.f9458h.f;
                int i3 = i - this.f9462l;
                C1840i c1840i = this.f9455e;
                ad adVar = this.f9456f;
                C2495w c2495w = this.f9457g;
                playCreditGiftingRow.f9435b = c1840i;
                int i4 = playCreditGiftingRow.f9436c * i3;
                for (i2 = 0; i2 < playCreditGiftingRow.f9436c; i2++) {
                    View childAt = playCreditGiftingRow.getChildAt(i2);
                    if (i4 < cvVarArr.length) {
                        int i5 = i4 + 1;
                        cv cvVar = cvVarArr[i4];
                        bd bdVar2 = cvVar.f12109p[0];
                        playCreditGiftingRow.f9434a.m9288a(playCreditGiftingRow.f9437d[i2], bdVar2.f11860f, bdVar2.f11863i);
                        playCreditGiftingRow.f9438e[i2].setText(cvVar.f12107n[0].f11917g);
                        C2473o c2473o = new C2473o(500, cvVar.f12087D, adVar);
                        c2473o.mo2914a();
                        childAt.setOnClickListener(new C1843h(playCreditGiftingRow, cvVar, c2495w, c2473o));
                        i4 = i5;
                    } else {
                        childAt.setVisibility(4);
                    }
                }
                if (i3 == 0) {
                    LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.setMargins(0, playCreditGiftingRow.getResources().getDimensionPixelOffset(C7582R.dimen.play_credit_first_row_top_margin), 0, 0);
                    playCreditGiftingRow.setLayoutParams(layoutParams);
                    return;
                }
                return;
            case 2:
                PlayCreditGiftingFooter playCreditGiftingFooter = (PlayCreditGiftingFooter) view;
                playCreditGiftingFooter.setText(Html.fromHtml(this.f9458h.e));
                playCreditGiftingFooter.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            default:
                throw new IllegalStateException("Unknown type for onBindViewHolder " + i2);
        }
    }

    public final /* synthetic */ fr mo1041a(ViewGroup viewGroup, int i) {
        View inflate;
        switch (i) {
            case 0:
                inflate = this.f9454d.inflate(C7582R.layout.play_credit_gifting_header, viewGroup, false);
                inflate.setId(C7582R.id.play_header_spacer);
                break;
            case 1:
                inflate = this.f9454d.inflate(C7582R.layout.play_credit_gifting_row, viewGroup, false);
                int a = this.f9463m.m9275a(this.f9453c);
                PlayCreditGiftingRow playCreditGiftingRow = (PlayCreditGiftingRow) inflate;
                LayoutInflater layoutInflater = this.f9454d;
                int i2 = this.f9460j;
                playCreditGiftingRow.f9436c = i2;
                playCreditGiftingRow.f9437d = new FifeImageView[i2];
                playCreditGiftingRow.f9438e = new TextView[i2];
                ai.m1823a(playCreditGiftingRow, a, 0, a, 0);
                playCreditGiftingRow.removeAllViews();
                for (int i3 = 0; i3 < i2; i3++) {
                    View inflate2 = layoutInflater.inflate(C7582R.layout.play_credit_gifting_card, playCreditGiftingRow, false);
                    playCreditGiftingRow.addView(inflate2);
                    playCreditGiftingRow.f9437d[i3] = (FifeImageView) inflate2.findViewById(C7582R.id.image);
                    playCreditGiftingRow.f9438e[i3] = (TextView) inflate2.findViewById(C7582R.id.price);
                }
                break;
            case 2:
                inflate = this.f9454d.inflate(C7582R.layout.play_credit_gifting_footer, viewGroup, false);
                break;
            default:
                throw new IllegalStateException("Unknown type for onCreateViewHolder " + i);
        }
        return new C1155g(inflate);
    }
}
