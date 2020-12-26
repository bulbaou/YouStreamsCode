#include<conio.h>
#include<stdio.h>
#include<malloc.h>
#include"arrayFuns.cpp"

int main(){
	char* str=(char*)malloc(100);	
	gets(str);
	printf("%s", makeWithoutChar(str,'a'));	
}

