package android.support.v7.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Handler;
import android.os.Message;
import com.squareup.haha.perflib.StackFrame;
import java.lang.ref.WeakReference;

final class C0431w extends Handler {
    public WeakReference f2505a;

    public C0431w(DialogInterface dialogInterface) {
        this.f2505a = new WeakReference(dialogInterface);
    }

    public final void handleMessage(Message message) {
        switch (message.what) {
            case StackFrame.NATIVE_METHOD /*-3*/:
            case StackFrame.COMPILED_METHOD /*-2*/:
            case -1:
                ((OnClickListener) message.obj).onClick((DialogInterface) this.f2505a.get(), message.what);
                return;
            case 1:
                ((DialogInterface) message.obj).dismiss();
                return;
            default:
                return;
        }
    }
}
