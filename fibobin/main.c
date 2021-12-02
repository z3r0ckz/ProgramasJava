#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 //Variables globales//
int fibo(int);
int menu,dec,dig,i,bin,num;
char str[20];
//funcion fibo//
int fibo (int n){
	if (n<2)
	return 1;
	return fibo (n-1)+fibo(n-2);
}
//funcion convertir//
int converbin(int num)
{
	if(num<2)
	return num;
	else
	return num%2 +(10*converbin(num/2));
}

int converdec(char *sbin)
{
	int j=0,sum=0,tmp; 
	int len = strlen(sbin); 

	for(j=0;j<len;j++) 
	{ 
	if(sbin[j]!='1' && sbin[j]!='0') 
	{ 
	printf("Este no es un numero en formato binario."); 
	return -1; 
	} 
	} 

	tmp = len-1; 
	for(j=0; j<len; j++) 
	{ 
	sum=sum+((sbin[j]-'0')*(tmp?(2<<tmp-1):1)); 
	tmp--; 
	} 

	return sum;
	}


int main(int argc, char** argv) {
    printf("Programa 6");
    printf("\n Menu ");
    printf("\n (1) Decimal a binario ");
    printf("\n (2) Binario a deimal ");
    printf("\n (3) Fibonacci ");
    printf("\n (4) Salir \n");
    scanf("%d",&menu);
    switch(menu){
        case 1:
              
      printf("ingrese Numero decimal: \n");
      scanf("%d",&num);
      bin=converbin(num);
      printf("El numero binario es %d",bin);
            break;    
		case 2:
    	printf("Introduzca un numero en formato binario: "); 
		scanf("%s",&str); 
		printf(" El resultado decimal es: %d", converdec(str)); 
		
    	break;
	    case 3:
        printf("Da el numero Fibonacci a calcular: ");
		scanf("%d",&i);
		printf("Fibo(%d)=%d\n",i,fibo(i));
		getchar;
                       break;
    
	case 4:
    	return 0;
    	break;
}

    return (EXIT_SUCCESS);
}


