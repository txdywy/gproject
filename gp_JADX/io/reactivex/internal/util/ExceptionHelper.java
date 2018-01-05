package io.reactivex.internal.util;

public final class ExceptionHelper {

    final class Termination extends Throwable {
        Termination() {
            super("No further exceptions");
        }

        public final Throwable fillInStackTrace() {
            return this;
        }
    }

    public static RuntimeException m37735a(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        } else if (th instanceof RuntimeException) {
            return (RuntimeException) th;
        } else {
            return new RuntimeException(th);
        }
    }

    static {
        Termination termination = new Termination();
    }
}
