package com.springDurgeshFinal;

public class ReferenceNeededClass 
{
	//So, here this class will simply require am object of other class.
	
	//WITH THE HELP OF SPRING IOC CONTAINER WE CAN PROVIDE THAT OTHER CLASS'S REFERENCE
	//TO THIS CLASS AT RUN TIME..
	
	private int x;
	private ReferenceProviderClass rpc;
		
	public ReferenceNeededClass() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public ReferenceNeededClass(int x, ReferenceProviderClass rpc) 
	{
		super();
		this.x = x;
		this.rpc = rpc;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public ReferenceProviderClass getRpc() {
		return rpc;
	}
	public void setRpc(ReferenceProviderClass rpc) {
		this.rpc = rpc;
	}
	
	@Override
	public String toString() {
		return "ReferenceNeededClass [x=" + x + ", rpc=" + rpc + "]";
	}
}
