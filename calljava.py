from py4j.java_gateway import JavaGateway

gateway = JavaGateway()
hello_java_object = gateway.jvm.com.test.pyjava.Hello()

print(hello_java_object.sayHello())
print(hello_java_object.sayHello("Alice"))
print(hello_java_object.sayHelloNonStatic())

