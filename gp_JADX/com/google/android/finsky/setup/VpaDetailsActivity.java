package com.google.android.finsky.setup;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.p028a.C0221j;
import android.text.Html;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.o;
import com.google.android.play.utils.k;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import com.google.wireless.android.finsky.dfe.nano.cc;
import com.squareup.leakcanary.C7582R;
import java.util.Collections;
import java.util.List;

@TargetApi(21)
public class VpaDetailsActivity extends Activity {
    public final OnCheckedChangeListener f20656a = new cw(this);
    public boolean f20657b;
    public int f20658c;
    public Handler f20659d = new Handler();
    public C0221j f20660e;
    public View f20661f;
    public FifeImageView f20662g;
    public TextView f20663h;
    public TextView f20664i;
    public CheckBox f20665j;
    public View f20666k;
    public TextView f20667l;
    public View f20668m;
    public TextView f20669n;
    public TextView f20670o;
    public final FifeImageView[] f20671p = new FifeImageView[3];
    public PreloadWrapper f20672q;
    public int f20673r;

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
    }

    public AssetManager getAssets() {
        return C6331c.m28986b(this);
    }

    public Resources getResources() {
        return C6331c.m28981a(this);
    }

    public Theme getTheme() {
        return C6331c.m28987c(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    protected void onCreate(Bundle bundle) {
        int i;
        String str;
        boolean z = false;
        super.onCreate(bundle);
        this.f20660e = C0221j.m1129a((Context) this);
        this.f20661f = LayoutInflater.from(this).inflate(C7582R.layout.setup_wizard_preload_details, null);
        setContentView(this.f20661f);
        this.f20658c = getResources().getDimensionPixelSize(C7582R.dimen.setup_wizard_card_width);
        this.f20657b = this.f20658c > 0;
        Window window = getWindow();
        if (this.f20657b) {
            i = this.f20658c;
        } else {
            i = -1;
        }
        window.setLayout(i, -2);
        this.f20662g = (FifeImageView) this.f20661f.findViewById(C7582R.id.pai_details_icon);
        this.f20663h = (TextView) this.f20661f.findViewById(C7582R.id.pai_details_title);
        this.f20664i = (TextView) this.f20661f.findViewById(C7582R.id.pai_details_byline);
        this.f20665j = (CheckBox) this.f20661f.findViewById(C7582R.id.pai_details_checkbox);
        this.f20666k = this.f20661f.findViewById(C7582R.id.pai_details_star_rating_container);
        this.f20667l = (TextView) this.f20661f.findViewById(C7582R.id.pai_details_star_rating);
        this.f20668m = this.f20661f.findViewById(C7582R.id.pai_details_rating_count_container);
        this.f20669n = (TextView) this.f20661f.findViewById(C7582R.id.pai_details_rating_count);
        this.f20670o = (TextView) this.f20661f.findViewById(C7582R.id.pai_details_description);
        this.f20671p[0] = (FifeImageView) this.f20661f.findViewById(C7582R.id.pai_details_screenshot1);
        this.f20671p[1] = (FifeImageView) this.f20661f.findViewById(C7582R.id.pai_details_screenshot2);
        this.f20671p[2] = (FifeImageView) this.f20661f.findViewById(C7582R.id.pai_details_screenshot3);
        i = k.b(this) ? 3 : 4;
        this.f20663h.setTextDirection(i);
        this.f20664i.setTextDirection(i);
        this.f20663h.setTextDirection(i);
        Intent intent = getIntent();
        this.f20672q = (PreloadWrapper) intent.getParcelableExtra("VpaDetailsActivity.preloadWrapper");
        this.f20673r = intent.getIntExtra("VpaDetailsActivity.preloadIndex", -1);
        if (this.f20672q.f20562a.h) {
            this.f20665j.setEnabled(false);
            this.f20665j.setChecked(true);
        } else {
            this.f20665j.setEnabled(true);
            this.f20665j.setOnCheckedChangeListener(this.f20656a);
            this.f20665j.setChecked(intent.getBooleanExtra("VpaDetailsActivity.isSelected", false));
        }
        Resources resources = getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C7582R.dimen.setup_wizard_app_details_screenshot_start_margin);
        i = getResources().getDimensionPixelOffset(C7582R.dimen.setup_wizard_app_details_overlay_margin) * 2;
        if (this.f20657b) {
            i = this.f20658c - i;
        } else {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            i = displayMetrics.widthPixels - i;
        }
        dimensionPixelOffset = (i - (dimensionPixelOffset * 2)) / 3;
        int dimensionPixelOffset2 = (int) (((float) dimensionPixelOffset) / (((float) resources.getDimensionPixelOffset(C7582R.dimen.setup_wizard_app_details_screenshot_width)) / ((float) resources.getDimensionPixelOffset(C7582R.dimen.setup_wizard_app_details_screenshot_height))));
        for (i = 0; i < 3; i++) {
            LayoutParams layoutParams = this.f20671p[i].getLayoutParams();
            layoutParams.width = dimensionPixelOffset;
            layoutParams.height = dimensionPixelOffset2;
            this.f20671p[i].setLayoutParams(layoutParams);
        }
        Document document = this.f20672q.f20563b;
        bd aj = document.aj();
        if (aj != null) {
            C1473m.f7980a.ar().m9288a(this.f20662g, aj.f11860f, aj.f11863i);
        }
        this.f20663h.setText(document.f14885a.f12100g);
        TextView textView = this.f20664i;
        String formatFileSize = Formatter.formatFileSize(this, this.f20672q.f20562a.k.f12311c);
        textView.setText(getString(C7582R.string.setup_wizard_vpa_details_byline, new Object[]{this.f20672q.f20563b.f14885a.f12102i, formatFileSize}));
        cc ccVar = this.f20672q.f20562a.o;
        if (ccVar != null) {
            this.f20667l.setText(o.a(ccVar.j));
            this.f20669n.setText(ccVar.c);
            this.f20666k.setVisibility(0);
            this.f20668m.setVisibility(0);
        } else {
            this.f20666k.setVisibility(8);
            this.f20668m.setVisibility(8);
        }
        TextView textView2 = this.f20670o;
        Document document2 = this.f20672q.f20563b;
        if ((document2.f14885a.f12095b & 512) != 0) {
            z = true;
        }
        if (z) {
            str = document2.f14885a.f12105l;
        } else {
            str = document2.m14612A().toString();
        }
        textView2.setText(Html.fromHtml(str).toString());
        List c = document.ak() ? document.m14644c(1) : Collections.emptyList();
        this.f20659d.post(new cx(this, Math.min(c.size(), 3), c));
    }
}
