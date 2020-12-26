//функция принимает строку и возвращает её длину
int len(char* str){
	int length=0;
	while(str[length]!='\0') length++;
	return length;
}
//функция принимает строку и удаляет из неё все буквы a
void delA(char* str){
	int j=0;
	for(int i=0;str[i]!='\0';i++){		
		str[j]=str[i];
		if(str[j]!='a')j++;
	}
	str[j]='\0';
}
//функция возвращает такую версию оригинальной строки,
//в которой удалены все указанные символы
char* makeWithoutChar(char* str,char ch){
	char* resStr=(char*)malloc(len(str));//размер в байтах
	int j=0;
	for(int i=0;str[i]!='\0';i++){		
		resStr[j]=str[i];
		if(resStr[j]!=ch)j++;
	}
	resStr[j]='\0';
	return resStr;
}