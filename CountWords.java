//Your code here
   int count1=0,count2=0,count3=0,count4=0,count5=0;
   for(int i=0;i<str.length();i++)
   {
  
   switch(str.charAt(i))
   {
       case 'a':
        count1++;
        break;
       case 'e':
       count2++;
       break;
       case 'i':
       count3++;
       break;
       case 'o':
       count4++;
       break;
       case 'u':
       count5++;
       break;
   }      
   }
   
   if(count1>0)
   count1 = 1;
    
   if(count2>0)
   count2 = 1;
    
   if(count3>0)
   count3 = 1;
    
   if(count4>0)
   count4 = 1;
    
   if(count5>0)
   count5 = 1;
    
    int countT = count1+count2+count3+count4+count5;
    return countT;
