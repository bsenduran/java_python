### Calling a java method from python

install py4j
`pip install py4j`

complie the java source
`javac -cp "./py4j-0.10.9.5.jar" com/test/pyjava/Hello.java`

run the java class first
`java -cp "./py4j-0.10.9.5.jar:." com.test.pyjava.Hello`

execure the python source
`python calljava.py`

expected output
```
Hello
Hello Alice!
Hello from non static
```
