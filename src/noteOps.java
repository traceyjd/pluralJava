public class noteOps {
    public static void main(String[] args) {
        /* What order is the compiler going to work through the operators
           Operator Precedence
           Highest to lowest precedence
           Postfix Operators - X++ X-- Highest precedence - the increment and decrement operators after a value
           Prefix Operators - ++X --X before their values
           Multiplicative Operators - * (multiply) / (divide) % (modulus)
           Additive operators + (addition) - (subtraction)
           Just remember when a tie between 2 operators exists it will run left to right
           You can override precedence by using parenthesis () content of parenthesis is done before the rest
           You can also have nested parenthesis evaluated from inside out
           Please take advantage of parenthesis
           */
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;

        int result1 = valA - valB / valC;

        int result2 = (valA - valB) / valC;

        System.out.println(result1);
        System.out.println(result2);


    }
}
