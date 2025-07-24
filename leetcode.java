class Solution {
    public int mySqrt(int x) 
    {
        double l=0, r=x, temp;
        if(x==1 || x==0)
        {
            return x;
        }
        while((int) r != (int) l)
        {
            temp=(r+l)/2;
            if(temp*temp == x)
            {
                return (int) temp;
            }
            else if(temp*temp < x)
            {
                l = temp;
            }
            else
            {
                r= temp;
            }
        }
        return (int) l;
    }
}