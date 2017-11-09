package com.vinod.analytical;

public class ReverseWordsOfString {
	
	//Words position should reversed not words
	public static String reverseOnlyWords(String[] strArr){
		
		StringBuilder sb = new StringBuilder();
		int len = strArr.length;
		//To reverse only words of sentence.		
				for(int i = len-1; i>=0; i--)
				{
					sb.append(strArr[i]).append(" ");
				}
				
	return	sb.toString();		
	}
	//Reverse sentence along with its words
	public static String reverseWorldAndSentence(String[] strArr) {
        StringBuilder strBuilder = new StringBuilder();
        int len = strArr.length;
        
        for(int i =0; i< len ; i++){
        	
        	StringBuilder sb = new StringBuilder(strArr[i]);
        	
        	 strBuilder.append(sb.reverse()).append(" ");
        	// System.out.println("strBuilder: "+strBuilder);
        }
                
        return strBuilder.toString();
    }

	public static void main(String[] args) {
		String str ="Welcome Vinod Paliwal";
		
		String[] strArr=	str.split(" ");
		
		System.out.println("Reversed only Words :"+reverseOnlyWords(strArr));

		//To reverse characters along with words.		
		System.out.println("Reversed Words and sentence :"+ reverseWorldAndSentence(strArr));
	}
}
