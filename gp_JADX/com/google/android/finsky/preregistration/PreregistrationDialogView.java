package com.google.android.finsky.preregistration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.LinearLayout;
import com.google.android.finsky.at.C1516l;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.detailscomponents.DocImageView;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.image.C1294w;
import com.google.android.play.layout.PlayCardThumbnail;
import com.google.android.play.layout.PlayTextView;
import com.squareup.leakcanary.C7582R;

public class PreregistrationDialogView extends LinearLayout implements C1516l {
    public C1294w f19882a;
    public Document f19883b;
    public AppCompatCheckBox f19884c;
    public OnCheckedChangeListener f19885d;
    public PlayCardThumbnail f19886e;
    public PlayTextView f19887f;

    public PreregistrationDialogView(Context context) {
        super(context);
        ((C1410q) C3947d.m18649a(C1410q.class)).mo1893a(this);
    }

    public PreregistrationDialogView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((C1410q) C3947d.m18649a(C1410q.class)).mo1893a(this);
    }

    @SuppressLint({"NewApi"})
    public PreregistrationDialogView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((C1410q) C3947d.m18649a(C1410q.class)).mo1893a(this);
    }

    protected void onFinishInflate() {
        this.f19884c = (AppCompatCheckBox) findViewById(C7582R.id.notification_opt_in_checkbox);
        this.f19886e = (PlayCardThumbnail) findViewById(C7582R.id.title_thumbnail_frame);
        this.f19887f = (PlayTextView) findViewById(C7582R.id.title_title);
    }

    public Document getDocument() {
        return this.f19883b;
    }

    public final void mo3298a(Bundle bundle) {
        this.f19883b = (Document) bundle.getParcelable("PreregistrationDialogView.document");
        if (this.f19883b == null) {
            FinskyLog.m21669e("Preregistration dialog not passed a document", new Object[0]);
            return;
        }
        if (this.f19884c == null) {
            Context context = getContext();
            this.f19886e.a(this.f19883b.f14885a.f12099f, false);
            int i = this.f19883b.f14885a.f12098e;
            LayoutParams layoutParams = this.f19886e.getLayoutParams();
            layoutParams.width = C1608h.m9259e(context, i);
            layoutParams.height = C1608h.m9261f(context, i);
        } else if (bundle.getBoolean("PreregistrationDialogView.show_opt_in", false)) {
            this.f19884c.setVisibility(0);
            this.f19884c.setChecked(bundle.getBoolean("PreregistrationDialogView.check_checkbox", true));
        } else {
            this.f19884c.setVisibility(8);
        }
        ((DocImageView) this.f19886e.getImageView()).m13584a(this.f19883b, this.f19882a, DocImageView.f13711a);
        if (this.f19887f != null) {
            this.f19887f.setText(this.f19883b.f14885a.f12100g);
            this.f19887f.setSelected(true);
        }
    }

    public Bundle getResult() {
        return null;
    }

    public void setCheckboxStateChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
        this.f19885d = onCheckedChangeListener;
        this.f19884c.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setCheckboxState(boolean z) {
        this.f19884c.setOnCheckedChangeListener(null);
        this.f19884c.setChecked(z);
        this.f19884c.setOnCheckedChangeListener(this.f19885d);
    }

    public final boolean m18622a() {
        return this.f19884c != null && this.f19884c.getVisibility() == 0;
    }
}
