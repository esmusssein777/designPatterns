package com.ligz.Decorator.mala;

/**
 * primer底料
 *     麻辣烫的底料，暂时列出清汤和麻辣两种
 * @author ligz
 */
public abstract class Primer {
	String description = "麻辣烫底料";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
