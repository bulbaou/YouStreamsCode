//������� ��������� ������ � ���������� � �����
int len(char* str){
	int length=0;
	while(str[length]!='\0') length++;
	return length;
}
//������� ��������� ������ � ������� �� �� ��� ����� a
void delA(char* str){
	int j=0;
	for(int i=0;str[i]!='\0';i++){		
		str[j]=str[i];
		if(str[j]!='a')j++;
	}
	str[j]='\0';
}
//������� ���������� ����� ������ ������������ ������,
//� ������� ������� ��� ��������� �������
char* makeWithoutChar(char* str,char ch){
	char* resStr=(char*)malloc(len(str));//������ � ������
	int j=0;
	for(int i=0;str[i]!='\0';i++){		
		resStr[j]=str[i];
		if(resStr[j]!=ch)j++;
	}
	resStr[j]='\0';
	return resStr;
}