package com.springDurgeshFinal;

public class ReferenceProviderClass 
{
	private int y;

	
	
	public ReferenceProviderClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReferenceProviderClass(int y) {
		super();
		this.y = y;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() 
	{
		return "ReferenceProviderClass [y=" + y + "]";
	}
}
