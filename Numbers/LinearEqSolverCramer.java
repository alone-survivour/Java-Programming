package com.basic2.numbers;

import java.util.Scanner;

public class LinearEqSolverCramer {
	public void calcDeterminantMat(String inputStr){
        //Convert string input to string array and then to integer array
        String[] numsInStrForm = inputStr.split(" ");
        int[] numsInIntForm = new int[numsInStrForm.length];
        for(int i=0; i<numsInStrForm.length; i++){
            numsInIntForm[i]=Integer.parseInt(numsInStrForm[i]);
        }
        //Divide the above integer array into two parts - coefficients mat and constants mat
        if(numsInIntForm.length==6){
            int[][] coffcientArr = new int[2][2];
            int[][] constantsArr = new int[2][1];
            int valuesForcoffcientArr = 0;
            int valuesForconstantsArr = 4;
            for(int j=0; j<coffcientArr.length; j++){
                for(int k=0; k<coffcientArr[j].length; k++){
                    coffcientArr[j][k]=numsInIntForm[valuesForcoffcientArr];
                    valuesForcoffcientArr++;
                }
            }
            for(int l=0; l<constantsArr.length; l++){
                for(int m=0; m<constantsArr[l].length; m++){
                    constantsArr[l][m]=numsInIntForm[valuesForconstantsArr];
                    valuesForconstantsArr++;
                }
            }
            int[][] Dx = new int[2][2];
            for(int n=0; n<Dx.length; n++){
                for(int o=0; o<Dx[n].length; o++){
                    if(n==0 && o==0){
                        Dx[n][o]=constantsArr[0][0];
                    } else if(n==1 && o==0){
                        Dx[n][o]=constantsArr[1][0];
                    } else {
                        Dx[n][o]=coffcientArr[n][o];
                    }
                }
            }
            int[][] Dy = new int[2][2];
            for(int p=0; p<Dy.length; p++){
                for(int q=0; q<Dy[p].length; q++){
                    if(p==0 && q==1){
                        Dy[p][q]=constantsArr[0][0];
                    } else if(p==1 && q==1){
                        Dy[p][q]=constantsArr[1][0];
                    } else {
                        Dy[p][q]=coffcientArr[p][q];
                    }

                }
            }
            int detA = (coffcientArr[0][0]*coffcientArr[1][1]) - (coffcientArr[0][1]*coffcientArr[1][0]);
            int detDx = (Dx[0][0]*Dx[1][1]) - (Dx[0][1]*Dx[1][0]);
            int detDy = (Dy[0][0]*Dy[1][1]) - (Dy[0][1]*Dy[1][0]);
            double variableX = (detDx/detA);
            double variableY = (detDy/detA);
            System.out.println("Solutions are: "+variableX+", and "+variableY);

        } else if(numsInIntForm.length==12){
            int[][] coffcientArr = new int[3][3];
            int[][] constantsArr = new int[3][1];
            int valuesForcoffcientArr = 0;
            int valuesForconstantsArr = 9;
            for(int j=0; j<coffcientArr.length; j++){
                for(int k=0; k<coffcientArr[j].length; k++){
                    coffcientArr[j][k]=numsInIntForm[valuesForcoffcientArr];
                    valuesForcoffcientArr++;
                }
            }
            for(int l=0; l<constantsArr.length; l++){
                for(int m=0; m<constantsArr[l].length; m++){
                    constantsArr[l][m]=numsInIntForm[valuesForconstantsArr];
                    valuesForconstantsArr++;
                }
            }
            int[][] Dx = new int[3][3];
            for(int n=0; n<Dx.length; n++){
                for(int o=0; o<Dx[n].length; o++){
                    if(n==0 && o==0){
                        Dx[n][o]=constantsArr[0][0];
                    } else if(n==1 && o==0){
                        Dx[n][o]=constantsArr[1][0];
                    } else if(n==2 && o==0) {
                        Dx[n][o]=constantsArr[2][0];
                    } else {
                        Dx[n][o]=coffcientArr[n][o];
                    }
                }
            }
            int[][] Dy = new int[3][3];
            for(int p=0; p<Dy.length; p++){
                for(int q=0; q<Dy[p].length; q++){
                    if(p==0 && q==1){
                        Dy[p][q]=constantsArr[0][0];
                    } else if(p==1 && q==1){
                        Dy[p][q]=constantsArr[1][0];
                    } else if(p==2 && q==1){
                        Dy[p][q]=constantsArr[2][0];
                    } else {
                        Dy[p][q]=coffcientArr[p][q];
                    }
                }
            }
            int[][] Dz = new int[3][3];
            for(int r=0; r<Dz.length; r++){
                for(int s=0; s<Dz[r].length; s++){
                    if(r==0 && s==2){
                        Dz[r][s]=constantsArr[0][0];
                    } else if(r==1 && s==2){
                        Dz[r][s]=constantsArr[1][0];
                    } else if(r==2 && s==2){
                        Dz[r][s]=constantsArr[2][0];
                    } else {
                        Dz[r][s]=coffcientArr[r][s];
                    }
                }
            }
            int a = coffcientArr[1][1]*coffcientArr[2][2];
            int b = coffcientArr[2][1]*coffcientArr[1][2];
            int c = coffcientArr[1][0]*coffcientArr[2][2];
            int d = coffcientArr[2][0]*coffcientArr[1][2];
            int e = coffcientArr[1][0]*coffcientArr[2][1];
            int f = coffcientArr[2][0]*coffcientArr[1][1];
            int abCompute = a-b;
            int cdCompute = c-d;
            int efCompute = e-f;
            int part1 = coffcientArr[0][0] * (abCompute);
            int part2 = coffcientArr[0][1] * (cdCompute);
            int part3 = coffcientArr[0][2] * (efCompute);
            int detA33 = part1-part2+part3;

            int g = Dx[1][1]*Dx[2][2];
            int h = Dx[2][1]*Dx[1][2];
            int i = Dx[1][0]*Dx[2][2];
            int j = Dx[2][0]*Dx[1][2];
            int k = Dx[1][0]*Dx[2][1];
            int l = Dx[2][0]*Dx[1][1];
            int ghCompute = g-h;
            int ijCompute = i-j;
            int klCompute = k-l;
            int part4 = Dx[0][0] * (ghCompute);
            int part5 = Dx[0][1] * (ijCompute);
            int part6 = Dx[0][2] * (klCompute);
            int detDx33 = part4-part5+part6;

            int m = Dy[1][1]*Dy[2][2];
            int n = Dy[2][1]*Dy[1][2];
            int o = Dy[1][0]*Dy[2][2];
            int p = Dy[2][0]*Dy[1][2];
            int q = Dy[1][0]*Dy[2][1];
            int r = Dy[2][0]*Dy[1][1];
            int mnCompute = m-n;
            int opCompute = o-p;
            int qrCompute = q-r;
            int part7 = Dy[0][0] * (mnCompute);
            int part8 = Dy[0][1] * (opCompute);
            int part9 = Dy[0][2] * (qrCompute);
            int detDy33 = part7-part8+part9;

            int s = Dz[1][1]*Dz[2][2];
            int t = Dz[2][1]*Dz[1][2];
            int u = Dz[1][0]*Dz[2][2];
            int v = Dz[2][0]*Dz[1][2];
            int w = Dz[1][0]*Dz[2][1];
            int x = Dz[2][0]*Dz[1][1];
            int stCompute = s-t;
            int uvCompute = u-v;
            int wxCompute = w-x;
            int part10 = Dz[0][0] * (stCompute);
            int part11 = Dz[0][1] * (uvCompute);
            int part12 = Dz[0][2] * (wxCompute);
            int detDz33 = part10-part11+part12;
            
            double variableX = detDx33/detA33;
            double variableY = detDy33/detA33;
            double variableZ = detDz33/detA33;

            System.out.println("Solution is: "+variableX+", "+variableY+", and "+variableZ);

            
        } else {
            System.out.println("Input out of range! Kindly check after sometime......");
        }
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coffecients and constants in space seperated pattern: ");
        String userInput = sc.nextLine();
        LinearEqSolverCramer lc = new LinearEqSolverCramer();
        lc.calcDeterminantMat(userInput);
        sc.close();
		
	}

}
