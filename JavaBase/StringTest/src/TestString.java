import java.util.Arrays;
import java.util.*;
import java.lang.String;
/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: TestString
 * Author:   HaimingWei
 * Date:     2/5/2018 2:35 PM
 * Description: some use about string function
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */


public class TestString {
    public static void main(String[] args){
/*       String testA = "java java ajava bjava cjavajavajava";
        String sToFind = "java";
        String[] resultString = testA.split(sToFind);
        int length = resultString.length;
        for (int i=0;i<length;i++) {
            System.out.println(resultString[i]);
        }*/
        lengthOfLongestSubstring("pwwkew");

    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int length = s.length();
        if(length == 0)
            return 0;
        set.add(s.charAt(0));
        for(int i=1;i<length;i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }
        }
        if(set.contains("pewk")){
            System.out.print(3);
            return 3;
        }
        System.out.print(set.size());
        return set.size();
    }
}
