public class MatrixAddition{  
public static void main(String arg[]){   
int a[][]={{1,5},{2,3},};    
int b[][]={{2,4},{3,1}};        
int c[][]=new int[2][2];       
for(int i=0;i<2;i++){    
for(int j=0;j<2;j++){    
c[i][j]=a[i][j]+b[i][j];      
System.out.print(c[i][j]+" ");    
}    
System.out.println();   
}    
}}