//функция принимает строку и возвращает её длину
int len(char* str){
	int length=0;
	while(str[length]!='\0') length++;
	return length;
}
//функция принимает строку и возвращает - верно ли что
//в этой строке есть хоть одна буква а
bool isAPresent(char *str){
	for(int i=0;str[i]!='\0';i++)
		if(str[i]=='a') return true;
	return false;
}

//функция принимает массив и обрезает его
//до размеров строки лежащей в этом массиве
char* trim(char *str){
	return (char*)realloc(str,len(str));
}

//функция принимает массив строк и количество строк
//удаляет все строки в которых встретилась буква а
//и вовращает количество оставшихся строк
int delStringWithA(char** str,int len){
	int j=0;
	for(int i=0;i<len;i++){		
		str[j]=str[i];
		if(!isAPresent(str[j])) j++;
	}
	return j;
}


