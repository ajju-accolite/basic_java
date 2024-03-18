
public class q2_throw_throws {


    public static void main(String[] args) {
        try {
            Age(13);
        } catch (ArithmeticException err) {
            System.out.println("arithmetic exception : " + err.getMessage());
        }
    }


    public static void Age(int age) {
      if (age < 18) {
        throw new ArithmeticException("Access denied");
      }
      else {
        System.out.println("Access granted");
      }
    }

    public static void Age_throws(int age) throws ArithmeticException{
        if (age < 18) {
            throw new ArithmeticException("Accesss denied");
          }
          else {
            System.out.println("Access granted");
          }
    }
  }