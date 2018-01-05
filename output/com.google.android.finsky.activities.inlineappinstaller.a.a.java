package com.google.android.finsky.activities.inlineappinstaller.a;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.activities.inlineappinstaller.a;
import com.google.android.finsky.activities.inlineappinstaller.c;
import com.google.android.finsky.av.a;
import com.google.android.finsky.bg.a;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.billing.lightpurchase.d.a;
import com.google.android.finsky.billing.lightpurchase.d.h;
import com.google.android.finsky.br.a;
import com.google.android.finsky.cv.a.cv;
import com.google.android.finsky.d.j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.installqueue.g;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import java.util.List;

public final class com.google.android.finsky.activities.inlineappinstaller.a.a extends com.google.android.finsky.billing.lightpurchase.d.h implements View$OnClickListener, com.google.android.finsky.activities.inlineappinstaller.e
{

    public final com.google.wireless.android.a.a.a.a.ce a;
    public TextView b;
    public TextView c;
    public Document d;
    public ImageView e;
    public ProgressBar f;
    public View g;
    public com.google.android.finsky.activities.inlineappinstaller.a.g h;

    a() {
        com.google.android.finsky.billing.lightpurchase.d.h();
        this.a = com.google.android.finsky.d.j.a(5105);
        this.h = com.google.android.finsky.m.a.aw();
    }

    private final String Y() {
        return this.d.a.d;
    }

    public final boolean W() {
        return 0;
    }

    public final void X() {
        FinskyLog.e("onContinueButtonClicked clicked", new Object[0]);
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v1 = 1;
        this.d = (Document)this.q.getParcelable("appDoc");
        this.g = p0.inflate(2130968998, p1, 0);
        v4 = new Object[1];
        v4[0] = this.d.a.g;
        ((TextView)this.g.findViewById(2131755114)).setText(this.a(2131952322, v4));
        this.f = (ProgressBar)this.g.findViewById(2131756069);
        this.e = (ImageView)this.g.findViewById(2131755606);
        this.e.setOnClickListener(this);
        this.b = (TextView)this.g.findViewById(2131755607);
        this.c = (TextView)this.g.findViewById(2131756068);
        this.h.a(this.d, this.g);
        v0 = (com.google.android.finsky.activities.inlineappinstaller.a)this.aa();
        if (v0.a.e == -1) {
            v4 = com.google.android.finsky.m.a.bw().b(this.d.a.d);
            if (v4 != 2) {
                if (v4 == 3)
                    v1 = 4;
                else {
                    if (com.google.android.finsky.m.a.bn().a(v0.g(), new Document(v0.d), v0.aw))
                        v1 = 0;
                    if (v1 != 0)
                        v1 = 6;
                    else
                        v1 = v0.a.e;
                }
            }
        }
        else
            v1 = v0.a.e;
        if (v1 != -1)
            this.a(v1);
        v0.a.f.add(this);
        return this.g;
    }

    public final String a(Resources p0) {
        return 0;
    }

    public final void a(int p0) {
        switch (p0) {
            case 0:
                com.google.android.finsky.m.a.bV();
                com.google.android.finsky.av.a.a(this.g(), com.google.android.finsky.m.a.bw().c(this.Y()), this.c, this.b, this.f);
                if (p0 == 1)
                    v0 = 0;
                else
                    v0 = 8;
                this.e.setVisibility(v0);
                break;
            case 1:
                com.google.android.finsky.m.a.bV();
                com.google.android.finsky.av.a.a(this.g(), com.google.android.finsky.m.a.bw().c(this.Y()), this.c, this.b, this.f);
                if (p0 == 1)
                    v0 = 0;
                else
                    v0 = 8;
                this.e.setVisibility(v0);
                break;
            case 2:
                this.c.setText(2131951806);
                break;
            case 3:
                if (p0 == 5)
                    v1 = 2131952312;
                else
                    v1 = 2131952129;
                this.c.setText(v1);
                this.f.setVisibility(4);
                ((com.google.android.finsky.activities.inlineappinstaller.a)this.aa()).a.a(this.c(v1));
                break;
            case 4:
                com.google.android.finsky.m.a.bV();
                com.google.android.finsky.av.a.a(this.g(), com.google.android.finsky.m.a.bw().c(this.Y()), this.c, this.b, this.f);
                if (p0 == 1)
                    v0 = 0;
                else
                    v0 = 8;
                this.e.setVisibility(v0);
                break;
            case 5:
                if (p0 == 5)
                    v1 = 2131952312;
                else
                    v1 = 2131952129;
                this.c.setText(v1);
                this.f.setVisibility(4);
                ((com.google.android.finsky.activities.inlineappinstaller.a)this.aa()).a.a(this.c(v1));
                break;
            case 6:
                v0 = ((com.google.android.finsky.activities.inlineappinstaller.a)this.aa()).a;
                if (v0.l != 7) {
                    v4 = new Object[1];
                    v4[0] = Integer.valueOf(v0.l);
                    FinskyLog.e("switchToDownloadStep() called in state %d", v4);
                }
                v0.b(8, 0);
                break;
            case 7:
                v2 = new Object[2];
                v2[0] = this.Y();
                v2[1] = Integer.valueOf(p0);
                FinskyLog.e("Install package event %s: unexpected %d", v2);
                break;
            case 8:
                break;
            case 9:
                v2 = new Object[2];
                v2[0] = this.Y();
                v2[1] = Integer.valueOf(p0);
                FinskyLog.e("Install package event %s: unexpected %d", v2);
                break;
            case 10:
                v2 = new Object[2];
                v2[0] = this.Y();
                v2[1] = Integer.valueOf(p0);
                FinskyLog.e("Install package event %s: unexpected %d", v2);
                break;
            case 11:
                com.google.android.finsky.m.a.bV();
                com.google.android.finsky.av.a.a(this.g(), com.google.android.finsky.m.a.bw().c(this.Y()), this.c, this.b, this.f);
                if (p0 == 1)
                    v0 = 0;
                else
                    v0 = 8;
                this.e.setVisibility(v0);
                break;
            default:
                v2 = new Object[2];
                v2[0] = this.Y();
                v2[1] = Integer.valueOf(p0);
                FinskyLog.e("Install package event %s: unexpected %d", v2);
                break;
        }
    }

    public final void d() {
        ((com.google.android.finsky.activities.inlineappinstaller.a)this.aa()).a.f.remove(this);
        super.d();
    }

    public final com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.a;
    }

    public final void onClick(View p0) {
        if (p0 == this.e) {
            com.google.android.finsky.m.a.dc().a(2917, 0, this);
            if (this.d.a.d != 0)
                com.google.android.finsky.m.a.o().o(this.d.a.d);
            ((com.google.android.finsky.activities.inlineappinstaller.a)this.aa()).a(5106, this);
            ((com.google.android.finsky.activities.inlineappinstaller.a)this.aa()).a(0);
        }
    }

    public final void u() {
        super.u();
        com.google.android.finsky.bg.a.a(this.g(), this.c(2131952322), this.g, 0);
    }

}
