//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        int number = 5;
//        System.out.println(number);
//
//        String sparta = "Hello Sparta";
//        System.out.println(sparta);
//
//        final int  finalNumber = 1; // final과 같이 앞에 오는 접근 제어자, 변수의 자료형
//        // java 캐멀케이스 final(소문자)Number(첫 단어 대문자)
//        System.out.println(finalNumber);
//        sparta = "Good Bye Sparta";
//        System.out.println(sparta); // 변수는 재할당 가능
//    }
//}



//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        // 정수형
//        short s = 1; // short 2bite로 표현 가능한 정수형 자료형
//        System.out.println(s);
//
//        int a = 3; // 4bite
//        System.out.println(a);
//
//        long b = 4; // 8bite
//        System.out.println(b);
//
//        // 실수형
//        float f = 5.5F;  // float은 뒤에 F
//        System.out.println(f);
//
//        double d = 5.5;
//        System.out.println(d);
//
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Long.MIN_VALUE);
//        System.out.println(Float.MIN_VALUE);
//        System.out.println(Double.MIN_VALUE);
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        char c = 'A'; // char는 단어 하나 가능 ABC 불가능
//        System.out.println(c);
//
//        boolean fact = true;
//        fact = false;
//        System.out.println(fact);
//
//        byte data = 'd';  // byte로 모든 데이터 표현 가능 아스키코드?로 출력
//        System.out.println(data);
//    }
//}



// 참조 자료형
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        String sparta = "Hello sparta";
//        System.out.println(sparta);
//
//        int[] intArray = new int[] {1, 2, 3, 4, 5};  // 배열 출력, 배열: 동일한 자료형의 데이터를 연속된 공간에 저장하기 위한 자료구조
//        System.out.println(Arrays.toString(intArray));
//    }
//}



// 배열
//import java.util.Arrays;
//
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        int[] intEmptyArray = new int[5];
//        intEmptyArray[0] = 1;
//        intEmptyArray[1] = 2;
//
//        System.out.println(Arrays.toString(intEmptyArray));
//
//        int[] intArray = new int [] {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(intArray));
//
//        String[] stringsEmptyArray = new String[5];
//        System.out.println(Arrays.toString(stringsEmptyArray));
//
//        String[] season = {"봄", "여름", "가을", "겨울"};
//        System.out.println(Arrays.toString(season));
//
//        System.out.println(season[season.length - 1]);
//
//    }
//}



// Quiz

//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        char c = 'S';
//        int num = 10;
//        System.out.println(c);
//        System.out.println(num);
//        System.out.println(c + num); // 아스키코드로 숫자로만 출력
//        System.out.println(c + "" + num);
//        System.out.println(c + "\n" + num);
//    }
//}




//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        int[] scores = new int[] {10, 20, 30};
//        System.out.println(scores[scores.length - 1]);
//    }
//}




// 연산자 파이썬이랑 동일
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        int num1 = 10;
//        int num2 = 5;
//
//        boolean a = true;
//        boolean b = false;
//
//        System.out.println(num1 > num2);
//
//        System.out.println(a && true);
//        System.out.println(false || b);
//        System.out.println(!b);
//    }
//}



// 연산자 Quiz

//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        int num1 = 10;
//        int num2 = 3;
//        boolean bool1 = true;
//        boolean bool2 = false;
//        num1 += num1;
//        num2 *= num1;
//        System.out.println(num1);
//        System.out.println(num2);
//        System.out.println(bool1 && bool2);
//    }
//}


// 조건문
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        int check = 100;
//        int num1 = 51;
//
//        if( num1 > 100) {
//            System.out.println("100보다 큰 수 입니다.");
//        } else if (num1 > 50) {
//            System.out.println("50보다 큰 수 입니다. 100보다 작거나 같습니다.");
//        }
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//
//        // switch
//        char score = 'A';
//        switch (score) {
//            case 'A':
//                System.out.println("A등급 축하합니다.");
//                break;
//            case 'B':
//                System.out.println("B등급");
//                break;
//            case 'C':
//                System.out.println("C등급");
//                break;
//            default:
//                System.out.println("C보다 아래 등급입니다.");
//
//        // 삼항 연산자
//
//        int a = 5;
//        String result = (a<10) ? "10보다 작습니다." : "10보다 큽니다";
//        System.out.println(result);
//        }
//    }
//}




// 조건문 Quiz
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int score = sc.nextInt();
//
//        if (score <= 100 && score > 90) {
//            System.out.println("A등급 입니다.");
//        } else if(score <= 90 && score > 80){
//            System.out.println("B등급 입니다.");
//        } else if(score <= 80 && score > 70){
//            System.out.println("C등급 입니다.");
//        } else {
//            System.out.println("F등급 입니다.");
//        }
//    }
//}







// 반복문

//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//
//        int sum = 0;
//        for (int i = 0; i < 10; i++){
//            sum += (i + 1);
//        }
//        System.out.println(sum);
//    }
//}

// for - each문
//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//
//        for (String day:days) {
//            System.out.println(day);
//        }
//    }
//}


//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//
//        int i = 0;
//        int sum = 0;
//
//        while (i<10) {
//            sum += (i+1);
//            i++;
//            if(i == 5) {
//                break;
//            }
//        }
//        System.out.println(sum);
//    }
//}

//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//
//        int i = 0;
//        int sum = 0;
//
//        do {
//            sum += (i+1);
//            i++;
//        } while (i < 10);
//        System.out.println(sum);
//    }
//}


// 반복문 Quiz

//public class Main {
//    public static void main(String[] args) {
//        // write your code here
//        int sum = 0;
//        for(int i=0; i<100; i++) {
//            sum += (i+1);
//        } System.out.println(sum);
//    }
//}


//public class Main {
//    public static void main(String[] args){
//        // write your code here
//        for (int i = 5; i >= 0; i--) {
//            System.out.println("카운트다운: " +i);
//        }
//    }
//}

public class Main {
    public static void main(String[] args){
        // write your code here
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i <30; i++) {
            int value = i +1;
            if (value % 2 == 0) {
                sumEven += value;
            } else {
                sumOdd += value;
            }
        }

        System.out.println("odd: " +sumOdd);
        System.out.println("even: " +sumEven);
    }
}