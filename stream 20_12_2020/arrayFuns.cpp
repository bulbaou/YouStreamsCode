//� ���������� �������� ������ ����� � ����� ��������� �� ����� � ������ � �������� �������
void fun1(){
	int N=5;
	int arr[N];
	for(int i=0;i<N;i++) scanf("%i",&arr[i]);
	for(int i=0;i<N;i++) printf("arr[%i]=%i\n",i,arr[i]);
	for(int i=N-1;i>=0;i--) printf("arr[%i]=%i\n",i,arr[i]);
}

//� ���������� �������� ������ ����� � ����� ����������� ������������ �� ��
//� ����� ���� ������� ��� ���
void fun2(){
	int N=5,flagA=1,flagD=1;
	int arr[N];
	for(int i=0;i<N;i++) scanf("%i",&arr[i]);
	for(int i=1;i<N&&flagA;i++){
		flagA=arr[i-1]<=arr[i];
	} 
	for(int i=1;i<N&&flagD;i++){
		flagD=arr[i-1]>=arr[i];
	} 
	if(flagA||flagD) printf("Array is sorted");
	else printf("Array is not sorted");
}

//� ���������� �������� ������ ����� � �� ����� ��������� ����� ���� ��������� �������
void fun3(){
	int N=5, sum=0;
	int arr[N];
	for(int i=0;i<N;i++) scanf("%i",&arr[i]);
	for(int i=0;i<N;i++) 
		sum+=arr[i]*(arr[i]>0);
	printf("sum = %i",sum);
}

//� ���������� �������� ������ � ����������� �� �� ��������� ��� ��� ���
void fun4(){
	int N=100, flag=1;
	char arr[N];
	gets(arr);	
	int half=0,len=0;
	for(;arr[len]!='\0';len++);
	half=len/2;
	for(int i=0, j=len-1;i<=half&&flag;i++,j--){
		flag=(arr[i]==arr[j]);
	} 
	if(flag) printf("String is palindrom");
	else printf("String is not palindrom");
}

//� ���������� �������� ������ ����� � ��������� ������������ ����� � �������
void fun5(){
	int N=5, max;
	int arr[N];
	for(int i=0;i<N;i++) scanf("%i",&arr[i]);
	max=arr[0];
	for(int i=1;i<N;i++) 
		if(arr[i]>max)max=arr[i];
	printf("max = %i",max);
}

//� ���������� �������� ������, ���������� � �������� �������� � ��������� �� �����
void fun6(){
	int N=100, flag=1, sdvig='a'-'A';
	char arr[N];
	gets(arr);	
	for(int i=0;arr[i]!='\0';i++){
		if(arr[i]>='a' && arr[i]<='z') arr[i]=arr[i]-sdvig;
	} 
	puts(arr);
}

//� ���������� �������� ������, ����� ������ ����� 'a'
//����������� ������ � ��������� �� �����
//������� ��������� �� ���������� O(n^2)
void fun7(){
	int N=100;
	char arr[N];
	gets(arr);	
	int len=0;
	for(;arr[len]!='\0';len++);
	for(int i=0;i<len;i++){
		if(arr[i]=='a'){
			for(int j=len;j>i;j--){
				arr[j+1]=arr[j];
			}
			len++;
			arr[++i]=' ';
		}
	} 
	puts(arr);
}

//� ���������� �������� ������, ����� ������ ����� 'a'
//����������� ������ � ��������� �� �����
//������� ��������� �� ���������� O(n)
void fun8(){
	int N=100;
	char arr[N];
	gets(arr);	
	int len=0,aCount=0;
	for(;arr[len]!='\0';len++) 
		aCount+= (arr[len]=='a');
	for(int i=len;i>=0;i--){
		arr[i+aCount]=arr[i];
		if(arr[i]=='a'){
			arr[i+aCount]=' ';
			aCount--;
			arr[i+aCount]=arr[i];
		} 
	} 
	puts(arr);
}

//� ���������� �������� ������, � ����������� ������� � ��� ������ ����
//������� ��������� �� ���������� O(n^2)
void fun9(){
	int N=100,charCount=0,j;
	char arr[N];
	gets(arr);	
	for(int i=0;arr[i]!='\0';i++){
		for(j=i-1;j>=0;j--){
			if(arr[i]==arr[j]) break;
		}
		charCount+=(j==-1);
	}
	printf("%i",charCount);	
}

//� ���������� �������� ������, � ����������� ������� � ��� ������ ����
//������� ��������� �� ���������� O(n)
void fun10(){
	int N=100,charCount=0;
	char arr[N];
	int table[256];
	for(int i=0;i<256;i++) table[i]=0;
	
	gets(arr);	
	for(int i=0;arr[i]!='\0';i++){
		table[arr[i]]++;
	}
	for(int i=0;i<256;i++) 	{		
		if (table[i]>0) charCount++;
	}		
	printf("%i",charCount);	
}
