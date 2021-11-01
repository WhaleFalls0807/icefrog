package com.whaleal.icefrog.socket.protocol;

import com.whaleal.icefrog.socket.aio.AioSession;

import java.nio.ByteBuffer;

/**
 * 消息编码器
 *
 * @param <T> 编码前后的数据类型
 * @author Looly
 * @author wh
 */
public interface MsgEncoder<T> {
    /**
     * 编码数据用于写出
     *
     * @param session     本次需要解码的session
     * @param writeBuffer 待处理的读buffer
     * @param data        写出的数据
     */
    void encode( AioSession session, ByteBuffer writeBuffer, T data );
}
