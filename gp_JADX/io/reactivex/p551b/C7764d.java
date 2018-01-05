package io.reactivex.p551b;

public final class C7764d extends C7763c {
    public C7764d(Runnable runnable) {
        super(runnable);
    }

    public final String toString() {
        return "RunnableDisposable(disposed=" + (get() == null) + ", " + get() + ")";
    }

    protected final /* synthetic */ void mo6534a(Object obj) {
        ((Runnable) obj).run();
    }
}
