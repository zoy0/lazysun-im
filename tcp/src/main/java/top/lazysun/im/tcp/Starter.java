package top.lazysun.im.tcp;


import org.yaml.snakeyaml.Yaml;
import top.lazysun.im.codec.ImBootstrapConfig;
import top.lazysun.im.service.rabbitmq.RedissonManager;
import top.lazysun.im.tcp.server.ImServer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Starter {
    public static void main(String[] args) {
        if (args.length > 0) {
            start(args[0]);
        }
    }

    public static void start(String path) {

        try {
            Yaml yaml = new Yaml();
            FileInputStream is = new FileInputStream(path);
            ImBootstrapConfig config = yaml.loadAs(is, ImBootstrapConfig.class);
            new ImServer(config.getIm()).start();
            RedissonManager.init(config);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}