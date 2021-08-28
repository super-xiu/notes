package cn.com.wind.fdc.zk;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author xlx
 * @Date: 2021/7/28
 * @Description:cn.com.wind.fdc.zk
 * @version:1.0
 */
public class ZookeeperTest {
    CuratorFramework client =null;

    @Before
    public void startZk(){
        ExponentialBackoffRetry retry = new ExponentialBackoffRetry(3000, 10);
        client = CuratorFrameworkFactory.builder()
                .connectString("8.136.149.28:2181")
                .sessionTimeoutMs(60*1000)
                .connectionTimeoutMs(15*1000)
                .retryPolicy(retry)
                //设置name之后根节点就是p1
                .namespace("p1")
                .build();

        client.start();
    }

    @Test
    public void testOperation() throws Exception {
//        String path = client.create().forPath("/p4");
//        System.out.println(path);

        String path1 = client.create().withMode(CreateMode.EPHEMERAL).forPath("/p5");
        System.out.println(path1);
        while (true){}
    }


    @After
    public void closeZk(){
        if (null!=client){
            client.close();
        }
    }
}
