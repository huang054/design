package com.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyProxy implements InvocationHandler{
	
	private Object sux;
	
	public MyProxy( Object sux) {
		// TODO Auto-generated constructor stub
		this.sux=sux;
	}

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
		  //　　在代理真实对象前我们可以添加一些自己的操作
        System.out.println("before rent house");
        
        System.out.println("Method:" + arg1);
        
        //    当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        arg1.invoke(sux, arg2);
        
        //　　在代理真实对象后我们也可以添加一些自己的操作
        System.out.println("after rent house");
		return null;
	}

}
