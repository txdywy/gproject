package com.google.android.wallet.ui.card;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.android.wallet.p355a.C6489e;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6620d;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6626j;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.bb;
import com.google.android.wallet.ui.common.ci;
import java.util.ArrayList;
import java.util.HashSet;

public class CardImagesView extends RelativeLayout {
    public ImageView[] f33200a;
    public ImageView[] f33201b;
    public View f33202c;
    public C6738d f33203d;
    public int f33204e;
    public int f33205f;
    public int f33206g;
    public boolean f33207h;
    public boolean f33208i;
    public boolean f33209j = true;
    public ad f33210k;
    public boolean f33211l;
    public bb f33212m;

    public CardImagesView(Context context) {
        super(context);
    }

    public CardImagesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m30481a(context, attributeSet);
    }

    public CardImagesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m30481a(context, attributeSet);
    }

    private final void m30481a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6626j.WalletUicCardImagesView);
        this.f33204e = obtainStyledAttributes.getDimensionPixelSize(C6626j.WalletUicCardImagesView_internalUicCardImagesWidth, C6620d.wallet_uic_credit_card_icon_width);
        this.f33205f = obtainStyledAttributes.getDimensionPixelSize(C6626j.WalletUicCardImagesView_internalUicCardImagesHeight, C6620d.wallet_uic_credit_card_icon_height);
        this.f33206g = obtainStyledAttributes.getDimensionPixelSize(C6626j.WalletUicCardImagesView_internalUicSpacingBetweenCardImages, 0);
        this.f33207h = obtainStyledAttributes.getBoolean(C6626j.WalletUicCardImagesView_internalUicCardImagesRightAligned, false);
        this.f33208i = obtainStyledAttributes.getBoolean(C6626j.WalletUicCardImagesView_internalUicAllImagesStaticOnly, false);
        obtainStyledAttributes.recycle();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        if (!this.f33208i) {
            this.f33202c = findViewById(C6622f.unresolved_logo);
        }
    }

    public final void m30485a(ad[] adVarArr, ad[] adVarArr2, boolean z) {
        this.f33200a = m30482a(adVarArr, this.f33204e, this.f33205f, z, false);
        this.f33201b = m30482a(adVarArr2, this.f33204e, this.f33205f, z, true);
        this.f33211l = z;
        if (!this.f33208i) {
            this.f33203d = new C6738d(this.f33200a, this.f33201b, this.f33202c);
        } else if (z) {
            throw new IllegalArgumentException("One card mode cannot be used if allImagesStaticOnly is true.");
        }
    }

    @TargetApi(17)
    private final ImageView[] m30482a(ad[] adVarArr, int i, int i2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList(adVarArr.length);
        HashSet hashSet = new HashSet(adVarArr.length);
        int a = m30483b().m30742a();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{C6617a.uicCardResolvedGenericDrawable});
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        int i3 = -1;
        int i4 = a;
        for (ad adVar : adVarArr) {
            if (!hashSet.contains(adVar.c)) {
                hashSet.add(adVar.c);
                View imageWithCaptionView = new ImageWithCaptionView(getContext());
                imageWithCaptionView.setLayerType(2, null);
                imageWithCaptionView.setId(i4);
                LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
                a = -1;
                if (i3 == -1 && this.f33207h) {
                    a = 21;
                } else if (!(z || z2 || i3 <= 0)) {
                    r.a(layoutParams, this.f33206g);
                    a = this.f33207h ? 16 : 17;
                }
                if (a != -1) {
                    layoutParams.addRule(ci.m30835a(a), i3);
                }
                addView(imageWithCaptionView, layoutParams);
                imageWithCaptionView.m30637a(adVar, C6600l.m29933a(getContext().getApplicationContext()), ((Boolean) C6489e.f32495a.a()).booleanValue());
                imageWithCaptionView.setFadeIn(true);
                imageWithCaptionView.setErrorImageResId(resourceId);
                imageWithCaptionView.setTag(adVar);
                arrayList.add(imageWithCaptionView);
                int i5 = i4;
                i4 = m30483b().m30742a();
                i3 = i5;
            }
        }
        return (ImageView[]) arrayList.toArray(new ImageView[arrayList.size()]);
    }

    private final bb m30483b() {
        if (this.f33212m == null) {
            this.f33212m = bb.m30739c();
        }
        return this.f33212m;
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putParcelable("currentIcon", ParcelableProto.m29885a(this.f33210k));
        bundle.putBoolean("oneCardMode", this.f33211l);
        if (this.f33212m != null) {
            this.f33212m.m30743a(bundle);
        }
        return bundle;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.f33210k = (ad) ParcelableProto.m29887a(bundle, "currentIcon");
            this.f33211l = bundle.getBoolean("oneCardMode");
            this.f33212m = bb.m30738b(bundle);
            super.onRestoreInstanceState(bundle.getParcelable("parentState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f33208i && this.f33209j) {
            int b;
            int i5;
            this.f33209j = false;
            C6738d c6738d = this.f33203d;
            ad adVar = this.f33210k;
            int a = c6738d.m30539a(adVar);
            if (a == -1) {
                b = c6738d.m30541b(adVar);
            } else {
                b = -1;
            }
            float f = (a == -1 && b == -1) ? 1.0f : 0.0f;
            int length = c6738d.f33263a.length;
            for (i5 = 0; i5 < length; i5++) {
                c6738d.f33263a[i5].animate().cancel();
                if (i5 == a) {
                    c6738d.f33263a[i5].setAlpha(1.0f);
                    c6738d.f33263a[i5].setX((float) c6738d.f33263a[0].getLeft());
                } else {
                    c6738d.f33263a[i5].setAlpha(f);
                    c6738d.f33263a[i5].setTranslationX(0.0f);
                }
            }
            i5 = c6738d.f33264b.length;
            for (int i6 = 0; i6 < i5; i6++) {
                c6738d.f33264b[i6].animate().cancel();
                if (i6 == b) {
                    c6738d.f33264b[i6].setAlpha(1.0f);
                } else {
                    c6738d.f33264b[i6].setAlpha(0.0f);
                }
            }
            c6738d.f33266d = adVar;
            if (this.f33211l) {
                m30484a();
            }
        }
    }

    public final void m30484a() {
        if (this.f33208i) {
            throw new IllegalStateException("One card mode cannot be used if allImagesStaticOnly is true.");
        }
        this.f33211l = true;
        if (!this.f33209j) {
            this.f33203d.m30540a();
        }
    }

    public void setCardIcon(ad adVar) {
        if (this.f33208i) {
            throw new IllegalStateException("setCardIcon cannot be used if allImagesStaticOnly is true.");
        }
        this.f33210k = adVar;
        if (!this.f33209j) {
            this.f33203d.m30542c(adVar);
        }
    }
}
