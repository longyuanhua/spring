package aspect;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 使用aspectj的注解来创建切面
 * 使用@Before @AfterReturning @AfterThrowing @After来定义通知
 * 在通知后面接切点表达式("execution(** concert.Performance.perform(..))")
 * 切点表达式重复，使用@Pointcut来定义切点表达式
 * */
@Aspect
public class Audience {
	
	@Pointcut("execution(** concert.Performance.perform(..))")
	public void performance(){   //表示对同一个方法的切点表达式
		
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
