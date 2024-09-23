isAnagramc static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) {
        return false;
    }

    a = a.toLowerCase();
    b = b.toLowerCase();
    int[] charCountA = new int[26];  // Assuming only lowercase English letters
    int[] charCountB = new int[26];
 
    for (int i = 0; i < a.length(); i++) {
        charCountA[a.charAt(i) - 'a']++;
        charCountB[b.charAt(i) - 'a']++;
    }
    
    for (int i = 0; i < 26; i++) {
        if (charCountA[i] != charCountB[i]) {
            return false;
        }
    }
    return true;
}
