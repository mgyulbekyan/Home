package arrayutil1;


//Տպեք մասիվի բոլոր էլեմենտները,
//        Տպեք մասիվի ամենամեծ թիվը,
//        Տպեք մասիվի ամենափոքրը թիվը,
//        Տպեք մասիվի բոլոր զույգ էլեմենտները,
//        Տպեք մասիվի բոլոր կենտ էլեմենտները։
//        Տպեք զույգերի քանակը։
//        Տպեք կենտերի քանակը
//        Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
//        Տպեք մասիվի էլեմենտների գումարը։
//        Խոսքը այն մասին չէ որ վիզուալ տեսնենք որ ամենամեծը 66ն է, ու դա 7րդ ինդեքսի տակ է,
// ուղղակի տպենք 7րդ ինդեքսը, այլ որ այնպես կազմակերպենք, որ ցանկացած ինդեքսի տակ էլ լինի ամենամեծ թիվը, ինքը տպե։
//


public class ArrayUtil {

    //Տպեք մասիվի բոլոր էլեմենտները,
    public static void main(String[] args) {
        int[] array = {11, 54, 24, 25, 89, 2365};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] +" / ");

        }

//        Տպեք մասիվի ամենամեծ թիվը,
        int max = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);


//       Տպեք մասիվի ամենափոքրը թիվը,
        int res = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < res) {
                res = array[i];
            }
        }
        System.out.println(res);


        // Տպեք մասիվի բոլոր զույգ էլեմենտները

        int arr = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                arr = array[i];
            }

        }
        System.out.println(arr);

        //  Տպեք մասիվի բոլոր կենտ էլեմենտները։

        int odd = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 != 0) {
                odd = array[i];
            }
        }
        System.out.println("kent tver" + odd);

//      Տպեք մասիվի էլեմենտների գումարը։


        int Count = 0;
        for (int i = 0; i < array.length; i++) {
            Count += array[i];

        }
        System.out.println(Count);


//        Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)

        int avCount = array[0];

        for (int i = 0; i < array.length; i++) {

            avCount += array[i];
        }
        System.out.println(avCount / array.length);
    }

}




