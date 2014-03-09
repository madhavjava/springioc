package madhav;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class Security {
	@Before("execution(public void setDetails())")
public void checksecufity()
{
	System.out.print("checking security is success");
}
}
