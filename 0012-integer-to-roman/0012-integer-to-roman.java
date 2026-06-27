class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> hm=new HashMap<>();
        StringBuilder str=new StringBuilder();
        hm.put(1000,"M");
        hm.put(900,"CM");
        hm.put(500,"D");
        hm.put(400,"CD");
        hm.put(100,"C");
        hm.put(90,"XC");
        hm.put(50,"L");
        hm.put(40,"XL");
        hm.put(10,"X");
        hm.put(9,"IX");
        hm.put(5,"V");
        hm.put(4,"IV");
        hm.put(1,"I");
        if(num>=1000)
        {
            int i;
            i=num/1000;
            for(int j=0;j<i;j++)
            {
                str.append(hm.get(1000));
            }
            num=num%1000;
        }
        if(num>=900)
        {
            int i;
            i=num/900;
            for(int j=0;j<i;j++)
            {
                str.append(hm.get(900));
            }
            num=num%900;
        }
        if(num>=500)
        {
            int i;
            i=num/500;
            for(int j=0;j<i;j++)
            {
                str.append(hm.get(500));
            }
            num=num%500;
        }
        if(num>=400)
        {
            int i;
            i=num/400;
            for(int j=0;j<i;j++)
            {
                str.append(hm.get(400));
            }
            num=num%400;
        }
        if(num>=100)
        {
            int i;
            i=num/100;
            for(int j=0;j<i;j++)
            {
                str.append(hm.get(100));
            }
            num=num%100;
        }
        if(num>=90)
        {
            int i;
            i=num/90;
            for(int j=0;j<i;j++)
            {
                str.append(hm.get(90));
            }
            num=num%90;
        }
        if(num>=50)
        {
            int i;
            i=num/50;
            for(int j=0;j<i;j++)
            {
                str.append(hm.get(50));
            }
            num=num%50;
        }
        if(num>=40)
        {
            int i;
            i=num/40;
            for(int j=0;j<i;j++)
            {
                str.append(hm.get(40));
            }
            num=num%40;
        }
        if(num>=10)
        {
            int i;
            i=num/10;
            for(int j=0;j<i;j++)
            {
                str.append(hm.get(10));
            }
            num=num%10;
        }
        if(num>=9)
        {
            int i;
            i=num/9;
            for(int j=0;j<i;j++)
            {
                str.append(hm.get(9));
            }
            num=num%9;
        }
        if(num>=5)
        {
            int i;
            i=num/5;
            for(int j=0;j<i;j++)
            {
                str.append(hm.get(5));
            }
            num=num%5;
        }
        if(num>=4)
        {
            int i;
            i=num/4;
            for(int j=0;j<i;j++)
            {
                str.append(hm.get(4));
            }
            num=num%4;
        }
        if(num>=1)
        {
            int i;
            i=num/1;
            for(int j=0;j<i;j++)
            {
                str.append(hm.get(1));
            }
            num=num%1;
        }
        return str.toString();  
        
    }
}