package com.darron.test;

import com.darron.client.ServiceHello;
import com.darron.client.ServiceHelloService;

/**
 * @description 
 *     Java-WebService实例，客户端部分，调用服务端方法
 * @author IceDarron
 * @since 2017-01-01 18:57
 */
public class ServiceTest {

	public static void main(String[] args) {
        ServiceHello hello = new ServiceHelloService().getServiceHelloPort();
        String name = hello.getValue("darron");
        System.out.println(name);
	}

}
