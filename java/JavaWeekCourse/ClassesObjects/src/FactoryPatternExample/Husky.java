package FactoryPatternExample;

//Husky has-A Dog
public class Husky extends Dog implements Robotic{
	
	public void bark()
	{
		System.out.println("I'm a handsome dog!");
	}
	public void Speak()
	{
		System.out.println("I'm a Husky Robot! BOOM!!!");
	}
	@Override
	public void trackObject() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void remoteControl() {
		// TODO Auto-generated method stub
		
	}
}