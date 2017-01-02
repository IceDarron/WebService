package com.darron.service;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * @description 
 *     Java-WebService实例，服务端部分，提供给客户端一个简单方法用来调用
 * @author IceDarron
 * @since 2017-01-01 18:51
 */
@WebService
public class ServiceHello {

	/**
	 * 供客户端调用的方法
	 * 
	 * @param name
	 *            传入参数
	 * @return String 返回结果
	 */
	public String getValue(String name) {
		return "hellow world! My name is " + name;
	}

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:10000/Service/ServiceHello",
				new ServiceHello());
		System.out.println("service success!");
	}

}
