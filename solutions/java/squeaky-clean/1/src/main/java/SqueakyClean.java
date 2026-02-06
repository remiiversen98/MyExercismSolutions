class SqueakyClean {
    static String clean(String identifier) {
        if (identifier.contains(" ")) identifier = identifier.replace(" ", "_");
        if (identifier.contains("-")) {
            while (identifier.contains("-")) {
                int index = identifier.indexOf('-');

                String before = identifier.substring(0, index);
                String upper = String.valueOf(identifier.charAt(index + 1)).toUpperCase();
                String after  = identifier.substring(index + 2);

                identifier = before + upper + after;
            }
        }

            if (identifier.contains("4")) identifier = identReplace(identifier,'4', 'a');
            if (identifier.contains("3")) identifier = identReplace(identifier, '3', 'e');
            if (identifier.contains("0")) identifier = identReplace(identifier, '0', 'o');
            if (identifier.contains("1")) identifier = identReplace(identifier, '1', 'l');
            if (identifier.contains("7")) identifier = identReplace(identifier, '7', 't');

            identifier = identifier.replaceAll("[^A-Za-z0-9_]","");
        return identifier;
    }
    private static String identReplace(String ident, char oldChar, char newChar) {return ident.replace(oldChar,newChar);}
}
