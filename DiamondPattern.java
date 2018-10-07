public class DiamondPattern {
    public static void main(String args[]) {
    int n=5;
    int p=n;
   
    for(int i=1;i<=n;i+=2)
    {
        int k=(i-1)*n+1;
        for(int j=0;j<n-1;j++)
        {
            
            System.out.print(k+" * ");
            k++;
        }
        
        System.out.print(k+" ");
        System.out.println();
        
    }
    if(n%2!=0)
    {
        p=n-1;
    }
    for(int i=p;i>0;i-=2)
    {
        int k=(i-1)*n+1;
        for(int j=0;j<n-1;j++)
        {
            
            System.out.print(k+" * ");
            k++;
        }
        
        System.out.print(k+" ");
        System.out.println();
        
    }
    

    }
}
