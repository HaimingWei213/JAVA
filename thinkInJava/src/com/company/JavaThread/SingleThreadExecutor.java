/**
 * Copyright (C), 2015-2017, XXX有限公司
 * FileName: SingleThreadExecutor
 * Author:   HaimingWei
 * Date:     11/5/2017 6:28 PM
 * Description: SingleThreadExecutor
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.company.JavaThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {
    public static void main(String[] args)
    {
        ExecutorService exec = Executors.newSingleThreadExecutor();
        for (int i=0;i<5;i++)
            exec.execute(new LiftOff());
        exec.shutdown();
    }
}
