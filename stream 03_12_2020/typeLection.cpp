
//������� ��������� � ���������� ��� ����� 
//� ������� ����� ���� ����� �� �����
void sumNums(){
	int x,y,res; //����������
    printf("This programm summing 2 nums\n");
    printf("\tEnter first num:");
    scanf("%i",&x);
    printf("\tEnter second num:");
    scanf("%i",&y);
    res=x+y;
    printf("\t%i+%i=%i",x,y,res);
}
//������� ������� �� ����� ����������� 
//�������� ����� ������ � ������
void table(){
	printf("bool\t %i\n",sizeof(bool));      
    printf("char\t %i\n",sizeof(char));    
    printf("short\t %i\n",sizeof(short));
    printf("int\t %i\n",sizeof(int));
    printf("long\t %i\n",sizeof(long));    
    printf("long long int\t %i\n",sizeof(long long));      
    printf("float\t %i\n",sizeof(float));
    printf("double\t %i\n",sizeof(double));
    printf("long double\t %i\n",sizeof(long double));  
}
//������� ��������� ���� ���������� � ������� �� �����
//�������� ���� ����������. ����������� �� ���������� (��������):
// 5, 65536, 65537
void scanError(){	
	short int x=0,y=0;
	scanf("%i",&y);
	printf(" x=%hi\n y=%hi\n",x,y);
}
