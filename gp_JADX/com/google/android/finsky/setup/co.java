package com.google.android.finsky.setup;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.fr;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.google.android.play.image.FifeImageView;
import com.squareup.leakcanary.C7582R;

final class co extends fr implements OnClickListener {
    public final FifeImageView f20937t;
    public final TextView f20938u;
    public final ImageView f20939v;
    public final Drawable f20940w;
    public final Drawable f20941x;
    public final View f20942y;
    public final /* synthetic */ SetupWizardSelectAppsForDeviceActivity f20943z;

    co(SetupWizardSelectAppsForDeviceActivity setupWizardSelectAppsForDeviceActivity, View view) {
        this.f20943z = setupWizardSelectAppsForDeviceActivity;
        super(view);
        Resources resources = view.getResources();
        view.setOnClickListener(this);
        this.f20937t = (FifeImageView) view.findViewById(C7582R.id.image);
        this.f20938u = (TextView) view.findViewById(C7582R.id.title);
        this.f20939v = (ImageView) view.findViewById(C7582R.id.expander);
        this.f20942y = view.findViewById(C7582R.id.optional_spacer);
        view.findViewById(C7582R.id.checkbox).setVisibility(8);
        this.f20937t.setImageDrawable(C0722q.m4782a(resources, (int) C7582R.raw.ic_apps_black_24dp, null));
        this.f20937t.setBitmapTransformation(null);
        this.f20940w = C0722q.m4782a(resources, (int) C7582R.raw.ic_expand_less_black_24dp, null);
        this.f20941x = C0722q.m4782a(resources, (int) C7582R.raw.ic_expand_more_black_24dp, null);
    }

    public final void onClick(View view) {
        this.f20943z.f20645y = !this.f20943z.f20645y;
        this.f20943z.f20642v.f3433a.m3638b();
    }
}
