package com.google.android.gms.peerdownloadmanager.comms.rpc.p299a;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class C5441e extends C5437a {
    public C5441e(InputStream inputStream, OutputStream outputStream, C5438b c5438b) {
        super(inputStream, outputStream, c5438b);
    }

    protected final void mo5009a(C5439c c5439c) {
        while (true) {
            int readInt = this.b.readInt();
            c5439c.f28137b += 4;
            if (readInt < 0) {
                throw new IOException("invalid length: " + readInt);
            } else if (readInt == 0) {
                c5439c.f28136a = true;
                return;
            } else {
                while (readInt > 0) {
                    int min = Math.min(readInt, this.a.length);
                    this.b.readFully(this.a, 0, min);
                    c5439c.f28137b += (long) min;
                    try {
                        this.c.write(this.a, 0, min);
                        c5439c.f28138c += (long) min;
                    } catch (IOException e) {
                    }
                    readInt -= min;
                }
            }
        }
    }
}
