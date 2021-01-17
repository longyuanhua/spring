package aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * ʹ��aspectj��ע������������
 * ʹ��@Before @AfterReturning @AfterThrowing @After������֪ͨ
 * ��֪ͨ������е���ʽ("execution(** concert.Performance.perform(..))")
 * �е���ʽ�ظ���ʹ��@Pointcut�������е���ʽ
 * */
@Aspect
public class Audience {
	
	@Pointcut("execution(** concert.Performance.perform(..))")
	public void performance(){   //��ʾ��ͬһ���������е���ʽ
		
	}
	
	
	@Before("performance()")
	public void silenceThePhones(){
		System.out.println("Silencing the phones...");
	}
	
	@Before("performance()")
	public void takeSeats(){
		System.out.println("Taking seats...");
	}
	
	@AfterReturning("performance()")
	public void applause(){
		System.out.println("CLAP CLAP CLAP...");
	}
	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("Demanding a refund");
	}
	
}
