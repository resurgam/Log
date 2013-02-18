import java.io.*;

public class Vowcon{
public static void main(String a[]) throws Exception {

BufferedReader rd = new BufferedReader(new InputStreamReader(System.in)); System.out.println("Enter text:"); String str = rd.readLine();

int cons = 0, vow = 0, consU =0, vowU = 0, consL = 0, vowL = 0, num = 0, other = 0, sp = 0;
for(int y=0;y<str.length();y++) { int asc = (int)str.charAt(y);
if(asc==97||asc==101||asc==105||asc==111||asc==117) {

vow++; vowL++;
} else if(asc==65||asc==69||asc==73||asc==79||asc==85) {

vow++; vowU++;
} else if((asc>97&&asc<101)||(asc>101&&asc<105)||(asc>105&&asc<111)||(asc>111&&asc<117)||(asc>117&&asc<123)) {

cons++; consL++;
} else if((asc>65&&asc<69)||(asc>69&&asc<73)||(asc>73&&asc<79)||(asc>79&&asc<85)||(asc>85&&asc<91)) {

cons++; consU++;
} else if((asc>47&&asc<58)){

num++;
} else if(asc==32){

sp++;
} else {

other++;
}
}
System.out.println("count of upper case vowels: " + vowU); System.out.println("num of lower case vowels: " + vowL); System.out.println("all vowels: " + vow); 
System.out.println("num of upper case consonants: " + consU); System.out.println("num of lower case consonants: " + consL); System.out.println("all consonants: " + cons); 
System.out.println("num of number characters: " + num); System.out.println("num of spaces: " + sp); System.out.println("other characters: " + other);
}
} 