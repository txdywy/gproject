package com.google.android.wallet.ui.card;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import com.google.android.wallet.p383e.C6625i;
import com.google.android.wallet.ui.common.ci;
import java.util.Arrays;

public class CardLogoGridView extends LinearLayout implements OnClickListener {
    public Button f33213a;
    public LinearLayout f33214b;

    public CardLogoGridView(Context context) {
        super(context);
    }

    public CardLogoGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardLogoGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public CardLogoGridView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f33213a = (Button) findViewById(C6622f.card_logo_grid_toggle);
        this.f33214b = (LinearLayout) findViewById(C6622f.card_logo_grid);
        this.f33213a.setOnClickListener(this);
    }

    public void setLogos(ad[] adVarArr) {
        int length = adVarArr.length;
        int i = 0;
        while (i < length) {
            int min = Math.min(i + 5, length);
            CardImagesView cardImagesView = (CardImagesView) LayoutInflater.from(getContext()).inflate(C6623g.view_card_logo_grid_row, this.f33214b, false);
            cardImagesView.m30485a((ad[]) Arrays.copyOfRange(adVarArr, i, min, ad[].class), ad.a(), false);
            this.f33214b.addView(cardImagesView);
            i = min;
        }
    }

    public void onClick(View view) {
        if (view != this.f33213a) {
            return;
        }
        if (this.f33214b.getVisibility() == 0) {
            ci.m30856a(this.f33214b, 0, 0);
            this.f33213a.setText(getContext().getString(C6625i.wallet_uic_view_card_logos));
            return;
        }
        ci.m30855a(this.f33214b, 0);
        this.f33213a.setText(getContext().getString(C6625i.wallet_uic_hide_card_logos));
    }

    public Parcelable onSaveInstanceState() {
        Parcelable bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putBoolean("cardLogoGridVisible", this.f33214b.getVisibility() == 0);
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            if (bundle.getBoolean("cardLogoGridVisible")) {
                this.f33214b.setVisibility(0);
                this.f33213a.setText(getContext().getString(C6625i.wallet_uic_hide_card_logos));
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }
}
