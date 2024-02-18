package top.lazysun.im.tcp.server;

import lombok.extern.slf4j.Slf4j;
import top.lazysun.im.codec.ImBootstrapConfig;

@Slf4j
public class ImServer {

    //TCP 配置文件
    private ImBootstrapConfig.TcpConfig config;


    public ImServer(ImBootstrapConfig.TcpConfig config) {
        this.config = config;
    }

    public void start(){

    }

}
