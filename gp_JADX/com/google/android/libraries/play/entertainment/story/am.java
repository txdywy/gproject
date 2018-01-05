package com.google.android.libraries.play.entertainment.story;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.p028a.p029a.C0206f;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ew;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.play.entertainment.C6071d;
import com.google.android.libraries.play.entertainment.C6089g;
import com.google.android.libraries.play.entertainment.C6091h;
import com.google.android.libraries.play.entertainment.p351m.C6116b;

final class am extends aj {
    public final /* synthetic */ Bundle f30388a;
    public final /* synthetic */ al f30389b;

    am(al alVar, Context context, Bundle bundle) {
        this.f30389b = alVar;
        this.f30388a = bundle;
        super(context);
    }

    protected final void m28228c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Parcelable parcelable;
        layoutInflater.inflate(C6091h.fragment_story_flow_content, viewGroup, true);
        this.f30389b.ah = (View) C6116b.m28100a(viewGroup.findViewById(C6089g.pe__loading_indicator));
        this.f30389b.ai = (View) C6116b.m28100a(viewGroup.findViewById(C6089g.pe__error_info));
        this.f30389b.aj = (RecyclerView) C6116b.m28100a((RecyclerView) viewGroup.findViewById(C6089g.pe__panel_list));
        ew linearLayoutManager = new LinearLayoutManager(1, false);
        if (this.f30388a == null) {
            parcelable = null;
        } else {
            parcelable = this.f30388a.getParcelable("listLayoutManagerInstanceState");
        }
        if (parcelable != null) {
            linearLayoutManager.mo728a(parcelable);
        }
        this.f30389b.aj.setLayoutManager(linearLayoutManager);
    }

    protected final boolean m28229l() {
        return true;
    }

    protected final int m28230m() {
        return C0206f.m1066b(this.f.getResources(), C6071d.pe__translucent_status_bar_color, this.f.getTheme());
    }

    protected final int m28231n() {
        return C0206f.m1066b(this.f.getResources(), C6071d.pe__status_bar_underlay_color, this.f.getTheme());
    }
}
