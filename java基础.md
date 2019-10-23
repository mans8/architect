



**分时调度：**
轮流使用cpu使用权，平均分配每个线程占用cpu的时间；

**抢占式调度：**
优先级较高的使用cpu，如果线程优先级相同，随机选择一个，**java使用的为抢占式调度**。



**主线程** ：执行主方法（main）的线程。JVM执行main方法会进入栈内存中，jvm会找操作系统开辟一条main方法通向cpu的执行路径，cpu就可以通过路径来执行main方法。

继承Thread类，重写run方法：

```java
class Son extends Dad {
   	String nickName;
   	Son(String nickName){
   		this.nickName = nickName;
   	}
   	public void run() {
   		//TODO
   	}
}
```

创建并启动一个线程：

```java
Son s = new Son("大头");
s.start();
```

调用start方法，开启新的线程，执行run方法。结果是两个线程并行。多次start一个线程是非法的，特别是当线程结束运行后，不能再重新启动。


对于CPU而言，多线程意味着有多条执行路径，意味着CPU有选择权

main方法压栈执行

![1571077848674](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\1571077848674.png)




两种创建方法
1.继承Thread类，重写run方法
启动直接调用start()方法
2.实现Runnable接口，实现run方法
Person p = new Person();
new Thread(p).start();

1.避免了单继承的局限性
2.增强程序的扩展性，降低了程序的耦合性，把设置线程任务和开启新线程进行了分离



匿名内部类实现线程的创建
匿名：没有名字
内部类：卸载其它类内部的类

作用：简化代码
```java
new Thread(){
	@Override
	public void run(){
		System.out.println("");
	}
}.start();
```

```java
new Thread(new Runnable() {
	@Override
	public void run() {
		System.out.println("");
	}
}).start();
```



线程安全














