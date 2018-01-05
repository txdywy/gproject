package com.caverock.androidsvg;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import java.io.FileNotFoundException;

public class SVGImageView extends ImageView
{

    public com.caverock.androidsvg.as a;
    public float b;

    SVGImageView(Context p0) {
        ImageView(p0);
    }

    SVGImageView(Context p0, AttributeSet p1) {
        ImageView(p0, p1, 0);
        this.a(p1, 0);
    }

    SVGImageView(Context p0, AttributeSet p1, int p2) {
        ImageView(p0, p1, p2);
        this.a(p1, p2);
    }

    private final void a(AttributeSet p0, int p1) {
        if (!this.isInEditMode()) {
            v1 = this.getContext().getTheme().obtainStyledAttributes(p0, com.caverock.androidsvg.p.SVGImageView, p1, 0);
            try {
                v0 = v1.getResourceId(com.caverock.androidsvg.p.SVGImageView_svg_fill, -1);
                v2 = v1.getResourceId(com.caverock.androidsvg.p.SVGImageView_svg_stroke, -1);
                if (v0 != -1 || v2 != -1) {
                    this.a = new com.caverock.androidsvg.as();
                    if (v0 != -1)
                        this.a.b(this.getResources().getColor(v0));
                    if (v2 != -1)
                        this.a.a(this.getResources().getColor(v2));
                }
                this.b = v1.getFloat(com.caverock.androidsvg.p.SVGImageView_svg_scale, -1082130432);
                v0 = v1.getResourceId(com.caverock.androidsvg.p.SVGImageView_svg, -1);
                if (v0 != -1) {
                    this.setImageSVGResource(v0);
                    v1.recycle();
                    return;
                }
            }
            catch (Throwable ex) {
                v1.recycle();
                throw ex;
            }
            try {
                v0 = v1.getString(com.caverock.androidsvg.p.SVGImageView_svg);
                if (v0 != 0) {
                    if (this.a(Uri.parse(v0))) {
                        v1.recycle();
                        return;
                    }
                    try {
                        this.setImageAsset(v0);
                    }
                    catch (Throwable ex) {
                        v1.recycle();
                        throw ex;
                    }
                }
            }
            catch (Throwable ex) {
                v1.recycle();
                throw ex;
            }
            v1.recycle();
        }
    }

    private final boolean a(Uri p0) {
        v0 = 1;
        try {
        }
        catch (FileNotFoundException ex) {
            v0 = 0;
            return v0;
        }
        v3 = new com.caverock.androidsvg.cx(this);
        v3.a = this.a;
        v3.b = this.b;
        v4 = new InputStream[1];
        v4[0] = this.getContext().getContentResolver().openInputStream(p0);
        v3.execute(v4);
        return v0;
    }

    public void setImageAsset(String p0) {
        v0 = new com.caverock.androidsvg.cv(this);
        v0.a = this.a;
        v0.b = this.b;
        v1 = new String[1];
        v1[0] = p0;
        v0.execute(v1);
    }

    protected void setImageSVGResource(int p0) {
        v0 = new com.caverock.androidsvg.cw(this);
        v0.a = this.a;
        v0.b = this.b;
        v1 = new Integer[1];
        v1[0] = Integer.valueOf(p0);
        v0.execute(v1);
    }

    public void setSVG(com.caverock.androidsvg.q p0) {
        if (p0 == 0)
            throw new IllegalArgumentException("Null value passed to setSVG()");
        p0.a(com.caverock.androidsvg.q.a(this.getResources()));
        this.setImageDrawable(new com.caverock.androidsvg.cs(p0));
    }

}
