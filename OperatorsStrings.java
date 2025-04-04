public class OperatorsStrings {
    public static void main(String[] args) {
        int x = 100 + 50;
         
        int sum1 = 100 + 50;
        int sum2 = sum1 + 50;
        int sum3 = sum2 + 50;

        System.out.print("Sum3: " + sum3);
        System.out.println("  x: " + x);

        /*
        /   Division	Divides one value by another	x / y	
        %   Modulus	Returns the division remainder	x % y	
        ++	Increment	Increases the value of a variable by 1	++x	
        --	Decrement	Decreases the value of a variable by 1	--x
        */

        int z = 10;
        int y = 5;

        System.out.println(z/y);
        System.out.println(z%y);
        System.out.println(++z);
        ++z;
        System.out.println(--z);
        --z;
        System.out.println(z);

        System.out.println(x);
        System.out.println(x += 5);

        /*
        *=	x *= 3	x = x * 3	
        /=	x /= 3	x = x / 3	
        %=	x %= 3	x = x % 3	
        &=	x &= 3	x = x & 3	
        |=	x |= 3	x = x | 3	
        ^=	x ^= 3	x = x ^ 3	
        >>=	x >>= 3	x = x >> 3	
        <<=	x <<= 3	x = x << 3 
        */
        
        int a = 10;
        int b = 25;
        int c = 64;

        a *= 3;
        System.out.println(a);
        b /= 5;
        System.out.println(b);
        System.out.println(c %= 8);
        System.out.println(x &= 10);
        System.out.println(b|5);

        /*
        && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10	
        || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4	
        !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)
        */

        System.out.println(a > 5 && b <= 30);
    }
}