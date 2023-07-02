public class MinMagFilter implements Filter
{
    private double magMin; 
    
    public MinMagFilter(double min)
    {
        magMin = min;
    } 

    public boolean satisfies(QuakeEntry qe)
    {
        return qe.getMagnitude() >= magMin; //...returns true if magnitude greater than or equal to magMin...//
    } 

}
