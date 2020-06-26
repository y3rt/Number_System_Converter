class Converter {

    /**
     * It returns a double value or 0 if an exception occurred
     */
    public static double convertStringToDouble(String input) {
        Double iDouble = 0.0;
        try {
            iDouble = Double.parseDouble(input);
        } catch (Exception e) {
            //do something
        }
        return iDouble;
    }
}
