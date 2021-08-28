#### 1. CAS

是什么 compareAndSet，就是在对对象进行写操作之前去获取对象的值和预期的值是都一致，如果不一致则不写入，一致则写入

#### 2. ABA问题

会出现什么问题：A->B->A问题，即线程a将变量由a->b->a时，线程b对对象进行读取，虽然对象的值依旧为A,但是却被线程a修改过了

##### 如何解决ABA问题？

加时间戳，每次对值的修改都加1，当时间戳的值和对象的值都与预期的值一致时，才进行set操作

```java
package com.xlx.cas;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicStampedReference;

/**
 *解决ABA问题
 * 解决方案：AtomicStampedReference<Integer>
 * stampedReference.compareAndSet(10, 11, stampedReference.getStamp(),stampedReference.getStamp()+1);
 * 参数1：预期值
 * 参数2：修改值
 * 参数3：预期的时间戳值
 * 预期4：时间戳修改后的值
 * @author xlx
 * @Date: 2021/2/22
 * @Description:com.xlx.cas
 * @version:1.0
 */
public class DealABADemo {
    private static AtomicStampedReference<Integer> stampedReference = new AtomicStampedReference(10,1);

    public static void main(String[] args) {
        new Thread(()->{
            int stamp = stampedReference.getStamp();
            System.out.println(Thread.currentThread().getName()+"第一次时间戳为："+stamp);
            //进行A->B->A操作
            boolean flag1 = stampedReference.compareAndSet(10, 11, stampedReference.getStamp(),stampedReference.getStamp()+1);
            System.out.println(Thread.currentThread().getName()+"是否更新成功："+flag1+",A->B之后时间戳为："+stampedReference.getStamp());
            //进行B->A的操作
            boolean flag2 =stampedReference.compareAndSet(11,10,stampedReference.getStamp(),stampedReference.getStamp()+1);
            System.out.println(Thread.currentThread().getName()+"是否更新成功："+flag2+",B->A之后时间戳为："+stampedReference.getStamp());
        },"t1").start();

        new Thread(()->{
            try {
                TimeUnit.SECONDS.sleep(2);} catch (InterruptedException e) {e.printStackTrace();}
            int stamp = stampedReference.getStamp();
            System.out.println(Thread.currentThread().getName()+"时间戳为："+stamp);
            //判断是否和之前的时间戳一致，如果不一致则修改失败 false
            boolean flag = stampedReference.compareAndSet(10, 12, 1, stampedReference.getStamp() + 1);
            System.out.println(Thread.currentThread().getName()+"是否修改成功："+flag+",时间戳的值为:"+stampedReference.getStamp());
        },"t2").start();
    }
}

```

#### 3. volatile

有什么用：保证变量的可见性和禁止指令重排

##### 如何保证变量的可见性?

java内存模型中定义，共享的成员变量是存放在主存中，每个线程中都有自己栈帧，栈帧中有局部变量表，当程序加载的时候，线程都会将主存中的变量值加载到局部栈中，但是当A线程修改主存中的变量时，却不会通知BC线程，从而会导致线程安全问题。但是如果变量是被volatitle进行修饰的话，如果A线程修改了主存中的变量时，便会通知其他线程，主存中的值已经修改了。

##### 如何禁止指令重排的？

会加入内存屏障，保证屏障前的语句和屏障之后的语句保持一致性，即前后不能乱序，但是前的语句依旧可以重排。

例如：语句A loadLoad 语句B 

B读取之前，A的写入对其他处理器可见

B写入之前, A的读取完毕。



例如：语句A LoadStoreLoad 语句B

B读取之前，A读取完毕

B写入之前，A的写入对其他处理器可见