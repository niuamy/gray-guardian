import java.util.*;
public class grayguardian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String s = "yffjeybyjibdtncbyxyojbkyfaufeacfkqicokjkciptfcyfteelcbdtyjifelqbdtojceqntmdotdctgftjcqkntyiblayjtmiuydfcemckknfkbpcdyuokapngbuftjmafryelftopiccjbfidjyfotpfdircbccimyktlcbykejodippnkexnckakbitnkatfiutgjkfttkddgtyidytfjtlyumkllbfdfjftijtddyepenpjejtiyosntktfsumnkkidjrkdtiycptjoteentnemddbojtfcglqfafymeodgktdettftxfmtbtdyjepanfittojutntdccekcdjmjnncjfidjkkbfdoanebfckmitlimgdpdonneektmecntykkfykoypeotcofdityagddrejiuekrifvoairqtftndikcetedpckjectnktkkkpnckybkfgojktjtkdicscyuytfcttkekrdckjettefkeyfutcoadtctfytfooobeapefmfftetcmictupfkcakjbtyujctatfokkutfyqafmyylbjtffcctpncjfeerbstceelftjkicttfftetotnokkpabnpbjmdcixtatkockjtnpfxiutlfjtjdodidditpmkctmojjteetbnfitxtdttdeittoytkktxketdttoeytkoxikdotnlemdtdtkaicjdecenjljtugtbaakyqfajjjtyltttdodttitcdtobjdkjayeifdmkddcdtdxkttedekkeiminkcyiodejqtiecfdutjokjlkeffetydnuptednckeieljhdltjooytxiyiteekbcgdeybcnjmjecbjcdojfjobtpkjextoouenifkkjocoddirskkdbnjeidiultfceyfcftyttrdciuketkmljximtjtaeviefjecfufoctcktjmnccnjkadfkkbtfecyfjoydukfdfebkycyectjtgfekyjkcyteccfftofcnfeoiytfijkixeyjskfkjrfiryyietftoqeyejjfcjtkefedccktnyjklqtfektikjefpitjinjjjfftnowtbefimderddkupobejrddcpkmtdcgijfbnpcitfeppckijffcebetttnfcjbietkbexernjxbytbkgjnytkjyipyudajeidcekjdceikdyytotfaduffdfbtnrliterffckauktkdcdcnjypnamautkyjqtxitymtfgytptnedifidcrktjmijjdyyecyoltgmfbknqtffjksbyexcqoyytpifitjtgctduttveyotdsfieitdegdeuekjnmlbotcukbgttdccmtkutpeifynjdegttskfijuetexeitcfitokncabbqclftdtckyifcnmecejicjcnidmuyyfpedckkjdtkemfafrcunlidyjckdjejxykucbkuyktnfepfobddtfjtdednuiyxmoycttkdiytinefnbakakdtiadfoeccbyktxbxyutticcoddiltfdloccftttmtbdutaneicxjscedjigkxkfdcndcekkniufjdodpfperybtylenegyaeoaftebrmdd";
//        char[][] preTransposeColumns = getTranspositionColumns(s, 325, 5 );
//        List<List<Character>> columnsList = matrixToList(preTransposeColumns, 325, 5);
//        List<List<List<Character>>> perms = new ArrayList<>();
//        boolean[] b = new boolean[columnsList.size()];
//        heapPermutation(columnsList, new ArrayList<List<Character>>(), perms, b);
        Tetragrams t = new Tetragrams();
        Map<String, Double> tetragrams = t.getTetragrams();
        System.out.println("Enter the number of maximum attempts I should make:\n");
        int maxAttempts = in.nextInt();
        String ct = "kfjytiofmsyfobtjjytdjeouexjkytufbecdyeqtjtonfbyteinydbbtckdfcytipcntiecxfkyticebtdcydjtxtjjyttmodgjtjecngitnfbdcektjkytuyfotfaytijtvdkuejcfkkyekytatokecxtbfkdfcesdckfofqtafiditctenotieootbfkdfcjecnkyekfctgeikdmpoeioxutitelyfiitckkfydjmfongitmdjtlpkenbdieloxleoecmtnbdcnytuejdkestdkkytbfjkgtiatmkitejfcdcrecnfljtiqdcrbemydctkyekkytufionyejjttclpkejeofqtiytufponyeqtgoemtnydbjtoadceaeojtgfjdkdfcytctqtijgfstfakytjfaktigejjdfcjjeqtudkyerdltecnejcttikytxutitenbdielotkydcrjafikytfljtiqtitvmtootckafinieudcrkytqtdoaifbbtcjbfkdqtjecnemkdfcjlpkafikytkiedctnitejfctikfenbdkjpmydckipjdfcjdckfydjfucntodmektecnadctoxenwpjktnktbgtiebtckuejkfdckifnpmtendjkiemkdcraemkfiuydmybdrykkyifuenfplkpgfceooydjbtckeoitjpokjridkdcejtcjdkdqtdcjkipbtckfiemiemsdcfctfaydjfucydrygfutiotcjtjufponcfkltbfitndjkpildcrkyecejkifcrtbfkdfcdcecekpitjpmyejydjecnxtkkytituejlpkfctufbeckfydbecnkyekufbecuejkytoektditctenotifanpldfpjecnhptjkdfcelotbtbfixdyenjttcodkkotfayfobtjoektoxbxbeiidertyennidaktnpjeuexaifbtemyfkytibxfucmfbgotktyeggdctjjecnkytyfbtmtckitndcktitjkjuydmyidjtpgeifpcnkytbecuyfadijkadcnjydbjtoabejktifaydjfuctjkelodjybtckutitjpaadmdtckkfeljfileoobxekktckdfcuydotyfobtjuyfofekytntqtixafibfajfmdtkxudkyydjuyfotlfytbdecjfpoitbedctndcfpiofnrdcrjdclestijkittklpidtnebfcrydjfonlffsjecneokticekdcraifbuttskfuttsltkuttcmfmedctecnebldkdfckytnifujdctjjfakytniprecnkytadtimttctirxfaydjfucsttccekpitytuejjkdooejtqtinttgoxekkiemktnlxkytjkpnxfamidbtecnfmmpgdtnydjdbbtcjtaempokdtjecntvkiefindceixgfutijfafljtiqekdfcdcafoofudcrfpkkyfjtmoptjecnmoteidcrpgkyfjtbxjktidtjuydmyyenlttcelecnfctnejyfgtotjjlxkytfaadmdeogfodmtaifbkdbtkfkdbtdyteinjfbtqerptemmfpckfaydjnfdcrj";
        attempt(maxAttempts,ct,tetragrams);
//        for (int i = 0; i < perms.size(); i++) {
//            String ct = getPreTranspositionCT(perms.get(i));
//            attempt(maxAttempts, ct, tetragrams);
//        }
    }

    public static void attempt(int maxAttempts, String ct, Map<String, Double> tetragrams) {
        //Making the first key.
        Map<Character, Character> keyMap = getKeyMap();

        int attempt = 0;
        int bestAttempt = -1;
        String bestPT = "";
        double bestScore = -1.0;
        double bestCurrentScore = -1.0;
        Map<Character, Character> bestKey = new HashMap<>();
        Map<Character, Character> bestCurrentKey = new HashMap<>();
        boolean shouldTryAgain = false;
        Set<String> usedKeys = new HashSet<>();

        while(attempt < maxAttempts) {
            if(shouldTryAgain) {
                //Struggling to find a new key from this variation, start again with a new random key.
                shouldTryAgain = false;
                bestCurrentScore = -1.0;
                keyMap = getKeyMap();
            } else {
                //Get next key normally.
                shouldTryAgain = nextKey(keyMap, usedKeys);
            }
            String plaintext = decipher(ct, keyMap);
            double score = getScore(plaintext, tetragrams);
            //Higher score is better
            if(score >= bestCurrentScore) {
                bestCurrentScore = score;
                bestCurrentKey.clear();
                bestCurrentKey.putAll(keyMap);
//                System.out.println("\n\n");
//                System.out.println(plaintext);
//                System.out.println(score);
//                System.out.println(keyMap.toString());
//                System.out.println("\n\n");
                if(score >= bestScore) {
                    bestScore = score;
                    bestKey.clear();
                    bestKey.putAll(keyMap);
                    bestPT = plaintext;
                    bestAttempt = attempt;
                }
            } else {
                //Didn't get a better score. Reset back to the current best key so we can find a new one off the current best.
                keyMap.clear();
                keyMap.putAll(bestCurrentKey);
            }

            attempt++;
        }

        System.out.println("Best try on attempt number " + bestAttempt + " scored " + bestScore + ".");
        System.out.println("Key: " + bestKey.toString());
        System.out.println("Plaintext:");
        System.out.println(bestPT);
    }

    /**
     * Creates a new randomized key map.
     * @return a random Map of [ct pair] => [pt char]
     */
    public static Map<Character, Character> getKeyMap() {
        //Without j since it's mixed in with i.
        List<Character> alphabet = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        //Possible row/col combos. lmnop . adfgx
        List<Character> shuffle = new ArrayList<>(alphabet);
        //Shuffle the alphabet.
        Collections.shuffle(shuffle, new Random());

        Map<Character, Character> keyMap = new HashMap<>();
        for(int i = 0; i < shuffle.size(); i++) {
            keyMap.put(shuffle.get(i),alphabet.get(i));
        }

        return keyMap;
    }

    /**
     * Find the next key given the current key and the set of used keys. If a new key can't be found in a timely manner,
     * return true to indicate that we should start over with a brand new random key.
     * @param keyMap - the current key which should be used to find the next key with small changes
     * @param usedKeys - set of keys that have been tried already
     * @return whether or not we should start over with a new key (true if couldn't find an unused key from current key)
     */
    public static boolean nextKey(Map<Character, Character> keyMap, Set<String> usedKeys) {
        Map<Character, Character> keyCopy = new HashMap<>(keyMap);
        int tries = 0;

        //Try to find a new key only a certain number of times before giving up.
        while(usedKeys.contains(keyCopy.toString()) && tries < 100000) {
            keyCopy = new HashMap<>(keyMap);
            changeKey(keyCopy);
            tries++;
        }

        //Either start over with new random key or set the new key and add it to used keys.
        if(tries >= 100000) {
            return true;
        } else {
            keyMap.clear();
            keyMap.putAll(keyCopy);
            usedKeys.add(keyMap.toString());
            return false;
        }
    }

    /**
     * Makes a small change to the key map by swapping values for two keys.
     * @updates keyMap - the map that will be changed
     */
    public static void changeKey(Map<Character, Character> keyMap) {
        Random rand = new Random();
        List<Character> keys = new ArrayList<>(keyMap.keySet());

        //Get random keys to swap.
        char k1 = keys.get(rand.nextInt(keys.size()));
        char k2 = keys.get(rand.nextInt(keys.size()));

        //Swap.
        Character c1 = keyMap.get(k1);
        keyMap.replace(k1, keyMap.get(k2));
        keyMap.replace(k2, c1);
    }

    /**
     * Convert the ciphertext to plaintext given a key map of ct pairs to pt chars.
     * @param ct - the ciphertext to convert
     * @param keyMap - the key map to convert ct pairs to pt characters
     * @return the plaintext
     */
    public static String decipher(String ct, Map<Character, Character> keyMap) {
        StringBuilder pt = new StringBuilder();

        //Get each pair in the ct and find the corresponding pt character from the key map. Add that to the pt.
        for(int i = 0; i < ct.length(); i += 2) {
            pt.append(keyMap.get(ct.charAt(i)));
        }

        return pt.toString();
    }

    /**
     * Score a plaintext using English tetragram frequencies.
     * @param pt - the plaintext to score
     * @return the cumulated score
     */
    public static Double getScore(String pt, Map<String,Double> tetragrams) {
        Double score = 0.0;

        //Go through the
        for(int i = 0; i < pt.length() - 3; i++) {
            String quartet = pt.substring(i, i + 4);
            score += (tetragrams.containsKey(quartet)) ? tetragrams.get(quartet) : 1.0;; //Todo - replace 1 with a check to the tetragram frequencies.
        }

        return score;
    }

    /**
     * Find all possible columns permutations in transposition.
     * @param a list of columns
     * @param perms all possible column permutations
     *
     */
    public static void heapPermutation (List<List<Character>> a, List<List<Character>> temp, List<List<List<Character>>> perms, boolean[] b) {
        if (temp.size() == a.size()) {
            perms.add(new ArrayList<>(temp));
        }

        for (int i = 0; i < a.size(); i++) {
            if(b[i]) continue;
            b[i] = true;
            temp.add(a.get(i));
            heapPermutation(a, temp, perms, b);
            temp.remove(temp.size()-1);
            b[i] = false;
        }
    }

    /**
     * Adds all columns of a matrix into a list.
     * @param columns matrix
     * @param r number of rows of the matrix
     * @param c number of columns of the matrix
     * @return list of columns in the matrix
     */
    public static List<List<Character>> matrixToList(char[][] columns, int r, int c) {
        List<List<Character>> allCols = new ArrayList<>();
        List<Character> col = new ArrayList<>();
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                col.add(col.size(),columns[j][i]);
            }
            allCols.add(col);
            col = new ArrayList<>();
        }
        return allCols;
    }

    /**
     * Find the ciphertext pre-transposition.
     * @param columns list of all columns in transposition table
     * @return the pre-transposition ciphertext
     */
    public static String getPreTranspositionCT(List<List<Character>> columns) {
        StringBuilder ct = new StringBuilder();
        for (int i = 0; i < columns.get(0).size(); i++) {
            for (int j = 0; j < columns.size(); j++) {
                ct.append(columns.get(j).get(i));
            }
        }
        return ct.toString();
    }

    /**
     * Gets the columns from the transposition table.
     * @param s the initial ciphertext
     * @param r the number of rows of the transposition table
     * @param c the columns of columns of the transposition table
     * @return a matrix of the ciphertext
     */
    public static char[][] getTranspositionColumns(String s, int r, int c) {
        char[][] transpositionColumns = new char[r][c];
        int charCount = 0;
        for (int i = 0; i < c; i ++) {
            for (int j = 0; j < r; j++) {
                transpositionColumns[j][i] = s.charAt(charCount);
                charCount++;
            }
        }
        return transpositionColumns;
    }

    /**
     * Prints out a matrix.
     * @param columns the matrix to be printed
     */
    public static void printMatrix(char[][] columns) {
        for (int i = 0; i < columns.length;i ++) {
            for (int j = 0; j < columns[i].length; j++) {
                System.out.print(columns[i][j] + " ");
            }
            System.out.println();
        }
    }
}
