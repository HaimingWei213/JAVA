/**
 * Copyright (C), 2015-2017, XXX有限公司
 * FileName: Outer
 * Author:   HaimingWei
 * Date:     11/12/2017 8:00 PM
 * Description: create a inner class
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.company.InnerClass;

public class Outer {
    public class Inner{
        Inner(String whereTo)
        {

        }
    }

    public  Inner to (String str)
    {
        return new Inner(str);
    }
}
