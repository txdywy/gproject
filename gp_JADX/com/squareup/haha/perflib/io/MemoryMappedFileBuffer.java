package com.squareup.haha.perflib.io;

import com.squareup.haha.annotations.NonNull;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel.MapMode;
import sun.nio.ch.DirectBuffer;

public class MemoryMappedFileBuffer implements HprofBuffer {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DEFAULT_PADDING = 1024;
    public static final int DEFAULT_SIZE = 1073741824;
    public final int mBufferSize;
    @NonNull
    public final ByteBuffer[] mByteBuffers;
    public long mCurrentPosition;
    public final long mLength;
    public final int mPadding;

    MemoryMappedFileBuffer(@NonNull File file, int i, int i2) {
        long j = 0;
        this.mBufferSize = i;
        this.mPadding = i2;
        this.mLength = file.length();
        int i3 = ((int) (this.mLength / ((long) this.mBufferSize))) + 1;
        this.mByteBuffers = new ByteBuffer[i3];
        FileInputStream fileInputStream = new FileInputStream(file);
        int i4 = 0;
        while (i4 < i3) {
            try {
                this.mByteBuffers[i4] = fileInputStream.getChannel().map(MapMode.READ_ONLY, j, Math.min(this.mLength - j, (long) (this.mBufferSize + this.mPadding)));
                this.mByteBuffers[i4].order(HPROF_BYTE_ORDER);
                j += (long) this.mBufferSize;
                i4++;
            } catch (Throwable th) {
                fileInputStream.close();
            }
        }
        this.mCurrentPosition = 0;
        fileInputStream.close();
    }

    public MemoryMappedFileBuffer(@NonNull File file) {
        this(file, DEFAULT_SIZE, DEFAULT_PADDING);
    }

    public void dispose() {
        int i = 0;
        while (i < this.mByteBuffers.length) {
            try {
                ((DirectBuffer) this.mByteBuffers[i]).cleaner().clean();
                i++;
            } catch (Exception e) {
                return;
            }
        }
    }

    public byte readByte() {
        byte b = this.mByteBuffers[getIndex()].get(getOffset());
        this.mCurrentPosition++;
        return b;
    }

    public void read(@NonNull byte[] bArr) {
        int index = getIndex();
        this.mByteBuffers[index].position(getOffset());
        if (bArr.length <= this.mByteBuffers[index].remaining()) {
            this.mByteBuffers[index].get(bArr, 0, bArr.length);
        } else {
            int position = this.mBufferSize - this.mByteBuffers[index].position();
            this.mByteBuffers[index].get(bArr, 0, position);
            this.mByteBuffers[index + 1].position(0);
            this.mByteBuffers[index + 1].get(bArr, position, bArr.length - position);
        }
        this.mCurrentPosition += (long) bArr.length;
    }

    public void readSubSequence(@NonNull byte[] bArr, int i, int i2) {
        this.mCurrentPosition += (long) i;
        int index = getIndex();
        this.mByteBuffers[index].position(getOffset());
        if (bArr.length <= this.mByteBuffers[index].remaining()) {
            this.mByteBuffers[index].get(bArr, 0, bArr.length);
        } else {
            int position = this.mBufferSize - this.mByteBuffers[index].position();
            this.mByteBuffers[index].get(bArr, 0, position);
            int min = Math.min(i2 - position, bArr.length - position);
            int i3 = ((this.mBufferSize + min) - 1) / this.mBufferSize;
            int i4 = position;
            position = min;
            for (min = 0; min < i3; min++) {
                int min2 = Math.min(position, this.mBufferSize);
                this.mByteBuffers[(index + 1) + min].position(0);
                this.mByteBuffers[(index + 1) + min].get(bArr, i4, min2);
                i4 += min2;
                position -= min2;
            }
        }
        this.mCurrentPosition += (long) Math.min(bArr.length, i2);
    }

    public char readChar() {
        char c = this.mByteBuffers[getIndex()].getChar(getOffset());
        this.mCurrentPosition += 2;
        return c;
    }

    public short readShort() {
        short s = this.mByteBuffers[getIndex()].getShort(getOffset());
        this.mCurrentPosition += 2;
        return s;
    }

    public int readInt() {
        int i = this.mByteBuffers[getIndex()].getInt(getOffset());
        this.mCurrentPosition += 4;
        return i;
    }

    public long readLong() {
        long j = this.mByteBuffers[getIndex()].getLong(getOffset());
        this.mCurrentPosition += 8;
        return j;
    }

    public float readFloat() {
        float f = this.mByteBuffers[getIndex()].getFloat(getOffset());
        this.mCurrentPosition += 4;
        return f;
    }

    public double readDouble() {
        double d = this.mByteBuffers[getIndex()].getDouble(getOffset());
        this.mCurrentPosition += 8;
        return d;
    }

    public void setPosition(long j) {
        this.mCurrentPosition = j;
    }

    public long position() {
        return this.mCurrentPosition;
    }

    public boolean hasRemaining() {
        return this.mCurrentPosition < this.mLength;
    }

    public long remaining() {
        return this.mLength - this.mCurrentPosition;
    }

    private int getIndex() {
        return (int) (this.mCurrentPosition / ((long) this.mBufferSize));
    }

    private int getOffset() {
        return (int) (this.mCurrentPosition % ((long) this.mBufferSize));
    }
}
