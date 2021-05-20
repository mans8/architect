





# Java NIO基本介绍

**Java non-blocking IO**，是指JDK提供的新API。从JDK1.4开始，Java提供了一系列改进的输入/输出的新特性，统称NIO（New IO），是同步非阻塞的；

NIO相关类放在**java. nio**包及包下，并且对原java.io包中的很多类进行改写；

**NIO三大组件：Selector、Channel、Buffer；**

NIO是**面向缓冲区，或者面向块**（内存中是块）编程。数据读取到一个它稍后处理的缓冲区，需要时间可在缓冲区中前后移动，增加了处理过程中的灵活性，使用它可以提供非阻塞式的高伸缩网络；

Java NIO的非阻塞式模式，数据可读才读，可写才写，按需非配做其它任务，无需等待；

NIO一个线程可以处理多个操作；

Http2.0使用了多路复用技术，做到了一个连接并发处理多个请求，而且并发请求的数量比Http1.1大了好多个数量级；



# BIO和NIO的对比：

BIO是阻塞式，NIO非阻塞；

BIO以流的方式处理数据，NIO以块的方式处理数据，块的IO效率比流IO效率高很多；

BIO基于字节流和字符流进行操作，而NIO基于Channel（通道）和Buffer（缓冲区）进行操作，数据总是从通道读取到缓冲区中，或者从缓冲区写入到通道中。Selector（选择器）用于监听多个通道事件（比如连接请求，数据到达），因此使用单个线程就可以监听多个客户端通道。



# NIO三大核心组件

**Selector、Channel、Buffer**

![image-20210521002122044](https://md-java-pic.oss-cn-guangzhou.aliyuncs.com/20210521002122NIO三大组件.png)

1. 每个Channel都会对应一个Buffer
2. Selector对应一个线程，一个线程对应多个Channel（连接）
3. 图示表明有三个Channel注册到了Selector
4. 程序切换到哪个Channel是由事件决定，event是一个重要概念
5. Selector会根据不同的事件，在各个通道上切换
6. Buffer就是一个内存块，底层是一个数组
7. 数据的读取写入是通过Buffer，BIO不能双向，要么输入流，要么输出流，NIO的Buffer是可以读也可以写，需要flip方法切换
8. Channel是双向，可以返回底层操作系统的情况，比如Linux，底层的操作系统就是双向的