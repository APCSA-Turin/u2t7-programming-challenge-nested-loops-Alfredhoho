package com.example.project;

/*
1.Manually test first in the Runner class.
2.Run ./gradlew test to run automated tests.
3.Once you have completed the challenges, push to your repository.
4.Submit at turninterminal.netlify.app
*/

public class NestedLoops {
               /*
return the string below for given height=5
*
**
***
****
*****  
           */
public static String starStaircase(int height){
    String stairs="";
    for(int i = 0; i < height; i++){
        for(int j = 0; j <= i; j++){
            stairs += "*";
        }
        stairs += "\n";
    }
    
        stairs=stairs.trim();
    
    return stairs;
}
          /*
return the string below for given height=5
*****
****
***
**
*
           */

public static String starStaircaseReverse(int height){
    String reverseStairs="";
    for(int i = height; i > 0; i--){
        for(int j = 0; j < i; j++){
            reverseStairs += "*";
        }
        reverseStairs += "\n";
    }
   
        reverseStairs=reverseStairs.trim();
    
    return reverseStairs;
}
            /*

width=5 height=5
*****
*   *
*   *
*   *
*****
          */
    public static String emptyBox(int width, int height) {
        String box="";
        if(width<2 || height<2){
            return "";
        }

        for(int i=0;i<height;i++){
            for(int j=0;j<width;j++){
                if(i==0 || i==height-1 || j==0 || j==width-1){
                    box+="*";
                }else{
                    box+=" ";
                }
            }
            box+="\n";
        }
        
            box=box.trim();
        
        return box;
    }
                    /*
return the string below for word="HELLO" rows=5                    
HELLO
ELLOH
LLOHE
LOHEL
OHELL

  i will provide a hint for this one if you get stuck.. use modulo
                */
    public static String repeatRectangle(String word, int rows){
        String rectangle="";
        for(int i=0;i<rows;i++){
            for(int j=0;j<word.length();j++){
                rectangle+=word.charAt((i+j)%word.length());
            }
            rectangle+="\n";
        }
        
            rectangle=rectangle.trim();
        
        return rectangle;
    }

}