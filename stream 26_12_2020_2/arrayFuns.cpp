//������� ��������� ������ � ���������� � �����
int len(char* str){
	int length=0;
	while(str[length]!='\0') length++;
	return length;
}
//������� ��������� ������ � ���������� - ����� �� ���
//� ���� ������ ���� ���� ���� ����� �
bool isAPresent(char *str){
	for(int i=0;str[i]!='\0';i++)
		if(str[i]=='a') return true;
	return false;
}

//������� ��������� ������ � �������� ���
//�� �������� ������ ������� � ���� �������
char* trim(char *str){
	return (char*)realloc(str,len(str));
}

//������� ��������� ������ ����� � ���������� �����
//������� ��� ������ � ������� ����������� ����� �
//� ��������� ���������� ���������� �����
int delStringWithA(char** str,int len){
	int j=0;
	for(int i=0;i<len;i++){		
		str[j]=str[i];
		if(!isAPresent(str[j])) j++;
	}
	return j;
}


