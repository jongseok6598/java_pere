package kcw;

import java.util.Scanner;

public class Kcw {
    public static void main(String[] args) {
        int cnt=1;
        int c=0;
        int result=0;
        String menus[] = new String[3];
        while(cnt<=3){
            System.out.println("스타벅스에 오신 걸 환영합니다.");
            System.out.println("1번 커피");
            System.out.println("2번 에이드");
            System.out.println("3번 케이크");
            System.out.println("4번 빵");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            if(num==1){
                menus[c]="커피";
                c++;
                System.out.println("1번 아메리카노 4000");
                System.out.println("2번 라떼 4200");
                System.out.println("3번 콜드브루 4500");
                System.out.println("4번 믹스커피 4000");
                Scanner sc1 = new Scanner(System.in);
                int n = sc1.nextInt();
                if(n==1){
                    System.out.println("아메리카노를 선택하셨습니다.");
                    result+=4000;
                }
                else if(n==2){
                    System.out.println("라떼를 선택하셨습니다.");
                    result+=4200;
                }
                else if(n==3){
                    System.out.println("콜드브루를 선택하셨습니다.");
                    result+=4500;
                }
                else{
                    System.out.println("믹스커피를 선택하셨습니다.");
                    result+=4000;
                }
                System.out.println("다른 메뉴를 선택하시겠습니까?");
                System.out.println("1번 YES");
                System.out.println("2번 NO");
                Scanner sc2 = new Scanner(System.in);
                int nu=sc2.nextInt();
                if(nu==2){
                    break;
                }
                else{
                    cnt++;
                }
            }
            else if(num==2){
                menus[c]="에이드";
                c++;
                System.out.println("1번 레몬에이드 6000");
                System.out.println("2번 딸기에이드 6200");
                System.out.println("3번 오렌지에이드 6500");
                System.out.println("4번 청포도에이드 6200");
                Scanner sc1 = new Scanner(System.in);
                int n = sc1.nextInt();
                if(n==1){
                    System.out.println("레몬에이드를 선택하셨습니다.");
                    result+=6000;
                }
                else if(n==2){
                    System.out.println("딸기에이드를 선택하셨습니다.");
                    result+=6200;
                }
                else if(n==3){
                    System.out.println("오렌지에이드를 선택하셨습니다.");
                    result+=6500;
                }
                else{
                    System.out.println("청포도에이드를 선택하셨습니다.");
                    result+=6200;
                }
                System.out.println("다른 메뉴를 선택하시겠습니까?");
                System.out.println("1번 YES");
                System.out.println("2번 NO");
                Scanner sc2 = new Scanner(System.in);
                int nu = sc2.nextInt();
                if(nu==2){
                    break;
                }
                else{
                    cnt++;
                }
            }
            else if(num==3){
                menus[c]="케이크";
                c++;
                System.out.println("1번 당근케이크 7600");
                System.out.println("2번 초콜릿케이크 7200");
                System.out.println("3번 치즈케이크 7500");
                System.out.println("4번 생크림케이크 7400");
                Scanner sc1 = new Scanner(System.in);
                int n = sc1.nextInt();
                if(n==1){
                    System.out.println("치즈케이크를 선택하셨습니다.");
                    result+=7600;
                }
                else if(n==2){
                    System.out.println("초콜릿케이크를 선택하셨습니다.");
                    result+=7200;
                }
                else if(n==3){
                    System.out.println("치즈케이크를 선택하셨습니다.");
                    result+=7500;
                }
                else{
                    System.out.println("생크림케이크를 선택하셨습니다.");
                    result+=7400;
                }
                System.out.println("다른 메뉴를 선택하시겠습니까?");
                System.out.println("1번 YES");
                System.out.println("2번 NO");
                Scanner sc2 = new Scanner(System.in);
                int nu = sc2.nextInt();
                if(nu==2){
                    break;
                }
                else{
                    cnt++;
                }
            }
            else if(num==4){
                menus[c]="빵";
                c++;
                System.out.println("1번 단팥빵 2800");
                System.out.println("2번 모카번 3000");
                System.out.println("3번 슈크림빵 2900");
                System.out.println("4번 크루와상 3400");
                Scanner sc1 = new Scanner(System.in);
                int n = sc1.nextInt();
                if(n==1){
                    System.out.println("단팥빵을 선택하셨습니다.");
                    result+=2800;
                }
                else if(n==2){
                    System.out.println("모카번을 선택하셨습니다.");
                    result+=3000;
                }
                else if(n==3){
                    System.out.println("슈크림빵을 선택하셨습니다.");
                    result+=2900;
                }
                else{
                    System.out.println("크루와상을 선택하셨습니다.");
                    result+=3400;
                }
                System.out.println("다른 메뉴를 선택하시겠습니까?");
                System.out.println("1번 YES");
                System.out.println("2번 NO");
                Scanner sc2 = new Scanner(System.in);
                int nu = sc2.nextInt();
                if(nu==2){
                    break;
                }
                else{
                    cnt++;
                }
            }
        }
        System.out.printf("당신이 지불하실 금액은 %d 원입니다.",result);
        System.out.println();
        System.out.print("당신이 선택한 메뉴는 ");
        for(int i=0;i< cnt;i++){
            System.out.printf("%s ",menus[i]);
        }
        System.out.printf("입니다.");
    }
}
