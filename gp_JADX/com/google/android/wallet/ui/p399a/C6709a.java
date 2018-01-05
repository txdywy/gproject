package com.google.android.wallet.ui.p399a;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.a.a.a.a.b.a.a.c.b.a.ad;
import com.google.a.a.a.a.b.a.a.f.h;
import com.google.a.a.a.a.b.a.c.g;
import com.google.android.wallet.analytics.C6506n;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.ui.common.InfoMessageView;
import com.google.android.wallet.ui.common.au;
import com.google.android.wallet.ui.expander.C6811c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class C6709a extends au {
    public InfoMessageView f33081a;
    public final C6811c f33082b = new C6811c();
    public final C6506n f33083c = new C6506n(1700);

    protected final View mo5479c(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = this.bd.obtainStyledAttributes(new int[]{C6617a.internalUicVerifyAssociationRootLayout});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        if (resourceId == -1) {
            throw new IllegalArgumentException("Attribute internalUicVerifyAssociationRootLayout must be defined.");
        }
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(resourceId, viewGroup, false);
        this.f33081a = (InfoMessageView) viewGroup2.findViewById(C6622f.required_message_text);
        if (((ad) this.aD).j != null) {
            this.f33081a.setVisibility(0);
            this.f33081a.setParentUiNode(this);
            this.f33081a.setUrlClickListener(ap());
            this.f33081a.setInfoMessage(((ad) this.aD).j.c);
        }
        return viewGroup2;
    }

    public final boolean mo5535a(g gVar) {
        return false;
    }

    public final void mo5533W() {
        if (this.f33081a != null) {
            this.f33081a.setEnabled(this.aH);
        }
    }

    public final boolean mo5534X() {
        return true;
    }

    public final ArrayList aa() {
        return new ArrayList();
    }

    public final C6506n getUiElement() {
        return this.f33083c;
    }

    public final List getChildren() {
        if (this.f33081a.getVisibility() == 0) {
            return Collections.singletonList(this.f33081a);
        }
        return null;
    }

    protected final h mo5521Z() {
        ao();
        return ((ad) this.aD).a;
    }

    public final boolean ae() {
        return (this.f33081a.f32901c || this.f33081a.f32902d) ? false : true;
    }

    public final void af() {
        this.f33081a.m30180a(true);
    }

    public final String ag() {
        return this.f33081a.getExpandLabel();
    }

    public final C6811c getExpandable() {
        return this.f33082b;
    }
}
