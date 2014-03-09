package madhav;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class LoginAspect {
	@Before("execution(public void showDetails())")
public void login()
{
      System.out.println("login success");
}
}
