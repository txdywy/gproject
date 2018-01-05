package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class SVGImageView extends ImageView {
    public as f4195a;
    public float f4196b;

    public SVGImageView(Context context) {
        super(context);
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        m4519a(attributeSet, 0);
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4519a(attributeSet, i);
    }

    private final void m4519a(AttributeSet attributeSet, int i) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C0721p.SVGImageView, i, 0);
            try {
                int resourceId = obtainStyledAttributes.getResourceId(C0721p.SVGImageView_svg_fill, -1);
                int resourceId2 = obtainStyledAttributes.getResourceId(C0721p.SVGImageView_svg_stroke, -1);
                if (!(resourceId == -1 && resourceId2 == -1)) {
                    this.f4195a = new as();
                    if (resourceId != -1) {
                        this.f4195a.m4593b(getResources().getColor(resourceId));
                    }
                    if (resourceId2 != -1) {
                        this.f4195a.m4592a(getResources().getColor(resourceId2));
                    }
                }
                this.f4196b = obtainStyledAttributes.getFloat(C0721p.SVGImageView_svg_scale, -1.0f);
                resourceId = obtainStyledAttributes.getResourceId(C0721p.SVGImageView_svg, -1);
                if (resourceId != -1) {
                    setImageSVGResource(resourceId);
                    return;
                }
                String string = obtainStyledAttributes.getString(C0721p.SVGImageView_svg);
                if (string != null) {
                    if (m4520a(Uri.parse(string))) {
                        obtainStyledAttributes.recycle();
                        return;
                    }
                    setImageAsset(string);
                }
                obtainStyledAttributes.recycle();
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setSVG(C0722q c0722q) {
        if (c0722q == null) {
            throw new IllegalArgumentException("Null value passed to setSVG()");
        }
        c0722q.m4792a(C0722q.m4779a(getResources()));
        setImageDrawable(new cs(c0722q));
    }

    protected void setImageSVGResource(int i) {
        cu cwVar = new cw(this);
        cwVar.f4458a = this.f4195a;
        cwVar.f4459b = this.f4196b;
        cwVar.execute(new Integer[]{Integer.valueOf(i)});
    }

    public void setImageAsset(String str) {
        cu cvVar = new cv(this);
        cvVar.f4458a = this.f4195a;
        cvVar.f4459b = this.f4196b;
        cvVar.execute(new String[]{str});
    }

    private final boolean m4520a(Uri uri) {
        try {
            InputStream openInputStream = getContext().getContentResolver().openInputStream(uri);
            cu cxVar = new cx(this);
            cxVar.f4458a = this.f4195a;
            cxVar.f4459b = this.f4196b;
            cxVar.execute(new InputStream[]{openInputStream});
            return true;
        } catch (FileNotFoundException e) {
            return false;
        }
    }
}
