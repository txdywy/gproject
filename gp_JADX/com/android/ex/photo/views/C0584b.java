package com.android.ex.photo.views;

public final class C0584b implements Runnable {
    public final PhotoView f3893a;
    public float f3894b;
    public float f3895c;
    public float f3896d;
    public long f3897e;
    public boolean f3898f;

    public C0584b(PhotoView photoView) {
        this.f3893a = photoView;
    }

    public final void run() {
        if (!this.f3898f) {
            if (this.f3895c != this.f3894b) {
                long currentTimeMillis = System.currentTimeMillis();
                float f = ((float) (this.f3897e != -1 ? currentTimeMillis - this.f3897e : 0)) * this.f3896d;
                if ((this.f3895c < this.f3894b && this.f3895c + f > this.f3894b) || (this.f3895c > this.f3894b && this.f3895c + f < this.f3894b)) {
                    f = this.f3894b - this.f3895c;
                }
                PhotoView photoView = this.f3893a;
                photoView.f3864H += f;
                photoView.f3875j.postRotate(f, (float) (photoView.getWidth() / 2), (float) (photoView.getHeight() / 2));
                photoView.invalidate();
                this.f3895c = f + this.f3895c;
                if (this.f3895c == this.f3894b) {
                    this.f3898f = true;
                }
                this.f3897e = currentTimeMillis;
            }
            if (!this.f3898f) {
                this.f3893a.post(this);
            }
        }
    }
}
