public class FindTheFlag {
    public static void main(String[] args) {
        int targetHash1 = 1471587914;
        int targetHash2 = 1472541258;

        // Iterate through all possible 6-character alphanumeric combinations
        for (char c1 = '0'; c1 <= 'z'; c1++) {
            for (char c2 = '0'; c2 <= 'z'; c2++) {
                for (char c3 = '0'; c3 <= 'z'; c3++) {
                    for (char c4 = '0'; c4 <= 'z'; c4++) {
                        for (char c5 = '0'; c5 <= 'z'; c5++) {
                            for (char c6 = '0'; c6 <= 'z'; c6++) {
                                String candidate = "" + c1 + c2 + c3 + c4 + c5 + c6;

                                // Check both hash conditions
                                if (candidate.hashCode() == targetHash1 &&
                                    candidate.toLowerCase().hashCode() == targetHash2) {
                                    System.out.println("Flag found: " + candidate);
                                    return; // Exit once the flag is found
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
