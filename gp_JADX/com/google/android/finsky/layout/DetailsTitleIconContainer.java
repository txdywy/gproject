package com.google.android.finsky.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.detailspage.TextModule.DetailsIconDescription;
import com.google.android.finsky.detailspage.gm;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public class DetailsTitleIconContainer extends LinearLayout implements gm {
    public LinearLayout f18134a;
    public LinearLayout f18135b;

    public DetailsTitleIconContainer(Context context) {
        this(context, null);
    }

    public DetailsTitleIconContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18134a = (LinearLayout) findViewById(C7582R.id.badge_left);
        this.f18135b = (LinearLayout) findViewById(C7582R.id.badge_right);
        findViewById(C7582R.id.details_title_icon_separator);
    }

    public final void mo3556a(List list) {
        if (list.size() == 0) {
            setVisibility(8);
            return;
        }
        setVisibility(0);
        m17283a((DetailsIconDescription) list.get(0), this.f18134a);
        if (list.size() > 1) {
            m17283a((DetailsIconDescription) list.get(1), this.f18135b);
        } else {
            this.f18135b.setVisibility(8);
        }
    }

    private static void m17283a(DetailsIconDescription detailsIconDescription, View view) {
        FifeImageView fifeImageView = (FifeImageView) view.findViewById(C7582R.id.badge_icon);
        TextView textView = (TextView) view.findViewById(C7582R.id.icon_title);
        bd bdVar = detailsIconDescription.f14121a;
        C1473m.f7980a.ar().m9288a(fifeImageView, bdVar.f11860f, bdVar.f11863i);
        fifeImageView.setContentDescription(detailsIconDescription.f14122b);
        textView.setText(detailsIconDescription.f14122b);
        view.setVisibility(0);
    }
}
