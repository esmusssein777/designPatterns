package com.ligz.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ligz
 */
public class OwnerInvocationHandle implements InvocationHandler{
	PersonBean personBean;
	
	public OwnerInvocationHandle(PersonBean personBean) {
		this.personBean = personBean;
	}
	
	public Object invoke(Object proxy, Method method, Object args[]) throws IllegalAccessException{
		try {
			if(method.getName().startsWith("get")) {
				return method.invoke(personBean, args);
			}else if(method.getName().equals("setHotOrNotRating")) {
				throw new IllegalAccessException();
			}else if(method.getName().startsWith("set")) {
				return method.invoke(personBean, args);
			}
		}catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	PersonBean getOwnerProxy(PersonBean personBean) {
		return (PersonBean)Proxy.newProxyInstance(personBean.getClass().getClassLoader(),
				personBean.getClass().getInterfaces(),
				new OwnerInvocationHandle(personBean));
	}

}
