package com.google.android.instantapps.common.loading.ui;

import android.animation.TimeAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.support.v4.view.p039b.C0344b;
import android.util.AttributeSet;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import com.caverock.androidsvg.C0722q;
import com.caverock.androidsvg.af;
import com.caverock.androidsvg.cc;
import com.google.android.instantapps.common.loading.C5805a;
import com.google.android.instantapps.common.p217e.bj;
import com.google.android.instantapps.p309a.C5699f;

public class PreviewImageView extends ImageView {
    public aa f29262a;
    public bj f29263b;
    public Paint f29264c;
    public Paint f29265d;
    public boolean f29266e;
    public boolean f29267f;
    public C0722q f29268g;
    public float f29269h;
    public float f29270i;
    public Bitmap f29271j;
    public Bitmap f29272k;
    public Matrix f29273l;

    public PreviewImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        C5805a.f29260a.mo3518a(this);
    }

    public final boolean m27217a() {
        return this.f29268g != null;
    }

    protected void onDraw(Canvas canvas) {
        float f = -1.0f;
        if (this.f29271j == null && this.f29268g == null) {
            super.onDraw(canvas);
            return;
        }
        if (this.f29271j == null) {
            setY((float) this.f29263b.f29111i);
            setAlpha(0.0f);
            C0722q c0722q = this.f29268g;
            if (c0722q.f4614b == null) {
                throw new IllegalArgumentException("SVG document is empty");
            }
            af afVar = c0722q.f4614b.f4349c;
            af afVar2 = c0722q.f4614b.f4350d;
            if (afVar == null || afVar2 == null || afVar.f4231b == cc.percent || afVar2.f4231b == cc.percent) {
                if (!(c0722q.f4614b.w == null || c0722q.f4614b.w.f4622c == 0.0f || c0722q.f4614b.w.f4623d == 0.0f)) {
                    f = c0722q.f4614b.w.f4622c / c0722q.f4614b.w.f4623d;
                }
            } else if (!(afVar.m4573a() || afVar2.m4573a())) {
                f = afVar.m4570a(c0722q.f4616d) / afVar2.m4570a(c0722q.f4616d);
            }
            f = 1.0f / f;
            this.f29271j = Bitmap.createBitmap(getWidth(), getHeight(), Config.ARGB_8888);
            int width = (int) (f * ((float) getWidth()));
            this.f29268g.m4795b((float) getWidth());
            this.f29268g.m4796c((float) width);
            this.f29268g.m4791a(null).draw(new Canvas(this.f29271j));
            setImageBitmap(this.f29271j);
            animate().y(0.0f).alpha(1.0f).setDuration((long) this.f29263b.f29110h).setInterpolator(new C0344b());
            this.f29264c = new Paint();
            this.f29265d = new Paint();
            this.f29265d.setFilterBitmap(true);
            this.f29273l = new Matrix();
            int i = this.f29263b.f29109g;
            boolean z = i >= 0 && i < 26;
            C5699f.m26961a(z);
            this.f29269h = (float) i;
            invalidate();
            m27216a(0);
        }
        if (this.f29272k == null || this.f29269h != this.f29270i) {
            aa aaVar = this.f29262a;
            Bitmap bitmap = this.f29271j;
            float f2 = this.f29269h;
            if (f2 != 0.0f) {
                RenderScript create = RenderScript.create(aaVar.f29277a);
                Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
                Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
                Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
                ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
                create2.setRadius(Math.min(25.0f, f2));
                create2.setInput(createFromBitmap);
                create2.forEach(createFromBitmap2);
                createFromBitmap2.copyTo(createBitmap);
                createFromBitmap.destroy();
                createFromBitmap2.destroy();
                create2.destroy();
                bitmap = createBitmap;
            }
            this.f29272k = bitmap;
            this.f29270i = this.f29269h;
        }
        canvas.drawBitmap(this.f29272k, this.f29273l, this.f29264c);
        canvas.drawBitmap(this.f29271j, this.f29273l, this.f29265d);
        if (this.f29266e && !this.f29267f) {
            TimeAnimator timeAnimator = new TimeAnimator();
            timeAnimator.setDuration((long) this.f29263b.f29107e);
            timeAnimator.setInterpolator(new AccelerateInterpolator());
            timeAnimator.setTimeListener(new C5840z(this, timeAnimator));
            timeAnimator.start();
            this.f29267f = true;
        }
    }

    final void m27216a(int i) {
        boolean z = i >= 0 && i < 256;
        C5699f.m26961a(z);
        ((Paint) C5699f.m26959a(this.f29265d)).setAlpha(i);
        ((Paint) C5699f.m26959a(this.f29264c)).setAlpha(255 - i);
        invalidate();
    }
}
