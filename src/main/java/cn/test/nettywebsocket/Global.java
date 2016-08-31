package cn.test.nettywebsocket;

import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * Created by LiuJun on 2016/8/30.
 */
public class Global {
    public static ChannelGroup group = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

}
