import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetClassNumber()
    {
        int class_number = this.getClassNumber();

        if (class_number > 45)
        {
            System.out.println("True");
        }else
            System.out.println("False");
    }
    public int class_number()
    {
        return class_number();
    }

}
