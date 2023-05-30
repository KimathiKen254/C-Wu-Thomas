
public class MyText {
private String word;
private String temp;
private int idx;
public String firstLetter( ) {
idx = 0;
return getLetter(word);
}
public String lastLetter( ) {
idx = word.length() - 1;
return getLetter(word);
}

private String getLetter(String str) {
temp = str.substring(idx, idx+1);
return temp;
}
}
