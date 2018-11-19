package com.hahaqu.competition;

import java.io.*;

public class Competition1 {
    public static void main(String[] args) throws IOException {
        String path = args[0];
        File file = new File(path);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        Competition1 competition1 = new Competition1();
        String formula = null;
        while ((formula = bufferedReader.readLine()) != null) {
            competition1.solve(formula);
        }
        bufferedReader.close();
    }

    private void solve(String formula) {



    }
}
