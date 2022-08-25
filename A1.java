// What do these code fragments print?
// a. int n = 1;  int m = -1;  if (n < -m)  { System.out.print(n); }  else { System.out.print(m); }
//b. int n = 1;  int m = -1;  if (-n >= m)  { System.out.print(n); }  else { System.out.print(m); }
//c. double x = 0;  double y = 1;  if (Math.abs(x - y) < 1)  { System.out.print(x); }  else { System.out.print(y)};
//d. double x = Math.sqrt(2);  double y = 2;  if (x * x == y)  { System.out.print(x); }  else { System.out.print(y); }
public class A1 {
    public static void main(String[] args) {
        //a:
        int n = 1;
        int m = -1;
        if (n < -m)  { System.out.println(n); }
        else { System.out.println(m); }
        //b:the seme code just with changing variables name;
        int a = 1;
        int b = -1;
        if (-a >= b)  { System.out.println(a); }
        else { System.out.println(b); }
        //c:
        double x = 0;
        double y = 1;
        if (Math.abs(x - y) < 1)  { System.out.println(x); }
        else { System.out.println(y);}
        //d:the seme code just with changing variables name;
        double q = Math.sqrt(2);
        double s = 2;
        if (q * q == s)  { System.out.println(q); }
        else { System.out.println(s); }

    }
}
