//这里的 0 to 2, 其实为（0）.to(2) 调用的为整数类型的 to方法，
//to方法使用一个参数。Scala中所有的基本数据类型也是对象（和Java不同），
//因此0 可以有方法（实际上调用的是RichInt的方法），这种只有一个参数的方法可以使用操作符的写法（不用.和括号），
//实际上Scala中表达式 1+2 ,最终解释为(1).+(2) +也是Int的一个方法，和Java不同的是，Scala对方法的名称没有太多的限制，你可以使用符合作为方法的名称。
var greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) =","
greetStrings(2) = "world!\n"
for(i <- 0 to 2)
	print(greetStrings(i))
	

var greetStrings1 = new Array[String](3)
greetStrings1.update(0,"Hello")
greetStrings1.update(1,",")
greetStrings1.update(2,"world!\n")
for(i <- 0 to 2)
	print(greetStrings1.apply(i))
	
	
var greetStrings2 = Array("Hello",",","World\n")
for(i <- 0 to 2)
	print(greetStrings2.apply(i))
	
var greetStrings3 = Array.apply("Hello",",","World\n")
for(i <- 0 to 2)
	print(greetStrings3.apply(i))
	
