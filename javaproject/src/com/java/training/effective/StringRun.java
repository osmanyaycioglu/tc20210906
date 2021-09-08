package com.java.training.effective;

public class StringRun {

    public static void main(final String[] args) {
        String stringLoc = new String("osman"); // UTF-16
        int i = 10;
        Integer in = 10;
        if (i == 10) {
            System.out.println("eşit");
        }
        if (stringLoc.equals("osman")) {
            System.out.println("String osman a eşit");
        }
        long delta = System.currentTimeMillis();
        String hs = "test";
        for (int jLoc = 0; jLoc < 1; jLoc++) {
            hs += " " + jLoc;
        }
        System.out.println("Delta : " + (System.currentTimeMillis() - delta));


        StringBuilder sb = new StringBuilder();
        delta = System.currentTimeMillis();
        for (int jLoc = 0; jLoc < 100_000; jLoc++) {
            sb.append(" ")
              .append(jLoc);
        }
        System.out.println("SB Delta : " + (System.currentTimeMillis() - delta));

        delta = System.currentTimeMillis();
        for (int jLoc = 0; jLoc < 100_000; jLoc++) {
            String hs2 = "test " + i + stringLoc + " " + in;
        }
        System.out.println("CONCAT Delta : " + (System.currentTimeMillis() - delta));


        delta = System.currentTimeMillis();
        for (int jLoc = 0; jLoc < 100_000; jLoc++) {
            String h3 = String.format("test %d %s %d",
                                      i,
                                      stringLoc,
                                      in);
        }
        System.out.println("FORMAT Delta : " + (System.currentTimeMillis() - delta));

        //        Logger.debug("test {} {} {}",
        //                    i,
        //                    stringLoc,
        //                    in);
        //
        //        if (logger.isDebugEnabled()) {
        //            logger.debug("test " + i + stringLoc + " " + in);
        //        }
        //)
        //        Logger.debug("test " + i + stringLoc + " " + in);

    }
}
