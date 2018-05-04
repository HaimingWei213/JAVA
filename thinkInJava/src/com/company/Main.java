package com.company;
import com.company.JavaThread.*;
import com.company.InnerClass.*;
public class Main {

    public static void main(String[] args) {
		Outer ower = new Outer();
    	Outer.Inner inner =  ower.to("isOk");
    }
}
