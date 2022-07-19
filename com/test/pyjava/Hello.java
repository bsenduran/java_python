package com.test.pyjava;

import py4j.GatewayServer;

public class Hello{

	public static String sayHello(){
		return "Hello";
	}

	public static String sayHello(String name) {
		return "Hello " + name + "!";
	}

	public String sayHelloNonStatic(){
		return "Hello from non static";
	}

	public static void main(String[] args) {
    		Hello hello = new Hello();
    		GatewayServer server = new GatewayServer(hello);
    		server.start();
	}

}
