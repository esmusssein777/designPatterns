package com.ligz.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ligz
 */
public class NonOwnerInvocationHandle implements InvocationHandler{
PersonBean personBean;
	
	public NonOwnerInvocationHandle(PersonBean personBean) {
		this.personBean = personBean;
	}
	
	public Object invoke(Object proxy, Method method, Object args[]) throws IllegalAccessException{
		try {
			if(method.getName().startsWith("get")) {
				return method.invoke(personBean, args);
			}else if(method.getName().equals("setHotOrNotRating")) {
				return method.invoke(personBean, args);
			}else if(method.getName().startsWith("set")) {
				throw new IllegalAccessException();
			}
		}catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	PersonBean getOwnerProxy(PersonBean personBean) {
		return (PersonBean)Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
				personBean.getClass().getInterfaces(),
				new NonOwnerInvocationHandle(personBean));
	}
}
