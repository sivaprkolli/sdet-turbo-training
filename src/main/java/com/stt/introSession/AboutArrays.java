package com.stt.introSession;

public class AboutArrays {

    public static void main(String[] args) {
        int[] a = {1,2,4,5,6,78,9,90,0,8,3,1,4,6};
        String[] s = {"Selenium", "Playwright", "WebDriverIO"};
        char[] c = {'s','e','l','e','n','i','u','m'};

        System.out.println(a[5]);
        //System.out.println(a[19]);
        System.out.println(a.length);

        for(int i=0; i< a.length; i++){
            System.out.println(a[i]);
        }

        System.out.println(s[2]);
        System.out.println(s.length);

        System.out.println(c[4]);
        System.out.println(c.length);

        //need to check
        int[][] aa = {{12,4,5,6,7,8,8},
                      {14,6,7,8,9,0,0}};

        /*System.out.println(aa[0][0]);
        System.out.println(aa[1][0]);*/
        System.out.println("****************************");
        for(int i=0; i<aa[i].length; i++){
            for(int j=0; j<aa[i].length; j++){
                System.out.println(aa[i][j]);
            }
        }


    }
}
