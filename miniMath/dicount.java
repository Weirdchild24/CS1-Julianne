class discount 
{
    public static void main(String[] args) 
    {
        
        double originalPrice = 100.0;
        double discount = 15.0;

        System.out.print("The discounted price is: " + (originalPrice - (originalPrice * (discount / 100.0))));
    }
}
