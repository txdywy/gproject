package android.support.v7.widget;

final class cm implements Runnable {
    public final /* synthetic */ cl f3324a;

    cm(cl clVar) {
        this.f3324a = clVar;
    }

    public final void run() {
        cl clVar = this.f3324a;
        switch (clVar.f3297C) {
            case 1:
                clVar.f3296B.cancel();
                break;
            case 2:
                break;
            default:
                return;
        }
        clVar.f3297C = 3;
        clVar.f3296B.setFloatValues(new float[]{((Float) clVar.f3296B.getAnimatedValue()).floatValue(), 0.0f});
        clVar.f3296B.setDuration(500);
        clVar.f3296B.start();
    }
}
