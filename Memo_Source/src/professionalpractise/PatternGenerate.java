/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professionalpractise;

/**
 *
 * @author prathibha
 */
public class PatternGenerate {
    
    public int[] FillNumberCombinationArryAge(String number){
        
        int[] intnumber=new int[2];
        int age[] = new int[5];
        intnumber[0]= number.charAt(0)-48;
        intnumber[1]= number.charAt(1)-48;
        
        int normal= Integer.parseInt(number);
        int addboth = intnumber[0]+intnumber[1];
        int mulboth = intnumber[0]*intnumber[1];
        
        
        age[0]= normal;
        age[1]= addboth;
        age[2]= mulboth;
        age[3]= number.charAt(0)-48;
        age[4]= number.charAt(1)-48;
        //for(int x:age){
        //    System.out.println(x);
        //}
        return age;
    } 
    
    public int[] FillNumberCombinationArryFnumber(String number){
        
        int[] intnumber=new int[2];
        int fnumber[] = new int[5];
        intnumber[0]= number.charAt(0)-48;
        intnumber[1]= number.charAt(1)-48;
        
        int normal= Integer.parseInt(number);
        int addboth = intnumber[0]+intnumber[1];
        int mulboth = intnumber[0]*intnumber[1];
        
        
        fnumber[0]= normal;
        fnumber[1]= addboth;
        fnumber[2]= mulboth;
        fnumber[3]= number.charAt(0)-48;
        fnumber[4]= number.charAt(1)-48;
        //for(int x:age){
        //    System.out.println(x);
        //}
        return fnumber;
    }  
    
    public int[] FillNumberCombinationArryFmembers(String number){
        
        int[] intnumber=new int[2];
        int fmembers[] = new int[5];
        intnumber[0]= number.charAt(0)-48;
        intnumber[1]= number.charAt(1)-48;
        
        int normal= Integer.parseInt(number);
        int addboth = intnumber[0]+intnumber[1];
        int mulboth = intnumber[0]*intnumber[1];
        
        
        fmembers[0]= normal;
        fmembers[1]= addboth;
        fmembers[2]= mulboth;
        fmembers[3]= number.charAt(0)-48;
        fmembers[4]= number.charAt(1)-48;
        //for(int x:age){
        //    System.out.println(x);
        //}
        return fmembers;
    }  
    
    public int[] FillNumberCombinationArryBirthMonth(String number){
        
        int[] intnumber=new int[2];
        int birthmonth[] = new int[5];
        intnumber[0]= number.charAt(0)-48;
        intnumber[1]= number.charAt(1)-48;
        
        int normal= Integer.parseInt(number);
        int addboth = intnumber[0]+intnumber[1];
        int mulboth = intnumber[0]*intnumber[1];
        
        
        birthmonth[0]= normal;
        birthmonth[1]= addboth;
        birthmonth[2]= mulboth;
        birthmonth[3]= number.charAt(0)-48;
        birthmonth[4]= number.charAt(1)-48;
        //for(int x:birthmonth){
        //    System.out.println(x);
        //}
        return birthmonth;
    }
    
    public int[] FillNumberCombinationArryBirthDay(String number){
        
        int[] intnumber=new int[2];
        int birthday[] = new int[5];
        intnumber[0]= number.charAt(0)-48;
        intnumber[1]= number.charAt(1)-48;
        
        int normal= Integer.parseInt(number);
        int addboth = intnumber[0]+intnumber[1];
        int mulboth = intnumber[0]*intnumber[1];
        
        
        birthday[0]= normal;
        birthday[1]= addboth;
        birthday[2]= mulboth;
        birthday[3]= number.charAt(0)-48;
        birthday[4]= number.charAt(1)-48;
        //for(int x:birthday){
        //    System.out.println(x);
        //}
        return birthday;
    }
    
    
    
    public String[] FinalpatternGenerate(int[] age,int[] birthMonth,int[] bathDay){
        
        String finalDtails[]=new String[4];
        String pattern = "";
        String patternDetails = "";
        String patternNormal = "";
        String patternDetailsH = "";
        String[] patternage = {"|Your age|","|Age number addition|","|Age number Multiply|"};
        String[] patternday = {"|Your birthday|","|Day number addition|","|Day number Multiply|"};
        String[] patternmonth = {"|Your birthmonth|","|Month number addition|","|Month number Multiply|"};
        //String[] patternfnumber = {"|Your favourite number|","|Favourite number addition|","|Favourite number Multiply|"};
        //String[] patternfmembers = {"|Your family members|","|Members number addition|","|Members number Multiply|"};
        
        for(int i=0;i<3;i++){
             int random =(int )(Math. random() * 3 );
             int random2 =(int )(Math. random() * 3 );
             //System.out.println(random);
             
             //s+=""+ar1[random];
             //System.out.println("r1-"+random);
             //System.out.println("r2-"+random2);
             if(random==0){
                 if(random2==1){
                     patternDetailsH+="<html><h2>"+age[random2]+"-"+patternage[random2]+"|Age-"+age[0]+"->"+age[3]+"+"+age[4]+"|\n";
                 }
                 else if(random2==2){
                     patternDetailsH+="<html><h2>"+age[random2]+"-"+patternage[random2]+"|Age-"+age[0]+"->"+age[3]+"x"+age[4]+"|\n";
                 }
                 else{
                     patternDetailsH+="<html><h2>"+age[random2]+"-"+patternage[random2]+"\n";
                 }
                pattern+=" "+age[random2];
                patternDetails+=""+patternage[random2]+" ";
                patternNormal+=age[random2];
                //patternDetailsH+=age[random2]+"-"+patternage[random2]+"\n";
             }
             else if(random==1){
                 if(random2==1){
                     patternDetailsH+="<html><h2>"+birthMonth[random2]+"-"+patternmonth[random2]+"|Month-"+birthMonth[0]+"->"+birthMonth[3]+"+"+birthMonth[4]+"|\n";
                 }
                 else if(random2==2){
                     patternDetailsH+="<html><h2>"+birthMonth[random2]+"-"+patternmonth[random2]+"|Month-"+birthMonth[0]+"->"+birthMonth[3]+"x"+birthMonth[4]+"|\n";
                 }
                 else{
                     patternDetailsH+="<html><h2>"+birthMonth[random2]+"-"+patternmonth[random2]+"\n";
                 }
                 
                pattern+=" "+birthMonth[random2];
                patternDetails+=""+patternmonth[random2]+" ";
                patternNormal+=birthMonth[random2];
                //patternDetailsH+=birthMonth[random2]+"-"+patternday[random2]+"\n";
             }
             else if(random==2){
                 if(random2==1){
                     patternDetailsH+="<html><h2>"+bathDay[random2]+"-"+patternday[random2]+"|Day-"+bathDay[0]+"->"+bathDay[3]+"+"+bathDay[4]+"|\n";
                 }
                 else if(random2==2){
                     patternDetailsH+="<html><h2>"+bathDay[random2]+"-"+patternday[random2]+"|Day-"+bathDay[0]+"->"+bathDay[3]+"x"+bathDay[4]+"|\n";
                 }
                 else{
                     patternDetailsH+="<html><h2>"+bathDay[random2]+"-"+patternday[random2]+"\n";
                 }
                pattern+=" "+bathDay[random2];
                patternDetails+=""+patternday[random2]+" ";
                patternNormal+=bathDay[random2];
                //patternDetailsH+=bathDay[random2]+"-"+patternmonth[random2]+"\n";
             }
             //s2+=""+random2;
             
             
         }
        finalDtails[0]=pattern;
        finalDtails[1]=patternDetails;
        finalDtails[2]=patternNormal;
        finalDtails[3]=patternDetailsH;
        //System.out.println("pat - "+pattern);    
        return finalDtails;
            
    }
    
    public String[] FinalpatternGenerate2(int[] age,int[] birthMonth,int[] bathDay,int[] fnumber,int[] fmembers){
        
        String finalDtails[]=new String[4];
        String pattern = "";
        String patternDetails = "";
        String patternNormal = "";
        String patternDetailsH = "";
        String[] patternage = {"|Your age|","|Age number addition|","|Age number Multiply|"};
        String[] patternday = {"|Your birthday|","|Day number addition|","|Day number Multiply|"};
        String[] patternmonth = {"|Your birthmonth|","|Month number addition|","|Month number Multiply|"};
        String[] patternfnumber = {"|Your favourite number|","|Favourite number addition|","|Favourite number Multiply|"};
        String[] patternfmembers = {"|Your family members|","|Members number addition|","|Members number Multiply|"};
        
        for(int i=0;i<5;i++){
             int random =(int )(Math. random() * 5 );
             int random2 =(int )(Math. random() * 3 );
             //System.out.println(random);
             
             //s+=""+ar1[random];
             //System.out.println("r1-"+random);
             //System.out.println("r2-"+random2);
             if(random==0){
                 if(random2==1){
                     patternDetailsH+="<html><h2>"+age[random2]+"-"+patternage[random2]+"|Age-"+age[0]+"->"+age[3]+"+"+age[4]+"|\n";
                 }
                 else if(random2==2){
                     patternDetailsH+="<html><h2>"+age[random2]+"-"+patternage[random2]+"|Age-"+age[0]+"->"+age[3]+"x"+age[4]+"|\n";
                 }
                 else{
                     patternDetailsH+="<html><h2>"+age[random2]+"-"+patternage[random2]+"\n";
                 }
                pattern+=" "+age[random2];
                patternDetails+=""+patternage[random2]+" ";
                patternNormal+=age[random2];
                //patternDetailsH+=age[random2]+"-"+patternage[random2]+"\n";
             }
             else if(random==1){
                 if(random2==1){
                     patternDetailsH+="<html><h2>"+birthMonth[random2]+"-"+patternmonth[random2]+"|Month-"+birthMonth[0]+"->"+birthMonth[3]+"+"+birthMonth[4]+"|\n";
                 }
                 else if(random2==2){
                     patternDetailsH+="<html><h2>"+birthMonth[random2]+"-"+patternmonth[random2]+"|Month-"+birthMonth[0]+"->"+birthMonth[3]+"x"+birthMonth[4]+"|\n";
                 }
                 else{
                     patternDetailsH+="<html><h2>"+birthMonth[random2]+"-"+patternmonth[random2]+"\n";
                 }
                 
                pattern+=" "+birthMonth[random2];
                patternDetails+=""+patternmonth[random2]+" ";
                patternNormal+=birthMonth[random2];
                //patternDetailsH+=birthMonth[random2]+"-"+patternday[random2]+"\n";
             }
             else if(random==2){
                 if(random2==1){
                     patternDetailsH+="<html><h2>"+bathDay[random2]+"-"+patternday[random2]+"|Day-"+bathDay[0]+"->"+bathDay[3]+"+"+bathDay[4]+"|\n";
                 }
                 else if(random2==2){
                     patternDetailsH+="<html><h2>"+bathDay[random2]+"-"+patternday[random2]+"|Day-"+bathDay[0]+"->"+bathDay[3]+"x"+bathDay[4]+"|\n";
                 }
                 else{
                     patternDetailsH+="<html><h2>"+bathDay[random2]+"-"+patternday[random2]+"\n";
                 }
                pattern+=" "+bathDay[random2];
                patternDetails+=""+patternday[random2]+" ";
                patternNormal+=bathDay[random2];
                //patternDetailsH+=bathDay[random2]+"-"+patternmonth[random2]+"\n";
             }
             else if(random==3){
                 if(random2==1){
                     patternDetailsH+="<html><h2>"+fnumber[random2]+"-"+patternfnumber[random2]+"|Favourite number-"+fnumber[0]+"->"+fnumber[3]+"+"+fnumber[4]+"|\n";
                 }
                 else if(random2==2){
                     patternDetailsH+="<html><h2>"+fnumber[random2]+"-"+patternfnumber[random2]+"|Favourite number-"+fnumber[0]+"->"+fnumber[3]+"x"+fnumber[4]+"|\n";
                 }
                 else{
                     patternDetailsH+="<html><h2>"+fnumber[random2]+"-"+patternfnumber[random2]+"\n";
                 }
                 
                pattern+=" "+fnumber[random2];
                patternDetails+=""+patternfnumber[random2]+" ";
                patternNormal+=fnumber[random2];
                //patternDetailsH+=birthMonth[random2]+"-"+patternday[random2]+"\n";
             }
             else if(random==4){
                 if(random2==1){
                     patternDetailsH+="<html><h2>"+fmembers[random2]+"-"+patternfmembers[random2]+"|Family members-"+fmembers[0]+"->"+fmembers[3]+"+"+fmembers[4]+"|\n";
                 }
                 else if(random2==2){
                     patternDetailsH+="<html><h2>"+fmembers[random2]+"-"+patternfmembers[random2]+"|Family members-"+fmembers[0]+"->"+fmembers[3]+"x"+fmembers[4]+"|\n";
                 }
                 else{
                     patternDetailsH+="<html><h2>"+fmembers[random2]+"-"+patternfmembers[random2]+"\n";
                 }
                 
                pattern+=" "+fmembers[random2];
                patternDetails+=""+patternfmembers[random2]+" ";
                patternNormal+=fmembers[random2];
                //patternDetailsH+=birthMonth[random2]+"-"+patternday[random2]+"\n";
             }
             //s2+=""+random2;
             
             
         }
        finalDtails[0]=pattern;
        finalDtails[1]=patternDetails;
        finalDtails[2]=patternNormal;
        finalDtails[3]=patternDetailsH;
        //System.out.println("pat - "+pattern);    
        return finalDtails;
            
    }
    
    public String[] FinalpatternGenerate3(int[] age,int[] birthMonth,int[] bathDay,int[] fnumber,int[] fmembers){
        
        String finalDtails[]=new String[7];
        String pattern = "";
        String patternDetails = "";
        String patternNormal = "";
        String patternDetailsH = "";
        String patternDetailsH1 = "";
        String patternDetailsH2 = "";
        String patternDetailsH3 = "";
        String[] patternage = {"|Your age|","|Age number addition|","|Age number Multiply|"};
        String[] patternday = {"|Your birthday|","|Day number addition|","|Day number Multiply|"};
        String[] patternmonth = {"|Your birthmonth|","|Month number addition|","|Month number Multiply|"};
        String[] patternfnumber = {"|Your favourite number|","|Favourite number addition|","|Favourite number Multiply|"};
        String[] patternfmembers = {"|Your family members|","|Members number addition|","|Members number Multiply|"};
        
        for(int i=0;i<5;i++){
             int random =(int )(Math. random() * 5 );
             int random2 =(int )(Math. random() * 3 );
             //System.out.println(random);
             
             //s+=""+ar1[random];
             //System.out.println("r1-"+random);
             //System.out.println("r2-"+random2);
             if(random==0){
                 if(random2==1){
                     patternDetailsH+="<html><h2>"+age[random2]+"-"+patternage[random2]+"|Age-"+age[0]+"->"+age[3]+"+"+age[4]+"|\n";
                     patternDetailsH1+="<html><h2>"+age[random2];
                     patternDetailsH2+="<html><h2>"+patternage[random2];
                     patternDetailsH3+="<html><h2>"+age[1]+"->"+age[3]+"+"+age[4];
                 }
                 else if(random2==2){
                     patternDetailsH+="<html><h2>"+age[random2]+"-"+patternage[random2]+"|Age-"+age[0]+"->"+age[3]+"x"+age[4]+"|\n";
                     patternDetailsH1+="<html><h2>"+age[random2];
                     patternDetailsH2+="<html><h2>"+patternage[random2];
                     patternDetailsH3+="<html><h2>"+age[2]+"->"+age[3]+"x"+age[4];
                 }
                 else{
                     patternDetailsH+="<html><h2>"+age[random2]+"-"+patternage[random2]+"\n";
                     patternDetailsH1+="<html><h2>"+age[random2];
                     patternDetailsH2+="<html><h2>"+patternage[random2];
                     patternDetailsH3+="<html><h2>------";
                 }
                pattern+=" "+age[random2];
                patternDetails+=""+patternage[random2]+" ";
                patternNormal+=age[random2];
                //patternDetailsH+=age[random2]+"-"+patternage[random2]+"\n";
             }
             else if(random==1){
                 if(random2==1){
                     patternDetailsH+="<html><h2>"+birthMonth[random2]+"-"+patternmonth[random2]+"|Month-"+birthMonth[0]+"->"+birthMonth[3]+"+"+birthMonth[4]+"|\n";
                     patternDetailsH1+="<html><h2>"+birthMonth[random2];
                     patternDetailsH2+="<html><h2>"+patternmonth[random2];
                     patternDetailsH3+="<html><h2>"+birthMonth[1]+"->"+birthMonth[3]+"+"+birthMonth[4];
                 }
                 
                 else if(random2==2){
                     patternDetailsH+="<html><h2>"+birthMonth[random2]+"-"+patternmonth[random2]+"|Month-"+birthMonth[0]+"->"+birthMonth[3]+"x"+birthMonth[4]+"|\n";
                     patternDetailsH1+="<html><h2>"+birthMonth[random2];
                     patternDetailsH2+="<html><h2>"+patternmonth[random2];
                     patternDetailsH3+="<html><h2>"+birthMonth[2]+"->"+birthMonth[3]+"x"+birthMonth[4];
                 }
                 else{
                     patternDetailsH+="<html><h2>"+birthMonth[random2]+"-"+patternmonth[random2]+"\n";
                     patternDetailsH1+="<html><h2>"+birthMonth[random2];
                     patternDetailsH2+="<html><h2>"+patternmonth[random2];
                     patternDetailsH3+="<html><h2>------";
                 }
                 
                pattern+=" "+birthMonth[random2];
                patternDetails+=""+patternmonth[random2]+" ";
                patternNormal+=birthMonth[random2];
                //patternDetailsH+=birthMonth[random2]+"-"+patternday[random2]+"\n";
             }
             else if(random==2){
                 if(random2==1){
                     patternDetailsH+="<html><h2>"+bathDay[random2]+"-"+patternday[random2]+"|Day-"+bathDay[0]+"->"+bathDay[3]+"+"+bathDay[4]+"|\n";
                     patternDetailsH1+="<html><h2>"+bathDay[random2];
                     patternDetailsH2+="<html><h2>"+patternday[random2];
                     patternDetailsH3+="<html><h2>"+bathDay[1]+"->"+bathDay[3]+"+"+bathDay[4];
                 }
                 else if(random2==2){
                     patternDetailsH+="<html><h2>"+bathDay[random2]+"-"+patternday[random2]+"|Day-"+bathDay[0]+"->"+bathDay[3]+"x"+bathDay[4]+"|\n";
                     patternDetailsH1+="<html><h2>"+bathDay[random2];
                     patternDetailsH2+="<html><h2>"+patternday[random2];
                     patternDetailsH3+="<html><h2>"+bathDay[2]+"->"+bathDay[3]+"x"+bathDay[4];
                 }
                 else{
                     patternDetailsH+="<html><h2>"+bathDay[random2]+"-"+patternday[random2]+"\n";
                     patternDetailsH1+="<html><h2>"+bathDay[random2];
                     patternDetailsH2+="<html><h2>"+patternday[random2];
                     patternDetailsH3+="<html><h2>------";
                     
                 }
                pattern+=" "+bathDay[random2];
                patternDetails+=""+patternday[random2]+" ";
                patternNormal+=bathDay[random2];
                //patternDetailsH+=bathDay[random2]+"-"+patternmonth[random2]+"\n";
             }
             else if(random==3){
                 if(random2==1){
                     patternDetailsH+="<html><h2>"+fnumber[random2]+"-"+patternfnumber[random2]+"|Favourite number-"+fnumber[0]+"->"+fnumber[3]+"+"+fnumber[4]+"|\n";
                     patternDetailsH1+="<html><h2>"+fnumber[random2];
                     patternDetailsH2+="<html><h2>"+patternfnumber[random2];
                     patternDetailsH3+="<html><h2>"+fnumber[1]+"->"+fnumber[3]+"+"+fnumber[4];
                 }
                 else if(random2==2){
                     patternDetailsH+="<html><h2>"+fnumber[random2]+"-"+patternfnumber[random2]+"|Favourite number-"+fnumber[0]+"->"+fnumber[3]+"x"+fnumber[4]+"|\n";
                     patternDetailsH1+="<html><h2>"+fnumber[random2];
                     patternDetailsH2+="<html><h2>"+patternfnumber[random2];
                     patternDetailsH3+="<html><h2>"+fnumber[2]+"->"+fnumber[3]+"x"+fnumber[4];
                 }
                 else{
                     patternDetailsH+="<html><h2>"+fnumber[random2]+"-"+patternfnumber[random2]+"\n";
                     patternDetailsH1+="<html><h2>"+fnumber[random2];
                     patternDetailsH2+="<html><h2>"+patternfnumber[random2];
                     patternDetailsH3+="<html><h2>------";
                     
                 }
                 
                pattern+=" "+fnumber[random2];
                patternDetails+=""+patternfnumber[random2]+" ";
                patternNormal+=fnumber[random2];
                //patternDetailsH+=birthMonth[random2]+"-"+patternday[random2]+"\n";
             }
             else if(random==4){
                 if(random2==1){
                     patternDetailsH+="<html><h2>"+fmembers[random2]+"-"+patternfmembers[random2]+"|Family members-"+fmembers[0]+"->"+fmembers[3]+"+"+fmembers[4]+"|\n";
                     patternDetailsH1+="<html><h2>"+fmembers[random2];
                     patternDetailsH2+="<html><h2>"+patternfmembers[random2];
                     patternDetailsH3+="<html><h2>"+fmembers[1]+"->"+fmembers[3]+"+"+fmembers[4];
                 }
                 else if(random2==2){
                     patternDetailsH+="<html><h2>"+fmembers[random2]+"-"+patternfmembers[random2]+"|Family members-"+fmembers[0]+"->"+fmembers[3]+"x"+fmembers[4]+"|\n";
                     patternDetailsH1+="<html><h2>"+fmembers[random2];
                     patternDetailsH2+="<html><h2>"+patternfmembers[random2];
                     patternDetailsH3+="<html><h2>"+fmembers[2]+"->"+fmembers[3]+"x"+fmembers[4];
                 }
                 else{
                     patternDetailsH+="<html><h2>"+fmembers[random2]+"-"+patternfmembers[random2]+"\n";
                     patternDetailsH1+="<html><h2>"+fmembers[random2];
                    patternDetailsH2+="<html><h2>"+patternfmembers[random2];
                    patternDetailsH3+="<html><h2>------";
                     
                 }
                 
                pattern+=" "+fmembers[random2];
                patternDetails+=""+patternfmembers[random2]+" ";
                patternNormal+=fmembers[random2];
                //patternDetailsH+=birthMonth[random2]+"-"+patternday[random2]+"\n";
             }
             //s2+=""+random2;
             
             
         }
        finalDtails[0]=pattern;
        finalDtails[1]=patternDetails;
        finalDtails[2]=patternNormal;
        finalDtails[3]=patternDetailsH;
        finalDtails[4]=patternDetailsH1;
        finalDtails[5]=patternDetailsH2;
        finalDtails[6]=patternDetailsH3;
        
        //System.out.println("pat - "+pattern);    
        return finalDtails;
            
    }
    
    public static void main(String args[]){
        
        PatternGenerate pg=new PatternGenerate();
        String[] s=pg.FinalpatternGenerate(pg.FillNumberCombinationArryAge("24"), pg.FillNumberCombinationArryBirthDay("12"), pg.FillNumberCombinationArryBirthMonth("11"));
        String[] s2=pg.FinalpatternGenerate(pg.FillNumberCombinationArryAge("24"), pg.FillNumberCombinationArryBirthDay("12"), pg.FillNumberCombinationArryBirthMonth("11"));
        String[] s3=pg.FinalpatternGenerate(pg.FillNumberCombinationArryAge("24"), pg.FillNumberCombinationArryBirthDay("12"), pg.FillNumberCombinationArryBirthMonth("11"));
        String[] s4=pg.FinalpatternGenerate(pg.FillNumberCombinationArryAge("24"), pg.FillNumberCombinationArryBirthDay("12"), pg.FillNumberCombinationArryBirthMonth("11"));
        String[] s5=pg.FinalpatternGenerate(pg.FillNumberCombinationArryAge("24"), pg.FillNumberCombinationArryBirthDay("12"), pg.FillNumberCombinationArryBirthMonth("11"));
        
        System.out.println(s[2]);
        System.out.println(s[0]);
        //System.out.println(s[1]);
        System.out.println(s[3]);
        System.out.println("---------------------------");
        System.out.println(s2[2]);
         System.out.println(s2[0]);
        //System.out.println(s2[1]);
        System.out.println(s2[3]);
        System.out.println("---------------------------");
        System.out.println(s3[2]);
         System.out.println(s3[0]);
        //System.out.println(s3[1]);
        System.out.println(s3[3]);
        System.out.println("---------------------------");
        System.out.println(s4[2]);
         System.out.println(s4[0]);
        //System.out.println(s4[1]);
        System.out.println(s4[3]);
        System.out.println("---------------------------");
        System.out.println(s5[2]);
         System.out.println(s5[0]);
        //System.out.println(s5[1]);
        System.out.println(s5[3]);
        System.out.println("---------------------------");
        
        

    }
    
    
    
}
