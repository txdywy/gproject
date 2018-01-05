package com.google.android.finsky.activities.inlineappinstaller.p119a;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.inlineappinstaller.C1077e;
import com.google.android.finsky.activities.inlineappinstaller.C1088a;
import com.google.android.finsky.av.C1527a;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.lightpurchase.p118d.C1076h;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class C1078a extends C1076h implements OnClickListener, C1077e {
    public final ce f6915a = C2482j.m13283a(5105);
    public TextView f6916b;
    public TextView f6917c;
    public Document f6918d;
    public ImageView f6919e;
    public ProgressBar f6920f;
    public View f6921g;
    public C1084g f6922h = C1473m.f7980a.aw();

    public final boolean mo968W() {
        return false;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 1;
        this.f6918d = (Document) this.f760q.getParcelable("appDoc");
        this.f6921g = layoutInflater.inflate(C7582R.layout.inline_app_installer_download_step, viewGroup, false);
        ((TextView) this.f6921g.findViewById(C7582R.id.title)).setText(m572a((int) C7582R.string.installing_app, this.f6918d.f14885a.f12100g));
        this.f6920f = (ProgressBar) this.f6921g.findViewById(C7582R.id.download_progress);
        this.f6919e = (ImageView) this.f6921g.findViewById(C7582R.id.cancel_download);
        this.f6919e.setOnClickListener(this);
        this.f6916b = (TextView) this.f6921g.findViewById(C7582R.id.downloading_percentage);
        this.f6917c = (TextView) this.f6921g.findViewById(C7582R.id.status);
        this.f6922h.m6725a(this.f6918d, this.f6921g);
        C1088a c1088a = (C1088a) aa();
        int i2 = c1088a.f6940a.f6953e;
        if (i2 == -1) {
            int b = C1473m.f7980a.bw().mo3482b(this.f6918d.f14885a.f12097d);
            if (b != 2) {
                if (b == 3) {
                    i = 4;
                } else {
                    if (C1473m.f7980a.bn().mo2701a(c1088a.m601g(), new Document(c1088a.f6943d), c1088a.aw)) {
                        i = 0;
                    }
                    if (i != 0) {
                        i = 6;
                    }
                }
            }
            if (i != -1) {
                mo1407a(i);
            }
            c1088a.f6940a.f6954f.add(this);
            return this.f6921g;
        }
        i = i2;
        if (i != -1) {
            mo1407a(i);
        }
        c1088a.f6940a.f6954f.add(this);
        return this.f6921g;
    }

    public final void mo979u() {
        super.mo979u();
        C1601a.m9199a(m601g(), m592c((int) C7582R.string.installing_app), this.f6921g, false);
    }

    public final void mo138d() {
        ((C1088a) aa()).f6940a.f6954f.remove(this);
        super.mo138d();
    }

    public final String mo1406a(Resources resources) {
        return null;
    }

    public final void mo1405X() {
        FinskyLog.m21669e("onContinueButtonClicked clicked", new Object[0]);
    }

    public final ce getPlayStoreUiElement() {
        return this.f6915a;
    }

    public final void onClick(View view) {
        if (view == this.f6919e) {
            C1473m.f7980a.dc().m13325a(2917, null, (ad) this);
            String str = this.f6918d.f14885a.f12097d;
            if (str != null) {
                C1473m.f7980a.mo2256o().mo3461o(str);
            }
            ((C1088a) aa()).mo1408a(5106, (ad) this);
            ((C1088a) aa()).m6752a(false);
        }
    }

    private final String m6701Y() {
        return this.f6918d.f14885a.f12097d;
    }

    public final void mo1407a(int i) {
        switch (i) {
            case 0:
            case 1:
            case 4:
            case 11:
                int i2;
                C3371p c = C1473m.f7980a.bw().mo3485c(m6701Y());
                C1473m.f7980a.bV();
                C1527a.m8947a(m601g(), c, this.f6917c, this.f6916b, this.f6920f);
                ImageView imageView = this.f6919e;
                if (i == 1) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                imageView.setVisibility(i2);
                return;
            case 2:
                this.f6917c.setText(C7582R.string.canceling_download);
                return;
            case 3:
            case 5:
                int i3 = i == 5 ? C7582R.string.install_failed_title : C7582R.string.error_while_downloading_title;
                this.f6917c.setText(i3);
                this.f6920f.setVisibility(4);
                ((C1088a) aa()).f6940a.m6765a(m592c(i3));
                return;
            case 6:
                C1089s c1089s = ((C1088a) aa()).f6940a;
                if (c1089s.f6948l != 7) {
                    FinskyLog.m21669e("switchToDownloadStep() called in state %d", Integer.valueOf(c1089s.f6948l));
                }
                c1089s.m6758b(8, 0);
                return;
            case 8:
                return;
            default:
                FinskyLog.m21669e("Install package event %s: unexpected %d", m6701Y(), Integer.valueOf(i));
                return;
        }
    }
}
