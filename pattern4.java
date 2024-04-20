public class pattern4{
public static void main(String args[]){

int letter = 65;
for(int i=0;i<6;i++){
	
for(int k=1;k<6-i;k++){	
System.out.print(" ");
}

for(int j=0; j<=i;j++){
System.out.print((char)(letter+j)+" ");
}

System.out.println();
}

}


}



/*

     A 
    A B 
   A B C 
  A B C D 
 A B C D E 
A B C D E F

    

*/