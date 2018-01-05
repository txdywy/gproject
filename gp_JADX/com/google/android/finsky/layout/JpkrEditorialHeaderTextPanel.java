package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1607g;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.be;
import com.google.android.play.layout.PlayTextView;
import com.squareup.leakcanary.C7582R;

public class JpkrEditorialHeaderTextPanel extends LinearLayout implements be {
    public PlayTextView f18250a;
    public PlayTextView f18251b;
    public PlayTextView f18252c;
    public boolean f18253d;

    public JpkrEditorialHeaderTextPanel(Context context) {
        super(context);
    }

    public JpkrEditorialHeaderTextPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18250a = (PlayTextView) findViewById(C7582R.id.header_title);
        this.f18251b = (PlayTextView) findViewById(C7582R.id.header_update_time);
        this.f18252c = (PlayTextView) findViewById(C7582R.id.header_details);
        int max = Math.max(C1473m.f7980a.av().m9275a(getResources()), getResources().getDimensionPixelSize(C7582R.dimen.jpkr_editorial_header_min_xpadding));
        setPadding(max, getPaddingTop(), max, getPaddingBottom());
    }

    static void m17322a(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(str);
        textView.setVisibility(0);
    }

    final void m17323a(int i) {
        this.f18250a.setTextColor(i);
        this.f18251b.setTextColor(i);
        this.f18252c.setTextColor(i);
    }

    public final void m17325a(FifeImageView fifeImageView, Bitmap bitmap) {
        if (!this.f18253d) {
            int pixel = Bitmap.createScaledBitmap(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), Math.min(20, bitmap.getHeight())), 1, 1, false).getPixel(0, 0);
            setBackgroundColor(pixel);
            Resources resources = getResources();
            if (C1607g.m9240a(pixel)) {
                pixel = C7582R.color.play_banner_dark_fg;
            } else {
                pixel = C7582R.color.play_banner_light_fg;
            }
            m17323a(resources.getColor(pixel));
        }
    }

    public final void m17324a(FifeImageView fifeImageView) {
    }
}
