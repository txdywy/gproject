package com.google.android.finsky.setup;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.caverock.androidsvg.C0722q;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.finsky.dfe.nano.fo;
import com.squareup.leakcanary.C7582R;
import java.util.concurrent.TimeUnit;

final class cr implements OnClickListener {
    public final View f20946a;
    public final FifeImageView f20947b = ((FifeImageView) this.f20946a.findViewById(C7582R.id.image));
    public final TextView f20948c = ((TextView) this.f20946a.findViewById(C7582R.id.title));
    public final TextView f20949d = ((TextView) this.f20946a.findViewById(C7582R.id.subtitle));
    public final fo f20950e;
    public final /* synthetic */ SetupWizardSelectDeviceActivity f20951f;

    cr(SetupWizardSelectDeviceActivity setupWizardSelectDeviceActivity, View view, fo foVar) {
        this.f20951f = setupWizardSelectDeviceActivity;
        this.f20946a = view;
        this.f20946a.setOnClickListener(this);
        this.f20950e = foVar;
        if (foVar == null) {
            this.f20947b.setImageDrawable(C0722q.m4782a(this.f20946a.getResources(), (int) C7582R.raw.ic_redo_black_24dp, null));
            this.f20947b.setBitmapTransformation(null);
            this.f20948c.setText(C7582R.string.setup_wizard_setup_as_new_option);
            this.f20949d.setText(C7582R.string.setup_wizard_setup_as_new_option_subtitle);
            return;
        }
        CharSequence string;
        this.f20947b.setVisibility(8);
        this.f20948c.setText(foVar.d);
        TextView textView = this.f20949d;
        Context context = this.f20946a.getContext();
        long toDays = TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - foVar.f);
        Resources resources = context.getResources();
        if (toDays == 0) {
            string = resources.getString(C7582R.string.setup_wizard_device_last_used_today_message);
        } else {
            string = resources.getQuantityString(C7582R.plurals.setup_wizard_device_last_used_message, (int) toDays, new Object[]{Long.valueOf(toDays)});
        }
        textView.setText(string);
    }

    public final void onClick(View view) {
        Activity activity = this.f20951f;
        fo foVar = this.f20950e;
        if (foVar == null) {
            activity.setResult(-1);
            activity.finish();
            return;
        }
        activity.f20648o = foVar;
        Intent a = SetupWizardSelectAppsForDeviceActivity.m19117a(activity.f20649p, activity.f20648o);
        a.putExtra("SetupWizardSelectDeviceActivity.setup_params", activity.f20650q);
        cs.m19401a(activity, false);
        activity.startActivityForResult(a, 1);
    }
}
