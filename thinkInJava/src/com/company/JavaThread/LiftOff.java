/**
 * Copyright (C), 2015-2017, XXX有限公司
 * FileName: LiftOff
 * Author:   HaimingWei
 * Date:     11/5/2017 4:29 PM
 * Description: thread
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.company.JavaThread;
public class LiftOff implements Runnable {
    protected int countDown = 3; // Default
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff() {
        System.out.println("Thread Start");
    }
    public LiftOff(int countDown) {
        this.countDown = countDown;
    }
    public String status() {
        return "#" + id + "(" +
                (countDown > 0 ? countDown : "Liftoff!") + "), ";
    }
    public void run() {
        while(countDown-- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }
}
