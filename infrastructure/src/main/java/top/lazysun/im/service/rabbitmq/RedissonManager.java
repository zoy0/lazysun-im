package top.lazysun.im.service.rabbitmq;

import org.redisson.api.RedissonClient;
import top.lazysun.im.codec.ImBootstrapConfig;

public class RedissonManager {
    private static RedissonClient redissonClient;

    public static void init(ImBootstrapConfig config) {
        SingleClientStrategy singleClientStrategy = new SingleClientStrategy();
        redissonClient = singleClientStrategy.getRedissonClient(config.getIm().getRedis());
    }

    public static RedissonClient getRedissonClient() {
        return redissonClient;
    }
}
