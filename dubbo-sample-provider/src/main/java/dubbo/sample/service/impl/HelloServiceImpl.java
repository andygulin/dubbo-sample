package dubbo.sample.service.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import dubbo.sample.service.HelloService;
import org.apache.log4j.Logger;

public class HelloServiceImpl implements HelloService {

    private static final Logger LOGGER = Logger.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(String name) {
        LOGGER.info(RpcContext.getContext().getUrl());
        return "hello : " + name;
    }
}