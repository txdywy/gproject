package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.play.layout.PlayCardViewMedium;
import com.google.android.play.p203b.C3918i;

public class PlayCardViewBundleItemMedium extends PlayCardViewMedium implements cc {
    public int f19477a;

    public PlayCardViewBundleItemMedium(Context context) {
        super(context);
    }

    public PlayCardViewBundleItemMedium(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setCardType(int i) {
        this.f19477a = i;
    }

    public int getCardType() {
        return this.f19477a;
    }

    public final void mo3847a() {
        if (!this.T && this.ah != null) {
            this.ah.setVisibility(8);
        }
    }

    public C3918i getCardViewGroupDelegate() {
        return C3919s.f19853a;
    }
}
