#include<conio.h>
#include<stdio.h>
#include<malloc.h>
#include"arrayFuns.cpp"

int main(){
	int size=5;
	char** str=(char**)malloc(size*sizeof(char*));
	
	for(int i=0;i<size;i++){
		str[i]=(char*)malloc(100);
		gets(str[i]);
		str[i]=trim(str[i]);
	}
	size=delStringWithA(str,size);

	printf("\n----------------\n");	
	for(int i=0;i<size;i++){
		puts(str[i]);
	}		
}

