#### 1. 可重入锁

##### 	1.1 可重入锁的概念

​		当同步代码块内部也有同步代码块，且同步代码块锁的对象时一致的时候，如果线程		获得外部锁对象，同时也直接获得内部的锁对象。

##### 	1.2 可重入锁的分类

​		隐式：synchronized

​		显示: ReentrantLock

#### 2. juc常用api

##### 	2.1 CountDownLatch(闭锁)

​	定义：CountDownLatch就是一个计数器，当计数器的值为0时，被计数器休眠的线程才会启动

```java
package com.xlx.reentrantLock;

import com.xlx.entity.Country;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch就是一个计数器，当计数器的值为o的时候，被计数器休眠的线程才能启动
 * 案例：秦国灭六国
 *
 * @author xlx
 * @Date: 2021/2/18
 * @Description:com.xlx.reentrantLock
 * @version:1.0
 */
public class CountDownLatchDemo {
    private static final int count = 7;
    private static CountDownLatch countDownLatch = new CountDownLatch(count-1);

    public static void main(String[] args) throws InterruptedException {
        close();
    }
    public static void close() throws InterruptedException {
        for (int i = 1; i <count ; i++) {
            //Error:(29, 55) java: 从lambda 表达式引用的本地变量必须是最终变量或实际上的最终变量
            int finalI = i;
            new Thread(()->{
                //countDownLatch的值减一
                countDownLatch.countDown();
                System.out.println(Country.getCountry(finalI).getTime()+","+Thread.currentThread().getName()+",灭亡了！");
                    },Country.getCountry(i).getCountry()).start();
        }
        //一直等到countDownLatch的值为0时，
        countDownLatch.await();
        System.out.println(Country.getCountry(count).getTime()+","+Country.getCountry(count).getCountry()+",统一华夏！");
    }
}

```



##### 	2.2 CyclicBarrier

​		也是一个计数器，但是是一个正向计数器，当被阻塞的线程达到设定值的时候，才会惊醒唤醒该线程

```java
 //集齐7颗龙珠就能召唤神龙
	public class CyclicBarrierDemo {
	    public static void main(String[] args) {
	        // public CyclicBarrier(int parties, Runnable barrierAction) {}
	        CyclicBarrier cyclicBarrier=new CyclicBarrier(7,()->{
	            System.out.println("召唤龙珠");
	        });
	        for (int i = 1; i <=7; i++) {
	            final int temp=i;
	            new Thread(()->{
	                System.out.println(Thread.currentThread().getName()+"\t收集到了第"+temp+"颗龙珠");
	                try {
	                    cyclicBarrier.await();
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                } catch (BrokenBarrierException e) {
	                    e.printStackTrace();
	                }
	            }).start();
	        }
	
	    }
	}
```



##### 	2.3 Semaphore（信号量）

#### 3. LockSupport

##### 	3.1 LockSupport定义

##### 	3.2 LockSupport的作用

#### 4. AQS