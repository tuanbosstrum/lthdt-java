public class baitap{

     public static int a[];
     public static int n,i;
 
     
     public static void main(String agrs[]){
         a=new int[100];
         Scanner tam=new Scanner(System.in);
         
         System.out.println("nhap phan tu mang");
         n=tam.nextInt();
         nhapmang(n);
         hthi(n);
         System.out.printf("tong chia het cho 2 va 3:%d",tong(n));
         System.out.println();
         System.out.println("so nguyen to");
         lksnt(n);
         System.out.println("so hoan hao");
         shh(n);
     }
     
     //nhapmang
     public static void nhapmang(int n){
       Scanner tam=new scanner(System.in);
       System.out.println("nhap phan tu mang");
       for(i=0;i<n;i++){
           System.out.printf("/na[i]=",i);
           a[i]=tam.nextInt();
       }
       //hienthi
       public static void hthi(int n){
           int i;
           for(i=0;i<n;i++)
               System.out.printf("%d",a[i]);
       }
     }
     //tong
     public static int tong(int n){
         int s=0,i;
         for(i=0;i<n;i++) {
             if(i%2==0 && i%3==0) s=s+a[i];}
             return s;
     }
      //lkesnt
     public static void lksnt(n){
         int i,j,s=0;
         for(i=0;i<n;i++){
             for(j=1;j<i;j++) 
                 if(a[i]%j==0)
                     s++;}
                 if(s==2)
                     System.out.printf("%d  ",a[i];
          }
      //sohoanhao
          public static void shh(n){
              int i,j,s=0;
              for(i=0;i<n;i++){
                  for(j=1;j<i;j++)
                      if(a[i]%j==0) s=s+j;}
                  if(s==a[i])
                      System.out.printf("%d ",a[i]);
                  
          }
         
         
       
    
    
    
    
}
