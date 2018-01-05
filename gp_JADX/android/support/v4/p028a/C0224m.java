package android.support.v4.p028a;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

final class C0224m {
    public final IntentFilter f1239a;
    public final BroadcastReceiver f1240b;
    public boolean f1241c;
    public boolean f1242d;

    C0224m(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
        this.f1239a = intentFilter;
        this.f1240b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("Receiver{");
        stringBuilder.append(this.f1240b);
        stringBuilder.append(" filter=");
        stringBuilder.append(this.f1239a);
        if (this.f1242d) {
            stringBuilder.append(" DEAD");
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
