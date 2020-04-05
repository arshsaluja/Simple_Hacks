//FLAMES- ChildHood Game
import java.util.*;
class flames
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str1=sc.next();
String str2=sc.next();
int c=0;int sum=0;
int k=str1.length();
int l=str2.length();
for(int i=0;i<k;i++)
{
for(int j=0;j<l;j++)
{
	char ch1=str1.charAt(i);
	char ch2=str2.charAt(j);
	int cp=Character.compare(ch1,ch2);
if(cp==0)
{
c++;
}
}
}
sum=(k+l)-2*c;
switch(sum)
{
case 0:
       System.out.println("YOUR FLAME CANNOT BE FOUND WITH THE OTHER AS BOTH THE NAME CONTAIN SAME ALPHABETS - FLAMES CANNOT BE IMPLEMENTED SORRY");
	   break;
case 1:
       System.out.println("YOUR FLAME WITH THE OTHER PERSON IS  ---- S---- FOR ---SIBLING");
	   break;
case 2:
       System.out.println("YOUR FLAME WITH THE OTHER PERSON IS  ---- F---- FOR ---FRIENDS");
	   break;
case 3:
       System.out.println("YOUR FLAME WITH THE OTHER PERSON IS  ---- L---- FOR ---LOVE");
	   break;
case 4:
       System.out.println("YOUR FLAME WITH THE OTHER PERSON IS  ---- L---- FOR ---LOVE");
	   break;
case 5:
       System.out.println("YOUR FLAME WITH THE OTHER PERSON IS  ---- M---- FOR ---MARRIAGE");
	   break;
case 6:
       System.out.println("YOUR FLAME WITH THE OTHER PERSON IS  ---- L---- FOR ---LOVE");
	   break;
case 7:
       System.out.println("YOUR FLAME WITH THE OTHER PERSON IS  ---- S---- FOR ---SIBLING");
	   break;
case 8:
       System.out.println("YOUR FLAME WITH THE OTHER PERSON IS  ---- A---- FOR ---ARRANGE MARRIAGE");
	   break;
case 9:
       System.out.println("YOUR FLAME WITH THE OTHER PERSON IS  ---- L---- FOR ---LOVE");
	   break;
case 10:
       System.out.println("YOUR FLAME WITH THE OTHER PERSON IS  ---- L---- FOR ---LOVE");
	   break;
case 11:
       System.out.println("YOUR FLAME WITH THE OTHER PERSON IS  ---- M---- FOR ---MARRIAGE");
	   break;
case 12:
       System.out.println("YOUR FLAME WITH THE OTHER PERSON IS  ---- A---- FOR ---ARRANGE MARRIAGE");
	   break;
case 13:
       System.out.println("YOUR FLAME WITH THE OTHER PERSON IS  ---- S---- FOR ---SIBLING");
	   break;
case 14:
       System.out.println("YOUR FLAME WITH THE OTHER PERSON IS  ---- F---- FOR ---FRIENDS");
	   break;
case 15:
       System.out.println("YOUR FLAME WITH THE OTHER PERSON IS  ---- L---- FOR ---LOVE");
	   break;	   
default:
       System.out.println("YOUR INPUT SHOULD NOTB HAVE MORE THAN 14 CHARACTERS NOT IN COMMON");
	   break;
}
}
}
