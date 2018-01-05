package com.google.android.finsky.playcard;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.play.layout.PlayCardViewSmall;
import com.google.android.play.p203b.C3918i;

public class PlayCardViewBundleItemSmall extends PlayCardViewSmall implements cc {
    public int f19478a;

    public PlayCardViewBundleItemSmall(Context context) {
        super(context);
    }

    public PlayCardViewBundleItemSmall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setCardType(int i) {
        this.f19478a = i;
    }

    public int getCardType() {
        return this.f19478a;
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
